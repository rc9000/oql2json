package com.netnea.itnmdump;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.netnea.itnmdump.parser.ItnmDumpListener;
import com.netnea.itnmdump.parser.ItnmDumpParser.Column_nameContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.Database_nameContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.ExprContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.Insert_stmtContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.Key_nameContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.Literal_valueContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.Oql_arrayContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.Oql_hashContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.Oql_kvContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.ParseContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.Sql_stmt_listContext;
import com.netnea.itnmdump.parser.ItnmDumpParser.Table_nameContext;

public class ItnmDumpJSONWriter implements ItnmDumpListener {

	List<String> columns;
	Gson gson = new Gson();
	StringBuffer buf = new StringBuffer();
	boolean c = false;
	
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
	}

	@Override
	public void enterParse(ParseContext ctx) {
	}

	@Override
	public void exitParse(ParseContext ctx) {
		
		String json = buf.toString().replaceAll(",\\]", "]").replaceAll(",\\}", "}");
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(json);
		String prettyJsonString = gson.toJson(je);

		System.out.println(prettyJsonString);

	}

	@Override
	public void enterSql_stmt_list(Sql_stmt_listContext ctx) {
		
		buf.append("[");
	}

	@Override
	public void exitSql_stmt_list(Sql_stmt_listContext ctx) {
		buf.append("]");
	}

	@Override
	public void enterDatabase_name(Database_nameContext ctx) {
	}

	@Override
	public void exitDatabase_name(Database_nameContext ctx) {
	}

	@Override
	public void enterTable_name(Table_nameContext ctx) {
	}

	@Override
	public void exitTable_name(Table_nameContext ctx) {
	}

	@Override
	public void enterColumn_name(Column_nameContext ctx) {
		columns.add(ctx.getText());		
	}

	@Override
	public void exitColumn_name(Column_nameContext ctx) {
	}

	@Override
	public void enterKey_name(Key_nameContext ctx) {
		buf.append(gson.toJson(ctx.getText()) + ":");
	}

	@Override
	public void exitKey_name(Key_nameContext ctx) {
	}

	@Override
	public void enterLiteral_value(Literal_valueContext ctx) {
	}

	@Override
	public void exitLiteral_value(Literal_valueContext ctx) {
		
		String text = ctx.getText().replaceAll("^'", "\"").replaceAll("'$", "\"");
		buf.append(text);
	}

	@Override
	public void enterExpr(ExprContext ctx) {
	}

	@Override
	public void exitExpr(ExprContext ctx) {
		
		buf.append(",");
		
	}

	@Override
	public void enterOql_kv(Oql_kvContext ctx) {
		
		
	}

	@Override
	public void exitOql_kv(Oql_kvContext ctx) {
	}

	@Override
	public void enterOql_hash(Oql_hashContext ctx) {
		
		buf.append("{");
	}

	@Override
	public void exitOql_hash(Oql_hashContext ctx) {
		
		buf.append("}");
	}

	@Override
	public void enterOql_array(Oql_arrayContext ctx) {
		
		buf.append("[");
	}

	@Override
	public void exitOql_array(Oql_arrayContext ctx) {
		
		buf.append("]");
	}

	@Override
	public void enterInsert_stmt(Insert_stmtContext ctx) {
		
		columns = new ArrayList<String>();
		buf.append("{ \"values\": [");
	}

	@Override
	public void exitInsert_stmt(Insert_stmtContext ctx) {
		
		
		buf.append("],");
		buf.append("\"columns\":" + gson.toJson(columns));
		buf.append("},");

	}

}
