package JavaAdvanced.Day2.interfaces.impl;

import JavaAdvanced.Day2.interfaces.RemoteController;

public class AcRemoteController implements RemoteController {
    @Override
    public void enable(boolean enable) {
        System.out.println("Turning AC on");
    }
}
