public class Cavalo{
    private String nome;
    private int idade;
    private String raca;
    

public Cavalo(String nome, int idade, String raca) {
    this.nome = nome;
    this.idade = idade;
    this.raca = raca;
}

public String getNome(){
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade(){
    return idade;
}
public void setIdade(int idade){
    this.idade = idade;
}

public String getRaca(){
    return raca;
}
public void setRaca(String raca){
    this.raca = raca;
}
public void relinchar(){
    System.out.println("O cavalo fez iiirrrrí");
}
public void Aniversario(){
    idade++;
}
public void apresenta(){
    System.out.println(nome + " é um cavalo da raça " + raca + " e tem "+ idade + " anos");
}

public static void main (String[] args){
    Cavalo Cavalo1 = new Cavalo("Scobby Doo", 12, "Puro Sangue Inglês");

        System.out.println("Nome: " + Cavalo1.getNome());

        Cavalo1.setNome("Snoopy");

        System.out.println("Nome: " + Cavalo1.getNome());
        
        System.out.println("Idade: " + Cavalo1.getIdade());

        Cavalo1.setIdade(11);

        System.out.println("Idade: " + Cavalo1.getIdade());
        
        System.out.println("Raça: " + Cavalo1.getRaca());

        Cavalo1.setRaca("Percheron");

        System.out.println("Raça: " + Cavalo1.getRaca());
        Cavalo1.relinchar();
        Cavalo1.Aniversario();
        System.out.println("Idade: " + Cavalo1.getIdade());
        Cavalo1.apresenta();
    
}
}