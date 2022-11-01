
public class Main {
    public static void main(String[] args) {
        /*
    First level: 1. Linear Search
    1.Given an array arr[] of N elements, the challenge is to write a function to find a given element x in arr[] .
    Линейный поиск используется для поиска ключевого элемента среди нескольких элементов.
    Линейный поиск сегодня используется меньше, потому что он медленнее, чем бинарный поиск и хеширование.

    Алгоритм:
    Шаг 1: Обход массива
    Шаг 2: Сопоставьте ключевой элемент с элементом массива
    Шаг 3: Если ключевой элемент найден, верните позицию индекса элемента массива.
    Шаг 4: Если ключевой элемент не найден, верните -1

      */
        String[] arr = new String[]{"l","j","u","c","x","d"};
        String element = "x";
        boolean flag = false;


        for (int i = 0; i < arr.length; i++){
            if (arr[i]==element) {
                System.out.println("Element index = " + i);
                flag=true;
            }
        }
        if (!flag){
            System.out.println("-1");
        }



       /*
    2.Find the element that appears once in a sorted array
    Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.

    Простое решение состоит в обходе массива слева направо. Поскольку массив отсортирован, мы легко можем найти нужный элемент.

    Алгоритм:
    Шаг 1: Обход массива через один элемент
    Шаг 2: Если элемент отличается от первого то мы нашли не задублированный элемент
    Шаг 3: Вернем элемент или позицию в массиве
    Шаг 4: Если ключевой элемент не найден, верните -1 или что то еще :)
    …
    Шаг 5: Исправить ошибку ArrayIndexOutOfBoundsException
         */



    }
    
}