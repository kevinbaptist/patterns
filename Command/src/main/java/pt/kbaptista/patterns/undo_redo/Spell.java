package pt.kbaptista.patterns.undo_redo;


import pt.kbaptista.patterns.models.Target;

abstract class Spell implements Command {
	Target target;
}
