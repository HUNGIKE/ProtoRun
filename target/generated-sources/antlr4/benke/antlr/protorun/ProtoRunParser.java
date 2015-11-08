// Generated from benke/antlr/protorun/ProtoRun.g4 by ANTLR 4.5
package benke.antlr.protorun;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ProtoRunParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Bool=13, Int=14, WS=15;
	public static final int
		RULE_orexp = 0, RULE_andexp = 1, RULE_compareexp = 2, RULE_expadd = 3, 
		RULE_expmul = 4, RULE_expph = 5;
	public static final String[] ruleNames = {
		"orexp", "andexp", "compareexp", "expadd", "expmul", "expph"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'&&'", "'!'", "'=='", "'>'", "'<'", "'+'", "'-'", "'*'", 
		"'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Bool", "Int", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ProtoRun.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ProtoRunParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OrexpContext extends ParserRuleContext {
		public List<AndexpContext> andexp() {
			return getRuleContexts(AndexpContext.class);
		}
		public AndexpContext andexp(int i) {
			return getRuleContext(AndexpContext.class,i);
		}
		public OrexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).enterOrexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).exitOrexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProtoRunVisitor ) return ((ProtoRunVisitor<? extends T>)visitor).visitOrexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrexpContext orexp() throws RecognitionException {
		OrexpContext _localctx = new OrexpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_orexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			andexp();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(13);
				match(T__0);
				setState(14);
				andexp();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndexpContext extends ParserRuleContext {
		public List<CompareexpContext> compareexp() {
			return getRuleContexts(CompareexpContext.class);
		}
		public CompareexpContext compareexp(int i) {
			return getRuleContext(CompareexpContext.class,i);
		}
		public AndexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).enterAndexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).exitAndexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProtoRunVisitor ) return ((ProtoRunVisitor<? extends T>)visitor).visitAndexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndexpContext andexp() throws RecognitionException {
		AndexpContext _localctx = new AndexpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_andexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			compareexp();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(21);
				match(T__1);
				setState(22);
				compareexp();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareexpContext extends ParserRuleContext {
		public CompareexpContext compareexp() {
			return getRuleContext(CompareexpContext.class,0);
		}
		public List<ExpaddContext> expadd() {
			return getRuleContexts(ExpaddContext.class);
		}
		public ExpaddContext expadd(int i) {
			return getRuleContext(ExpaddContext.class,i);
		}
		public TerminalNode Bool() { return getToken(ProtoRunParser.Bool, 0); }
		public CompareexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).enterCompareexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).exitCompareexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProtoRunVisitor ) return ((ProtoRunVisitor<? extends T>)visitor).visitCompareexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareexpContext compareexp() throws RecognitionException {
		CompareexpContext _localctx = new CompareexpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compareexp);
		int _la;
		try {
			setState(38);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				match(T__2);
				setState(29);
				compareexp();
				}
				break;
			case T__10:
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				expadd();
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(32);
					expadd();
					}
					}
					setState(35); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0) );
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(Bool);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpaddContext extends ParserRuleContext {
		public List<ExpmulContext> expmul() {
			return getRuleContexts(ExpmulContext.class);
		}
		public ExpmulContext expmul(int i) {
			return getRuleContext(ExpmulContext.class,i);
		}
		public ExpaddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expadd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).enterExpadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).exitExpadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProtoRunVisitor ) return ((ProtoRunVisitor<? extends T>)visitor).visitExpadd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpaddContext expadd() throws RecognitionException {
		ExpaddContext _localctx = new ExpaddContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expadd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			expmul();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(41);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(42);
				expmul();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpmulContext extends ParserRuleContext {
		public List<ExpphContext> expph() {
			return getRuleContexts(ExpphContext.class);
		}
		public ExpphContext expph(int i) {
			return getRuleContext(ExpphContext.class,i);
		}
		public ExpmulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expmul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).enterExpmul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).exitExpmul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProtoRunVisitor ) return ((ProtoRunVisitor<? extends T>)visitor).visitExpmul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpmulContext expmul() throws RecognitionException {
		ExpmulContext _localctx = new ExpmulContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expmul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			expph();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(49);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(50);
				expph();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpphContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(ProtoRunParser.Int, 0); }
		public ExpaddContext expadd() {
			return getRuleContext(ExpaddContext.class,0);
		}
		public ExpphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).enterExpph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ProtoRunListener ) ((ProtoRunListener)listener).exitExpph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ProtoRunVisitor ) return ((ProtoRunVisitor<? extends T>)visitor).visitExpph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpphContext expph() throws RecognitionException {
		ExpphContext _localctx = new ExpphContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expph);
		try {
			setState(61);
			switch (_input.LA(1)) {
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(Int);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__10);
				setState(58);
				expadd();
				setState(59);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\4\3\4\3\4\3\4\3\4\6\4"+
		"$\n\4\r\4\16\4%\3\4\5\4)\n\4\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6"+
		"\3\6\3\6\7\6\66\n\6\f\6\16\69\13\6\3\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\7\2"+
		"\2\b\2\4\6\b\n\f\2\5\3\2\6\b\3\2\t\n\3\2\13\fC\2\16\3\2\2\2\4\26\3\2\2"+
		"\2\6(\3\2\2\2\b*\3\2\2\2\n\62\3\2\2\2\f?\3\2\2\2\16\23\5\4\3\2\17\20\7"+
		"\3\2\2\20\22\5\4\3\2\21\17\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3"+
		"\2\2\2\24\3\3\2\2\2\25\23\3\2\2\2\26\33\5\6\4\2\27\30\7\4\2\2\30\32\5"+
		"\6\4\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\5\3"+
		"\2\2\2\35\33\3\2\2\2\36\37\7\5\2\2\37)\5\6\4\2 #\5\b\5\2!\"\t\2\2\2\""+
		"$\5\b\5\2#!\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2\2\2\')\7\17\2"+
		"\2(\36\3\2\2\2( \3\2\2\2(\'\3\2\2\2)\7\3\2\2\2*/\5\n\6\2+,\t\3\2\2,.\5"+
		"\n\6\2-+\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\t\3\2\2\2\61/\3"+
		"\2\2\2\62\67\5\f\7\2\63\64\t\4\2\2\64\66\5\f\7\2\65\63\3\2\2\2\669\3\2"+
		"\2\2\67\65\3\2\2\2\678\3\2\2\28\13\3\2\2\29\67\3\2\2\2:@\7\20\2\2;<\7"+
		"\r\2\2<=\5\b\5\2=>\7\16\2\2>@\3\2\2\2?:\3\2\2\2?;\3\2\2\2@\r\3\2\2\2\t"+
		"\23\33%(/\67?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}