import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Iterator;

public class Maze
{
  private Vertex[] rooms;
  private String result ="";
  
  public Maze(String filename) throws FileNotFoundException
  {	
	 Scanner in = new Scanner(new File(filename));
	 
	 rooms = new Vertex[in.nextInt()];//Read the first integer in the file and assign it to the size of Vertex.
	 
	 //This for loop will through every array index and add the parameter of name, x, and y.
	 for(int j = 0; j <rooms.length; j ++){
		 
		 String name = in.next();	 
		 int x =in.nextInt();
		 int y = in.nextInt();
		 
		 rooms[j] = new Vertex(name, x, y);	 
	  }
	 //read edges.
	 int abc=in.nextInt();//this will point to the start edge 
	 while(abc!=-1){//this condition in the while loop is to check for the end of the file which is a -1.
		 
		 Edge x=new Edge(in.nextInt());//This line will get the target for the edge
	     rooms[abc].addEdge(x);
	     abc=in.nextInt();// this will go to the next int in the file and assign it to the next start edge.
	 }
	 in.close();
   
  }
  
  //Will give us access to the array.
  public Vertex[] getRooms()
  {
	  return rooms;
  }

  public String toString()
  {
	 //This for loop will go through all the rooms[] and used the getters for the name, x, and y.
	 for(int i = 0; i<rooms.length; i++)
		 result += rooms[i].getName() +" "+rooms[i].getXCoord() +" "+rooms[i].getYCoord()+ "\n";
	 result +="\n";
	 for(int i = 0; i<rooms.length; i++)//This for loop will go through the rooms to add an iterator to each index.
	 {
		 	Iterator<Edge>my = rooms[i].getEdgesIterator();//access to the double linked list.
		 	
		 	while(my.hasNext())//This while loop is to print all the edges from staring to the target.
		 	{
		 		Edge x = my.next();
		 		result +=i+" "+ x.getAdjacentVertex()+"\n";	// integer i is call from the previous for loop as the start of the edge and x is the target.
			}
	 }
	 return result;
  }

}
