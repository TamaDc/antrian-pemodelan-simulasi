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
public class Operasi2 extends Operasi {

    public Operasi2(Integer Lamdas, Double Ss, Double Miu) {
        super(Lamdas, Ss, Miu);
    }
    
    public double Po()
    {
      return (1-super.Data1())/ (1 - Math.pow(super.Data1(),(Ss+1)));
    }
    
    public double Pw()
    {
    return 1 - Po();
    }
    
    public double Pm()
    {
    return Math.pow(super.Data1(),Ss)* Po();
    }
    
    public double Ls ()
    {
    return (Pw()- Ss*super.Data1()*Pm())/(1-super.Data1());
    }
    
    public double Lq()
    {
    return Ls() - (Lamdas*(1-Pm()))/Miu;
    }
    
    public double Ws()
    {
    return Ls() / ( Lamdas *(1-Pm()));
    }
            
    public double Wq()
    {
    return Ws()- (1/Miu);
    }
    
    
}
