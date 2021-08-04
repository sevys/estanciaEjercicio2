package sample.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class traerDatos {

    private IntegerProperty idPersona;
    private StringProperty name;
    private StringProperty age;
    private StringProperty score;

    //constructor
    public traerDatos(int idPersona, String name, String age, String score) {
        this.idPersona = new SimpleIntegerProperty(idPersona);
        this.name = new SimpleStringProperty(name);
        this.age = new SimpleStringProperty(age);
        this.score = new SimpleStringProperty(score);
    }

    public int getIdPersona() {
        return idPersona.get();
    }

    public IntegerProperty idPersonaProperty() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = new SimpleIntegerProperty(idPersona);
    }

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public String getAge() {
        return age.get();
    }

    public StringProperty ageProperty() {
        return age;
    }

    public void setAge(String age) {
        this.age = new SimpleStringProperty(age);
    }

    public String getScore() {
        return score.get();
    }

    public StringProperty scoreProperty() {
        return score;
    }

    public void setScore(String score) {
        this.score = new SimpleStringProperty(score);
    }

 /*   public static void llenarinformacionUsuarios(Connection connection, ObservableList<Usuarios> lista){
        try {
            Statement instruccion = connection.createStatement();
            ResultSet resultado = instruccion.executeQuery(
                    "SELECT idUsuarios, nombre, apep, apem, cuenta, contra, tipo  FROM bdusuarios.usuarios"
            );
            while(resultado.next()){
                lista.add(
                        new traerDatos(
                                resultado.getInt("idUsuarios"),
                                resultado.getString("nombre"),
                                resultado.getString("apep"),
                                resultado.getString("apem"),
                                resultado.getString("cuenta"),
                                resultado.getString("contra"),


                        )
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }*/
}
