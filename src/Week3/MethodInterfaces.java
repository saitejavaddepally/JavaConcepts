package Week3;



@FunctionalInterface
interface Calculator{
    void add(int num1, int num2);


}

class CalC{
    public static  void addSomething(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public void letsAdd(int num1, int num2){
        System.out.println(num1 + num2);
    }
}

interface Messenger{
    Message getMessage(String msg);
}

class Message{
    Message(String message){
        System.out.println("message" + message);
    }
}

public class MethodInterfaces {
    public static void main(String[] args) {
//        CalC.addSomething(10,20);

////        Referencing to a static method.
//        Calculator cRef = CalC::addSomething;
//        cRef.add(12,33);

//        Referencing to a non-static method.
//
//        CalC calC = new CalC();
//        Calculator calculator = calC::letsAdd;
//        calculator.add(23,33);

//        Reference to a constructor

        Messenger mRef = Message::new;
        mRef.getMessage("hello");
    }
}
