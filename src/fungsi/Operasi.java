/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

/**
 *
 * @author Asus A455L
 */
public class Operasi {

    double Lamdas;
    double Miu;
    double Ss;
    
    public Operasi(Integer Lamdas,Double Ss,Double Miu)
    {
        this.Lamdas = Lamdas;
        this.Miu=Miu;
        this.Ss=Ss;
    }
    
    
    public Double getLamdas()
    {
    return Lamdas;
    }
    public Double getMiu()
    {
    return Miu;
    }
    public Double getSs()
    {
    return Ss=Ss;
    }
    
    public void setLamdas()
    {
    this.Lamdas=Lamdas;
    }
    public void setMiu()
    {
    this.Miu=Miu;
    }
    public void setSs()
    {
    this.Ss=Ss;
    }
    
    public Double Data1()
    {
        return Lamdas/Miu;
    }

 
}
