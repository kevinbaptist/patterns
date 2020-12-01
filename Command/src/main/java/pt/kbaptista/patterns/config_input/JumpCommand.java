package pt.kbaptista.patterns.config_input;

public class JumpCommand implements Command {

	@Override
	public Action execute() {
		return Action.JUMP;
	}
}
