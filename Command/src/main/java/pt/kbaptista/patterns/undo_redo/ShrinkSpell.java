package pt.kbaptista.patterns.undo_redo;


import pt.kbaptista.patterns.models.Size;
import pt.kbaptista.patterns.models.Target;

public class ShrinkSpell extends Spell {
    private Size oldSize;


    @Override
    public void execute(Target target) {
        oldSize = target.getSize();
        target.setSize(Size.SMALL);
        this.target = target;
    }

    @Override
    public void undo() {
        if (target != null && oldSize != null) {
            target.setSize(oldSize);
            oldSize = null;
        }
    }

    @Override
    public void redo() {
        if (target != null) {
            target.setSize(Size.SMALL);
        }
    }
}
