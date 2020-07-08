package SIMS.service;

import SIMS.pojo.Admin;
import SIMS.pojo.BackInfo;

import java.util.HashMap;

//登录相关业务接口
public interface LoginService {

    //判断用户是否合法,返回一个集合。既返回是否登录成功，也携带相关成功或者错误信息！
    BackInfo checkAdmin(Admin loginAdmin);

}
