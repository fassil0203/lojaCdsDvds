package lojacdsDvds;

import java.util.Scanner;

public class Midia {

        private int codigo;
        private double preco;
        private String name;

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Midia(){
            this(0,0,"Nenhum");
        }

        public Midia(int codigo, double preco, String name) {
            setCodigo(codigo);
            setPreco(preco);
            setName(name);
        }
        public String getTipo(){
            return "Midia";
        }
        // Funcao que retorna o conteudo dos campos em forma de String

        public String getDetalhes(){
        return  "Codigo" + getCodigo() + "\n"+
                "Preco:" + getPreco() +"\n"+
                "Nome:" + getName()   +"\n";

        }

        // Funcao para impressao doa dados via get detalhes
        public void printDados(){
            String s =getTipo() +"\n" + getDetalhes() + "\n";
            System.out.println(s);

        }

        //Funcao para Leitura dos dados via Teclado

        public void inserirDados(){
            Scanner in = new Scanner(System.in);

            // Leitura dos dados do Teclado

            System.out.printf("\n Entre com o Codigo");
            int cod =  in.nextInt();
            System.out.printf("\n Entre com o Preço :");
            double pre = in.nextDouble();
            in.nextLine();
            System.out.printf("\n Entre com o Nome");
            String nam =in.nextLine();

            // Enviando Dados lidos para as funcoes Set
            setCodigo(cod);
            setName(nam);
            setPreco(pre);
            

        }
    }
