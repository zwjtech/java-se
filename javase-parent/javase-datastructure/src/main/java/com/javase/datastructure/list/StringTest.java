package com.javase.datastructure.list;

import com.cloudcare.common.lang.serialize.JSON;
import org.junit.Test;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * Created by zhangWeiJie on 2017/12/21.
 */
public class StringTest {

    @Test
    public void testString(){
        String string1="Hello";
        String string2="Hello";
        System.out.println(string1==string2);
    }

    /**
     * 位补零右移：左操作数的值按右操作数指定的位数右移，移动得到的空位为零填补。
     * 位补零右移：将int型整数的二进制每位向右移动若干位，后面若干位右移出int范围的bit丢弃，前面若干位空出的bit全都补0。正数等同于除2的n次方，负数补零右移后变正数。
     */
    @Test
    public void testWeibulingyouyi(){
        System.out.println(-1>>>1);//2的30次方
//        int divided=2147483647;
//        decimalToBinary(divided);
        decimalToBinary(16);

        System.out.println(2^30);//位异或:两个操作数的某一位不相同时改位为1
        System.out.println(Math.pow(2,30));
        System.out.println(Math.pow(2,3));
    }

    private void decimalToBinary(Integer divided) {
        int i=0;
        Stack<Integer> stack=new Stack();
        do{
            System.out.println(i++);
            Integer mod=divided%2;
            divided=divided/2;
            stack.push(mod);
        }while (divided>0);
        System.out.println(stack.toString());
    }

    @Test
    public void outString(){
        String AliyunECSImageExportRolePolicy="";//null
        String AliyunECSImageExportRolePolicy1=null;
        System.out.println(AliyunECSImageExportRolePolicy);
        System.out.println(AliyunECSImageExportRolePolicy1);
    }

    @Test
    /**
     *  String str=null;
     str=String.format("Hi,%s", "王力");
     System.out.println(str);
     str=String.format("Hi,%s:%s.%s", "王南","王力","王张");
     System.out.println(str);
     System.out.printf("字母a的大写是：%c %n", 'A');
     System.out.printf("3>7的结果是：%b %n", 3>7);
     System.out.printf("100的一半是：%d %n", 100/2);
     System.out.printf("100的16进制数是：%x %n", 100);
     System.out.printf("100的8进制数是：%o %n", 100);
     System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);
     System.out.printf("上面价格的16进制数是：%a %n", 50*0.85);
     System.out.printf("上面价格的指数表示：%e %n", 50*0.85);
     System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50*0.85);
     System.out.printf("上面的折扣是%d%% %n", 85);
     System.out.printf("字母A的散列码是：%h %n", 'A');
     */
    public void strFormat(){
        String assumeRolePolicyDocument="{\n" +
                "\"Statement\": [\n" +
                " {\n" +
                "   \"Action\": \"sts:AssumeRole\",\n" +
                "   \"Effect\": \"Allow\",\n" +
                "   \"Principal\": {\n" +
                "     \"Service\": [\n" +
                "       \"ecs.aliyuncs.com\"\n" +
                "     ],\n" +
                "\"RAM\": [\n" +
                "      \"acs:ram::%s:root\"\n" +
                "    ]"+
                "   }\n" +
                " }\n" +
                "],\n" +
                "\"Version\": \"1\"\n" +
                "}";
        String str=String.format(assumeRolePolicyDocument,"123456789012345678");
        System.out.println(assumeRolePolicyDocument);
        System.out.println(str);
    }

    public String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

    @Test
    public void testDeleteBlank() {
        String str = "{\n" +
                "\"Statement\": [\n" +
                " {\n" +
                "   \"Action\": \"sts:AssumeRole\",\n" +
                "   \"Effect\": \"Allow\",\n" +
                "   \"Principal\": {\n" +
                "     \"Service\": [\n" +
                "       \"ecs.aliyuncs.com\"\n" +
                "     ],\n" +
                "     \"RAM\": [\n" +
                "      \"acs:ram::123456789:root\"\n" +
                "    ]\n" +
                "   }\n" +
                " }\n" +
                "],\n" +
                "\"Version\": \"1\"\n" +
                "}";
        System.out.println(replaceBlank(str));
    }

    @Test
    public void stringToObj() {
        String str1 = "    {\n" +
                "      \"Statement\": [\n" +
                "        {\n" +
                "          \"Action\": \"ecs:*\",\n" +
                "          \"Effect\": \"Allow\",\n" +
                "          \"Resource\": [\n" +
                "                      \"acs:ecs:*:*:instance/i-001\",\n" +
                "                      \"acs:ecs:*:*:instance/i-002\"\n" +
                "                      ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"Action\": \"ecs:Describe*\",\n" +
                "          \"Effect\": \"Allow\",\n" +
                "          \"Resource\": \"*\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"Version\": \"1\"\n" +
                "    }";
        String str2 = "    {\n" +
                "      \"Statement\": [\n" +
                "        {\n" +
                "          \"Action\": \"ecs:*\",\n" +
                "          \"Effect\": \"Allow\",\n" +
                "          \"Resource\": [\n" +
                "                      \"acs:ecs:*:*:instance/i-001\",\n" +
                "                      \"acs:ecs:*:*:instance/i-002\"\n" +
                "                      ]\n" +
                "        },\n" +
                "        {\n" +
                "          \"Action\": \"ecs:Describe*\",\n" +
                "          \"Effect\": \"Allow\",\n" +
                "          \"Resource\": \"*\"\n" +
                "        }\n" +
                "      ],\n" +
                "      \"Version\": \"1\"\n" +
                "    }";


        List<Map<String, String>> list1 = (List<Map<String, String>>) JSON.toBean(str1, HashMap.class).get("Statement");
        List<Map<String, String>> list2 = (List<Map<String, String>>) JSON.toBean(str2, HashMap.class).get("Statement");
        list1.addAll(list2);
        System.out.println(JSON.toString(list1));

        List<String> stringList = new ArrayList<String>();
        stringList.add(str1);
        stringList.add(str2);

        String rolePolicyDocumentStr = "{\"Statement\":[],\"Version\": \"1\"}";
        Map<String, List> rolePolicyDocumentMap = JSON.toBean(rolePolicyDocumentStr, HashMap.class);
//        List<Map<String, String>> statementList = new ArrayList<>();
//        stringList.forEach(str -> {
//            List<Map<String, String>> list = (List<Map<String, String>>) JSON.toBean(str, HashMap.class).get("Statement");
//            statementList.addAll(list);
//        });
//        rolePolicyDocumentMap.put("Statement", statementList);
//        rolePolicyDocumentStr = JSON.toString(rolePolicyDocumentMap);
//        System.out.println(rolePolicyDocumentStr);
    }

    @Test
    public void testGetRam(){
        String str="{\"Statement\":[{\"Action\":\"sts:AssumeRole\",\"Effect\":\"Allow\",\"Principal\":{\"Service\":[\"ecs.aliyuncs.com\"],\"RAM\":[\"acs:ram::123456789:root\"]}}],\"Version\":\"1\"}";
        Map<String,List> policyMapList=JSON.toBean(str,HashMap.class);
        List statementList=policyMapList.get("Statement");
        HashMap stateMap = (HashMap) statementList.get(0);
        HashMap pricipalMap = (HashMap) stateMap.get("Principal");
        List ramList = (List) pricipalMap.get("RAM");
        String ramStr = (String) ramList.get(0);
        boolean b=ramStr.contains("12345789");
        System.out.println(b);
        //一条写不了

    }
}
