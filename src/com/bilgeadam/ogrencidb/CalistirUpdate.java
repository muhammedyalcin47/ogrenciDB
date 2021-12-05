package com.bilgeadam.ogrencidb;

import java.sql.*;

public class CalistirUpdate {
    public static void main(String[] args) throws SQLException {


        Connection conn = null;
        Statement st = null;


        try {
            Class.forName("org.postgresql.Driver");

            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/odb", "postgres", "postgres");

            st = conn.createStatement();

            int sonuc = st.executeUpdate("update ogrenci set ad ='muhammed' where no =3 ");

            if (sonuc>0)
                System.out.println("başarılı");
            else
                System.out.println("başarısız");

        }

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally
        {

            st.close();
            conn.close();

        }


    }
}
