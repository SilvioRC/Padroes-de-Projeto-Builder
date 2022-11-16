package builder.examplos.carros;
import builder.examplos.componentes.Motor;
import builder.examplos.componentes.NavegadorGPS;
import builder.examplos.componentes.Transmissao;
import builder.examplos.componentes.ComputadorBordo;
public class Manual {
	
	    private final CarroTipo carroTipo;
	    private final Motor motor;
	    private final int assentos;
	    private final Transmissao transmissao;
	    private final ComputadorBordo computadorBordo;
	    private final NavegadorGPS navegadorGPS;

	    public Manual(CarroTipo carroTipo, int assentos, Motor motor, Transmissao transmissao,
	                  ComputadorBordo computadorBordo, NavegadorGPS navegadorGPS) {
	        this.carroTipo = carroTipo;
	        this.assentos = assentos;
	        this.motor = motor;
	        this.transmissao = transmissao;
	        this.computadorBordo = computadorBordo;
	        this.navegadorGPS = navegadorGPS;
	    }

	    public String imprimir() {
	        String info = "";
	        info += "Tipo de carro: " + carroTipo + "\n";
	        info += "Numero de assentos: " + assentos + "\n";
	        info += "Motor: volume - " + motor.getVolume() + "; quilometragem - " + motor.getQuilometragem() + "\n";
	        info += "Transmissão: " + transmissao + "\n";
	        if (this.computadorBordo != null) {
	            info += "Computador de Bordo: Funcionando" + "\n";
	        } else {
	            info += "Computador de Bordo: Não está funcionando" + "\n";
	        }
	        if (this.navegadorGPS != null) {
	            info += "Navegador GPS: Funcionando" + "\n";
	        } else {
	            info += "Navegador GPS: Não está funcionando" + "\n";
	        }
	        return info;
	    }

}
