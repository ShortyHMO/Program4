
public class Circle1 extends Circle
{

public Circle1(double x, double y, double radius)
{
   super(x,y,radius);
}

public boolean intersects(Circle other)
{	// changed to be less than or equal to
   if (Math.abs(center.x - other.center.x) <= (radius +other.radius) && 
   Math.abs(center.y - other.center.y) <= (radius + other.radius))// true calculation needs both radius to
   return true;
   return false;
}

}

