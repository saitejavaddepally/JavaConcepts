package Oops2;

import Oops.Inheritance.Shape;

public class PackageTest extends Shape {
    @Override
     protected void rotate(int x) {
        System.out.println(super.x);
        super.rotate(x);
    }
}
