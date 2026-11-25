public class Videojuego {
    private String nombre;
    private String genero;
    private double horasJugadas;

    public Videojuego(String nombre,String genero,double horasJugadas){
        this.genero=genero;
        this.nombre=nombre;
        this.horasJugadas= (horasJugadas>0) ? horasJugadas:0;
    }
    public void registrarSesion(double horas){
        horasJugadas=horasJugadas+horas;
    }
    public boolean esJuegoProlongado(double horas){
    return horasJugadas >= 50;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHorasJugadas() {
        return horasJugadas;
    }

    public String getGenero() {
        return genero;
    }
}
