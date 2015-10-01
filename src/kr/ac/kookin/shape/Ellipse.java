package kr.ac.kookin.shape;

public class Ellipse extends Shape {
	int h;
	int w;

	public Ellipse(Point center, int w, int h) {
		super(center);
		this.w = w;
		this.h = h;
	}

	public void draw(Graphics g) 
	{
		g.draw(this);
	}

	public String toString() 
	{
		return "Ellipse";
	}

	public int getSemiMajorAxis() 
	{
		return 0;
	}

	public int getSemiMinorAxis()
	{ 
		return 0;
	}

}
