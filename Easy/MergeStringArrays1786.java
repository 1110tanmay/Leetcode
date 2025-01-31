public class MergeStringArrays1786{
    public static void main(String[] args) {
        String word1 = "tanmay";
        String word2 = "shelar";
        int strlen = word1.length();
        int strlen2 = word2.length();
        for(int i = 0;i<strlen;i++){
            System.out.println(word1.charAt(i));
        }
        for (int j=0;j<strlen2;j++){
            System.err.println(word2.charAt(j));
        }
        System.out.println(strlen);
        System.out.println(strlen2);
        System.out.println(word1.concat(word2));
    }
}