package pt.kbaptista.patterns.undo_redo;


import pt.kbaptista.patterns.models.Target;
import pt.kbaptista.patterns.models.Visibility;

public class InvisibleSpell extends Spell {
	private Visibility oldVisibility;

	@Override
	public void execute(Target target) {
		oldVisibility = target.getVisibility();
		target.setVisibility(Visibility.INVISIBLE);
		this.target = target;
	}

	@Override
	public void undo() {
		if (target != null && oldVisibility != null) {
			target.setVisibility(oldVisibility);
			oldVisibility = null;
		}
	}

	@Override
	public void redo() {
		if (target != null) {
			target.setVisibility(Visibility.INVISIBLE);
		}
	}
}
