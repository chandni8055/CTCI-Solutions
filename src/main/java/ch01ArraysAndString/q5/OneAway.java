package ch01ArraysAndString.q5;

/*
* Check two string are OneAway
*/

public class OneAway {

    static boolean areOneEditAway(String s1, String s2) {
        if(s1.length() == s2.length()){
            return oneEditReplace(s1, s2);
        }

        else if(s1.length() + 1 == s2.length()){
            return oneEditInsert(s1, s2);
        }

        else if(s1.length() - 1 == s2.length()){
            return oneEditInsert(s2, s1);
        }

        return false;
    }

    //method for checking replacement in string
    static boolean oneEditReplace(String s1, String s2) {
        boolean foundDifference = false;
        for(int i = 0; i< s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                if(foundDifference){
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }

    //method for checking insertion and removal
    static boolean oneEditInsert(String s1, String s2) {
        int index1 = 0;
        int index2 =0;
        while(index2 < s2.length() && index1 < s1.length()){
            if(s1.charAt(index1) != s2.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    //Another approach
    public static Boolean isOneEditAway(String first, String second){
        if(Math.abs(first.length() - second.length()) > 1){
            return false;
        }

        String s1 = first.length() < second.length() ? first : second;
        String s2 = first.length() < second.length() ? second : first;

        int index1 = 0;
        int index2 = 0;
        boolean foundDifference = false;
        while(index2 < s2.length() && index1 < s1.length()){
            if(s1.charAt(index1) != s2.charAt(index2)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;

                if (s1.length() == s2.length()) {
                    index1++;
                }
            }

                else{
                    index1++;
                }
                index2++;
            }
            return true;
        }
    }
