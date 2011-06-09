import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Hello {

	/**
	 * this amazing piece of programming gold has been done by
	 * Artur Kesel
	 *  
	 */
	public static void main(String[] args) throws IOException {
		//Declare variables
		String name = "";
		String exit = "Goodbye";
		
		//while exit criteria not meat ask to enter the name
		while(!name.equals(exit)){
			//initiate buffer reader
			BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
			//Ask to enter the name
			System.out.print("Please Enter Your Name:");
				try{ 
					name = dataIn.readLine();
					}catch( IOException e ){
						System.out.println("Error!");
					}
			//if name equals to exit, do not print and exit.
			if (!name.equals(exit)){
					System.out.println("Hello " + name +"!");
			}
		}
	}
}