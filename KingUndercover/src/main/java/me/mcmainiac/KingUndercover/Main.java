package me.mcmainiac.KingUndercover;

import me.mcmainiac.ArenaManager.api.ArenaType;
import me.mcmainiac.ArenaManager.api.MiniGamePlugin;
import org.bukkit.Bukkit;

public class Main extends MiniGamePlugin {
    private Game game;

    @Override
    public void onEnable() {
        name = this.getDescription().getName();
        type = ArenaType.TEAM24;

        Bukkit.getPluginManager().registerEvents(new Listeners(), this);

        game = new Game(this);
    }

    @Override
    public void onDisable() {
        game.end();
    }
}
