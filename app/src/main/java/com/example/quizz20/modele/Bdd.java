package com.example.quizz20.modele;

import android.os.AsyncTask;
import android.util.Log;

import java.sql.*;


public class Bdd extends AsyncTask<String, Void, String> {

    String res;
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    private ResultSetMetaData rsmd = null;

    @Override
    protected String doInBackground(String... strings) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://10.0.2.2:3306/quizz", "root","root");
            String result = "Database Connection Successful\n";
            Log.d("BDD", "doInBackground: Connection Reussite");
            st = con.createStatement();
            rs = st.executeQuery("select question from quizz.question");
            rsmd = rs.getMetaData();

            while (rs.next()){
                result += rs.getString(1).toString()+"\n";
            }
            res = result;
            Log.d("BDD", "doInBackground: "+res);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ignored) { } // ignore

                rs = null;
            }

            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ignored) { } // ignore

                st = null;
            }
        }

        return res;
    }
}
