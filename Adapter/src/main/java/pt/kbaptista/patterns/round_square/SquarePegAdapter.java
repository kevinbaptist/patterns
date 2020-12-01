package pt.kbaptista.patterns.round_square;

public class SquarePegAdapter extends RoundPeg {
	private final SquarePeg squarePeg;

	public SquarePegAdapter(SquarePeg squarePeg) {
		this.squarePeg = squarePeg;
	}

	@Override
	public double getRadius() {
		double width = squarePeg.getWidth();
		double halfWithInSquare = ((width * width)/4);
		return Math.sqrt(halfWithInSquare * 2);
	}
}
