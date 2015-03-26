package com.pavel.bank.logic;

import com.pavel.bank.logic.impl.DoDomCommand;
import com.pavel.bank.logic.impl.DoNoSuchCommand;
import com.pavel.bank.logic.impl.DoSaxCommand;
import com.pavel.bank.logic.impl.DoStaxCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper {
    private static final CommandHelper instance = new CommandHelper();
    private static Map<CommandType, ICommand> COMMANDS = new HashMap<CommandType, ICommand>();

    public static CommandHelper getInstance(){
        return instance;
    }

    public CommandHelper(){
        COMMANDS.put(CommandType.SAX_COMMAND, new DoSaxCommand());
        COMMANDS.put(CommandType.STAX_COMMAND, new DoStaxCommand());
        COMMANDS.put(CommandType.DOM_COMMAND, new DoDomCommand());
        COMMANDS.put(CommandType.NO_SUCH_COMMAND, new DoNoSuchCommand());
    }

    public ICommand getCommand(String commandName){
        CommandType commandType = CommandType.valueOf(commandName);
        ICommand command;
        if (null != commandType){
            command = COMMANDS.get(commandType);
        }
        else {
            command = COMMANDS.get(CommandType.NO_SUCH_COMMAND);
        }
        return command;
    }
}
