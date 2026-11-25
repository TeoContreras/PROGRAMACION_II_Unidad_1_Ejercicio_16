public class main {
    static void main(String[] args) {
    Videojuego[] juegos={
      new Videojuego("Lol","MOBA",-15),
      new Videojuego("Silent Hill", "Terror",76)};
    for (Videojuego v: juegos){
    System.out.println("Simulacion de sesion:");
    System.out.println("Juego:"+v.getNombre());
    System.out.println("Genero:"+v.getGenero());
    System.out.println("Horas jugadas: "+v.getHorasJugadas());
    System.out.println("Horas de la sesion: 8");
    System.out.println("Juego prolongado:"+v.esJuegoProlongado(8));
    System.out.println("--------------");
    }
    }
}
