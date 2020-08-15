package entity;

import javax.persistence.Id;

/**
 * @author WH
 * @date 2020/8/12 23:40
 */
public class Test {
    @Id
    private Integer tid;
    private String tname;
    private Integer tel;
    private Integer sex;

    @Override
    public String toString() {
        return "Test{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", tel=" + tel +
                ", sex=" + sex +
                '}';
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
