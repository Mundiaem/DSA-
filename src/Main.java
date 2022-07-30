import BST.SearchItemX;
import challange.cdone.StringDictSeg;
import challange.cdone.SumOfValue;
import string.ReverseString;
import string.ReverseWord;
import challange.cdone.binaryTree.BinaryTree;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        int[] results = new SearchItemX().qualifiedStudents();
        // System.out.println(Arrays.toString(results));
//        int[] results= new BST.SearchItemX().qualifiedStudents();
//        System.out.println(Arrays.toString(results));
        ;
/*
                System.out.printf("%s > exist \n", r);
*/
        // MatrixArray.matrix();
        // MatrixArray.printMatrixInOrder();
        //MatrixArray.matrixSpiralRecursive();

        //MatrixRotate.rotatingMatrix();
        //MatrixRotate.rotateBy180Degrees();
        // MatrixRotate.rotate90Clockwise();
        //MatrixRotate.rotateMatrix90ClockwiseMethod2();
        //ArrayListClass.implementationOfArrayList();

        //ArrayListClass.implementationOfArrayList();
        //StringBufferStringBuilder.stringImplementation();
        //ReverseString.stringReverse();
        //VectorClass.vectorImplementation();
        // StackClass.stackImplementation();

        //ReverseWord.reverseWord();
        //ReverseString.stringReverse();
        //System.out.println("Sum of value exits: "+SumOfValue.hasNumberSunOfValues() )
        //BinaryTree.generateBinaryTree();;
        StringDictSeg. findSegStringDict()
        ;

    }


    private static void hashM() {
        // Map is an interface and HashMap is a class that implements Map
        // linkedHashMap> maintains the order of insertion
        // Hashmap does not maintain the order
        //
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> link = new LinkedHashMap<>();
        // list > author - numbers of books> int
        // o> {'author': 10}, {'author': 10}
        // Author > author_name , no_of_book
        // List<Author> listBooks= new ArrayList<>();
        // quickSort > quickSort(List<Author>listAuthor)
        // convert >| array
        // problem > loss the order of the data
        // > keys should be unique
        // Map<String, Integer> mapAuthor= new LinkedHashMap<>();
        // for(Author a: listAuthor){
        // mapAuthor.put(a.author_name, a.no_of_book);
        // }
        /*
        1. use the list
        2. use inbuilt methods to sort the list objects
        3. implements interfaces to sort the objects
          a. comparator

        * */


    }

    //problem > repeated words
    // assumption : no punctuation marks
    // words are separated spaces
    // input> String sentence = "An adventure makes people very happy
    // happy memories create great life";
    // output >String rep=> happy
    // String[] sentenceArray= sentence.split("");
    //First consideration (edge cases)>does not have repeated words or words are that have a tie
    private static String mostRepeatedWord(String sentence) {
        String rep = "";
        String[] sentenceArray = sentence.split(" ");
        // [An, adventure, makes, people, very ,happy ,
        //    // happy, memories ,create, great. life]
        // option 1 > step 1. loop through the array and Increment each word count {"<word>": count} > Map<String, Integer> mWordsCount= new HashMap<>();
        // step 2. sort the mWordsCount by values in desc> {"happy": 2}> top object;
        // step 3. get mWordsCount.get(1); >  Object firstKey = myHashMap.keySet().toArray()[0];
        // rep = mWordsCount.get(1).key() > myHashMap.keySet().toArray()[0];
        // Time Complexity
        //O(n)+O(nlogn) + O(n) > O(nlogn)
        //

        // option 2> step 1 create a set> Set<String> sWords= new HashSet<String>();
        // step 2 add all words to the set
        // create a map> Map<String, Integer> mWordsCount= new HashMap<>();
        // step 3 loop through the array> check if word is present in the set
        //*functions*
        //eliminate sorting
        //without using the map
        //edge cases

        return rep;
    }

    // receiving a string> test if this string can make a valid number> return if it can make a
    // valid number or not
    /*
     * 1. function will be return type boolean
     * 2. define what make a valid number
     * 3. a valid number can only contain digits from 0-9*/
    private static boolean isValidNumber(String numberString) {
        //check if
        if (numberString == null || numberString.isEmpty()) {
            return false;
        }
        // input > "qeirue3493nk!#(@nsd3"
        // output > false
        // step1 > the size string int n=s.length();
        // // create loop using n
        //inside the loop if(Character.isDigit(s.ChatAt(i))) > true > continue || false  > will terminate
        int i, n = numberString.length();
        for (i = 0; i < n; i++) {
            if (!Character.isDigit(numberString.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidNumber1(String numberString) {
        //check if
        if (numberString == null || numberString.isEmpty()) {
            return false;
        }
        // input > "3qeirue3493nk!#(@nsd3"
        // output > false
        // s.replace("[a-z]", "")
        // write a regular expressions to check if this string has digits only
        // valid number => Integer -> Integer.valueOf(s)
        // loop through the string get char
        // check if within the bound of 0-9 -> j= 0 -9 >loop
        // O(n) * O(10) > O(10n) > drop the constant
        //add the 0-9 in a set-> then check if char exist in a set
        Set<Character> valid=new HashSet<>();
        valid.add('0');
        valid.add('1');
        valid.add('2');
        valid.add('3');
        valid.add('4');
        valid.add('5');
        valid.add('6');
        valid.add('7');
        valid.add('8');
        valid.add('9');


        int i, n = numberString.length();
        for (i=0; i<n; i++ ){
            char c= numberString.charAt(i);
            if (valid.contains(c)){
                break;

            }else{
                return false;

            }


        }



        return true;
    }


}
