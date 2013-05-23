package csep.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCoffeeScriptLexer extends Lexer {
    public static final int RULE_BOUND_FUNC_ARROW=18;
    public static final int RULE_SWITCH=50;
    public static final int RULE_THROW=24;
    public static final int RULE_PARAM_START=56;
    public static final int RULE_TERMINATOR=19;
    public static final int RULE_CALL_END=21;
    public static final int RULE_RETURN=22;
    public static final int RULE_FOR=27;
    public static final int RULE_BOOL=60;
    public static final int RULE_LBRACKET=37;
    public static final int RULE_DOUBLE_COLON=15;
    public static final int RULE_MINUS_MINUS=12;
    public static final int RULE_COMPARE_WORD=80;
    public static final int RULE_OUTDENT=39;
    public static final int EOF=-1;
    public static final int RULE_RELATION=69;
    public static final int RULE_REGEX=62;
    public static final int RULE_CLASS=25;
    public static final int RULE_WHILE=28;
    public static final int RULE_COLON_SLASH=74;
    public static final int RULE_FUNC_EXIST=42;
    public static final int RULE_DOT=13;
    public static final int RULE_POST_IF=23;
    public static final int RULE_PLUS_PLUS=11;
    public static final int RULE_OWN=31;
    public static final int RULE_NUMBER=58;
    public static final int RULE_LOOP=46;
    public static final int RULE_LPAREN=64;
    public static final int RULE_FUNC_ARROW=17;
    public static final int RULE_AT_SIGIL=16;
    public static final int RULE_SHIFT=70;
    public static final int RULE_EXTENDS=26;
    public static final int RULE_INDEX_END=44;
    public static final int RULE_COMPARE=68;
    public static final int RULE_QUESTION_DOT=14;
    public static final int RULE_RBRACKET=36;
    public static final int RULE_COMPOUND_ASSIGN=7;
    public static final int RULE_SUPER=41;
    public static final int RULE_THEN=78;
    public static final int RULE_UNARY_WORD=81;
    public static final int RULE_LEADING_WHEN=52;
    public static final int RULE_DOT_DOT=4;
    public static final int RULE_STATEMENT=65;
    public static final int RULE_PLUS=8;
    public static final int RULE_BY=35;
    public static final int RULE_CATCH=48;
    public static final int RULE_INDEX_SOAK=76;
    public static final int RULE_CALL_START=20;
    public static final int RULE_COMMA=32;
    public static final int RULE_IDENTIFIER=73;
    public static final int RULE_INDEX_PROTO=75;
    public static final int RULE_TRY=47;
    public static final int RULE_INDENT=38;
    public static final int RULE_EQUAL=6;
    public static final int RULE_JS=61;
    public static final int RULE_HERECOMMENT=66;
    public static final int RULE_FORIN=34;
    public static final int RULE_ELLIPSIS=5;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=83;
    public static final int RULE_PARAM_END=57;
    public static final int RULE_WHEN=29;
    public static final int RULE_ML_COMMENT=82;
    public static final int RULE_INDEX_START=43;
    public static final int RULE_MINUS=9;
    public static final int RULE_COLON=55;
    public static final int RULE_STRING=59;
    public static final int RULE_NEW=77;
    public static final int RULE_LOGIC_WORD=79;
    public static final int RULE_LOGIC=67;
    public static final int RULE_RPAREN=63;
    public static final int RULE_WS=84;
    public static final int RULE_FOROF=33;
    public static final int RULE_UNARY=10;
    public static final int RULE_THIS=45;
    public static final int RULE_IF=72;
    public static final int RULE_ELSE=51;
    public static final int RULE_RCURLY=54;
    public static final int RULE_FINALLY=49;
    public static final int RULE_MATH=71;
    public static final int RULE_QUESTION=40;
    public static final int RULE_UNTIL=30;
    public static final int RULE_LCURLY=53;

    // delegates
    // delegators

    public InternalCoffeeScriptLexer() {;} 
    public InternalCoffeeScriptLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCoffeeScriptLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g"; }

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:11:7: ( 'require' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:11:9: 'require'
            {
            match("require"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "RULE_ELLIPSIS"
    public final void mRULE_ELLIPSIS() throws RecognitionException {
        try {
            int _type = RULE_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16317:15: ( '...' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16317:17: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELLIPSIS"

    // $ANTLR start "RULE_DOT_DOT"
    public final void mRULE_DOT_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16319:14: ( '..' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16319:16: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT_DOT"

    // $ANTLR start "RULE_DOUBLE_COLON"
    public final void mRULE_DOUBLE_COLON() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16321:19: ( '::' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16321:21: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_COLON"

    // $ANTLR start "RULE_SHIFT"
    public final void mRULE_SHIFT() throws RecognitionException {
        try {
            int _type = RULE_SHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16323:12: ( ( '<<' | '>>' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16323:14: ( '<<' | '>>' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16323:14: ( '<<' | '>>' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='<') ) {
                alt1=1;
            }
            else if ( (LA1_0=='>') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16323:15: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16323:20: '>>'
                    {
                    match(">>"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SHIFT"

    // $ANTLR start "RULE_BOUND_FUNC_ARROW"
    public final void mRULE_BOUND_FUNC_ARROW() throws RecognitionException {
        try {
            int _type = RULE_BOUND_FUNC_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16325:23: ( '=>' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16325:25: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOUND_FUNC_ARROW"

    // $ANTLR start "RULE_FUNC_ARROW"
    public final void mRULE_FUNC_ARROW() throws RecognitionException {
        try {
            int _type = RULE_FUNC_ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16327:17: ( '->' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16327:19: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FUNC_ARROW"

    // $ANTLR start "RULE_COMPARE"
    public final void mRULE_COMPARE() throws RecognitionException {
        try {
            int _type = RULE_COMPARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16329:14: ( ( '<' | '==' | '>' | '<=' | '>=' | '!=' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16329:16: ( '<' | '==' | '>' | '<=' | '>=' | '!=' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16329:16: ( '<' | '==' | '>' | '<=' | '>=' | '!=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=1;}
                }
                break;
            case '=':
                {
                alt2=2;
                }
                break;
            case '>':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='=') ) {
                    alt2=5;
                }
                else {
                    alt2=3;}
                }
                break;
            case '!':
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16329:17: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16329:21: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 3 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16329:26: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16329:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16329:35: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 6 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16329:40: '!='
                    {
                    match("!="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPARE"

    // $ANTLR start "RULE_COMPOUND_ASSIGN"
    public final void mRULE_COMPOUND_ASSIGN() throws RecognitionException {
        try {
            int _type = RULE_COMPOUND_ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16331:22: ( ( '+=' | '-=' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16331:24: ( '+=' | '-=' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16331:24: ( '+=' | '-=' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+') ) {
                alt3=1;
            }
            else if ( (LA3_0=='-') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16331:25: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16331:30: '-='
                    {
                    match("-="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPOUND_ASSIGN"

    // $ANTLR start "RULE_PLUS_PLUS"
    public final void mRULE_PLUS_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16333:16: ( '++' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16333:18: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS_PLUS"

    // $ANTLR start "RULE_MINUS_MINUS"
    public final void mRULE_MINUS_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16335:18: ( '--' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16335:20: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS_MINUS"

    // $ANTLR start "RULE_PARAM_END"
    public final void mRULE_PARAM_END() throws RecognitionException {
        try {
            int _type = RULE_PARAM_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16337:16: ( '**)' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16337:18: '**)'
            {
            match("**)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARAM_END"

    // $ANTLR start "RULE_PARAM_START"
    public final void mRULE_PARAM_START() throws RecognitionException {
        try {
            int _type = RULE_PARAM_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16339:18: ( '(**' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16339:20: '(**'
            {
            match("(**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARAM_START"

    // $ANTLR start "RULE_AT_SIGIL"
    public final void mRULE_AT_SIGIL() throws RecognitionException {
        try {
            int _type = RULE_AT_SIGIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16341:15: ( '@' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16341:17: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_AT_SIGIL"

    // $ANTLR start "RULE_BOOL"
    public final void mRULE_BOOL() throws RecognitionException {
        try {
            int _type = RULE_BOOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:11: ( ( 'true' | 'false' | 'undefined' | 'null' | 'on' | 'no' | 'yes' | 'off' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:13: ( 'true' | 'false' | 'undefined' | 'null' | 'on' | 'no' | 'yes' | 'off' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:13: ( 'true' | 'false' | 'undefined' | 'null' | 'on' | 'no' | 'yes' | 'off' )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:21: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:29: 'undefined'
                    {
                    match("undefined"); 


                    }
                    break;
                case 4 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:41: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 5 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:48: 'on'
                    {
                    match("on"); 


                    }
                    break;
                case 6 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:53: 'no'
                    {
                    match("no"); 


                    }
                    break;
                case 7 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:58: 'yes'
                    {
                    match("yes"); 


                    }
                    break;
                case 8 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16343:64: 'off'
                    {
                    match("off"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOL"

    // $ANTLR start "RULE_BY"
    public final void mRULE_BY() throws RecognitionException {
        try {
            int _type = RULE_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16345:9: ( 'by' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16345:11: 'by'
            {
            match("by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BY"

    // $ANTLR start "RULE_CALL_END"
    public final void mRULE_CALL_END() throws RecognitionException {
        try {
            int _type = RULE_CALL_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16347:15: ( '*)' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16347:17: '*)'
            {
            match("*)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CALL_END"

    // $ANTLR start "RULE_CALL_START"
    public final void mRULE_CALL_START() throws RecognitionException {
        try {
            int _type = RULE_CALL_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16349:17: ( '(*' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16349:19: '(*'
            {
            match("(*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CALL_START"

    // $ANTLR start "RULE_CATCH"
    public final void mRULE_CATCH() throws RecognitionException {
        try {
            int _type = RULE_CATCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16351:12: ( 'catch' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16351:14: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CATCH"

    // $ANTLR start "RULE_CLASS"
    public final void mRULE_CLASS() throws RecognitionException {
        try {
            int _type = RULE_CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16353:12: ( 'class' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16353:14: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLASS"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16355:12: ( ':' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16355:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_COLON_SLASH"
    public final void mRULE_COLON_SLASH() throws RecognitionException {
        try {
            int _type = RULE_COLON_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16357:18: ( 'dummy COLON_SLASH' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16357:20: 'dummy COLON_SLASH'
            {
            match("dummy COLON_SLASH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON_SLASH"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16359:12: ( ',' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16359:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16361:10: ( '.' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16361:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_ELSE"
    public final void mRULE_ELSE() throws RecognitionException {
        try {
            int _type = RULE_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16363:11: ( 'else' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16363:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ELSE"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16365:12: ( '=' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16365:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_EXTENDS"
    public final void mRULE_EXTENDS() throws RecognitionException {
        try {
            int _type = RULE_EXTENDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16367:14: ( 'extends' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16367:16: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXTENDS"

    // $ANTLR start "RULE_FINALLY"
    public final void mRULE_FINALLY() throws RecognitionException {
        try {
            int _type = RULE_FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16369:14: ( 'finally' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16369:16: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FINALLY"

    // $ANTLR start "RULE_FOR"
    public final void mRULE_FOR() throws RecognitionException {
        try {
            int _type = RULE_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16371:10: ( 'for' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16371:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOR"

    // $ANTLR start "RULE_FORIN"
    public final void mRULE_FORIN() throws RecognitionException {
        try {
            int _type = RULE_FORIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16373:12: ( 'in' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16373:14: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FORIN"

    // $ANTLR start "RULE_FOROF"
    public final void mRULE_FOROF() throws RecognitionException {
        try {
            int _type = RULE_FOROF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16375:12: ( 'of' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16375:14: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FOROF"

    // $ANTLR start "RULE_FUNC_EXIST"
    public final void mRULE_FUNC_EXIST() throws RecognitionException {
        try {
            int _type = RULE_FUNC_EXIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16377:17: ( 'dummy FUNC_EXIST' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16377:19: 'dummy FUNC_EXIST'
            {
            match("dummy FUNC_EXIST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FUNC_EXIST"

    // $ANTLR start "RULE_HERECOMMENT"
    public final void mRULE_HERECOMMENT() throws RecognitionException {
        try {
            int _type = RULE_HERECOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16379:18: ( 'dummy HERECOMMENT' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16379:20: 'dummy HERECOMMENT'
            {
            match("dummy HERECOMMENT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HERECOMMENT"

    // $ANTLR start "RULE_IF"
    public final void mRULE_IF() throws RecognitionException {
        try {
            int _type = RULE_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16381:9: ( ( 'if' | 'unless' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16381:11: ( 'if' | 'unless' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16381:11: ( 'if' | 'unless' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='i') ) {
                alt5=1;
            }
            else if ( (LA5_0=='u') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16381:12: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16381:17: 'unless'
                    {
                    match("unless"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IF"

    // $ANTLR start "RULE_INDENT"
    public final void mRULE_INDENT() throws RecognitionException {
        try {
            int _type = RULE_INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16383:13: ( '{*' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16383:15: '{*'
            {
            match("{*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INDENT"

    // $ANTLR start "RULE_INDEX_END"
    public final void mRULE_INDEX_END() throws RecognitionException {
        try {
            int _type = RULE_INDEX_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16385:16: ( '*]' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16385:18: '*]'
            {
            match("*]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INDEX_END"

    // $ANTLR start "RULE_INDEX_PROTO"
    public final void mRULE_INDEX_PROTO() throws RecognitionException {
        try {
            int _type = RULE_INDEX_PROTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16387:18: ( 'dummy INDEX_PROTO' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16387:20: 'dummy INDEX_PROTO'
            {
            match("dummy INDEX_PROTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INDEX_PROTO"

    // $ANTLR start "RULE_INDEX_SOAK"
    public final void mRULE_INDEX_SOAK() throws RecognitionException {
        try {
            int _type = RULE_INDEX_SOAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16389:17: ( 'dummy INDEX_SOAK' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16389:19: 'dummy INDEX_SOAK'
            {
            match("dummy INDEX_SOAK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INDEX_SOAK"

    // $ANTLR start "RULE_INDEX_START"
    public final void mRULE_INDEX_START() throws RecognitionException {
        try {
            int _type = RULE_INDEX_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16391:18: ( '[*' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16391:20: '[*'
            {
            match("[*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INDEX_START"

    // $ANTLR start "RULE_JS"
    public final void mRULE_JS() throws RecognitionException {
        try {
            int _type = RULE_JS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16393:9: ( 'dummy JS' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16393:11: 'dummy JS'
            {
            match("dummy JS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_JS"

    // $ANTLR start "RULE_LBRACKET"
    public final void mRULE_LBRACKET() throws RecognitionException {
        try {
            int _type = RULE_LBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16395:15: ( '[' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16395:17: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LBRACKET"

    // $ANTLR start "RULE_LCURLY"
    public final void mRULE_LCURLY() throws RecognitionException {
        try {
            int _type = RULE_LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16397:13: ( 'dummy LCURLY' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16397:15: 'dummy LCURLY'
            {
            match("dummy LCURLY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LCURLY"

    // $ANTLR start "RULE_LEADING_WHEN"
    public final void mRULE_LEADING_WHEN() throws RecognitionException {
        try {
            int _type = RULE_LEADING_WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16399:19: ( 'dummy LEADING_WHEN' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16399:21: 'dummy LEADING_WHEN'
            {
            match("dummy LEADING_WHEN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEADING_WHEN"

    // $ANTLR start "RULE_LOGIC"
    public final void mRULE_LOGIC() throws RecognitionException {
        try {
            int _type = RULE_LOGIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16401:12: ( ( '&&' | '||' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16401:14: ( '&&' | '||' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16401:14: ( '&&' | '||' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='&') ) {
                alt6=1;
            }
            else if ( (LA6_0=='|') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16401:15: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16401:20: '||'
                    {
                    match("||"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGIC"

    // $ANTLR start "RULE_LOOP"
    public final void mRULE_LOOP() throws RecognitionException {
        try {
            int _type = RULE_LOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16403:11: ( 'loop' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16403:13: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOOP"

    // $ANTLR start "RULE_LPAREN"
    public final void mRULE_LPAREN() throws RecognitionException {
        try {
            int _type = RULE_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16405:13: ( '(' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16405:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LPAREN"

    // $ANTLR start "RULE_MATH"
    public final void mRULE_MATH() throws RecognitionException {
        try {
            int _type = RULE_MATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16407:11: ( ( '*' | '/' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16407:13: ( '*' | '/' )
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MATH"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16409:12: ( '-' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16409:14: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MINUS"

    // $ANTLR start "RULE_NEW"
    public final void mRULE_NEW() throws RecognitionException {
        try {
            int _type = RULE_NEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16411:10: ( 'new' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16411:12: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEW"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16413:13: ( ( '0' .. '9' )+ )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16413:15: ( '0' .. '9' )+
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16413:15: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16413:16: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_OUTDENT"
    public final void mRULE_OUTDENT() throws RecognitionException {
        try {
            int _type = RULE_OUTDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16415:14: ( '*}' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16415:16: '*}'
            {
            match("*}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OUTDENT"

    // $ANTLR start "RULE_OWN"
    public final void mRULE_OWN() throws RecognitionException {
        try {
            int _type = RULE_OWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16417:10: ( 'own' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16417:12: 'own'
            {
            match("own"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OWN"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16419:11: ( '+' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16419:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_POST_IF"
    public final void mRULE_POST_IF() throws RecognitionException {
        try {
            int _type = RULE_POST_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16421:14: ( 'dummy POST_IF' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16421:16: 'dummy POST_IF'
            {
            match("dummy POST_IF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POST_IF"

    // $ANTLR start "RULE_QUESTION"
    public final void mRULE_QUESTION() throws RecognitionException {
        try {
            int _type = RULE_QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16423:15: ( '?' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16423:17: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTION"

    // $ANTLR start "RULE_QUESTION_DOT"
    public final void mRULE_QUESTION_DOT() throws RecognitionException {
        try {
            int _type = RULE_QUESTION_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16425:19: ( '?.' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16425:21: '?.'
            {
            match("?."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_QUESTION_DOT"

    // $ANTLR start "RULE_RBRACKET"
    public final void mRULE_RBRACKET() throws RecognitionException {
        try {
            int _type = RULE_RBRACKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16427:15: ( ']' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16427:17: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RBRACKET"

    // $ANTLR start "RULE_RCURLY"
    public final void mRULE_RCURLY() throws RecognitionException {
        try {
            int _type = RULE_RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16429:13: ( 'dummy RCURLY' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16429:15: 'dummy RCURLY'
            {
            match("dummy RCURLY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RCURLY"

    // $ANTLR start "RULE_REGEX"
    public final void mRULE_REGEX() throws RecognitionException {
        try {
            int _type = RULE_REGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16431:12: ( '///' ( options {greedy=false; } : . )* '///' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16431:14: '///' ( options {greedy=false; } : . )* '///'
            {
            match("///"); 

            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16431:20: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='/') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3=='/') ) {
                            alt8=2;
                        }
                        else if ( ((LA8_3>='\u0000' && LA8_3<='.')||(LA8_3>='0' && LA8_3<='\uFFFF')) ) {
                            alt8=1;
                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='.')||(LA8_0>='0' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16431:48: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("///"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGEX"

    // $ANTLR start "RULE_RELATION"
    public final void mRULE_RELATION() throws RecognitionException {
        try {
            int _type = RULE_RELATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16433:15: ( ( 'in' | 'of' | 'instanceof' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16433:17: ( 'in' | 'of' | 'instanceof' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16433:17: ( 'in' | 'of' | 'instanceof' )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='i') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='n') ) {
                    int LA9_3 = input.LA(3);

                    if ( (LA9_3=='s') ) {
                        alt9=3;
                    }
                    else {
                        alt9=1;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0=='o') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16433:18: 'in'
                    {
                    match("in"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16433:23: 'of'
                    {
                    match("of"); 


                    }
                    break;
                case 3 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16433:28: 'instanceof'
                    {
                    match("instanceof"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RELATION"

    // $ANTLR start "RULE_RETURN"
    public final void mRULE_RETURN() throws RecognitionException {
        try {
            int _type = RULE_RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16435:13: ( 'return' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16435:15: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RETURN"

    // $ANTLR start "RULE_RPAREN"
    public final void mRULE_RPAREN() throws RecognitionException {
        try {
            int _type = RULE_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16437:13: ( ')' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16437:15: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RPAREN"

    // $ANTLR start "RULE_STATEMENT"
    public final void mRULE_STATEMENT() throws RecognitionException {
        try {
            int _type = RULE_STATEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16439:16: ( ( 'break' | 'continue' | 'debugger' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16439:18: ( 'break' | 'continue' | 'debugger' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16439:18: ( 'break' | 'continue' | 'debugger' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 'b':
                {
                alt10=1;
                }
                break;
            case 'c':
                {
                alt10=2;
                }
                break;
            case 'd':
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16439:19: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16439:27: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 3 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16439:38: 'debugger'
                    {
                    match("debugger"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STATEMENT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:13: ( ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\\'' (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )? '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\"' (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )? '\"' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:15: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\\'' (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )? '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\"' (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )? '\"' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:15: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\\'' (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )? '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\"' (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )? '\"' )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\'') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='\'') ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3=='\'') ) {
                        alt17=1;
                    }
                    else {
                        alt17=2;}
                }
                else if ( ((LA17_1>='\u0000' && LA17_1<='&')||(LA17_1>='(' && LA17_1<='\uFFFF')) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0=='\"') ) {
                int LA17_2 = input.LA(2);

                if ( (LA17_2=='\"') ) {
                    int LA17_5 = input.LA(3);

                    if ( (LA17_5=='\"') ) {
                        alt17=3;
                    }
                    else {
                        alt17=4;}
                }
                else if ( ((LA17_2>='\u0000' && LA17_2<='!')||(LA17_2>='#' && LA17_2<='\uFFFF')) ) {
                    alt17=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:16: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:25: ( options {greedy=false; } : . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\'') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='\'') ) {
                                int LA11_3 = input.LA(3);

                                if ( (LA11_3=='\'') ) {
                                    alt11=2;
                                }
                                else if ( ((LA11_3>='\u0000' && LA11_3<='&')||(LA11_3>='(' && LA11_3<='\uFFFF')) ) {
                                    alt11=1;
                                }


                            }
                            else if ( ((LA11_1>='\u0000' && LA11_1<='&')||(LA11_1>='(' && LA11_1<='\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:53: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:66: '\\'' (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )? '\\''
                    {
                    match('\''); 
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:71: (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='\uFFFF')) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:72: ~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:80: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                            loop12:
                            do {
                                int alt12=3;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0=='\\') ) {
                                    alt12=1;
                                }
                                else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                                    alt12=2;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:81: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                            	    {
                            	    match('\\'); 
                            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                            	        input.consume();

                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;}


                            	    }
                            	    break;
                            	case 2 :
                            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:126: ~ ( ( '\\\\' | '\\'' ) )
                            	    {
                            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                            	        input.consume();

                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;}


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match('\''); 

                    }
                    break;
                case 3 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:150: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:156: ( options {greedy=false; } : . )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\"') ) {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1=='\"') ) {
                                int LA14_3 = input.LA(3);

                                if ( (LA14_3=='\"') ) {
                                    alt14=2;
                                }
                                else if ( ((LA14_3>='\u0000' && LA14_3<='!')||(LA14_3>='#' && LA14_3<='\uFFFF')) ) {
                                    alt14=1;
                                }


                            }
                            else if ( ((LA14_1>='\u0000' && LA14_1<='!')||(LA14_1>='#' && LA14_1<='\uFFFF')) ) {
                                alt14=1;
                            }


                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='!')||(LA14_0>='#' && LA14_0<='\uFFFF')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:184: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 4 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:194: '\"' (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )? '\"'
                    {
                    match('\"'); 
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:198: (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='\uFFFF')) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:199: ~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:206: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                            loop15:
                            do {
                                int alt15=3;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0=='\\') ) {
                                    alt15=1;
                                }
                                else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                                    alt15=2;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:207: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                            	    {
                            	    match('\\'); 
                            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                            	        input.consume();

                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;}


                            	    }
                            	    break;
                            	case 2 :
                            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16441:252: ~ ( ( '\\\\' | '\"' ) )
                            	    {
                            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                            	        input.consume();

                            	    }
                            	    else {
                            	        MismatchedSetException mse = new MismatchedSetException(null,input);
                            	        recover(mse);
                            	        throw mse;}


                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match('\"'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_SUPER"
    public final void mRULE_SUPER() throws RecognitionException {
        try {
            int _type = RULE_SUPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16443:12: ( 'super' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16443:14: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUPER"

    // $ANTLR start "RULE_SWITCH"
    public final void mRULE_SWITCH() throws RecognitionException {
        try {
            int _type = RULE_SWITCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16445:13: ( 'switch' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16445:15: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SWITCH"

    // $ANTLR start "RULE_TERMINATOR"
    public final void mRULE_TERMINATOR() throws RecognitionException {
        try {
            int _type = RULE_TERMINATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16447:17: ( ( '\\n' )+ )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16447:19: ( '\\n' )+
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16447:19: ( '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='\n') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16447:19: '\\n'
            	    {
            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERMINATOR"

    // $ANTLR start "RULE_THEN"
    public final void mRULE_THEN() throws RecognitionException {
        try {
            int _type = RULE_THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16449:11: ( 'then' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16449:13: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THEN"

    // $ANTLR start "RULE_THIS"
    public final void mRULE_THIS() throws RecognitionException {
        try {
            int _type = RULE_THIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16451:11: ( 'this' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16451:13: 'this'
            {
            match("this"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THIS"

    // $ANTLR start "RULE_THROW"
    public final void mRULE_THROW() throws RecognitionException {
        try {
            int _type = RULE_THROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16453:12: ( 'throw' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16453:14: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_THROW"

    // $ANTLR start "RULE_TRY"
    public final void mRULE_TRY() throws RecognitionException {
        try {
            int _type = RULE_TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16455:10: ( 'try' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16455:12: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRY"

    // $ANTLR start "RULE_UNARY"
    public final void mRULE_UNARY() throws RecognitionException {
        try {
            int _type = RULE_UNARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16457:12: ( ( '!' | '~' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16457:14: ( '!' | '~' )
            {
            if ( input.LA(1)=='!'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNARY"

    // $ANTLR start "RULE_UNTIL"
    public final void mRULE_UNTIL() throws RecognitionException {
        try {
            int _type = RULE_UNTIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16459:12: ( 'until' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16459:14: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNTIL"

    // $ANTLR start "RULE_WHEN"
    public final void mRULE_WHEN() throws RecognitionException {
        try {
            int _type = RULE_WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16461:11: ( 'when' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16461:13: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHEN"

    // $ANTLR start "RULE_WHILE"
    public final void mRULE_WHILE() throws RecognitionException {
        try {
            int _type = RULE_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16463:12: ( 'while' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16463:14: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WHILE"

    // $ANTLR start "RULE_LOGIC_WORD"
    public final void mRULE_LOGIC_WORD() throws RecognitionException {
        try {
            int _type = RULE_LOGIC_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16465:17: ( ( 'and' | 'or' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16465:19: ( 'and' | 'or' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16465:19: ( 'and' | 'or' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='a') ) {
                alt19=1;
            }
            else if ( (LA19_0=='o') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16465:20: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16465:26: 'or'
                    {
                    match("or"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOGIC_WORD"

    // $ANTLR start "RULE_COMPARE_WORD"
    public final void mRULE_COMPARE_WORD() throws RecognitionException {
        try {
            int _type = RULE_COMPARE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16467:19: ( ( 'isnt' | 'is' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16467:21: ( 'isnt' | 'is' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16467:21: ( 'isnt' | 'is' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='i') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='s') ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2=='n') ) {
                        alt20=1;
                    }
                    else {
                        alt20=2;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16467:22: 'isnt'
                    {
                    match("isnt"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16467:29: 'is'
                    {
                    match("is"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMPARE_WORD"

    // $ANTLR start "RULE_UNARY_WORD"
    public final void mRULE_UNARY_WORD() throws RecognitionException {
        try {
            int _type = RULE_UNARY_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16469:17: ( ( 'new' | 'do' | 'not' ) )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16469:19: ( 'new' | 'do' | 'not' )
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16469:19: ( 'new' | 'do' | 'not' )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='n') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='e') ) {
                    alt21=1;
                }
                else if ( (LA21_1=='o') ) {
                    alt21=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0=='d') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16469:20: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 2 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16469:26: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 3 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16469:31: 'not'
                    {
                    match("not"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNARY_WORD"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16471:17: ( '###' ~ ( '#' ) ( options {greedy=false; } : . )* '###' )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16471:19: '###' ~ ( '#' ) ( options {greedy=false; } : . )* '###'
            {
            match("###"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16471:32: ( options {greedy=false; } : . )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0=='#') ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1=='#') ) {
                        int LA22_3 = input.LA(3);

                        if ( (LA22_3=='#') ) {
                            alt22=2;
                        }
                        else if ( ((LA22_3>='\u0000' && LA22_3<='\"')||(LA22_3>='$' && LA22_3<='\uFFFF')) ) {
                            alt22=1;
                        }


                    }
                    else if ( ((LA22_1>='\u0000' && LA22_1<='\"')||(LA22_1>='$' && LA22_1<='\uFFFF')) ) {
                        alt22=1;
                    }


                }
                else if ( ((LA22_0>='\u0000' && LA22_0<='\"')||(LA22_0>='$' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16471:60: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            match("###"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16473:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16473:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16473:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16473:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16473:39: ( ( '\\r' )? '\\n' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16473:40: ( '\\r' )? '\\n'
                    {
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16473:40: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16473:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16475:9: ( ( ' ' | '\\t' )+ )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16475:11: ( ' ' | '\\t' )+
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16475:11: ( ' ' | '\\t' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\t'||LA26_0==' ') ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_IDENTIFIER"
    public final void mRULE_IDENTIFIER() throws RecognitionException {
        try {
            int _type = RULE_IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16477:17: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16477:19: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16477:19: ( '^' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='^') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16477:19: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:16477:48: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IDENTIFIER"

    public void mTokens() throws RecognitionException {
        // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:8: ( T__85 | RULE_ELLIPSIS | RULE_DOT_DOT | RULE_DOUBLE_COLON | RULE_SHIFT | RULE_BOUND_FUNC_ARROW | RULE_FUNC_ARROW | RULE_COMPARE | RULE_COMPOUND_ASSIGN | RULE_PLUS_PLUS | RULE_MINUS_MINUS | RULE_PARAM_END | RULE_PARAM_START | RULE_AT_SIGIL | RULE_BOOL | RULE_BY | RULE_CALL_END | RULE_CALL_START | RULE_CATCH | RULE_CLASS | RULE_COLON | RULE_COLON_SLASH | RULE_COMMA | RULE_DOT | RULE_ELSE | RULE_EQUAL | RULE_EXTENDS | RULE_FINALLY | RULE_FOR | RULE_FORIN | RULE_FOROF | RULE_FUNC_EXIST | RULE_HERECOMMENT | RULE_IF | RULE_INDENT | RULE_INDEX_END | RULE_INDEX_PROTO | RULE_INDEX_SOAK | RULE_INDEX_START | RULE_JS | RULE_LBRACKET | RULE_LCURLY | RULE_LEADING_WHEN | RULE_LOGIC | RULE_LOOP | RULE_LPAREN | RULE_MATH | RULE_MINUS | RULE_NEW | RULE_NUMBER | RULE_OUTDENT | RULE_OWN | RULE_PLUS | RULE_POST_IF | RULE_QUESTION | RULE_QUESTION_DOT | RULE_RBRACKET | RULE_RCURLY | RULE_REGEX | RULE_RELATION | RULE_RETURN | RULE_RPAREN | RULE_STATEMENT | RULE_STRING | RULE_SUPER | RULE_SWITCH | RULE_TERMINATOR | RULE_THEN | RULE_THIS | RULE_THROW | RULE_TRY | RULE_UNARY | RULE_UNTIL | RULE_WHEN | RULE_WHILE | RULE_LOGIC_WORD | RULE_COMPARE_WORD | RULE_UNARY_WORD | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_IDENTIFIER )
        int alt29=82;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:10: T__85
                {
                mT__85(); 

                }
                break;
            case 2 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:16: RULE_ELLIPSIS
                {
                mRULE_ELLIPSIS(); 

                }
                break;
            case 3 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:30: RULE_DOT_DOT
                {
                mRULE_DOT_DOT(); 

                }
                break;
            case 4 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:43: RULE_DOUBLE_COLON
                {
                mRULE_DOUBLE_COLON(); 

                }
                break;
            case 5 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:61: RULE_SHIFT
                {
                mRULE_SHIFT(); 

                }
                break;
            case 6 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:72: RULE_BOUND_FUNC_ARROW
                {
                mRULE_BOUND_FUNC_ARROW(); 

                }
                break;
            case 7 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:94: RULE_FUNC_ARROW
                {
                mRULE_FUNC_ARROW(); 

                }
                break;
            case 8 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:110: RULE_COMPARE
                {
                mRULE_COMPARE(); 

                }
                break;
            case 9 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:123: RULE_COMPOUND_ASSIGN
                {
                mRULE_COMPOUND_ASSIGN(); 

                }
                break;
            case 10 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:144: RULE_PLUS_PLUS
                {
                mRULE_PLUS_PLUS(); 

                }
                break;
            case 11 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:159: RULE_MINUS_MINUS
                {
                mRULE_MINUS_MINUS(); 

                }
                break;
            case 12 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:176: RULE_PARAM_END
                {
                mRULE_PARAM_END(); 

                }
                break;
            case 13 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:191: RULE_PARAM_START
                {
                mRULE_PARAM_START(); 

                }
                break;
            case 14 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:208: RULE_AT_SIGIL
                {
                mRULE_AT_SIGIL(); 

                }
                break;
            case 15 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:222: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 16 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:232: RULE_BY
                {
                mRULE_BY(); 

                }
                break;
            case 17 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:240: RULE_CALL_END
                {
                mRULE_CALL_END(); 

                }
                break;
            case 18 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:254: RULE_CALL_START
                {
                mRULE_CALL_START(); 

                }
                break;
            case 19 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:270: RULE_CATCH
                {
                mRULE_CATCH(); 

                }
                break;
            case 20 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:281: RULE_CLASS
                {
                mRULE_CLASS(); 

                }
                break;
            case 21 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:292: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 22 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:303: RULE_COLON_SLASH
                {
                mRULE_COLON_SLASH(); 

                }
                break;
            case 23 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:320: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 24 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:331: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 25 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:340: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 26 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:350: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 27 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:361: RULE_EXTENDS
                {
                mRULE_EXTENDS(); 

                }
                break;
            case 28 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:374: RULE_FINALLY
                {
                mRULE_FINALLY(); 

                }
                break;
            case 29 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:387: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 30 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:396: RULE_FORIN
                {
                mRULE_FORIN(); 

                }
                break;
            case 31 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:407: RULE_FOROF
                {
                mRULE_FOROF(); 

                }
                break;
            case 32 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:418: RULE_FUNC_EXIST
                {
                mRULE_FUNC_EXIST(); 

                }
                break;
            case 33 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:434: RULE_HERECOMMENT
                {
                mRULE_HERECOMMENT(); 

                }
                break;
            case 34 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:451: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 35 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:459: RULE_INDENT
                {
                mRULE_INDENT(); 

                }
                break;
            case 36 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:471: RULE_INDEX_END
                {
                mRULE_INDEX_END(); 

                }
                break;
            case 37 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:486: RULE_INDEX_PROTO
                {
                mRULE_INDEX_PROTO(); 

                }
                break;
            case 38 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:503: RULE_INDEX_SOAK
                {
                mRULE_INDEX_SOAK(); 

                }
                break;
            case 39 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:519: RULE_INDEX_START
                {
                mRULE_INDEX_START(); 

                }
                break;
            case 40 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:536: RULE_JS
                {
                mRULE_JS(); 

                }
                break;
            case 41 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:544: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 42 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:558: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 43 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:570: RULE_LEADING_WHEN
                {
                mRULE_LEADING_WHEN(); 

                }
                break;
            case 44 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:588: RULE_LOGIC
                {
                mRULE_LOGIC(); 

                }
                break;
            case 45 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:599: RULE_LOOP
                {
                mRULE_LOOP(); 

                }
                break;
            case 46 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:609: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 47 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:621: RULE_MATH
                {
                mRULE_MATH(); 

                }
                break;
            case 48 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:631: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 49 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:642: RULE_NEW
                {
                mRULE_NEW(); 

                }
                break;
            case 50 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:651: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 51 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:663: RULE_OUTDENT
                {
                mRULE_OUTDENT(); 

                }
                break;
            case 52 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:676: RULE_OWN
                {
                mRULE_OWN(); 

                }
                break;
            case 53 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:685: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 54 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:695: RULE_POST_IF
                {
                mRULE_POST_IF(); 

                }
                break;
            case 55 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:708: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 56 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:722: RULE_QUESTION_DOT
                {
                mRULE_QUESTION_DOT(); 

                }
                break;
            case 57 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:740: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 58 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:754: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 59 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:766: RULE_REGEX
                {
                mRULE_REGEX(); 

                }
                break;
            case 60 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:777: RULE_RELATION
                {
                mRULE_RELATION(); 

                }
                break;
            case 61 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:791: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 62 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:803: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 63 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:815: RULE_STATEMENT
                {
                mRULE_STATEMENT(); 

                }
                break;
            case 64 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:830: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 65 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:842: RULE_SUPER
                {
                mRULE_SUPER(); 

                }
                break;
            case 66 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:853: RULE_SWITCH
                {
                mRULE_SWITCH(); 

                }
                break;
            case 67 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:865: RULE_TERMINATOR
                {
                mRULE_TERMINATOR(); 

                }
                break;
            case 68 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:881: RULE_THEN
                {
                mRULE_THEN(); 

                }
                break;
            case 69 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:891: RULE_THIS
                {
                mRULE_THIS(); 

                }
                break;
            case 70 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:901: RULE_THROW
                {
                mRULE_THROW(); 

                }
                break;
            case 71 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:912: RULE_TRY
                {
                mRULE_TRY(); 

                }
                break;
            case 72 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:921: RULE_UNARY
                {
                mRULE_UNARY(); 

                }
                break;
            case 73 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:932: RULE_UNTIL
                {
                mRULE_UNTIL(); 

                }
                break;
            case 74 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:943: RULE_WHEN
                {
                mRULE_WHEN(); 

                }
                break;
            case 75 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:953: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 76 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:964: RULE_LOGIC_WORD
                {
                mRULE_LOGIC_WORD(); 

                }
                break;
            case 77 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:980: RULE_COMPARE_WORD
                {
                mRULE_COMPARE_WORD(); 

                }
                break;
            case 78 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:998: RULE_UNARY_WORD
                {
                mRULE_UNARY_WORD(); 

                }
                break;
            case 79 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:1014: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 80 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:1030: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 81 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:1046: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 82 :
                // ../csep.ui/src-gen/csep/ui/contentassist/antlr/internal/InternalCoffeeScript.g:1:1054: RULE_IDENTIFIER
                {
                mRULE_IDENTIFIER(); 

                }
                break;

        }

    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA4_eotS =
        "\13\uffff";
    static final String DFA4_eofS =
        "\13\uffff";
    static final String DFA4_minS =
        "\1\146\3\uffff\1\157\1\146\5\uffff";
    static final String DFA4_maxS =
        "\1\171\3\uffff\1\165\1\156\5\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\1\2\1\3\2\uffff\1\7\1\4\1\6\1\5\1\10";
    static final String DFA4_specialS =
        "\13\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\7\uffff\1\4\1\5\4\uffff\1\1\1\3\3\uffff\1\6",
            "",
            "",
            "",
            "\1\10\5\uffff\1\7",
            "\1\12\7\uffff\1\11",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "16343:13: ( 'true' | 'false' | 'undefined' | 'null' | 'on' | 'no' | 'yes' | 'off' )";
        }
    }
    static final String DFA29_eotS =
        "\1\uffff\1\52\1\55\1\57\2\61\1\63\1\67\1\45\1\71\1\76\1\100\1\uffff"+
        "\11\52\1\uffff\2\52\1\uffff\1\135\1\uffff\1\52\1\76\1\uffff\1\141"+
        "\3\uffff\1\52\2\uffff\2\52\1\147\2\uffff\1\52\1\153\22\uffff\1\155"+
        "\1\uffff\7\52\1\173\1\52\1\173\1\176\1\52\1\u0080\1\52\1\u0082\6"+
        "\52\1\u0089\2\52\1\u008d\1\u008e\1\u0090\2\uffff\1\52\3\uffff\4"+
        "\52\1\147\1\uffff\2\52\4\uffff\1\52\1\u009b\5\52\1\u00a1\4\52\1"+
        "\u0089\1\uffff\1\u00a6\1\173\1\uffff\1\u00a7\1\uffff\1\173\1\uffff"+
        "\6\52\1\uffff\3\52\2\uffff\1\52\1\uffff\5\52\1\u0080\1\147\2\52"+
        "\1\173\1\uffff\1\u00bc\1\u00bd\3\52\1\uffff\3\52\1\173\2\uffff\6"+
        "\52\1\u00ca\2\52\1\u0090\1\u00cd\2\52\1\u00d0\1\52\1\uffff\2\147"+
        "\2\52\2\uffff\1\u00d9\1\173\3\52\1\u00dd\1\u00de\1\u00df\1\u00e0"+
        "\3\52\1\uffff\2\52\1\uffff\1\u00e6\1\52\1\uffff\1\u00e8\1\uffff"+
        "\1\147\1\uffff\2\147\1\52\1\u00eb\1\uffff\2\52\1\u008e\4\uffff\1"+
        "\52\1\uffff\3\52\1\uffff\1\u00fa\1\uffff\1\147\1\u00fc\1\uffff\1"+
        "\u00fd\2\52\10\uffff\1\52\1\u0104\1\52\1\uffff\1\u00d2\2\uffff\1"+
        "\52\1\u00de\3\uffff\1\u00de\1\uffff\1\52\1\173\1\uffff\1\52\1\uffff"+
        "\1\u010c\5\uffff";
    static final String DFA29_eofS =
        "\u0110\uffff";
    static final String DFA29_minS =
        "\1\11\1\145\1\56\1\72\1\74\1\76\1\75\1\55\1\75\1\53\1\51\1\52\1"+
        "\uffff\1\150\1\141\1\156\1\145\1\146\1\145\1\162\1\141\1\145\1\uffff"+
        "\1\154\1\146\1\uffff\1\52\1\uffff\1\157\1\57\1\uffff\1\56\3\uffff"+
        "\1\165\2\uffff\1\150\1\156\1\43\2\uffff\1\161\1\56\22\uffff\1\52"+
        "\1\uffff\1\165\1\145\1\154\1\156\1\162\1\144\1\154\1\60\1\167\2"+
        "\60\1\156\1\60\1\163\1\60\1\145\1\164\1\141\1\156\1\155\1\142\1"+
        "\60\1\163\1\164\3\60\2\uffff\1\157\3\uffff\1\160\1\151\1\145\1\144"+
        "\1\43\1\uffff\2\165\4\uffff\1\145\1\60\1\156\1\163\1\157\1\163\1"+
        "\141\1\60\2\145\1\151\1\154\1\60\1\uffff\2\60\1\uffff\1\60\1\uffff"+
        "\1\60\1\uffff\1\141\1\143\1\163\1\164\1\155\1\165\1\uffff\2\145"+
        "\1\164\2\uffff\1\164\1\uffff\1\160\1\145\1\164\1\156\1\154\1\60"+
        "\1\0\1\151\1\162\1\60\1\uffff\2\60\1\167\1\145\1\154\1\uffff\1\146"+
        "\1\163\1\154\1\60\2\uffff\1\153\1\150\1\163\1\151\1\171\1\147\1"+
        "\60\1\156\1\141\2\60\1\162\1\143\1\60\1\145\3\0\1\162\1\156\2\uffff"+
        "\2\60\1\154\1\151\1\163\4\60\1\156\1\40\1\147\1\uffff\1\144\1\156"+
        "\1\uffff\1\60\1\150\1\uffff\1\60\1\uffff\4\0\1\145\1\60\1\uffff"+
        "\1\171\1\156\1\60\4\uffff\1\165\1\103\1\145\1\163\1\143\1\uffff"+
        "\1\60\1\uffff\1\0\1\60\1\uffff\1\60\2\145\3\uffff\1\116\1\uffff"+
        "\1\103\2\uffff\1\162\1\60\1\145\1\uffff\1\0\2\uffff\1\144\1\60\1"+
        "\104\2\uffff\1\60\1\uffff\1\157\1\60\1\105\1\146\1\130\1\60\1\137"+
        "\1\uffff\1\120\2\uffff";
    static final String DFA29_maxS =
        "\1\176\1\145\1\56\1\72\1\74\3\76\2\75\1\175\1\52\1\uffff\1\162\1"+
        "\157\1\156\1\165\1\167\1\145\1\171\1\157\1\165\1\uffff\1\170\1\163"+
        "\1\uffff\1\52\1\uffff\1\157\1\57\1\uffff\1\56\3\uffff\1\167\2\uffff"+
        "\1\150\1\156\1\43\2\uffff\1\164\1\56\22\uffff\1\52\1\uffff\1\171"+
        "\1\162\1\154\1\156\1\162\1\164\1\154\1\172\1\167\2\172\1\156\1\172"+
        "\1\163\1\172\1\145\1\164\1\141\1\156\1\155\1\142\1\172\1\163\1\164"+
        "\3\172\2\uffff\1\157\3\uffff\1\160\2\151\1\144\1\43\1\uffff\2\165"+
        "\4\uffff\1\145\1\172\1\156\1\163\1\157\1\163\1\141\1\172\2\145\1"+
        "\151\1\154\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\1\141\1\143\1\163\1\164\1\155\1\165\1\uffff\2\145\1\164\2\uffff"+
        "\1\164\1\uffff\1\160\1\145\1\164\1\156\1\154\1\172\1\uffff\1\151"+
        "\1\162\1\172\1\uffff\2\172\1\167\1\145\1\154\1\uffff\1\146\1\163"+
        "\1\154\1\172\2\uffff\1\153\1\150\1\163\1\151\1\171\1\147\1\172\1"+
        "\156\1\141\2\172\1\162\1\143\1\172\1\145\3\uffff\1\162\1\156\2\uffff"+
        "\2\172\1\154\1\151\1\163\4\172\1\156\1\40\1\147\1\uffff\1\144\1"+
        "\156\1\uffff\1\172\1\150\1\uffff\1\172\1\uffff\4\uffff\1\145\1\172"+
        "\1\uffff\1\171\1\156\1\172\4\uffff\1\165\1\122\1\145\1\163\1\143"+
        "\1\uffff\1\172\1\uffff\1\uffff\1\172\1\uffff\1\172\2\145\3\uffff"+
        "\1\116\1\uffff\1\105\2\uffff\1\162\1\172\1\145\1\uffff\1\uffff\2"+
        "\uffff\1\144\1\172\1\104\2\uffff\1\172\1\uffff\1\157\1\172\1\105"+
        "\1\146\1\130\1\172\1\137\1\uffff\1\123\2\uffff";
    static final String DFA29_acceptS =
        "\14\uffff\1\16\11\uffff\1\27\2\uffff\1\43\1\uffff\1\54\2\uffff\1"+
        "\62\1\uffff\1\71\1\76\1\100\1\uffff\1\103\1\110\3\uffff\1\121\1"+
        "\122\2\uffff\1\30\1\4\1\25\1\5\1\10\1\6\1\32\1\7\1\11\1\13\1\60"+
        "\1\12\1\65\1\14\1\21\1\44\1\63\1\57\1\uffff\1\56\33\uffff\1\47\1"+
        "\51\1\uffff\1\73\1\70\1\67\5\uffff\1\120\2\uffff\1\2\1\3\1\15\1"+
        "\22\15\uffff\1\17\2\uffff\1\37\1\uffff\1\114\1\uffff\1\20\6\uffff"+
        "\1\116\3\uffff\1\36\1\42\1\uffff\1\115\12\uffff\1\107\5\uffff\1"+
        "\35\4\uffff\1\61\1\64\24\uffff\1\104\1\105\14\uffff\1\31\2\uffff"+
        "\1\55\2\uffff\1\112\1\uffff\1\117\6\uffff\1\106\3\uffff\1\111\1"+
        "\77\1\23\1\24\5\uffff\1\101\1\uffff\1\113\2\uffff\1\75\3\uffff\1"+
        "\26\1\40\1\41\1\uffff\1\50\1\uffff\1\66\1\72\3\uffff\1\102\1\uffff"+
        "\1\1\1\34\3\uffff\1\52\1\53\1\uffff\1\33\7\uffff\1\74\1\uffff\1"+
        "\45\1\46";
    static final String DFA29_specialS =
        "\u0097\uffff\1\7\37\uffff\1\4\1\1\1\3\31\uffff\1\11\1\6\1\5\1\0"+
        "\22\uffff\1\2\21\uffff\1\10\24\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\51\1\44\25\uffff\1\51\1\10\1\42\1\50\2\uffff\1\33\1\42\1"+
            "\13\1\41\1\12\1\11\1\26\1\7\1\2\1\35\12\36\1\3\1\uffff\1\4\1"+
            "\6\1\5\1\37\1\14\32\52\1\32\1\uffff\1\40\2\52\1\uffff\1\47\1"+
            "\23\1\24\1\25\1\27\1\16\2\52\1\30\2\52\1\34\1\52\1\20\1\21\2"+
            "\52\1\1\1\43\1\15\1\17\1\52\1\46\1\52\1\22\1\52\1\31\1\33\1"+
            "\uffff\1\45",
            "\1\53",
            "\1\54",
            "\1\56",
            "\1\60",
            "\1\60",
            "\1\61\1\62",
            "\1\66\17\uffff\1\65\1\64",
            "\1\61",
            "\1\70\21\uffff\1\65",
            "\1\73\1\72\62\uffff\1\74\37\uffff\1\75",
            "\1\77",
            "",
            "\1\102\11\uffff\1\101",
            "\1\103\7\uffff\1\104\5\uffff\1\105",
            "\1\106",
            "\1\111\11\uffff\1\110\5\uffff\1\107",
            "\1\113\7\uffff\1\112\3\uffff\1\115\4\uffff\1\114",
            "\1\116",
            "\1\120\6\uffff\1\117",
            "\1\121\12\uffff\1\122\2\uffff\1\123",
            "\1\125\11\uffff\1\126\5\uffff\1\124",
            "",
            "\1\127\13\uffff\1\130",
            "\1\132\7\uffff\1\131\4\uffff\1\133",
            "",
            "\1\134",
            "",
            "\1\136",
            "\1\137",
            "",
            "\1\140",
            "",
            "",
            "",
            "\1\142\1\uffff\1\143",
            "",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "\1\150\2\uffff\1\151",
            "\1\152",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\154",
            "",
            "\1\156\3\uffff\1\157",
            "\1\160\3\uffff\1\161\10\uffff\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166\7\uffff\1\167\7\uffff\1\170",
            "\1\171",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\172\6\52",
            "\1\174",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\175\24\52",
            "\1\177",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0081",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008a",
            "\1\u008b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u008c\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u008f\14"+
            "\52",
            "",
            "",
            "\1\u0091",
            "",
            "",
            "",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\3\uffff\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "",
            "\1\u0098",
            "\1\u0099",
            "",
            "",
            "",
            "",
            "\1\u009a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "",
            "\1\u00b1",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\u00b9\1\u00b8\2\u00b9\1\u00b7\25\u00b9\1\uffff\uffdc\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00cb",
            "\1\u00cc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ce",
            "\1\u00cf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d1",
            "\12\u00d2\1\u00d3\ufff5\u00d2",
            "\0\u00d2",
            "\12\u00d6\1\u00d3\2\u00d6\1\u00d4\25\u00d6\1\u00d5\uffdc\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e7",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\u00d2",
            "\12\u00d2\1\u00d3\ufff5\u00d2",
            "\12\u00d6\1\u00d3\2\u00d6\1\u00d4\25\u00d6\1\u00e9\uffdc\u00d6",
            "\12\u00d6\1\u00d3\2\u00d6\1\u00d4\25\u00d6\1\u00d5\uffdc\u00d6",
            "\1\u00ea",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\u00ee",
            "\1\u00ef\2\uffff\1\u00f0\1\uffff\1\u00f1\1\u00f2\1\u00f3\1"+
            "\uffff\1\u00f4\3\uffff\1\u00f5\1\uffff\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\u00d6\1\u00d3\2\u00d6\1\u00d4\25\u00d6\1\u00fb\uffdc\u00d6",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "",
            "\1\u0100",
            "",
            "\1\u0101\1\uffff\1\u0102",
            "",
            "",
            "\1\u0103",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0105",
            "",
            "\12\u00d6\1\u00d3\2\u00d6\1\u00d4\25\u00d6\1\u00fb\uffdc\u00d6",
            "",
            "",
            "\1\u0106",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0107",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0108",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010d",
            "",
            "\1\u010e\2\uffff\1\u010f",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__85 | RULE_ELLIPSIS | RULE_DOT_DOT | RULE_DOUBLE_COLON | RULE_SHIFT | RULE_BOUND_FUNC_ARROW | RULE_FUNC_ARROW | RULE_COMPARE | RULE_COMPOUND_ASSIGN | RULE_PLUS_PLUS | RULE_MINUS_MINUS | RULE_PARAM_END | RULE_PARAM_START | RULE_AT_SIGIL | RULE_BOOL | RULE_BY | RULE_CALL_END | RULE_CALL_START | RULE_CATCH | RULE_CLASS | RULE_COLON | RULE_COLON_SLASH | RULE_COMMA | RULE_DOT | RULE_ELSE | RULE_EQUAL | RULE_EXTENDS | RULE_FINALLY | RULE_FOR | RULE_FORIN | RULE_FOROF | RULE_FUNC_EXIST | RULE_HERECOMMENT | RULE_IF | RULE_INDENT | RULE_INDEX_END | RULE_INDEX_PROTO | RULE_INDEX_SOAK | RULE_INDEX_START | RULE_JS | RULE_LBRACKET | RULE_LCURLY | RULE_LEADING_WHEN | RULE_LOGIC | RULE_LOOP | RULE_LPAREN | RULE_MATH | RULE_MINUS | RULE_NEW | RULE_NUMBER | RULE_OUTDENT | RULE_OWN | RULE_PLUS | RULE_POST_IF | RULE_QUESTION | RULE_QUESTION_DOT | RULE_RBRACKET | RULE_RCURLY | RULE_REGEX | RULE_RELATION | RULE_RETURN | RULE_RPAREN | RULE_STATEMENT | RULE_STRING | RULE_SUPER | RULE_SWITCH | RULE_TERMINATOR | RULE_THEN | RULE_THIS | RULE_THROW | RULE_TRY | RULE_UNARY | RULE_UNTIL | RULE_WHEN | RULE_WHILE | RULE_LOGIC_WORD | RULE_COMPARE_WORD | RULE_UNARY_WORD | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_IDENTIFIER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_214 = input.LA(1);

                        s = -1;
                        if ( (LA29_214=='\r') ) {s = 212;}

                        else if ( (LA29_214=='\n') ) {s = 211;}

                        else if ( (LA29_214=='#') ) {s = 213;}

                        else if ( ((LA29_214>='\u0000' && LA29_214<='\t')||(LA29_214>='\u000B' && LA29_214<='\f')||(LA29_214>='\u000E' && LA29_214<='\"')||(LA29_214>='$' && LA29_214<='\uFFFF')) ) {s = 214;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_184 = input.LA(1);

                        s = -1;
                        if ( ((LA29_184>='\u0000' && LA29_184<='\uFFFF')) ) {s = 210;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_233 = input.LA(1);

                        s = -1;
                        if ( (LA29_233=='#') ) {s = 251;}

                        else if ( (LA29_233=='\r') ) {s = 212;}

                        else if ( (LA29_233=='\n') ) {s = 211;}

                        else if ( ((LA29_233>='\u0000' && LA29_233<='\t')||(LA29_233>='\u000B' && LA29_233<='\f')||(LA29_233>='\u000E' && LA29_233<='\"')||(LA29_233>='$' && LA29_233<='\uFFFF')) ) {s = 214;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_185 = input.LA(1);

                        s = -1;
                        if ( (LA29_185=='\r') ) {s = 212;}

                        else if ( (LA29_185=='\n') ) {s = 211;}

                        else if ( (LA29_185=='#') ) {s = 213;}

                        else if ( ((LA29_185>='\u0000' && LA29_185<='\t')||(LA29_185>='\u000B' && LA29_185<='\f')||(LA29_185>='\u000E' && LA29_185<='\"')||(LA29_185>='$' && LA29_185<='\uFFFF')) ) {s = 214;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_183 = input.LA(1);

                        s = -1;
                        if ( ((LA29_183>='\u0000' && LA29_183<='\t')||(LA29_183>='\u000B' && LA29_183<='\uFFFF')) ) {s = 210;}

                        else if ( (LA29_183=='\n') ) {s = 211;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_213 = input.LA(1);

                        s = -1;
                        if ( (LA29_213=='#') ) {s = 233;}

                        else if ( (LA29_213=='\r') ) {s = 212;}

                        else if ( (LA29_213=='\n') ) {s = 211;}

                        else if ( ((LA29_213>='\u0000' && LA29_213<='\t')||(LA29_213>='\u000B' && LA29_213<='\f')||(LA29_213>='\u000E' && LA29_213<='\"')||(LA29_213>='$' && LA29_213<='\uFFFF')) ) {s = 214;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_212 = input.LA(1);

                        s = -1;
                        if ( ((LA29_212>='\u0000' && LA29_212<='\t')||(LA29_212>='\u000B' && LA29_212<='\uFFFF')) ) {s = 210;}

                        else if ( (LA29_212=='\n') ) {s = 211;}

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_151 = input.LA(1);

                        s = -1;
                        if ( (LA29_151=='\r') ) {s = 183;}

                        else if ( (LA29_151=='\n') ) {s = 184;}

                        else if ( ((LA29_151>='\u0000' && LA29_151<='\t')||(LA29_151>='\u000B' && LA29_151<='\f')||(LA29_151>='\u000E' && LA29_151<='\"')||(LA29_151>='$' && LA29_151<='\uFFFF')) ) {s = 185;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA29_251 = input.LA(1);

                        s = -1;
                        if ( (LA29_251=='#') ) {s = 251;}

                        else if ( (LA29_251=='\r') ) {s = 212;}

                        else if ( (LA29_251=='\n') ) {s = 211;}

                        else if ( ((LA29_251>='\u0000' && LA29_251<='\t')||(LA29_251>='\u000B' && LA29_251<='\f')||(LA29_251>='\u000E' && LA29_251<='\"')||(LA29_251>='$' && LA29_251<='\uFFFF')) ) {s = 214;}

                        else s = 210;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA29_211 = input.LA(1);

                        s = -1;
                        if ( ((LA29_211>='\u0000' && LA29_211<='\uFFFF')) ) {s = 210;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}