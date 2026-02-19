package com.gradescope.hw2;
//testing
import java.util.Arrays;

/**
 * Fill in the body of the methods below based upon the specification provided.
 * It may be helpful to look at the test cases provided in
 * {@link JavaArraysTests} to understand the intended behavior of the method.
 * 
 * All content is based upon problems at
 * <a href="https://codingbat.com/">CodingBat.com</a>.
 * 
 * @see JavaArraysTests
 * 
 * @author HMC CS 60 Instructors
 * @version Fall 2025
 */
public class JavaArrays {
  /**
   * Given an array of ints, return the number of 9s in the array.
   * 
   * <p>
   * Source: https://codingbat.com/prob/p184031
   * 
   * @param nums an array of integers
   * @return the number of 9s in the array
   */
  public static int arrayCount9(int[] nums) {
    System.out.println("****** arrayCount9 ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    int count = 0;
    for (int n : nums){
      if (n == 9) {
        count++;
      }
    }
    return count;
  }

  /**
   * Given an array of ints, return true if one of the first 4 elements in the
   * array is a 9. The array length may be less than 4.
   * 
   * <p>
   * Source: https://codingbat.com/prob/p186031
   * 
   * @param nums an array of integers
   * @return true if one of the first 4 elements in the array is a 9
   */
  public static boolean arrayFront9(int[] nums) {
   
    System.out.println("****** arrayFront9 ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help
    
    int limit = Math.min(nums.length, 4);

    for (int i = 0; i < limit; i++) {
      if (nums[i] == 9) {
        return true;
      }
      
    }
    return false;
  }

  /**
   * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array
   * somewhere.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p136041
   * 
   * @param nums an array of integers
   * @return true if .. 1, 2, 3, .. appears in the array somewhere
   */
  public static boolean array123(int[] nums) {
    
    System.out.println("****** array123 ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    for (int i = 0; i <= nums.length - 3; i++){
      if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given an array of ints, return the number of times that two 6's are next to
   * each other in the array plus the number of times where a 6 is followed by a
   * 7.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p110019
   * 
   * @param nums an array of integers
   * @return the number of times that two 6's are next to each other in the
   *         array plus the number of times where a 6 is followed by a 7
   */
  public static int array667(int[] nums) {
    
    System.out.println("****** array667 ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    int count = 0;
    for (int i = 0; i < nums.length -1; i++){
      if (nums[i] == 6 && (nums[i+1]== 6 || nums[i+1] == 7 )) {
        count++;
      }
    }
    
    return count;
  }

  /**
   * Given an array of ints, we'll say that a triple is a value appearing 3
   * times in a row in the array. Return true if the array does not contain any
   * triples.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p170221
   * 
   * @param nums an array of integers
   * @return true if the array does not contain any triples
   */
  public static boolean noTriples(int[] nums) {
    
    System.out.println("****** noTriples ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Given an array of ints, return true if 6 appears as either the first or
   * last element in the array. The array will be length 1 or more.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p185685
   * 
   * @param nums an array of integers
   * @return true if 6 appears as either the first or last element in the array
   */
  public static boolean firstLast6(int[] nums) {
    
    System.out.println("****** firstLast6 ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    return nums[0] == 6 || nums[nums.length - 1] == 6;
  }

  /**
   * Given an array of ints, return true if the array is length 1 or more, and
   * the first element and the last element are equal.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p118976
   * 
   * @param nums an array of integers
   * @return true if the array is length 1 or more, and the first element and
   *         the last element are equal
   */
  public static boolean sameFirstLast(int[] nums) {
    
    System.out.println("****** sameFirstLast ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    
    return nums.length >= 1 && nums[0] == nums[nums.length - 1];
  }

  /**
   * Return an int array length 3 containing the first 3 digits of pi, {3, 1,
   * 4}. Hint: Don't overthink this one. No computation required!
   * 
   * <p>
   * Source: http://codingbat.com/prob/p167011
   * 
   * @return an int array length 3 containing the first 3 digits of pi
   */
  public static int[] makePi() {
    
    System.out.println("****** makePi ******"); // debug help
    System.out.println("some number:" + 0); // debug help

    
    
    return new int[] {3, 1, 4};
  }

  /**
   * Given 2 arrays of ints, a and b, return true if they have the same first
   * element or they have the same last element. Both arrays will be length 1 or
   * more.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p191991
   * 
   * @param a an array of integers
   * @param b an array of integers
   * @return true if the two arrays have the same first element or they have the
   *         same last element
   */
  public static boolean commonEnd(int[] a, int[] b) {
   
    System.out.println("****** commonEnd ******"); // debug help
    System.out.println("a: " + Arrays.toString(a)); // debug help
    System.out.println("b: " + Arrays.toString(b)); // debug help
    System.out.println("some number:" + 0); // debug help

    return a[0] == b[0] || a[a.length -1] == b[b.length -1];
  }

  /**
   * Given an array of ints length 3, return the sum of all the elements.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p175763
   * 
   * @param nums an array of integers
   * @return the sum of all the elements
   */
  public static int sum3(int[] nums) {
    
    System.out.println("****** sum3 ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
    }

    return sum;
  }

  /**
   * Given an array of ints length 3, return an array with the elements "rotated
   * left" so {1, 2, 3} yields {2, 3, 1}.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p185139
   * 
   * @param nums an array of integers
   * @return an array with the elements "rotated left"
   */
  public static int[] rotateLeft3(int[] nums) {
    
    System.out.println("****** rotateLeft3 ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    
    return new int[] {nums[1], nums[2], nums[0]};
  }

  /**
   * Return the number of even ints in the given array. Note: the % "mod"
   * operator computes the remainder, e.g. 5 % 2 is 1.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p162010
   * 
   * @param nums an array of integers
   * @return the number of even ints in the given array
   */
  public static int countEvens(int[] nums) {
    
    System.out.println("****** countEvens ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    int count = 0;
    for (int i = 0; i < nums.length - 1; i++){
      if (nums[i] % 2 == 0) {
        count++;
      }
    }
    return count;
  }

  /**
   * Given an array length 1 or more of ints, return the difference between the
   * largest and smallest values in the array. Note: the built-in Math.min(v1,
   * v2) and Math.max(v1, v2) methods return the smaller or larger of two
   * values.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p196640
   * 
   * @param nums an array of integers
   * @return the difference between the largest and smallest values in the array
   * 
   * @see Math#min(int, int)
   * @see Math#max(int, int)
   */
  public static int bigDiff(int[] nums) {
    
    System.out.println("****** bigDiff ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    int min = nums[0];
    int max = nums[0];
    for(int i = 1; i < nums.length; i++){
      min = Math.min(min, nums[i]);
      max = Math.max(max, nums[i]);
    }
    return max - min;
  }

  /**
   * Return the "centered" average of an array of ints, which we'll say is the
   * mean average of the values, except ignoring the largest and smallest values
   * in the array. If there are multiple copies of the smallest value, ignore
   * just one copy, and likewise for the largest value. Use int division to
   * produce the final average. You may assume that the array is length 3 or
   * more.
   * 
   * <p>
   * Source: http://codingbat.com/prob/p136585
   * 
   * @param nums an array of integers
   * @return the "centered" average of an array of ints
   */
  public static int centeredAverage(int[] nums) {
   
    System.out.println("****** centeredAverage ******"); // debug help
    System.out.println("input: " + Arrays.toString(nums)); // debug help
    System.out.println("some number:" + 0); // debug help

    int sum = 0;
    int min = nums[0];
    int max = nums[0];

    for (int i = 0; i < nums.length; i++){
      sum += nums[i];
      min = Math.min(min, nums[i]);
      max = Math.max(max, nums[i]);
    }
    return (sum - min - max) / (nums.length - 2);
  }

  /**
   * Produces console output to help debug this class.
   * 
   * @param args unused
   */
  public static void main(String[] args) {
    // You can add debugging statements here to test your methods!
  }

  /**
   * Private constructor to prevent instantiating this class of static methods.
   */
  private JavaArrays() {
  }
}
