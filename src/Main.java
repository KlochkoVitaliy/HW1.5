public class Main {
    public static void main(String[] args) {

        //Задача 1

    int[]arr = new int [3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double []arr1 = {1.57, 7.654, 9.986};

        int []arr2={5,6,7};

        //Задача 2
        int outArr=arr[0];
        int outArrOne=arr[1];
        int outArrTwo=arr[2];

        System.out.print(outArr+", "+outArrOne+", "+outArrTwo);

        double outArr1=arr1[0];
        double outArr1One =arr1[1];
        double outArr1Two =arr1[2];

        System.out.println("  ");
        System.out.print(outArr1+", "+outArr1One+", "+outArr1Two);

        int outArr2 =arr2 [0];
        int outArr2One = arr2 [1];
        int outArr2Two =arr2 [2];

        System.out.println("  ");
        System.out.print(outArr2+", "+outArr2One+", "+outArr2Two);


        //Задание 3

        System.out.println("  ");
        System.out.print(outArrTwo+" , "+outArrOne+" , "+outArr);

        System.out.println("  ");
        System.out.print(outArr1Two+" , "+outArr1One+" , "+outArr1);

        System.out.println("  ");
        System.out.print(outArr2Two+" , "+ outArr2One+" , "+outArr2);


        //Задача 4
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i]%2!=0) {
                arr[i] = arr[i] + 1;
                System.out.println(" ");
                System.out.print(arr[i]);
            }

        }



    }
}