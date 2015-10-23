/**
 * 
 */
package com.colinsOrg.Quine;

/**
 * @author cfletch
 *A quine is a non-empty computer program which takes 
 *no input and produces a copy of its own source code as its 
 *only output.
 */
public class Quine {
	 public static void main(String[] args) { 
		 char c=34; System.out.println(s+c+s+c+';'+'}'); } 
	 static String s="public class Quine { " +
	 		"public static void main(String[] args) { " +
	 		"char c=34; System.out.println(s+c+s+c+';'+'}'); }" +
	 		" static String s=";

}
