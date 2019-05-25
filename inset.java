import java.applet.*;
import java.awt.*;
public class inset extends Applet
{
Button a1,a2,a3;
public void init()
{
setBackground(Color.cyan);
setLayout(new BorderLayout());
add(new Button("RMI"),BorderLayout.NORTH);
add(new Button("SERVELET"),BorderLayout.EAST);
add(new Button("JDBC"),BorderLayout.SOUTH);
add(new Button("BEANS"),BorderLayout.WEST);
add(new Button("AWT"),BorderLayout.CENTER);
}
public Insets getInsets()
{
return new Insets(20,30,20,30);
}
}
/*
<applet code ="inset.class"width=300 height=200>
</applet>
*/
