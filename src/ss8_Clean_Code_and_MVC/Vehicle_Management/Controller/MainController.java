package ss8_Clean_Code_and_MVC.Vehicle_Management.Controller;

import ss8_Clean_Code_and_MVC.Vehicle_Management.View.AddNewMeansOfTransportView;
import ss8_Clean_Code_and_MVC.Vehicle_Management.View.MainView;

public class MainController {
    public static void main(String[] args) {
    int choice = MainView.displayMainView();
    switch(choice){
        case 1:
            AddNewMeansOfTransportView.displayFunction1();
            break;
    }
    }
}
