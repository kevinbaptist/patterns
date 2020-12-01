package pt.kbaptista.patterns.undo_redo;

import pt.kbaptista.patterns.models.Target;

public interface Command {
	void execute(Target target);
	void undo();
	void redo();
}
