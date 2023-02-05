package JavaAdvanced.Day2.classTypes;

import JavaAdvanced.Day2.interfaces.RemoteController;
import JavaAdvanced.Day2.interfaces.impl.AcRemoteController;
import JavaAdvanced.Day2.interfaces.impl.TvRemoteController;

public class PolimorphismExample {
    public static void main(String[] args) {

        RemoteController remoteController;
        remoteController = new TvRemoteController();
        remoteController.enable(true);

        remoteController = new AcRemoteController();
        remoteController.enable(true);
    }
}
