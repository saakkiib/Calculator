import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator implements ActionListener {
    JFrame frame = new JFrame();

    JLabel username = new JLabel();
    JLabel password = new JLabel();
    JLabel or = new JLabel();
    //eita hocche kono kichur opor er likha add korar jonno
    JTextField userField = new JTextField();
    JTextField passField = new JTextField();
    //faka display jekhane likhbo eita sheita
    JButton button1 = new JButton("log-in");
    JButton button2 = new JButton("register");


    //click korar kaj
    JLabel result = new JLabel();


    void calculator(){
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(new Color(111, 185, 183));
        frame.setSize(1710, 1112);
        frame.setLayout(null);
        frame.setVisible(true);
        //uporer shob frame er jonno just
        // ebar oije Jlabel,Jtextfiled,Jbutton er kaj shuru hobe
        frame.add(username);
        username.setBounds(150,140,100,50);
        username.setText("Username:");//user name er akta likha add kore fellam done yeeeee
        //ebar amra user name jekhane boshabo oitar display banabo
        frame.add(userField);
        userField.setBounds(250,150,300,35);//banano ses yeeee
        userField.getText();
        //ebar amra password akta lable banabo
        frame.add(password);
        password.setBounds(150,240,100,50);
        password.setText("Password:");//pasword er lable banano ses yeeeee
        //ebar password diyar jayga ba display banano lets do it
        frame.add(passField);
        passField.setBounds(250,250,300,35);//password boshanor jayga done yeeeee;
        passField.getText();
        //cholo button banai
        frame.add(button1);
        button1.setBounds(280,350,100,50);

        frame.add(or);
        or.setBounds(250,400,300,50);
        or.setText("if you are not register then please enter register");

        button2.setBounds(280,450,100,50);
        frame.add(button2);


        frame.add(result);
        result.setBounds(280, 290, 300, 50);

        button1.addActionListener(this);
        button2.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {//ei bokachodar kaj hocche oije amra je userfield,passfield er .getText
        if (e.getSource()==button1) {
            System.out.println("Name = " + userField.getText());
            System.out.println("Pass = " + passField.getText());

            if (userField.getText().equals("admin") && passField.getText().equals("1234")) {
                result.setText("ইয়েয়ে...ঠিক......");
            } else {
                result.setText("ধুর বোকাচোদা ঠিক করে দে");
            }
        }
    }
}
