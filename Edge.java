public class Edge
{
  private int adjacentVertex;//it will point to the target or the edge that is next.

  public Edge(int w)
  {
	  adjacentVertex = w; // constructor
  }

  public void setAdjacentVertex(int i)
  {
	  adjacentVertex = i;
  }

  public int getAdjacentVertex()
  {
	  return adjacentVertex;
  }
}
