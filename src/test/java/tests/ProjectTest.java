/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import cst8218.bans0027.entity.Sprite;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author akhon
 */
public class ProjectTest {
    
    public ProjectTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


  @Test
    public void testGetX() {
        System.out.println("getX");
        Sprite object = new Sprite();
        
        Integer expResult = null;
        Integer result = object.getXValue();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Sprite.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        Integer x = 1;
        
        Sprite instance = new Sprite();
        instance.setXValue(x);
        
        assertEquals(x, instance.getXValue());
    }
     /**
     * Test of getY method, of class Sprite.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Sprite object = new Sprite();
        
        Integer expResult = null;
        Integer result = object.getYValue();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class Sprite.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        
        Integer y = 1;
        Sprite object = new Sprite();
        
        object.setYValue(y);
        assertEquals(y, object.getYValue());
    }
    
    
 @Test
    public void testGetxSpeed() {
        System.out.println("getxSpeed");
        Sprite object = new Sprite();
        
        Integer expResult = null;
        Integer result = object.getXSpeed();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setXSpeed method, of class Sprite.
     */
    @Test
    public void testSetxSpeed() {
        System.out.println("getxSpeed");
        Integer SpeedX = 1;
        
        Sprite object = new Sprite();
        object.setXSpeed(SpeedX);
        
        assertEquals(SpeedX, object.getXSpeed());
    }

    /**
     * Test of getYSpeed method, of class Sprite.
     */
    @Test
    public void testGetYSpeed() {
        System.out.println("getYspeed");
        Sprite object = new Sprite();
        
        Integer expResult = null;
        Integer result = object.getYSpeed();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setYSpeed method, of class Sprite.
     */
    @Test
    public void testSetYSpeed() {
        System.out.println("setySpeed");
        Integer speedY = 1;
        
        Sprite object = new Sprite();
        object.setXSpeed(speedY);
        
        assertEquals(speedY, object.getXSpeed());
    }
 
   
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        
        Sprite spriteobject = new Sprite();
        boolean Result = false;
        
        boolean resulta = spriteobject.equals(object);
        assertEquals(Result, resulta);
    }

}
