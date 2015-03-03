/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aguas;

/**
 *
 * @author Hiperzone
 */
public class Escalao {
    private int LimiteSuperior;
    private int LimiteInferior;
    private double Preco = 0;
    
    public Escalao()
    {
        LimiteSuperior = LimiteInferior = 0;
        Preco = 0;
    }
    
    public Escalao(int LimiteInferior, int LimiteSuperior, double Preco)
    {
        this.LimiteInferior = LimiteInferior;
        this.LimiteSuperior = LimiteSuperior;
        this.Preco = Preco;
    }
    
    @Override
    public String toString()
    {
        return ( "LimiteSuperior: " + LimiteSuperior + " LimiteInferior: " + 
                 LimiteInferior + " Preço: " + Preco);
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(obj == null) return false;
        if(obj == this) return true;
        
        if(this.getClass() == obj.getClass())
        {
            Escalao escalao = (Escalao)obj;
            return (this.LimiteInferior == escalao.getLimiteInferior() && 
                    this.LimiteSuperior == escalao.getLimiteSuperior() && 
                    this.Preco == escalao.getPreco());
        }
        return false;
    }
    
    @Override
    public Escalao clone()
    {
        return new Escalao(LimiteInferior,LimiteSuperior,Preco);
    }
    
    public void setLimiteSuperior(int LimiteSuperior)
    {
        this.LimiteSuperior = LimiteSuperior;
    }
    
    public int getLimiteSuperior()
    {
        return this.LimiteSuperior;
    }
    
    public void setLimiteInferior(int LimiteInferior)
    {
        this.LimiteInferior = LimiteInferior;
    }
    
    public int getLimiteInferior()
    {
        return this.LimiteInferior;
    }
    
    public void setPreco(double preco)
    {
        this.Preco = preco;
    }
    
    public double getPreco()
    {
        return this.Preco;
    }
}
