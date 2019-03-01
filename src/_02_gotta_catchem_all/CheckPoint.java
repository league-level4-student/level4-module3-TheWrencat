package _02_gotta_catchem_all;
//
// public class CheckPoint {
// Questions and Exercises
// Questions
// Is the following code legal?

// yeah

// try {
//
// } finally {
//
// }

// What exception types can be caught by the following handler?

// run time exceptions
// ANSWER: any type of exception

// catch (Exception e) {
//
// }
// What is wrong with using this type of exception handler?
// Is there anything wrong with the following exception handler as written? Will
// this code compile?

// ANSWER: you lose information about the type of exception, but it will compile

// try {
//
// } catch (Exception e) {
//
// } catch (ArithmeticException a) {
//
// }
// Match each situation in the first list with an item in the second list.
// __error The JVM starts running your program, but the JVM can't find the Java
// platform classes. (The Java platform classes reside in classes.zip or
// rt.jar.)
// __checked exception Before closing the stream and after reaching the end of
// stream marker, a program tries to read the stream again.
// __compile error int[] A;
// __no exception A program is reading a stream and reaches the end of stream
// marker. A[0] = 0;


// Exercises

// Add a readList method to ListOfNumbers.java. This method should read in int
// values from a file, print each value, and append them to the end of the
// vector. You should catch all appropriate errors. You will also need a text
// file containing numbers to read in.

// skipped

 //Modify the following cat method so that it will compile.
 public static void cat(File file) {
 RandomAccessFile input = null;
 String line = null;

 try {
 input = new RandomAccessFile(file, "r");
 while ((line = input.readLine()) != null) {
 System.out.println(line);
 }
 return;
 } finally {
 if (input != null) {
 input.close();
 }
 }
 }
 }
