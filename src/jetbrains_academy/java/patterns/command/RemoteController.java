package jetbrains_academy.java.patterns.command;

import java.util.Scanner;

public class RemoteController {

    public static void main(String[] args) {

        Controller controller = new Controller();
        TV tv = new TV();

        int[] channelList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            channelList[i] = scanner.nextInt();
        }

        CommandTv turnOnTV = new TurnOnCommand(tv);
        /* write your code here */
        turnOnTV.execute();

        CommandTv changeChannel;
        for (int i = 0; i < 3; i++) {
            /* write your code here */
            changeChannel = new ChangeChannelCommand(new Channel(new TV(), channelList[i]));
            controller.setCommand(changeChannel);
            controller.executeCommand();
        }

        CommandTv turnOffTV = new TurnOffCommand(tv);
        /* write your code here */
        turnOffTV.execute();
    }
}

class TV {

    Channel channel;

    void turnOn() {
        System.out.println("Turning on the TV");
        setChannel(new Channel(this, 0));
    }

    void turnOff() {
        /* write your code here */
    }

    void setChannel(Channel channel) {
        this.channel = channel;
    }
}

class Channel {
    private TV tv;
    private int channelNumber;

    Channel(TV tv, int channelNumber) {
        /* write your code here */
        this.tv = tv;
        this.channelNumber = channelNumber;
    }

    void changeChannel() {
        tv.setChannel(this);
        System.out.println("Channel was changed to " + channelNumber);
    }
}

interface CommandTv {
    /* write your code here */
    void execute();
}

class TurnOnCommand implements CommandTv {
    /* write your code here */
    private TV tv;

    TurnOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        /* write your code here */
        System.out.println("Turning on the TV");
    }
}

class TurnOffCommand implements CommandTv {
    /* write your code here */
    private TV tv;

    TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        /* write your code here */
        System.out.println("Turning off the TV");
    }
}

class ChangeChannelCommand implements CommandTv {

    private Channel channel;

    ChangeChannelCommand(Channel channel) {
        this.channel = channel;
    }

    @Override
    /* write your code here */
    public void execute() {
        channel.changeChannel();
    }
}

class Controller {
    private CommandTv command;

    void setCommand(CommandTv command) {
        this.command = command;
    }

    void executeCommand() {
        /* write your code here */
        command.execute();
    }
}
