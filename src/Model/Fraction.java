package Model;

public class Fraction {

    private int num;
    private int denom;

    public Fraction(int pNum, int pDenom){
        num=pNum;
        denom=pDenom;
    }

    public void expand(int pFactor){
        if(pFactor!=0){
            num=num*pFactor;
            denom=denom*pFactor;
        }
    }

    public void shorten(){
        //TODO: Kürze die Brüche. Nutze dazu die Methode getGgt.
        /*if(num == 0){
            denom = 1;
            return;
        }*/
        int tmpGgt = getGgt();
        num /= tmpGgt;
        denom /= tmpGgt;
    }

    private int getGgt() {
        int tmpDenom= Math.abs(denom);
        int tmpNum= Math.abs(num);
        if(tmpNum == 0){
            return tmpDenom;
        }
        while (tmpDenom != 0) {
            if (tmpNum > tmpDenom) {
                tmpNum = tmpNum - tmpDenom;
            } else {
                tmpDenom = tmpDenom - tmpNum;
            }
        }
        return tmpNum;
    }

    //Weiterer Code

    public int getDenom() {
        return denom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int pNum){
        num=pNum;
    }

    public void setDenom(int denom) {
        this.denom = denom;
    }
}
