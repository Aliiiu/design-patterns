package AbstractFactoryPattern;

public class MacWidgetFactory implements WidgetFactory {

    public Button createButton() {
        return new MacButton();
    }

    public TextField createTextField() {
        return new MacTextField();
    }

    public static class WindowsButton implements Button {
        public void render() {
            System.out.println("Windows button rendered.");
        }
    }

    public static class MacButton implements Button {
        public void render() {
            System.out.println("Mac button rendered.");
        }
    }

    public static class WindowsTextField implements TextField {
        public void render() {
            System.out.println("Windows text field rendered.");
        }
    }

    public static class MacTextField implements TextField {
        public void render() {
            System.out.println("Mac text field rendered.");
        }
    }

}
