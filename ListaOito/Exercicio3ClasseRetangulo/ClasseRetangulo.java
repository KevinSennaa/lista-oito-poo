public class ClasseRetangulo {
    private double ladoA;
    private double ladoB;

    public double getLadoA() {
        return ladoA;
    }
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getLadoB() {
        return ladoB;
    }
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
    public double calcularArea(){
        return ladoA * ladoB;
    }
    
}
