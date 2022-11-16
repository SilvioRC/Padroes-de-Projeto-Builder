package builder.examplos.componentes;
import builder.examplos.carros.Carro;
public class ComputadorBordo {
	private Carro carro;

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void mostrarNivelCombustivel() {
        System.out.println("Nível de combustivel: " + carro.getCombustivel());
    }

    public void mostrarStatus() {
        if (this.carro.getMotor().estaLigando()) {
            System.out.println("Carro está ligado");
        } else {
            System.out.println("Carro não está ligado");
        }
    }

}
