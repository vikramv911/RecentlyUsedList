package com.develogical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikramv on 17/01/2017.
 */
public class RecentItems {
    private List<String> listItems = new ArrayList<String>();

    boolean isEmpty(){
        return listItems.isEmpty();
    }

    public int size() {
        return listItems.size();
    }

    public void add(String str) {

                listItems.remove(str);
                listItems.add(0, str);

    }
    public String retrieve (Integer i){
        return listItems.get(i);
    }
}
