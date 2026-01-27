package solid.D;

interface keyboard{
    String keyPressed();
    String keyReleased();
}
interface Mouse{
    String buttonPressed();
    String buttonReleased();
}

class BluetoothKeyboard implements keyboard{

    @Override
    public String keyPressed() {
        return "Entert Pressed in bluetoothKeyboard";    
    }

    @Override
    public String keyReleased() {
       return "Entert Released in bluetoothKeyboard";    
    }
    
}
class WiredKeyboard implements keyboard{

    @Override
    public String keyPressed() {
        return "Entert Pressed in WiredKeyboard";    
    }

    @Override
    public String keyReleased() {
       return "Entert Released in WiredKeyboard";    
    }
    
}

class BluetoothMouse implements Mouse{

    @Override
    public String buttonPressed() {
        return "Left button Pressed in BluetoothMouse";
    }

    @Override
    public String buttonReleased() {
         return "Left button Released in BluetoothMouse";
    }
    
}

class WiredMouse implements Mouse{

    @Override
    public String buttonPressed() {
        return "Left button Pressed in WiredMouse";
    }

    @Override
    public String buttonReleased() {
         return "Left button Released in WiredMouse";
    }
    
}

class MacBook {
    Mouse mouse;
    keyboard keyboard;
    public MacBook(Mouse mouse, keyboard keyboard) {
        this.mouse = mouse;
        this.keyboard = keyboard;
    }

    public void pressButton(){
        System.out.println( mouse.buttonPressed());
        System.out.println(keyboard.keyPressed());
    }

}



public class DIP {
    public static void main(String[] args) {
        Mouse mouse = new BluetoothMouse();
        keyboard keyboard = new BluetoothKeyboard();
        MacBook macBook = new MacBook(mouse, keyboard);
        macBook.pressButton();
           
    }
}
