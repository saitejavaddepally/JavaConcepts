package Week2;

public class OutputFormat {

//    method
//    return type
//    start with small letters

    void outputFormat(){
        System.out.println("I am in method");
    }

//    constructor
//    no return type
//    starts with capital letter

//    parameterized constructor
    OutputFormat(int a, int b){
        System.out.println("Hello I am in Constructor");
        System.out.println(a + b);
    }


//   default Constructor

    OutputFormat(){
        System.out.println("I am in default constructor");
    }



    public static void main(String[] args) {

//        new OutputFormat()  ---> object
        OutputFormat referenceVariable = new OutputFormat();

//        similar
        referenceVariable.outputFormat();
        new OutputFormat(1, 43).outputFormat();

//        it prints address
        System.out.println(referenceVariable);

    }
}
