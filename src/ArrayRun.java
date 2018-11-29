public class ArrayRun {

    String[][] arr;
    public ArrayRun(String[][] arr) {
        this.arr = arr;
    }

    public static void parse(String[][] arr) {
        System.out.println("--------------1---------------");
        int x = arr.length;
        int arr1 = 0;
        int arr2 = 0;
        int arr11 = 0;
        int arr22 = 0;
        System.out.println(x + " - количество строк масива");
        System.out.println(arr[0].length + " - размер 1й строки");
        System.out.println(arr[1].length + " - размер 2й строки");
        System.out.println(arr[2].length + " - размер 3й строки");
        System.out.println(arr[3].length + " - размер 4й строки");
        boolean y = true;
        int sum = 0;
        if (x != 4){
            y = false;
            throw new MyArraySizeException("Массив содержит не 4 строки!");
        }
        if (arr[0].length != 4){
            y = false;
            throw new MyArraySizeException("размер 1й строки не равен 4!");
        }
        if (arr[1].length != 4){
            y = false;
            throw new MyArraySizeException("размер 2й строки не равен 4!");
        }
        if (arr[2].length != 4){
            y = false;
            throw new MyArraySizeException("размер 3й строки не равен 4!");
        }
        if (arr[3].length != 4){
            y = false;
            throw new MyArraySizeException("размер 4й строки не равен 4!");
        }
        System.out.println("--------------2---------------");
        if (y != false){
            for (String[] a:arr
            ) {
                arr1++;
                for (String b:a
                ) {
                    arr2++;
                    try {sum += Integer.parseInt(b);} catch (RuntimeException e){
                        arr11 = arr1;
                        arr22 = arr2;
                    }
                }
            }
            System.out.println("Сумма: " + sum);
        }
        if (arr11 != 0) {
            if (arr1>1){
                arr22 -= (arr11-1)*4;
            }
            throw new MyArrayDataException(arr11, arr22);
            //throw new MyArrayDataException(Arrays.asList(lol).indexOf(sumbol),Arrays.asList(lol).indexOf(sumbol));  //Пожалуйста расскажите возможно ли было решить 2е задание таким способом ???
        }

    }
}
