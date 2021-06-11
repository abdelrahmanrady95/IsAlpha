/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rady
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        String string1 = "Hello";
        String string2 = "Hi";
        String result = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println(result);

        result = StringUtils.betterString(string1, string2, (s1, s2) -> true);
        System.out.println(result);

        string1 = "No";
        string2 = "Yes";
        result = StringUtils.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        System.out.println(result);
    }
}
