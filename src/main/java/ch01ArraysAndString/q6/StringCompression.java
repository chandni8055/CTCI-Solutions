package ch01ArraysAndString.q6;

/*
  implement an algorithm to perform basic string compression using the counts of repeated characters.
*/
public class StringCompression {
        static String compressBad(String str){
            String compressedString = "";
            int countConsecutive = 0;
            for(int i =0; i < str.length(); i++){
                countConsecutive++;

                //if next character is different than current, append this char to result.

                if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                   compressedString += "" + str.charAt(i) + countConsecutive;
                   countConsecutive = 0;
                }
            }
            return compressedString.length() < str.length() ? compressedString : str;
        }

        //Another approach using stringbuilder

    static String compress(String str){
        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;
        for(int i =0; i < str.length(); i++){
            countConsecutive++;

            //if next character is different than current, append this char to result.

            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return compressed.length() < str.length() ? compressed.toString() : str;
    }
}

