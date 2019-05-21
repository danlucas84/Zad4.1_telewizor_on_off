public class TelevisorTest {

    public static void main(String[] args) {


        Televisor tele = new Televisor(false);
        tele.showStatus();
        tele.turnOn();
        tele.showStatus();
        tele.turnOff();
        tele.showStatus();
    }
}
