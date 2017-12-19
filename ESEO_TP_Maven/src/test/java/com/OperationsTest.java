package com;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperationsTest {
	
    @Test
    public void additionAvecDeuxNombres() {
        final long lAddition = Operations.additionner(10, 20);
        Assert.assertEquals(30, lAddition);
    }

    @Test
    public void mutiplicationAvecDeuxNombres() {
        final long lMultiplication = Operations.multiplier(10, 20);
        Assert.assertEquals(200, lMultiplication);
    }
    
}
