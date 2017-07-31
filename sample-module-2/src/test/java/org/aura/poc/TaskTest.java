package org.aura.poc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DongZhuming on 2017/7/31.
 */
public class TaskTest {
    @Test
    public void notExecutable() throws Exception {
        assertFalse(new Task().executable());
    }

    @Test
    public void executable() throws Exception {
        assertTrue(new Task("Task1").executable());
    }

}