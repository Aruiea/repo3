package SIMS.service.impl;

import SIMS.pojo.Admin;
import SIMS.pojo.BackInfo;
import SIMS.service.LoginService;
import SIMS.service.SuperAdminService;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName LoginServiceImpl
 * @Version 1.0
 * @Date 2020/7/3 10:45
 */

//登录相关业务：全部功能都在这里实现！！！！！
public class LoginServiceImpl implements LoginService {
    SuperAdminService superAdminService = new SuperAdminServiceImpl();

    //判断用户是否合法,返回一个集合<是否登录成功，登录返回信息！>
    @Override
    public BackInfo checkAdmin(Admin loginAdmin) {
        //用户是否合法需要调用业务层去访问数据  先从数据层返回一个对应账户的admin对象（可能为空）。
        //空代表数据库中没有查到相关管理员信息。
        Admin admin = null;
//                superAdminService.getAdmin(loginAdmin.getAdminAccount());

        //空代表没有这个文件
        if (admin == null){
            return new BackInfo(false,"登录失败，没有这个用户！");
        }

        //初始化返回信息
        Boolean isTrue = false;
        String info = "登录失败！未知错误！";
        BackInfo backInfo= new BackInfo(isTrue,info);
        String previlege = "general";

        if (admin!=null){
            //对象虽然不为空，里面的属性却可能为空。所以管理员的账户不能为空
            if (!"".equals(loginAdmin.getAdminAccount())){
                //账户不为空，进来判断密码，文件数据中的密码可以为空
                if (admin.getAdminPassword()==null){
                    if (loginAdmin.getAdminPassword()==null){
                        backInfo.setStatus(true);
                        backInfo.setBacInfo("你的密码为空，为了安全，请修改你的密码！");
                        //返回权限信息给主界面
                        if (admin.getPrevilege()!=null){
                            previlege = admin.getPrevilege();
                        }
                        backInfo.setPrevilege(previlege);
                    }else {
                        backInfo.setBacInfo("用户名或者密码错误！");
                        backInfo.setStatus(false);
                    }
                }else if(admin.getAdminPassword().equals(loginAdmin.getAdminPassword())){
                        backInfo.setBacInfo("登录成功！");
                        backInfo.setStatus(true);
                        //返回权限信息给主界面
                        if (admin.getPrevilege()!=null){
                            previlege = admin.getPrevilege();
                        }
                        backInfo.setPrevilege(previlege);
                        }else{
                        backInfo.setStatus(false);
                        backInfo.setBacInfo("用户名或者密码错误！");
                     }
            }else {
                backInfo.setStatus(false);
                backInfo.setBacInfo("管理员账户不能为空!");
            }
        }else {
            backInfo.setStatus(false);
            backInfo.setBacInfo("对不起，管理员不存在！");
        }

        //无论成功失败，都返回一个backInfo对象，携带登录是否成功，以及相关消息。
        return backInfo;
    }

}
