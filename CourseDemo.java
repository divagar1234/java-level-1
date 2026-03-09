import java.awt.*;

class CourseDemo
{
    public static void main(String arg[])
    {
        Frame f = new Frame();
        f.setTitle("Course");
        f.setSize(500, 300);
        
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        Label l1 = new Label("Select your course:");
        f.add(l1);

        Checkbox cb1 = new Checkbox("BCA");
        f.add(cb1);

        Checkbox cb2 = new Checkbox("B.Sc AI & DS");
        f.add(cb2);

        Checkbox cb3 = new Checkbox("B.Sc AI & ML");
        f.add(cb3);

        f.setVisible(true);
    }
}