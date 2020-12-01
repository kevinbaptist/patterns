import org.junit.jupiter.api.Test;
import pt.kbaptista.patterns.config_input.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigInputTest {

	@Test
	void whenFireCommandFireStateIsExecuted() {
		Command command = new FireCommand();
		assertEquals(Action.FIRE, command.execute());

		command = new JumpCommand();
		assertEquals(Action.JUMP, command.execute());
	}

	@Test
	void when_x_is_fire_and_y_jump() {
		Command btnX = new FireCommand();
		Command btnY = new JumpCommand();
		InputHandler inputHandler = new InputHandler(btnX, btnY);

		assertEquals(Action.FIRE, inputHandler.pressedX());
		assertEquals(Action.JUMP, inputHandler.pressedY());
	}

	@Test
	void when_x_is_jump_and_y_fire() {
		Command btnX = new JumpCommand();
		Command btnY = new FireCommand();
		InputHandler inputHandler = new InputHandler(btnX, btnY);

		assertEquals(Action.JUMP, inputHandler.pressedX());
		assertEquals(Action.FIRE, inputHandler.pressedY());
	}
}
