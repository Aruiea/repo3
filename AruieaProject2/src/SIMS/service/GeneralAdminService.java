package SIMS.service;

import SIMS.pojo.Admin;
import SIMS.pojo.Student;

import java.util.Collection;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName GeneralAdminSerive
 * @Version 1.0
 * @Date 2020/7/3 16:34
 */
public interface GeneralAdminService {

    //查看学生列表
    Collection getAllStudent();

    //新增学员
    boolean addStudent(Student student);

    //查看某学员
    Student getStudent(String id);

    //修改某学员信息
    boolean alterStudent(Admin admin);

    //删除学员
    boolean deleteStudent(String account);

    //退出系统
    void exitSystem();

}
