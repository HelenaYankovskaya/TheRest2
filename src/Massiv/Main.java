package Massiv;

public class Main {


    public static void main (String[] args) {
        int marks[]=new int[20];               //  Задание №4.14 страница 35
        for (int i=0; i<20; i++) {
            marks[i] = (int) (Math.random() * 10 + 1);
        System.out.print(marks[i]+" ");}
        System.out.println(" ");
        int maxMark = marks[0];
        for (int i=0; i< marks.length; i++) {
            if (maxMark<marks[i])
                maxMark=marks[i];}
            System.out.println("Maximum = "+ maxMark);
            int maxMark1=maxMark;
        for (int i=0; i< marks.length; i++) {
            if (marks[i] == maxMark1)
                System.out.println("Maximum = " + i + " chiclo"); }

          int massiv[] = {5,4,10,8,9,2,6,1,3};    // Задание 4.15 страница 35
             int max=0;
             int min=1;
             int sum=0;
             for (int i1=0; i1<massiv.length; i1++) {
                 if (max<massiv[i1])
                     max=massiv[i1];}

        System.out.println("max = "+max);
                 for (int i2=0; i2<massiv.length-1; i2++){
                     if (min>massiv[i2]);
                     min=massiv[i2];}

        System.out.println("min = "+min);
                     for (int i1=0; i1<massiv.length; i1++){
                         if (massiv[i1]==max){do  {i1++; sum = sum+massiv[i1];}
                         while (massiv[i1]!=min);
                         sum= sum-min;
                   }
                     }
                         System.out.println("Summa = " + sum);

        int arr[]=new int[10];               //  Задание №4.16 страница 35
        for (int n=0; n<10; n++) {
            arr[n] = (int) (Math.random() * 30 + 1);
            System.out.print(arr[n]+" ");}
        System.out.println(" ");
        for (int n=arr.length-1; n>=0; n--) {
            System.out.print(arr[n]+" ");}

        System.out.println(" ");

            int[][] array = {{1,1,1,1,1},{0,1,1,1,0},{0,0,1,0,0},{0,1,1,1,0},{1,1,1,1,1}};    //  Задание №4.17 страница 36
        for (int i1=0; i1<array.length;i1++) {
            for (int j1 = 0; j1 < array[i1].length; j1++) {
            System.out.print(array[i1][j1] + " ");
        }
            System.out.println();
        }




    }

}
