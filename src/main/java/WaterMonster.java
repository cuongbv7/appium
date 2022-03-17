public class WaterMonster extends Monster{

    @Override
    public void attack()
    {
        System.out.println("attack from water monster");
    }

    public void overloadAtack (String name)
    {
        System.out.println(name);

    }
}
