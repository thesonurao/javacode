import java.awt.*;
import java.io.*;
class frame extends Frame
{
Button b;//declare
Frame f=new Frame("This is My Button Frame");
f.setSize(250,150);
b=new button("Press Me");//creation
f.add(b);//makes a component
f.setLocation(150,150);
f.setVisible(true);
System.out.println("Return to DOS prompt and Press control+C to quit");
}
}




















