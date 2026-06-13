// Program 6: Multiple objects, System.gc(), finalize() message on destruction
class Student
{
    Student()
    {
        System.out.println("Object Created");
    }

    @SuppressWarnings("deprecation")
    protected void finalize()
    {
        System.out.println("Object Destroyed");
    }
}

class Demo
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student();

        s1 = null;
        s2 = null;

        System.out.println("Garbage Collection Requested");
        System.gc();
    }
}
