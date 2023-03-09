public class Box
{
    private int height;
    private int width;
    public Box()
    {
        height= 1;
        width = 1;
    }    
    public Box(int y, int x)
    {
        y = height;
        x = width;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    
}
