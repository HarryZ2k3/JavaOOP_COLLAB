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
    public void setHeight(int y) {
        y = height;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int x) {
        x = width;
    }
    
}
