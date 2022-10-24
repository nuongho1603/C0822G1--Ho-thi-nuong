package Police.Service.Impl;

import Police.Models.Motorcycle;
import Police.Service.IDisplayService;

import java.util.ArrayList;

public class DisplayMotoIpml extends Motorcycle implements IDisplayService {
    static ArrayList<Motorcycle> motorcycleArrayList = new ArrayList<>();

        Motorcycle motorcycle1 = new Motorcycle("99b - 123","hang1",2009,"HTN","52KwH");
        Motorcycle motorcycle2 = new Motorcycle("91b - 456","hang2",2008,"NQT","50KwH");
        Motorcycle motorcycle3 = new Motorcycle("19b - 789","hang3",2010,"NTT","59KwH");
    {
        motorcycleArrayList.add(motorcycle1);
        motorcycleArrayList.add(motorcycle2);
        motorcycleArrayList.add(motorcycle3);
    }
//        System.out.println(motorcycle1);
//        System.out.println("------------------------");
//        System.out.println(motorcycle2);
//        System.out.println("------------------------");
//        System.out.println(motorcycle3);

        @Override
        public void displayVehicle() {
        for (Motorcycle motos : motorcycleArrayList ){
            System.out.println(motos.toString());
        }
    }
}
