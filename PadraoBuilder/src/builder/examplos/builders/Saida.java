package builder.examplos.builders;
import builder.examplos.builders.CarroBuilder;
import builder.examplos.carros.Carro;
import builder.examplos.carros.Manual;
import builder.examplos.builders.CarroManualBuilder;
import builder.examplos.diretor.Diretor;
public class Saida {

	public static void main(String[] args) {
		  Diretor diretor = new Diretor();

	        CarroBuilder builder = new CarroBuilder();
	        diretor.construirCarroEsportivo(builder);

	        
	        Carro carro = builder.getResulto();
	        System.out.println("Carro Construido:\n" + carro.getCarroTipo());


	        CarroManualBuilder manualBuilder = new CarroManualBuilder();

	      
	        diretor.construirCarroEsportivo(manualBuilder);
	        Manual carroManual = manualBuilder.getResulto();
	        System.out.println("\nCarro Manual Construido:\n" + carroManual.imprimir());
	    }

	}


