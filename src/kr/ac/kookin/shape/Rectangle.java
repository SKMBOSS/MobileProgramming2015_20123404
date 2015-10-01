package kr.ac.kookin.shape;

public class Rectangle extends Shape
{
	int h;
	int w;
	
	public Rectangle(Point center, int w, int h)
	{
		super(center);
		this.w=w;
		this.h=h;
	}
	
	public Rectangle getBounds()
	{
		return this;
	}
	
	public void draw(Graphics g)
	{
		g.draw(this);
	}
	
	public String toString(){
		return "Rectangle";
	}
	
	public int getHeight()
	{
		return h;
	}
	public int getWidth()
	{
		return w;
	}
}