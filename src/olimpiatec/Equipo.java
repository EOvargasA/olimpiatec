/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;
import java.util.ArrayList;

/**
 *
 * @author osiri
 */
public class Equipo {
    //atributos
    private String nombre;
    private String actividad;
    ArrayList<Participante> participantes = new ArrayList<Participante>();
    
    //constructor
    public Equipo (String nombre, String actividad){
        this.nombre = nombre;
        this.actividad = actividad;
    }
    
    //get y set
    public String getNombre() {
        return nombre;
    }

    public String getActividad() {
        return actividad;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
    
    //metodos
    public boolean añadirMiembro (Participante participante){
        if (this.participantes.contains(participante)){
            System.out.println("El participante ya esta registrado");
            return false;
        }else{
            this.participantes.add(participante);
            return true;
        }
    }
    
    public boolean eliminarMiembro (Participante participante){
        if (this.participantes.contains(participante)){
            this.participantes.remove(participante);
            return true;
        }else{
            System.out.println("El alumno no existe");
            return false;
        }
    }
}
