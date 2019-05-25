import java.awt.*;
import java.applet.*;
public class arc extends Applet
{
public void paint(Graphics g)
{
g.drawArc(10,50,80,80,0,90);
g.drawArc(150,50,80,80,0,180);
g.fillArc(10,175,70,90,0,275);
g.fillArc(150,175,80,80,0,135);
}
}
/*
<applet code="arc.class" width=300 height=300>
</applet>
*/
