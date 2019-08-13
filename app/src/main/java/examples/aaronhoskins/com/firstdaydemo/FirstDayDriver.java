package examples.aaronhoskins.com.firstdaydemo;

import java.util.ArrayList;

public class FirstDayDriver {

    //psvm
//    public static void main(String[] args) {
//        //Primitives
//        int numberValue;
//        boolean booleanValue;
//        char characterValue;
//        long longValue;
//        short shortValue;
//        double doubleValues;
//        float floatValues;
//
//        //Object Types
//        Integer integer = null;
//        Boolean bool;
//        Character character;
//        Long longObject;
//        Short shortObject;
//        Double doubleObject;
//        Float floatObject;
//
//        //STRINGS ARE OBJECTS
//        String string;
//
//        //Conditionals
//        if(integer == null) {
//            //if null
//        } else if(integer == 1) {
//            //do this if integer is equal to 1
//        } else {
//            //otherwise do this
//        }
//
//        switch (integer) {
//            case 0:
//                //if integer equals 0 do this
//                break;
//            case 1:
//                //if integer equals 1 do this
//                break;
//                default:
//                    //for all cases not accounted for do this
//                    break;
//        }
//
//        for(int i = 0; i < 20 ; i++) {
//            //for each iteration where i is less than 20, execute
//            //this block of code
//        }
//
//        int whileControl = 0;
//        while(whileControl < 5) {
//            //while whileControl is less than 5, execute this
//            //block of code
//            whileControl++;
//        }
//
//
//        do{
//            whileControl--;
//            //do this code until while control until less than 5
//        } while(whileControl >= 5);
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        for(String s : arrayList) {
//            //for each string element in arrayList, execute this
//            //block of code
//        }
//
//    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("meat", 50, true, "husky", "large");
        Animal animal = new Animal("meat", 50, false);

        dog1.speak();
        animal.speak();

        SingletonClass singletonClass1 = SingletonClass.getInstance("producer1");
        SingletonClass singletonClass2 = SingletonClass.getInstance("producer2");

        System.out.println("Class1 producerName = " + singletonClass1.getProducerName());
        System.out.println("Class2 producerName = " + singletonClass2.getProducerName());

        singletonClass1.setValue("value1");

        System.out.println("Class1 value = " + singletonClass1.getValue());
        System.out.println("Class2 value = " + singletonClass2.getValue());

        singletonClass2.setValue("value2");
        System.out.println("Class1 value = " + singletonClass1.getValue());
        System.out.println("Class2 value = " + singletonClass2.getValue());

        Car car = new Car.Builder()
                    .make("BMW")
                    .model("528i")
                    .year("2008")
                    .engine("Inline 6")
                    .transmission("Auto 6 speed")
                    .build();

        System.out.println(car.getMake());

    }

}
