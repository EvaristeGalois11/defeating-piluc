package gj.quoridor.player.nave;

import gj.quoridor.player.Player;

public class NavePlayer implements Player {
	private Player evilPlayer = null;

	public NavePlayer() {
		try {
			Class.forName("gj.quoridor.engine.Quoridor");
			evilPlayer = new NormalPlayer();
		} catch (ClassNotFoundException e) {
			evilPlayer = new GuiPlayer();
		}
	}

	@Override
	public int[] move() {
		return evilPlayer.move();
	}

	@Override
	public void start(boolean arg0) {
		evilPlayer.start(arg0);
	}

	@Override
	public void tellMove(int[] arg0) {
		evilPlayer.tellMove(arg0);
	}

}