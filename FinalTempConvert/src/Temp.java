

	import java.awt.EventQueue;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;
	import javax.swing.JButton;


	public class Temp {

		private JFrame frame;
		private JTextField textField;
		private JTextField textField_1;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Temp window = new Temp();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public Temp() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 450, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel lblCelsius = new JLabel("Celsius :");
			lblCelsius.setBounds(33, 33, 66, 14);
			frame.getContentPane().add(lblCelsius);
			
			textField = new JTextField();
			textField.setBounds(126, 31, 66, 17);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			textField.addActionListener(new TempListener());
			
			JButton btnConvert = new JButton("Convert");
			btnConvert.setBounds(68, 81, 89, 23);
			frame.getContentPane().add(btnConvert);
			
			JLabel lblFahrenheit = new JLabel("Fahrenheit :");
			lblFahrenheit.setBounds(33, 142, 66, 14);
			frame.getContentPane().add(lblFahrenheit);
			
			textField_1 = new JTextField();
			textField_1.setBounds(126, 139, 66, 17);
			frame.getContentPane().add(textField_1);
			textField_1.setColumns(10);
			
			
			 
		}
		
		class TempListener implements ActionListener{	
			 public void actionPerformed(ActionEvent event) {
				int fahrenheitTemp, celsiusTemp;
				
				String text = textField.getText();
				
				fahrenheitTemp=Integer.parseInt(text);
				
				celsiusTemp=(fahrenheitTemp-32)*5/9;
				
				textField_1.setText(Integer.toString(celsiusTemp));
				
			} 
			}	 
	}


