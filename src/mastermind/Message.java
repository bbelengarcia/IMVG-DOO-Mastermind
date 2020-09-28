package mastermind;

import mastermind.utils.Console;

public enum Message {

    START_GAME("----- MASTERMIND -----"),
    SEPARATOR("****"),
    PROPOSE_COMBINATION("Propose a combination: "),
    WRONG_COLORS("Wrong colors, they must be: "),
    REPETED_COLORS("Repeated colors"),
    WRONG_LENGTH("Wrong propose combination length"),
    ATTEMPT("attempt(s):"),
    ARROW("-->"),
    WHITES("whites"),
    REDS("reds");

    private String message;
    static Console console = new Console();

    private Message(String message) {
        this.message = message;
    }

    void write() {
		Message.console.write(this.message);
	}

	void writeln() {
		Message.console.writeln(this.message);
	}

	@Override
	public String toString() {
		return this.message;
	}

    
}
