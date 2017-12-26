package com.javase.datastructure.list;

import com.javase.datastructure.list.inner.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    public void testList(){
        List list=new ArrayList();
    }

    @Test
    public void testRemove1(){
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Person("zwj1","张1"));
        personList.add(new Person("zwj2","张2"));
        Boolean b=personList.remove(new Person("zwj1","张1"));//没有移除成功o
        System.out.println(personList);
    }

    @Test
    public void testRemove2(){
        List<Person> personList=new ArrayList<Person>();
        Person p1=new Person("zwj1","张1");
        personList.add(p1);
        Person p2=new Person("zwj2","张2");
        personList.add(p2);
        Boolean b=personList.remove(p1);//移除成功o
        System.out.println(b+","+personList);
    }
}
