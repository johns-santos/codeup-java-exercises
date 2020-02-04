


public class rpgMain{

    public static void main(String[] args) {
        // TODO: Auto-generated method stub
        rpgGame.printHeading("Testing helper methods!");
        rpgGame.anythingToContinue();
        rpgGame.clearConsole();
        int input = rpgGame.readInt("Enter 1, 2 or 3: ", 3);
        System.out.println("You chose number " + input);

    }

}
