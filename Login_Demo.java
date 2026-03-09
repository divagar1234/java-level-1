import java.awt.*;

class Login_Demo {
    public static void main(String args[]) {

        Frame f = new Frame();
        f.setTitle("Login page");
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());   // Important for proper layout
        f.setVisible(true);

        Label l1 = new Label("User Name");
        f.add(l1);

        TextField t1 = new TextField(20);
        f.add(t1);

        Label l2 = new Label("Password");
        f.add(l2);

        TextField t2 = new TextField(20);
        t2.setEchoChar('*');   // Hide password
        f.add(t2);

        Button b1 = new Button("Login");
        f.add(b1);

        Button b2 = new Button("Logout");
        f.add(b2);
    }
}
