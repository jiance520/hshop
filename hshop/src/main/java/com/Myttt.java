package com;

import com.util.JdbcUtil;

public class Myttt {
    public static void main(String[] args) {
        JdbcUtil jdbcUtil = new JdbcUtil("oracle.jdbc.driver.OracleDriver","jdbc:oracle:thin:@106.13.100.117:1521:helowin","qshop","qshop");
        String sql = "select * from ADVERT where AID = 102";
        Object object = jdbcUtil.exectueQuery2(sql);
        System.out.println("-----object:"+object.toString());
    }
}
