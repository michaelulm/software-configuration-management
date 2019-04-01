package at.fhj.iit;

public class Point3d extends Point2d{
	
	protected double z;

	public Point3d (double px, double py, double pz)
	{ 
		super(px, py);
		z = pz;
	}

	public Point3d () 
	{		
		this (0.0, 0.0, 0.0);        
	}

	public Point3d (Point3d pt) 
	{	
		x = pt.getX();
		y = pt.getY();
		z = pt.getZ();
	}

	public void setZ(double pz) {
		dprint ("setZ(): Changing value of Z from " + z + " to " + pz );
		z = pz;
	}

	public double getZ() {
		return z;
	}
	
	public void setXYZ(double px, double py, double pz) {
		setX(px);
		setY(py);
		setZ(pz);
	}
	
	public double distanceFrom (Point3d pt) {
		
		double dx = Math.abs(x - pt.x);
		double dy = Math.abs(y - pt.y);
		double dz = Math.abs(z - pt.getZ());

		dprint ("distanceFrom(): deltaX = " + dx);
		dprint ("distanceFrom(): deltaY = " + dy);
		dprint ("distanceFrom(): deltaZ = " + dz);

		return Math.sqrt((dx * dx) + (dy * dy) +(dz * dz));
	}

	public double distanceFromOrigin () {
		return distanceFrom (new Point3d ( ));
	}

	public String toString() {
		String str = "(" + x + ", " + y + ", " + z + ")";
		return str;
	}
}
