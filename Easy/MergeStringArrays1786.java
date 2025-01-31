public class MergeStringArrays1786{
    public static void main(String[] args) {
        String word1 = "tanmay";
        String word2 = "shelar";

        //Getting length of the strings. 
        int strlen = word1.length();
        int strlen2 = word2.length();

        //Coverting the strings into char arrays. 
        char [] wordOne = word1.toCharArray();
        char [] wordTwo = word2.toCharArray();
        int addedArrLen = strlen+strlen2;

        char [] combinedArr = new char[addedArrLen]; //Dynamically created of length whatever combined length of two string arrays is. 
        String combinedString = word1 + word2;

        System.out.println(combinedString);
    }
}