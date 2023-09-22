package Controller;

import Model.Fraction;

public class CalculatorController {

    private Fraction f1;
    private Fraction f2;
    private Fraction result;

    public CalculatorController(){

    }
    public void shorten(){
        result = new Fraction(f1.getNum(), f1.getDenom());
        result.shorten();
    }
    public void add(){
        int factor1= f1.getDenom();
        int factor2=f2.getDenom();

        f1.expand(factor2);
        f2.expand(factor1);
        result=new Fraction(f1.getNum()+f2.getNum(), f2.getDenom());
        result.shorten();
    }

    public void subtract(){
        int factor1= f1.getDenom();
        int factor2=f2.getDenom();

        f1.expand(factor2);
        f2.expand(factor1);
        result=new Fraction(f1.getNum()-f2.getNum(), f2.getDenom());
        result.shorten();
    }

    public void multiply(){
        result=new Fraction(f1.getNum() * f2.getNum(), f1.getDenom() * f2.getDenom());
        result.shorten();
    }

    public void divide(){
        result=new Fraction(f1.getNum() * f2.getDenom(), f1.getDenom() * f2.getNum());
        result.shorten();
    }

    public void createFractionF1(int num, int denom){
        f1=new Fraction(num, denom);
    }

    public void createFractionF2(int num, int denom){
        f2=new Fraction(num, denom);
    }

    public Fraction getResult(){
        return result;
    }

}
