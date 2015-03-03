/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aguas;

/**
 *
 * @author Hiperzone
 */
public class Tarifario {
    protected Tarifarios tipoTarifario;
    protected Escalao escalao[]; //Todo:Modificar para ArrayList, ordenada por insercao
    protected int numEscalao;
    
    public enum Tarifarios{
        TARIFARIO_DOMESTCO, TARIFARIO_COMERCIAL, TARIFARIO_INSTITUICAO;
    }
    
    public Tarifario()
    {
        
    }
    
    public Tarifario(int numEscalao, Tarifarios tipoTarifario)
    {
        this.numEscalao = numEscalao;
        this.tipoTarifario = tipoTarifario;
        escalao = new Escalao[this.numEscalao];
    }
}
