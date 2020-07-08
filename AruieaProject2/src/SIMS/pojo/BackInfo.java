package SIMS.pojo;

/**
 * instruction of project
 *
 * @author Aruiea.com
 * @ClassName BackInfo
 * @Version 1.0
 * @Date 2020/7/3 11:38
 */

//登录验证的返回信息
public class BackInfo {
    private Boolean status;
    private String bacInfo;
    private String previlege;

    public BackInfo(Boolean status, String bacInfo) {
        this.status = status;
        this.bacInfo = bacInfo;
    }

    public BackInfo(Boolean status, String bacInfo, String previlege) {
        this.status = status;
        this.bacInfo = bacInfo;
        this.previlege = previlege;
    }

    @Override
    public String toString() {
        return "BackInfo{" +
                "status=" + status +
                ", bacInfo='" + bacInfo + '\'' +
                ", previlege='" + previlege + '\'' +
                '}';
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getBacInfo() {
        return bacInfo;
    }

    public void setBacInfo(String bacInfo) {
        this.bacInfo = bacInfo;
    }

    public String getPrevilege() {
        return previlege;
    }

    public void setPrevilege(String previlege) {
        this.previlege = previlege;
    }

    public BackInfo() {
    }
}
