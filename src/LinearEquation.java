public class LinearEquation {
    LinearEquationRunner obj = new LinearEquationRunner();

    /* instance variables */
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public LinearEquation() {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double distance() {
        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        distance = Math.round(distance * 100) / 100;
        return distance;
    }

    public double slope() {
        int change_in_y = y2 - y1;
        int change_in_x = x2 - x1;
        double getSlope = (change_in_y / change_in_x);
        getSlope = Math.round(getSlope * 100) / 100;
        return getSlope;
    }


    public double yIntercept() {
        double b = y1 - (slope() * x1);
        b = Math.round(b * 100) / 100;
        return b;
    }


    public String Equation() {
        return "y = " + slope() + "x + " + yIntercept();
    }


    public String coordinateForX(double xValue) {
        double y = (slope() * xValue) + yIntercept();
        return "(xValue, " + y + ")";
    }


    public String lineInfo() {
        System.out.println("The equation of the line between the two points is: " + Equation());
        System.out.println("The slope of this line is: " + slope());
        System.out.println("The y-intercept of the line is: " + yIntercept());
        System.out.println("The distance between the two points is: " + distance());
        System.out.println();
        return null;
    }

    }


