package io.github.coho04.discord.maven.template;

import io.github.coho04.discord.maven.template.discord.DemoCommand;
import io.github.coho04.discord.maven.template.discord.DemoEvent;
import io.github.coho04.dcbcore.DCBot;
import io.github.coho04.dcbcore.DCBotBuilder;

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