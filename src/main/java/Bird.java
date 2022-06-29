public class Bird implements CanFly{
    public void speak()
    {
        System.out.println("I am a Bird");
    }

    @Override
    public int fly() {
        return 0;
    }
}
