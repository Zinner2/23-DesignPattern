package com.jj.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class RemoteControl {

    private List<Command> commandList = new ArrayList<>();

    /**
     * 切换命令
     * @param command
     */
    public void switchCommand(Command command) {
        commandList.add(command);
        command.execute();
    }

    /**
     * 返回命令
     */
    public void back(){
        if (commandList.isEmpty()) {
            return;
        }
        int size = commandList.size();
        int preIndex = size - 2<= 0? 0: size -2;
        Command command = commandList.remove(preIndex);
        command.execute();
    }
}
