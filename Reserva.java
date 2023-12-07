package hotelXpotec;

public class Reserva {
    private Cliente idCliente;
    private Quarto idQuarto;
    private Cama idCama;

    public Reserva(Cliente cliente, Quarto quarto) {
        this.idCliente = cliente;
        this.idQuarto = quarto;
    }

    public Reserva(int numeroQuarto, String dataInicio, String dataFim, Cama idCama) {
        // TODO: Implement logic for this constructor
        // Placeholder method calls
        this.idQuarto = encontrarQuartoPorNumero(numeroQuarto);
        this.idCliente = getIdCliente();
        this.idCama = idCama;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Quarto getIdQuarto() {
        return idQuarto;
    }

    public void setIdQuarto(Quarto idQuarto) {
        this.idQuarto = idQuarto;
    }

    public Cama getIdCama() {
        return idCama;
    }

    public void setIdCama(Cama idCama) {
        this.idCama = idCama;
    }

    private Quarto encontrarQuartoPorNumero(int numeroQuarto) {
        return new Quarto(numeroQuarto);
    }
}
