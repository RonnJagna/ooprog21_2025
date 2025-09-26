public class DebugCircle {
    private int radius;
    private final double PI = 3.14159;

    // Default constructor
    public DebugCircle() {
        radius = 1;
    }

    // Constructor with radius
    public DebugCircle(int r) {
        radius = r;
    }

    public int getRad() {
        return radius;
    }

    public double getDiam() {
        return 2 * radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
