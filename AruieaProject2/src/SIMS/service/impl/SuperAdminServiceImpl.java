package SIMS.service.impl;

import SIMS.pojo.Admin;
import SIMS.pojo.Student;
import SIMS.service.SuperAdminService;

import java.util.Collection;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName SuperAdminServiceImpl
 * @Version 1.0
 * @Date 2020/7/3 16:35
 */
public class SuperAdminServiceImpl implements SuperAdminService {


    @Override
    public boolean alterPassword(Admin admin) {
        return false;
    }

    @Override
    public boolean addNewAdmin(Admin admin) {
        return false;
    }

    @Override
    public boolean deleteAdmin(String account) {
        return false;
    }

    @Override
    public Collection getAllAdmin() {
        return null;
    }

    @Override
    public Collection getAllStudent() {
        return new GeneralAdminServiceImpl().getAllStudent();
    }

    @Override
    public boolean addStudent(Student student) {
        return new GeneralAdminServiceImpl().addStudent(student);
    }

    @Override
    public Student getStudent(String id) {
        return new GeneralAdminServiceImpl().getStudent(id);
    }

    @Override
    public boolean alterStudent(Admin admin) {
        return new GeneralAdminServiceImpl().alterStudent(admin);
    }

    @Override
    public boolean deleteStudent(String account) {
        return new GeneralAdminServiceImpl().deleteStudent(account);
    }

    @Override
    public void exitSystem() {
        new GeneralAdminServiceImpl().exitSystem();
    }
}
