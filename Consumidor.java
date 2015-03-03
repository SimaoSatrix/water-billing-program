/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aguas;
import java.util.ArrayList;
/**
 *
 * @author Hiperzone
 */
public class Consumidor {
    protected int ClienteID;
    protected String Morada;
    protected String Nome;
    protected int NumContribuinte;
    protected int TipoConsumidor;
    protected ArrayList<Consumo> Consumo;
    
    
    public Consumidor()
    {
        
    }
    
    public int getClientID()
    {
        return ClienteID;
    }
    
    public void setClientID (int id)
    {
        ClienteID = id;
    }
    
    public String getMorada()
    {
        return Morada;
    }
    
    public void setMorada (String Morada)
    {
        this.Morada = Morada;
    }
    
    public String Nome()
    {
        return Nome;
    }
    
    public void setNome (String Nome)
    {
        this.Nome = Nome;
    }
    
    public int NumContribuinte()
    {
        return NumContribuinte;
    }
    
    public void setNumContribuinte(int NumC)
    {
        NumContribuinte = NumC;
    }
    
    public int TipoConsumidor()
    {
        return TipoConsumidor;
    }
    
    public void setTipoConsumidor (int TipoC)
    {
        TipoConsumidor = TipoC;
    }
   
}
