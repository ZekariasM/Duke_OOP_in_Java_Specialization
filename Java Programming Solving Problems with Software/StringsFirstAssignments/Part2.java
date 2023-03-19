
/**
 * Write a description of Part2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Part2 {

    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String dnaUpper = dna.toUpperCase();
        String startCodonUpper = startCodon.toUpperCase();
        String stopCodonUpper = stopCodon.toUpperCase();

        int startIndex = dnaUpper.indexOf(startCodonUpper);
        if (startIndex == -1) {
            return "";
        }

        int stopIndex = dnaUpper.indexOf(stopCodonUpper, startIndex + 3);
        if (stopIndex == -1) {
            return "";
        }

        int lengthBetween = stopIndex - startIndex;
        if (lengthBetween % 3 == 0) {
            return dna.substring(startIndex, stopIndex + 3);
        } else {
            return "";
        }
    }

    public void testSimpleGene() {
        String dna1 = "ATCGTAGCTACG"; // No "ATG"
        String dna2 = "ATGCTACGTACTAACTG"; // No "TAA"
        String dna3 = "ACGTAGCTACG"; // No "ATG" or "TAA"
        String dna4 = "ATGCTAGCATAAGAATGA"; // ATG, TAA, multiple of 3
        String dna5 = "ATGCTAGCATGAATG"; // ATG, TAA, not multiple of 3

        String[] dnaStrings = {dna1, dna2, dna3, dna4, dna5};
        String startCodon = "ATG";
        String stopCodon = "TAA";

        for (String dna : dnaStrings) {
            System.out.println("DNA string: " + dna);
            String gene = findSimpleGene(dna, startCodon, stopCodon);
            if (!gene.isEmpty()) {
                System.out.println("Gene: " + gene);
            } else {
                System.out.println("No gene found.");
            }
        }
        System.out.println("______________________________________________");
    }
    
    public static void main(String[] args) {
        Part2 p2 = new Part2();
        p2.testSimpleGene();
    }

}

