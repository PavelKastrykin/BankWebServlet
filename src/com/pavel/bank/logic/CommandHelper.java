package com.pavel.bank.logic;

import java.util.HashMap;
import java.util.Map;

public class CommandHelper {
    private static final CommandHelper instance = new CommandHelper();
    private Map<CommandType, ICommand> commands = new HashMap<CommandType, ICommand>();

    public static CommandHelper getInstance(){
        return instance;
    }

    public CommandHelper(){
        commands.put(CommandType.SAX_COMMAND, );
        commands.put(CommandType.STAX_COMMAND, );
        commands.put(CommandType.DOM_COMMAND, );
    }
}
