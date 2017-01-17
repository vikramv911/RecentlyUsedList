package com.develogical;

import java.util.List;

/**
 * Created by vikramv on 17/01/2017.
 */
public class RecentItems {
    private List<String> listItems = new ArrayList<String>();

    boolean isEmpty(){
        return true;
    }

    public void add(String str){
        listItems.add(str);
       // System.out.println(str);
    }
}
