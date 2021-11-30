public class SimpletronComputer {

    public void showWelcomeMessage() {
        printWithMessageFormat("Welcome to Simpletron!");
        printWithMessageFormat("Please enter your program one instruction");
        printWithMessageFormat("(or data word) at a time. I will display");
        printWithMessageFormat("the location number and a question mark (?).");
        printWithMessageFormat("You then type the word for that location.");
        printWithMessageFormat("Type -99999 to stop entering your program.");
    }

    private void printWithMessageFormat(String message) {
        final int MAX_MESSAGE_WIDTH = 45;
        if (message != null) {
            if (message.length() > MAX_MESSAGE_WIDTH) {
                throw new IllegalArgumentException("Message is too long for formatting.");
            }
            System.out.print("*** ");
            System.out.print(message);
            for (int i = 0; i < MAX_MESSAGE_WIDTH - message.length(); i++) {
                System.out.print(" ");
            }
            System.out.print("***\n");
        }
    }
}
