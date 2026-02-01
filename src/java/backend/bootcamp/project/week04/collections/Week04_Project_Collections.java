package backend.bootcamp.project.week04.collections;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;


public class Week04_Project_Collections
{
    public static void main(String[] args)
    {
        String  fmt;

        String  msg;

        int     step    = 0;

/*
 *  1. Create an array of int called ages that contains the following
 *     values: 3, 9, 23, 64, 2, 8, 28, 93.
 */
        int[]   ages    = { 3, 9, 23, 64, 2, 8, 28, 93, };
        prtf("%2d. ages int array (length: %d):  %s",
             ++step, ages.length, toString(ages));
/*
 *      a. Programmatically subtract the value of the first element in the array from the value in the last
 *         element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
 */
        fmt = "Difference of the last (%d) & first (%d) %s "
            + "array elements = %d";
        prtf(4, "a. " + fmt,
             ages[ages.length - 1], ages[0],
             "ages", ages[ages.length - 1] - ages[0]
            );
/*
 *      b. Create a new array of int called ages2 with 9 elements (ages2 will
 *         be longer than the ages array, and have more elements).
 */
        int[]   ages2   = { 3, 9, 23, 64, 2, 8, 28, 93, 37, };
        prtf(4, "b. ages2 int array (length: %d):  %s",
             ages2.length, toString(ages2)
            );
/*
 *            i. Make sure that there are 9 elements of type int in this new array.
 */
        prtf(7, "  i. ages2 int array length = %d", ages2.length);
/*
 *           ii. Repeat the subtraction from Step 1.a. (Programmatically subtract
 *               the value of the first element in the new array ages2 from the last element of ages2).
 */
        prtf(7, " ii. " + fmt,
             ages2[ages2.length - 1], ages2[0],
             "ages2", ages2[ages2.length - 1] - ages2[0]
            );
/*
 *          iii. Show that using the index values for the elements is dynamic (works for
 *               arrays of different lengths).
 */
        fmt = "index 3 of the %d element ages array = %d; "
            + "index 3 of the %d element ages2 array = %d";
        prtf(7, "iii. " + fmt, ages.length, ages[3], ages2.length, ages2[3]);
/*
 *      c. Use a loop to iterate through the array and calculate the average age. Print the
 *         result to the console.
 */
        int     totAge  = 0;
          for( int age : ages2)  totAge  += age;

        fmt = "Total ages of the %d element ages2 array = %d; "
            + "average age = %d - uh, %.2f to be a bit more specific";
        prtf(4, "c. " + fmt,
             ages2.length, totAge,
             totAge / ages2.length, (double)totAge / ages2.length
            );


/*
 *  2. Create an array of String called names that contains the following
 *     values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
 */
        String[]    names    = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob", };
        prtf("\n%2d. names String array (length %d):  %s",
             ++step, names.length, toString(names)
            );
/*
 *      a. Use a loop to iterate through the array and calculate the average number of
 *         letters per name. Print the result to the console.
 */
        int     letterKnt   = 0;
          for( String s : names )  letterKnt += s.length();

        fmt = "Total number of letters in the names array = %d; "
            + "average name length = %d - uh, %.2f to be a bit more specific";
        prtf(4, "a. " + fmt,
             letterKnt,
             letterKnt / names.length, (double)letterKnt / names.length
            );
/*
 *      b. Use a loop to iterate through the array again and concatenate all the
 *         names together, separated by spaces, and print the result to the console.
 */
        String  namez   = "";
        for( String name : names )  namez += " " + name;

        prtf(4, "b. names in the names String array:  \"%s\"",
             namez.substring(1)
            );
/*
 *  3. How do you access the last element of any array?
 */
        fmt = "\n%2d. Q: How do you access the last element of any array?";
          prtf(fmt, ++step);
        msg = "A: To access the last element of an array, use one less than "
            + "the array's length property as the array index value.";
          prtf(4, msg);
        msg = "For example ... for an array, arr, reference its last element "
            + "as arr[arr.length - 1]";
          prtf(7, msg);
/*
 *  4. How do you access the first element of any array?
 */
        fmt = "\n%2d. Q: How do you access the first element of any array?";
          prtf(fmt, ++step);
        msg = "A: To access the first element of an array, use 0 (zero) as "
            + "as the array index value; this is because java array indices "
            + "are zero-based.";
          prtf(4, msg);
        msg = "For example ... for an array, arr, reference its last element "
            + "as arr[0]";
          prtf(7, msg);
/*
 *  5. Create a new array of int called nameLengths. Write a loop to iterate over the
 *     previously created names array and add the length of each name to the nameLengths array.
 */
        int[]   nameLengths = new int[names.length];
          for( int i = -1; ++i < names.length; )
            nameLengths[i] = names[i].length();

        fmt = "Lengths of the names in the names String array, { %s } are "
            + " { %s }, respectively";
          prtf("\n%2d. " + fmt, ++step, toString(names), toString(nameLengths));
/*
 *  6. Write a loop to iterate over the nameLengths array and calculate the sum of all the
 *     elements in the array. Print the result to the console.
 */
        int     totLen  = 0;
          for( int len : nameLengths )  totLen += len;

        prtf("\n%2d. The total of the nameLengths array elements is %d",
             ++step, totLen
            );
/*
 *  7. Write a method that takes a String, word, and an int, n, as arguments and returns the
 *     word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I
 *     expect the method to return “HelloHelloHello”).
 */
        String  word    = "Hello";

        prtf("\n%2d. \"%s\" repeated three times:  \"%s\"",
             ++step, word, repeat(word, 3)
            );
/*
 *  8. Write a method that takes two Strings, firstName and lastName, and returns a full
 *     name (the full name should be the first and the last name as a String separated by a space).
 */
        String  nameFirst   = "John";
        String  nameLast    = "Smith";

        prtf("\n%2d. First name: \"%s\"; last name: \"%s\" --> full name: \"%s\"",
             ++step, nameFirst, nameLast, makeFullName(nameFirst, nameLast)
            );
/*
 *  9. Write a method that takes an array of int and returns true if the sum of all the
 *     ints in the array is greater than 100.
 */
        Map<String, int[]>  arrs    = Map.of( "ages",           ages,
                                              "ages2",          ages2,
                                              "nameLengths",    nameLengths
                                            );

        List<String>        nameKeys;
          Collections.sort(nameKeys = new ArrayList<String>(arrs.keySet()));
        int[]               nums;

        fmt = "\n%2d. Is the Sum of int Array elements is greater 100?";
          prtf(fmt, ++step);

        fmt = "Array Name      > 100 ?     Total     Array Elements"
            + "%n%18s%12s     %s     %s";
          prtf(7, fmt,
               "-".repeat(11), "-".repeat(7), "-".repeat(5), "-".repeat(40)
              );
        for( String arrName : nameKeys )
        {
            nums    = arrs.get(arrName);
            prtf(7, "%-11s     %-7b     %5d     { %s }",
                 arrName, isSumGT100(nums), sum(nums), toString(nums)
                );
        }
/*
 * 10. Write a method that takes an array of double and returns the average
 *     of all the elements in the array.
 */
        double[][]  dbls    = {
                                { 1,        2,      3,    4,    777, },
                                { 12.7, .0252,  47.73,  333, },
                                { 1,        2,      3,    4,      7,    -3, },
                                { 10,       0,     -3, }
                              };

        prtf("\n%2d. Averages of double arrays", ++step);
        for( double[] dbl : dbls )
            prtf(7, "{ %s } = %.2f", toString(dbl), average(dbl));
/*
 * 11. Write a method that takes two arrays of double and returns true if the
 *     average of the elements in the first array is greater than the average
 *     of the elements in the second array.
 *     compareAverages()
 */
        prtf("\n%2d. Compare averages of double arrays", ++step);
        prtf(7, "Average of { %s } (%.2f) > average of { %s } (%.2f):  %b",
             toString(dbls[0]), average(dbls[0]),
             toString(dbls[1]), average(dbls[1]),
             compareAverages(dbls[0], dbls[1])
            );
        prtf(7, "Average of { %s } (%.2f) > average of { %s } (%.2f):  %b",
             toString(dbls[1]), average(dbls[1]),
             toString(dbls[0]), average(dbls[0]),
             compareAverages(dbls[1], dbls[0])
            );
        prtf(7, "Average of { %s } (%.2f) > average of { %s } (%.2f):  %b",
             toString(dbls[2]), average(dbls[2]),
             toString(dbls[3]), average(dbls[3]),
             compareAverages(dbls[2], dbls[3])
            );
/*
 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside,
 *     and a double moneyInPocket, and returns true if it is hot outside and
 *     if moneyInPocket is greater than 10.50.
 */
        double[]    bucks   = { 24.37, 7.73, 10.50, };

        byte        fmtNdx;

        boolean[]   isHot       = { true, false, };
        String      itsHot      = "it's stinkin' hot, ";

        String      lowBucks    = "I be low on buckaroonies - only gots ";

        String      nope        = "Nah, ";
        String      notHot      = "it ain't that hot ";


        String[]    fmts        =
            {
                "You betcha - so hot 'n' got lotsa bucks - $%.2f !!!",
                nope + notHot + "though I gots plenty o' buckos = $%.2f",
                nope + itsHot + "but " + lowBucks + " = $.2f",
                nope + notHot + "plus " + lowBucks + " = $%.2f",
            };

        prtf("\n%2d. Gonna get a drink ???", ++step);
        for( boolean hot : isHot )
            for( double onHand : bucks )
            {
                fmtNdx  = 0;
                if (!willBuyDrink(hot, onHand))
                {
                    if (!hot)               fmtNdx |= 1;
                    if (onHand <= 10.50)    fmtNdx |= 2;
                }
                prtf(7, fmts[fmtNdx], onHand);
            }
/*
 * 13. Create a method of your own that solves a problem. In comments,
 *     write what the method does and why you created it.
 */
        // prtf without indentation and with
        prtf("\n%2d. Method creation", ++step);
        prtf(3, "prtf([int [indent,] Stringfmt, Object... fmtArgs): void");
        prtf(7, "prtf with indentation; "
                + "for prtf w/ no indentation, see two output lines previous"
            );

        // sum method for double, float, and int arrays
        prtf(3, "sum({double|float|int}[]: {double|float|int}", ++step);
        float[] floats = { 47.3158f, 12.37f, 37.21f, 148.799f, };
        fmt = "Sum of the %s values in the %s array = ";

        prtf(7, fmt + "%.2f", "double", "double",   sum(dbls[0]));
        prtf(7, fmt + "%.2f", "float",  "float",    sum(floats));
        prtf(7, fmt + "%d",   "int",    "int",      sum(nameLengths));

        // toString method for double, float, int, and String arrays
        prtf(3, "toString({double|float|int|String}[]: String", ++step);
        fmt = "Values in the %s %s array:  [ %s ]";

        prtf(7, fmt, "dbls[0]",     "double",   toString(dbls[0]));
        prtf(7, fmt, "floats",      "float",    toString(floats));
        prtf(7, fmt, "nameLengths", "int",      toString(nameLengths));
        prtf(7, fmt, "names",       "String",   toString(names));
    }

