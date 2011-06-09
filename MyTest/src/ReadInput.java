import javax.swing.JOptionPane;

public class ReadInput {
	public static void main( String[] args ){
		String name="";
		do {
			String input=JOptionPane.showInputDialog("Please enter your name");	
			String msg = "Hello " + input + "!";
			JOptionPane.showMessageDialog(null, msg);
			input=name;
		}while (name != "Goodbye");
	}
}