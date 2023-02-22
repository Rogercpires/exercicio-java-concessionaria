package concessionaria;

import java.util.Scanner;

/**
 * Curso: Programador de Sistemas - SED SC
 * Turma: T10
 * Professor: Oswaldo Borges Pereira
 * Disciplina: Linguagem de Programação Java
 * Equipe: Roger Pires
 */
public class Clientes {
    private String CPF;
    private String nome; 
    private int Idade;
    private Character Sexo;
    private String Telefone;
    Scanner entrada = new Scanner(System.in);

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the Idade
     */
    public int getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    /**
     * @return the Sexo
     */
    public Character getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(Character Sexo) {
        this.Sexo = Sexo;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }
    Clientes CadastraCliente(){
        Clientes novoCliente = new Clientes();
        System.out.println("##### Menu Cadastro de Clientes #####");
        System.out.println("Entre com o CPF: ");
        novoCliente.CPF = entrada.nextLine();
        System.out.println("Entre com o Nome: ");
        novoCliente.nome = entrada.nextLine();
        System.out.println("Entre com a Idade: ");
        novoCliente.Idade = entrada.nextInt();
        System.out.println("Indique o sexo: (M)ou (F)");
        novoCliente.Sexo = entrada.next().charAt(0);
        entrada.nextLine();
        System.out.println("Entre com o telefone: ");
        novoCliente.Telefone = entrada.nextLine();
        return novoCliente;
    }
    
    void ListarCliente(Clientes ListaCliente){
        System.out.println("CPF: " + ListaCliente.CPF);
        System.out.println("Nome: " + ListaCliente.nome);
        System.out.println("Idade: " + ListaCliente.Idade);
        System.out.println("Sexo: " + ListaCliente.Sexo);
        System.out.println("Telefone: " + ListaCliente.Telefone);
        System.out.println("\n");
    }

}
