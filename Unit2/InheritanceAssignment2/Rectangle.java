package Unit2.InheritanceAssignment2;

public class Rectangle
{
	private int width;
	private int height;
	private XYCoord origin;
	
	//constructor #1
	public Rectangle()
	{
		this.width = 1;
		this.height = 1;
		origin = new XYCoord(0,0);
	}
	
	//constructor #2
	public Rectangle(int width, int height, int x, int y)
	{
		if(width > 0)	this.width = width;
		if(height > 0)	this.height = height;
		origin = new XYCoord(x,y);
	}
	
	//constructor #3
	public Rectangle(int width, int height)
	{
		if(width > 0)	this.width = width;
		if(height > 0)	this.height = height;
		origin = new XYCoord(0,0);
	}
	
	//constructor #4
	public Rectangle(Rectangle other)
	{
		this.width = other.width;
		this.height = other.height;
		origin = new XYCoord(other.getX(), other.getY());
	}
	
	//accessor
	public int getWidth()
	{
		return width;
	}
	
	//accessor
	public int getHeight()
	{
		return height;
	}
	
	//accessor
	public XYCoord getOrigin()
	{
		return origin;
	}
	
	//accessor
	public int getX()
	{
		return origin.getX();
	}
	
	//accessor
	public int getY()
	{
		return origin.getY();
	}
	
	//mutator
	public void setWidth(int width)
	{
		if(width > 0) this.width = width;
	}
	
	//mutator
	public void setHeight(int height)
	{
		if(height > 0) this.height = height;
	}
	
	//mutator
	public void setX(int x)
	{
		origin.setX(x);
	}
	
	public void setY(int y)
	{
		origin.setY(y);
	}
	
	//mutator
	public void setOrigin(XYCoord c)
	{
		this.origin = c;
	}
	
	//mutator
	public void setOrigin(int x, int y)
	{
		this.origin = new XYCoord(x,y);
	}
	
	
	@Override
	public String toString()
	{
		return "[Rectangle] (" + getX() + "," + getY() + ")  w = " + this.width + "  h = " + this.height;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Rectangle))
			return false;
			
		Rectangle r = (Rectangle)other;
		
		if(this.width == r.width && this.height == r.height &&
				this.getX() == r.getX() && this.getY() == r.getY())
			return true;
		return false;
	}
	
	
	//MAIN used for testing only (remove when done testing)
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(10,5,1,1);
		System.out.println(r1);
	}
}
