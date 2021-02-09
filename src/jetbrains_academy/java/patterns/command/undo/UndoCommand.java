package jetbrains_academy.java.patterns.command.undo;

public class UndoCommand {
    public static void main(String[] args) {
        Command moveCommand = new CommandMove();
        moveCommand.execute();
        moveCommand.undo();
    }
}

interface Movable {
    int getX();

    int getY();

    void setX(int newX);

    void setY(int newY);
}

interface Storable {
    int getInventoryLength();

    String getInventoryItem(int index);

    void setInventoryItem(int index, String item);
}

interface Command {
    void execute();

    void undo();
}

class CommandMove implements Command {
    Movable entity;
    int xMovement;
    int yMovement;
    int previousX;
    int previousY;

    public void execute() {
        previousX = entity.getX();
        previousY = entity.getY();
        entity.setX(previousX + xMovement);
        entity.setY(previousY + yMovement);
    }

    public void undo() {
        entity.setX(previousX);
        entity.setY(previousY);
    }
}

class CommandPutItem implements Command {
    Storable entity;
    String item;

    public void execute() {
        for (int i = 0; i < entity.getInventoryLength(); i++) {
            if (entity.getInventoryItem(i) == null) {
                entity.setInventoryItem(i, item);
                break;
            }
        }
    }

    public void undo() {
        for (int i = entity.getInventoryLength() - 1; i >= 0; i--) {
            if (entity.getInventoryItem(i) != null) {
                entity.setInventoryItem(i, null);
                break;
            }
        }
    }
}