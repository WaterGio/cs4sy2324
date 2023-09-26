import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");

        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);

        int numOfRounds = 2;
        int playerWins = 0;
        int computerWins = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
        System.out.println("1. Start game");
        System.out.println("2. Change number of rounds");
        System.out.println("3. Exit application");

        int choice = scanner.nextInt();

        while (choice != 3) {
            if (choice == 1) {
                System.out.println("This match will be first to " + numOfRounds + " wins.");
                while (playerWins < numOfRounds && computerWins < numOfRounds) {
                    System.out.println("The computer has selected its move. Select your move:");
                    System.out.println("1. Rock\n2. Paper\n3. Scissors");
                    int playerMove = scanner.nextInt();

                    if (playerMove < 1 || playerMove > 3) {
                        System.out.println("Invalid choice. Please select a valid move.");
                        continue;
                    }

                    int computerMove = (int) Math.floor(Math.random() * 3) + 1;

                    System.out.println("Player chose " + getMoveName(playerMove) + ". Computer chose " + getMoveName(computerMove) + ".");

                    int result = Move.compareMoves(getMove(playerMove), getMove(computerMove));

                    if (result == 0) {
                        System.out.println("Player wins round!");
                        playerWins++;
                    } else if (result == 1) {
                        System.out.println("Computer wins round!");
                        computerWins++;
                    } else {
                        System.out.println("Round is tied!");
                    }

                    System.out.println("Player: " + playerWins + " - Computer: " + computerWins);
                }

                if (playerWins > computerWins) {
                    System.out.println("Player wins!");
                } else {
                    System.out.println("Computer wins!");
                }

                playerWins = 0;
                computerWins = 0;
            } else if (choice == 2) {
                System.out.print("How many wins are needed to win a match? ");
                numOfRounds = scanner.nextInt();
                System.out.println("New setting has been saved!");
            }

            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:");
            System.out.println("1. Start game");
            System.out.println("2. Change number of rounds");
            System.out.println("3. Exit application");

            choice = scanner.nextInt();
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }

    private static Move getMove(int moveNumber) {
        switch (moveNumber) {
            case 1:
                return new Move("Rock");
            case 2:
                return new Move("Paper");
            case 3:
                return new Move("Scissors");
            default:
                return null;
        }
    }

    private static String getMoveName(int moveNumber) {
        switch (moveNumber) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Unknown";
        }
    }
}
