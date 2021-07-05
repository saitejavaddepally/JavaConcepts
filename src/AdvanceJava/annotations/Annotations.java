package AdvanceJava.annotations;

// short hand meta-data information
// to the java compiler
// compile-time and deployment-time processing
// Runtime processing


import java.lang.reflect.Method;

public class Annotations {

    @MyCustomAnnotation(value = 10)
    public void sayHello(){
        System.out.println("my custom annotation");
    }

    public static void main(String[] args) throws Exception {

        Annotations annotations = new Annotations();
        Method methodVal = annotations.getClass().getMethod("sayHello");

        MyCustomAnnotation annotation = methodVal.getAnnotation(MyCustomAnnotation.class);
        System.out.println("value is : " + annotation.value());
    }
}
