package dependecy_injection;

public class Playstation {
   private Game videogame;

public Playstation(Game videogame) {
    super();
    this.videogame = videogame;
}

public Game getVideogame() {
    return videogame;
}

public void setVideogame(Game videogame) {
    this.videogame = videogame;
}
   
   public String askMyGame() {
       if(this.getVideogame()==null)return ("¡Estoy vacío!");
       return ("El juego que estoy corriendo es: "+ this.getVideogame().getTittle());
   }
}
