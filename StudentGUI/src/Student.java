import java.awt.*;


public class Student{
	
	Frame f = new Frame();
	Student(){
		super();
		
		f.setSize(500,500);
		f.setTitle("Student Info");
		f.setVisible(true);
		
	}
	void createLabel(){
		Label l1 = new Label();
		l1.setBounds(50, 50, 50, 25);
		l1.setText("Name :");
		f.add(l1);
		
		Label l2 = new Label();
		l2.setBounds(50, 100, 50, 25);
		l2.setText("USN :");
		f.add(l2);
	}	
		
	void createButton(){	
		Button b1 = new Button("Click");
		b1.setBounds(250, 250, 50, 30);
		f.add(b1);
	}	
	
	void createTextField(){
		TextField t1 = new TextField();
		String a = t1.getText();
		t1.setBounds(300, 50, 50, 25);
		t1.setVisible(true);
		f.add(t1);
		System.out.println(a);
		
		TextField t2 = new TextField();
		String b = t2.getText();
		t2.setBounds(300, 100, 50, 25);
		t2.setVisible(true);
		f.add(t2);
		System.out.println(b);
	}	
		
	
}
