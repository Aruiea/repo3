package SIMS.view;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName SuperAdmin
 * @Version 1.0
 * @Date 2020/7/3 14:36
 * 超级管理员页面
 *          1： 修改密码
 *           2： 添加新管理员
 *           3:   删除管理员		                   权限管理(超级、一般)
 *           4： 查看管理员列表
 */
public class SuperAdmin {

    public static void showSuperAdminPage(String account){
        System.out.println("------------------学员信息管理系统：超级管理员"+account+"-------------------------");
        System.out.println("1.修改密码");
        System.out.println("2.添加新管理员");
        System.out.println("3.删除管理员");
        System.out.println("4.查看管理员列表");
        System.out.println("5.查看学生列表");
        System.out.println("6.新增学员");
        System.out.println("7.查看某学员");
        System.out.println("8.修改某学员信息");
        System.out.println("9.删除学员");
        System.out.println("0.退出系统");
    }

}
