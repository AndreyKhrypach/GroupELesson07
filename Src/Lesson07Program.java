import java.util.Arrays;
import java.util.Random;

public class Lesson07Program {
    public static final double PI = 3.14;
    public double pi = 3.14;

    public static void main(String[] args) {

//        Integer a1 = 22;
//        int a = a1;
//        System.out.println(a);

//        Integer test1 = null;
//        int test2;
//        if (test1 != null) {
//            test2 = test1;
//        }else{
//            test2 = 0;
//        }
//        System.out.println(test2);

//        int a = 12;
//        Integer a1 = new Integer(a);

//        int a = 1;
//        Integer a1 = a;
//        byte b = 2;
//        Byte b1 = b;
//        short s = 25;
//        Short s1 = s;
//        long l = 12345L;
//        Long l1 = l;
//        float f = 3.2345f;
//        Float f1 = f;
//        double d = 32.2345;
//        Double d1 = d;
//        char c = 'A';
//        Character c1 = c;
//        boolean bool = true;
//        Boolean bool1 = bool;

//        int a = 5;
//        Integer a1 = a;
//        a = 10;
//        //a1 = 10;
//        System.out.println(a1);
//        System.out.println(a);

//        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();


//        Person person = new Person();
//        System.out.println(person.personInfo("Will", "Smith",
//                "New York", 2936729462846L));

//        String hello = "Hello world";
//        double value = 100;
//
//        String formatedString =
//                String.format("Java program with word =" +
//                        " %s is best program with value = %.2f",
//                        hello, value);
//        System.out.println(formatedString);

//        Lesson07Program program = new Lesson07Program();
//        int circleLength = 9;
//
//        double radius1 = circleLength / (2 * PI);
//        double radius2 = circleLength / (2 * program.pi);
//        System.out.println(radius1);
//        System.out.println(radius2);
//        System.out.println(program.calculateRadius(circleLength));

//        Random random = new Random();

//        int[] arr1 = new int[8];
//        int[] arr2 = new int[16];
//        int[] arr3 = initializeArray(4);
//        initializeArray(arr1);
//        initializeArray(arr2);

//
//        arr1 = initializeArray(arr1);
//        arr2 = initializeArray(arr2);

//        System.out.println(Arrays.toString(arr1));
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(Arrays.toString(arr3));
    }


    public static void initializeArray(int[] array) {
        Random random = new Random();
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt();
        }
    }

    public static int[] initializeArray(int lengthArray) {
        Random random = new Random();
        int[] array = new int[lengthArray];
        for (int index = 0; index < array.length; index++) {
            array[index] = random.nextInt();
        }
        return array;
    }

    public double calculateRadius(int lengthCircle) {
        double radius = lengthCircle / (2 * pi);
        return radius;
    }
}
