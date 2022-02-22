/*
Problem

Given a list of space separated words, reverse the order of the words. Each line of text contains L letters and W words. A line will only consist of letters and space characters. There will be exactly one space character between each pair of consecutive words.

Input
The first line of input gives the number of cases, N.
N test cases follow. For each test case there will a line of letters and space characters indicating a list of space separated words. Spaces will not appear at the start or end of a line.

Output
For each test case, output one line containing “Case #x: “ followed by the list of words in reverse order.
Limits

Small dataset
N = 5
1 ≤ L ≤ 25
Large dataset
N = 100
1 ≤ L ≤ 1000

Sample

Input                  Output 
3                      Case #1: test a is this
this is a test         Case #2: foobar
foobar                 Case #3: base your all
all your base
 */
package googlecodejam1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author macia
 */
public class GoogleCodeJam1 {
    
    private static int n;//cases nLines
//    private static Stack<String> nCases[];
    private static Stack nCases[];

    private static String line; //Only letters and space characters
    private static StringTokenizer tokens;
    private static String sol;
    
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
//        input
        System.out.println("Input:");
        n = Integer.parseInt(br.readLine());
        nCases = new Stack[n];
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            tokens = new StringTokenizer(line, " ");
            nCases[i]=new Stack();
            while (tokens.hasMoreTokens()) {
                nCases[i].push(tokens.nextToken());
            }
        }

        System.out.println("\nOutput: ");
        for (int i = 0; i < n; i++) {
            sol="";
            while(!nCases[i].isEmpty()){
                sol+=nCases[i].pop();
                sol+=" ";
            }
            System.out.println("Case #"+(i+1)+" "+sol);
        }
    }
}
