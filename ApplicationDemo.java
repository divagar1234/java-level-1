import java.awt.*;

class ApplicationDemo
{
    public static void main(String arg[])
    {
        Frame f = new Frame();
        f.setTitle("Application Form");
        f.setSize(500, 700);
        f.setLayout(new FlowLayout());
        f.setVisible(true);


        Label l1 = new Label("Enrollment Number");
        f.add(l1);
        TextField t1 = new TextField(30);
        f.add(t1);

        Label l2 = new Label("Student Name");
        f.add(l2);
        TextField t2 = new TextField(30);
        f.add(t2);

        Label l3 = new Label("Programme");
        f.add(l3);
        TextField t3 = new TextField(30);
        f.add(t3);

        Label l4 = new Label("Batch");
        f.add(l4);
        TextField t4 = new TextField(30);
        f.add(t4);

        Button b1 = new Button("Save");
        f.add(b1);

        Button b2 = new Button("Cancel");
        f.add(b2);

        
    }
}
