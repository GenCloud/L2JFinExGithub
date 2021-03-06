package net.sf.l2j.gameserver.network.serverpackets;

import org.slf4j.LoggerFactory;

public final class ExRegenMax extends L2GameServerPacket {

	private final int _count;
	private final int _time;
	private final double _hpRegen;

	public ExRegenMax(int count, int time, double regenValue) {
		_count = count;
		_time = time;
		_hpRegen = regenValue * 0.66;
	}

	@Override
	protected void writeImpl() {
		writeC(0xFE);
		writeH(0x01);
		writeD(1);
		writeD(_count);
		writeD(_time);
		writeF(_hpRegen);
	}
}
