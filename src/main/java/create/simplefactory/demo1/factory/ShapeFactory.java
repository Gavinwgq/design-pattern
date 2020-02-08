package create.simplefactory.demo1.factory;

import create.simplefactory.demo1.product.Circle;
import create.simplefactory.demo1.product.Shape;
import create.simplefactory.demo1.product.Square;
import create.simplefactory.demo1.product.Triangle;

public class ShapeFactory {
    public static Shape createShape(String type){
        if("Square".equalsIgnoreCase(type)){
            return new Square();
        }
        if("Triangle".equalsIgnoreCase(type)){
            return new Triangle();
        }
        if("Circle".equalsIgnoreCase(type)){
            return new Circle();
        }
        throw new RuntimeException("UnSupportedShapeException");
    }
}
