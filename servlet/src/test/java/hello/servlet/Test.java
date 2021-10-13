package hello.servlet;


import org.springframework.aop.scope.ScopedProxyUtils;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static class Member {
       public int id;
       public int age;

       public Member(int id, int age){
           this.id = id;
           this.age = age;
       }
    }

    @org.junit.jupiter.api.Test
    public void test1(){
        ArrayList <Integer> l = new ArrayList<Integer>();
        ArrayList <Member> l2 = new ArrayList<>();
        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<10; i++){
            l.add(i);
            m.put(i,99);
            l2.add(new Member(i,26));
        }
        Map<Integer, Integer> f = m;
        for(int i=0; i<10; i++){
            Integer tmp = l.get(i);
            tmp = 11;
        }
        Member mem = l2.get(3);
        mem.age = 99;
//        tmp2.
//        f.put(3,100);

//        for(Integer a : m.values()){
//            System.out.println(a);
//        }
        for(Member a : l2){
            System.out.println(a.id);
            System.out.println(a.age);
        }
    }
}
