/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CNPM;
import java.sql.*;
public class connectDB {
//    public static void main(String[] args) {
//        Connection conn=null;
//        Statement st= null;
//        ResultSet rs= null;
//        try{
//        String dbURL ="jdbc:mysql://localhost:3307/mysql-db";
//        String username="root";
//        String password="";
//        conn=DriverManager.getConnection(dbURL,username,password);
//        if(conn!=null){
//            System.out.println("Kết nối thành công");
//        }String sql="select * from user";
//        st=conn.createStatement();
//        rs=st.executeQuery(sql);
//        if(rs.isBeforeFirst()==false){
//            System.out.println("Bảng không có dữ liệu!");
//            return;
//        }while(rs.next()){
//            System.out.println(rs.getString(1));
//            System.out.println(rs.getString(2));
//            System.out.println(rs.getString(3));
//        }
//        String sqlInsert = "INSERT INTO `user`(`ID`, `userName`, `passwd`) VALUES ('3','son','1804')";
//        st.executeUpdate(sqlInsert);
//        String sqlUPDATE ="UPDATE `user` SET `passwd`='2001' WHERE ID=3";
//        st.executeUpdate(sqlUPDATE);
//        String sqlDelete="DELETE FROM `user` WHERE ID=3";
//        st.executeUpdate(sqlDelete);
//        }catch(SQLException e){
//            e.printStackTrace();
//    }
//        }

}
