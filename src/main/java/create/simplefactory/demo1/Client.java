package create.simplefactory.demo1;

import create.simplefactory.demo1.factory.ShapeFactory;
import create.simplefactory.demo1.product.Shape;

public class Client {

    public static void main(String[] args) {
        test("Square");
        test("Triangle");
        test("Circle");
    }

    private static void test(String type){
        Shape shape = ShapeFactory.createShape(type);
        shape.draw();
        shape.erase();
        System.out.println("----------------");
    }
}
