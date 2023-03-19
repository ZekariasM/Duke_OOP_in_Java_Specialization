
/**
 * This program reads the lines from the file at this URL location, http://www.dukelearntoprogram.com/course2/data/manylinks.html, 
 * and prints each URL on the page that is a link to youtube.com. 
 * 
 * @author Zekarias W.
 * 
 * @version 03-19-2023
 */

import edu.duke.*;
import java.io.*;

public class Part4 {
    public void findYoutubeLinks() {
        URLResource urlResource = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        
        for (String word : urlResource.words()) {
            String lowerCaseWord = word.toLowerCase();
            int youtubeIndex = lowerCaseWord.indexOf("youtube.com");
            
            if (youtubeIndex != -1) {
                int leftQuoteIndex = lowerCaseWord.lastIndexOf("\"", youtubeIndex);
                int rightQuoteIndex = lowerCaseWord.indexOf("\"", youtubeIndex);

                if (leftQuoteIndex != -1 && rightQuoteIndex != -1) {
                    String youtubeUrl = word.substring(leftQuoteIndex + 1, rightQuoteIndex);
                    System.out.println(youtubeUrl);
                }
                
            }

        }
    }

    public static void main(String[] args) {
        Part4 part4 = new Part4();
        part4.findYoutubeLinks();
    }
}

