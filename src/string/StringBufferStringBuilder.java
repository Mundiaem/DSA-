package string;

public class StringBufferStringBuilder {

    public static void stringImplementation() {
        implementation();
    }

    private static void implementation() {
        String s1 = "Geeks";

        // Calling above defined method
        concat1(s1);
        System.out.println("String: " + s1);
        StringBuilder s2 = new StringBuilder("Geeks");
        //Calling above define method
        concat2(s2);
        System.out.println("StringBuilder: " + s2);
        StringBuffer s3 = new StringBuffer("Geeks");
        concat3(s3);
        System.out.println("StringBuffer: " + s3);
        stringToStringBufferToStringBuilder();

    }

    //Method 1
    //Concatenates to String
    /*
     *The string passed from main() is not changed,
     * this is due to the fact that String is immutable.
     * Altering the value of string creates another object
     *  and s1 in concat1() stores reference of the new string.
     *  References s1 in main() and cocat1() refer to different strings.
     * */
    private static void concat1(String s1) {
        s1 = s1 + "forgeeks";
    }

    //Method 2
    // Concatenates to StringBuilder
    /*
     * n this method, we pass a string “Geeks” and perform
     *  “s2.append(“forgeeks”)” which changes the actual
     *  value of the string (in main) to “Geeksforgeeks”.
     * This is due to the simple fact that StringBuilder
     * is mutable and hence changes its value.
     * */
    private static void concat2(StringBuilder s2) {
        s2.append("forgeeks");

    }

    //Method 3
    //Concatenates to StringBuffer
    /*
    * StringBuilder is similar and can be compatible at all places
    *  to StringBuffer except for the key difference of thread safety.
    * StringBuffer is thread-safe while StringBuilder does not guarantee
    * thread safety which means synchronized methods are present in
    * StringBuffer making control of one thread access at a time while
    *  it is not seen in StringBuilder, hence thread-unsafe.*/
    private static void concat3(StringBuffer s3) {
        s3.append("forgeeks");
    }
    private static void stringToStringBufferToStringBuilder(){
        String str= "Geeks";

        // converting String object to StringBuffer object
        //by
        // creating object of StringBuffer class
        StringBuffer sbr= new StringBuffer(str);

        //Reversing the string
        sbr.reverse();

        // Printing the reversed string
        System.out.println(sbr);

        //Converting String object to StringBuilder object
        StringBuilder sbl= new StringBuilder(sbr);
        //Adding it to string using append() method
        sbl.append("ForGeeks");

        // Printing and display the above append string
        System.out.println(sbl);
    }

}
