interface p{
    void mai();
}
interface p1 extends p{
    void mai2();
}
class b implements p1{
    public void mai()
    {
        System.out.println("Hello");
    }
    public void mai2()
    {
        System.out.println("hi");
    }
}
class Test{
    public static void main(String[] args)
    {
        b obj =new b();
        obj.mai2();
    }
}