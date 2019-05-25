import java.awt.*;
import javax.swing.*;
public class jl1 extends JApplet
{
public void init()
{
Container c=getContentPane();
JLabel jl=new JLabel("This is Swing Version of A Label");
c.add(jl);
}
}
/*
<applet code="jl1.class" width=200 height=100>
</applet>
*/
