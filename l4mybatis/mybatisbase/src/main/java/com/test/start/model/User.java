package com.test.start.model;

//public class User {
//}


public class User {

    private String id;

    private String accountID;

    private String userName;

    private EnumStatus statusDef; //枚举属性，使用mybatis默认转换类

    private EnumStatus statusOrdinal; //枚举属性，使用EnumOrdinalTypeHandler转换

    private EnumStatus statusCustom; // 枚举属性，自定义枚举转换类

    public String getId() {
        return id;
    }


    public void setId(String id) {
        this.id = id;
    }


    public String getAccountID() {
        return accountID;
    }


    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }


    public String getUserName() {
        return userName;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }


    public EnumStatus getStatusDef() {
        return statusDef;
    }

    public void setStatusDef(EnumStatus statusDef) {
        this.statusDef = statusDef;
    }

    public EnumStatus getStatusOrdinal() {
        return statusOrdinal;
    }

    public void setStatusOrdinal(EnumStatus statusOrdinal) {
        this.statusOrdinal = statusOrdinal;
    }

    public EnumStatus getStatusCustom() {
        return statusCustom;
    }

    public void setStatusCustom(EnumStatus statusCustom) {
        this.statusCustom = statusCustom;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append("id：");
        str.append(id);
        str.append("\n");

        str.append("userName：");
        str.append(userName);
        str.append("\n");

        str.append("statusDef：");
        str.append(statusDef.name());
        str.append("\n");

        str.append("statusOrdinal：");
        str.append(statusOrdinal.name());
        str.append("\n");

        str.append("statusCustom：");
        str.append(statusCustom.name());
        str.append("\n");

        return str.toString();
    }

}
