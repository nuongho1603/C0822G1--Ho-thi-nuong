package FuramaResorts.Service.Ipml;

import FuramaResorts.Models.Facility;
import FuramaResorts.Models.Room;
import FuramaResorts.Service.IFacilityManagementService;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityManagementIpml implements IFacilityManagementService {
    LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> map:linkedHashMap.entrySet()){
            if (map.getValue()>=5){
            System.out.println(map.getKey().toString()+","+ map.getValue());}
        }
    }

    @Override
    public void addRoom() {
        linkedHashMap.put(infoRoom(),1);
    }

    @Override
    public void addVilla() {

    }
    public Room infoRoom(){
        Room room=new Room();
        return room;
    }
}
