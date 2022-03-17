public class Execute {

    public static void  Main (){

        Monster waterMonster = new WaterMonster();
        Monster airMonster = new AirMonster();
        Monster fireMonster = new FireMonster();
        waterMonster.attack();
        airMonster.attack();
        fireMonster.attack();
    }
}
