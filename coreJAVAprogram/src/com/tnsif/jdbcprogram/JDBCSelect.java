package com.tnsif.jdbcprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// Demo for JDBC Program

public class JDBCSelect {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Step 1: Load and Register Driver
        Class.forName("org.postgresql.Driver");
        System.out.println("Step 1: Driver Loaded Successfully");

        // Step 2: Establish Connection
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/AtriaCG07",
                "postgres",
                "$Aamina@2k4$"   // Replace with your PostgreSQL password if different
        );

        System.out.println("Step 2: Connection Established Successfully");

        // Step 3: Create Statement
        Statement st = conn.createStatement();
        System.out.println("Step 3: Statement Created");

        // Step 4: Execute SELECT Query
        String strSelect = "SELECT sid, sname, semail, sbranch FROM student";

        System.out.println("\nExecuting Query:");
        System.out.println(strSelect);

        ResultSet rs = st.executeQuery(strSelect);

        System.out.println("\nStudent Records");
        System.out.println("----------------------------------------------");

        int rowCount = 0;

        while (rs.next()) {

            int sid = rs.getInt("sid");
            String sname = rs.getString("sname");
            String semail = rs.getString("semail");
            String sbranch = rs.getString("sbranch");

            System.out.println(sid + "   " + sname + "   " + semail + "   " + sbranch);

            rowCount++;
        }

        System.out.println("----------------------------------------------");
        System.out.println("Total Records = " + rowCount);

        // Step 5: Execute INSERT Query
        String sqlInsert =
                "INSERT INTO student (sid, sname, semail, sbranch) VALUES (6, 'fiza', 'fiza@345', 'ECE')";

        int countInserted = st.executeUpdate(sqlInsert);

        System.out.println("\nRows Inserted = " + countInserted);

        // Step 6: Close Resources
        rs.close();
        st.close();
        conn.close();

        System.out.println("\nConnection Closed Successfully");
    }
}