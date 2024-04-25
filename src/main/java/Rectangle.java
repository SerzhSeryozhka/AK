public class Rectangle {
    double longer, width;


    public Rectangle(double longer, double width) {
        this.longer = longer;
        this.width = width;
    }

    public double getPerimetr() {
        return (longer + width) * 2;
    }

    public double getPloshyad() {
        return longer * width;
    }

    public String vyvod() {
        return "Периметр " + getPerimetr() + ", и площадь " + getPloshyad() + " прямоугольника.";
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longer=" + longer +
                ", width=" + width + vyvod() +
                '}';
    }
}
