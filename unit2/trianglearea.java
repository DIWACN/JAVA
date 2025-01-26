package unit2;
public class trianglearea {
    public static void main(String[] args) {
        if (args.length != 2){
            System.out.println("TriangleArea <base> <height>q");
            return;
        }
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
        System.out.println("The area of the triangle is: " + area);

    }
}
    