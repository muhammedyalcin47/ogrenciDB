package com.bilgeadam.ogrencidb;

import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CalistirInsert {
    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/odb","postgres","postgres");

            Statement st = conn.createStatement();


            int sonuc = st.executeUpdate("insert into ogrenci(ad, soyad) values('Bora','Yüret')");

            if(sonuc>0)
                System.out.println("Başarıyla insert edildi.");
            else
                System.out.println("İnsert edilemedi!");




            st.close();
            conn.close();

        }
        catch (Exception e){
            System.err.println("Hata:" + e.getMessage());
        }


    }
}
