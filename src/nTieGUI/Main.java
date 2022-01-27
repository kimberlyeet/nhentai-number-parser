package nTieGUI;

public class Main {
	public static void main(String[] args) throws Exception {
		if (args.length != 0) {
		String numbers = args[0];
		Hen m = new Hen();
		m.tie(args);
		} else {
			Browser n = new Browser();
			n.main(args);
		}
	}
}