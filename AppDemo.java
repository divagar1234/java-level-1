import java.awt.*;

class AppDemo
{
    public static void main(String arg[])
    {
        Frame f = new Frame();
        f.setTitle("Application");
        f.setSize(500, 300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        Label l1 = new Label("Date of Birth");
        f.add(l1);

        // Month Choice
        Choice month = new Choice();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");
        f.add(month);

        
        Choice day = new Choice();
        for(int i = 1; i <= 31; i++)
        {
            day.add("" + i);
        }
        f.add(day);

        
        Choice year = new Choice();
        for(int i = 2000; i <= 2010; i++)
        {
            year.add("" + i);
        }
        f.add(year);

       
    }
}
