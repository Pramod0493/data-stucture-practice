import java.util.Scanner;

public class InsertingElementAtEndOfArray {
    public static void main(String[] args) {
        int array[]=new int[5];
        /*Taking Array elements from user*/
        System.out.println("Enter 5 elemets in Array");
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        /*Displaying Array Element Before Shifting*/
        System.out.println("Array Element before shifting");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        System.out.println("\nThe new Array is:");
        int[] newArray = insertX(array, 5);
        for(int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }

    private static int[] insertX(int[] array, int length) {
        int newArray[]=new int[length+1];
        for (int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        newArray[5]=50;

        return newArray;
    }
}
