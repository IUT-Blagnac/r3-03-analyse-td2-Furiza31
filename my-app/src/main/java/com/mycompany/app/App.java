package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println(hello());
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int x = 2;
        int position = binarySearch(arr, 0, n - 1, x);
        if (position == -1) {
            System.out.println("Element not found !!!");
        }
        else {
            System.out.println("Element found at index: " + position);
        }
    }

    /**
     * Permet de récupérer la chaine de caractère "Hello World!"
     * @return String "Hello World!"
     */
    public static String hello() {
        return "Hello World!";
    }

    /**
     * Recherche l'index d'un int par dichotomie
     * @param arr le tableau de la recherche
     * @param lo le premier element ou commence la recherche
     * @param hi le dernier element termine la recherche
     * @param x le nombre à recherche
     * @return l'index du nombre recherché
     */
    public static int binarySearch(int arr[], int lo, int hi, int x) {
        if (hi >= lo && lo < arr.length - 1) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, lo, mid - 1, x);
            return binarySearch(arr, mid + 1, hi, x);
        }
        return -1;
    }

}
