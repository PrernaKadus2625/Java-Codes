import java.util.*;

class ArrayDSA {

    public void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7, -3};

        ArrayDSA obj = new ArrayDSA();

        System.out.print("Original Array: ");
        obj.printArray(arr);

        System.out.println("Maximum: " + obj.findMax(arr));
        System.out.println("Minimum: " + obj.findMin(arr));
        System.out.println("Sum: " + obj.sumArray(arr));

        obj.reverse(arr);

        System.out.print("Reversed Array: ");
        obj.printArray(arr);

        int target = 9;
        System.out.println("Index of " + target + " = " + obj.linearSearch(arr, target));
    }
}
