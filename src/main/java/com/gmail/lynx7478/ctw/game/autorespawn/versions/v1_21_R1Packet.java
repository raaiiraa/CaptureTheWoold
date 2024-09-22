package com.gmail.lynx7478.ctw.game.autorespawn.versions;

import net.minecraft.network.protocol.game.ServerboundClientCommandPacket;
import org.bukkit.craftbukkit.v1_21_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

import com.gmail.lynx7478.ctw.game.autorespawn.RespawnPacket;

public class v1_21_R1Packet implements RespawnPacket
{
    private final ServerboundClientCommandPacket packet;
    public v1_21_R1Packet()
    {
        packet = new ServerboundClientCommandPacket(ServerboundClientCommandPacket.Action.PERFORM_RESPAWN);
    }

    @Override
    public void sendToPlayer(final Player player)
    {
        CraftPlayer p = (CraftPlayer)player;
        p.getHandle().connection.sendPacket(packet);
    }
}
