package fi.matiaspaavilainen.masuitechat.channels;

import fi.matiaspaavilainen.masuitechat.Utilities;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.connection.ProxiedPlayer;

public class Server {
    public static void sendMessage(ProxiedPlayer p, String msg) {
        for (ProxiedPlayer players : ProxyServer.getInstance().getServerInfo(p.getServer().getInfo().getName()).getPlayers()) {
            players.sendMessage(Utilities.chatFormat(p, msg,"server"));
        }
    }
}
