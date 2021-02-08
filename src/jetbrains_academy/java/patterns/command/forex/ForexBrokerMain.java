package jetbrains_academy.java.patterns.command.forex;

import java.util.Scanner;

public class ForexBrokerMain {
    public static void main(String[] args) {
        int[] amountList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            amountList[i] = scanner.nextInt();
        }

        Broker broker = new Broker();
        for (int i = 0; i < 3; i++) {
            Option option = new Option(amountList[i]);
            CommandForex command;
            if (amountList[i] > 0) {
                /* write your code here */
                command = new BuyCommand(option);
            } else {
                /* write your code here */
                command = new SellCommand(option);
            }
            broker.setCommand(command);
            broker.executeCommand();
        }
    }
}

class Option {
    private int amount;

    Option(int amount) {
        this.amount = amount;
    }

    void buy() {
        System.out.println(amount + " was bought");
    }

    void sell() {
        /* write your code here */
        System.out.println(amount + " was sold");
    }
}

interface CommandForex {
    /* write your code here */
    void execute();
}

class BuyCommand implements CommandForex {
    private Option option;

    BuyCommand(Option option) {
        this.option = option;
    }

    /* write your code here */
    public void execute() {
        option.buy();
    }
}

class SellCommand implements CommandForex {
    private Option option;

    SellCommand(Option option) {
        this.option = option;
    }

    /* write your code here */
    public void execute() {
        option.sell();
    }
}

class Broker {
    private CommandForex command;

    void setCommand(CommandForex command) {
        /* write your code here */
        this.command = command;
    }

    void executeCommand() {
        /* write your code here */
        command.execute();
    }
}