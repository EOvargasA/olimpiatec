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
public class Enfrentamiento extends Evento{
    //atributos Nuevos
    private Participante participante1;
    private Participante participante2;
    
    //inicializador
    public Enfrentamiento (String actividad, Participante a, Participante b){
        super(actividad,null,null);
        this.participante1 = a;
        this.participante2 = b;
    }

    public Participante getParticipante1() {
        return participante1;
    }

    public Participante getParticipante2() {
        return participante2;
    }

    public void setParticipante1(Participante participante1) {
        this.participante1 = participante1;
    }

    public void setParticipante2(Participante participante2) {
        this.participante2 = participante2;
    }
}
