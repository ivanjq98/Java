package OOP.Advanced;

// Step 1: Define the Button interface
interface Button {
    void render();
}

// Step 2: Implement WindowsButton and MacButton
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Windows Button.");
    }
}

class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac Button.");
    }
}

// Step 3: Define Abstract Factory
interface ButtonFactory {
    Button createButton();
}

// Step 4: Implement Concrete Factories
class WindowsButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

class MacButtonFactory implements ButtonFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}

public class Singleton {
    public static void main(String[] args) {
        ButtonFactory factory;

        // Simulating user choice
        String osType = "Windows"; // Change to "Mac" for MacButton

        if (osType.equalsIgnoreCase("Windows")) {
            factory = new WindowsButtonFactory();
        } else {
            factory = new MacButtonFactory();
        }

        Button button = factory.createButton();
        button.render();
    }
}
