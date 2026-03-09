import java.awt.*;

class MyApps
{
    public static void main(String args[])
    {
        Frame f = new Frame();

        f.setTitle("MyApps");
        f.setSize(500, 500);
        f.setLayout(null);   

        
        Label l1 = new Label("Takshashila University");
        l1.setBounds(150, 50, 250, 30);
        f.add(l1);

        Label l2 = new Label("Ongur, Tindivanam, Villupuram");
        l2.setBounds(120, 80, 300, 30);
        f.add(l2);

        Label l3 = new Label("Application Form 2027");
        l3.setBounds(160, 110, 250, 30);
        f.add(l3);

        
        Label l4 = new Label("Application No:");
        l4.setBounds(50, 160, 120, 30);
        f.add(l4);

        TextField t1 = new TextField(20);
        t1.setBounds(200, 160, 200, 30);
        f.add(t1);

        
        Label l5 = new Label("Student Name:");
        l5.setBounds(50, 210, 120, 30);
        f.add(l5);

        TextField t2 = new TextField(20);
        t2.setBounds(200, 210, 200, 30);
        f.add(t2);

        
        Label l6 = new Label("Programming:");
        l6.setBounds(50, 260, 120, 30);
        f.add(l6);

        TextField t3 = new TextField(20);
        t3.setBounds(200, 260, 200, 30);
        f.add(t3);

        // Save Button
        Button b1 = new Button("Save");
        b1.setBounds(200, 320, 100, 40);
        f.add(b1);

        f.setVisible(true);
    }
}