#! /bin/bash

SOURCE="${BASH_SOURCE[0]}"
echo $SOURCE
DIR="$( cd -P "$( dirname "$SOURCE" )" && pwd )"
#DIR= "$(dirname $SOURCE)"
echo $DIR

osascript -e 'tell app "Terminal"
    do script "cd '$DIR'  && java -jar selenium-server-standalone.jar -role hub -hubConfig hub.json"
end tell'


#osascript -e 'tell app "Terminal"
#    do script "cd '$DIR' && java -jar -Dwebdriver.gecko.driver=/usr/local/bin/geckodriver -Dwebdriver.chrome.driver=/usr/local/bin/chromedriver selenium-server-standalone.jar -role node -nodeConfig node_01.json"
#end tell'