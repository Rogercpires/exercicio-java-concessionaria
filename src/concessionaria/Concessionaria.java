package concessionaria;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;

/**
 * Curso: Programador de Sistemas - SED SC
 * Turma: T10
 * Professor: Oswaldo Borges Pereira
 * Disciplina: Linguagem de Programação Java
 * Equipe: Roger Pires
 */
public class Concessionaria {

    private Motos moto;
    private Clientes cliente;
    private Vendas venda;

    public static void MenuPrincipal(){
        System.out.println("\n");
        System.out.println("###### Menu ######");
        System.out.println("1) Cadastros");
        System.out.println("2) Editar Cadastros");
        System.out.println("3) Excluir Cadastros");
        System.out.println("4) Listagem de Cadastros");
        System.out.println("5) Realizar Venda");
        System.out.println("6) Consultar Venda");
        System.out.println("0) Sair do Sistema");
    }
    
    public static void MenuCadastros(){
        System.out.println("##### Menu Cadastros #####");
        System.out.println("1) Cadastrar Moto");
        System.out.println("2) Cadastrar Cliente");
        System.out.println("9) Voltar ao Menu anterior");
    }

    public static void MenuEdicao(){
        System.out.println("##### Menu Edicao #####");
        System.out.println("1) Editar cadastro de Motos");
        System.out.println("2) Editar cadastro de Clientes");
        System.out.println("9) Voltar ao Menu anterior");
    }    

    public static void MenuExclusao(){
        System.out.println("##### Menu Edicao #####");
        System.out.println("1) Excluir cadastro de Motos");
        System.out.println("2) Excluir cadastro de Clientes");
        System.out.println("9) Voltar ao Menu anterior");
    }  
    
    public static void MenuListagem(){
        System.out.println("##### Menu Edicao #####");
        System.out.println("1) Listar cadastro de Motos");
        System.out.println("2) Listar cadastro de Clientes");
        System.out.println("3) Listar todas as Vendas");
        System.out.println("9) Voltar ao Menu anterior");
    }     

    public static void MenuEdicaoMotos(){
        System.out.println("##### Menu Edicao de Motos #####");
        System.out.println("Entre com a placa da moto a ser Editada: ");
    }
    
    public static void MenuEdicaoMotosDados(){
        System.out.println("##### Selecione o dado que quer alterar #####");
        System.out.println("(1) Alterar Marca");
        System.out.println("(2) Alterar Modelo");
        System.out.println("(3) Alterar Ano");
        System.out.println("(4) Alterar Valor");
    }

    public static void MenuEdicaoClientes(){
        System.out.println("##### Menu Edicao de Clientes #####");
        System.out.println("Entre com o CPF do clientes a ser Editado: ");
    }
    
    public static void MenuEdicaoClientesDados(){
        System.out.println("##### Selecione o dado que quer alterar #####");
        System.out.println("(1) Alterar Nome");
        System.out.println("(2) Alterar Idade");
        System.out.println("(3) Alterar Sexo");
        System.out.println("(4) Alterar Telefone");
    }
    
    public static void MenuExclusaoMotos(){
        System.out.println("##### Menu Exclusao de Motos #####");
        System.out.println("Entre com a placa da moto a ser excluida: ");
    }

    public static void MenuExclusaoClientes(){
        System.out.println("##### Menu Exclusao de Clientes #####");
        System.out.println("Entre com o CPF do cliente a ser Excluido: ");
    } 
    
    public static void RelatorioVendas(){
        System.out.println("##### Listagem das Vendas ####");
        System.out.println("");
    }
    public static void ConsultarVenda(){
        System.out.println("##### Consulta Venda ####");
        System.out.println("");
    }
    
    public static void Sair(){
        System.out.println("##### Saindo do sistema ####");
        System.out.println("");
    }
            
