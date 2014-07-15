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
 * Filename: Interpreter.java
 *
 * Author: Jose San Leandro Armendariz
 *
 * Description: Interpreter to perform basic arithmetic calculations.
 *
 * Date: 2014/07/15
 * Time: 08:09
 *
 */
package org.acmsl.katas.antlr4netty;

/*
 * Importing JetBrains annotations.
 */
import org.jetbrains.annotations.NotNull;

/*
 * Importing checkthread.org annotations.
 */
import org.checkthread.annotations.ThreadSafe;

import java.math.BigDecimal;

/**
 * Interpreter to perform basic arithmetic calculations.
 * @author <a href="mailto:queryj@acm-sl.org">Jose San Leandro</a>
 * @since 3.0
 * Created: 2014/07/15 08:09
 */
@ThreadSafe
public class Interpreter
{
    /**
     * The operation to evaluate.
     */
    private String operation;

    /**
     * Creates a new instance to evaluate given operation.
     * @param op the operation to evaluate.
     */
    public Interpreter(@NotNull final String op)
    {
        this.operation = op;
    }
    /**
     * Evaluates the operation.
     * @return the result of the operation.
     */
    @NotNull
    public BigDecimal eval()
    {
        return null;
    }
}
