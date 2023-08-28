package lojacdsDvds;

public class CD extends Midia{

    private int nMusicas;

    // Construtor sem parametros

    public CD(){
        this(0,0,"Nenhum",0);

    }

    //Construtor com parametros

    public CD(int codigo, double preco, String name, int nMusicas) {
        super(codigo, preco, name);
        this.nMusicas = nMusicas;
    }

}
