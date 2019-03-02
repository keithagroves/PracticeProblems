package Bio;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BioTest {
    @Test
    public void testDna() throws Exception {
        Bio b = new Bio();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }
    
    @Test
    public void testDna2() throws Exception {
        Bio b = new Bio();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
    
    @Test
    public void testDna3() throws Exception {
        Bio b = new Bio();
        assertEquals("GACCGCCGCC", b.dnaToRna("GACCGCCGCC"));
    }
    
    @Test
    public void testDna4() throws Exception {
        Bio b = new Bio();
        assertEquals("GAUUCCACCGACUUCCCAAGUACCGGAAGCGCGACCAACUCGCACAGC", b.dnaToRna("GATTCCACCGACTTCCCAAGTACCGGAAGCGCGACCAACTCGCACAGC"));
    }
    
    @Test
    public void testDna5() throws Exception {
        Bio b = new Bio();
        assertEquals("CACGACAUACGGAGCAGCGCACGGUUAGUACAGCUGUCGGUGAACUCCAUGACA", b.dnaToRna("CACGACATACGGAGCAGCGCACGGTTAGTACAGCTGTCGGTGAACTCCATGACA"));
    }
    
    @Test
    public void testDna6() throws Exception {
        Bio b = new Bio();
        assertEquals("CACGACAUACGGAGCAGCGCACGGUUAGUACAGCUGUCGGUGAACUCCAUGACA", b.dnaToRna("CACGACATACGGAGCAGCGCACGGTTAGTACAGCTGTCGGTGAACTCCATGACA"));
    }
    @Test
    public void testDna7() throws Exception {
        Bio b = new Bio();
        assertEquals("AACCCUGUCCACCAGUAACGUAGGCCGACGGGAAAAAUAAACGAUCUGUCAAUG", b.dnaToRna("AACCCTGTCCACCAGTAACGTAGGCCGACGGGAAAAATAAACGATCTGTCAATG"));
    }
    
    @Test
    public void testDna8() throws Exception {
        Bio b = new Bio();
        assertEquals("GAAGCUUAUCCGUUCCUGAAGGCUGUGGCAUCCUCUAAAUCAGACUUGGCUACGCCGUUAGCCGAGGGCUUAGCGUUGAGUGUCAUUAUAUACGCGGCCUGCGACCUGGCCACACAAUGCCCUCGAAAAUUUUUCUUUCGGUUAUACGAGUUGCGAAACCUUUCGCGCGUAGACGAAGAAUUUGAAGUGGCCUACACCGUUUGGAAAGCCGUUCUCAUUAGAAUGGUACCGACUACUCGGCUCGGAGUCAUUGUAUAGGGAGAGUGUCGUAUCAACAUCACACACUUUUAGCAUUUAAGGUCCAUGGCCGUUGACAGGUACCGA", b.dnaToRna("GAAGCTTATCCGTTCCTGAAGGCTGTGGCATCCTCTAAATCAGACTTGGCTACGCCGTTAGCCGAGGGCTTAGCGTTGAGTGTCATTATATACGCGGCCTGCGACCTGGCCACACAATGCCCTCGAAAATTTTTCTTTCGGTTATACGAGTTGCGAAACCTTTCGCGCGTAGACGAAGAATTTGAAGTGGCCTACACCGTTTGGAAAGCCGTTCTCATTAGAATGGTACCGACTACTCGGCTCGGAGTCATTGTATAGGGAGAGTGTCGTATCAACATCACACACTTTTAGCATTTAAGGTCCATGGCCGTTGACAGGTACCGA"));
    }
    
    @Test
    public void randomTests() throws Exception {
        for (int trial = 1; trial < 20; trial++) {
            char[] nucleotides = new char[(int)(Math.random() * 400)];
            for (int i = 0; i < nucleotides.length; i++)
                nucleotides[i] = "ACGT".charAt((int)(Math.random() * 4));
            String dna = new String(nucleotides);
            String expected = dna.replace('T', 'U');
            Bio b = new Bio();
            System.out.format("Trial #%d: %s\n\n", trial, dna);
            assertEquals(expected, b.dnaToRna(dna));
        }
    }
}