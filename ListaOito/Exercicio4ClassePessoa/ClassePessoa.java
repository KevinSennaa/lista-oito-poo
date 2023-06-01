public class ClassePessoa {
    private String nome;
    private int idade;
    private double altura,peso;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public ClassePessoa(String nome, int idade, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    public void envelhecer(){
        this.idade ++;
        if(this.idade<21){
            crescer(0.05);
        }
    }

    public void engordar(double pesoGanho){
        this.peso += pesoGanho;
    }

    public void emagrecer(double pesoPerdido){
        this.peso -= pesoPerdido;
    }

    public void crescer(double alturaGanha){
        this.altura += alturaGanha;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
        System.out.printf("Altura: %.2f m\n ", altura);
        System.out.println("\n");
    }
    
}
