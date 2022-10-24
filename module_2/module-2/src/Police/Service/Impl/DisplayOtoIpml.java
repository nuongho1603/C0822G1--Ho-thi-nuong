package Police.Service.Impl;

import Police.Models.Oto;
import Police.Service.IDisplayService;

import java.util.ArrayList;

public class DisplayOtoIpml extends Oto implements IDisplayService {
    static ArrayList<Oto> otoArrayList = new ArrayList<>();
    Oto oto1 = new Oto("43a-4637","hang1",2001,"Nuongg",16,"Xe Du lich.");
    Oto oto2 = new Oto("73a-1112","hang2",1996,"TRung",16,"Xe khach.");
    Oto oto3 = new Oto("3a-1666","hang3",2004,"Nga",16,"Xe Du lich.");
    {
        otoArrayList.add(oto1);
        otoArrayList.add(oto2);
        otoArrayList.add(oto3);
    }
    @Override
    public void displayVehicle() {
       for(Oto otos : otoArrayList){
           System.out.println(otos.toString());
       }

//        System.out.println(oto1);
//        System.out.println("------------------------");
//        System.out.println(oto2);
//        System.out.println("------------------------");
//        System.out.println(oto3);
    }
}
