package com.github.javarushcommunity.jrtb;

import com.github.javarushcommunity.jrtb.command.Command;
import com.github.javarushcommunity.jrtb.command.UnknownCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.javarushcommunity.jrtb.command.UnknownCommand.UNKNOWN_MESSAGE;
import static java.awt.ComponentOrientation.UNKNOWN;

@DisplayName("Unit-level testing for UnknownCommand")
public class UnknownCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return "/No correct entering";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
