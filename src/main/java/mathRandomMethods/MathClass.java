package mathRandomMethods;

public  class MathClass{
    public static int findMaxInteger(int a, int b, int c){
        if(a == b && a == c && b == c)
        {
            System.out.println("All numbers are equal");
            return a;
        }
        else if (a == b || a == c || b == c){
            System.out.println("There are equal numbers.");
            int maxInteger = Math.max(Math.max(a,b), c);
            return maxInteger;
        }
        else
        {
            int maxInteger = Math.max(Math.max(a,b), c);
            return maxInteger;

        }
    }

    public static double areaOfEquilateralTriangle(double a){
        return (Math.sqrt(a)/4) * Math.pow(a,2);
    }
}
