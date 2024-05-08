public class BubbleSort {

    // Function to print an array
    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // An optimized version of Bubble Sort
  public  void bubbleSort(int arr[])
    {   int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (isSwapped == false)
                break;
        }
    }
    // main method
        public static void main(String[] args) {
        int arr[] = new int[] {5,1,2,9,10};
        BubbleSort bs = new BubbleSort();
        bs.printArray(arr);
        bs.bubbleSort(arr);
        bs.printArray(arr);
        }
    }