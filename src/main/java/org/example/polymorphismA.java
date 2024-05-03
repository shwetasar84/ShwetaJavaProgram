package org.example;

//in Java we can achieve polymorphism using ComplieTime or RunTime.

//CompileTeamPolymorphism : below associated with polymorphismA.java
//RunTimePolymorphism : Inheritence class is example of RunTimeploymorphism

public class polymorphismA { //it's method overloading. same method working differently for int and string

    public static void add(String a ,int b){

        System.out.println(a+b);

    }

    public static void add(int a, String b){

        System.out.println(a+b);
    }

    public static void add(String a, String b){
        System.out.println(a+b);
    }

}
