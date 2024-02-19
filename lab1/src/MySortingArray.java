import java.util.ArrayList;

public class MySortingArray {

    public static void shakerSort(Integer[] arr) {

        int left = 0, right = arr.length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    swap(arr, i, i + 1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i - 1].compareTo(arr[i]) > 0) {
                    swap(arr, i - 1, i);
                }
            }
            left++;
        }
    }

    public static void shakerSort(ArrayList<Integer> arr) {

        int left = 0, right = arr.size() - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (arr.get(i).compareTo(arr.get(i + 1)) > 0) {
                    swap(arr, i, i + 1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr.get(i - 1).compareTo(arr.get(i)) > 0) {
                    swap(arr, i - 1, i);
                }
            }
            left++;
        }
    }

    public static void swap(Integer[] arr, int i, int j) {
        Integer tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        Integer tmp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, tmp);
    }

    static void merge(Integer[] arr, Integer leftIndex, Integer midIndex, Integer rightIndex) {
        Integer leftLength = midIndex - leftIndex + 1;
        Integer rightLength = rightIndex - midIndex;

        Integer[] leftArray = new Integer[leftLength];
        Integer[] rightArray = new Integer[rightLength];

        for (Integer i = 0; i < leftLength; ++i)
            leftArray[i] = arr[leftIndex + i];
        for (Integer j = 0; j < rightLength; ++j)
            rightArray[j] = arr[midIndex + 1 + j];

        Integer i = 0, j = 0;
        Integer k = leftIndex;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(Integer[] arr, Integer leftIndex, Integer rightIndex) {
        if (leftIndex < rightIndex) {
            // Find the middle index
            Integer midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            // Sort first and second subarrs
            mergeSort(arr, leftIndex, midIndex);
            mergeSort(arr, midIndex + 1, rightIndex);
            // Merge the sorted subarrs
            merge(arr, leftIndex, midIndex, rightIndex);
        }
    }

    public static void mergeSort(Integer[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    static void merge(ArrayList<Integer> arr, Integer leftIndex, Integer midIndex, Integer rightIndex) {
        Integer leftLength = midIndex - leftIndex + 1;
        Integer rightLength = rightIndex - midIndex;

        Integer[] leftArray = new Integer[leftLength];
        Integer[] rightArray = new Integer[rightLength];

        for (Integer i = 0; i < leftLength; ++i)
            leftArray[i] = arr.get(leftIndex + i);
        for (Integer j = 0; j < rightLength; ++j)
            rightArray[j] = arr.get(midIndex + 1 + j);

        Integer i = 0, j = 0;
        Integer k = leftIndex;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                arr.set(k, leftArray[i]);
                i++;
            } else {
                arr.set(k, rightArray[j]);
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            arr.set(k, leftArray[i]);
            i++;
            k++;
        }
        while (j < rightLength) {
            arr.set(k, rightArray[j]);
            j++;
            k++;
        }
    }

    public static void mergeSort(ArrayList<Integer> arr, Integer leftIndex, Integer rightIndex) {
        if (leftIndex < rightIndex) {
            // Find the middle index
            Integer midIndex = leftIndex + (rightIndex - leftIndex) / 2;
            // Sort first and second subarrs
            mergeSort(arr, leftIndex, midIndex);
            mergeSort(arr, midIndex + 1, rightIndex);
            // Merge the sorted subarrs
            merge(arr, leftIndex, midIndex, rightIndex);
        }
    }

    public static void mergeSort(ArrayList<Integer> arr) {
        mergeSort(arr, 0, arr.size() - 1);
    }
}

