/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

/**
 *
 * @author osiri
 */
public class Evento {
    //atributos
    private String actividad;
    private Equipo equipo1;
    private Equipo equipo2;
    private int ganador;
    
    //inicializador
    public Evento (String actividad, Equipo equipo1, Equipo equipo2){
        this.actividad = actividad;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.ganador = 0;
    }
    
    //get y set
    public String getActividad() {
        return actividad;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public int getGanador() {
        return ganador;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public boolean setGanador(int ganador) {
        if (ganador == 0 || ganador == 1 || ganador == 2){
            /* 0 = empate
            *  1 = gana eq. 1
            *  2 = gana eq. 2
            */
            this.ganador = ganador;
            return true;
        }else{
            System.out.println("valor invalido");
            return false;
        }
    }
    
    //metodos
    public boolean añadirMiembro (int a, Participante miembro){
        if (a == 1){
            return this.equipo1.añadirMiembro(miembro);
        }
        if (a == 2){
            return this.equipo2.añadirMiembro(miembro);
        }
        System.out.println("El valor introducido es invalido");
        return false;
    }
    
    public boolean eliminarMiembro (int a, Participante miembro){
        if (a == 1){
            return this.equipo1.eliminarMiembro(miembro);
        }
        if (a == 2){
            return this.equipo2.eliminarMiembro(miembro);
        }
        System.out.println("El valor introducido es invalido");
        return false;
    }
}
