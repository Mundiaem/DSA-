package collectionframework.list;

import java.util.*;
import java.util.stream.Collectors;
/*
* Java List vs. Set
Both the List interface and the Set interface inherits the Collection interface.
*  However, there exists some difference between them.

Lists can include duplicate elements. However, sets cannot have duplicate elements.
Elements in lists are stored in some order. However,
* elements in sets are stored in groups like sets in mathematics.
* */
public class ArrayListClass {

    public static void implementationOfArrayList() {
        implementation();
        implementationLinkedList();
    }

    private static void implementation() {
        int max = 100;
        int min = 20;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            list.add(random_int);
        }
        System.out.println(" The list size is > " + list.size());
        System.out.println(" The list is > " + list.toString());
        System.out.println(" Search for 25 > " + list.contains(25));
        // sort the list
        List<Integer> sortedListStream = new ArrayList<>();
        sortedListStream = list.stream().sorted().collect(Collectors.toList());

        System.out.println("Sorting the list using stream method");
        System.out.println(sortedListStream.toString());

        System.out.println("Sorting the list  using comparator");
        List<Integer> sortListComparator = new ArrayList<>();
        sortListComparator = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortListComparator.toString());

        System.out.println(" Sorting the list using Collections");
        List<Integer> listCollectionsSort = new ArrayList<>();
        listCollectionsSort = list;
        Collections.sort(listCollectionsSort);
        System.out.println(listCollectionsSort.toString());

        System.out.println("Remove duplicate elements ");

        /*
         * remove the duplicate without affecting order LinkedHashSet
         * will guranteed the order and since it's set it will not allow us
         * to insert duplicate element
         * repeated element will be automatically filtered*/
        Set<Integer> primeWithoutDuplicates = new LinkedHashSet<>(listCollectionsSort);
        /*
         * now let's clear the arraylist so that we can
         * copy all elements from LinkedHashSet
         * */
        listCollectionsSort.clear();
        //copy elements but without any duplicates
        listCollectionsSort.addAll(primeWithoutDuplicates);
        System.out.println(listCollectionsSort.toString());

        /*
         * getting the list iterator from list Java
         * */
        Iterator<Integer> iterator = listCollectionsSort.listIterator();

        System.out.println("Looping through a list using Iterator");

        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }


    }
    private static void implementationLinkedList(){
        // Creating list using the LinkedList class
        List<Integer> numbers = new LinkedList<>();

        // Add elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("List: " + numbers);

        // Access element from the list
        int number = numbers.get(2);
        System.out.println("Accessed Element: " + number);

        // Using the indexOf() method
        int index = numbers.indexOf(2);
        System.out.println("Position of 3 is " + index);

        // Remove element from the list
        int removedNumber = numbers.remove(1);
        System.out.println("Removed Element: " + removedNumber);
    }

}
