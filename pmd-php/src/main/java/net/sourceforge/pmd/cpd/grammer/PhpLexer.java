package net.sourceforge.pmd.cpd.grammer;

// Generated from PhpLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PhpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SeaWhitespace=1, HtmlText=2, XmlStart=3, PHPStart=4, HtmlScriptOpen=5, 
		HtmlStyleOpen=6, HtmlComment=7, HtmlDtd=8, HtmlOpen=9, Shebang=10, Error=11, 
		XmlText=12, XmlClose=13, PHPStartInside=14, HtmlClose=15, HtmlSlashClose=16, 
		HtmlSlash=17, HtmlEquals=18, HtmlStartQuoteString=19, HtmlStartDoubleQuoteString=20, 
		HtmlHex=21, HtmlDecimal=22, HtmlSpace=23, HtmlName=24, ErrorInside=25, 
		PHPStartInsideQuoteString=26, HtmlEndQuoteString=27, HtmlQuoteString=28, 
		ErrorHtmlQuote=29, PHPStartDoubleQuoteString=30, HtmlEndDoubleQuoteString=31, 
		HtmlDoubleQuoteString=32, ErrorHtmlDoubleQuote=33, ScriptText=34, ScriptClose=35, 
		PHPStartInsideScript=36, StyleBody=37, PHPEnd=38, Whitespace=39, MultiLineComment=40, 
		SingleLineComment=41, ShellStyleComment=42, Abstract=43, Array=44, As=45, 
		BinaryCast=46, BoolType=47, BooleanConstant=48, Break=49, Callable=50, 
		Case=51, Catch=52, Class=53, Clone=54, Const=55, Continue=56, Declare=57, 
		Default=58, Do=59, DoubleCast=60, DoubleType=61, Echo=62, Else=63, ElseIf=64, 
		Empty=65, EndDeclare=66, EndFor=67, EndForeach=68, EndIf=69, EndSwitch=70, 
		EndWhile=71, Eval=72, Exit=73, Extends=74, Final=75, Finally=76, FloatCast=77, 
		For=78, Foreach=79, Function=80, Global=81, Goto=82, If=83, Implements=84, 
		Import=85, Include=86, IncludeOnce=87, InstanceOf=88, InsteadOf=89, Int8Cast=90, 
		Int16Cast=91, Int64Type=92, IntType=93, Interface=94, IsSet=95, List=96, 
		LogicalAnd=97, LogicalOr=98, LogicalXor=99, Namespace=100, New=101, Null=102, 
		ObjectType=103, Parent_=104, Partial=105, Print=106, Private=107, Protected=108, 
		Public=109, Require=110, RequireOnce=111, Resource=112, Return=113, Static=114, 
		StringType=115, Switch=116, Throw=117, Trait=118, Try=119, Typeof=120, 
		UintCast=121, UnicodeCast=122, Unset=123, Use=124, Var=125, While=126, 
		Yield=127, Get=128, Set=129, Call=130, CallStatic=131, Constructor=132, 
		Destruct=133, Wakeup=134, Sleep=135, Autoload=136, IsSet__=137, Unset__=138, 
		ToString__=139, Invoke=140, SetState=141, Clone__=142, DebugInfo=143, 
		Namespace__=144, Class__=145, Traic__=146, Function__=147, Method__=148, 
		Line__=149, File__=150, Dir__=151, Lgeneric=152, Rgeneric=153, DoubleArrow=154, 
		Inc=155, Dec=156, IsIdentical=157, IsNoidentical=158, IsEqual=159, IsNotEq=160, 
		IsSmallerOrEqual=161, IsGreaterOrEqual=162, PlusEqual=163, MinusEqual=164, 
		MulEqual=165, Pow=166, PowEqual=167, DivEqual=168, Concaequal=169, ModEqual=170, 
		ShiftLeftEqual=171, ShiftRightEqual=172, AndEqual=173, OrEqual=174, XorEqual=175, 
		BooleanOr=176, BooleanAnd=177, ShiftLeft=178, ShiftRight=179, DoubleColon=180, 
		ObjectOperator=181, NamespaceSeparator=182, Ellipsis=183, Less=184, Greater=185, 
		Ampersand=186, Pipe=187, Bang=188, Caret=189, Plus=190, Minus=191, Asterisk=192, 
		Percent=193, Divide=194, Tilde=195, SuppressWarnings=196, Dollar=197, 
		Dot=198, QuestionMark=199, OpenRoundBracket=200, CloseRoundBracket=201, 
		OpenSquareBracket=202, CloseSquareBracket=203, OpenCurlyBracket=204, CloseCurlyBracket=205, 
		Comma=206, Colon=207, SemiColon=208, Eq=209, Quote=210, BackQuote=211, 
		VarName=212, Label=213, Octal=214, Decimal=215, Real=216, Hex=217, Binary=218, 
		BackQuoteString=219, SingleQuoteString=220, DoubleQuote=221, StartNowDoc=222, 
		StartHereDoc=223, ErrorPhp=224, CurlyDollar=225, StringPart=226, Comment=227, 
		PHPEndSingleLineComment=228, CommentEnd=229, HereDocText=230, WS=231, 
		XmlText2=232;
	public static final int
		PhpComments=2, ErrorLexem=3, SkipChannel=4;
	public static final int
		XML=1, INSIDE=2, HtmlQuoteStringMode=3, HtmlDoubleQuoteStringMode=4, SCRIPT=5, 
		STYLE=6, PHP=7, InterpolationString=8, SingleLineCommentMode=9, HereDoc=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "PhpComments", "ErrorLexem", "SkipChannel"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "XML", "INSIDE", "HtmlQuoteStringMode", "HtmlDoubleQuoteStringMode", 
		"SCRIPT", "STYLE", "PHP", "InterpolationString", "SingleLineCommentMode", 
		"HereDoc"
	};

	public static final String[] ruleNames = {
		"SeaWhitespace", "HtmlText", "XmlStart", "PHPStartEcho", "PHPStart", "HtmlScriptOpen", 
		"HtmlStyleOpen", "HtmlComment", "HtmlDtd", "HtmlOpen", "Shebang", "NumberSign", 
		"Error", "XmlText", "XmlClose", "XmlText2", "PHPStartEchoInside", "PHPStartInside", 
		"HtmlClose", "HtmlSlashClose", "HtmlSlash", "HtmlEquals", "HtmlStartQuoteString", 
		"HtmlStartDoubleQuoteString", "HtmlHex", "HtmlDecimal", "HtmlSpace", "HtmlName", 
		"ErrorInside", "PHPStartEchoInsideQuoteString", "PHPStartInsideQuoteString", 
		"HtmlEndQuoteString", "HtmlQuoteString", "ErrorHtmlQuote", "PHPStartEchoDoubleQuoteString", 
		"PHPStartDoubleQuoteString", "HtmlEndDoubleQuoteString", "HtmlDoubleQuoteString", 
		"ErrorHtmlDoubleQuote", "ScriptText", "ScriptClose", "PHPStartInsideScriptEcho", 
		"PHPStartInsideScript", "ScriptText2", "StyleBody", "PHPEnd", "Whitespace", 
		"MultiLineComment", "SingleLineComment", "ShellStyleComment", "Abstract", 
		"Array", "As", "BinaryCast", "BoolType", "BooleanConstant", "Break", "Callable", 
		"Case", "Catch", "Class", "Clone", "Const", "Continue", "Declare", "Default", 
		"Do", "DoubleCast", "DoubleType", "Echo", "Else", "ElseIf", "Empty", "EndDeclare", 
		"EndFor", "EndForeach", "EndIf", "EndSwitch", "EndWhile", "Eval", "Exit", 
		"Extends", "Final", "Finally", "FloatCast", "For", "Foreach", "Function", 
		"Global", "Goto", "If", "Implements", "Import", "Include", "IncludeOnce", 
		"InstanceOf", "InsteadOf", "Int8Cast", "Int16Cast", "Int64Type", "IntType", 
		"Interface", "IsSet", "List", "LogicalAnd", "LogicalOr", "LogicalXor", 
		"Namespace", "New", "Null", "ObjectType", "Parent_", "Partial", "Print", 
		"Private", "Protected", "Public", "Require", "RequireOnce", "Resource", 
		"Return", "Static", "StringType", "Switch", "Throw", "Trait", "Try", "Typeof", 
		"UintCast", "UnicodeCast", "Unset", "Use", "Var", "While", "Yield", "Get", 
		"Set", "Call", "CallStatic", "Constructor", "Destruct", "Wakeup", "Sleep", 
		"Autoload", "IsSet__", "Unset__", "ToString__", "Invoke", "SetState", 
		"Clone__", "DebugInfo", "Namespace__", "Class__", "Traic__", "Function__", 
		"Method__", "Line__", "File__", "Dir__", "Lgeneric", "Rgeneric", "DoubleArrow", 
		"Inc", "Dec", "IsIdentical", "IsNoidentical", "IsEqual", "IsNotEq", "IsSmallerOrEqual", 
		"IsGreaterOrEqual", "PlusEqual", "MinusEqual", "MulEqual", "Pow", "PowEqual", 
		"DivEqual", "Concaequal", "ModEqual", "ShiftLeftEqual", "ShiftRightEqual", 
		"AndEqual", "OrEqual", "XorEqual", "BooleanOr", "BooleanAnd", "ShiftLeft", 
		"ShiftRight", "DoubleColon", "ObjectOperator", "NamespaceSeparator", "Ellipsis", 
		"Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", "Plus", "Minus", 
		"Asterisk", "Percent", "Divide", "Tilde", "SuppressWarnings", "Dollar", 
		"Dot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", "OpenSquareBracket", 
		"CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", "Comma", 
		"Colon", "SemiColon", "Eq", "Quote", "BackQuote", "VarName", "Label", 
		"Octal", "Decimal", "Real", "Hex", "Binary", "BackQuoteString", "SingleQuoteString", 
		"DoubleQuote", "StartNowDoc", "StartHereDoc", "ErrorPhp", "VarNameInInterpolation", 
		"DollarString", "CurlyDollar", "CurlyString", "EscapedChar", "DoubleQuoteInInterpolation", 
		"StringPart", "Comment", "PHPEndSingleLineComment", "CommentQuestionMark", 
		"CommentEnd", "HereDocText", "PhpStartEchoFragment", "PhpStartFragment", 
		"NameChar", "NameStartChar", "ExponentPart", "Digit", "HexDigit", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'/>'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "'abstract'", "'array'", "'as'", 
		"'binary'", null, null, "'break'", "'callable'", "'case'", "'catch'", 
		"'class'", "'clone'", "'const'", "'continue'", "'declare'", "'default'", 
		"'do'", "'real'", "'double'", "'echo'", "'else'", "'elseif'", "'empty'", 
		"'enddeclare'", "'endfor'", "'endforeach'", "'endif'", "'endswitch'", 
		"'endwhile'", "'eval'", "'die'", "'extends'", "'final'", "'finally'", 
		"'float'", "'for'", "'foreach'", "'function'", "'global'", "'goto'", "'if'", 
		"'implements'", "'import'", "'include'", "'include_once'", "'instanceof'", 
		"'insteadof'", "'int8'", "'int16'", "'int64'", null, "'interface'", "'isset'", 
		"'list'", "'and'", "'or'", "'xor'", "'namespace'", "'new'", "'null'", 
		"'object'", "'parent'", "'partial'", "'print'", "'private'", "'protected'", 
		"'public'", "'require'", "'require_once'", "'resource'", "'return'", "'static'", 
		"'string'", "'switch'", "'throw'", "'trait'", "'try'", "'clrtypeof'", 
		null, "'unicode'", "'unset'", "'use'", "'var'", "'while'", "'yield'", 
		"'__get'", "'__set'", "'__call'", "'__callstatic'", "'__construct'", "'__destruct'", 
		"'__wakeup'", "'__sleep'", "'__autoload'", "'__isset'", "'__unset'", "'__tostring'", 
		"'__invoke'", "'__set_state'", "'__clone'", "'__debuginfo'", "'__namespace__'", 
		"'__class__'", "'__trait__'", "'__function__'", "'__method__'", "'__line__'", 
		"'__file__'", "'__dir__'", "'<:'", "':>'", "'=>'", "'++'", "'--'", "'==='", 
		"'!=='", "'=='", null, "'<='", "'>='", "'+='", "'-='", "'*='", "'**'", 
		"'**='", "'/='", "'.='", "'%='", "'<<='", "'>>='", "'&='", "'|='", "'^='", 
		"'||'", "'&&'", "'<<'", "'>>'", "'::'", "'->'", "'\\'", "'...'", null, 
		null, "'&'", "'|'", "'!'", "'^'", "'+'", "'-'", "'*'", "'%'", null, "'~'", 
		"'@'", null, "'.'", null, "'('", "')'", "'['", "']'", null, "'}'", "','", 
		"':'", "';'", null, "'''", "'`'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SeaWhitespace", "HtmlText", "XmlStart", "PHPStart", "HtmlScriptOpen", 
		"HtmlStyleOpen", "HtmlComment", "HtmlDtd", "HtmlOpen", "Shebang", "Error", 
		"XmlText", "XmlClose", "PHPStartInside", "HtmlClose", "HtmlSlashClose", 
		"HtmlSlash", "HtmlEquals", "HtmlStartQuoteString", "HtmlStartDoubleQuoteString", 
		"HtmlHex", "HtmlDecimal", "HtmlSpace", "HtmlName", "ErrorInside", "PHPStartInsideQuoteString", 
		"HtmlEndQuoteString", "HtmlQuoteString", "ErrorHtmlQuote", "PHPStartDoubleQuoteString", 
		"HtmlEndDoubleQuoteString", "HtmlDoubleQuoteString", "ErrorHtmlDoubleQuote", 
		"ScriptText", "ScriptClose", "PHPStartInsideScript", "StyleBody", "PHPEnd", 
		"Whitespace", "MultiLineComment", "SingleLineComment", "ShellStyleComment", 
		"Abstract", "Array", "As", "BinaryCast", "BoolType", "BooleanConstant", 
		"Break", "Callable", "Case", "Catch", "Class", "Clone", "Const", "Continue", 
		"Declare", "Default", "Do", "DoubleCast", "DoubleType", "Echo", "Else", 
		"ElseIf", "Empty", "EndDeclare", "EndFor", "EndForeach", "EndIf", "EndSwitch", 
		"EndWhile", "Eval", "Exit", "Extends", "Final", "Finally", "FloatCast", 
		"For", "Foreach", "Function", "Global", "Goto", "If", "Implements", "Import", 
		"Include", "IncludeOnce", "InstanceOf", "InsteadOf", "Int8Cast", "Int16Cast", 
		"Int64Type", "IntType", "Interface", "IsSet", "List", "LogicalAnd", "LogicalOr", 
		"LogicalXor", "Namespace", "New", "Null", "ObjectType", "Parent_", "Partial", 
		"Print", "Private", "Protected", "Public", "Require", "RequireOnce", "Resource", 
		"Return", "Static", "StringType", "Switch", "Throw", "Trait", "Try", "Typeof", 
		"UintCast", "UnicodeCast", "Unset", "Use", "Var", "While", "Yield", "Get", 
		"Set", "Call", "CallStatic", "Constructor", "Destruct", "Wakeup", "Sleep", 
		"Autoload", "IsSet__", "Unset__", "ToString__", "Invoke", "SetState", 
		"Clone__", "DebugInfo", "Namespace__", "Class__", "Traic__", "Function__", 
		"Method__", "Line__", "File__", "Dir__", "Lgeneric", "Rgeneric", "DoubleArrow", 
		"Inc", "Dec", "IsIdentical", "IsNoidentical", "IsEqual", "IsNotEq", "IsSmallerOrEqual", 
		"IsGreaterOrEqual", "PlusEqual", "MinusEqual", "MulEqual", "Pow", "PowEqual", 
		"DivEqual", "Concaequal", "ModEqual", "ShiftLeftEqual", "ShiftRightEqual", 
		"AndEqual", "OrEqual", "XorEqual", "BooleanOr", "BooleanAnd", "ShiftLeft", 
		"ShiftRight", "DoubleColon", "ObjectOperator", "NamespaceSeparator", "Ellipsis", 
		"Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", "Plus", "Minus", 
		"Asterisk", "Percent", "Divide", "Tilde", "SuppressWarnings", "Dollar", 
		"Dot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", "OpenSquareBracket", 
		"CloseSquareBracket", "OpenCurlyBracket", "CloseCurlyBracket", "Comma", 
		"Colon", "SemiColon", "Eq", "Quote", "BackQuote", "VarName", "Label", 
		"Octal", "Decimal", "Real", "Hex", "Binary", "BackQuoteString", "SingleQuoteString", 
		"DoubleQuote", "StartNowDoc", "StartHereDoc", "ErrorPhp", "CurlyDollar", 
		"StringPart", "Comment", "PHPEndSingleLineComment", "CommentEnd", "HereDocText", 
		"WS", "XmlText2"
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

	public boolean AspTags = true;
	boolean _scriptTag;
	boolean _styleTag;
	String _heredocIdentifier;
	int _prevTokenType;
	String _htmlNameText;
	boolean _phpScript;
	boolean _insideString;

	@Override
	public Token nextToken()
	{
	    CommonToken token = (CommonToken)super.nextToken();

	    if (token.getType() == PHPEnd || token.getType() == PHPEndSingleLineComment)
	    {
	        if (_mode == SingleLineCommentMode)
	        {
	            // SingleLineCommentMode for such allowed syntax:
	            // <?php echo "Hello world"; // comment ?>
	            popMode(); // exit from SingleLineComment mode.
	        }
	        popMode(); // exit from PHP mode.
	        
	        if (token.getText().equals("</script>"))
	        {
	            _phpScript = false;
	            token.setType(ScriptClose);
	        }
	        else
	        {
	            // Add semicolon to the end of statement if it is absente.
	            // For example: <?php echo "Hello world" ?>
	            if (_prevTokenType == SemiColon || _prevTokenType == Colon
	                || _prevTokenType == OpenCurlyBracket || _prevTokenType == CloseCurlyBracket)
	            {
	                token.setChannel(SkipChannel);
	            }
	            else
	            {
	                token = new CommonToken(SemiColon);
	            }
	        }
	    }
	    else if (token.getType() == HtmlName)
	    {
	        _htmlNameText = token.getText();
	    }
	    else if (token.getType() == HtmlDoubleQuoteString)
	    {
	        if (token.getText().equals("php") && _htmlNameText.equals("language"))
	        {
	            _phpScript = true;
	        }
	    }
	    else if (_mode == HereDoc)
	    {
	        // Heredoc and Nowdoc syntax support: http://php.net/manual/en/language.types.string.php#language.types.string.syntax.heredoc
	        switch (token.getType())
	        {
	            case StartHereDoc:
	            case StartNowDoc:
	                _heredocIdentifier = token.getText().substring(3).trim().replace("\'","");
	                break;

	            case HereDocText:
	                if (CheckHeredocEnd(token.getText()))
	                {
	                    popMode();
	                    if (token.getText().trim().endsWith(";"))
	                    {
	                        token = new CommonToken(SemiColon);
	                    }
	                    else
	                    {
	                        token.setChannel(SkipChannel);
	                    }
	                }
	                break;
	        }
	    }
	    else if (_mode == PHP)
	    {
	        if (_channel != HIDDEN)
	        {
	            _prevTokenType = token.getType();
	        }
	    }

	    return token;
	}

	boolean CheckHeredocEnd(String text)
	{
	    text = text.trim();
	    boolean semi = (text.length() > 0) ? (text.charAt(text.length() - 1) == ';') : false;
	    String identifier = semi ? text.substring(0, text.length() - 1) : text;
	    boolean result = identifier.equals(_heredocIdentifier);
	    return result;
	}

	public PhpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PhpLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5:
			HtmlScriptOpen_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			HtmlStyleOpen_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			HtmlClose_action((RuleContext)_localctx, actionIndex);
			break;
		case 212:
			CloseCurlyBracket_action((RuleContext)_localctx, actionIndex);
			break;
		case 234:
			CurlyDollar_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void HtmlScriptOpen_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 _scriptTag = true; 
			break;
		}
	}
	private void HtmlStyleOpen_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			 _styleTag = true; 
			break;
		}
	}
	private void HtmlClose_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:

			popMode();
			if (_scriptTag)
			{
			    if (!_phpScript)
			    {
			        pushMode(SCRIPT);
			    }
			    else
			    {
			        pushMode(PHP);
			    }
			    _scriptTag = false;
			}
			else if (_styleTag)
			{
			    pushMode(STYLE);
			    _styleTag = false;
			}

			break;
		}
	}
	private void CloseCurlyBracket_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:

			if (_insideString)
			{
			    _insideString = false;
			    setChannel(SkipChannel);
			    popMode();
			}

			break;
		}
	}
	private void CurlyDollar_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			_insideString = true;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return Shebang_sempred((RuleContext)_localctx, predIndex);
		case 45:
			return PHPEnd_sempred((RuleContext)_localctx, predIndex);
		case 229:
			return StartNowDoc_sempred((RuleContext)_localctx, predIndex);
		case 230:
			return StartHereDoc_sempred((RuleContext)_localctx, predIndex);
		case 234:
			return CurlyDollar_sempred((RuleContext)_localctx, predIndex);
		case 244:
			return PhpStartEchoFragment_sempred((RuleContext)_localctx, predIndex);
		case 245:
			return PhpStartFragment_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Shebang_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return  _input.LA(-2) <= 0 || _input.LA(-2) == '\r' || _input.LA(-2) == '\n' ;
		}
		return true;
	}
	private boolean PHPEnd_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return AspTags;
		case 2:
			return _phpScript;
		}
		return true;
	}
	private boolean StartNowDoc_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return  _input.LA(1) == '\r' || _input.LA(1) == '\n' ;
		}
		return true;
	}
	private boolean StartHereDoc_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return  _input.LA(1) == '\r' || _input.LA(1) == '\n' ;
		}
		return true;
	}
	private boolean CurlyDollar_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return _input.LA(1) == '$';
		}
		return true;
	}
	private boolean PhpStartEchoFragment_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return AspTags;
		}
		return true;
	}
	private boolean PhpStartFragment_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return AspTags;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\u00ea\u0853\b\1\b"+
		"\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5"+
		"\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16"+
		"\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25"+
		"\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34"+
		"\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4"+
		"%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60"+
		"\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67"+
		"\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\t"+
		"B\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4"+
		"N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT\4U\tU\4V\tV\4W\tW\4X\tX\4Y\t"+
		"Y\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4`\t`\4a\ta\4b\tb\4c\tc\4d\td"+
		"\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\tk\4l\tl\4m\tm\4n\tn\4o\to\4p"+
		"\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{"+
		"\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080\4\u0081\t\u0081\4\u0082"+
		"\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085\t\u0085\4\u0086\t\u0086"+
		"\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089\4\u008a\t\u008a\4\u008b"+
		"\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e\t\u008e\4\u008f\t\u008f"+
		"\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092\4\u0093\t\u0093\4\u0094"+
		"\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097\t\u0097\4\u0098\t\u0098"+
		"\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b\4\u009c\t\u009c\4\u009d"+
		"\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0\t\u00a0\4\u00a1\t\u00a1"+
		"\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4\4\u00a5\t\u00a5\4\u00a6"+
		"\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9\t\u00a9\4\u00aa\t\u00aa"+
		"\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad\4\u00ae\t\u00ae\4\u00af"+
		"\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2\t\u00b2\4\u00b3\t\u00b3"+
		"\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6\4\u00b7\t\u00b7\4\u00b8"+
		"\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb\t\u00bb\4\u00bc\t\u00bc"+
		"\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf\4\u00c0\t\u00c0\4\u00c1"+
		"\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4\t\u00c4\4\u00c5\t\u00c5"+
		"\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8\4\u00c9\t\u00c9\4\u00ca"+
		"\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd\t\u00cd\4\u00ce\t\u00ce"+
		"\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1\4\u00d2\t\u00d2\4\u00d3"+
		"\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6\t\u00d6\4\u00d7\t\u00d7"+
		"\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da\4\u00db\t\u00db\4\u00dc"+
		"\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df\t\u00df\4\u00e0\t\u00e0"+
		"\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3\4\u00e4\t\u00e4\4\u00e5"+
		"\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8\t\u00e8\4\u00e9\t\u00e9"+
		"\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec\4\u00ed\t\u00ed\4\u00ee"+
		"\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1\t\u00f1\4\u00f2\t\u00f2"+
		"\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5\4\u00f6\t\u00f6\4\u00f7"+
		"\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa\t\u00fa\4\u00fb\t\u00fb"+
		"\4\u00fc\t\u00fc\4\u00fd\t\u00fd\3\2\6\2\u0207\n\2\r\2\16\2\u0208\3\2"+
		"\3\2\3\3\6\3\u020e\n\3\r\3\16\3\u020f\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\7\t\u0241\n\t\f\t\16\t\u0244\13\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\7\n\u024f\n\n\f\n\16\n\u0252\13\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\7\f\u025e\n\f\f\f\16\f\u0261\13\f\3\r\3\r\7\r"+
		"\u0265\n\r\f\r\16\r\u0268\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\6\17\u0271"+
		"\n\17\r\17\16\17\u0272\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\5\30\u0295\n\30\3\30\3\30"+
		"\3\30\3\30\3\31\5\31\u029c\n\31\3\31\3\31\3\31\3\31\3\32\3\32\6\32\u02a4"+
		"\n\32\r\32\16\32\u02a5\3\33\6\33\u02a9\n\33\r\33\16\33\u02aa\3\34\6\34"+
		"\u02ae\n\34\r\34\16\34\u02af\3\34\3\34\3\35\3\35\7\35\u02b6\n\35\f\35"+
		"\16\35\u02b9\13\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3!\3!\5!\u02cb\n!\3!\3!\3\"\6\"\u02d0\n\"\r\"\16\"\u02d1\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\5&\u02e4\n&\3&\3&\3\'\6"+
		"\'\u02e9\n\'\r\'\16\'\u02ea\3(\3(\3(\3(\3)\6)\u02f2\n)\r)\16)\u02f3\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\5*\u02fe\n*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3,\3-\3-\3-\3-\3.\7.\u0313\n.\f.\16.\u0316\13.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\5.\u0320\n.\3.\3.\3.\3.\3/\3/\3/\5/\u0329\n/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u0337\n/\3\60\6\60\u033a\n\60\r\60\16\60\u033b\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\7\61\u0344\n\61\f\61\16\61\u0347\13\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u0352\n\62\f\62\16\62"+
		"\u0355\13\62\3\62\3\62\3\62\3\63\3\63\7\63\u035c\n\63\f\63\16\63\u035f"+
		"\13\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\58\u0385\n8\39\39\39\39\39\39\39\39\39\5"+
		"9\u0390\n9\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3"+
		"<\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3"+
		"@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\3C\3C\3C\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3"+
		"G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3"+
		"P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3"+
		"T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3X\3"+
		"X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3"+
		"[\3[\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3"+
		"^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3"+
		"`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3b\3b\3"+
		"c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3f\3f\3"+
		"f\3f\5f\u04d1\nf\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3i\3"+
		"i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3l\3l\3l\3l\3m\3m\3m\3m\3m\3m\3m\3m\3"+
		"m\3m\3n\3n\3n\3n\3o\3o\3o\3o\3o\3p\3p\3p\3p\3p\3p\3p\3q\3q\3q\3q\3q\3"+
		"q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3s\3t\3t\3t\3t\3t\3t\3t\3"+
		"t\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3v\3v\3v\3v\3v\3v\3v\3w\3w\3w\3w\3w\3"+
		"w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3y\3y\3"+
		"y\3y\3z\3z\3z\3z\3z\3z\3z\3{\3{\3{\3{\3{\3{\3{\3|\3|\3|\3|\3|\3|\3|\3"+
		"}\3}\3}\3}\3}\3}\3}\3~\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\177\3"+
		"\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3"+
		"\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u0599"+
		"\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008e\3\u008e"+
		"\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094"+
		"\3\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096\3\u0096"+
		"\3\u0096\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098"+
		"\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a\3\u009a"+
		"\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b\3\u009b"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c"+
		"\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a1\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a6"+
		"\3\u00a6\3\u00a7\3\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u06c6\n\u00a9\3\u00aa\3\u00aa\3\u00aa"+
		"\3\u00ab\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3\u00ad"+
		"\3\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b2\3\u00b2\3\u00b2\3\u00b3\3\u00b3"+
		"\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b8\3\u00b8\3\u00b8"+
		"\3\u00b9\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00bb\3\u00bb\3\u00bb"+
		"\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00be\3\u00be\3\u00be"+
		"\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c2"+
		"\3\u00c2\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c6\3\u00c6"+
		"\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00cb"+
		"\3\u00cb\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00ce\3\u00ce\3\u00cf\3\u00cf"+
		"\3\u00d0\3\u00d0\3\u00d1\3\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\3\u00d4"+
		"\3\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7\3\u00d8"+
		"\3\u00d8\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00db\3\u00db\3\u00dc\3\u00dc"+
		"\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u074c\n\u00dd\f\u00dd\16\u00dd\u074f"+
		"\13\u00dd\3\u00de\3\u00de\7\u00de\u0753\n\u00de\f\u00de\16\u00de\u0756"+
		"\13\u00de\3\u00df\3\u00df\6\u00df\u075a\n\u00df\r\u00df\16\u00df\u075b"+
		"\3\u00e0\6\u00e0\u075f\n\u00e0\r\u00e0\16\u00e0\u0760\3\u00e1\6\u00e1"+
		"\u0764\n\u00e1\r\u00e1\16\u00e1\u0765\3\u00e1\3\u00e1\7\u00e1\u076a\n"+
		"\u00e1\f\u00e1\16\u00e1\u076d\13\u00e1\3\u00e1\3\u00e1\6\u00e1\u0771\n"+
		"\u00e1\r\u00e1\16\u00e1\u0772\5\u00e1\u0775\n\u00e1\3\u00e1\5\u00e1\u0778"+
		"\n\u00e1\3\u00e1\6\u00e1\u077b\n\u00e1\r\u00e1\16\u00e1\u077c\3\u00e1"+
		"\3\u00e1\5\u00e1\u0781\n\u00e1\3\u00e2\3\u00e2\3\u00e2\3\u00e2\6\u00e2"+
		"\u0787\n\u00e2\r\u00e2\16\u00e2\u0788\3\u00e3\3\u00e3\3\u00e3\3\u00e3"+
		"\6\u00e3\u078f\n\u00e3\r\u00e3\16\u00e3\u0790\3\u00e4\3\u00e4\7\u00e4"+
		"\u0795\n\u00e4\f\u00e4\16\u00e4\u0798\13\u00e4\3\u00e4\3\u00e4\3\u00e5"+
		"\3\u00e5\3\u00e5\3\u00e5\7\u00e5\u07a0\n\u00e5\f\u00e5\16\u00e5\u07a3"+
		"\13\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\3\u00e6\3\u00e7\3\u00e7"+
		"\3\u00e7\3\u00e7\3\u00e7\7\u00e7\u07b0\n\u00e7\f\u00e7\16\u00e7\u07b3"+
		"\13\u00e7\3\u00e7\3\u00e7\3\u00e7\7\u00e7\u07b8\n\u00e7\f\u00e7\16\u00e7"+
		"\u07bb\13\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e7\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\7\u00e8\u07c7\n\u00e8\f\u00e8\16\u00e8\u07ca"+
		"\13\u00e8\3\u00e8\3\u00e8\7\u00e8\u07ce\n\u00e8\f\u00e8\16\u00e8\u07d1"+
		"\13\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\3\u00e9"+
		"\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u07de\n\u00ea\f\u00ea\16\u00ea\u07e1"+
		"\13\u00ea\3\u00ea\3\u00ea\3\u00eb\3\u00eb\3\u00eb\3\u00eb\3\u00ec\3\u00ec"+
		"\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ed\3\u00ed\3\u00ed\3\u00ed"+
		"\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ef\3\u00ef\3\u00ef\3\u00ef"+
		"\3\u00ef\3\u00f0\6\u00f0\u07ff\n\u00f0\r\u00f0\16\u00f0\u0800\3\u00f1"+
		"\6\u00f1\u0804\n\u00f1\r\u00f1\16\u00f1\u0805\3\u00f1\3\u00f1\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4"+
		"\3\u00f4\3\u00f4\3\u00f4\3\u00f5\7\u00f5\u0818\n\u00f5\f\u00f5\16\u00f5"+
		"\u081b\13\u00f5\3\u00f5\5\u00f5\u081e\n\u00f5\3\u00f5\3\u00f5\5\u00f5"+
		"\u0822\n\u00f5\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\3\u00f6\5\u00f6"+
		"\u082a\n\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u0831\n"+
		"\u00f7\3\u00f7\3\u00f7\5\u00f7\u0835\n\u00f7\3\u00f8\3\u00f8\3\u00f8\3"+
		"\u00f8\5\u00f8\u083b\n\u00f8\3\u00f9\5\u00f9\u083e\n\u00f9\3\u00fa\3\u00fa"+
		"\5\u00fa\u0842\n\u00fa\3\u00fa\6\u00fa\u0845\n\u00fa\r\u00fa\16\u00fa"+
		"\u0846\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fd\6\u00fd\u084e\n\u00fd\r"+
		"\u00fd\16\u00fd\u084f\3\u00fd\3\u00fd\7\u0242\u0250\u0314\u0345\u0819"+
		"\2\u00fe\r\3\17\4\21\5\23\2\25\6\27\7\31\b\33\t\35\n\37\13!\f#\2%\r\'"+
		"\16)\17+\u00ea-\2/\20\61\21\63\22\65\23\67\249\25;\26=\27?\30A\31C\32"+
		"E\33G\2I\34K\35M\36O\37Q\2S U!W\"Y#[$]%_\2a&c\2e\'g(i)k*m+o,q-s.u/w\60"+
		"y\61{\62}\63\177\64\u0081\65\u0083\66\u0085\67\u00878\u00899\u008b:\u008d"+
		";\u008f<\u0091=\u0093>\u0095?\u0097@\u0099A\u009bB\u009dC\u009fD\u00a1"+
		"E\u00a3F\u00a5G\u00a7H\u00a9I\u00abJ\u00adK\u00afL\u00b1M\u00b3N\u00b5"+
		"O\u00b7P\u00b9Q\u00bbR\u00bdS\u00bfT\u00c1U\u00c3V\u00c5W\u00c7X\u00c9"+
		"Y\u00cbZ\u00cd[\u00cf\\\u00d1]\u00d3^\u00d5_\u00d7`\u00d9a\u00dbb\u00dd"+
		"c\u00dfd\u00e1e\u00e3f\u00e5g\u00e7h\u00e9i\u00ebj\u00edk\u00efl\u00f1"+
		"m\u00f3n\u00f5o\u00f7p\u00f9q\u00fbr\u00fds\u00fft\u0101u\u0103v\u0105"+
		"w\u0107x\u0109y\u010bz\u010d{\u010f|\u0111}\u0113~\u0115\177\u0117\u0080"+
		"\u0119\u0081\u011b\u0082\u011d\u0083\u011f\u0084\u0121\u0085\u0123\u0086"+
		"\u0125\u0087\u0127\u0088\u0129\u0089\u012b\u008a\u012d\u008b\u012f\u008c"+
		"\u0131\u008d\u0133\u008e\u0135\u008f\u0137\u0090\u0139\u0091\u013b\u0092"+
		"\u013d\u0093\u013f\u0094\u0141\u0095\u0143\u0096\u0145\u0097\u0147\u0098"+
		"\u0149\u0099\u014b\u009a\u014d\u009b\u014f\u009c\u0151\u009d\u0153\u009e"+
		"\u0155\u009f\u0157\u00a0\u0159\u00a1\u015b\u00a2\u015d\u00a3\u015f\u00a4"+
		"\u0161\u00a5\u0163\u00a6\u0165\u00a7\u0167\u00a8\u0169\u00a9\u016b\u00aa"+
		"\u016d\u00ab\u016f\u00ac\u0171\u00ad\u0173\u00ae\u0175\u00af\u0177\u00b0"+
		"\u0179\u00b1\u017b\u00b2\u017d\u00b3\u017f\u00b4\u0181\u00b5\u0183\u00b6"+
		"\u0185\u00b7\u0187\u00b8\u0189\u00b9\u018b\u00ba\u018d\u00bb\u018f\u00bc"+
		"\u0191\u00bd\u0193\u00be\u0195\u00bf\u0197\u00c0\u0199\u00c1\u019b\u00c2"+
		"\u019d\u00c3\u019f\u00c4\u01a1\u00c5\u01a3\u00c6\u01a5\u00c7\u01a7\u00c8"+
		"\u01a9\u00c9\u01ab\u00ca\u01ad\u00cb\u01af\u00cc\u01b1\u00cd\u01b3\u00ce"+
		"\u01b5\u00cf\u01b7\u00d0\u01b9\u00d1\u01bb\u00d2\u01bd\u00d3\u01bf\u00d4"+
		"\u01c1\u00d5\u01c3\u00d6\u01c5\u00d7\u01c7\u00d8\u01c9\u00d9\u01cb\u00da"+
		"\u01cd\u00db\u01cf\u00dc\u01d1\u00dd\u01d3\u00de\u01d5\u00df\u01d7\u00e0"+
		"\u01d9\u00e1\u01db\u00e2\u01dd\2\u01df\2\u01e1\u00e3\u01e3\2\u01e5\2\u01e7"+
		"\2\u01e9\u00e4\u01eb\u00e5\u01ed\u00e6\u01ef\2\u01f1\u00e7\u01f3\u00e8"+
		"\u01f5\2\u01f7\2\u01f9\2\u01fb\2\u01fd\2\u01ff\2\u0201\2\u0203\u00e9\r"+
		"\2\3\4\5\6\7\b\t\n\13\f\31\5\2\13\f\17\17\"\"\4\2%%>>\4\2\f\f\17\17\3"+
		"\2>>\3\2AA\4\2))>>\4\2$$>>\5\2C\\aac|\6\2\62;C\\aac|\3\2\629\3\2\62\63"+
		"\3\2bb\4\2))^^\4\2\13\13\"\"\6\2$$&&^^}}\5\2\f\f\17\17AA\4\2/\60aa\5\2"+
		"\u00b9\u00b9\u0302\u0371\u2041\u2042\n\2<<C\\c|\u2072\u2191\u2c02\u2ff1"+
		"\u3003\ud801\uf902\ufdd1\ufdf2\uffff\4\2--//\3\2\62;\5\2\62;CHch\5\2\13"+
		"\f\16\17\"\"\2\u0886\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3"+
		"+\3\2\2\2\4-\3\2\2\2\4/\3\2\2\2\4\61\3\2\2\2\4\63\3\2\2\2\4\65\3\2\2\2"+
		"\4\67\3\2\2\2\49\3\2\2\2\4;\3\2\2\2\4=\3\2\2\2\4?\3\2\2\2\4A\3\2\2\2\4"+
		"C\3\2\2\2\4E\3\2\2\2\5G\3\2\2\2\5I\3\2\2\2\5K\3\2\2\2\5M\3\2\2\2\5O\3"+
		"\2\2\2\6Q\3\2\2\2\6S\3\2\2\2\6U\3\2\2\2\6W\3\2\2\2\6Y\3\2\2\2\7[\3\2\2"+
		"\2\7]\3\2\2\2\7_\3\2\2\2\7a\3\2\2\2\7c\3\2\2\2\be\3\2\2\2\tg\3\2\2\2\t"+
		"i\3\2\2\2\tk\3\2\2\2\tm\3\2\2\2\to\3\2\2\2\tq\3\2\2\2\ts\3\2\2\2\tu\3"+
		"\2\2\2\tw\3\2\2\2\ty\3\2\2\2\t{\3\2\2\2\t}\3\2\2\2\t\177\3\2\2\2\t\u0081"+
		"\3\2\2\2\t\u0083\3\2\2\2\t\u0085\3\2\2\2\t\u0087\3\2\2\2\t\u0089\3\2\2"+
		"\2\t\u008b\3\2\2\2\t\u008d\3\2\2\2\t\u008f\3\2\2\2\t\u0091\3\2\2\2\t\u0093"+
		"\3\2\2\2\t\u0095\3\2\2\2\t\u0097\3\2\2\2\t\u0099\3\2\2\2\t\u009b\3\2\2"+
		"\2\t\u009d\3\2\2\2\t\u009f\3\2\2\2\t\u00a1\3\2\2\2\t\u00a3\3\2\2\2\t\u00a5"+
		"\3\2\2\2\t\u00a7\3\2\2\2\t\u00a9\3\2\2\2\t\u00ab\3\2\2\2\t\u00ad\3\2\2"+
		"\2\t\u00af\3\2\2\2\t\u00b1\3\2\2\2\t\u00b3\3\2\2\2\t\u00b5\3\2\2\2\t\u00b7"+
		"\3\2\2\2\t\u00b9\3\2\2\2\t\u00bb\3\2\2\2\t\u00bd\3\2\2\2\t\u00bf\3\2\2"+
		"\2\t\u00c1\3\2\2\2\t\u00c3\3\2\2\2\t\u00c5\3\2\2\2\t\u00c7\3\2\2\2\t\u00c9"+
		"\3\2\2\2\t\u00cb\3\2\2\2\t\u00cd\3\2\2\2\t\u00cf\3\2\2\2\t\u00d1\3\2\2"+
		"\2\t\u00d3\3\2\2\2\t\u00d5\3\2\2\2\t\u00d7\3\2\2\2\t\u00d9\3\2\2\2\t\u00db"+
		"\3\2\2\2\t\u00dd\3\2\2\2\t\u00df\3\2\2\2\t\u00e1\3\2\2\2\t\u00e3\3\2\2"+
		"\2\t\u00e5\3\2\2\2\t\u00e7\3\2\2\2\t\u00e9\3\2\2\2\t\u00eb\3\2\2\2\t\u00ed"+
		"\3\2\2\2\t\u00ef\3\2\2\2\t\u00f1\3\2\2\2\t\u00f3\3\2\2\2\t\u00f5\3\2\2"+
		"\2\t\u00f7\3\2\2\2\t\u00f9\3\2\2\2\t\u00fb\3\2\2\2\t\u00fd\3\2\2\2\t\u00ff"+
		"\3\2\2\2\t\u0101\3\2\2\2\t\u0103\3\2\2\2\t\u0105\3\2\2\2\t\u0107\3\2\2"+
		"\2\t\u0109\3\2\2\2\t\u010b\3\2\2\2\t\u010d\3\2\2\2\t\u010f\3\2\2\2\t\u0111"+
		"\3\2\2\2\t\u0113\3\2\2\2\t\u0115\3\2\2\2\t\u0117\3\2\2\2\t\u0119\3\2\2"+
		"\2\t\u011b\3\2\2\2\t\u011d\3\2\2\2\t\u011f\3\2\2\2\t\u0121\3\2\2\2\t\u0123"+
		"\3\2\2\2\t\u0125\3\2\2\2\t\u0127\3\2\2\2\t\u0129\3\2\2\2\t\u012b\3\2\2"+
		"\2\t\u012d\3\2\2\2\t\u012f\3\2\2\2\t\u0131\3\2\2\2\t\u0133\3\2\2\2\t\u0135"+
		"\3\2\2\2\t\u0137\3\2\2\2\t\u0139\3\2\2\2\t\u013b\3\2\2\2\t\u013d\3\2\2"+
		"\2\t\u013f\3\2\2\2\t\u0141\3\2\2\2\t\u0143\3\2\2\2\t\u0145\3\2\2\2\t\u0147"+
		"\3\2\2\2\t\u0149\3\2\2\2\t\u014b\3\2\2\2\t\u014d\3\2\2\2\t\u014f\3\2\2"+
		"\2\t\u0151\3\2\2\2\t\u0153\3\2\2\2\t\u0155\3\2\2\2\t\u0157\3\2\2\2\t\u0159"+
		"\3\2\2\2\t\u015b\3\2\2\2\t\u015d\3\2\2\2\t\u015f\3\2\2\2\t\u0161\3\2\2"+
		"\2\t\u0163\3\2\2\2\t\u0165\3\2\2\2\t\u0167\3\2\2\2\t\u0169\3\2\2\2\t\u016b"+
		"\3\2\2\2\t\u016d\3\2\2\2\t\u016f\3\2\2\2\t\u0171\3\2\2\2\t\u0173\3\2\2"+
		"\2\t\u0175\3\2\2\2\t\u0177\3\2\2\2\t\u0179\3\2\2\2\t\u017b\3\2\2\2\t\u017d"+
		"\3\2\2\2\t\u017f\3\2\2\2\t\u0181\3\2\2\2\t\u0183\3\2\2\2\t\u0185\3\2\2"+
		"\2\t\u0187\3\2\2\2\t\u0189\3\2\2\2\t\u018b\3\2\2\2\t\u018d\3\2\2\2\t\u018f"+
		"\3\2\2\2\t\u0191\3\2\2\2\t\u0193\3\2\2\2\t\u0195\3\2\2\2\t\u0197\3\2\2"+
		"\2\t\u0199\3\2\2\2\t\u019b\3\2\2\2\t\u019d\3\2\2\2\t\u019f\3\2\2\2\t\u01a1"+
		"\3\2\2\2\t\u01a3\3\2\2\2\t\u01a5\3\2\2\2\t\u01a7\3\2\2\2\t\u01a9\3\2\2"+
		"\2\t\u01ab\3\2\2\2\t\u01ad\3\2\2\2\t\u01af\3\2\2\2\t\u01b1\3\2\2\2\t\u01b3"+
		"\3\2\2\2\t\u01b5\3\2\2\2\t\u01b7\3\2\2\2\t\u01b9\3\2\2\2\t\u01bb\3\2\2"+
		"\2\t\u01bd\3\2\2\2\t\u01bf\3\2\2\2\t\u01c1\3\2\2\2\t\u01c3\3\2\2\2\t\u01c5"+
		"\3\2\2\2\t\u01c7\3\2\2\2\t\u01c9\3\2\2\2\t\u01cb\3\2\2\2\t\u01cd\3\2\2"+
		"\2\t\u01cf\3\2\2\2\t\u01d1\3\2\2\2\t\u01d3\3\2\2\2\t\u01d5\3\2\2\2\t\u01d7"+
		"\3\2\2\2\t\u01d9\3\2\2\2\t\u01db\3\2\2\2\n\u01dd\3\2\2\2\n\u01df\3\2\2"+
		"\2\n\u01e1\3\2\2\2\n\u01e3\3\2\2\2\n\u01e5\3\2\2\2\n\u01e7\3\2\2\2\n\u01e9"+
		"\3\2\2\2\13\u01eb\3\2\2\2\13\u01ed\3\2\2\2\13\u01ef\3\2\2\2\13\u01f1\3"+
		"\2\2\2\f\u01f3\3\2\2\2\f\u0203\3\2\2\2\r\u0206\3\2\2\2\17\u020d\3\2\2"+
		"\2\21\u0211\3\2\2\2\23\u0219\3\2\2\2\25\u021e\3\2\2\2\27\u0223\3\2\2\2"+
		"\31\u022f\3\2\2\2\33\u023a\3\2\2\2\35\u024b\3\2\2\2\37\u0255\3\2\2\2!"+
		"\u0259\3\2\2\2#\u0262\3\2\2\2%\u026b\3\2\2\2\'\u0270\3\2\2\2)\u0274\3"+
		"\2\2\2+\u0279\3\2\2\2-\u027d\3\2\2\2/\u0282\3\2\2\2\61\u0287\3\2\2\2\63"+
		"\u028a\3\2\2\2\65\u028f\3\2\2\2\67\u0291\3\2\2\29\u0294\3\2\2\2;\u029b"+
		"\3\2\2\2=\u02a1\3\2\2\2?\u02a8\3\2\2\2A\u02ad\3\2\2\2C\u02b3\3\2\2\2E"+
		"\u02ba\3\2\2\2G\u02be\3\2\2\2I\u02c3\3\2\2\2K\u02c8\3\2\2\2M\u02cf\3\2"+
		"\2\2O\u02d3\3\2\2\2Q\u02d7\3\2\2\2S\u02dc\3\2\2\2U\u02e1\3\2\2\2W\u02e8"+
		"\3\2\2\2Y\u02ec\3\2\2\2[\u02f1\3\2\2\2]\u02f5\3\2\2\2_\u0303\3\2\2\2a"+
		"\u0308\3\2\2\2c\u030d\3\2\2\2e\u0314\3\2\2\2g\u0336\3\2\2\2i\u0339\3\2"+
		"\2\2k\u033f\3\2\2\2m\u034d\3\2\2\2o\u0359\3\2\2\2q\u0363\3\2\2\2s\u036c"+
		"\3\2\2\2u\u0372\3\2\2\2w\u0375\3\2\2\2y\u037c\3\2\2\2{\u038f\3\2\2\2}"+
		"\u0391\3\2\2\2\177\u0397\3\2\2\2\u0081\u03a0\3\2\2\2\u0083\u03a5\3\2\2"+
		"\2\u0085\u03ab\3\2\2\2\u0087\u03b1\3\2\2\2\u0089\u03b7\3\2\2\2\u008b\u03bd"+
		"\3\2\2\2\u008d\u03c6\3\2\2\2\u008f\u03ce\3\2\2\2\u0091\u03d6\3\2\2\2\u0093"+
		"\u03d9\3\2\2\2\u0095\u03de\3\2\2\2\u0097\u03e5\3\2\2\2\u0099\u03ea\3\2"+
		"\2\2\u009b\u03ef\3\2\2\2\u009d\u03f6\3\2\2\2\u009f\u03fc\3\2\2\2\u00a1"+
		"\u0407\3\2\2\2\u00a3\u040e\3\2\2\2\u00a5\u0419\3\2\2\2\u00a7\u041f\3\2"+
		"\2\2\u00a9\u0429\3\2\2\2\u00ab\u0432\3\2\2\2\u00ad\u0437\3\2\2\2\u00af"+
		"\u043b\3\2\2\2\u00b1\u0443\3\2\2\2\u00b3\u0449\3\2\2\2\u00b5\u0451\3\2"+
		"\2\2\u00b7\u0457\3\2\2\2\u00b9\u045b\3\2\2\2\u00bb\u0463\3\2\2\2\u00bd"+
		"\u046c\3\2\2\2\u00bf\u0473\3\2\2\2\u00c1\u0478\3\2\2\2\u00c3\u047b\3\2"+
		"\2\2\u00c5\u0486\3\2\2\2\u00c7\u048d\3\2\2\2\u00c9\u0495\3\2\2\2\u00cb"+
		"\u04a2\3\2\2\2\u00cd\u04ad\3\2\2\2\u00cf\u04b7\3\2\2\2\u00d1\u04bc\3\2"+
		"\2\2\u00d3\u04c2\3\2\2\2\u00d5\u04c8\3\2\2\2\u00d7\u04d2\3\2\2\2\u00d9"+
		"\u04dc\3\2\2\2\u00db\u04e2\3\2\2\2\u00dd\u04e7\3\2\2\2\u00df\u04eb\3\2"+
		"\2\2\u00e1\u04ee\3\2\2\2\u00e3\u04f2\3\2\2\2\u00e5\u04fc\3\2\2\2\u00e7"+
		"\u0500\3\2\2\2\u00e9\u0505\3\2\2\2\u00eb\u050c\3\2\2\2\u00ed\u0513\3\2"+
		"\2\2\u00ef\u051b\3\2\2\2\u00f1\u0521\3\2\2\2\u00f3\u0529\3\2\2\2\u00f5"+
		"\u0533\3\2\2\2\u00f7\u053a\3\2\2\2\u00f9\u0542\3\2\2\2\u00fb\u054f\3\2"+
		"\2\2\u00fd\u0558\3\2\2\2\u00ff\u055f\3\2\2\2\u0101\u0566\3\2\2\2\u0103"+
		"\u056d\3\2\2\2\u0105\u0574\3\2\2\2\u0107\u057a\3\2\2\2\u0109\u0580\3\2"+
		"\2\2\u010b\u0584\3\2\2\2\u010d\u058e\3\2\2\2\u010f\u059a\3\2\2\2\u0111"+
		"\u05a2\3\2\2\2\u0113\u05a8\3\2\2\2\u0115\u05ac\3\2\2\2\u0117\u05b0\3\2"+
		"\2\2\u0119\u05b6\3\2\2\2\u011b\u05bc\3\2\2\2\u011d\u05c2\3\2\2\2\u011f"+
		"\u05c8\3\2\2\2\u0121\u05cf\3\2\2\2\u0123\u05dc\3\2\2\2\u0125\u05e8\3\2"+
		"\2\2\u0127\u05f3\3\2\2\2\u0129\u05fc\3\2\2\2\u012b\u0604\3\2\2\2\u012d"+
		"\u060f\3\2\2\2\u012f\u0617\3\2\2\2\u0131\u061f\3\2\2\2\u0133\u062a\3\2"+
		"\2\2\u0135\u0633\3\2\2\2\u0137\u063f\3\2\2\2\u0139\u0647\3\2\2\2\u013b"+
		"\u0653\3\2\2\2\u013d\u0661\3\2\2\2\u013f\u066b\3\2\2\2\u0141\u0675\3\2"+
		"\2\2\u0143\u0682\3\2\2\2\u0145\u068d\3\2\2\2\u0147\u0696\3\2\2\2\u0149"+
		"\u069f\3\2\2\2\u014b\u06a7\3\2\2\2\u014d\u06aa\3\2\2\2\u014f\u06ad\3\2"+
		"\2\2\u0151\u06b0\3\2\2\2\u0153\u06b3\3\2\2\2\u0155\u06b6\3\2\2\2\u0157"+
		"\u06ba\3\2\2\2\u0159\u06be\3\2\2\2\u015b\u06c5\3\2\2\2\u015d\u06c7\3\2"+
		"\2\2\u015f\u06ca\3\2\2\2\u0161\u06cd\3\2\2\2\u0163\u06d0\3\2\2\2\u0165"+
		"\u06d3\3\2\2\2\u0167\u06d6\3\2\2\2\u0169\u06d9\3\2\2\2\u016b\u06dd\3\2"+
		"\2\2\u016d\u06e0\3\2\2\2\u016f\u06e3\3\2\2\2\u0171\u06e6\3\2\2\2\u0173"+
		"\u06ea\3\2\2\2\u0175\u06ee\3\2\2\2\u0177\u06f1\3\2\2\2\u0179\u06f4\3\2"+
		"\2\2\u017b\u06f7\3\2\2\2\u017d\u06fa\3\2\2\2\u017f\u06fd\3\2\2\2\u0181"+
		"\u0700\3\2\2\2\u0183\u0703\3\2\2\2\u0185\u0706\3\2\2\2\u0187\u0709\3\2"+
		"\2\2\u0189\u070b\3\2\2\2\u018b\u070f\3\2\2\2\u018d\u0711\3\2\2\2\u018f"+
		"\u0713\3\2\2\2\u0191\u0715\3\2\2\2\u0193\u0717\3\2\2\2\u0195\u0719\3\2"+
		"\2\2\u0197\u071b\3\2\2\2\u0199\u071d\3\2\2\2\u019b\u071f\3\2\2\2\u019d"+
		"\u0721\3\2\2\2\u019f\u0723\3\2\2\2\u01a1\u0725\3\2\2\2\u01a3\u0727\3\2"+
		"\2\2\u01a5\u0729\3\2\2\2\u01a7\u072b\3\2\2\2\u01a9\u072d\3\2\2\2\u01ab"+
		"\u072f\3\2\2\2\u01ad\u0731\3\2\2\2\u01af\u0733\3\2\2\2\u01b1\u0735\3\2"+
		"\2\2\u01b3\u0737\3\2\2\2\u01b5\u0739\3\2\2\2\u01b7\u073c\3\2\2\2\u01b9"+
		"\u073e\3\2\2\2\u01bb\u0740\3\2\2\2\u01bd\u0742\3\2\2\2\u01bf\u0744\3\2"+
		"\2\2\u01c1\u0746\3\2\2\2\u01c3\u0748\3\2\2\2\u01c5\u0750\3\2\2\2\u01c7"+
		"\u0757\3\2\2\2\u01c9\u075e\3\2\2\2\u01cb\u0780\3\2\2\2\u01cd\u0782\3\2"+
		"\2\2\u01cf\u078a\3\2\2\2\u01d1\u0792\3\2\2\2\u01d3\u079b\3\2\2\2\u01d5"+
		"\u07a6\3\2\2\2\u01d7\u07aa\3\2\2\2\u01d9\u07c1\3\2\2\2\u01db\u07d6\3\2"+
		"\2\2\u01dd\u07da\3\2\2\2\u01df\u07e4\3\2\2\2\u01e1\u07e8\3\2\2\2\u01e3"+
		"\u07ef\3\2\2\2\u01e5\u07f3\3\2\2\2\u01e7\u07f8\3\2\2\2\u01e9\u07fe\3\2"+
		"\2\2\u01eb\u0803\3\2\2\2\u01ed\u0809\3\2\2\2\u01ef\u080c\3\2\2\2\u01f1"+
		"\u0811\3\2\2\2\u01f3\u0819\3\2\2\2\u01f5\u0823\3\2\2\2\u01f7\u082b\3\2"+
		"\2\2\u01f9\u083a\3\2\2\2\u01fb\u083d\3\2\2\2\u01fd\u083f\3\2\2\2\u01ff"+
		"\u0848\3\2\2\2\u0201\u084a\3\2\2\2\u0203\u084d\3\2\2\2\u0205\u0207\t\2"+
		"\2\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\b\2\2\2\u020b\16\3\2\2"+
		"\2\u020c\u020e\n\3\2\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\20\3\2\2\2\u0211\u0212\7>\2\2\u0212"+
		"\u0213\7A\2\2\u0213\u0214\7z\2\2\u0214\u0215\7o\2\2\u0215\u0216\7n\2\2"+
		"\u0216\u0217\3\2\2\2\u0217\u0218\b\4\3\2\u0218\22\3\2\2\2\u0219\u021a"+
		"\5\u01f5\u00f6\2\u021a\u021b\3\2\2\2\u021b\u021c\b\5\4\2\u021c\u021d\b"+
		"\5\5\2\u021d\24\3\2\2\2\u021e\u021f\5\u01f7\u00f7\2\u021f\u0220\3\2\2"+
		"\2\u0220\u0221\b\6\6\2\u0221\u0222\b\6\5\2\u0222\26\3\2\2\2\u0223\u0224"+
		"\7>\2\2\u0224\u0225\7u\2\2\u0225\u0226\7e\2\2\u0226\u0227\7t\2\2\u0227"+
		"\u0228\7k\2\2\u0228\u0229\7r\2\2\u0229\u022a\7v\2\2\u022a\u022b\3\2\2"+
		"\2\u022b\u022c\b\7\7\2\u022c\u022d\3\2\2\2\u022d\u022e\b\7\b\2\u022e\30"+
		"\3\2\2\2\u022f\u0230\7>\2\2\u0230\u0231\7u\2\2\u0231\u0232\7v\2\2\u0232"+
		"\u0233\7{\2\2\u0233\u0234\7n\2\2\u0234\u0235\7g\2\2\u0235\u0236\3\2\2"+
		"\2\u0236\u0237\b\b\t\2\u0237\u0238\3\2\2\2\u0238\u0239\b\b\b\2\u0239\32"+
		"\3\2\2\2\u023a\u023b\7>\2\2\u023b\u023c\7#\2\2\u023c\u023d\7/\2\2\u023d"+
		"\u023e\7/\2\2\u023e\u0242\3\2\2\2\u023f\u0241\13\2\2\2\u0240\u023f\3\2"+
		"\2\2\u0241\u0244\3\2\2\2\u0242\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243"+
		"\u0245\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u0246\7/\2\2\u0246\u0247\7/\2"+
		"\2\u0247\u0248\7@\2\2\u0248\u0249\3\2\2\2\u0249\u024a\b\t\n\2\u024a\34"+
		"\3\2\2\2\u024b\u024c\7>\2\2\u024c\u0250\7#\2\2\u024d\u024f\13\2\2\2\u024e"+
		"\u024d\3\2\2\2\u024f\u0252\3\2\2\2\u0250\u0251\3\2\2\2\u0250\u024e\3\2"+
		"\2\2\u0251\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\7@\2\2\u0254"+
		"\36\3\2\2\2\u0255\u0256\7>\2\2\u0256\u0257\3\2\2\2\u0257\u0258\b\13\b"+
		"\2\u0258 \3\2\2\2\u0259\u025a\7%\2\2\u025a\u025b\6\f\2\2\u025b\u025f\7"+
		"#\2\2\u025c\u025e\n\4\2\2\u025d\u025c\3\2\2\2\u025e\u0261\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\"\3\2\2\2\u0261\u025f\3\2\2\2"+
		"\u0262\u0266\7%\2\2\u0263\u0265\n\5\2\2\u0264\u0263\3\2\2\2\u0265\u0268"+
		"\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0269\u026a\b\r\13\2\u026a$\3\2\2\2\u026b\u026c\13\2\2"+
		"\2\u026c\u026d\3\2\2\2\u026d\u026e\b\16\f\2\u026e&\3\2\2\2\u026f\u0271"+
		"\n\6\2\2\u0270\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273(\3\2\2\2\u0274\u0275\7A\2\2\u0275\u0276\7@\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0278\b\20\r\2\u0278*\3\2\2\2\u0279\u027a\7A\2\2"+
		"\u027a\u027b\3\2\2\2\u027b\u027c\b\21\16\2\u027c,\3\2\2\2\u027d\u027e"+
		"\5\u01f5\u00f6\2\u027e\u027f\3\2\2\2\u027f\u0280\b\22\4\2\u0280\u0281"+
		"\b\22\5\2\u0281.\3\2\2\2\u0282\u0283\5\u01f7\u00f7\2\u0283\u0284\3\2\2"+
		"\2\u0284\u0285\b\23\6\2\u0285\u0286\b\23\5\2\u0286\60\3\2\2\2\u0287\u0288"+
		"\7@\2\2\u0288\u0289\b\24\17\2\u0289\62\3\2\2\2\u028a\u028b\7\61\2\2\u028b"+
		"\u028c\7@\2\2\u028c\u028d\3\2\2\2\u028d\u028e\b\25\r\2\u028e\64\3\2\2"+
		"\2\u028f\u0290\7\61\2\2\u0290\66\3\2\2\2\u0291\u0292\7?\2\2\u02928\3\2"+
		"\2\2\u0293\u0295\7^\2\2\u0294\u0293\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0296\3\2\2\2\u0296\u0297\7)\2\2\u0297\u0298\3\2\2\2\u0298\u0299\b\30"+
		"\20\2\u0299:\3\2\2\2\u029a\u029c\7^\2\2\u029b\u029a\3\2\2\2\u029b\u029c"+
		"\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\7$\2\2\u029e\u029f\3\2\2\2\u029f"+
		"\u02a0\b\31\21\2\u02a0<\3\2\2\2\u02a1\u02a3\7%\2\2\u02a2\u02a4\5\u0201"+
		"\u00fc\2\u02a3\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6>\3\2\2\2\u02a7\u02a9\5\u01ff\u00fb\2\u02a8\u02a7"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"@\3\2\2\2\u02ac\u02ae\t\2\2\2\u02ad\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2"+
		"\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2"+
		"\b\34\n\2\u02b2B\3\2\2\2\u02b3\u02b7\5\u01fb\u00f9\2\u02b4\u02b6\5\u01f9"+
		"\u00f8\2\u02b5\u02b4\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8D\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\13\2\2\2"+
		"\u02bb\u02bc\3\2\2\2\u02bc\u02bd\b\36\f\2\u02bdF\3\2\2\2\u02be\u02bf\5"+
		"\u01f5\u00f6\2\u02bf\u02c0\3\2\2\2\u02c0\u02c1\b\37\4\2\u02c1\u02c2\b"+
		"\37\5\2\u02c2H\3\2\2\2\u02c3\u02c4\5\u01f7\u00f7\2\u02c4\u02c5\3\2\2\2"+
		"\u02c5\u02c6\b \6\2\u02c6\u02c7\b \5\2\u02c7J\3\2\2\2\u02c8\u02ca\7)\2"+
		"\2\u02c9\u02cb\7)\2\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc"+
		"\3\2\2\2\u02cc\u02cd\b!\r\2\u02cdL\3\2\2\2\u02ce\u02d0\n\7\2\2\u02cf\u02ce"+
		"\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"N\3\2\2\2\u02d3\u02d4\13\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\b#\f\2"+
		"\u02d6P\3\2\2\2\u02d7\u02d8\5\u01f5\u00f6\2\u02d8\u02d9\3\2\2\2\u02d9"+
		"\u02da\b$\4\2\u02da\u02db\b$\5\2\u02dbR\3\2\2\2\u02dc\u02dd\5\u01f7\u00f7"+
		"\2\u02dd\u02de\3\2\2\2\u02de\u02df\b%\6\2\u02df\u02e0\b%\5\2\u02e0T\3"+
		"\2\2\2\u02e1\u02e3\7$\2\2\u02e2\u02e4\7$\2\2\u02e3\u02e2\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e6\b&\r\2\u02e6V\3\2\2\2\u02e7"+
		"\u02e9\n\b\2\2\u02e8\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2"+
		"\2\2\u02ea\u02eb\3\2\2\2\u02ebX\3\2\2\2\u02ec\u02ed\13\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\b(\f\2\u02efZ\3\2\2\2\u02f0\u02f2\n\5\2\2\u02f1\u02f0"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\\\3\2\2\2\u02f5\u02f6\7>\2\2\u02f6\u02fd\7\61\2\2\u02f7\u02f8\7u\2\2"+
		"\u02f8\u02f9\7e\2\2\u02f9\u02fa\7t\2\2\u02fa\u02fb\7k\2\2\u02fb\u02fc"+
		"\7r\2\2\u02fc\u02fe\7v\2\2\u02fd\u02f7\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe"+
		"\u02ff\3\2\2\2\u02ff\u0300\7@\2\2\u0300\u0301\3\2\2\2\u0301\u0302\b*\r"+
		"\2\u0302^\3\2\2\2\u0303\u0304\5\u01f5\u00f6\2\u0304\u0305\3\2\2\2\u0305"+
		"\u0306\b+\4\2\u0306\u0307\b+\5\2\u0307`\3\2\2\2\u0308\u0309\5\u01f7\u00f7"+
		"\2\u0309\u030a\3\2\2\2\u030a\u030b\b,\6\2\u030b\u030c\b,\5\2\u030cb\3"+
		"\2\2\2\u030d\u030e\7>\2\2\u030e\u030f\3\2\2\2\u030f\u0310\b-\22\2\u0310"+
		"d\3\2\2\2\u0311\u0313\13\2\2\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2"+
		"\u0314\u0315\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314"+
		"\3\2\2\2\u0317\u0318\7>\2\2\u0318\u0319\7\61\2\2\u0319\u031f\3\2\2\2\u031a"+
		"\u031b\7u\2\2\u031b\u031c\7v\2\2\u031c\u031d\7{\2\2\u031d\u031e\7n\2\2"+
		"\u031e\u0320\7g\2\2\u031f\u031a\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321"+
		"\3\2\2\2\u0321\u0322\7@\2\2\u0322\u0323\3\2\2\2\u0323\u0324\b.\r\2\u0324"+
		"f\3\2\2\2\u0325\u0329\7A\2\2\u0326\u0327\7\'\2\2\u0327\u0329\6/\3\2\u0328"+
		"\u0325\3\2\2\2\u0328\u0326\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u0337\7@"+
		"\2\2\u032b\u032c\7>\2\2\u032c\u032d\7\61\2\2\u032d\u032e\7u\2\2\u032e"+
		"\u032f\7e\2\2\u032f\u0330\7t\2\2\u0330\u0331\7k\2\2\u0331\u0332\7r\2\2"+
		"\u0332\u0333\7v\2\2\u0333\u0334\7@\2\2\u0334\u0335\3\2\2\2\u0335\u0337"+
		"\6/\4\2\u0336\u0328\3\2\2\2\u0336\u032b\3\2\2\2\u0337h\3\2\2\2\u0338\u033a"+
		"\t\2\2\2\u0339\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\b\60\2\2\u033ej\3\2\2\2"+
		"\u033f\u0340\7\61\2\2\u0340\u0341\7,\2\2\u0341\u0345\3\2\2\2\u0342\u0344"+
		"\13\2\2\2\u0343\u0342\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0346\3\2\2\2"+
		"\u0345\u0343\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u0349"+
		"\7,\2\2\u0349\u034a\7\61\2\2\u034a\u034b\3\2\2\2\u034b\u034c\b\61\23\2"+
		"\u034cl\3\2\2\2\u034d\u034e\7\61\2\2\u034e\u034f\7\61\2\2\u034f\u0353"+
		"\3\2\2\2\u0350\u0352\n\4\2\2\u0351\u0350\3\2\2\2\u0352\u0355\3\2\2\2\u0353"+
		"\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\3\2\2\2\u0355\u0353\3\2"+
		"\2\2\u0356\u0357\b\62\6\2\u0357\u0358\b\62\24\2\u0358n\3\2\2\2\u0359\u035d"+
		"\7%\2\2\u035a\u035c\n\4\2\2\u035b\u035a\3\2\2\2\u035c\u035f\3\2\2\2\u035d"+
		"\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0360\3\2\2\2\u035f\u035d\3\2"+
		"\2\2\u0360\u0361\b\63\6\2\u0361\u0362\b\63\24\2\u0362p\3\2\2\2\u0363\u0364"+
		"\7c\2\2\u0364\u0365\7d\2\2\u0365\u0366\7u\2\2\u0366\u0367\7v\2\2\u0367"+
		"\u0368\7t\2\2\u0368\u0369\7c\2\2\u0369\u036a\7e\2\2\u036a\u036b\7v\2\2"+
		"\u036br\3\2\2\2\u036c\u036d\7c\2\2\u036d\u036e\7t\2\2\u036e\u036f\7t\2"+
		"\2\u036f\u0370\7c\2\2\u0370\u0371\7{\2\2\u0371t\3\2\2\2\u0372\u0373\7"+
		"c\2\2\u0373\u0374\7u\2\2\u0374v\3\2\2\2\u0375\u0376\7d\2\2\u0376\u0377"+
		"\7k\2\2\u0377\u0378\7p\2\2\u0378\u0379\7c\2\2\u0379\u037a\7t\2\2\u037a"+
		"\u037b\7{\2\2\u037bx\3\2\2\2\u037c\u037d\7d\2\2\u037d\u037e\7q\2\2\u037e"+
		"\u037f\7q\2\2\u037f\u0380\7n\2\2\u0380\u0384\3\2\2\2\u0381\u0382\7g\2"+
		"\2\u0382\u0383\7c\2\2\u0383\u0385\7p\2\2\u0384\u0381\3\2\2\2\u0384\u0385"+
		"\3\2\2\2\u0385z\3\2\2\2\u0386\u0387\7v\2\2\u0387\u0388\7t\2\2\u0388\u0389"+
		"\7w\2\2\u0389\u0390\7g\2\2\u038a\u038b\7h\2\2\u038b\u038c\7c\2\2\u038c"+
		"\u038d\7n\2\2\u038d\u038e\7u\2\2\u038e\u0390\7g\2\2\u038f\u0386\3\2\2"+
		"\2\u038f\u038a\3\2\2\2\u0390|\3\2\2\2\u0391\u0392\7d\2\2\u0392\u0393\7"+
		"t\2\2\u0393\u0394\7g\2\2\u0394\u0395\7c\2\2\u0395\u0396\7m\2\2\u0396~"+
		"\3\2\2\2\u0397\u0398\7e\2\2\u0398\u0399\7c\2\2\u0399\u039a\7n\2\2\u039a"+
		"\u039b\7n\2\2\u039b\u039c\7c\2\2\u039c\u039d\7d\2\2\u039d\u039e\7n\2\2"+
		"\u039e\u039f\7g\2\2\u039f\u0080\3\2\2\2\u03a0\u03a1\7e\2\2\u03a1\u03a2"+
		"\7c\2\2\u03a2\u03a3\7u\2\2\u03a3\u03a4\7g\2\2\u03a4\u0082\3\2\2\2\u03a5"+
		"\u03a6\7e\2\2\u03a6\u03a7\7c\2\2\u03a7\u03a8\7v\2\2\u03a8\u03a9\7e\2\2"+
		"\u03a9\u03aa\7j\2\2\u03aa\u0084\3\2\2\2\u03ab\u03ac\7e\2\2\u03ac\u03ad"+
		"\7n\2\2\u03ad\u03ae\7c\2\2\u03ae\u03af\7u\2\2\u03af\u03b0\7u\2\2\u03b0"+
		"\u0086\3\2\2\2\u03b1\u03b2\7e\2\2\u03b2\u03b3\7n\2\2\u03b3\u03b4\7q\2"+
		"\2\u03b4\u03b5\7p\2\2\u03b5\u03b6\7g\2\2\u03b6\u0088\3\2\2\2\u03b7\u03b8"+
		"\7e\2\2\u03b8\u03b9\7q\2\2\u03b9\u03ba\7p\2\2\u03ba\u03bb\7u\2\2\u03bb"+
		"\u03bc\7v\2\2\u03bc\u008a\3\2\2\2\u03bd\u03be\7e\2\2\u03be\u03bf\7q\2"+
		"\2\u03bf\u03c0\7p\2\2\u03c0\u03c1\7v\2\2\u03c1\u03c2\7k\2\2\u03c2\u03c3"+
		"\7p\2\2\u03c3\u03c4\7w\2\2\u03c4\u03c5\7g\2\2\u03c5\u008c\3\2\2\2\u03c6"+
		"\u03c7\7f\2\2\u03c7\u03c8\7g\2\2\u03c8\u03c9\7e\2\2\u03c9\u03ca\7n\2\2"+
		"\u03ca\u03cb\7c\2\2\u03cb\u03cc\7t\2\2\u03cc\u03cd\7g\2\2\u03cd\u008e"+
		"\3\2\2\2\u03ce\u03cf\7f\2\2\u03cf\u03d0\7g\2\2\u03d0\u03d1\7h\2\2\u03d1"+
		"\u03d2\7c\2\2\u03d2\u03d3\7w\2\2\u03d3\u03d4\7n\2\2\u03d4\u03d5\7v\2\2"+
		"\u03d5\u0090\3\2\2\2\u03d6\u03d7\7f\2\2\u03d7\u03d8\7q\2\2\u03d8\u0092"+
		"\3\2\2\2\u03d9\u03da\7t\2\2\u03da\u03db\7g\2\2\u03db\u03dc\7c\2\2\u03dc"+
		"\u03dd\7n\2\2\u03dd\u0094\3\2\2\2\u03de\u03df\7f\2\2\u03df\u03e0\7q\2"+
		"\2\u03e0\u03e1\7w\2\2\u03e1\u03e2\7d\2\2\u03e2\u03e3\7n\2\2\u03e3\u03e4"+
		"\7g\2\2\u03e4\u0096\3\2\2\2\u03e5\u03e6\7g\2\2\u03e6\u03e7\7e\2\2\u03e7"+
		"\u03e8\7j\2\2\u03e8\u03e9\7q\2\2\u03e9\u0098\3\2\2\2\u03ea\u03eb\7g\2"+
		"\2\u03eb\u03ec\7n\2\2\u03ec\u03ed\7u\2\2\u03ed\u03ee\7g\2\2\u03ee\u009a"+
		"\3\2\2\2\u03ef\u03f0\7g\2\2\u03f0\u03f1\7n\2\2\u03f1\u03f2\7u\2\2\u03f2"+
		"\u03f3\7g\2\2\u03f3\u03f4\7k\2\2\u03f4\u03f5\7h\2\2\u03f5\u009c\3\2\2"+
		"\2\u03f6\u03f7\7g\2\2\u03f7\u03f8\7o\2\2\u03f8\u03f9\7r\2\2\u03f9\u03fa"+
		"\7v\2\2\u03fa\u03fb\7{\2\2\u03fb\u009e\3\2\2\2\u03fc\u03fd\7g\2\2\u03fd"+
		"\u03fe\7p\2\2\u03fe\u03ff\7f\2\2\u03ff\u0400\7f\2\2\u0400\u0401\7g\2\2"+
		"\u0401\u0402\7e\2\2\u0402\u0403\7n\2\2\u0403\u0404\7c\2\2\u0404\u0405"+
		"\7t\2\2\u0405\u0406\7g\2\2\u0406\u00a0\3\2\2\2\u0407\u0408\7g\2\2\u0408"+
		"\u0409\7p\2\2\u0409\u040a\7f\2\2\u040a\u040b\7h\2\2\u040b\u040c\7q\2\2"+
		"\u040c\u040d\7t\2\2\u040d\u00a2\3\2\2\2\u040e\u040f\7g\2\2\u040f\u0410"+
		"\7p\2\2\u0410\u0411\7f\2\2\u0411\u0412\7h\2\2\u0412\u0413\7q\2\2\u0413"+
		"\u0414\7t\2\2\u0414\u0415\7g\2\2\u0415\u0416\7c\2\2\u0416\u0417\7e\2\2"+
		"\u0417\u0418\7j\2\2\u0418\u00a4\3\2\2\2\u0419\u041a\7g\2\2\u041a\u041b"+
		"\7p\2\2\u041b\u041c\7f\2\2\u041c\u041d\7k\2\2\u041d\u041e\7h\2\2\u041e"+
		"\u00a6\3\2\2\2\u041f\u0420\7g\2\2\u0420\u0421\7p\2\2\u0421\u0422\7f\2"+
		"\2\u0422\u0423\7u\2\2\u0423\u0424\7y\2\2\u0424\u0425\7k\2\2\u0425\u0426"+
		"\7v\2\2\u0426\u0427\7e\2\2\u0427\u0428\7j\2\2\u0428\u00a8\3\2\2\2\u0429"+
		"\u042a\7g\2\2\u042a\u042b\7p\2\2\u042b\u042c\7f\2\2\u042c\u042d\7y\2\2"+
		"\u042d\u042e\7j\2\2\u042e\u042f\7k\2\2\u042f\u0430\7n\2\2\u0430\u0431"+
		"\7g\2\2\u0431\u00aa\3\2\2\2\u0432\u0433\7g\2\2\u0433\u0434\7x\2\2\u0434"+
		"\u0435\7c\2\2\u0435\u0436\7n\2\2\u0436\u00ac\3\2\2\2\u0437\u0438\7f\2"+
		"\2\u0438\u0439\7k\2\2\u0439\u043a\7g\2\2\u043a\u00ae\3\2\2\2\u043b\u043c"+
		"\7g\2\2\u043c\u043d\7z\2\2\u043d\u043e\7v\2\2\u043e\u043f\7g\2\2\u043f"+
		"\u0440\7p\2\2\u0440\u0441\7f\2\2\u0441\u0442\7u\2\2\u0442\u00b0\3\2\2"+
		"\2\u0443\u0444\7h\2\2\u0444\u0445\7k\2\2\u0445\u0446\7p\2\2\u0446\u0447"+
		"\7c\2\2\u0447\u0448\7n\2\2\u0448\u00b2\3\2\2\2\u0449\u044a\7h\2\2\u044a"+
		"\u044b\7k\2\2\u044b\u044c\7p\2\2\u044c\u044d\7c\2\2\u044d\u044e\7n\2\2"+
		"\u044e\u044f\7n\2\2\u044f\u0450\7{\2\2\u0450\u00b4\3\2\2\2\u0451\u0452"+
		"\7h\2\2\u0452\u0453\7n\2\2\u0453\u0454\7q\2\2\u0454\u0455\7c\2\2\u0455"+
		"\u0456\7v\2\2\u0456\u00b6\3\2\2\2\u0457\u0458\7h\2\2\u0458\u0459\7q\2"+
		"\2\u0459\u045a\7t\2\2\u045a\u00b8\3\2\2\2\u045b\u045c\7h\2\2\u045c\u045d"+
		"\7q\2\2\u045d\u045e\7t\2\2\u045e\u045f\7g\2\2\u045f\u0460\7c\2\2\u0460"+
		"\u0461\7e\2\2\u0461\u0462\7j\2\2\u0462\u00ba\3\2\2\2\u0463\u0464\7h\2"+
		"\2\u0464\u0465\7w\2\2\u0465\u0466\7p\2\2\u0466\u0467\7e\2\2\u0467\u0468"+
		"\7v\2\2\u0468\u0469\7k\2\2\u0469\u046a\7q\2\2\u046a\u046b\7p\2\2\u046b"+
		"\u00bc\3\2\2\2\u046c\u046d\7i\2\2\u046d\u046e\7n\2\2\u046e\u046f\7q\2"+
		"\2\u046f\u0470\7d\2\2\u0470\u0471\7c\2\2\u0471\u0472\7n\2\2\u0472\u00be"+
		"\3\2\2\2\u0473\u0474\7i\2\2\u0474\u0475\7q\2\2\u0475\u0476\7v\2\2\u0476"+
		"\u0477\7q\2\2\u0477\u00c0\3\2\2\2\u0478\u0479\7k\2\2\u0479\u047a\7h\2"+
		"\2\u047a\u00c2\3\2\2\2\u047b\u047c\7k\2\2\u047c\u047d\7o\2\2\u047d\u047e"+
		"\7r\2\2\u047e\u047f\7n\2\2\u047f\u0480\7g\2\2\u0480\u0481\7o\2\2\u0481"+
		"\u0482\7g\2\2\u0482\u0483\7p\2\2\u0483\u0484\7v\2\2\u0484\u0485\7u\2\2"+
		"\u0485\u00c4\3\2\2\2\u0486\u0487\7k\2\2\u0487\u0488\7o\2\2\u0488\u0489"+
		"\7r\2\2\u0489\u048a\7q\2\2\u048a\u048b\7t\2\2\u048b\u048c\7v\2\2\u048c"+
		"\u00c6\3\2\2\2\u048d\u048e\7k\2\2\u048e\u048f\7p\2\2\u048f\u0490\7e\2"+
		"\2\u0490\u0491\7n\2\2\u0491\u0492\7w\2\2\u0492\u0493\7f\2\2\u0493\u0494"+
		"\7g\2\2\u0494\u00c8\3\2\2\2\u0495\u0496\7k\2\2\u0496\u0497\7p\2\2\u0497"+
		"\u0498\7e\2\2\u0498\u0499\7n\2\2\u0499\u049a\7w\2\2\u049a\u049b\7f\2\2"+
		"\u049b\u049c\7g\2\2\u049c\u049d\7a\2\2\u049d\u049e\7q\2\2\u049e\u049f"+
		"\7p\2\2\u049f\u04a0\7e\2\2\u04a0\u04a1\7g\2\2\u04a1\u00ca\3\2\2\2\u04a2"+
		"\u04a3\7k\2\2\u04a3\u04a4\7p\2\2\u04a4\u04a5\7u\2\2\u04a5\u04a6\7v\2\2"+
		"\u04a6\u04a7\7c\2\2\u04a7\u04a8\7p\2\2\u04a8\u04a9\7e\2\2\u04a9\u04aa"+
		"\7g\2\2\u04aa\u04ab\7q\2\2\u04ab\u04ac\7h\2\2\u04ac\u00cc\3\2\2\2\u04ad"+
		"\u04ae\7k\2\2\u04ae\u04af\7p\2\2\u04af\u04b0\7u\2\2\u04b0\u04b1\7v\2\2"+
		"\u04b1\u04b2\7g\2\2\u04b2\u04b3\7c\2\2\u04b3\u04b4\7f\2\2\u04b4\u04b5"+
		"\7q\2\2\u04b5\u04b6\7h\2\2\u04b6\u00ce\3\2\2\2\u04b7\u04b8\7k\2\2\u04b8"+
		"\u04b9\7p\2\2\u04b9\u04ba\7v\2\2\u04ba\u04bb\7:\2\2\u04bb\u00d0\3\2\2"+
		"\2\u04bc\u04bd\7k\2\2\u04bd\u04be\7p\2\2\u04be\u04bf\7v\2\2\u04bf\u04c0"+
		"\7\63\2\2\u04c0\u04c1\78\2\2\u04c1\u00d2\3\2\2\2\u04c2\u04c3\7k\2\2\u04c3"+
		"\u04c4\7p\2\2\u04c4\u04c5\7v\2\2\u04c5\u04c6\78\2\2\u04c6\u04c7\7\66\2"+
		"\2\u04c7\u00d4\3\2\2\2\u04c8\u04c9\7k\2\2\u04c9\u04ca\7p\2\2\u04ca\u04cb"+
		"\7v\2\2\u04cb\u04d0\3\2\2\2\u04cc\u04cd\7g\2\2\u04cd\u04ce\7i\2\2\u04ce"+
		"\u04cf\7g\2\2\u04cf\u04d1\7t\2\2\u04d0\u04cc\3\2\2\2\u04d0\u04d1\3\2\2"+
		"\2\u04d1\u00d6\3\2\2\2\u04d2\u04d3\7k\2\2\u04d3\u04d4\7p\2\2\u04d4\u04d5"+
		"\7v\2\2\u04d5\u04d6\7g\2\2\u04d6\u04d7\7t\2\2\u04d7\u04d8\7h\2\2\u04d8"+
		"\u04d9\7c\2\2\u04d9\u04da\7e\2\2\u04da\u04db\7g\2\2\u04db\u00d8\3\2\2"+
		"\2\u04dc\u04dd\7k\2\2\u04dd\u04de\7u\2\2\u04de\u04df\7u\2\2\u04df\u04e0"+
		"\7g\2\2\u04e0\u04e1\7v\2\2\u04e1\u00da\3\2\2\2\u04e2\u04e3\7n\2\2\u04e3"+
		"\u04e4\7k\2\2\u04e4\u04e5\7u\2\2\u04e5\u04e6\7v\2\2\u04e6\u00dc\3\2\2"+
		"\2\u04e7\u04e8\7c\2\2\u04e8\u04e9\7p\2\2\u04e9\u04ea\7f\2\2\u04ea\u00de"+
		"\3\2\2\2\u04eb\u04ec\7q\2\2\u04ec\u04ed\7t\2\2\u04ed\u00e0\3\2\2\2\u04ee"+
		"\u04ef\7z\2\2\u04ef\u04f0\7q\2\2\u04f0\u04f1\7t\2\2\u04f1\u00e2\3\2\2"+
		"\2\u04f2\u04f3\7p\2\2\u04f3\u04f4\7c\2\2\u04f4\u04f5\7o\2\2\u04f5\u04f6"+
		"\7g\2\2\u04f6\u04f7\7u\2\2\u04f7\u04f8\7r\2\2\u04f8\u04f9\7c\2\2\u04f9"+
		"\u04fa\7e\2\2\u04fa\u04fb\7g\2\2\u04fb\u00e4\3\2\2\2\u04fc\u04fd\7p\2"+
		"\2\u04fd\u04fe\7g\2\2\u04fe\u04ff\7y\2\2\u04ff\u00e6\3\2\2\2\u0500\u0501"+
		"\7p\2\2\u0501\u0502\7w\2\2\u0502\u0503\7n\2\2\u0503\u0504\7n\2\2\u0504"+
		"\u00e8\3\2\2\2\u0505\u0506\7q\2\2\u0506\u0507\7d\2\2\u0507\u0508\7l\2"+
		"\2\u0508\u0509\7g\2\2\u0509\u050a\7e\2\2\u050a\u050b\7v\2\2\u050b\u00ea"+
		"\3\2\2\2\u050c\u050d\7r\2\2\u050d\u050e\7c\2\2\u050e\u050f\7t\2\2\u050f"+
		"\u0510\7g\2\2\u0510\u0511\7p\2\2\u0511\u0512\7v\2\2\u0512\u00ec\3\2\2"+
		"\2\u0513\u0514\7r\2\2\u0514\u0515\7c\2\2\u0515\u0516\7t\2\2\u0516\u0517"+
		"\7v\2\2\u0517\u0518\7k\2\2\u0518\u0519\7c\2\2\u0519\u051a\7n\2\2\u051a"+
		"\u00ee\3\2\2\2\u051b\u051c\7r\2\2\u051c\u051d\7t\2\2\u051d\u051e\7k\2"+
		"\2\u051e\u051f\7p\2\2\u051f\u0520\7v\2\2\u0520\u00f0\3\2\2\2\u0521\u0522"+
		"\7r\2\2\u0522\u0523\7t\2\2\u0523\u0524\7k\2\2\u0524\u0525\7x\2\2\u0525"+
		"\u0526\7c\2\2\u0526\u0527\7v\2\2\u0527\u0528\7g\2\2\u0528\u00f2\3\2\2"+
		"\2\u0529\u052a\7r\2\2\u052a\u052b\7t\2\2\u052b\u052c\7q\2\2\u052c\u052d"+
		"\7v\2\2\u052d\u052e\7g\2\2\u052e\u052f\7e\2\2\u052f\u0530\7v\2\2\u0530"+
		"\u0531\7g\2\2\u0531\u0532\7f\2\2\u0532\u00f4\3\2\2\2\u0533\u0534\7r\2"+
		"\2\u0534\u0535\7w\2\2\u0535\u0536\7d\2\2\u0536\u0537\7n\2\2\u0537\u0538"+
		"\7k\2\2\u0538\u0539\7e\2\2\u0539\u00f6\3\2\2\2\u053a\u053b\7t\2\2\u053b"+
		"\u053c\7g\2\2\u053c\u053d\7s\2\2\u053d\u053e\7w\2\2\u053e\u053f\7k\2\2"+
		"\u053f\u0540\7t\2\2\u0540\u0541\7g\2\2\u0541\u00f8\3\2\2\2\u0542\u0543"+
		"\7t\2\2\u0543\u0544\7g\2\2\u0544\u0545\7s\2\2\u0545\u0546\7w\2\2\u0546"+
		"\u0547\7k\2\2\u0547\u0548\7t\2\2\u0548\u0549\7g\2\2\u0549\u054a\7a\2\2"+
		"\u054a\u054b\7q\2\2\u054b\u054c\7p\2\2\u054c\u054d\7e\2\2\u054d\u054e"+
		"\7g\2\2\u054e\u00fa\3\2\2\2\u054f\u0550\7t\2\2\u0550\u0551\7g\2\2\u0551"+
		"\u0552\7u\2\2\u0552\u0553\7q\2\2\u0553\u0554\7w\2\2\u0554\u0555\7t\2\2"+
		"\u0555\u0556\7e\2\2\u0556\u0557\7g\2\2\u0557\u00fc\3\2\2\2\u0558\u0559"+
		"\7t\2\2\u0559\u055a\7g\2\2\u055a\u055b\7v\2\2\u055b\u055c\7w\2\2\u055c"+
		"\u055d\7t\2\2\u055d\u055e\7p\2\2\u055e\u00fe\3\2\2\2\u055f\u0560\7u\2"+
		"\2\u0560\u0561\7v\2\2\u0561\u0562\7c\2\2\u0562\u0563\7v\2\2\u0563\u0564"+
		"\7k\2\2\u0564\u0565\7e\2\2\u0565\u0100\3\2\2\2\u0566\u0567\7u\2\2\u0567"+
		"\u0568\7v\2\2\u0568\u0569\7t\2\2\u0569\u056a\7k\2\2\u056a\u056b\7p\2\2"+
		"\u056b\u056c\7i\2\2\u056c\u0102\3\2\2\2\u056d\u056e\7u\2\2\u056e\u056f"+
		"\7y\2\2\u056f\u0570\7k\2\2\u0570\u0571\7v\2\2\u0571\u0572\7e\2\2\u0572"+
		"\u0573\7j\2\2\u0573\u0104\3\2\2\2\u0574\u0575\7v\2\2\u0575\u0576\7j\2"+
		"\2\u0576\u0577\7t\2\2\u0577\u0578\7q\2\2\u0578\u0579\7y\2\2\u0579\u0106"+
		"\3\2\2\2\u057a\u057b\7v\2\2\u057b\u057c\7t\2\2\u057c\u057d\7c\2\2\u057d"+
		"\u057e\7k\2\2\u057e\u057f\7v\2\2\u057f\u0108\3\2\2\2\u0580\u0581\7v\2"+
		"\2\u0581\u0582\7t\2\2\u0582\u0583\7{\2\2\u0583\u010a\3\2\2\2\u0584\u0585"+
		"\7e\2\2\u0585\u0586\7n\2\2\u0586\u0587\7t\2\2\u0587\u0588\7v\2\2\u0588"+
		"\u0589\7{\2\2\u0589\u058a\7r\2\2\u058a\u058b\7g\2\2\u058b\u058c\7q\2\2"+
		"\u058c\u058d\7h\2\2\u058d\u010c\3\2\2\2\u058e\u058f\7w\2\2\u058f\u0590"+
		"\7k\2\2\u0590\u0591\7p\2\2\u0591\u0592\7v\2\2\u0592\u0598\3\2\2\2\u0593"+
		"\u0599\7:\2\2\u0594\u0595\7\63\2\2\u0595\u0599\78\2\2\u0596\u0597\78\2"+
		"\2\u0597\u0599\7\66\2\2\u0598\u0593\3\2\2\2\u0598\u0594\3\2\2\2\u0598"+
		"\u0596\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u010e\3\2\2\2\u059a\u059b\7w"+
		"\2\2\u059b\u059c\7p\2\2\u059c\u059d\7k\2\2\u059d\u059e\7e\2\2\u059e\u059f"+
		"\7q\2\2\u059f\u05a0\7f\2\2\u05a0\u05a1\7g\2\2\u05a1\u0110\3\2\2\2\u05a2"+
		"\u05a3\7w\2\2\u05a3\u05a4\7p\2\2\u05a4\u05a5\7u\2\2\u05a5\u05a6\7g\2\2"+
		"\u05a6\u05a7\7v\2\2\u05a7\u0112\3\2\2\2\u05a8\u05a9\7w\2\2\u05a9\u05aa"+
		"\7u\2\2\u05aa\u05ab\7g\2\2\u05ab\u0114\3\2\2\2\u05ac\u05ad\7x\2\2\u05ad"+
		"\u05ae\7c\2\2\u05ae\u05af\7t\2\2\u05af\u0116\3\2\2\2\u05b0\u05b1\7y\2"+
		"\2\u05b1\u05b2\7j\2\2\u05b2\u05b3\7k\2\2\u05b3\u05b4\7n\2\2\u05b4\u05b5"+
		"\7g\2\2\u05b5\u0118\3\2\2\2\u05b6\u05b7\7{\2\2\u05b7\u05b8\7k\2\2\u05b8"+
		"\u05b9\7g\2\2\u05b9\u05ba\7n\2\2\u05ba\u05bb\7f\2\2\u05bb\u011a\3\2\2"+
		"\2\u05bc\u05bd\7a\2\2\u05bd\u05be\7a\2\2\u05be\u05bf\7i\2\2\u05bf\u05c0"+
		"\7g\2\2\u05c0\u05c1\7v\2\2\u05c1\u011c\3\2\2\2\u05c2\u05c3\7a\2\2\u05c3"+
		"\u05c4\7a\2\2\u05c4\u05c5\7u\2\2\u05c5\u05c6\7g\2\2\u05c6\u05c7\7v\2\2"+
		"\u05c7\u011e\3\2\2\2\u05c8\u05c9\7a\2\2\u05c9\u05ca\7a\2\2\u05ca\u05cb"+
		"\7e\2\2\u05cb\u05cc\7c\2\2\u05cc\u05cd\7n\2\2\u05cd\u05ce\7n\2\2\u05ce"+
		"\u0120\3\2\2\2\u05cf\u05d0\7a\2\2\u05d0\u05d1\7a\2\2\u05d1\u05d2\7e\2"+
		"\2\u05d2\u05d3\7c\2\2\u05d3\u05d4\7n\2\2\u05d4\u05d5\7n\2\2\u05d5\u05d6"+
		"\7u\2\2\u05d6\u05d7\7v\2\2\u05d7\u05d8\7c\2\2\u05d8\u05d9\7v\2\2\u05d9"+
		"\u05da\7k\2\2\u05da\u05db\7e\2\2\u05db\u0122\3\2\2\2\u05dc\u05dd\7a\2"+
		"\2\u05dd\u05de\7a\2\2\u05de\u05df\7e\2\2\u05df\u05e0\7q\2\2\u05e0\u05e1"+
		"\7p\2\2\u05e1\u05e2\7u\2\2\u05e2\u05e3\7v\2\2\u05e3\u05e4\7t\2\2\u05e4"+
		"\u05e5\7w\2\2\u05e5\u05e6\7e\2\2\u05e6\u05e7\7v\2\2\u05e7\u0124\3\2\2"+
		"\2\u05e8\u05e9\7a\2\2\u05e9\u05ea\7a\2\2\u05ea\u05eb\7f\2\2\u05eb\u05ec"+
		"\7g\2\2\u05ec\u05ed\7u\2\2\u05ed\u05ee\7v\2\2\u05ee\u05ef\7t\2\2\u05ef"+
		"\u05f0\7w\2\2\u05f0\u05f1\7e\2\2\u05f1\u05f2\7v\2\2\u05f2\u0126\3\2\2"+
		"\2\u05f3\u05f4\7a\2\2\u05f4\u05f5\7a\2\2\u05f5\u05f6\7y\2\2\u05f6\u05f7"+
		"\7c\2\2\u05f7\u05f8\7m\2\2\u05f8\u05f9\7g\2\2\u05f9\u05fa\7w\2\2\u05fa"+
		"\u05fb\7r\2\2\u05fb\u0128\3\2\2\2\u05fc\u05fd\7a\2\2\u05fd\u05fe\7a\2"+
		"\2\u05fe\u05ff\7u\2\2\u05ff\u0600\7n\2\2\u0600\u0601\7g\2\2\u0601\u0602"+
		"\7g\2\2\u0602\u0603\7r\2\2\u0603\u012a\3\2\2\2\u0604\u0605\7a\2\2\u0605"+
		"\u0606\7a\2\2\u0606\u0607\7c\2\2\u0607\u0608\7w\2\2\u0608\u0609\7v\2\2"+
		"\u0609\u060a\7q\2\2\u060a\u060b\7n\2\2\u060b\u060c\7q\2\2\u060c\u060d"+
		"\7c\2\2\u060d\u060e\7f\2\2\u060e\u012c\3\2\2\2\u060f\u0610\7a\2\2\u0610"+
		"\u0611\7a\2\2\u0611\u0612\7k\2\2\u0612\u0613\7u\2\2\u0613\u0614\7u\2\2"+
		"\u0614\u0615\7g\2\2\u0615\u0616\7v\2\2\u0616\u012e\3\2\2\2\u0617\u0618"+
		"\7a\2\2\u0618\u0619\7a\2\2\u0619\u061a\7w\2\2\u061a\u061b\7p\2\2\u061b"+
		"\u061c\7u\2\2\u061c\u061d\7g\2\2\u061d\u061e\7v\2\2\u061e\u0130\3\2\2"+
		"\2\u061f\u0620\7a\2\2\u0620\u0621\7a\2\2\u0621\u0622\7v\2\2\u0622\u0623"+
		"\7q\2\2\u0623\u0624\7u\2\2\u0624\u0625\7v\2\2\u0625\u0626\7t\2\2\u0626"+
		"\u0627\7k\2\2\u0627\u0628\7p\2\2\u0628\u0629\7i\2\2\u0629\u0132\3\2\2"+
		"\2\u062a\u062b\7a\2\2\u062b\u062c\7a\2\2\u062c\u062d\7k\2\2\u062d\u062e"+
		"\7p\2\2\u062e\u062f\7x\2\2\u062f\u0630\7q\2\2\u0630\u0631\7m\2\2\u0631"+
		"\u0632\7g\2\2\u0632\u0134\3\2\2\2\u0633\u0634\7a\2\2\u0634\u0635\7a\2"+
		"\2\u0635\u0636\7u\2\2\u0636\u0637\7g\2\2\u0637\u0638\7v\2\2\u0638\u0639"+
		"\7a\2\2\u0639\u063a\7u\2\2\u063a\u063b\7v\2\2\u063b\u063c\7c\2\2\u063c"+
		"\u063d\7v\2\2\u063d\u063e\7g\2\2\u063e\u0136\3\2\2\2\u063f\u0640\7a\2"+
		"\2\u0640\u0641\7a\2\2\u0641\u0642\7e\2\2\u0642\u0643\7n\2\2\u0643\u0644"+
		"\7q\2\2\u0644\u0645\7p\2\2\u0645\u0646\7g\2\2\u0646\u0138\3\2\2\2\u0647"+
		"\u0648\7a\2\2\u0648\u0649\7a\2\2\u0649\u064a\7f\2\2\u064a\u064b\7g\2\2"+
		"\u064b\u064c\7d\2\2\u064c\u064d\7w\2\2\u064d\u064e\7i\2\2\u064e\u064f"+
		"\7k\2\2\u064f\u0650\7p\2\2\u0650\u0651\7h\2\2\u0651\u0652\7q\2\2\u0652"+
		"\u013a\3\2\2\2\u0653\u0654\7a\2\2\u0654\u0655\7a\2\2\u0655\u0656\7p\2"+
		"\2\u0656\u0657\7c\2\2\u0657\u0658\7o\2\2\u0658\u0659\7g\2\2\u0659\u065a"+
		"\7u\2\2\u065a\u065b\7r\2\2\u065b\u065c\7c\2\2\u065c\u065d\7e\2\2\u065d"+
		"\u065e\7g\2\2\u065e\u065f\7a\2\2\u065f\u0660\7a\2\2\u0660\u013c\3\2\2"+
		"\2\u0661\u0662\7a\2\2\u0662\u0663\7a\2\2\u0663\u0664\7e\2\2\u0664\u0665"+
		"\7n\2\2\u0665\u0666\7c\2\2\u0666\u0667\7u\2\2\u0667\u0668\7u\2\2\u0668"+
		"\u0669\7a\2\2\u0669\u066a\7a\2\2\u066a\u013e\3\2\2\2\u066b\u066c\7a\2"+
		"\2\u066c\u066d\7a\2\2\u066d\u066e\7v\2\2\u066e\u066f\7t\2\2\u066f\u0670"+
		"\7c\2\2\u0670\u0671\7k\2\2\u0671\u0672\7v\2\2\u0672\u0673\7a\2\2\u0673"+
		"\u0674\7a\2\2\u0674\u0140\3\2\2\2\u0675\u0676\7a\2\2\u0676\u0677\7a\2"+
		"\2\u0677\u0678\7h\2\2\u0678\u0679\7w\2\2\u0679\u067a\7p\2\2\u067a\u067b"+
		"\7e\2\2\u067b\u067c\7v\2\2\u067c\u067d\7k\2\2\u067d\u067e\7q\2\2\u067e"+
		"\u067f\7p\2\2\u067f\u0680\7a\2\2\u0680\u0681\7a\2\2\u0681\u0142\3\2\2"+
		"\2\u0682\u0683\7a\2\2\u0683\u0684\7a\2\2\u0684\u0685\7o\2\2\u0685\u0686"+
		"\7g\2\2\u0686\u0687\7v\2\2\u0687\u0688\7j\2\2\u0688\u0689\7q\2\2\u0689"+
		"\u068a\7f\2\2\u068a\u068b\7a\2\2\u068b\u068c\7a\2\2\u068c\u0144\3\2\2"+
		"\2\u068d\u068e\7a\2\2\u068e\u068f\7a\2\2\u068f\u0690\7n\2\2\u0690\u0691"+
		"\7k\2\2\u0691\u0692\7p\2\2\u0692\u0693\7g\2\2\u0693\u0694\7a\2\2\u0694"+
		"\u0695\7a\2\2\u0695\u0146\3\2\2\2\u0696\u0697\7a\2\2\u0697\u0698\7a\2"+
		"\2\u0698\u0699\7h\2\2\u0699\u069a\7k\2\2\u069a\u069b\7n\2\2\u069b\u069c"+
		"\7g\2\2\u069c\u069d\7a\2\2\u069d\u069e\7a\2\2\u069e\u0148\3\2\2\2\u069f"+
		"\u06a0\7a\2\2\u06a0\u06a1\7a\2\2\u06a1\u06a2\7f\2\2\u06a2\u06a3\7k\2\2"+
		"\u06a3\u06a4\7t\2\2\u06a4\u06a5\7a\2\2\u06a5\u06a6\7a\2\2\u06a6\u014a"+
		"\3\2\2\2\u06a7\u06a8\7>\2\2\u06a8\u06a9\7<\2\2\u06a9\u014c\3\2\2\2\u06aa"+
		"\u06ab\7<\2\2\u06ab\u06ac\7@\2\2\u06ac\u014e\3\2\2\2\u06ad\u06ae\7?\2"+
		"\2\u06ae\u06af\7@\2\2\u06af\u0150\3\2\2\2\u06b0\u06b1\7-\2\2\u06b1\u06b2"+
		"\7-\2\2\u06b2\u0152\3\2\2\2\u06b3\u06b4\7/\2\2\u06b4\u06b5\7/\2\2\u06b5"+
		"\u0154\3\2\2\2\u06b6\u06b7\7?\2\2\u06b7\u06b8\7?\2\2\u06b8\u06b9\7?\2"+
		"\2\u06b9\u0156\3\2\2\2\u06ba\u06bb\7#\2\2\u06bb\u06bc\7?\2\2\u06bc\u06bd"+
		"\7?\2\2\u06bd\u0158\3\2\2\2\u06be\u06bf\7?\2\2\u06bf\u06c0\7?\2\2\u06c0"+
		"\u015a\3\2\2\2\u06c1\u06c2\7>\2\2\u06c2\u06c6\7@\2\2\u06c3\u06c4\7#\2"+
		"\2\u06c4\u06c6\7?\2\2\u06c5\u06c1\3\2\2\2\u06c5\u06c3\3\2\2\2\u06c6\u015c"+
		"\3\2\2\2\u06c7\u06c8\7>\2\2\u06c8\u06c9\7?\2\2\u06c9\u015e\3\2\2\2\u06ca"+
		"\u06cb\7@\2\2\u06cb\u06cc\7?\2\2\u06cc\u0160\3\2\2\2\u06cd\u06ce\7-\2"+
		"\2\u06ce\u06cf\7?\2\2\u06cf\u0162\3\2\2\2\u06d0\u06d1\7/\2\2\u06d1\u06d2"+
		"\7?\2\2\u06d2\u0164\3\2\2\2\u06d3\u06d4\7,\2\2\u06d4\u06d5\7?\2\2\u06d5"+
		"\u0166\3\2\2\2\u06d6\u06d7\7,\2\2\u06d7\u06d8\7,\2\2\u06d8\u0168\3\2\2"+
		"\2\u06d9\u06da\7,\2\2\u06da\u06db\7,\2\2\u06db\u06dc\7?\2\2\u06dc\u016a"+
		"\3\2\2\2\u06dd\u06de\7\61\2\2\u06de\u06df\7?\2\2\u06df\u016c\3\2\2\2\u06e0"+
		"\u06e1\7\60\2\2\u06e1\u06e2\7?\2\2\u06e2\u016e\3\2\2\2\u06e3\u06e4\7\'"+
		"\2\2\u06e4\u06e5\7?\2\2\u06e5\u0170\3\2\2\2\u06e6\u06e7\7>\2\2\u06e7\u06e8"+
		"\7>\2\2\u06e8\u06e9\7?\2\2\u06e9\u0172\3\2\2\2\u06ea\u06eb\7@\2\2\u06eb"+
		"\u06ec\7@\2\2\u06ec\u06ed\7?\2\2\u06ed\u0174\3\2\2\2\u06ee\u06ef\7(\2"+
		"\2\u06ef\u06f0\7?\2\2\u06f0\u0176\3\2\2\2\u06f1\u06f2\7~\2\2\u06f2\u06f3"+
		"\7?\2\2\u06f3\u0178\3\2\2\2\u06f4\u06f5\7`\2\2\u06f5\u06f6\7?\2\2\u06f6"+
		"\u017a\3\2\2\2\u06f7\u06f8\7~\2\2\u06f8\u06f9\7~\2\2\u06f9\u017c\3\2\2"+
		"\2\u06fa\u06fb\7(\2\2\u06fb\u06fc\7(\2\2\u06fc\u017e\3\2\2\2\u06fd\u06fe"+
		"\7>\2\2\u06fe\u06ff\7>\2\2\u06ff\u0180\3\2\2\2\u0700\u0701\7@\2\2\u0701"+
		"\u0702\7@\2\2\u0702\u0182\3\2\2\2\u0703\u0704\7<\2\2\u0704\u0705\7<\2"+
		"\2\u0705\u0184\3\2\2\2\u0706\u0707\7/\2\2\u0707\u0708\7@\2\2\u0708\u0186"+
		"\3\2\2\2\u0709\u070a\7^\2\2\u070a\u0188\3\2\2\2\u070b\u070c\7\60\2\2\u070c"+
		"\u070d\7\60\2\2\u070d\u070e\7\60\2\2\u070e\u018a\3\2\2\2\u070f\u0710\7"+
		">\2\2\u0710\u018c\3\2\2\2\u0711\u0712\7@\2\2\u0712\u018e\3\2\2\2\u0713"+
		"\u0714\7(\2\2\u0714\u0190\3\2\2\2\u0715\u0716\7~\2\2\u0716\u0192\3\2\2"+
		"\2\u0717\u0718\7#\2\2\u0718\u0194\3\2\2\2\u0719\u071a\7`\2\2\u071a\u0196"+
		"\3\2\2\2\u071b\u071c\7-\2\2\u071c\u0198\3\2\2\2\u071d\u071e\7/\2\2\u071e"+
		"\u019a\3\2\2\2\u071f\u0720\7,\2\2\u0720\u019c\3\2\2\2\u0721\u0722\7\'"+
		"\2\2\u0722\u019e\3\2\2\2\u0723\u0724\7\61\2\2\u0724\u01a0\3\2\2\2\u0725"+
		"\u0726\7\u0080\2\2\u0726\u01a2\3\2\2\2\u0727\u0728\7B\2\2\u0728\u01a4"+
		"\3\2\2\2\u0729\u072a\7&\2\2\u072a\u01a6\3\2\2\2\u072b\u072c\7\60\2\2\u072c"+
		"\u01a8\3\2\2\2\u072d\u072e\7A\2\2\u072e\u01aa\3\2\2\2\u072f\u0730\7*\2"+
		"\2\u0730\u01ac\3\2\2\2\u0731\u0732\7+\2\2\u0732\u01ae\3\2\2\2\u0733\u0734"+
		"\7]\2\2\u0734\u01b0\3\2\2\2\u0735\u0736\7_\2\2\u0736\u01b2\3\2\2\2\u0737"+
		"\u0738\7}\2\2\u0738\u01b4\3\2\2\2\u0739\u073a\7\177\2\2\u073a\u073b\b"+
		"\u00d6\25\2\u073b\u01b6\3\2\2\2\u073c\u073d\7.\2\2\u073d\u01b8\3\2\2\2"+
		"\u073e\u073f\7<\2\2\u073f\u01ba\3\2\2\2\u0740\u0741\7=\2\2\u0741\u01bc"+
		"\3\2\2\2\u0742\u0743\7?\2\2\u0743\u01be\3\2\2\2\u0744\u0745\7)\2\2\u0745"+
		"\u01c0\3\2\2\2\u0746\u0747\7b\2\2\u0747\u01c2\3\2\2\2\u0748\u0749\7&\2"+
		"\2\u0749\u074d\t\t\2\2\u074a\u074c\t\n\2\2\u074b\u074a\3\2\2\2\u074c\u074f"+
		"\3\2\2\2\u074d\u074b\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u01c4\3\2\2\2\u074f"+
		"\u074d\3\2\2\2\u0750\u0754\t\t\2\2\u0751\u0753\t\n\2\2\u0752\u0751\3\2"+
		"\2\2\u0753\u0756\3\2\2\2\u0754\u0752\3\2\2\2\u0754\u0755\3\2\2\2\u0755"+
		"\u01c6\3\2\2\2\u0756\u0754\3\2\2\2\u0757\u0759\7\62\2\2\u0758\u075a\t"+
		"\13\2\2\u0759\u0758\3\2\2\2\u075a\u075b\3\2\2\2\u075b\u0759\3\2\2\2\u075b"+
		"\u075c\3\2\2\2\u075c\u01c8\3\2\2\2\u075d\u075f\5\u01ff\u00fb\2\u075e\u075d"+
		"\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u075e\3\2\2\2\u0760\u0761\3\2\2\2\u0761"+
		"\u01ca\3\2\2\2\u0762\u0764\5\u01ff\u00fb\2\u0763\u0762\3\2\2\2\u0764\u0765"+
		"\3\2\2\2\u0765\u0763\3\2\2\2\u0765\u0766\3\2\2\2\u0766\u0767\3\2\2\2\u0767"+
		"\u076b\7\60\2\2\u0768\u076a\5\u01ff\u00fb\2\u0769\u0768\3\2\2\2\u076a"+
		"\u076d\3\2\2\2\u076b\u0769\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u0775\3\2"+
		"\2\2\u076d\u076b\3\2\2\2\u076e\u0770\7\60\2\2\u076f\u0771\5\u01ff\u00fb"+
		"\2\u0770\u076f\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0770\3\2\2\2\u0772\u0773"+
		"\3\2\2\2\u0773\u0775\3\2\2\2\u0774\u0763\3\2\2\2\u0774\u076e\3\2\2\2\u0775"+
		"\u0777\3\2\2\2\u0776\u0778\5\u01fd\u00fa\2\u0777\u0776\3\2\2\2\u0777\u0778"+
		"\3\2\2\2\u0778\u0781\3\2\2\2\u0779\u077b\5\u01ff\u00fb\2\u077a\u0779\3"+
		"\2\2\2\u077b\u077c\3\2\2\2\u077c\u077a\3\2\2\2\u077c\u077d\3\2\2\2\u077d"+
		"\u077e\3\2\2\2\u077e\u077f\5\u01fd\u00fa\2\u077f\u0781\3\2\2\2\u0780\u0774"+
		"\3\2\2\2\u0780\u077a\3\2\2\2\u0781\u01cc\3\2\2\2\u0782\u0783\7\62\2\2"+
		"\u0783\u0784\7z\2\2\u0784\u0786\3\2\2\2\u0785\u0787\5\u0201\u00fc\2\u0786"+
		"\u0785\3\2\2\2\u0787\u0788\3\2\2\2\u0788\u0786\3\2\2\2\u0788\u0789\3\2"+
		"\2\2\u0789\u01ce\3\2\2\2\u078a\u078b\7\62\2\2\u078b\u078c\7d\2\2\u078c"+
		"\u078e\3\2\2\2\u078d\u078f\t\f\2\2\u078e\u078d\3\2\2\2\u078f\u0790\3\2"+
		"\2\2\u0790\u078e\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u01d0\3\2\2\2\u0792"+
		"\u0796\7b\2\2\u0793\u0795\n\r\2\2\u0794\u0793\3\2\2\2\u0795\u0798\3\2"+
		"\2\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0799\3\2\2\2\u0798"+
		"\u0796\3\2\2\2\u0799\u079a\7b\2\2\u079a\u01d2\3\2\2\2\u079b\u07a1\7)\2"+
		"\2\u079c\u07a0\n\16\2\2\u079d\u079e\7^\2\2\u079e\u07a0\13\2\2\2\u079f"+
		"\u079c\3\2\2\2\u079f\u079d\3\2\2\2\u07a0\u07a3\3\2\2\2\u07a1\u079f\3\2"+
		"\2\2\u07a1\u07a2\3\2\2\2\u07a2\u07a4\3\2\2\2\u07a3\u07a1\3\2\2\2\u07a4"+
		"\u07a5\7)\2\2\u07a5\u01d4\3\2\2\2\u07a6\u07a7\7$\2\2\u07a7\u07a8\3\2\2"+
		"\2\u07a8\u07a9\b\u00e6\26\2\u07a9\u01d6\3\2\2\2\u07aa\u07ab\7>\2\2\u07ab"+
		"\u07ac\7>\2\2\u07ac\u07ad\7>\2\2\u07ad\u07b1\3\2\2\2\u07ae\u07b0\t\17"+
		"\2\2\u07af\u07ae\3\2\2\2\u07b0\u07b3\3\2\2\2\u07b1\u07af\3\2\2\2\u07b1"+
		"\u07b2\3\2\2\2\u07b2\u07b4\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b4\u07b5\7)"+
		"\2\2\u07b5\u07b9\t\t\2\2\u07b6\u07b8\t\n\2\2\u07b7\u07b6\3\2\2\2\u07b8"+
		"\u07bb\3\2\2\2\u07b9\u07b7\3\2\2\2\u07b9\u07ba\3\2\2\2\u07ba\u07bc\3\2"+
		"\2\2\u07bb\u07b9\3\2\2\2\u07bc\u07bd\7)\2\2\u07bd\u07be\6\u00e7\5\2\u07be"+
		"\u07bf\3\2\2\2\u07bf\u07c0\b\u00e7\27\2\u07c0\u01d8\3\2\2\2\u07c1\u07c2"+
		"\7>\2\2\u07c2\u07c3\7>\2\2\u07c3\u07c4\7>\2\2\u07c4\u07c8\3\2\2\2\u07c5"+
		"\u07c7\t\17\2\2\u07c6\u07c5\3\2\2\2\u07c7\u07ca\3\2\2\2\u07c8\u07c6\3"+
		"\2\2\2\u07c8\u07c9\3\2\2\2\u07c9\u07cb\3\2\2\2\u07ca\u07c8\3\2\2\2\u07cb"+
		"\u07cf\t\t\2\2\u07cc\u07ce\t\n\2\2\u07cd\u07cc\3\2\2\2\u07ce\u07d1\3\2"+
		"\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07d0\3\2\2\2\u07d0\u07d2\3\2\2\2\u07d1"+
		"\u07cf\3\2\2\2\u07d2\u07d3\6\u00e8\6\2\u07d3\u07d4\3\2\2\2\u07d4\u07d5"+
		"\b\u00e8\27\2\u07d5\u01da\3\2\2\2\u07d6\u07d7\13\2\2\2\u07d7\u07d8\3\2"+
		"\2\2\u07d8\u07d9\b\u00e9\f\2\u07d9\u01dc\3\2\2\2\u07da\u07db\7&\2\2\u07db"+
		"\u07df\t\t\2\2\u07dc\u07de\t\n\2\2\u07dd\u07dc\3\2\2\2\u07de\u07e1\3\2"+
		"\2\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e2\3\2\2\2\u07e1"+
		"\u07df\3\2\2\2\u07e2\u07e3\b\u00ea\30\2\u07e3\u01de\3\2\2\2\u07e4\u07e5"+
		"\7&\2\2\u07e5\u07e6\3\2\2\2\u07e6\u07e7\b\u00eb\31\2\u07e7\u01e0\3\2\2"+
		"\2\u07e8\u07e9\7}\2\2\u07e9\u07ea\6\u00ec\7\2\u07ea\u07eb\b\u00ec\32\2"+
		"\u07eb\u07ec\3\2\2\2\u07ec\u07ed\b\u00ec\6\2\u07ed\u07ee\b\u00ec\5\2\u07ee"+
		"\u01e2\3\2\2\2\u07ef\u07f0\7}\2\2\u07f0\u07f1\3\2\2\2\u07f1\u07f2\b\u00ed"+
		"\31\2\u07f2\u01e4\3\2\2\2\u07f3\u07f4\7^\2\2\u07f4\u07f5\13\2\2\2\u07f5"+
		"\u07f6\3\2\2\2\u07f6\u07f7\b\u00ee\31\2\u07f7\u01e6\3\2\2\2\u07f8\u07f9"+
		"\7$\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\b\u00ef\33\2\u07fb\u07fc\b\u00ef"+
		"\r\2\u07fc\u01e8\3\2\2\2\u07fd\u07ff\n\20\2\2\u07fe\u07fd\3\2\2\2\u07ff"+
		"\u0800\3\2\2\2\u0800\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u01ea\3\2"+
		"\2\2\u0802\u0804\n\21\2\2\u0803\u0802\3\2\2\2\u0804\u0805\3\2\2\2\u0805"+
		"\u0803\3\2\2\2\u0805\u0806\3\2\2\2\u0806\u0807\3\2\2\2\u0807\u0808\b\u00f1"+
		"\23\2\u0808\u01ec\3\2\2\2\u0809\u080a\7A\2\2\u080a\u080b\7@\2\2\u080b"+
		"\u01ee\3\2\2\2\u080c\u080d\7A\2\2\u080d\u080e\3\2\2\2\u080e\u080f\b\u00f3"+
		"\34\2\u080f\u0810\b\u00f3\23\2\u0810\u01f0\3\2\2\2\u0811\u0812\t\4\2\2"+
		"\u0812\u0813\3\2\2\2\u0813\u0814\b\u00f4\6\2\u0814\u0815\b\u00f4\r\2\u0815"+
		"\u01f2\3\2\2\2\u0816\u0818\n\4\2\2\u0817\u0816\3\2\2\2\u0818\u081b\3\2"+
		"\2\2\u0819\u081a\3\2\2\2\u0819\u0817\3\2\2\2\u081a\u0821\3\2\2\2\u081b"+
		"\u0819\3\2\2\2\u081c\u081e\7\17\2\2\u081d\u081c\3\2\2\2\u081d\u081e\3"+
		"\2\2\2\u081e\u081f\3\2\2\2\u081f\u0822\7\f\2\2\u0820\u0822\7\17\2\2\u0821"+
		"\u081d\3\2\2\2\u0821\u0820\3\2\2\2\u0822\u01f4\3\2\2\2\u0823\u0829\7>"+
		"\2\2\u0824\u0825\7A\2\2\u0825\u082a\7?\2\2\u0826\u0827\6\u00f6\b\2\u0827"+
		"\u0828\7\'\2\2\u0828\u082a\7?\2\2\u0829\u0824\3\2\2\2\u0829\u0826\3\2"+
		"\2\2\u082a\u01f6\3\2\2\2\u082b\u0834\7>\2\2\u082c\u0830\7A\2\2\u082d\u082e"+
		"\7r\2\2\u082e\u082f\7j\2\2\u082f\u0831\7r\2\2\u0830\u082d\3\2\2\2\u0830"+
		"\u0831\3\2\2\2\u0831\u0835\3\2\2\2\u0832\u0833\6\u00f7\t\2\u0833\u0835"+
		"\7\'\2\2\u0834\u082c\3\2\2\2\u0834\u0832\3\2\2\2\u0835\u01f8\3\2\2\2\u0836"+
		"\u083b\5\u01fb\u00f9\2\u0837\u083b\t\22\2\2\u0838\u083b\5\u01ff\u00fb"+
		"\2\u0839\u083b\t\23\2\2\u083a\u0836\3\2\2\2\u083a\u0837\3\2\2\2\u083a"+
		"\u0838\3\2\2\2\u083a\u0839\3\2\2\2\u083b\u01fa\3\2\2\2\u083c\u083e\t\24"+
		"\2\2\u083d\u083c\3\2\2\2\u083e\u01fc\3\2\2\2\u083f\u0841\7g\2\2\u0840"+
		"\u0842\t\25\2\2\u0841\u0840\3\2\2\2\u0841\u0842\3\2\2\2\u0842\u0844\3"+
		"\2\2\2\u0843\u0845\5\u01ff\u00fb\2\u0844\u0843\3\2\2\2\u0845\u0846\3\2"+
		"\2\2\u0846\u0844\3\2\2\2\u0846\u0847\3\2\2\2\u0847\u01fe\3\2\2\2\u0848"+
		"\u0849\t\26\2\2\u0849\u0200\3\2\2\2\u084a\u084b\t\27\2\2\u084b\u0202\3"+
		"\2\2\2\u084c\u084e\t\30\2\2\u084d\u084c\3\2\2\2\u084e\u084f\3\2\2\2\u084f"+
		"\u084d\3\2\2\2\u084f\u0850\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\b\u00fd"+
		"\2\2\u0852\u0204\3\2\2\2O\2\3\4\5\6\7\b\t\n\13\f\u0208\u020f\u0242\u0250"+
		"\u025f\u0266\u0272\u0294\u029b\u02a5\u02aa\u02af\u02b7\u02ca\u02d1\u02e3"+
		"\u02ea\u02f3\u02fd\u0314\u031f\u0328\u0336\u033b\u0345\u0353\u035d\u0384"+
		"\u038f\u04d0\u0598\u06c5\u074d\u0754\u075b\u0760\u0765\u076b\u0772\u0774"+
		"\u0777\u077c\u0780\u0788\u0790\u0796\u079f\u07a1\u07b1\u07b9\u07c8\u07cf"+
		"\u07df\u0800\u0805\u0819\u081d\u0821\u0829\u0830\u0834\u083a\u083d\u0841"+
		"\u0846\u084f\35\b\2\2\7\3\2\t@\2\7\t\2\2\6\2\3\7\2\7\4\2\3\b\3\2\3\2\5"+
		"\2\2\2\5\2\6\2\2\t\16\2\3\24\4\7\5\2\7\6\2\t$\2\2\4\2\7\13\2\3\u00d6\5"+
		"\7\n\2\7\f\2\t\u00d6\2\t\u00e4\2\3\u00ec\6\t\u00df\2\t\u00e5\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}