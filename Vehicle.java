interface Vehicleone
{
int speed=90;
public void distance();
}
interface Vehicletwo
{
int distance=100;
public void speed();
}
class Vehicle implements Vehicleone,Vehicletwo
{
public void distance()
{
int distance=speed*100;
System.out.println("distance travelled is:"+distance);
}
public void speed()
{
int speed=distance/100;
}
}
class Test_MI
{
public static void main(string S[])
{
System.out.println("Vehicle");
Vehicle obj=new Vehicle();
obj.distance();
obj.speed();
}
}