/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aguas;

/**
 *
 * @author Hiperzone
 */
public class TarifarioDomesticoAgua extends TarifarioDomestico{
    
    public TarifarioDomesticoAgua(int numEscalao, Tarifarios tipoTarifario)
    {
        super(8, Tarifarios.TARIFARIO_DOMESTCO);
        
        escalao[0] = new Escalao(0, 5, 0.34);
        escalao[1] = new Escalao(6, 8, 0.41);
        escalao[2] = new Escalao(9, 11, 0.64);
        escalao[3] = new Escalao(12, 14, 0.83);
        escalao[4] = new Escalao(15, 17, 1.16);
        escalao[5] = new Escalao(18, 20, 1.32);
        escalao[6] = new Escalao(21, 23, 1.40);
        escalao[7] = new Escalao(23, -1, 1.50); //-1, sem limite
    }
}
