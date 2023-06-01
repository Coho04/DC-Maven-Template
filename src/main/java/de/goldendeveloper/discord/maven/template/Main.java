package de.goldendeveloper.discord.maven.template;

import de.goldendeveloper.dcbcore.DCBot;
import de.goldendeveloper.dcbcore.DCBotBuilder;
import de.goldendeveloper.discord.maven.template.discord.DemoCommand;
import de.goldendeveloper.discord.maven.template.discord.DemoEvent;

public class Main {

    private static DCBot dcBot;

    public static void main(String[] args) {
        DCBotBuilder dcBotBuilder = new DCBotBuilder(args);
        dcBotBuilder.registerCommands(new DemoCommand());
        dcBotBuilder.registerEvents(new DemoEvent());
        dcBot = dcBotBuilder.build();
    }

    public static DCBot getDcBot() {
        return dcBot;
    }
}