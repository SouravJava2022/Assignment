package in.deb;
import java.util.*;



public class Question6 {

		String mostFrequentWord(String arr[], int n)
		{
			HashMap<String, Integer> freq = new HashMap<>();
			HashMap<String, Integer> occurrence
				= new HashMap<>();
			int max = 0;
			String result = "";
			int k = 1;

			for (int i = 0; i < n; i++) {
				if (occurrence.containsKey(arr[i])) {
					continue;
				}

				occurrence.put(arr[i], k);
				k++;
			}

			for (int i = 0; i < n; i++) {
				if (freq.containsKey(arr[i])) {
					freq.put(arr[i], freq.get(arr[i]) + 1);
				}
				else
					freq.put(arr[i], +1);

				if (max <= freq.get(arr[i])) {

					if (max < freq.get(arr[i])) {
						max = freq.get(arr[i]);
						result = arr[i];
					}
					else {
						if (occurrence.get(result)
							< occurrence.get(arr[i])) {
							max = freq.get(arr[i]);
							result = arr[i];
						}
					}
				}
			}

			return result;
		}

		public static void main(String[] args)
		{

			String arr[]
				= { "geeks", "for",	 "geeks", "a",
					"portal", "to",	 "learn", "can",
					"be",	 "computer", "science", "zoom",
					"yup", "fire",	 "in",	 "be",
					"data", "geeks" };
			int n = arr.length;

			Question6 obj = new Question6();
			System.out.print(obj.mostFrequentWord(arr, n)
							+ "\n");
		}
	}

	

	 

