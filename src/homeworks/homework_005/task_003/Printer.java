package homeworks.homework_005.task_003;

// Необходимо разработать программу для сортировки массива целых чисел с использованием сортировки кучей (Heap Sort).
// Программа должна работать следующим образом:
// Принимать на вход массив целых чисел для сортировки. Если массив не предоставлен, программа использует
// массив по умолчанию.
// Сначала выводить исходный массив на экран.
// Затем применять сортировку кучей (Heap Sort) для сортировки элементов массива в порядке возрастания.
// Выводить отсортированный массив на экран.
// Ваше решение должно содержать два основных метода: buildTree, который строит сортирующее дерево на основе массива,
// и heapSort, который выполняет собственно сортировку кучей. Основная часть кода предоставлена вам.
// Программа должна быть способной сортировать массив, даже если он состоит из отрицательных чисел и имеет дубликаты.

// На входе:
// '5 8 12 3 6 9'

// На выходе:
// Initial array:
// [5, 8, 12, 3, 6, 9]
// Sorted array:
// [3, 5, 6, 8, 9, 12]
import java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Введите свое решение ниже
        for (int i = sortLength / 2 - 1; i >= 0; i--) {
            heapify(tree, sortLength, i);
        }
    }
    public static void heapify(int[] tree, int sortLength, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        if (leftChild < sortLength && tree[leftChild] > tree[largest]) {
            largest = leftChild;
        }

        if (rightChild < sortLength && tree[rightChild] > tree[largest]) {
            largest = rightChild;
        }

        if (largest != rootIndex) {
            swap(tree, rootIndex, largest);
            heapify(tree, sortLength, largest);
        }
    }

    public static void heapSort(int[] sortArray, int sortLength) {
        // Введите свое решение ниже
        for (int i = sortLength - 1; i >= 0; i--) {
            swap(sortArray, 0, i);
            heapify(sortArray, i, 0);
        }
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Не удаляйте и не меняйте метод Main!
public class Printer {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.heapSort(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
