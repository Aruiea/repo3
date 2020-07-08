package SIMS;

import SIMS.pojo.Admin;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName MyTest
 * @Version 1.0
 * @Date 2020/7/3 11:00
 */
public class MyTest {

    public static void main(String[] args) {
        //static方法中调用静态方法会一直调用


        //1.是否可以传递值为空的对象？可以！
        Admin admin = null;
       Admin admin2 = getAdmin();

        if (admin!=null){

        }else {
            System.out.println("可以传递值为null的对象！");
        }

        //2.可以判断两个null值对象相等吗？
        if (admin == admin2){
            System.out.println("可以比较两个null值对象");
        }

        //3.对象为空，不能通过Null对象获得里面的值，或报空指针异常！
//        if (admin.getAdminAccount().equals(null)){
//            System.out.println("可以用equals比较两个null的字符串");
//        }

        //4.什么东西可以同时存储两种不同的数据类型？最好通过下标能取出这两个元素。类！

        //5.如果文件没有内容的话，ObjectInputStream oos = new 的时候会不会报错？会
        //6.如果在readObject()的时候捕获异常，有用嘛？没用。要在new的时候就处理EOF。
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("D:/SIMS/admin.dat"));
            try {
                Object object = ois.readObject();
            }catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch (EOFException e){
            System.out.println("外层捕获了EOF异常");
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    static Admin getAdmin(){
        return null;
    }

}
