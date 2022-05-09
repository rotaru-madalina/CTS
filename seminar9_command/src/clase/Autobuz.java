package clase;

public class Autobuz {
     private String modelAutobuz;

     public Autobuz(String modelAutobuz) {
          this.modelAutobuz = modelAutobuz;
     }

     public void pleacaInCursa(int linie) {
          System.out.println("Autobuzul " + modelAutobuz + " pleaca in cursa pe linia: " + linie);
     }
}
