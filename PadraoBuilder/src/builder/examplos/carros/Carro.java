package builder.examplos.carros;
import builder.examplos.componentes.Motor;
import builder.examplos.componentes.NavegadorGPS;
import builder.examplos.componentes.Transmissao;
import builder.examplos.componentes.ComputadorBordo;
public class Carro {
	
	private final CarroTipo tipoCarro;
    private final int assentos;
    private final Motor motor;
    private final Transmissao transmissao;
    private final ComputadorBordo computadorBordo;
    private final NavegadorGPS navegadorGPS;
    private double combustivel = 0;

    public Carro(CarroTipo tipoCarro, int assentos, Motor motor, Transmissao transmissao,
               ComputadorBordo computadorBordo, NavegadorGPS gpsNavigator) {
        this.tipoCarro = tipoCarro;
        this.assentos = assentos;
        this.motor = motor;
        this.transmissao = transmissao;
        this.computadorBordo = computadorBordo;
        if (this.computadorBordo != null) {
            this.computadorBordo.setCarro(this);
        }
        this.navegadorGPS = gpsNavigator;
    }

    public CarroTipo getCarroTipo() {
        return tipoCarro;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public int getAssentos() {
        return assentos;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }

    public ComputadorBordo getComputadorBordo() {
        return computadorBordo;
    }

    public NavegadorGPS getNavegadorGPS() {
        return navegadorGPS;
    }
}


