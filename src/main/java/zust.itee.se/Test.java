package zust.itee.se;

public class Test {
    public static void main(String [] args){
        ShapeManager shapeManager=new ShapeManager();
        Rectangle rect=new Rectangle(new Point(10,10),100,200);
        Triangle tri=new Triangle(new Point(0,10),new Point(50,50),new Point(150,0));
        Circle cir=new Circle(new Point(100,100),100);
        shapeManager.addShape(rect);
        shapeManager.addShape(tri);
        shapeManager.addShape(cir);
        shapeManager.drawShapes();
        shapeManager.delShape(rect);
        System.out.println();
        shapeManager.drawShapes();
    }
}
