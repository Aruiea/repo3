package SIMS.dao;
import SIMS.pojo.Admin;
import SIMS.pojo.Student;

import java.io.*;
import java.util.HashMap;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName DataBase
 * @Version 1.0
 * @Date 2020/7/3 13:52
 * 数据库以及对数据进行的操作
 */
public class DataBase {

    static final String ADMIN_URI = "D:/SIMS/admin.dat";
    static final String STUDENT_URI = "D:/SIMS/student.dat";

    //访问数据库之前的初始化判断！
    static {
        //创建默认的文件夹和文件(如果不存在)
        File file = new File(ADMIN_URI);
        File file2 = new File(STUDENT_URI);
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        if (!file2.getParentFile().exists()){
            file2.getParentFile().mkdirs();
        }
        try {
            file.createNewFile();
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //判断文件中是否有内容。
        // 如果有内容，就一定要存在一个超级管理员admin。
        //没有内容，就一定要添加初始化内容

        //先判断管理员文件
        //1.先读取文件，初始化文件内容。
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(ADMIN_URI));
            try {
                //2.尝试读取文件
                Object object = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch (EOFException e){
            //2.文件中如果没有内容，先存入空的文件。
            HashMap<String, Admin> stringAdminHashMap = new HashMap<>();
            writeFileAdmin(stringAdminHashMap);
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

        //判断学生的文件
        try {
            ois = new ObjectInputStream(new FileInputStream(STUDENT_URI));
            try {
                //2.尝试读取文件
                Object object = ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch (EOFException e){
            //2.文件中如果没有内容，先存入空的文件。
            HashMap<String, Student> stringStudentHashMap = new HashMap<>();
            writeFileStudent(stringStudentHashMap);
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

        //3.判断文件内容是否存在admin超级管理员，不存在就添加admin
        HashMap<String, Admin> AdminHashMap = readFileAdmin();
        //添加超级管理员
        if (!AdminHashMap.containsKey("admin") || !"super".equals(AdminHashMap.get("admin").getPrevilege())){
            AdminHashMap.put("admin",new Admin("admin","admin","super"));
            writeFileAdmin(AdminHashMap);
        }

    }

    //从数据库admin.dat中得到所有管理员信息
    static HashMap<String, Admin> readFileAdmin(){
        ObjectInputStream ois = null;
        HashMap<String,Admin> stringAdminHashMap = new HashMap<>();

        try {
            ois = new ObjectInputStream(new FileInputStream(ADMIN_URI));
            try {
                stringAdminHashMap = (HashMap<String, Admin>) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            System.out.println("文件读取失败，文件可能已经丢失或者顺坏！");
            e.printStackTrace();
        }finally{
            if (ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return stringAdminHashMap;
    }

    //往数据库admin.dat中写入内容
    static boolean writeFileAdmin(HashMap<String,Admin> contentAdmin){
        ObjectOutputStream oos =null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(ADMIN_URI));
            oos.writeObject(contentAdmin);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    //从数据库student.dat中得到所有学员信息
    static HashMap<String, Student> readFileStudent(){
        ObjectInputStream ois = null;
        HashMap<String,Student> studentList = new HashMap<>();

        try {
            ois = new ObjectInputStream(new FileInputStream(STUDENT_URI));
            try {
                studentList = (HashMap<String, Student>) ois.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (ois!=null){
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return studentList;
    }

    //往数据库student.dat中写入内容
    static boolean writeFileStudent(HashMap<String,Student> contentStudent){
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(STUDENT_URI));
            objectOutputStream.writeObject(contentStudent);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally {
            try {
                if (objectOutputStream!=null){
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }

}
