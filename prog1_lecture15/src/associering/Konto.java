package associering;

public class Konto {
    private int nr;
    private double saldo;

    public Konto (int nr, double saldo){
        setNr(nr);
        setSaldo(saldo);
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
