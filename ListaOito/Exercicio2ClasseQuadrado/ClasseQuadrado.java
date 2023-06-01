public class ClasseQuadrado {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public ClasseQuadrado(double lado){
        this.lado = lado;
    }

    public void mudarValorLado(double mudarValorLado){
        this.lado = mudarValorLado;
    }

    public double retornarValorLado(){
        return lado;
    }

    public double calcularArea(){
        return lado * lado;
    }  
   
}
