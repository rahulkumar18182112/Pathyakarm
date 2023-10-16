package com.example.schoolproject.Response;

public class Reslt {

    String auth,uid,schoolName,userName,roleName;

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Reslt(String auth, String uid, String schoolName, String userName, String roleName) {
        this.auth = auth;
        this.uid = uid;
        this.schoolName = schoolName;
        this.userName = userName;
        this.roleName = roleName;
    }
}
