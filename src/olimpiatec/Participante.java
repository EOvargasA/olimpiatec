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
public class Participante {
    //atributos
    private String nombre;
    private int matricula;
    private String campus;
    private int edad;
    private char sexo;
    
    //inicializador
    public Participante (String nombre, int matricula, String campus, int edad, char sexo){
        this.nombre = nombre;
        this.matricula = matricula;
        this.campus = campus;
        this.edad = edad;
        /*en el sexo m = masculino
        * f = femenino
        * i = invalido
        */
        if (sexo == 'm' || sexo == 'f'){
            this.sexo = sexo;
        }else{
            System.out.println("El genero es invalido");
            this.sexo = 'i';
        }
    }
    
    //get and set

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCampus() {
        return campus;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }
}
