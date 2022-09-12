package zust.itee.se;

import java.util.ArrayList;
import java.util.List;

public class ShapeManager {
//    1)	添加只读属性List<IShape> shapes;
//    2)	添加addShape(IShape shape)方法，实现将参数shape对象添加到shapes列表中
//    3)  添加delShape(IShape shape)方法，实现将参数shape对象从shapes列表中删除
//    4)	添加drawShapes()方法，实现shapes列表中所有shape元素的绘制

    List<IShape> shapes = new ArrayList<IShape>();
    void addShape(IShape shape)
    {
        this.shapes.add(shape);
    }
    void delShape(IShape shape)
    {
        this.shapes.remove(shape);
    }
    void drawShapes()
    {
        for(int i=0;i<this.shapes.size();i++)
        {
            this.shapes.get(i).draw();
        }
    }
}
