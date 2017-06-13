package patternmatching;
/**
 * In this Algorithm we can have our
 * own hashing mechanism
 * But when use Java , use power of Java :)
 * We use inbuild function of object hashCode();
 * When the string like abc and bac may give same hash for 
 * our custom implementation of hashCode.
 * Java gives seperate hash code as Strings are immutable in Java
 * 
 * @author vijendert
 *
 */
public class RabinKarpAlgorithm {

	public static void main(String[] args) {
		
		String input = "abccdeaed";
		String pattern = "dea";
		//calculate hash of pattern
		int hashOfPattern = pattern.hashCode();
		System.out.println("hashOfPattern = "+hashOfPattern);
		for(int i = 0;i<input.length()-pattern.length()+1;i++)
		{
			//check hash of first 3 character and move on incrementally
			String subString = input.substring(i,i+pattern.length());
			int hashOfInput = subString.hashCode();
			System.out.println("Hash of subString = "+subString+", is the value = "+hashOfInput);
			if(hashOfInput == hashOfPattern)
			{
				System.out.println("Match found on index "+i);
				// if we have a match we will now compare the string
				//This is useless check though , writting just to be
				//inline with RabinKarpAlgorithm. Since string is immutable
				//and hashcode equal means string are equal
				/*if(subString.equalsIgnoreCase(pattern))
				{
					System.out.println("Match found on index "+i);
				}*/
				
			}
				
		}

	}

}
