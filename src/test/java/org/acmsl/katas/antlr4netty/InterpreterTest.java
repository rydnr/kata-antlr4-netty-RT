/*
                        kata-antlr4-netty

    Copyright (C) 2002-today  Jose San Leandro Armendariz
                              chous@acm-sl.org

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    version 2 of the License, or any later version.

    This library is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    General Public License for more details.

    You should have received a copy of the GNU General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

    Thanks to ACM S.L. for distributing this library under the GPL license.
    Contact info: jose.sanleandro@acm-sl.com

 ******************************************************************************
 *
 * Filename: InterpreterTest.java
 *
 * Author: Jose San Leandro Armendariz
 *
 * Description: Tests for Interpreter class.
 *
 * Date: 2014/07/15
 * Time: 08:06
 *
 */
package org.acmsl.katas.antlr4netty;

/*
 * Importing JetBrains annotations.
 */
import org.jetbrains.annotations.NotNull;

/*
 * Importing JUnit classes.
 */
import org.junit.Assert;
import org.junit.Test;

/*
 * Importing JDK classes.
 */
import java.math.BigDecimal;

/**
 * Tests for {@link Interpreter} class.
 * @author <a href="mailto:rydner@acm-sl.org">Jose San Leandro</a>
 * @since 3.0
 * Created: 2014/07/15 08:06
 */
public class InterpreterTest
{
    /**
     * Checks whether the interpreter sums positive, single-digit integers, correctly.
     */
    @Test
    public void interpreter_sums_positive_single_digit_integers()
    {
        @NotNull final Interpreter interpreter = new Interpreter();

        Assert.assertEquals(new BigDecimal("3"), interpreter.eval("1+2"));
        Assert.assertEquals(new BigDecimal("10"), interpreter.eval("1+9"));
    }

    /**
     * Checks whether the interpreter subtracts positive, single-digit integers, correctly.
     */
    @Test
    public void interpreter_subtracts_positive_single_digit_integers()
    {
        @NotNull final Interpreter interpreter = new Interpreter();

        Assert.assertEquals(new BigDecimal("4"), interpreter.eval("4-0"));
        Assert.assertEquals(new BigDecimal("3"), interpreter.eval("5-2"));
    }

    /**
     * Checks whether the interpreter sums positive, double-digit integers, correctly.
     */
    @Test
    public void interpreter_sums_positive_double_digit_integers()
    {
        @NotNull final Interpreter interpreter = new Interpreter();

        Assert.assertEquals(new BigDecimal("41"), interpreter.eval("12+29"));
        Assert.assertEquals(new BigDecimal("102"), interpreter.eval("17+85"));
    }

    /**
     * Checks whether the interpreter subtracts positive, double-digit integers, correctly.
     */
    @Test
    public void interpreter_subtracts_positive_double_digit_integers()
    {
        @NotNull final Interpreter interpreter = new Interpreter();

        Assert.assertEquals(new BigDecimal("19"), interpreter.eval("31-12"));
        Assert.assertEquals(new BigDecimal("66"), interpreter.eval("85-19"));
    }

    /**
     * Checks whether the interpreter performs negative plus positive operations correctly.
     */
    @Test
    public void interpreter_performs_negative_plus_positive_integers()
    {
        @NotNull final Interpreter interpreter = new Interpreter();

        Assert.assertEquals(new BigDecimal("29"), interpreter.eval("-13+42"));
        Assert.assertEquals(new BigDecimal("66"), interpreter.eval("-19+85"));
    }


    /**
     * Checks whether the interpreter sums real numbers correctly.
     */
    @Test
    public void interpreter_sums_real_numbers()
    {
        @NotNull final Interpreter interpreter = new Interpreter();

        Assert.assertEquals(new BigDecimal("29.0"), interpreter.eval("-13.1+42.1"));
        Assert.assertEquals(new BigDecimal("66.1"), interpreter.eval("-19.5+85.6"));
        Assert.assertEquals(new BigDecimal("66.1"), interpreter.eval("85.6-19.5"));
    }
}
