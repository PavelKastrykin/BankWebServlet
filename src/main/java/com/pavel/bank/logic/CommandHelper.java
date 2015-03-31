package com.pavel.bank.logic;

import com.pavel.bank.logic.impl.DoDomCommand;
import com.pavel.bank.logic.impl.DoNoSuchCommand;
import com.pavel.bank.logic.impl.DoSaxCommand;
import com.pavel.bank.logic.impl.DoStaxCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper {
    private static final CommandHelper instance = new CommandHelper();
    private Map<CommandType, ICommand> commands = new HashMap<CommandType, ICommand>();

    public static CommandHelper getInstance(){
        return instance;
    }

    public CommandHelper(){
        commands.put(CommandType.SAX_COMMAND, new DoSaxCommand());
        commands.put(CommandType.STAX_COMMAND, new DoStaxCommand());
        commands.put(CommandType.DOM_COMMAND, new DoDomCommand());
        commands.put(CommandType.NO_SUCH_COMMAND, new DoNoSuchCommand());
    }

    public ICommand getCommand(String commandName){
        CommandType commandType = CommandType.valueOf(commandName);
        ICommand command;
        if (null != commandType){
            command = commands.get(commandType);
        }
        else {
            command = commands.get(CommandType.NO_SUCH_COMMAND);
        }
        return command;
    }
}
