package drishtcon;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class FruquentChar {

	public static void main(String[] args) {
		System.out.println(findFruquentChar("africaa"));
    }
public static char findFruquentChar(String str) {

         int count[] = new int[256];
         char result = ' ';
	for(int i=0; i<str.length(); i++) {
		count[str.charAt(i)]++;
	}

	int max=0;

	for(int j=0; j<str.length(); j++) {
		if(count[str.charAt(j)] > max) {
			max = count[str.charAt(j)];
			result = str.charAt(j);
		}
	}
	return result;

}

//    public static void main(String[] args) {
//        System.out.println(findFruquentChar("africaa"));
//
//    }
//    public static char findFruquentChar(String str) {
//
//        return str.chars()
//                .mapToObj(x -> (char)x)
//                .collect(groupingBy(a -> a, counting()))
//                .entrySet().stream()
//                .max(comparingByValue())
//                .get()
//                .getKey();
//
//    }
}
