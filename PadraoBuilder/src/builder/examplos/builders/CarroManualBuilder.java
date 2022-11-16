package builder.examplos.builders;
import builder.examplos.componentes.Motor;
import builder.examplos.componentes.NavegadorGPS;
import builder.examplos.componentes.Transmissao;
import builder.examplos.carros.CarroTipo;
import builder.examplos.carros.Manual;
import builder.examplos.componentes.ComputadorBordo;
public class CarroManualBuilder implements Builder {
	private CarroTipo tipo;
    private int assentos;
    private Motor motor;
    private Transmissao transmissao;
    private ComputadorBordo computadorBordo;
    private NavegadorGPS navegadorGPS;

    @Override
    public void setCarroTipo(CarroTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public void setComputadorBordo(ComputadorBordo computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    @Override
    public void setNavegadorGPS(NavegadorGPS navegadorGPS) {
        this.navegadorGPS = navegadorGPS;
    }

    public Manual getResulto() {
        return new Manual(tipo, assentos, motor, transmissao, computadorBordo, navegadorGPS);
    }

}
