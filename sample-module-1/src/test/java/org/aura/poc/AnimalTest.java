package org.aura.poc;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DongZhuming on 2017/7/31.
 */
public class AnimalTest {
    @Test
    public void testFly() {
        assertTrue(new Animal("bird").canFly());
    }
    @Test
    public void testCannotFly() {
        assertTrue(new Animal("dog").canFly());
        assertTrue(new Animal("cat").canFly());
    }
}