    public static void main(String[] args) {
        
        Motos novaMoto = new Motos();
        Clientes novoCliente = new Clientes();
        Vendas novaVenda = new Vendas();
        ArrayList<Motos> ListaMotos = new ArrayList();
        ArrayList<Clientes> ListaClientes = new ArrayList();
        ArrayList<Vendas> ListaVendas = new ArrayList();
        int opcao;
        int op;
        boolean ok;
        int numerador = 0;
        Scanner entrada = new Scanner(System.in);
        
                do{
                    MenuPrincipal();
                    opcao = Integer.parseInt(entrada.nextLine());

                    switch(opcao){
                        case 1: // Opção para menu de Cadastros
                            MenuCadastros();
                            opcao = Integer.parseInt(entrada.nextLine());
                                switch(opcao){
                                    case 1: // Opção para cadastrar uma nova Moto
                                        ListaMotos.add(novaMoto.CadastraMoto());
                                        break;
                                    case 2: // Opção para cadastrar um novo cliente
                                        ListaClientes.add(novoCliente.CadastraCliente());
                                        break;
                                    case 9: // Volta ao Menu inicial
                                        MenuPrincipal();
                                        break;
                                    default:
                                        System.out.println("Opção inválida.");
                                }
                            break;
                            
                        case 2: // Opção para Menu de Edição de Cadastros
                            MenuEdicao();
                            opcao = Integer.parseInt(entrada.nextLine());
                                switch(opcao){
                                    case 1: // Opção para editar o cadastro de uma moto
                                        MenuEdicaoMotos();
                                        String placa = entrada.nextLine().toLowerCase();
                                        Iterator itrMotos = ListaMotos.iterator();
                                        op = 0;
                                        ok = false;
                                        while (itrMotos.hasNext()){
                                            novaMoto = ListaMotos.get(op);
                                            if(itrMotos.next() != null) {
                                                if (placa.equals(novaMoto.getPlaca())){
                                                    ok = true;
                                                    MenuEdicaoMotosDados();
                                                    opcao = Integer.parseInt(entrada.nextLine());
                                                    switch(opcao){
                                                    case 1:
                                                        System.out.println("Entre com a nova Marca:");
                                                        String marca = entrada.nextLine();
                                                        novaMoto.setMarca(marca);
                                                        break;
                                                    case 2:
                                                        System.out.println("Entre com o novo Modelo: ");
                                                        String modelo = entrada.nextLine();
                                                        novaMoto.setModelo(modelo);
                                                        break;
                                                    case 3:
                                                        System.out.println("Entre com o novo Ano: ");
                                                        int ano = entrada.nextInt();
                                                        novaMoto.setAno(ano);
                                                        break;
                                                    case 4:
                                                        System.out.println("Entre com o novo Valor:");
                                                        float valor = entrada.nextFloat();
                                                        novaMoto.setValor(valor);
                                                        break;
                                                    default:
                                                        System.out.println("Opcao invalida");                                                    
                                                        break;
                                                    }
                                                    break;
                                                }
                                                op++;
                                            }
                                        }
                                        if (ok = false){
                                               System.out.println("Moto não localizada!");
                                                break;
                                            }
                                        break;
                                    case 2: // Opção para editar o cadastro de um cliente
                                        MenuEdicaoClientes();
                                        String CPF = entrada.nextLine().toLowerCase();
                                        Iterator itrClientes = ListaClientes.iterator();
                                        op = 0;
                                        ok = false;
                                        while (itrClientes.hasNext()){
                                            novoCliente = ListaClientes.get(op);
                                            if(itrClientes.next() != null) {
                                                if (CPF.equals(novoCliente.getCPF())){
                                                    ok = true;
                                                    MenuEdicaoClientesDados();
                                                    opcao = Integer.parseInt(entrada.nextLine());
                                                    switch(opcao){
                                                    case 1:
                                                        System.out.println("Entre com novo o Nome: ");
                                                        String nome = entrada.nextLine();
                                                        novoCliente.setNome(nome);
                                                        break;
                                                    case 2:
                                                        System.out.println("Entre com a nova idade: ");
                                                        int idade = entrada.nextInt();
                                                        novoCliente.setIdade(idade);
                                                        break;
                                                    case 3:
                                                        System.out.println("Entre com o novo Sexo (S ou N):");
                                                        char sexo = entrada.next().charAt(0);
                                                        novoCliente.setSexo(sexo);
                                                        break;
                                                    case 4:
                                                        System.out.println("Entre com o novo Telefone: ");
                                                        String telefone = entrada.nextLine();
                                                        novoCliente.setTelefone(telefone);
                                                        break;
                                                    default:
                                                        System.out.println("Opcao invalida");  
                                                        break;
                                                    }
                                                    break;
                                                }
                                                op++;
                                            }
                                        }
                                    case 9: // Volta ao menu principal
                                        MenuPrincipal();
                                        break;
                                    default:
                                        System.out.println("Opção inválida.");
                                }
                            break;

                        case 3: // Opção do Menu para Excluir Cadastros
                            MenuExclusao();
                            opcao = Integer.parseInt(entrada.nextLine());
                                switch(opcao){
                                    case 1: // Opção para excluir um moto
                                        System.out.println("Entre com a placa: ");
                                        String placa = entrada.nextLine().toLowerCase();
                                        Iterator itrMotos = ListaMotos.iterator();
                                        op = 0;
                                        while (itrMotos.hasNext()){
                                            if(itrMotos.next() != null){ 
                                            novaMoto = ListaMotos.get(op);
                                                if (placa.equals(novaMoto.getPlaca())){
                                                    System.out.println("Tem certeza que deseja excluir: (s/n)");
                                                    char leia = entrada.next().charAt(0);
                                                    entrada.nextLine();
                                                    if (leia == 's'){
                                                        ListaMotos.remove(op);
                                                        break;
                                                    }
                                                }
                                                op++;
                                                if (false == itrMotos.hasNext()){
                                                    System.out.println("Moto não localizada!");
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 2: // Opção para excluir um cliente
                                        System.out.println("Entre com o CPF do cliente a ser excluido: ");
                                        String CPF = entrada.nextLine().toLowerCase();
                                        Iterator itrClientes = ListaClientes.iterator();
                                        op = 0;
                                        while (itrClientes.hasNext()){
                                            if(itrClientes.next() != null){
                                                novoCliente = ListaClientes.get(op);
                                                if (CPF.equals(novoCliente.getCPF())){
                                                    System.out.println("Tem certeza que deseja excluir: (s/n)");
                                                    char leia = entrada.next().charAt(0);
                                                    entrada.nextLine();
                                                    if (leia == 's'){
                                                        ListaClientes.remove(op);
                                                        break;
                                                    }
                                                }
                                                op++;
                                                if (false == itrClientes.hasNext()){
                                                    System.out.println("Moto não localizada!");
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    case 9: // Volta ao menu principal
                                        MenuPrincipal();
                                        break;
                                    default:
                                        System.out.println("Opção inválida.");
                                }
                            break;

                        case 4: // Opção para realizar a Listagem de dados
                            MenuListagem();
                            opcao = Integer.parseInt(entrada.nextLine());
                                switch(opcao){
                                    case 1: // Lista todas as motos cadastradas
                                        System.out.println("##### Listagem de Motos #####");
                                        for (Motos moto: ListaMotos) {
                                            moto.ListarMoto(moto);
                                           }
                                        break;
                                        
                                    case 2: // Lista todos os clientes cadastrados'
                                        System.out.println("##### Listagem de Clientes #####");
                                        for (Clientes cliente: ListaClientes) {
                                            cliente.ListarCliente(cliente);
                                           }
                                        break;
                                        
                                    case 3: // Lista todas as vendas
                                        System.out.println("##### Listagem das Vendas #####");
                                        for (Vendas venda: ListaVendas) {
                                            venda.ListarVendas(venda);
                                           }
                                        break;
                                        
                                    case 9: // Volta ao Menu principal
                                        MenuPrincipal();
                                        break;
                                        
                                    default:
                                        System.out.println("Opção inválida.");
                                }
                            break;
                            
                        case 5: // Opção para realizar uma Venda
                            novaVenda = novaVenda.CadastraVenda();
                            Iterator itrMotos = ListaMotos.iterator();
                            op = 0;
                            ok = false;
                            while (itrMotos.hasNext()){
                                if(itrMotos.next() != null){
                                novaMoto = ListaMotos.get(op);
                                    if (novaVenda.getPlaca().equals(novaMoto.getPlaca())){
                                        Iterator itrClientes = ListaMotos.iterator();
                                        op = 0;
                                        while (itrClientes.hasNext()){
                                            if(itrClientes.next() != null){
                                                novoCliente = ListaClientes.get(op);
                                                if (novaVenda.getCPF().equals(novoCliente.getCPF())){
                                                    ok = true;
                                                    numerador++;
                                                    novaVenda.setNumero(numerador);
                                                    ListaVendas.add(novaVenda);
                                                    System.out.println("Venda Realizada com sucesso.");
                                                break;
                                                }
                                                op++;
                                                if (ok){
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                op++;
                                }
                            }
                            if (ok){
                                System.out.println("Venda não realizada, revise os dados.");
                            }
                            break;
                        case 6: // Opção para consulta de uma venda especifica
                            ConsultarVenda();
                            opcao = Integer.parseInt(entrada.nextLine());
                            break;
                            
                        case 0:
                            Sair();
                            break;
                            
                        default:
                            System.out.println("Opção inválida.");
                    }
                } while(opcao != 0);
    }
}
