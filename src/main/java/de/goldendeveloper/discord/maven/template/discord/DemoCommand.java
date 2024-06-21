package de.goldendeveloper.discord.maven.template.discord;

import io.github.coho04.dcbcore.DCBot;
import io.github.coho04.dcbcore.interfaces.CommandInterface;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;

public class DemoCommand implements CommandInterface {

    @Override
    public CommandData commandData() {
        return Commands.slash("demo", "A demo command");
    }

    @Override
    public void runSlashCommand(SlashCommandInteractionEvent slashCommandInteractionEvent, DCBot dcBot) {
        slashCommandInteractionEvent.reply("Hello world!").queue();
    }
}
