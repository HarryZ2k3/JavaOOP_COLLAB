enum Direction
        {
            NORTH,
            SOUTH,
            EAST,
            WEST,
            NW,
            NE,
            SE,
            SW
        }
public class Main_L2
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
            //moving the right way
                for (int i=p1.getY();i>0;i--)
                {
                    p1.setY(p1.getY()-1);//MOVING NORTHWARD
                }
            //turning around
                for (int i=p1.getY();i<NewBox.getHeight();i++)
                {
                        p1.setY(p1.getY()+1);
                }
                break;
            case SOUTH:
            //moving the right way
                for (int i=p1.getY();i<NewBox.getHeight();i++)
                {
                        p1.setY(p1.getY()+1);//MOVING SOUTHWARD
                }
            //turning around 
                for (int i=p1.getY();i>0;i--)
                {
                    p1.setY(p1.getY()-1);
                }
                break;
            case EAST:
            //moving the right way
                for (int i=p1.getX();i<NewBox.getWidth();i++)
                {
                    p1.setX(p1.getX()+1);//MOVING EASTWARD
                }
            //turning around
                for (int i=p1.getX();i>0;i--)
                {
                    p1.setX(p1.getX()-1);
                }
                break;
            case WEST:
            //moving the right way
                for (int i=p1.getX();i>0;i--)
                {
                    p1.setX(p1.getX()-1);//MOVING WESTWARD
                }
            //turning around
                for (int i=p1.getX();i<NewBox.getWidth();i++)
                {
                    p1.setX(p1.getX()+1);
                }
                break;
            case NW:
            //Moving the right way
                while (p1.getX()>=0 && p1.getY()>=0)
                {
                    if (p1.getX()==0)
                        break;
                    if (p1.getY()==0)
                        break;
                    else
                    {
                        p1.setY(p1.getY()-1);
                        p1.setX(p1.getX()-1);
                    }
                }
            //Turning around
                break;
            case NE:
            //moving the right way
                while (p1.getX()<=NewBox.getHeight() && p1.getY()>=0)
                {
                    if (p1.getX()==NewBox.getHeight())
                        break;
                    if (p1.getY()==0)
                        break;
                    else
                    {
                        p1.setY(p1.getY()-1);
                        p1.setX(p1.getX()+1);
                    }
                }
            //turning around
                break;
            case SE:
            //going the right way
                while (p1.getX()<=NewBox.getWidth() && p1.getY()<=NewBox.getHeight())
                {
                    if (p1.getX()==NewBox.getWidth())
                        break;
                    if (p1.getY()==NewBox.getHeight())
                        break;
                    else
                    {
                        p1.setY(p1.getY()+1);
                        p1.setX(p1.getX()+1);
                    }
                }
                //turning around
                break;
            case SW:
            //going the right way 
                while (p1.getX()>=0 && p1.getY()<=NewBox.getHeight())
                {
                    if (p1.getX()==0)
                        break;
                    if (p1.getY()==NewBox.getHeight())
                        break;
                    else
                    {
                        p1.setY(p1.getY()+1);
                        p1.setX(p1.getX()-1);
                    }
                }
            //turning around
                break;
        }
        
    }
}