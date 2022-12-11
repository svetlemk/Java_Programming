package day10_string;

import java.util.Scanner;

import java.lang.System;// implicitly(done by JVM or the tool) imported
import java.lang.String; //explicitly/ automatically imported
//explicit - done by a programmer. manually

public class StringIntro {
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        String s1 = "Cat";
        String s2 = "Cat";

        String s3 = "Cat";
        String s4 = "Cat";

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

        System.out.println("----------------");

        String str1 = new String("Java");// Created two objects 1. in the String pool 2. outside the pool
        String str2 = new String("Java");

        System.out.println(str1 == str2);// they are two different objects

        System.out.println("----------------");

        String t1 = "Python";
        String t2 = new String("Python");// one object
        String t3 = new String("Python");// another object

        System.out.println(t1 == t2);//false NOT the same objects
        System.out.println( t3 == t2);



    }
}
