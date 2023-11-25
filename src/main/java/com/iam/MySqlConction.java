package com.iam;

import java.sql.*;
import java.lang.Class;



public class MySqlConction {

    
    protected String dbName = "scolarite";
    protected String tableName = "etudiants";
    protected String dbHost = "localhost";
    protected String dbPort = "3306";
    protected String db = "mysql";
    protected String username = "root";
    protected String password = "";
    protected static Connection DB = null;


    // Conection
    public void connect() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DB = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName, username, password);
        } catch (Exception e) {
            throw e;
        }
    }

    // Disconect
    public void disconnect() throws Exception {
        try {
            if (DB != null) {
                DB.close();
            }
        } catch (Exception e) {
            throw e;
        }
    }

    
    public String getDbName() {
        return dbName;
    }

    public String getTableName() {
        return tableName;
    }
    
    public String getDbHost() {
        return dbHost;
    }

    public String getDbPort() {
        return dbPort;
    }

    public String getDb() {
        return db;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static Connection getDB() {
        return DB;
    }

    // Add data to etudiants table (nom, prenom, dateNaissance, filiere)
    public void add(String nom, String prenom , String dateNaissance, String  filiere) throws Exception {
        try {
            String sql = "INSERT INTO " + tableName + " (nom, prenom, dateNaissance, filiere) VALUES ('" + nom + "', '" + prenom + "', '" + dateNaissance + "', '" + filiere + "')";
            Statement stmt = DB.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    // Get all data from etudiants table
    public ResultSet getAll() throws Exception {
        try {
            String sql = "SELECT * FROM " + tableName;
            Statement stmt = DB.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            throw e;
        }
    }

    // Get data from etudiants table by id
    public ResultSet getById( int id) throws Exception {
        try {
            String sql = "SELECT * FROM " + tableName + " WHERE id = " + id;
            Statement stmt = DB.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception e) {
            throw e;
        }
    }

    // Delete data from etudiants table by id
    public void deleteById( int id) throws Exception {
        try {
            String sql = "DELETE FROM " + tableName + " WHERE id = " + id;
            Statement stmt = DB.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    // Update data from etudiants table by id
    public void updateById( int id, String nom, String prenom , String dateNaissance, String  filiere) throws Exception {
        try {
            String sql = "UPDATE " + tableName + " SET nom = '" + nom + "', prenom = '" + prenom + "', dateNaissance = '" + dateNaissance + "', filiere = '" + filiere + "' WHERE id = " + id;
            Statement stmt = DB.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    



}
