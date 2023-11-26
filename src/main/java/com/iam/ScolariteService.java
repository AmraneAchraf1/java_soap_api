package com.iam;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.ws.rs.POST;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@WebService(serviceName = "ScolariteService")
public class ScolariteService {

    MySqlConction db = new MySqlConction();

    @WebMethod(operationName = "options")
    public void options() {
        // This method is empty. It's just used to handle OPTIONS requests.
    }

    @WebMethod(operationName = "addEtudiant")
    @POST
    
    public boolean addEtudiant(@WebParam(name = "nom") String nom, @WebParam(name = "prenom") String prenom,
            @WebParam(name = "dateNaissance") String dateNaissance, @WebParam(name = "filiere") String filiere) {

        try {
            db.connect();
            System.out.println(db.getDbName());
            db.add(nom, prenom, dateNaissance, filiere);
            db.disconnect();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

    }

    @WebMethod(operationName = "getEtudiant")
    public Student getEtudiant(@WebParam(name = "id") int id) {

        try {
            db.connect();
            ResultSet data = db.getById(id);

            Student student = new Student();
            while (data.next()) {
                student.setId(data.getInt("id"));
                student.setNom(data.getString("nom"));
                student.setPrenom(data.getString("prenom"));
                student.setDateNaissance(new SimpleDateFormat("yyyy-MM-dd").parse(data.getString("dateNaissance")));
                student.setFiliere(Filiere.valueOf(data.getString("filiere")));
            }
            db.disconnect();
            return student;

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    @WebMethod(operationName = "getEtudiants")
    public List<Student> getEtudiants() {
        try {
            db.connect();
            ResultSet data = db.getAll();
            List<Student> students = new ArrayList<Student>();
            while (data.next()) {
                Student student = new Student();
                student.setId(data.getInt("id"));
                student.setNom(data.getString("nom"));
                student.setPrenom(data.getString("prenom"));
                student.setDateNaissance(new SimpleDateFormat("yyyy-MM-dd").parse(data.getString("dateNaissance")));
                student.setFiliere(Filiere.valueOf(data.getString("filiere")));
                students.add(student);
            }
            db.disconnect();
            return students;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    // delete data from etudiants table by id
    @WebMethod(operationName = "deleteEtudiant")
    public boolean deleteEtudiant(@WebParam(name = "id") int id) {
        try {
            db.connect();
            db.deleteById(id);
            db.disconnect();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    // update data from etudiants table by id
    @WebMethod(operationName = "updateEtudiant")
    public boolean updateEtudiant(@WebParam(name = "id") int id, @WebParam(name = "nom") String nom,
            @WebParam(name = "prenom") String prenom, @WebParam(name = "dateNaissance") String dateNaissance,
            @WebParam(name = "filiere") String filiere) {

        try {
            db.connect();
            db.updateById(id, nom, prenom, dateNaissance, filiere);
            db.disconnect();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

}
