package Week3;


@FunctionalInterface
interface Cab{
//    void bookCab(String source, String destination);
    double bookCab(String source, String destination);
}

//  normal
//  class UberX implements Cab{
//
//    @Override
//    public void bookCab() {
//        System.out.println("booked");
//    }
//}

public class LambdaApp {

    int instanceVar  = 10;
    static int sVar = 100;
    //        Lambda
    Cab cab = (source,destination)->{
        int local = 1000;
        System.out.println("uber from " + source + " " + destination );
        System.out.println(instanceVar+ sVar + local);
        return 850.12;
    };

    public static void main(String[] args) {
//        Cab cab = new UberX();


//        anonymous
//        Cab cab = new Cab() {
//            @Override
//            public void bookCab() {
//                System.out.println("booked");
//            }
//        };

//
//       double price =  cab.bookCab("malkapur", "hyderabad");
//        System.out.println(price);
    }
}

