package AbstractFactoryPattern;

public class WindowsWidgetFactory implements WidgetFactory {
    public Button createButton() {
        return new MacWidgetFactory.WindowsButton();
    }

    public TextField createTextField() {
        return new MacWidgetFactory.WindowsTextField();
    }
}
