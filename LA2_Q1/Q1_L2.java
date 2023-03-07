enum Direction
        {
            NORTH,
            SOUTH,
            EAST,
            WEST
        }
public class Q1_L2
{
    public static void main(String[] args)
    {
        Box NewBox = new Box(10,8);
        Particle p1 = new Particle(5,4);
        if (p1.getX()>= NewBox.getHeight() && p1.getX()<0)
        {
            System.out.println("Error.particle outside of box!");
        }
        if (p1.getY()>= NewBox.getWidth() && p1.getY()<0)
        {
            System.out.println("Error.particle outside of box!");
        }
        Direction d1 = Direction.NORTH;
        switch(d1)
        {
            case NORTH:
                for (int i=p1.getY;i<=NewBox.getHeight();i++)
                {
                    p1.setY(p1.getY()+1);
                }
                for (int i=p1.getY;i>=0;i--)
                {
                    p1.setY(p1.getY()-1);
                }
                break;
            case SOUTH:

                break;
            case EAST:

                break;
            case WEST:

                break;
        }
        
    }
}