package behavior.simplefactory.demo1;

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
