package SIMS.service.impl;

import SIMS.pojo.Admin;
import SIMS.pojo.Student;
import SIMS.service.GeneralAdminService;

import java.util.Collection;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName GeneralAdminServiceImpl
 * @Version 1.0
 * @Date 2020/7/3 16:36
 */
public class GeneralAdminServiceImpl implements GeneralAdminService {
    @Override
    public Collection getAllStudent() {
        return null;
    }

    @Override
    public boolean addStudent(Student student) {
        return false;
    }

    @Override
    public Student getStudent(String id) {
        return null;
    }

    @Override
    public boolean alterStudent(Admin admin) {
        return false;
    }

    @Override
    public boolean deleteStudent(String account) {
        return false;
    }

    @Override
    public void exitSystem() {
        System.exit(0);
    }
}
