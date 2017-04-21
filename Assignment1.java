import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment1 {
	
		public static void main(String[]arg) throws FileNotFoundException{
		
		System.out.println("What's the name of the file?");
		Scanner in = new Scanner(System.in);
		String file = in.nextLine();
		
		Maze f = new Maze(file);// Create a new maze;
		System.out.println(f.toString());//print maze.
		
	}

}
