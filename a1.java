// // import java.io.*;
// // import java.math.*;
// // import java.util.*;
// // class a1 {
// //     static void towerOfHanoi(int n, char from_rod,
// //                              char to_rod, char aux_rod)
// //     {
// //         if (n == 0) {
// //             return;
// //         }
// //         towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
// //         System.out.println("Move disk " + n + " from rod "
// //                            + from_rod + " to rod "
// //                            + to_rod);
// //         towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
// //     }
  
// //     // Driver code
// //     public static void main(String args[])
// //     {
// //         int N = 3;
  
// //         // A, B and C are names of rods
// //         towerOfHanoi(N, 'A', 'C', 'B');
// //     }
// // }
  public class a1 {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Unsorted array:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Sorted array:");
        printArray(array);
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

// import java.util.Arrays;

// public class a1 {

//     public static void main(String[] args) {
//         int[][] graph = {
//             {0, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE},
//             {5, 0, 10, Integer.MAX_VALUE},
//             {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 3},
//             {Integer.MAX_VALUE, 2, Integer.MAX_VALUE, 0}
//         };

//         int[][] shortestDistances = floydWarshall(graph);

//         System.out.println("Shortest distances between all pairs of vertices:");
//         for (int i = 0; i < shortestDistances.length; i++) {
//             for (int j = 0; j < shortestDistances[i].length; j++) {
//                 if (shortestDistances[i][j] == Integer.MAX_VALUE) {
//                     System.out.print("INF ");
//                 } else {
//                     System.out.print(shortestDistances[i][j] + " ");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static int[][] floydWarshall(int[][] graph) {
//         int V = graph.length;
//         int[][] shortestDistances = new int[V][V];

//         // Initialize the shortestDistances matrix with the input graph
//         for (int i = 0; i < V; i++) {
//             for (int j = 0; j < V; j++) {
//                 shortestDistances[i][j] = graph[i][j];
//             }
//         }

//         // Apply Floyd-Warshall algorithm
//         for (int k = 0; k < V; k++) {
//             for (int i = 0; i < V; i++) {
//                 for (int j = 0; j < V; j++) {
//                     if (shortestDistances[i][k] != Integer.MAX_VALUE
//                             && shortestDistances[k][j] != Integer.MAX_VALUE
//                             && shortestDistances[i][k] + shortestDistances[k][j] < shortestDistances[i][j]) {
//                         shortestDistances[i][j] = shortestDistances[i][k] + shortestDistances[k][j];
//                     }
//                 }
//             }
//         }

//         return shortestDistances;
//     }
// }
