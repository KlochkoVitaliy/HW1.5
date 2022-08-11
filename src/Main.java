public class Main {
    public static void main(String[] args) {

        //Задача 1

        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arr1 = {1.57, 7.654, 9.986};

        int[] arr2 = {5, 6, 7};

        //Задача 2
        int outArr = arr[0];
        int outArrOne = arr[1];
        int outArrTwo = arr[2];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);

        }

        double outArr1 = arr1[0];
        double outArr1One = arr1[1];
        double outArr1Two = arr1[2];

        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
               if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr1[i]);
        }
            int outArr2 = arr2[0];
            int outArr2One = arr2[1];
            int outArr2Two = arr2[2];

            System.out.println("  ");
        for (int i = 0; i < arr2.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr2[i]);
        }


            //Задание 3

            System.out.println();
        for (int i = arr.length -1; i >= 0 ; i--) {
             if (i <=1) {
                System.out.print(", ");
            }
                System.out.print(arr[i]);
        }

        System.out.println();
        for (int i = arr1.length -1; i >= 0 ; i--) {
            if (i <=1) {
                System.out.print(", ");
            }
            System.out.print(arr1[i]);
        }

        System.out.println();
        for (int i = arr2.length -1; i >= 0 ; i--) {
            if (i <=1) {
                System.out.print(", ");
            }
            System.out.print(arr2[i]);
        }


            //Задача 4
            for (int i = 0; i <= arr.length - 1; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i] = arr[i] + 1;
                    System.out.println(" ");
                    System.out.print(arr[i]);
                }

            }


        }

}