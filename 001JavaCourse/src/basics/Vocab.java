package basics;

public class Vocab
{
/** The controlled vocabulary for a theVocab object. */
/** Searches for a string in theVocab. Returns true if its String parameter str
* is an exact match to an element in theVocab and returns false otherwise.
*/
	
	
	String theVocab = "This is the sentence which contains words of words and sentence of sentence";
	
public boolean findWord(String str)
{
	if(theVocab.indexOf(str) != -1)
		return true;
	
	
	return false;

}
 
/** Counts how many strings in wordArray are not found in theVocab, as described in
* part (a).
*/
public int countNotInVocab(String[] wordArray)

{
	 int count = 0;
	for(int i=0; i < wordArray.length; i++) {
		
		if(!findWord(wordArray[i])) count++;
		
	}
		
	
	return count;
/* to be implemented in part (a) */
}

/** Returns an array containing strings from wordArray not found in theVocab,
* as described in part (b).
*/
public String[] notInVocab(String[] wordArray)
{
	int wordnotCount = countNotInVocab(wordArray);
	
	String result[] = new String[] {};
	
	for(int i = 0; i< wordnotCount; i++) {
		if(!findWord(wordArray[i])) {
			
			result[i] = wordArray[i];
		}
		
		
		for(int j = 0; j< theVocab.length(); j++ ) {
			
		//	for(k = )
			
			
			
		}
	}
	
	return result;
/* to be implemented in part (b) */
	
}
}
