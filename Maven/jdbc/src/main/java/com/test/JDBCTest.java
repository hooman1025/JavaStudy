package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Member {

    private String userid;
    private String username;
    private int age;

    Member(String userid, String username, int age) {

        this.userid = userid;
        this.username = username;
        this.age = age;

    }

    static class Builder {

        private String userid;
        private String username;
        private int age;

        public Builder userid(String userid) {
            this.userid = userid;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Member build() {
            if(userid == null || username == null || age == 0)
                throw new IllegalStateException("멤버클래스가 생성이 안됩니다.");
            return new Member(userid, username, age);
        }
    } //Builder class의 끝

    public String getUserid() {return userid;}
    public String getUsernname() {return username;}
    public int getAge() {return age;}
}

class MemberDTO {

    private String userid;
    private String username;
    private int age;

    public String getUserid() {return userid;}
    public String getUsernname() {return username;}
    public int getAge() {return age;}

    MemberDTO(Member member) {
        this.userid = member.getUserid();
        this.username = member.getUsernname();
        this.age = member.getAge();
    }
}



public class JDBCTest {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        String url = "jdbc:mariadb://127.0.0.1:3306/webdev";
        String userid = "webmaster";
        String userpw = "root";
        String query = "select userid, username, age from tbl_test";


        Connection con;
        Statement stmt;
        ResultSet rs;

        Class.forName("org.mariadb.jdbc.Driver");
        con = DriverManager.getConnection(url, userid, userpw);
        stmt = con.createStatement();
        rs = stmt.executeQuery(query);

        List<Member> list = new ArrayList<>();
        List<Object> listDTO = new ArrayList<>();

        while(rs.next()){
            //list.add(new Member(rs.getString("userid"), rs.getString("username"), rs.getInt("age")));
            list.add(new Member.Builder()
                    .userid(rs.getString("userid"))
                    .username(rs.getString("username"))
                    .age(rs.getInt("age"))
                    .build()
            );
            
            
        }

        // for(Member member: list) {
        //     System.out.println("아이디 = " + member.getUserid()
        //                      + ", 이름 = " + member.getUsernname()
        //                      + ", 나이 = " + member.getAge());


        // }

        List<Object> listDTO = list.stream().map(MemberDTO::new).collect(Collectors.toList());
        
        for(Object member: listDTO) {
            System.out.println("아이디 = " + ((Member) member).getUserid()
                             + ", 이름 = " + ((Member) member).getUsernname()
                             + ", 나이 = " + ((Member) member).getAge());

        }

        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(con != null) con.close();
    }
}
