package SIMS;

import SIMS.pojo.Admin;
import SIMS.pojo.BackInfo;
import SIMS.service.LoginService;
import SIMS.service.impl.LoginServiceImpl;
import SIMS.view.GeneralAdmin;
import SIMS.view.Login;
import SIMS.view.LoginFail;
import SIMS.view.SuperAdmin;

import java.util.Scanner;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName Main
 * @Version 1.0
 * @Date 2020/7/3 10:33
 */

//程序运行主界面,主要功能：提供页面跳转，调用业务层处理业务逻辑。
public class Main {

    public static void main(String[] args) {
        //要调用其他类，要先把其他类引入进来！
        LoginService loginService = new LoginServiceImpl();
        
        while (true){
            //展示登录页面，获得账户密码
            Login.showLoginPage();

            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入管理员账号：");
            String account = scanner.nextLine();
            System.out.println("请输入密码：");
            String password = scanner.nextLine();
            Admin loginAdmin = new Admin(account, password);
            
            //封装好登录用户，验证后台是否存在这个用户信息
            BackInfo backInfo = loginService.checkAdmin(loginAdmin);

            //验证用户信息，并跳转相关页面
            if (backInfo.getStatus() == true){
                //登录成功
                //超级管理员
                if ("super".equals(backInfo.getPrevilege())){
                    while (true){
                        SuperAdmin.showSuperAdminPage(account);
                        System.out.println("请选择功能：");
                        String option = scanner.nextLine();
                        switch (option){
                            case "1":
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            case "4":
                                break;
                            case "5":
                                break;
                            case "6":
                                break;
                            case "7":
                                break;
                            case "8":
                                break;
                            case "9":
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("输入错误！请重新输入");
                        }
                    }



                }else if ("general".equals(backInfo.getPrevilege()) || !"super".equals(backInfo.getPrevilege())){

                    while (true){
                        GeneralAdmin.showGeneralAdminPage(account);
                        System.out.println("请选择功能：");
                        String option = scanner.nextLine();
                        switch (option){
                            case "1":
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            case "4":
                                break;
                            case "5":
                                break;
                            case "0":
                                break;
                            default:
                                System.out.println("输入错误！请重新输入");
                        }
                    }


                }
            }else {
                //登录失败
                LoginFail.showLoginFailPage(backInfo.getBacInfo());
            }
        }

    }

}
