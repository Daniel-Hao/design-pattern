package com.daniel.www.command;

/**
 * desc:Invoker
 * Author: Daniel
 * Date: 2017-01-09 17:29
 *
 * Invoker是调用者（司令员）
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}