    /*******   Methods for steps 7 -13   *******/
    /*
     *  Step 7
     */
    public static String repeat(String word, int count)
    {
        // ***   easier:  return word.repeat(3);
        String  s   = word;

        for( int i = 0; ++i < count; )  s += word;

        return s;
    }

    /*
     *  Step 8
     */
    public static String makeFullName(String firstName, String lastName)
    {
        return firstName + " " + lastName;
    }

    /*
     *  Step 9
     */
    public static boolean isSumGT100(int[] nums)
    {
        int sum = 0;
          for( int num : nums )  sum += num;

        return sum > 100;
    }

    /*
     *  Step 10
     */
    public static double average(double[] nums)
    {
        return sum(nums) / nums.length;
    }

    /*
     *  Step 11
     */
    public static boolean compareAverages(double[] arr1, double[] arr2)
    {
        return average(arr1) > average(arr2);
    }

    /*
     *  Step 12
     */
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket)
    {
        return isHotOutside && (moneyInPocket > 10.50);
    }

    /*
     *  Step 13  [ multiple overloaded utility methods - prtf, sum, toString ]
     */
    /*
     * Method name:     prtf
     *    Signatures:   prtf(String fmt, Object... fmtArgs):  void
     *                  prtf(int indent, String fmt, Object... fmtArgs):  void
     *
     * Abstract:
     *    Overloaded methods that combines the System.out.println and
     *    String.format methods to mimic the printf-type method in other
     *    languages.  Also adds optional indentation of the output to the
     *    printf-like functionality.
     *
     * Reason/purpose:
     *    Provides printf-like capability for Java, along with optional
     *    indentation in order to enhance the look & feel of process output.
     *
     *    Note:  these methods are used throughout this lab in lieu of
     *    System.out.println for outputting messages to the console.
     *
     * Parameters:
     *    int indent
     *          [ optional ] an int value indicating how much indentation
     *              (i.e. how many spaces) should precede the out message on
     *               the line.  If not provided, defaults to no indentation.
     *    String fmt
     *          a String providing the format of the output message
     *              containing text or format specifiers or a combination of
     *              both.  Format specifiers are the same as those provided
     *               by the String.format method.
     *    Object    fmtArgs
     *          [ optional ] an Object varargs providing the values to be
     *              used to replace the format specifiers given in the fmt
     *              parameter.  The number of these values should match the
     *              number of format specifiers in the fmt parameter.
     *              Additionally, the data type of each of these values
     *              should match the type expected by its associated format
     *              specifier.  This parameter should be omitted it the fmt
     *              parameter contains no format specifiers.
     *
     * Return value:
     *    [ none ]
     */
    static void prtf(String fmt, Object... fmtArgs)
    {
        // Call the String.format method for the fmt & fmtArgs parameters to
        //  create text with the fmtArgs value(s) ad print the result to the
        //  console.
        System.out.println(String.format(fmt, fmtArgs));
    }
    static void prtf(int indent, String fmt, Object... fmtArgs)
    {
        // Prepend the number of spaces indicated by the indent parameter to
        //  the fmt format parameter and call the overloaded
        //  prtf(String fmt, Object... fmtArgs) method.
        prtf(" ".repeat(indent) + fmt, fmtArgs);
    }

    /*
     * Method name:     sum
     *    Signatures:   sum(double[] nums):  double
     *                  sum(float[]  nums):  float
     *                  sum(int[]    nums):  int
     *
     * Abstract:
     *    Overloaded methods to sum the values in the nums numeric array
     *    parameter and return the sum of those values as a value matching
     *    the array's type.
     *
     * Reason/purpose:
     *    Provides a shorthand way to sum the values in a numeric array.
     *
     * Parameters:
     *    double nums   for sum(double[] nums):  double
     *    float  nums   for sum(float[]  nums):  float
     *    int    nums   for sum(int[]    nums):  int
     *          a numeric array containing values of the specific type to be
     *              summed.
     *
     * Return value:
     *    double    for sum(double[] nums):  double
     *    float     for sum(float[]  nums):  float
     *    int       for sum(int[]    nums):  int
     *          the sum of the numeric values in the nums numeric array
     *          parameters
     */
    public static double sum(double[] nums)
    {
        double  sum = 0;        // sum will be the value returned; initialize to zero

        // For each numeric value in the double array, add it to the running sum
        for( double num : nums )  sum += num;

        return sum;             // return the sum
    }
    public static float sum(float[] nums)
    {
        float   sum = 0;        // sum will be the value returned; initialize to zero

        // For each numeric value in the float array, add it to the running sum
        for( float num : nums )  sum += num;

        return sum;             // return the sum
    }
    public static int sum(int[] nums)
    {
        int     sum = 0;        // sum will be the value returned; initialize to zero

        // For each numeric value in the int array, add it to the running sum
        for( int num : nums )  sum += num;

        return sum;             // return the sum
    }

    /*
     * Method name:     toString
     *    Signatures:   toString(double[] nums):  String
     *                  toString(float[]  nums):  String
     *                  toString(int[]    nums):  String
     *
     * Abstract:
     *    Overloaded methods to convert the values in the nums numeric array
     *    parameter into a comma-and-space-separated (", ") String value.
     *
     * Reason/purpose:
     *    Provides a shorthand way to convert the values in an array to a
     *    text String.
     *
     * Parameters:
     *    double[] nums   for toString(double[] nums):  String
     *    float[]  nums   for toString(float[]  nums):  String
     *    int[]    nums   for toString(int[]    nums):  String
     *    String[] nums   for toString(String[] stgs):  String
     *          a numeric array containing values of the specific type to be
     *              converted.
     *
     * Return value:
     *    String
     *          comma-and-space-separated text containing the numeric values
     *          in the nums numeric array parameter
     */
    public static String toString(double[] nums)
    {
        String  s   = "";                   // s will be the value returned; initialize to ""
          if (nums.length == 0)  return s;  // Make sure the array has elements

        // For each numeric value in the float array, append it to the text
        //  in s, delimited by a comma and a space (", ").
        //  Note:  when the loop has completed the first two characters of
        //  the text will be a comma followed by a space (", ").
        for( double n : nums )  s += String.format(", %.2f", n);

        return s.substring(2);              // return the text with the leading comma & space removed
    }
    public static String toString(float[] nums)
    {
        String  s   = "";                   // s will be the value returned; initialize to ""
          if (nums.length == 0)  return s;  // Make sure the array has elements

        // For each numeric value in the float array, append it to the text
        //  in s, delimited by a comma and a space (", ").
        //  Note:  when the loop has completed the first two characters of
        //  the text will be a comma followed by a space (", ").
        for( float n : nums )  s += ", " + n + "f";

        return s.substring(2);              // return the text with the leading comma & space removed
    }
    public static String toString(int[] nums)
    {
        String  s   = "";                   // s will be the value returned; initialize to ""
          if (nums.length == 0)  return s;  // Make sure the array has elements

        // For each numeric value in the float array, append it to the text
        //  in s, delimited by a comma and a space (", ").
        //  Note:  when the loop has completed the first two characters of
        //  the text will be a comma followed by a space (", ").
        for( int n : nums )  s += ", " + n;

        return s.substring(2);              // return the text with the leading comma & space removed
    }
    public static String toString(String[] stgs)
    {
        String  s   = "";                   // s will be the value returned; initialize to ""
          if (stgs.length == 0)  return s;  // Make sure the array has elements

        // For each String value in the String array, append it to the text
        //  in s, delimited by a comma and a space (", ").
        //  Note:  when the loop has completed the first two characters of
        //  the text will be a comma followed by a space (", ").
        for( String stg : stgs )  s += ", " + stg;

        return s.substring(2);              // return the text with the leading comma & space removed
    }

}
