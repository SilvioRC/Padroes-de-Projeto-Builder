package builder.examplos.builders;

import builder.examplos.componentes.Motor;
import builder.examplos.componentes.NavegadorGPS;
import builder.examplos.componentes.Transmissao;
import builder.examplos.carros.CarroTipo;
import builder.examplos.componentes.ComputadorBordo;
public interface Builder {
	    void setCarroTipo(CarroTipo tipo);
	    void setAssentos(int assentos);
	    void setMotor(Motor motor);
	    void setTransmissao(Transmissao transmissao);
	    void setComputadorBordo(ComputadorBordo computadorBordo);
	    void setNavegadorGPS(NavegadorGPS navegadorGPS);

}
