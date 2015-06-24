// Generated from ../grammar/ItnmDump.g4 by ANTLR 4.5
package com.netnea.itnmdump.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ItnmDumpParser}.
 */
public interface ItnmDumpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ItnmDumpParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ItnmDumpParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(ItnmDumpParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(ItnmDumpParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(ItnmDumpParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(ItnmDumpParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(ItnmDumpParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(ItnmDumpParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(ItnmDumpParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(ItnmDumpParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#key_name}.
	 * @param ctx the parse tree
	 */
	void enterKey_name(ItnmDumpParser.Key_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#key_name}.
	 * @param ctx the parse tree
	 */
	void exitKey_name(ItnmDumpParser.Key_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(ItnmDumpParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(ItnmDumpParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ItnmDumpParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ItnmDumpParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#oql_kv}.
	 * @param ctx the parse tree
	 */
	void enterOql_kv(ItnmDumpParser.Oql_kvContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#oql_kv}.
	 * @param ctx the parse tree
	 */
	void exitOql_kv(ItnmDumpParser.Oql_kvContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#oql_hash}.
	 * @param ctx the parse tree
	 */
	void enterOql_hash(ItnmDumpParser.Oql_hashContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#oql_hash}.
	 * @param ctx the parse tree
	 */
	void exitOql_hash(ItnmDumpParser.Oql_hashContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#oql_array}.
	 * @param ctx the parse tree
	 */
	void enterOql_array(ItnmDumpParser.Oql_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#oql_array}.
	 * @param ctx the parse tree
	 */
	void exitOql_array(ItnmDumpParser.Oql_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ItnmDumpParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(ItnmDumpParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ItnmDumpParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(ItnmDumpParser.Insert_stmtContext ctx);
}