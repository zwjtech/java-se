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
    public void testRemove(){
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Person("zwj1","张1"));
        personList.add(new Person("zwj2","张2"));
        Boolean b=personList.remove(new Person("zwj1","张1"));//没有移除成功o
        System.out.println(personList);
    }
}
