//Huynh Phuong Dai _ ITITWE21039
class Triangle
{
    private int a;
    private int b;
    private int c;
    
    public Triangle(int a, int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void Verify()
    {
        boolean isTriangle = true;
        //Not triangle
        if ((a+b)<=c || (a+c)<=b || (b+c)<=a)
        {
            System.out.println("*ERROR: THIS IS NOT A TRIANGLE!");
            isTriangle = false;
        }
        if (isTriangle == true)
        {
            //Equilateral
            if (a==b && a==c)
            {
                System.out.println("This is a Equlateral triangle!");
            }
            //Isoceles
            if (a==b && a!=c || a==c && a!=b || b==c && b!=a)
            {
                System.out.println("This is an Isoceles triangle!");
            }
            //Scalene
            if (a!=b && a!=c && b!=c)
            {
                System.out.println("This is a Scalene triangle!");
            }   
        }
            
    }
    public int getA() {
        System.out.print("Side a:" + a + "\n");
        return a;
    }
    public int getB() {
        System.out.print("Side b:" + b + "\n");
        return b;
    }
    public int getC() {
        System.out.print("Side c:" + c + "\n");
        return c;
    }
}