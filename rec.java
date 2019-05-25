import java.awt.*;
import java.applet.*;
public class rec extends Applet
{
public void paint(Graphics g)
{
g.setClip(100,100,200,200);
for(int i=10;i<300;i++)
for(int j=10;j<300;j++)
g.drawOval(i,j,25,25);
setBackground(colour.blue);
setForeground(colour.red);
}
}



}