package at.fhj.iit;
class Point2d {
	protected double x;
	protected double y;
	private boolean debug;

	public Point2d (double px, double py)
	{ 
		x = px;
		y = py;

		debug = false;
	}

	public Point2d () 
	{		
		this (0.0, 0.0);        
	}

	public Point2d (Point2d pt) 
	{	
		x = pt.getX();
		y = pt.getY();
	}

	public void dprint (String s) {
		if (debug)
			System.out.println("Debug: " + s);
	}

	public void setDebug (boolean b) {
		debug = b;
	}

	public void setX(double px) {
		dprint ("setX(): Changing value of X from " + x + " to " + px );
		x = px;
	}

	public double getX() {
		return x;
	}

	public void setY(double py)  {
		dprint ("setY(): Changing value of Y from " + y + " to " + py );
		y = py;
	}

	public double getY() {
		return y;
	}

	public void setXY(double px, double py) {
		setX(px);
		setY(py);
	}

	public double distanceFrom (Point2d pt) {
		double dx = Math.abs(x - pt.x);
		double dy = Math.abs(y - pt.getY());

		dprint ("distanceFrom(): deltaX = " + dx);
		dprint ("distanceFrom(): deltaY = " + dy);

		return Math.sqrt((dx * dx) + (dy * dy));
	}

	public double distanceFromOrigin () {
		return distanceFrom (new Point2d ( ));
	}

	public String toString() {
		String str = "(" + x + ", " + y + ")";
		return str;
	}
}

