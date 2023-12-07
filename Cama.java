package hotelXpotec;

public class Cama {
    private int numero, codigoCama;
	String posicao;
    private String id, descricao;
    private boolean temBeliche;

    public Cama(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCodigoCama() {
        return codigoCama;
    }

    public void setCodigoCama(int codigoCama) {
        this.codigoCama = codigoCama;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicaoCama) {
        this.posicao = posicaoCama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isTemBeliche() {
        return temBeliche;
    }

    public void setTemBeliche(boolean temBeliche) {
        this.temBeliche = temBeliche;
    }
}
