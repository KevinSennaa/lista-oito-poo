public class ClasseTv {
    private int volume;
    private int numeroCanal;

    public int getNumeroCanal() {
        return numeroCanal;
    }

    public void setNumeroCanal(int numeroCanal) {
        if(numeroCanal > 85 || numeroCanal <= 0){
            System.out.println("Canal não encontrado");
        }else{
         System.out.println("Você esta no canal: "+ numeroCanal);
    }
        this.numeroCanal = numeroCanal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if(volume > 100 || volume < 0){
            System.out.println("Volume não existente.");
        }else{
         System.out.println("Volume está no: " + volume);
    }
       this.volume=volume;
    }

    public void aumentarVolume(int valor){
       if(this.volume + valor < 100){
        this.volume += valor;
        System.out.println("O volume agora é: " + volume);
       }else{
        System.out.println("Volume maximo atingido.");
       }
    
}
    public void diminuirVolume(int valor){
        if(this.volume - valor > 0){
            this.volume -= valor;
            System.out.println("O volume agora é:" + volume);
           }else{
            System.out.println("Volume mínimo atingido.");
           }
    }

    public void mudarCanal(int valorCanal){
        if(valorCanal > 50 || valorCanal < 0){
            System.out.println("Canal não encontrado");
        }else{
         System.out.println("Você esta no canal: " + valorCanal);
    }


}
    
}
