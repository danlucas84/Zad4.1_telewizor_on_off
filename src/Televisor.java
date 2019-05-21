public class Televisor {

    boolean isTVOn;

    public Televisor(boolean isTVOn) {
        this.isTVOn = isTVOn;
    }

    boolean turnOn() {

        if (isTVOn == false) {
            System.out.println("TV wyłączony");
        } else {
            System.out.println("wlaczono TV");
        }

        return true;
    }

    boolean turnOff() {

        if (isTVOn == false) {
            System.out.println("Wyłączono TV");
        } else {
            System.out.println("Wlączono TV");

        }
        return true;
    }


    boolean showStatus() {
        if (turnOn()) {
            System.out.println("wlaczono");

            if (turnOff()) {
                System.out.println("wyłączono");
            }
        }
        return true;
    }
}





