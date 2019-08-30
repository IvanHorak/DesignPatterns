package structural.bridge.problemcase;

public class RunBridgePatternProblemShowcaseExample {
    public static void main(String[] args) {

        /*If we wanted to add a new class like GreenSquare,
         we would need to implement it from the beginning
        and structure it similar to RedSquare.
        It makes the codebase bigger and we don't benefit in flexibility*/
        Circle blueCircle = new BlueCircle();
        Square redSquare = new RedSquare();

        blueCircle.applyColor();
        redSquare.applyColor();
    }
}
