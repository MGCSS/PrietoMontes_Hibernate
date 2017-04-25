package modelo;
// Generated 20-abr-2017 20:26:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Experto generated by hbm2java
 */
public class Experto  implements java.io.Serializable {


     private String codExperto;
     private String nombre;
     private String pais;
     private Character sexo;
     private String especialidad;
     private Set colaboras = new HashSet(0);

    public Experto() {
    }

	
    public Experto(String codExperto, String nombre, String pais, String especialidad) {
        this.codExperto = codExperto;
        this.nombre = nombre;
        this.pais = pais;
        this.especialidad = especialidad;
    }
    public Experto(String codExperto, String nombre, String pais, Character sexo, String especialidad, Set colaboras) {
       this.codExperto = codExperto;
       this.nombre = nombre;
       this.pais = pais;
       this.sexo = sexo;
       this.especialidad = especialidad;
       this.colaboras = colaboras;
    }
   
    public String getCodExperto() {
        return this.codExperto;
    }
    
    public void setCodExperto(String codExperto) {
        this.codExperto = codExperto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return this.pais;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }
    public Character getSexo() {
        return this.sexo;
    }
    
    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }
    public String getEspecialidad() {
        return this.especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public Set getColaboras() {
        return this.colaboras;
    }
    
    public void setColaboras(Set colaboras) {
        this.colaboras = colaboras;
    }




}


