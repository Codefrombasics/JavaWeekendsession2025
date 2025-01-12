package org.example.runtimepolymorphism;

// Interface
interface Instrument {
    void play();
}

// Class implementing the interface
class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("The guitar plays.");
    }
}

// Another class implementing the interface
class Piano implements Instrument {
    @Override
    public void play() {
        System.out.println("The piano plays.");
    }
}

public class RuntimePolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of Guitar and Piano
        // Instrument myGuitar is a reference
        //new Guitar(); is a object
        Instrument myGuitar = new Guitar();
        Instrument myPiano = new Piano();
        // Calling the overridden methods
        myGuitar.play(); // Output: The guitar plays.
        myPiano.play();  // Output: The piano plays.


        //using single reference
        Instrument instrument=new Guitar();
        instrument.play();
        instrument=new Piano();
        instrument.play();



    }
}
