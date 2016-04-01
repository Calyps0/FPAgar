/**
 * This file is part of Ogar.
 *
 * Ogar is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Ogar is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Ogar.  If not, see <http://www.gnu.org/licenses/>.
 */
package ru.calypso.ogar.server.net.packet.s2c;

import io.netty.buffer.ByteBuf;
import ru.calypso.ogar.server.net.packet.Packet;
import ru.calypso.ogar.server.net.throwable.WrongDirectionException;

public class PacketOutDrawLine extends Packet {

    public int x;
    public int y;

    public PacketOutDrawLine() {}

    public PacketOutDrawLine(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void writeData(ByteBuf buf) {
        buf.writeShort(x);
        buf.writeShort(y);
    }

    @Override
    public void readData(ByteBuf buf) {
        throw new WrongDirectionException();
    }

}
