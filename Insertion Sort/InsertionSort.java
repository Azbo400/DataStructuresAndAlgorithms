public class InsertionSort {
  public void Swap(int[] arr) {
    // start array at 1 because there is nothing to compare 0 
    for(int j = 1; j < arr.length; j++){
      int key = arr[j];
      int i = j - 1; 
      // move elements that are greater than key one position ahead of their current position
      while (i >= 0 && arr[i] > key) {
        // move index back to swap element
        arr[i + 1] = arr[i];
        i = i - 1;
      }
      // once completed move index forward to keep moving through arary and continue looping through
      arr[i + 1] = key;
    }

  }

  public void PrintArray(int[] arr) {
    int n = arr.length; 
    for(int i = 0; i < n; i++) {
      System.out.println(arr[i] + " ");
    }

    System.out.println();
  }

  public static void main(String args[]) {
    int[] arr = {3, 2, 1, 4, 6, 5};
    InsertionSort a = new InsertionSort();
    a.Swap(arr);
    a.PrintArray(arr);
  }
}