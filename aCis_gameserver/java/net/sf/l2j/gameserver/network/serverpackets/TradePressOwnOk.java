package net.sf.l2j.gameserver.network.serverpackets;

import org.slf4j.LoggerFactory;

public final class TradePressOwnOk extends L2GameServerPacket {

	public static final TradePressOwnOk STATIC_PACKET = new TradePressOwnOk();

	private TradePressOwnOk() {
	}

	@Override
	protected void writeImpl() {
		writeC(0x75);
	}
}
