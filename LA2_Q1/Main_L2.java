//ITITWE21039_HUYNH_PHUONG_DAI
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
        Box NewBox = new Box(10,12);
        Particle p1 = new Particle(5,4);
        
        //Check validity 
        if (p1.getX()>= NewBox.getHeight() && p1.getX()<0)
        {
            System.out.println("Error.particle outside of box!");
        }
        if (p1.getY()>= NewBox.getWidth() && p1.getY()<0)
        {
            System.out.println("Error.particle outside of box!");
        }
        Particle p2 = new Particle(7,8);
        if (p2.getX()>= NewBox.getHeight() && p2.getX()<0)
        {
            System.out.println("Error.particle outside of box!");
        }
        if (p2.getY()>= NewBox.getWidth() && p2.getY()<0)
        {
            System.out.println("Error.particle outside of box!");
        }
        int movement_counter = 1;
        while (movement_counter <=100)
        {
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
                    break;
               
            }       
                ////////////////////////////////////////////////////////
                Direction d2 = Direction.NORTH;
                switch(d2)
                {
                    case NORTH:
                    //moving the right way
                        for (int i=p2.getY();i>0;i--)
                        {
                            p2.setY(p2.getY()-1);//MOVING NORTHWARD
                        }
                    //turning around
                        for (int i=p2.getY();i<NewBox.getHeight();i++)
                        {
                                p2.setY(p2.getY()+1);
                        }
                        break;
                    case SOUTH:
                    //moving the right way
                        for (int i=p2.getY();i<NewBox.getHeight();i++)
                        {
                                p2.setY(p2.getY()+1);//MOVING SOUTHWARD
                        }
                    //turning around 
                        for (int i=p2.getY();i>0;i--)
                        {
                            p2.setY(p2.getY()-1);
                        }
                        break;
                    case EAST:
                    //moving the right way
                        for (int i=p2.getX();i<NewBox.getWidth();i++)
                        {
                            p2.setX(p2.getX()+1);//MOVING EASTWARD
                        }
                    //turning around
                        for (int i=p2.getX();i>0;i--)
                        {
                            p2.setX(p2.getX()-1);
                        }
                        break;
                    case WEST:
                    //moving the right way
                        for (int i=p2.getX();i>0;i--)
                        {
                            p2.setX(p2.getX()-1);//MOVING WESTWARD
                        }
                    //turning around
                        for (int i=p2.getX();i<NewBox.getWidth();i++)
                        {
                            p2.setX(p2.getX()+1);
                        }
                        break;
                    case NW:
                    //Moving the right way
                        while (p2.getX()>=0 && p2.getY()>=0)
                        {
                            if (p2.getX()==0)
                                break;
                            if (p2.getY()==0)
                                break;
                            else
                            {
                                p2.setY(p1.getY()-1);
                                p2.setX(p1.getX()-1);
                            }
                        }
                    //Turning around
                        while (p2.getX()<=NewBox.getWidth() && p2.getY()<=NewBox.getHeight())
                        {
                            if (p2.getX()==NewBox.getWidth())
                                break;
                            if (p2.getY()==NewBox.getHeight())
                                break;
                            else
                            {
                                p2.setY(p2.getY()+1);
                                p2.setX(p2.getX()+1);
                            }
                        }
                        break;
                    case NE:
                    //moving the right way
                        while (p2.getX()<=NewBox.getHeight() && p2.getY()>=0)
                        {
                            if (p2.getX()==NewBox.getHeight())
                                break;
                            if (p2.getY()==0)
                                break;
                            else
                            {
                                p2.setY(p2.getY()-1);
                                p2.setX(p2.getX()+1);
                            }
                        }
                    //turning around
                        while (p2.getX()>=0 && p2.getY()<=NewBox.getHeight())
                        {
                            if (p2.getX()==0)
                                break;
                            if (p2.getY()==NewBox.getHeight())
                                break;
                            else
                            {
                                p2.setY(p2.getY()+1);
                                p2.setX(p2.getX()-1);
                            }
                        }
                        break;
                    case SE:
                    //going the right way
                        while (p2.getX()<=NewBox.getWidth() && p2.getY()<=NewBox.getHeight())
                        {
                            if (p2.getX()==NewBox.getWidth())
                                break;
                            if (p2.getY()==NewBox.getHeight())
                                break;
                            else
                            {
                                p2.setY(p2.getY()+1);
                                p2.setX(p2.getX()+1);
                            }
                        }
                        //turning around
                        while (p2.getX()>=0 && p2.getY()>=0)
                        {
                            if (p2.getX()==0)
                                break;
                            if (p2.getY()==0)
                                break;
                            else
                            {
                                p2.setY(p2.getY()-1);
                                p2.setX(p2.getX()-1);
                            }
                        }
                        break;
                    case SW:
                    //going the right way 
                        while (p2.getX()>=0 && p2.getY()<=NewBox.getHeight())
                        {
                            if (p2.getX()==0)
                                break;
                            if (p2.getY()==NewBox.getHeight())
                                break;
                            else
                            {
                                p2.setY(p2.getY()+1);
                                p2.setX(p2.getX()-1);
                            }
                        }
                    //turning around
                        while (p2.getX()<=NewBox.getHeight() && p2.getY()>=0)
                        {
                            if (p2.getX()==NewBox.getHeight())
                                break;
                            if (p2.getY()==0)
                                break;
                            else
                            {
                                p2.setY(p2.getY()-1);
                                p2.setX(p2.getX()+1);
                            }
                        }
                        break;
                
            }
            movement_counter++;
        }
    }
}