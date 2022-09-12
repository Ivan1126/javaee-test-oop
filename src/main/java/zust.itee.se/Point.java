package zust.itee.se;

public class Point {
    int x;
    int y;
    Point()
    {
        this.x=0;
        this.y=0;
    }
    Point(int a,int b)
    {
        this.x=a;
        this.y=b;
    }
    Point(Point r)
    {
        this.x=r.x;
        this.y=r.y;
    }


}
