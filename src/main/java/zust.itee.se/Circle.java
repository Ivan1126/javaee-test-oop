package zust.itee.se;

public  class Circle implements IShape {
    Point ptCenter;
    int radius;
    Circle(Point center,int r)
    {
        this.ptCenter=center;
        this.radius=r;
    }

    public void draw() {
        System.out.println("圆的坐标为： "+this.ptCenter.x+" "+this.ptCenter.y);
        System.out.println("半径为: "+this.radius);
    }

    public double area() {
        double ans=3.1415926*(this.radius*this.radius);
        return ans;
    }

    public double perimeter() {
        double ans=2*3.1415926*this.radius;
        return ans;
    }
}
