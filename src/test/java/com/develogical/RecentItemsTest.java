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

    @Test
    public void RetrieveFromList(){
        String expected = "test";
        recentItems.add("test");
        assertEquals(expected,recentItems.retrieve(0));
    }


    @Test
    public void MostRecentAdd(){
        String expected = "test2";
        recentItems.add("test");
        recentItems.add("test1");
        recentItems.add("test2");
        assertEquals(expected,recentItems.retrieve(0));
        assertEquals("test", recentItems.retrieve(2));
    }

    @Test
    public void DuplicateAdd(){
        String expected = "test";
        recentItems.add("test");
        recentItems.add("test1");
        recentItems.add("test2");
        recentItems.add("test");
        assertEquals(expected,recentItems.retrieve(0));
        assertEquals("test2",recentItems.retrieve(1));
        assertEquals("test1",recentItems.retrieve(2));
        assertEquals(3,recentItems.size());
    }

    }
