public class CmdLineAreaOfTriangle {
    // Java codes always starts with a class
    public static  void main(String[] args) {
        // After the class you create a method most of the inputs are void cause you won't return anything
        double height, base, area;
        // Delcaration of variables
        base = Double.parseDouble(args[0]);
        /*Apparently when you do the code like this you input numbers as strings
         * then you change it into a double or an integer
         * According to lecturer this only works on Cmd Lines
         * We'll try it later for now we'll work on some other things
         */
        height = Double.parseDouble(args[1]);
        // Same goes for this line
        area = 0.5 * height * base;
        System.out.println("The area of the triangle = " + area);
    } // that's the way we print in the town
    
}
