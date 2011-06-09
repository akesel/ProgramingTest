import java.io.*;

public class Greeting {
	/**
	 * this amazing piece of programming gold has been done by
	 * Artur Kesel
	 *  Testing GIT plug in.
	 */
	public static void main(String[] args) throws IOException {
		
		try
		{
			//initiate buffer reader
			BufferedReader dataIn = new BufferedReader(new InputStreamReader( System.in));
			//Ask to enter the name
			System.out.print("How many people would you like me to greet?: ");
			
			//Convert string to a number
			int elementNum = Integer.parseInt(dataIn.readLine());
			//Create an array with specified number of elements
			String [] anArray = new String[elementNum];
			//Save every name in the array in order it was entered
			for (int i=0; i<anArray.length; i++){
				System.out.println("Enter Name "+ (i+1) +": ");
				String name = dataIn.readLine();
				anArray[i]= new String(name);
			}
			//Sort array to be in alphabetical order
			//Arrays.sort(anArray);
			//Put array into string
			String prNames="";
			for(int i=0; i<anArray.length; i++){
				if(i==anArray.length-2)
					prNames = prNames+anArray[i]+", ";
				else if (i==anArray.length-1)
					prNames = "and "+anArray[i];
			}
			//Print the string
			System.out.println("Hello "+prNames+"!");
			
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
