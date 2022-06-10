package asia.lml.domain;

import java.sql.Time;

public class person {
    private int uid;
    private String uname;
    private Time regtime;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Time getRegtime() {
        return regtime;
    }

    public void setRegtime(Time regtime) {
        this.regtime = regtime;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", time=" + regtime +
                '}';
    }
}
