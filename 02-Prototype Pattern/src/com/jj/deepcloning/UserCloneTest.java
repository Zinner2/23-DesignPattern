package com.jj.deepcloning;


import java.io.*;

/**
 * @author 张俊杰
 * @date 2021/9/20  - {TIME}
 */
public class UserCloneTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Citation citation = new Citation();

        User user1 = new User();
        user1.setUsername("jj");
        user1.setPassword("123456");
        citation.setUser(user1);
        System.out.println("citation="+citation);
        System.out.println("================================================================");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://a.txt"));
        oos.writeObject(citation);
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://a.txt"));
        Citation citation1 = (Citation) ois.readObject();
        User user2 = citation1.getUser();
        user2.setUsername("ww");
        ois.close();

        System.out.println("================================================================");
        System.out.println(citation);
        System.out.println(citation1);
        System.out.println("citation.hashCode="+citation.hashCode());
        System.out.println("citation1.hashCode="+citation1.hashCode());
        System.out.println("================================================================");
        System.out.println("user1.hashCode="+user1.hashCode());
        System.out.println("user2.hashCode="+user2.hashCode());
    }
}
