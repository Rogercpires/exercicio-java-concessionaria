package concessionaria;

import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Curso: Programador de Sistemas - SED SC
 * Turma: T10
 * Professor: Oswaldo Borges Pereira
 * Disciplina: Linguagem de Programação Java
 * Equipe: Roger Pires
 */
public class Vendas {
    private Date dataVenda; // Atributo data da venda
    private int numero; // Atributo numero da venda
    private String placa;   // Atributo da classe motos para referenciar a moto vendida
    private String CPF; // Atributo Cliente da classe clientes
    Scanner entrada = new Scanner(System.in);

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    void ListarVendas(Vendas Venda){
        System.out.println("Numero da Venda: " + Venda.numero);
        System.out.println("Data da Venda: " + Venda.dataVenda.toString());
        System.out.println("CPF do Comprador: " + Venda.CPF);
        System.out.println("Placa do Veiculo: " + Venda.placa);
        System.out.println("\n");
    }

    Vendas CadastraVenda(){
        Vendas novaVenda = new Vendas();
        System.out.println("##### Menu Cadastro de Vendas #####");
        System.out.println("Entre com a placa da moto vendida: ");
        novaVenda.placa = entrada.nextLine().toLowerCase();
        System.out.println("Entre com o CPF do comprador: ");
        novaVenda.CPF = entrada.nextLine();
        novaVenda.dataVenda = new Date();
        return novaVenda;
    }
    
    
}
