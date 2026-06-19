// Program 18: Static variable counting total number of objects created
class Count
{
    static int c = 0;    // shared by all objects

    Count()
    {
        c++;
    }
}

class Demo
{
    public static void main(String args[])
    {
        Count o1 = new Count();
        Count o2 = new Count();
        Count o3 = new Count();

        System.out.println("Objects Created : " + Count.c);
    }
}
