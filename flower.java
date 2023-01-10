import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

//<applet code="flower" width="800" height="800">
//</applet>

public class flower extends Applet implements ActionListener {
    Thread t = null;
    int i = 0;
    int r = 0;
    Button Enlarge;
    Button Small;
    Button Reset;
    public void paint(Graphics g){
        int rr = r/4;
        g.setColor(Color.GREEN);
        g.fillRect(320+rr, 250+r, 10, 100);

        g.setColor(Color.PINK);
        g.fillOval(304, 190, 40+r, 40+r);
        g.fillOval(330, 210, 40+r, 40+r);
        g.fillOval(320, 240, 40+r, 40+r);
        g.fillOval(290, 240, 40+r, 40+r);
        g.fillOval(280, 210, 40+r, 40+r);

        g.setColor(Color.YELLOW);
        g.fillOval(312+rr, 225+rr, 25+rr, 25+rr);
    }

    public void init(){
        Enlarge = new Button("ENLARGE");
        Small = new Button("SMALL");
        Reset = new Button("Reset");
        add(Enlarge);
        add(Small);
        add(Reset);

        Enlarge.addActionListener(this);
        Small.addActionListener(this);     
        Reset.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Enlarge) {
            r+= 20;
            
        } else if (e.getSource() == Small) {
            r-= 10;
            
        }else if(e.getSource() == Reset){
	r=0;
	}
        repaint();
}}