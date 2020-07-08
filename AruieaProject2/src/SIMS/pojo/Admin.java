package SIMS.pojo;

import java.io.Serializable;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName Admin
 * @Version 1.0
 * @Date 2020/7/3 10:39
 */

//管理员实体类
public class Admin implements Serializable {
    private static final long serialVersionUID = -8480702402975016744L;
    private String AdminAccount;
    private String AdminPassword;
    private String previlege = "general";

    public Admin(String adminAccount, String adminPassword) {
        AdminAccount = adminAccount;
        AdminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "AdminAccount='" + AdminAccount + '\'' +
                ", AdminPassword='" + AdminPassword + '\'' +
                ", previlege='" + previlege + '\'' +
                '}';
    }

    public String getAdminAccount() {
        return AdminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        AdminAccount = adminAccount;
    }

    public String getAdminPassword() {
        return AdminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        AdminPassword = adminPassword;
    }

    public String getPrevilege() {
        return previlege;
    }

    public void setPrevilege(String previlege) {
        this.previlege = previlege;
    }

    public Admin() {
    }

    public Admin(String adminAccount, String adminPassword, String previlege) {
        AdminAccount = adminAccount;
        AdminPassword = adminPassword;
        this.previlege = previlege;
    }
}
