package creacionales.Builder.ejemplo_practico;

import creacionales.Builder.ejemplo_practico.patron.Persona;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona.Builder()
                .nombre("Esteban")     // retorna el objeto Builder
                .telefono("123-11111") // retorna el objeto Builder
                .build();              // retorna un nuevo objeto Persona
    }
}
