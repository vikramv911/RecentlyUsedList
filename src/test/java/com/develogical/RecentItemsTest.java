package com.develogical;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vikramv on 17/01/2017.
 */
public class RecentItemsTest {
    private RecentItems recentItems = new RecentItems();

    @Test
    public void isInitialListEmpty(){
        assertTrue(recentItems.isEmpty());
    }

    @Test
    public void AddToList(){
        recentItems.add("test");
        assertFalse(recentItems.isEmpty());
    }

}
