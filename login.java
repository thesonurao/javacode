import java.awt.*;
import java.applet.*;
import java.util.*;
import java.awt.event.*;
/*<applet code=login page width=900 height=900>
</applet>*/
public class loginpage extends Applet implements ActionListener
{
	TextField t1,t2;
	Label l1,l2;
	Button b1,b2;
	GridBagLayout gb;
	GridBagConstraints gbc;	
	public void init()
	{
		gb=new GridBagLayout();
		setLayout(gb);
		gbc=new GridBagConstraints();
		t1=new TextField(10);
		t2=new TextField(15);
		l1=new Label("Id");
		l2=new Label("Password");
		
		b1=new Button("Reset");
		b2=new Button("Login");
		gbc.fill=GridBagConstraints.BOTH;
		addComponent(l1,0,0,1,2);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		addComponent(t1,0,3,1,4);
		gbc.fill=GridBagConstraints.BOTH;
		addComponent(l2,1,0,1,2);
		gbc.fill=GridBagConstraints.HORIZONTAL;
		addComponent(t2,1,3,1,4);
		gbc.fill=GridBagConstraints.BOTH;
		addComponent(b1,6,0,1,2);
		gbc.fill=GridBagConstraints.BOTH;
		addComponent(b2,6,3,1,2);
		public void addComponent(Component c,int row,int col,int nrow,int ncol)
	{
		gbc.gridx=col;
		gbc.gridy=row;
		gbc.gridwidth=ncol;
		gbc.gridheight=nrow;
		gb.setConstraints(c,gbc);
		add(c);
	}
	
		
	}
	}
	
	
	
