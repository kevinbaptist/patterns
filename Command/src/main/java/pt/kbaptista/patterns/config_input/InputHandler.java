package pt.kbaptista.patterns.config_input;

public class InputHandler {
	private final Command btnX;
	private final Command btnY;

	public InputHandler(Command btnX, Command btnY) {
		this.btnX = btnX;
		this.btnY = btnY;
	}

	public Action handleInput() {
		if (isPressed(InputType.BUTTON_X)) {
			return pressedX();
		} else if (isPressed(InputType.BUTTON_Y)) {
			return pressedY();
		}
		return null; //Nothing was pressed
	}

	public Action pressedX() {
		return btnX.execute();
	}

	public Action pressedY() {
		return btnY.execute();
	}

	private boolean isPressed(InputType btn) {
		return true; //there would be the implementation of button pressed in a game for instance
	}

	enum InputType {
		BUTTON_X,
		BUTTON_Y
	}
}
