package SIMS.view;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName GeneralAdmin
 * @Version 1.0
 * @Date 2020/7/3 14:36
 * 普通管理员页面
 *           5： 查看学生列表
 *           6： 新增学员
 *           7： 查看某学员
 *           8:   修改某学员信息
 *           9： 删除学员
 */
public class GeneralAdmin {

    public static void showGeneralAdminPage(String account){
        System.out.println("------------------学员信息管理系统：普通管理员"+account+"-------------------------");
        System.out.println("1.查看学生列表");
        System.out.println("2.新增学员");
        System.out.println("3.查看某学员");
        System.out.println("4.修改某学员信息");
        System.out.println("5.删除学员");
        System.out.println("0.退出系统");
    }

}
