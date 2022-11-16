package builder.examplos.componentes;

public class NavegadorGPS {
	private String rota;

    public NavegadorGPS() {
        this.rota = "Av.Paulista";
    }

    public NavegadorGPS(String rotaManual) {
        this.rota = rotaManual;
    }

    public String getRota() {
        return rota;
    }

}
