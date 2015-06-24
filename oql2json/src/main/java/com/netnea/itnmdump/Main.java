package com.netnea.itnmdump;

import java.io.File;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import com.netnea.itnmdump.parser.ItnmDumpLexer;
import com.netnea.itnmdump.parser.ItnmDumpListener;
import com.netnea.itnmdump.parser.ItnmDumpParser;
import com.netnea.itnmdump.parser.ItnmDumpParser.ParseContext;

public class Main {

	public static void main(String[] args) throws Exception {

		if (args.length == 0 || !new File(args[0]).canRead()) {
			throw new RuntimeException("Usage: $0 filename");
		}

		convert(args[0]);
	}

	public static void convert(String fn) throws Exception {

		ItnmDumpLexer lexer = new ItnmDumpLexer(new ANTLRFileStream(fn));

		CommonTokenStream tokens = new CommonTokenStream(lexer);

		ItnmDumpParser parser = new ItnmDumpParser(tokens);
		parser.setBuildParseTree(true);

		ParseContext parseContext = parser.parse();
		ParseTreeWalker walker = new ParseTreeWalker();
		ItnmDumpListener listener = new ItnmDumpJSONWriter();
		walker.walk(listener, parseContext);
	}
}