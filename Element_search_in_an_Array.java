import java.util.*;
public class ElementFinder {
    private int[] array;

    // Constructor to initialize the array
    public ElementFinder(int[] array) {
        this.array = array;
    }

    // Method to check if the element is present in the array
    public boolean isElementPresent(int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true; // Element found
            }
        }
        return false; // Element not found
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] myArray =new int[n];
        for(int i=0;i<n;i++)
        {
            myArray[i]=sc.nextInt();
        }
        ElementFinder finder = new ElementFinder(myArray);

        int elementToFind =sc.nextInt();
        boolean isPresent = finder.isElementPresent(elementToFind);

        if (isPresent) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}





