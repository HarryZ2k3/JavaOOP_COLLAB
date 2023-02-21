//Huynh Phuong Dai - ITITWE21039
public class Rectangle
{
    private double height;
    private double width;
    public Rectangle(double height, double width)
    {
        if (this.height <= 0)
        {
            System.out.println("*ERROR: Height attribute could not be lesser or equal to zero!");
            this.height = 1;
        }
        if (this.width <= 0)
        {    
            System.out.println("*ERROR: Width attribute could not be lesser or equal to zero!");
            this.width = 1;
        }
        else
        {
            this.height = height;
            this.width = width;
        }
    }
    public double getHeight()
    {
        return height;
    }
    public double getWidth()
    {
        return width;
    }
    public void VisualizeRectangle()
    {
        
    }
    
}