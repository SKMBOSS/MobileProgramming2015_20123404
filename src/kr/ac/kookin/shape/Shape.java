package kr.ac.kookin.shape;

public abstract class Shape 
{
	protected Point center;
	public Shape(Point center)
	{
		this.center=center;
	}
	public void draw(Graphics g){}
	
	public Point getCenter()
	{
		return center;
	}
	public Rectangle getBounds()
	{
		return null;
	}
}
