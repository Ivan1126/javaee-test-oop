package zust.itee.se;

public class Triangle implements IShape {
//    1)	添加三个属性：Point ptA,Point ptB,Point ptC
//    2)	添加三个只读属性：double edgeA,double edgeB,double edgeC
//    3)	提供构造函数Triangle(Point ptA,Point ptB,Point ptC);
//    4)	实现IShape的三个接口方法double perimeter()、double area()、void draw()
      Point ptA;Point ptB;Point ptC;
      double edgeA;double edgeB;double edgeC;
      Triangle(Point ptA,Point ptB,Point ptC)
      {
            this.ptA=ptA;
            this.ptB=ptB;
            this.ptC=ptC;
      }

    public double perimeter() {
        double ans=edgeA+edgeB+edgeC;
        return ans;
    }

    public double area() {
        double p=perimeter()/2;
        double ans=Math.sqrt(p*(p-edgeA)*(p-edgeB)*(p-edgeC));
        return ans;
    }

    public void draw() {
        System.out.println("三点为： "+this.ptA.x+" "+this.ptA.y);
        System.out.println("三点为： "+this.ptB.x+" "+this.ptB.y);
        System.out.println("三点为： "+this.ptC.x+" "+this.ptC.y);
    }
}
