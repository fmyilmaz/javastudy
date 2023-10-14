public class main {

    public static void main(String[] args) throws Exception {

        String x = "water";
        String y = "Kool-Aid";
        String temp = null;

        // x = y; // x now has the value of y
        // y = x; // y now has the value of x

        temp = x; // temp now has the value of x
        x = y; // x now has the value of y
        y = temp; // y now has the value of temp

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
    
}
