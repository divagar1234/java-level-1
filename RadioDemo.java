import java.awt.*;

class RadioDemo
{
    public static void main(String args[])
    {
        Frame f = new Frame();
        f.setTitle("Radio Button");
        f.setSize(500, 300);
        
        FlowLayout f1 = new FlowLayout();
        f.setLayout(f1);

        Label l1 = new Label("Gender:");
        f.add(l1);

        CheckboxGroup cg = new CheckboxGroup();

        Checkbox c1 = new Checkbox("Male", cg, true);
        Checkbox c2 = new Checkbox("Female", cg, false);
        Checkbox c3 = new Checkbox("Other", cg, false);

        f.add(c1);
        f.add(c2);
        f.add(c3);

        f.setVisible(true);
    }
}