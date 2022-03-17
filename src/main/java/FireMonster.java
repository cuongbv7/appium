public class FireMonster extends Monster{

    @Override
    public void attack()
    {
        System.out.println("attack from Fire monster");
    }

    public void overloadAtack (Integer number)
    {
        System.out.println(number);
    }
}
