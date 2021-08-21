package Btk_15_Abstract;

public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }

}
