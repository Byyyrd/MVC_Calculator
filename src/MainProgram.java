import View.MainView;
import Controller.*;

public class MainProgram {

    public static void main(String[] args){
        MainView mainView = new MainView(new CalculatorController());
    }
}