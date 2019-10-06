package raed_team;

import easy_soccer_lib.AbstractTeam;
import easy_soccer_lib.PlayerCommander;
import bt_team.player.BTreePlayer;
import easy_soccer_lib.utils.Vector2D;


public class BTreeTeam extends AbstractTeam {

	public BTreeTeam(String suffix) {
		super("BT-Team-" + suffix, 3, false);
	}

	@Override
	protected void launchPlayer(int ag, PlayerCommander commander) {
		double x, y;

		switch (ag) {
		case 0:
			x = -37.0d;
			y = -20.0d;
			break;
		case 1:
			x = -37.0d;
			y = 20.0d;
			break;
		default:
			x = -37.0d;
			y = 0;
		}
		
		BTreePlayer pl = new BTreePlayer(commander, new Vector2D(x, y));
		pl.start();
	}

}
