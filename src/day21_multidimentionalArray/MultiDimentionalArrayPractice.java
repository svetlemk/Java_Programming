package day21_multidimentionalArray;

import java.util.Arrays;

public class MultiDimentionalArrayPractice {

    public static void main(String[] args) {

        String[] group1 ={"Alex", "John", "Sammy", "Shakira"}; // 4 names
        String[] group2 ={"Chris", "Jennifer", "Ella"}; // 3 names
        String[] group3 ={"Lana", "Ben", "Liam", "Tommy","Cyndi"};// 5 names
        String[] group4 ={"Utamma","Cherry"}; // 2 names

        String[][] groups = {group1,group2,group3,group4};

        for (String[] eachGroup : groups) {
            
            System.out.println(Arrays.toString(eachGroup));
            for (String eachStudent : eachGroup) {
                
                System.out.println(eachStudent);

            }

            }

        System.out.println("--------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {

            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(eachGroup));

            for (String student : eachGroup) {
                System.out.println(student);

            }

            System.out.println(Arrays.deepToString(groups));

            //[[Alex, John, Sammy, Shakira], [Chris, Jennifer, Ella], [Lana, Ben, Liam, Tommy, Cyndi], [Utamma, Cherry]]


            
        }
        
        
        
        
        

        }



    }

