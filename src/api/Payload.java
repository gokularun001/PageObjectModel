package api;

import java.util.HashMap;

public class Payload {

    public static HashMap createBody(){
        HashMap hr=new HashMap<>();
        hr.put("Name","king");
        hr.put("Color","purple");
        return hr;
    }
}
