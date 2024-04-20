import model.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void loadData(ArrayList<Aluguer> aluguer,ArrayList<Cliente> cliente,ArrayList<Fatura> fatura,ArrayList<Funcionario> funcionario,ArrayList<Prancha> prancha){
        aluguer.add(new Aluguer(100.0, 0.0, 2, prancha, LocalDate.parse("2024-04-18"), LocalDate.parse("2024-04-19"),1));
        cliente.add(new Cliente("2527382383","Morada","3127823","Rodrigo",1));
        fatura.add(new Fatura(1));
        funcionario.add(new Funcionario("2527382383",1,"Rua","23323","Rodrigo"));
        prancha.add(new Prancha(1,true,10,"Bolt"));
        cliente.add(new Socio("2527382383","2527382383","Morada","3127823",1,1));
    }
    public static void criarCliente(ArrayList<Cliente> cliente,Scanner r){
        System.out.println("Insira o nome do cliente");
        String nome = r.nextLine();
        System.out.println("Insira o NIF do cliente");
        String nif = r.nextLine();
        System.out.println("Insira a morada do cliente");
        String morada = r.nextLine();
        System.out.println("Insira o bi do cliente");
        String bi = r.nextLine();
        int idClinte = cliente.toArray().length+ 1;
        cliente.add(new Cliente(nif,morada,bi,nome,idClinte));
    }
    public static void menu(){
        System.out.println("-------------------");
        System.out.println("1 - Criar cliente");
        System.out.println("2 - Mostrar clientes");
        System.out.println("3 - Criar funcionário");
        System.out.println("4 - Mostrar funcionário");
        System.out.println("5 - Ciar Pranchas");
        System.out.println("6 - Mostrar Pranchas");
        System.out.println("7 - Fazer reserva");
    }
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        int opcao;
        ArrayList<Aluguer> aluguer = new ArrayList<>();
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Fatura> fatura = new ArrayList<>();
        ArrayList<Funcionario> funcionario = new ArrayList<>();
        ArrayList<Prancha> prancha = new ArrayList<>();
        loadData(aluguer,cliente,fatura,funcionario,prancha);
        menu();
        opcao = r.nextInt();
        switch (opcao){
            case 1:
                criarCliente(cliente,r);
                break;
        }
    }
}