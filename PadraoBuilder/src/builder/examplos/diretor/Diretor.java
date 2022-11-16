package builder.examplos.diretor;

import builder.examplos.builders.Builder;
import builder.examplos.carros.CarroTipo;
import builder.examplos.componentes.Motor;
import builder.examplos.componentes.NavegadorGPS;
import builder.examplos.componentes.Transmissao;
import builder.examplos.componentes.ComputadorBordo;
public class Diretor {
	 public void construirCarroEsportivo(Builder builder) {
	        builder.setCarroTipo(CarroTipo.CARRO_ESPORTIVO);
	        builder.setAssentos(2);
	        builder.setMotor(new Motor(3.0, 0));
	        builder.setTransmissao(Transmissao.SEMI_AUTOMATICO);
	        builder.setComputadorBordo(new ComputadorBordo());
	        builder.setNavegadorGPS(new NavegadorGPS());
	    }

	    public void construirCarroDeCidade(Builder builder) {
	        builder.setCarroTipo(CarroTipo.CARRO_DE_CIDADE);
	        builder.setAssentos(2);
	        builder.setMotor(new Motor(1.2, 0));
	        builder.setTransmissao(Transmissao.AUTOMATICO);
	        builder.setComputadorBordo(new ComputadorBordo());
	        builder.setNavegadorGPS(new NavegadorGPS());
	    }

	    public void construirCarroRural(Builder builder) {
	        builder.setCarroTipo(CarroTipo.CARRO_RURAL);
	        builder.setAssentos(4);
	        builder.setMotor(new Motor(2.5, 0));
	        builder.setTransmissao(Transmissao.MANUAL);
	        builder.setNavegadorGPS(new NavegadorGPS());
	    }

}
