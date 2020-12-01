package pt.kbaptista.patterns;

import org.junit.jupiter.api.Test;
import pt.kbaptista.patterns.round_square.RoundHole;
import pt.kbaptista.patterns.round_square.RoundPeg;
import pt.kbaptista.patterns.round_square.SquarePeg;
import pt.kbaptista.patterns.round_square.SquarePegAdapter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoundSquareAdapterTest {


	@Test
	void checkSquareCanFitInRoundHole() {
		RoundHole hole = new RoundHole(5);
		RoundPeg roundPeg = new RoundPeg(5);
		assertTrue(hole.fits(roundPeg));

		SquarePeg smallSqPeg = new SquarePeg(2);
		SquarePeg largeSqPeg = new SquarePeg(20);

		SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
		SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

		assertTrue(hole.fits(smallSqPegAdapter));
		assertFalse(hole.fits(largeSqPegAdapter));
	}
}
