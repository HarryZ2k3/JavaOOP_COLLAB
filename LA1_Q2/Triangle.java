class Triangle
{
    private double a;
    private double b;
    private double c;
    
    public Triangle(double side1, double side2,double side 3)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static void TriangleVerification()
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
                System.out.println("This is a Equlateral triangle!")
            }
            //Isoceles
            if (a=b && a!=c || a=c && a!=b || b=c && b!=a)
            {
                System.out.println("This is an Isoceles triangle!");
            }
            //Scalene
            if (a!=b && a!=c && b!=c)
            {
                System.out.prinln("This is a Scalene triangle!")
            }   
        }
            
    }
}