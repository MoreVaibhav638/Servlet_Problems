package collection_practice;

import java.util.ArrayList;
import java.util.Collections;

public class MergeArrayList {
	public static char[] mergeData(ArrayList<Character>list1, ArrayList<Character> list2 ) {
		ArrayList<Character> mergeList = new ArrayList<>();
		mergeList.addAll(list1);
		mergeList.addAll(list2);
		Collections.sort(mergeList);
		
		char[] result = new char[mergeList.size()];
		
		for(int i=0;i<mergeList.size();i++)
		{
			result[i]=mergeList.get(i);
		}
		return result;
	}

}

