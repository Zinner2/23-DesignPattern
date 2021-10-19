package com.jj.command;

/**
 * @author 张俊杰
 * @date 2021/10/19  - {TIME}
 */
public class CCTV1Command extends Command {
    public CCTV1Command(Television television) {
        super(television);
    }

    @Override
    public void execute() {
       television.playCCTV1();
    }

}
class CCTV2Command extends Command {
    public CCTV2Command(Television television) {
        super(television);
    }

    @Override
    public void execute() {
        television.playCCTV2();
    }

}
