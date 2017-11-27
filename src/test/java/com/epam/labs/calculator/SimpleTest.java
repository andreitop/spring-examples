package com.epam.labs.calculator;

import com.epam.labs.calculator.operations.BinaryOperation;
import com.epam.labs.calculator.operations.DoubleBinaryOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SimpleTest {

    private ApplicationContext context;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("spring-context.xml");

    }

    @Test
    public void testConfig() {
        Calculator binaryCalculator = (Calculator) context.getBean("binaryCalculator");
        assertNotNull(binaryCalculator.calculate());
        assertEquals(3, context.getBeanDefinitionCount());
    }

    @Test
    public void testIntBinaryCalculator() {
        BinaryOperation intBinaryOperation = (BinaryOperation) context.getBean("intBinaryOperation");
        assertNotNull(intBinaryOperation);
        assertEquals("17", intBinaryOperation.sum());
    }

    @Test
    public void testDoubleBinaryCalculator() {
        BinaryOperation doubleBinaryOperation = (BinaryOperation) context.getBean("doubleBinaryOperation");
        assertNotNull(doubleBinaryOperation);
        assertEquals("2.0", doubleBinaryOperation.div());
    }


    @After
    public void tearDown() {
        ((ConfigurableApplicationContext) context).close();

    }
}
