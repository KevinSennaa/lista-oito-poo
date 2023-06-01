public class ClasseBola {
    private String cor, material;
    private double circuferencia;

    public ClasseBola(String cor, String material, double circuferencia){
        this.material = material;
        this.circuferencia = circuferencia;
        this.cor = cor;
    } 

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public double getCircuferencia() {
        return circuferencia;
    }
    public void setCircuferencia(double circuferencia) {
        this.circuferencia = circuferencia;
    }
    public void trocarCor(String novaCor){
        this.cor = novaCor;
    }
    public void mostrarCor(){
        System.out.println("A cor da bola será: " + cor);
    }
    





}    

    