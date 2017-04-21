import java.util.Iterator;

public class Vertex
{
  private String name;
  private int x;
  private int y;
  private DoublyLinkedList<Edge> edges;
  //constructors for double linked list 
  public Vertex(String n, int xCoord, int yCoord)
  {
	  name = n;
	  x = xCoord;
	  y =yCoord;
	  edges = new DoublyLinkedList<>();
	 
  }

  public void setName(String n)
  {
	  this.name = n;
  }

  public String getName()
  {
	  return name;
  }

  public void setXCoord(int xCoord)
  {
	  this.x = xCoord;
  }

  public int getXCoord()
  {
	  return x;
  }

  public void setYCoord(int yCoord)
  {
	  this.y = yCoord;
  }

  public int getYCoord()
  {
	  return y;
  }
  //add and edge to the end of the double linked list.
  public void addEdge(Edge e)
  {
	  edges.add(e);
  }
  //With the return edges.iterator we get access to the double linked list.
  public Iterator<Edge> getEdgesIterator()
  {
	  return edges.iterator();
  }
}