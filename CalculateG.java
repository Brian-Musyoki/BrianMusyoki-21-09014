class CalculateG { 

    public static double multiplication(double x, double y) 
    {return x * y ;}

    public static double square(double x) 
    {return x * x ;}

    public static double summation(double x, double y)
    {return x + y ;}

    public static void outline(String message, double result )
    {
        System.out.println(message + result);
    }

public static void main(String[] args) {

    double gravity = -9.81;
    //Earth's gravity in m/s^2
    double fallingTime = 30;

    double intialVelocity =0.0;
    double finalVelocity ;

    double intialPosition = 0.0;
    double finalPosition ;
    
    //Add the formulas for position and velocity
    // x(t) =0.5 * at^2 + vit + xi
    finalPosition = 0.5 * gravity * fallingTime * fallingTime + intialVelocity * fallingTime + intialPosition;

    // v(t) = at + vi
    finalVelocity = gravity * fallingTime + intialVelocity;

    //Output the results
    System.out.println("The object's position after" + fallingTime + "second is" + finalPosition + "m.");
    System.out.println("The object's velocity after" + fallingTime + "second is" + finalVelocity + "m.");

}
}