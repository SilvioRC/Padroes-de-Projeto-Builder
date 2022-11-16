package builder.examplos.componentes;

public class Motor {
	private final double volume;
    private double quilometragem;
    private boolean ligando;

    public Motor(double volume, double quilometragem) {
        this.volume = volume;
        this.quilometragem = quilometragem;
    }

    public void ligado() {
        ligando = true;
    }

    public void desligado() {
        ligando = false;
    }

    public boolean estaLigando() {
        return ligando;
    }

    public void ir(double quilometragem) {
        if (ligando) {
            this.quilometragem += quilometragem;
        } else {
            System.err.println("Carro não pode, precisa ligar primeiro");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

}
