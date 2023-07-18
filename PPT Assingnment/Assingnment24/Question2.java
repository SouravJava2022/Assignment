package in.deb;

import java.util.HashSet;
import java.util.Set;

public class Question2 {
	static int solve(String str) {

		if (str.length() == 0)
			return 0;
		int maxans = Integer.MIN_VALUE;
		for (int i = 0; i < str.length(); i++) {
			Set<Character> se = new HashSet<>();
			for (int j = i; j < str.length(); j++)

			{
				if (se.contains(str.charAt(j))) // if element if found so mark it as ans

				{
					maxans = Math.max(maxans, j - i);
					break;
				}
				se.add(str.charAt(j));
			}
		}
		return maxans;
	}

	public static void main(String args[]) {
		String str = "abcabcbb";
		System.out.println("The length of the longest substring without repeating characters is " + solve(str));

	}

}