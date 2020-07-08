package SIMS.service;

import SIMS.pojo.Admin;
import SIMS.pojo.Student;

import java.util.Collection;

public interface SuperAdminService extends GeneralAdminService{

    //修改密码
    boolean alterPassword(Admin admin);

    //添加新管理员
    boolean addNewAdmin(Admin admin);

    //删除管理员
    boolean deleteAdmin(String account);

    //查看管理员列表
    Collection getAllAdmin();

}
