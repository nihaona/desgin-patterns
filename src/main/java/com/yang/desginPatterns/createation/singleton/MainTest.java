package com.yang.desginPatterns.createation.singleton;

public class MainTest {
    public static void main(String[] args) {
       Person person1 = Person.boss();
       Person person2 = Person.boss();

        System.out.println(person1 == person2);

    }
}
