public class ClasseBichinhoVirtual {
    private String nome;
    private int fome;
    private int saude;
    private int idade;

    public ClasseBichinhoVirtual(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;
    }

    
    public void alterarNome(String novoNome) {
        this.nome = novoNome;
    }

    
    public void alterarFome(int novaFome) {
        this.fome = novaFome;
    }


    public void alterarSaude(int novaSaude) {
            
           
    this.saude = novaSaude;
        }

    public void alterarIdade(int novaIdade) {
            
           
    this.idade = novaIdade;
        }
 
    public String retornarNome() {
            return nome;
        }

    public int retornarFome() {
            return fome;
        }

    public int retornarSaude() {
            return saude;
        }
  
    public int retornarIdade() {
            return idade;
        }
    
    public String retornarHumor() {
        if (fome >= 70 && saude >= 70) {
        return "Feliz";
    }else if (fome < 70 && saude >= 70) {
        return "Com Fome";

    }else if (fome >= 70 && saude < 70) {
                return "Doente";
            } else {
                return "Triste";
            }
    }
}            
