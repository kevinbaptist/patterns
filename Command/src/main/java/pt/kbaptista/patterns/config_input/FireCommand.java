package pt.kbaptista.patterns.config_input;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FireCommand implements Command {

	@Override
	public Action execute() {
		return Action.FIRE;
	}
}
