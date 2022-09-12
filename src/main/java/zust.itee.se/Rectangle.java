package zust.itee.se;



public class Rectangle implements IShape {
    Point ptTopLeft=new Point();
    Point ptTopRight=new Point();
    int width;
    int height;
//    2) 为Rectangle类提供构造函数Rectangle()、Rectangle(Point topleft,int hight,int width)
//    3) 为Rectangle类添加并实现double perimeter()、double area()、void draw()方法
    Rectangle()
    {
        this.ptTopLeft=null;
        this.ptTopRight=null;
        this.width=0;
        this.height=0;
    }
    Rectangle(Point topleft,int hight,int width)
    {
        this.ptTopRight=topleft;
        this.height=hight;
        this.width=width;
    }

    public double perimeter() {
        double ans=this.height+this.width;
        ans=ans*2;
        return ans;
    }


    public double area()
    {
        double ans=this.height*this.width;
        return ans;
    }
    public void draw()
    {
//        System.out.println("1");
//        System.out.println(this.ptTopRight.x+" "+this.ptTopRight.y);

        for(int i=this.ptTopLeft.x;i<=this.ptTopRight.x;i++)
        {
            for(int j=this.ptTopLeft.y;j<=this.ptTopRight.y;j++)
            {
               System.out.print("#");
            }
            System.out.println();
        }

    }
}
