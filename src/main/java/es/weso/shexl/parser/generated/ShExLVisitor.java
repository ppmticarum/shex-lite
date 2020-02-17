/*
 * MIT License
 *
 * Copyright (c) 2020 WESO Research Group, University of Oviedo.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

// Generated from C:/Users/Usuario/Desktop/github/weso/shex-lite/src/main/java/es/weso/shexl/parser\ShExL.g4 by ANTLR 4.8
package es.weso.shexl.parser.generated;

import es.weso.shexl.ast.*;
import java.util.*;
import java.lang.String;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShExLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ShExLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ShExLParser#shex_lite_doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShex_lite_doc(ShExLParser.Shex_lite_docContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#prefix_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_def(ShExLParser.Prefix_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#shape_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape_def(ShExLParser.Shape_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#shape_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape_body(ShExLParser.Shape_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#constraint_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_def(ShExLParser.Constraint_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#constraint_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_field(ShExLParser.Constraint_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#constraint_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_type(ShExLParser.Constraint_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#property_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_def(ShExLParser.Property_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#shape_inv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShape_inv(ShExLParser.Shape_invContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#prefix_inv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_inv(ShExLParser.Prefix_invContext ctx);
	/**
	 * Visit a parse tree produced by {@link ShExLParser#primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_type(ShExLParser.Primitive_typeContext ctx);
}