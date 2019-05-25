import java.awt.*;
import javax.swing.*;
public class jl2 extends JApplet
{
public void init()
{
Container c=getContentPane();
c.setLayout(new GridLayout(3,1));
ImageIcon ii1=new ImageIcon("1.gif");
JLabel jl1=new JLabel("duke left",ii1,JLabel.LEFT);
JLabel jl2=new JLabel("duke centre",ii1,JLabel.CENTER);
JLabel jl3=new JLabel("duke right",ii1,JLabel.RIGHT);
c.add(jl1);
c.add(jl2);
c.add(jl3);
}
}
/*
<applet code="jl2.class" width=200 height=100>
</applet>
*/
