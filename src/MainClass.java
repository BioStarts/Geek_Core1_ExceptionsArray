import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        String[][] arr = new String[][]{{"3","1","1","1"},{"1","c","1","3"}};
        parse(arr);

    }

    public static void parse(String[][] args) {
        System.out.println("--------------1---------------");
        int x = args.length;
        int arr1 = 0;
        int arr2 = 0;
        System.out.println(x + " - размерность масива");
        System.out.println(args[0].length + " - объем первого массива");
        System.out.println(args[1].length + " - объем второго массива");
        boolean y = true;
        int sum = 0;
        if (x != 2){
            y = false;
            throw new MyArraySizeException("Массив не двумерный!");
        }
        if (args[0].length != 4){
            y = false;
            throw new MyArraySizeException("Объем первого массива не равен 4!");
        }
        if (args[1].length != 4){
            y = false;
            throw new MyArraySizeException("Объем второго массива не равен 4!");
        }
        System.out.println("--------------2---------------");
        if (y != false){
            for (String[] a:args
                 ) {
                arr1++;
                for (String b:a
                     ) {
                    arr2++;
                    try {sum += Integer.parseInt(b);} catch (RuntimeException e){
                        throw new MyArrayDataException(arr1,arr2);
                        //throw new MyArrayDataException(Arrays.asList(args).indexOf(b));  //Пожалуйста расскажите возможно ли было решить 2е задание таким способом ???
                    }
                    /*finally {
                        System.out.println("Сумма: " + sum);
                    }*/
                }
            }
            System.out.println("Сумма: " + sum);
        }

    }


}
