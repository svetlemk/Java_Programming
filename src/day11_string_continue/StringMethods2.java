package day11_string_continue;

public class StringMethods2 {
    public static void main(String[] args) {
        String sentence = "Hello Python I love Java programming, Python is in high demand";

        System.out.println(sentence.replace("Python", "Sveta"));

        System.out.println("--------------");

        String s3 = "java";
        s3 = s3.replace('a', 'A');// replace all the matching

        System.out.println(s3);

        String funnyWord = " I love Java she is the best Java fun";

        funnyWord = funnyWord.replaceFirst("Java", "Sveta");

        System.out.println(funnyWord);// only modify the first match string portion.

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        sentence3 = sentence3.replaceFirst(", Java", ". Python");

        System.out.println(sentence3);

        System.out.println("-------------------");

        String sen1 = "I love Java programming";
        //             012345678910
        String language = sen1.substring(7, 11);
        System.out.println(language);

        //------------

        String sen5 = "Today is Sunday, tomorrow is Monday";
        //             0123456789
        String today = sen5.substring(9, 15);
        System.out.println(today);

        String email = "CydeoSchoolJavaProgramming@gmail.com";
        int beginning = email.indexOf("@") + 1;
        int ending = email.lastIndexOf('.');

        String domain = email.substring(beginning, ending);
        System.out.println(domain);

        System.out.println("------------------");

        String sentence1 = "I love Java programming";

        String r1 = sentence1.substring(7,sentence1.length());
        System.out.println(r1);

        String sen7 = "Today is Sunday, Tommorow is Monday";

        String tom = sen7.substring(sen7.lastIndexOf(' ')+1);

        System.out.println(tom);

        System.out.println("-----------------");

        String senten = "I study at Cydeo School";
        String schoolName = senten.substring(senten.indexOf('C'),senten.indexOf('o')+1);

        System.out.println(schoolName);

        System.out.println("-----------------");

        String str = "Python";
        String result = (str + "\n").repeat(5);
        System.out.println(result);





    }
}
