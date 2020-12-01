package pt.kbaptista.patterns.undo_redo;

import pt.kbaptista.patterns.models.Target;

import java.util.Stack;

public class Wizard {
    private final Stack<Command> undoCommandsStack;
    private final Stack<Command> redoCommandsStack;

    public Wizard() {
        this.undoCommandsStack = new Stack<>();
        this.redoCommandsStack = new Stack<>();
    }

    public void castSpell(Command command, Target target) {
        command.execute(target);
        undoCommandsStack.push(command);
    }

    public void undoLastSpell() {
        if (!undoCommandsStack.isEmpty()) {
            Command pop = undoCommandsStack.pop();
            pop.undo();
            redoCommandsStack.push(pop);
        }
    }

    public void redoLastSpell() {
        if (!redoCommandsStack.isEmpty()) {
            Command pop = redoCommandsStack.pop();
            pop.redo();
            undoCommandsStack.push(pop);
        }
    }
}
