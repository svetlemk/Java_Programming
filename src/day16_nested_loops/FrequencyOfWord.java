package day16_nested_loops;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "java java Java JAVA jaVA";
        String word = "java";

        int count = 0;

        while(sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst("java", "");



        }
        System.out.println(count);







    }

}
/*
Write a program that can return the frequency of the word java from a sentence
Ex:
sentence = "java JAVA jAvA JAva"
output:   4
 */