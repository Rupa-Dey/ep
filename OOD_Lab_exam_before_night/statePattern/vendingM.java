package statePattern;

public class vendingM {
    private Istate idlstate;
    private Istate hasOd;
    private Istate outStk;
    private Istate currS;
    private int cnt;

    vendingM(int cnt){
        idlstate = new idleS();
        hasOd = new hasOne();
        outStk = new outStock();

        if(cnt>0){
            this.cnt=cnt;
            currS = idlstate;
        }
        else{
            this.cnt = 0;
            currS = outStk;
        }

    }
    public void insertD(){currS.insertD(this);}
    public void ejectD(){currS.ejectD(this);}
    public void dispense(){currS.dispense(this);}

    public int getCnt(){ return cnt;}
    public Istate getidleS(){return idlstate;}
    public Istate hasOne(){return hasOd;}
    public Istate outS(){return outStk;}

    public void setCurrS(Istate curS){this.currS = curS;}

    public void doReturn(){System.out.println("Return money");}
    public void releaseProduct(){System.out.println("release the product");}
    
}
