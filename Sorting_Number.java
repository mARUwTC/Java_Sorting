import java.io.*;
class Sorting_Number {
    public static void main(String[] args) 
    throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(reader);

		System.out.println("Please enter 3 integers.\nThis program will sort them in assending order.\nEnter the 1st integer: ");
        String a = buf.readLine();
        int x = Integer.parseInt(a);
        System.out.println("Enter the 2nd integer: ");
        String b = buf.readLine();
        int y = Integer.parseInt(b);
        System.out.println("Enter the 3rd integer: ");
        String c = buf.readLine();
        int z = Integer.parseInt(c);

        if ((x > y) && (y > z))
            System.out.println("The smallest value is: " + z + "\nThe 2nd smallest value is: " + y + "\nThe largest value is: " + x);
        else if ((x < y) && (y < z))
            System.out.println("The smallest value is: " + x + "\nThe 2nd smallest value is: " + y + "\nThe largest value is: " + z);
        else if ((x < y) && (z < y) && (x < z))
            System.out.println("The smallest value is: " + x + "\nThe 2nd smallest value is: " + z + "\nThe largest value is: " + y);
        else if ((x < y) && (z < y) && (x > z))
            System.out.println("The smallest value is: " + z + "\nThe 2nd smallest value is: " + x + "\nThe largest value is: " + y);
        else if ((x > y) && (z > y) && (x > z))
            System.out.println("The smallest value is: " + y + "\nThe 2nd smallest value is: " + z + "\nThe largest value is: " + x);
        else if ((x > y) && (z > y) && (x < z))
            System.out.println("The smallest value is: " + y + "\nThe 2nd smallest value is: " + x + "\nThe largest value is: " +z);
    }
}
