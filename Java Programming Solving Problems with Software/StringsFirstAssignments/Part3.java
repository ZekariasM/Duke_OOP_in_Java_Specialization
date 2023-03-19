
/**
 * Write a description of Part3 here.
 * 
 * @author Zekarias W. 
 * @version 03/12/2023
 */
public class Part3 {

    public boolean twoOccurrences(String stringa, String stringb) {
        int firstIndex = stringb.indexOf(stringa);
        if (firstIndex == -1) {
            return false;
        }
        int secondIndex = stringb.indexOf(stringa, firstIndex + stringa.length());
        if (secondIndex == -1) {
            return false;
        }
        return true;
    }

    public void testing() {
       String[] pairs = {"by", "A story by Abby Long", "a", "banana", "atg", "ctgtatgta"};
        for (int i = 0; i < pairs.length; i += 2) {
        String stringa = pairs[i];
        String stringb = pairs[i+1];
        boolean result = twoOccurrences(stringa, stringb);
        System.out.println("\"" + stringa + "\"" + " appears at least twice in \"" + stringb + "\": " + result);
       }
    }


    public String lastPart(String stringa, String stringb) {
        int index = stringb.indexOf(stringa);
        if (index == -1) {
            return stringb;
        }
        return stringb.substring(index + stringa.length());
    }

    public void testingLastPart() {
        String[] pairs = {"an", "banana", "zoo", "forest"};
        for (int i = 0; i < pairs.length; i += 2) {
            String stringa = pairs[i];
            String stringb = pairs[i+1];
            System.out.println("The part of the string after " + "\"" + stringa + "\"" + " in " + "\"" + stringb + "\"" + " is " + "\"" + lastPart(stringa, stringb) + "\".");
        }
    }

    public static void main(String[] args) {
        Part3 part3 = new Part3();
        part3.testing();
        part3.testingLastPart();
    }
}

