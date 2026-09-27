/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.student_app.Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DBConnection {

    public static void main(String args[]) throws Exception {
//       String url="jdbc:mysql://localhost:3306/Practice";
//       Class.forName("com.mysql.cj.jdbc.Driver");
//       Connection con= DriverManager.getConnection(url, "root","pavan@1234");
//       Statement st=con.createStatement();
        Integer age = null;
        String query = """
             create table prts(
             id int,
             name varchar(40),
             city varchar(30),
             age int,
             primary key(id)
             )
             """;
        String create="""
                      create table customer(
                      cust_id int,
                      product varchar(50) not null,
                      prize int not null,
                       FOREIGN KEY (cust_id)
                          REFERENCES prts(id)
                      )
                      """;
        String insertCust="""
                          insert into customer values
                          (
                          1,'hair-oil',50
                          )
                          """;
        String insert = """
              insert into prts values
              (
              5,'Amit Shindhe',
              'amalner',45,
              'male'
              )
              """;
        String sql = "select * from prts";

        String alter = """
             ALTER table prts 
             add column gender 
             varchar(45) default 'male'
             """;
        String update ="""
                       UPDATE prts set name=
                       'sweety girase' where 
                       cust_id=3
                       """;
                
             /* 
             UPDATE prts set 
             gender='female'
             where id >1
            */
        String join="""
                    select * from prts 
                    as p1 
                    join customer as c1
                    on p1.id=c1.cust_id 
                    having p1.id>1
                    """;
        
        String createTable="""
                      create table cust_Info(
                           id int not null,
                           gender varchar(50) nut null,
                           city varchar(50) not null,
                            name varchar(50) ,
                            FOREIGN KEY (cust_id)
                            REFERENCES prts(id)
                           )
                      """;
if(DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice", "root","pavan@1234").createStatement().execute(createTable))
    System.out.print("Tables Selected Success...");

//if(DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice", "root","pavan@1234").createStatement().execute(update))
//    System.out.print("Updated Success...");
//        ResultSet rs = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practice", "root", "pavan@1234").createStatement().executeQuery(join);
//        while (rs.next()) {
////            System.out.println(" Customer id : "+rs.getInt(6)+" , product : "+rs.getString(7)+" , Prize : "+rs.getInt(8));
//            System.out.println("Id : " + rs.getInt(1) + " , " + " Name : " + rs.getString(2) + ", " + " City : " + rs.getString(3) + " , Age : " + rs.getInt(4) + " , Gender : " + rs.getString(5)+" , Customer id : "+rs.getInt(6)+" , product : "+rs.getString(7)+" , Prize : "+rs.getInt(8));
//        }

        /*.hashCode()>0*/
 /*execute("Select * from prts")*/
//if(DriverManager.getConnection(url, "root","pavan@1234").prepareStatement("Insert Into prts values (3,'swati girase','erandol',18)").execute())       
//    System.out.println("Id : "+rs.getInt(1)+" , "+" Name : "+rs.getString(2)+"\n"+" , City : "+rs.getString(3)+" , Age : "+rs.getInt(4));
       }

    }


