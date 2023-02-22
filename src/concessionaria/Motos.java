package concessionaria;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Curso: Programador de Sistemas - SED SC
 * Turma: T10
 * Professor: Oswaldo Borges Pereira
 * Disciplina: Linguagem de Programação Java
 * Equipe: Roger Pires
 */
public class Motos {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private float valor;
    Scanner entrada = new Scanner(System.in);
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    Motos CadastraMoto(){
        Motos novaMoto = new Motos();
        System.out.println("##### Menu Cadastro de Motos #####");
        System.out.println("Entre com a placa: ");
        novaMoto.placa = entrada.nextLine().toLowerCase();
        System.out.println("Entre com a marca: ");
        novaMoto.marca = entrada.nextLine();
        System.out.println("Entre com o modelo: ");
        novaMoto.modelo = entrada.nextLine();
        System.out.println("Entre com o ano: ");
        novaMoto.ano = Integer.parseInt(entrada.nextLine());
        System.out.println("Entre com o valor: ");
        novaMoto.valor = Integer.parseInt(entrada.nextLine());
        return novaMoto;
    }


    void ListarMoto(Motos ListaMoto){
        System.out.println("Placa: " + ListaMoto.placa);
        System.out.println("Marca: " + ListaMoto.marca);
        System.out.println("Modelo: " + ListaMoto.modelo);
        System.out.println("Ano: " + ListaMoto.ano);
        System.out.println("Valor: " + ListaMoto.valor);
        System.out.println("\n");
    }
    
    Motos BuscarMoto(Motos [] ListaMotos){
        System.out.println("Entre com a placa: ");
        String placa = entrada.nextLine().toLowerCase();
        for (Motos buscaMoto: ListaMotos) {
            if(buscaMoto.placa.equals(placa)){
               return buscaMoto;
            }
        }
        return null;
    }

//    int BuscarMoto(ArrayList<Motos> ListaMotos) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
 }