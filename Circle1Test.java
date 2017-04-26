
/***
* Example JUnit testing class for Circle1 (and Circle)
*
* - must have your classpath set to include the JUnit jarfiles
* - to run the test do:
*     java org.junit.runner.JUnitCore Circle1Test
* - note that the commented out main is another way to run tests
* - note that normally you would not have print statements in
*   a JUnit testing class; they are here just so you see what is
*   happening. You should not have them in your test cases.
***/

import org.junit.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;

// 
// Stuff you want to do before each test case
//
@Before
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
}

//
// Stuff you want to do after each test case
//
@After
public void teardown()
{
   System.out.println("\nTest finished.");
}

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   //System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   Assert.assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   //System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   Assert.assertTrue(p.x == 0 && p.y == 1);
}
@Test
public void crossing()
{
   //System.out.println("circles crossing each other");
   boolean i;
   Circle1 circleH = new Circle1(6,2,3);
   i = circle1.intersects(circleH);
   Assert.assertTrue(i==true);
}
@Test
public void apart()
{
   boolean i;
   //System.out.println("circles away from each other");
   Circle1 circle = new Circle1(9,2,4);
   i = circle1.intersects(circle);
   Assert.assertTrue(i==false);
}
@Test
public void close()
{
   //System.out.println("circles close and barely touching from each other");
   boolean i;
   Circle1 circle2 = new Circle1(7,2,3);
   i = circle1.intersects(circle2);
   Assert.assertTrue(i==true);
}
@Test
public void decrease()
{
	
   double r;
   //System.out.println("decrease.");
   r = circle1.scale(.5);
   Assert.assertTrue(r == 1.5);
}

@Test
public void MinR()
{

  try {
    Circle1 circle2 = new Circle1(1,2,-1); 
  } catch (Exception e) {
    Assert.assertTrue(1==1); 
  }
}

}
/*** NOT USED
public static void main(String args[])
{
   try {
      org.junit.runner.JUnitCore.runClasses(
               java.lang.Class.forName("Circle1Test"));
   } catch (Exception e) {
      System.out.println("Exception: " + e);
   }
}
***/

