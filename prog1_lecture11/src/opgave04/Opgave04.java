package opgave04;

public class Opgave04 {
    public static void main(String[] args) {

        double width = 10;
        double heigth = 10;

        Rectangle rectangle = new Rectangle(width, heigth);

        // Methods for area and perimeter
        double rectangle_area = getArea(rectangle);
        double rectangle_perimeter = getPerimeter(rectangle);

        // Print results
        System.out.println(rectangle_area);
        System.out.println(rectangle_perimeter);

    }

    // method for calculating area
    public static double getArea(Rectangle rectangle){
        return (rectangle.width * rectangle.height);
    }

    // method for calculating perimeter
    public static double getPerimeter(Rectangle rectangle){
        return 2 * (rectangle.width + rectangle.height);
    }

}
