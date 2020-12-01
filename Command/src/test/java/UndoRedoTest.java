import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pt.kbaptista.patterns.models.Size;
import pt.kbaptista.patterns.models.Target;
import pt.kbaptista.patterns.models.Visibility;
import pt.kbaptista.patterns.undo_redo.InvisibleSpell;
import pt.kbaptista.patterns.undo_redo.ShrinkSpell;
import pt.kbaptista.patterns.undo_redo.Wizard;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UndoRedoTest {
	private Wizard wizard;
	@BeforeEach
	void setUp() {
		wizard = new Wizard();

	}

	@Test
	void undoSpell() {
		Target target = new Target(Size.LARGE, Visibility.VISIBLE);
		assertEquals(target.getSize(), Size.LARGE);

		wizard.castSpell(new ShrinkSpell(), target);
		assertEquals(target.getSize(), Size.SMALL);

		wizard.undoLastSpell();
		assertEquals(target.getSize(), Size.LARGE);

		wizard.castSpell(new ShrinkSpell(), target);
		wizard.castSpell(new InvisibleSpell(), target);
		assertEquals(target.getVisibility(), Visibility.INVISIBLE);
		assertEquals(target.getSize(), Size.SMALL);

		wizard.undoLastSpell();
		assertEquals(target.getVisibility(), Visibility.VISIBLE);
		assertEquals(target.getSize(), Size.SMALL);

		wizard.undoLastSpell();
		assertEquals(target.getVisibility(), Visibility.VISIBLE);
		assertEquals(target.getSize(), Size.LARGE);
	}

	@Test
	void redoSpell() {
		Target target = new Target(Size.LARGE, Visibility.VISIBLE);
		assertEquals(target.getSize(), Size.LARGE);

		wizard.castSpell(new ShrinkSpell(), target);
		assertEquals(target.getSize(), Size.SMALL);

		wizard.undoLastSpell();
		assertEquals(target.getSize(), Size.LARGE);

		wizard.redoLastSpell();
		assertEquals(target.getSize(), Size.SMALL);

	}
}
