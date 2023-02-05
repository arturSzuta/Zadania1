package JavaAdvanced.Day2.interfaces;

public interface MediaPlayer {
        public static final String INTERFACE_NAME = "MediaPlayer";

        public abstract void stop();
        public default void next(){
                System.out.println("Default interface method");
        }
        public static String getInterfaceName() {
                return INTERFACE_NAME;
        }
}
