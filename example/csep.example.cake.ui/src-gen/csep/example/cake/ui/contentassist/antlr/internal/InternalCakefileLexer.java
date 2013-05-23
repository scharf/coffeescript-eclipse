package csep.example.cake.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCakefileLexer extends Lexer {
    public static final int RULE_BOUND_FUNC_ARROW=18;
    public static final int RULE_SWITCH=53;
    public static final int RULE_THROW=28;
    public static final int RULE_PARAM_START=24;
    public static final int RULE_TERMINATOR=23;
    public static final int RULE_CALL_END=22;
    public static final int RULE_RETURN=26;
    public static final int RULE_FOR=31;
    public static final int RULE_BOOL=61;
    public static final int RULE_LBRACKET=40;
    public static final int RULE_DOUBLE_COLON=15;
    public static final int RULE_MINUS_MINUS=12;
    public static final int RULE_COMPARE_WORD=81;
    public static final int RULE_OUTDENT=42;
    public static final int EOF=-1;
    public static final int RULE_RELATION=70;
    public static final int RULE_REGEX=63;
    public static final int RULE_CLASS=29;
    public static final int RULE_WHILE=32;
    public static final int RULE_COLON_SLASH=75;
    public static final int RULE_FUNC_EXIST=45;
    public static final int RULE_DOT=13;
    public static final int RULE_POST_IF=27;
    public static final int RULE_PLUS_PLUS=11;
    public static final int RULE_OWN=35;
    public static final int RULE_NUMBER=59;
    public static final int RULE_LOOP=49;
    public static final int RULE_LPAREN=65;
    public static final int RULE_FUNC_ARROW=17;
    public static final int RULE_AT_SIGIL=16;
    public static final int RULE_SHIFT=71;
    public static final int RULE_EXTENDS=30;
    public static final int RULE_INDEX_END=47;
    public static final int RULE_COMPARE=69;
    public static final int RULE_QUESTION_DOT=14;
    public static final int RULE_RBRACKET=39;
    public static final int RULE_COMPOUND_ASSIGN=7;
    public static final int RULE_SUPER=44;
    public static final int RULE_THEN=79;
    public static final int RULE_UNARY_WORD=82;
    public static final int RULE_LEADING_WHEN=55;
    public static final int RULE_TASK=19;
    public static final int RULE_DOT_DOT=4;
    public static final int RULE_STATEMENT=66;
    public static final int RULE_PLUS=8;
    public static final int RULE_BY=38;
    public static final int RULE_CATCH=51;
    public static final int RULE_INDEX_SOAK=77;
    public static final int RULE_CALL_START=20;
    public static final int RULE_COMMA=21;
    public static final int RULE_IDENTIFIER=74;
    public static final int RULE_INDEX_PROTO=76;
    public static final int RULE_TRY=50;
    public static final int RULE_INDENT=41;
    public static final int RULE_EQUAL=6;
    public static final int RULE_JS=62;
    public static final int RULE_HERECOMMENT=67;
    public static final int RULE_FORIN=37;
    public static final int RULE_ELLIPSIS=5;
    public static final int RULE_SL_COMMENT=84;
    public static final int RULE_PARAM_END=25;
    public static final int T__86=86;
    public static final int RULE_WHEN=33;
    public static final int RULE_ML_COMMENT=83;
    public static final int RULE_INDEX_START=46;
    public static final int RULE_MINUS=9;
    public static final int RULE_COLON=58;
    public static final int RULE_STRING=60;
    public static final int RULE_NEW=78;
    public static final int RULE_LOGIC_WORD=80;
    public static final int RULE_LOGIC=68;
    public static final int RULE_RPAREN=64;
    public static final int RULE_WS=85;
    public static final int RULE_FOROF=36;
    public static final int RULE_UNARY=10;
    public static final int RULE_THIS=48;
    public static final int RULE_IF=73;
    public static final int RULE_ELSE=54;
    public static final int RULE_RCURLY=57;
    public static final int RULE_FINALLY=52;
    public static final int RULE_MATH=72;
    public static final int RULE_UNTIL=34;
    public static final int RULE_QUESTION=43;
    public static final int RULE_LCURLY=56;

    // delegates
    // delegators

    public InternalCakefileLexer() {;} 
    public InternalCakefileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCakefileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g"; }

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:11:7: ( 'require' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:11:9: 'require'
            {
            match("require"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "RULE_TASK"
    public final void mRULE_TASK() throws RecognitionException {
        try {
            int _type = RULE_TASK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16773:11: ( 'task' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16773:13: 'task'
            {
            match("task"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TASK"

    // $ANTLR start "RULE_ELLIPSIS"
    public final void mRULE_ELLIPSIS() throws RecognitionException {
        try {
            int _type = RULE_ELLIPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16775:15: ( '...' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16775:17: '...'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16777:14: ( '..' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16777:16: '..'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16779:19: ( '::' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16779:21: '::'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16781:12: ( ( '<<' | '>>' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16781:14: ( '<<' | '>>' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16781:14: ( '<<' | '>>' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16781:15: '<<'
                    {
                    match("<<"); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16781:20: '>>'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16783:23: ( '=>' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16783:25: '=>'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16785:17: ( '->' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16785:19: '->'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16787:14: ( ( '<' | '==' | '>' | '<=' | '>=' | '!=' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16787:16: ( '<' | '==' | '>' | '<=' | '>=' | '!=' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16787:16: ( '<' | '==' | '>' | '<=' | '>=' | '!=' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16787:17: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16787:21: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 3 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16787:26: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16787:30: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16787:35: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 6 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16787:40: '!='
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16789:22: ( ( '+=' | '-=' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16789:24: ( '+=' | '-=' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16789:24: ( '+=' | '-=' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16789:25: '+='
                    {
                    match("+="); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16789:30: '-='
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16791:16: ( '++' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16791:18: '++'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16793:18: ( '--' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16793:20: '--'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16795:16: ( '**)' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16795:18: '**)'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16797:18: ( '(**' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16797:20: '(**'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16799:15: ( '@' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16799:17: '@'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:11: ( ( 'true' | 'false' | 'undefined' | 'null' | 'on' | 'no' | 'yes' | 'off' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:13: ( 'true' | 'false' | 'undefined' | 'null' | 'on' | 'no' | 'yes' | 'off' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:13: ( 'true' | 'false' | 'undefined' | 'null' | 'on' | 'no' | 'yes' | 'off' )
            int alt4=8;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:14: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:21: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 3 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:29: 'undefined'
                    {
                    match("undefined"); 


                    }
                    break;
                case 4 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:41: 'null'
                    {
                    match("null"); 


                    }
                    break;
                case 5 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:48: 'on'
                    {
                    match("on"); 


                    }
                    break;
                case 6 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:53: 'no'
                    {
                    match("no"); 


                    }
                    break;
                case 7 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:58: 'yes'
                    {
                    match("yes"); 


                    }
                    break;
                case 8 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16801:64: 'off'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16803:9: ( 'by' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16803:11: 'by'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16805:15: ( '*)' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16805:17: '*)'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16807:17: ( '(*' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16807:19: '(*'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16809:12: ( 'catch' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16809:14: 'catch'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16811:12: ( 'class' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16811:14: 'class'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16813:12: ( ':' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16813:14: ':'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16815:18: ( 'dummy COLON_SLASH' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16815:20: 'dummy COLON_SLASH'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16817:12: ( ',' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16817:14: ','
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16819:10: ( '.' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16819:12: '.'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16821:11: ( 'else' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16821:13: 'else'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16823:12: ( '=' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16823:14: '='
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16825:14: ( 'extends' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16825:16: 'extends'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16827:14: ( 'finally' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16827:16: 'finally'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16829:10: ( 'for' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16829:12: 'for'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16831:12: ( 'in' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16831:14: 'in'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16833:12: ( 'of' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16833:14: 'of'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16835:17: ( 'dummy FUNC_EXIST' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16835:19: 'dummy FUNC_EXIST'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16837:18: ( 'dummy HERECOMMENT' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16837:20: 'dummy HERECOMMENT'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16839:9: ( ( 'if' | 'unless' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16839:11: ( 'if' | 'unless' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16839:11: ( 'if' | 'unless' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16839:12: 'if'
                    {
                    match("if"); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16839:17: 'unless'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16841:13: ( '{*' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16841:15: '{*'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16843:16: ( '*]' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16843:18: '*]'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16845:18: ( 'dummy INDEX_PROTO' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16845:20: 'dummy INDEX_PROTO'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16847:17: ( 'dummy INDEX_SOAK' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16847:19: 'dummy INDEX_SOAK'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16849:18: ( '[*' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16849:20: '[*'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16851:9: ( 'dummy JS' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16851:11: 'dummy JS'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16853:15: ( '[' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16853:17: '['
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16855:13: ( 'dummy LCURLY' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16855:15: 'dummy LCURLY'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16857:19: ( 'dummy LEADING_WHEN' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16857:21: 'dummy LEADING_WHEN'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16859:12: ( ( '&&' | '||' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16859:14: ( '&&' | '||' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16859:14: ( '&&' | '||' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16859:15: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16859:20: '||'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16861:11: ( 'loop' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16861:13: 'loop'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16863:13: ( '(' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16863:15: '('
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16865:11: ( ( '*' | '/' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16865:13: ( '*' | '/' )
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16867:12: ( '-' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16867:14: '-'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16869:10: ( 'new' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16869:12: 'new'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16871:13: ( ( '0' .. '9' )+ )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16871:15: ( '0' .. '9' )+
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16871:15: ( '0' .. '9' )+
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
            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16871:16: '0' .. '9'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16873:14: ( '*}' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16873:16: '*}'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16875:10: ( 'own' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16875:12: 'own'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16877:11: ( '+' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16877:13: '+'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16879:14: ( 'dummy POST_IF' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16879:16: 'dummy POST_IF'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16881:15: ( '?' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16881:17: '?'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16883:19: ( '?.' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16883:21: '?.'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16885:15: ( ']' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16885:17: ']'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16887:13: ( 'dummy RCURLY' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16887:15: 'dummy RCURLY'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16889:12: ( '///' ( options {greedy=false; } : . )* '///' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16889:14: '///' ( options {greedy=false; } : . )* '///'
            {
            match("///"); 

            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16889:20: ( options {greedy=false; } : . )*
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
            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16889:48: .
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16891:15: ( ( 'in' | 'of' | 'instanceof' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16891:17: ( 'in' | 'of' | 'instanceof' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16891:17: ( 'in' | 'of' | 'instanceof' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16891:18: 'in'
                    {
                    match("in"); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16891:23: 'of'
                    {
                    match("of"); 


                    }
                    break;
                case 3 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16891:28: 'instanceof'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16893:13: ( 'return' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16893:15: 'return'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16895:13: ( ')' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16895:15: ')'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16897:16: ( ( 'break' | 'continue' | 'debugger' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16897:18: ( 'break' | 'continue' | 'debugger' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16897:18: ( 'break' | 'continue' | 'debugger' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16897:19: 'break'
                    {
                    match("break"); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16897:27: 'continue'
                    {
                    match("continue"); 


                    }
                    break;
                case 3 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16897:38: 'debugger'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:13: ( ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\\'' (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )? '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\"' (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )? '\"' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:15: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\\'' (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )? '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\"' (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )? '\"' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:15: ( '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\'' | '\\'' (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )? '\\'' | '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"' | '\"' (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )? '\"' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:16: '\\'\\'\\'' ( options {greedy=false; } : . )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:25: ( options {greedy=false; } : . )*
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
                    	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:53: .
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:66: '\\'' (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )? '\\''
                    {
                    match('\''); 
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:71: (~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='\uFFFF')) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:72: ~ ( '\\'' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:80: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:81: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:126: ~ ( ( '\\\\' | '\\'' ) )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:150: '\"\"\"' ( options {greedy=false; } : . )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:156: ( options {greedy=false; } : . )*
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
                    	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:184: .
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:194: '\"' (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )? '\"'
                    {
                    match('\"'); 
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:198: (~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='\uFFFF')) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:199: ~ ( '\"' ) ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                            {
                            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:206: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:207: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16899:252: ~ ( ( '\\\\' | '\"' ) )
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16901:12: ( 'super' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16901:14: 'super'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16903:13: ( 'switch' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16903:15: 'switch'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16905:17: ( ( '\\n' )+ )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16905:19: ( '\\n' )+
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16905:19: ( '\\n' )+
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
            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16905:19: '\\n'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16907:11: ( 'then' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16907:13: 'then'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16909:11: ( 'this' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16909:13: 'this'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16911:12: ( 'throw' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16911:14: 'throw'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16913:10: ( 'try' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16913:12: 'try'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16915:12: ( ( '!' | '~' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16915:14: ( '!' | '~' )
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16917:12: ( 'until' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16917:14: 'until'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16919:11: ( 'when' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16919:13: 'when'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16921:12: ( 'while' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16921:14: 'while'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16923:17: ( ( 'and' | 'or' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16923:19: ( 'and' | 'or' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16923:19: ( 'and' | 'or' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16923:20: 'and'
                    {
                    match("and"); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16923:26: 'or'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16925:19: ( ( 'isnt' | 'is' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16925:21: ( 'isnt' | 'is' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16925:21: ( 'isnt' | 'is' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16925:22: 'isnt'
                    {
                    match("isnt"); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16925:29: 'is'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16927:17: ( ( 'new' | 'do' | 'not' ) )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16927:19: ( 'new' | 'do' | 'not' )
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16927:19: ( 'new' | 'do' | 'not' )
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
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16927:20: 'new'
                    {
                    match("new"); 


                    }
                    break;
                case 2 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16927:26: 'do'
                    {
                    match("do"); 


                    }
                    break;
                case 3 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16927:31: 'not'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16929:17: ( '###' ~ ( '#' ) ( options {greedy=false; } : . )* '###' )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16929:19: '###' ~ ( '#' ) ( options {greedy=false; } : . )* '###'
            {
            match("###"); 

            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16929:32: ( options {greedy=false; } : . )*
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
            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16929:60: .
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16931:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16931:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16931:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\u0000' && LA23_0<='\t')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\uFFFF')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16931:23: ~ ( ( '\\n' | '\\r' ) )
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

            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16931:39: ( ( '\\r' )? '\\n' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\n'||LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16931:40: ( '\\r' )? '\\n'
                    {
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16931:40: ( '\\r' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='\r') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16931:40: '\\r'
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16933:9: ( ( ' ' | '\\t' )+ )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16933:11: ( ' ' | '\\t' )+
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16933:11: ( ' ' | '\\t' )+
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
            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:
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
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16935:17: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16935:19: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16935:19: ( '^' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='^') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16935:19: '^'
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

            // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:16935:48: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='0' && LA28_0<='9')||(LA28_0>='A' && LA28_0<='Z')||LA28_0=='_'||(LA28_0>='a' && LA28_0<='z')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:
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
        // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:8: ( T__86 | RULE_TASK | RULE_ELLIPSIS | RULE_DOT_DOT | RULE_DOUBLE_COLON | RULE_SHIFT | RULE_BOUND_FUNC_ARROW | RULE_FUNC_ARROW | RULE_COMPARE | RULE_COMPOUND_ASSIGN | RULE_PLUS_PLUS | RULE_MINUS_MINUS | RULE_PARAM_END | RULE_PARAM_START | RULE_AT_SIGIL | RULE_BOOL | RULE_BY | RULE_CALL_END | RULE_CALL_START | RULE_CATCH | RULE_CLASS | RULE_COLON | RULE_COLON_SLASH | RULE_COMMA | RULE_DOT | RULE_ELSE | RULE_EQUAL | RULE_EXTENDS | RULE_FINALLY | RULE_FOR | RULE_FORIN | RULE_FOROF | RULE_FUNC_EXIST | RULE_HERECOMMENT | RULE_IF | RULE_INDENT | RULE_INDEX_END | RULE_INDEX_PROTO | RULE_INDEX_SOAK | RULE_INDEX_START | RULE_JS | RULE_LBRACKET | RULE_LCURLY | RULE_LEADING_WHEN | RULE_LOGIC | RULE_LOOP | RULE_LPAREN | RULE_MATH | RULE_MINUS | RULE_NEW | RULE_NUMBER | RULE_OUTDENT | RULE_OWN | RULE_PLUS | RULE_POST_IF | RULE_QUESTION | RULE_QUESTION_DOT | RULE_RBRACKET | RULE_RCURLY | RULE_REGEX | RULE_RELATION | RULE_RETURN | RULE_RPAREN | RULE_STATEMENT | RULE_STRING | RULE_SUPER | RULE_SWITCH | RULE_TERMINATOR | RULE_THEN | RULE_THIS | RULE_THROW | RULE_TRY | RULE_UNARY | RULE_UNTIL | RULE_WHEN | RULE_WHILE | RULE_LOGIC_WORD | RULE_COMPARE_WORD | RULE_UNARY_WORD | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_IDENTIFIER )
        int alt29=83;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:10: T__86
                {
                mT__86(); 

                }
                break;
            case 2 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:16: RULE_TASK
                {
                mRULE_TASK(); 

                }
                break;
            case 3 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:26: RULE_ELLIPSIS
                {
                mRULE_ELLIPSIS(); 

                }
                break;
            case 4 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:40: RULE_DOT_DOT
                {
                mRULE_DOT_DOT(); 

                }
                break;
            case 5 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:53: RULE_DOUBLE_COLON
                {
                mRULE_DOUBLE_COLON(); 

                }
                break;
            case 6 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:71: RULE_SHIFT
                {
                mRULE_SHIFT(); 

                }
                break;
            case 7 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:82: RULE_BOUND_FUNC_ARROW
                {
                mRULE_BOUND_FUNC_ARROW(); 

                }
                break;
            case 8 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:104: RULE_FUNC_ARROW
                {
                mRULE_FUNC_ARROW(); 

                }
                break;
            case 9 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:120: RULE_COMPARE
                {
                mRULE_COMPARE(); 

                }
                break;
            case 10 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:133: RULE_COMPOUND_ASSIGN
                {
                mRULE_COMPOUND_ASSIGN(); 

                }
                break;
            case 11 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:154: RULE_PLUS_PLUS
                {
                mRULE_PLUS_PLUS(); 

                }
                break;
            case 12 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:169: RULE_MINUS_MINUS
                {
                mRULE_MINUS_MINUS(); 

                }
                break;
            case 13 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:186: RULE_PARAM_END
                {
                mRULE_PARAM_END(); 

                }
                break;
            case 14 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:201: RULE_PARAM_START
                {
                mRULE_PARAM_START(); 

                }
                break;
            case 15 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:218: RULE_AT_SIGIL
                {
                mRULE_AT_SIGIL(); 

                }
                break;
            case 16 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:232: RULE_BOOL
                {
                mRULE_BOOL(); 

                }
                break;
            case 17 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:242: RULE_BY
                {
                mRULE_BY(); 

                }
                break;
            case 18 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:250: RULE_CALL_END
                {
                mRULE_CALL_END(); 

                }
                break;
            case 19 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:264: RULE_CALL_START
                {
                mRULE_CALL_START(); 

                }
                break;
            case 20 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:280: RULE_CATCH
                {
                mRULE_CATCH(); 

                }
                break;
            case 21 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:291: RULE_CLASS
                {
                mRULE_CLASS(); 

                }
                break;
            case 22 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:302: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 23 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:313: RULE_COLON_SLASH
                {
                mRULE_COLON_SLASH(); 

                }
                break;
            case 24 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:330: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 25 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:341: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 26 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:350: RULE_ELSE
                {
                mRULE_ELSE(); 

                }
                break;
            case 27 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:360: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 28 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:371: RULE_EXTENDS
                {
                mRULE_EXTENDS(); 

                }
                break;
            case 29 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:384: RULE_FINALLY
                {
                mRULE_FINALLY(); 

                }
                break;
            case 30 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:397: RULE_FOR
                {
                mRULE_FOR(); 

                }
                break;
            case 31 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:406: RULE_FORIN
                {
                mRULE_FORIN(); 

                }
                break;
            case 32 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:417: RULE_FOROF
                {
                mRULE_FOROF(); 

                }
                break;
            case 33 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:428: RULE_FUNC_EXIST
                {
                mRULE_FUNC_EXIST(); 

                }
                break;
            case 34 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:444: RULE_HERECOMMENT
                {
                mRULE_HERECOMMENT(); 

                }
                break;
            case 35 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:461: RULE_IF
                {
                mRULE_IF(); 

                }
                break;
            case 36 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:469: RULE_INDENT
                {
                mRULE_INDENT(); 

                }
                break;
            case 37 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:481: RULE_INDEX_END
                {
                mRULE_INDEX_END(); 

                }
                break;
            case 38 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:496: RULE_INDEX_PROTO
                {
                mRULE_INDEX_PROTO(); 

                }
                break;
            case 39 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:513: RULE_INDEX_SOAK
                {
                mRULE_INDEX_SOAK(); 

                }
                break;
            case 40 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:529: RULE_INDEX_START
                {
                mRULE_INDEX_START(); 

                }
                break;
            case 41 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:546: RULE_JS
                {
                mRULE_JS(); 

                }
                break;
            case 42 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:554: RULE_LBRACKET
                {
                mRULE_LBRACKET(); 

                }
                break;
            case 43 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:568: RULE_LCURLY
                {
                mRULE_LCURLY(); 

                }
                break;
            case 44 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:580: RULE_LEADING_WHEN
                {
                mRULE_LEADING_WHEN(); 

                }
                break;
            case 45 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:598: RULE_LOGIC
                {
                mRULE_LOGIC(); 

                }
                break;
            case 46 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:609: RULE_LOOP
                {
                mRULE_LOOP(); 

                }
                break;
            case 47 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:619: RULE_LPAREN
                {
                mRULE_LPAREN(); 

                }
                break;
            case 48 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:631: RULE_MATH
                {
                mRULE_MATH(); 

                }
                break;
            case 49 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:641: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 50 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:652: RULE_NEW
                {
                mRULE_NEW(); 

                }
                break;
            case 51 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:661: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 52 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:673: RULE_OUTDENT
                {
                mRULE_OUTDENT(); 

                }
                break;
            case 53 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:686: RULE_OWN
                {
                mRULE_OWN(); 

                }
                break;
            case 54 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:695: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 55 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:705: RULE_POST_IF
                {
                mRULE_POST_IF(); 

                }
                break;
            case 56 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:718: RULE_QUESTION
                {
                mRULE_QUESTION(); 

                }
                break;
            case 57 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:732: RULE_QUESTION_DOT
                {
                mRULE_QUESTION_DOT(); 

                }
                break;
            case 58 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:750: RULE_RBRACKET
                {
                mRULE_RBRACKET(); 

                }
                break;
            case 59 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:764: RULE_RCURLY
                {
                mRULE_RCURLY(); 

                }
                break;
            case 60 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:776: RULE_REGEX
                {
                mRULE_REGEX(); 

                }
                break;
            case 61 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:787: RULE_RELATION
                {
                mRULE_RELATION(); 

                }
                break;
            case 62 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:801: RULE_RETURN
                {
                mRULE_RETURN(); 

                }
                break;
            case 63 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:813: RULE_RPAREN
                {
                mRULE_RPAREN(); 

                }
                break;
            case 64 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:825: RULE_STATEMENT
                {
                mRULE_STATEMENT(); 

                }
                break;
            case 65 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:840: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 66 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:852: RULE_SUPER
                {
                mRULE_SUPER(); 

                }
                break;
            case 67 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:863: RULE_SWITCH
                {
                mRULE_SWITCH(); 

                }
                break;
            case 68 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:875: RULE_TERMINATOR
                {
                mRULE_TERMINATOR(); 

                }
                break;
            case 69 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:891: RULE_THEN
                {
                mRULE_THEN(); 

                }
                break;
            case 70 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:901: RULE_THIS
                {
                mRULE_THIS(); 

                }
                break;
            case 71 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:911: RULE_THROW
                {
                mRULE_THROW(); 

                }
                break;
            case 72 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:922: RULE_TRY
                {
                mRULE_TRY(); 

                }
                break;
            case 73 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:931: RULE_UNARY
                {
                mRULE_UNARY(); 

                }
                break;
            case 74 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:942: RULE_UNTIL
                {
                mRULE_UNTIL(); 

                }
                break;
            case 75 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:953: RULE_WHEN
                {
                mRULE_WHEN(); 

                }
                break;
            case 76 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:963: RULE_WHILE
                {
                mRULE_WHILE(); 

                }
                break;
            case 77 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:974: RULE_LOGIC_WORD
                {
                mRULE_LOGIC_WORD(); 

                }
                break;
            case 78 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:990: RULE_COMPARE_WORD
                {
                mRULE_COMPARE_WORD(); 

                }
                break;
            case 79 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:1008: RULE_UNARY_WORD
                {
                mRULE_UNARY_WORD(); 

                }
                break;
            case 80 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:1024: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 81 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:1040: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 82 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:1056: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 83 :
                // ../csep.example.cake.ui/src-gen/csep/example/cake/ui/contentassist/antlr/internal/InternalCakefile.g:1:1064: RULE_IDENTIFIER
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
            return "16801:13: ( 'true' | 'false' | 'undefined' | 'null' | 'on' | 'no' | 'yes' | 'off' )";
        }
    }
    static final String DFA29_eotS =
        "\1\uffff\2\52\1\60\1\62\2\64\1\66\1\72\1\45\1\74\1\101\1\103\1\uffff"+
        "\10\52\1\uffff\2\52\1\uffff\1\136\1\uffff\1\52\1\101\1\uffff\1\142"+
        "\3\uffff\1\52\2\uffff\2\52\1\150\2\uffff\4\52\1\162\22\uffff\1\164"+
        "\1\uffff\5\52\1\175\1\52\1\175\1\u0080\1\52\1\u0082\1\52\1\u0084"+
        "\6\52\1\u008b\2\52\1\u008f\1\u0090\1\u0092\2\uffff\1\52\3\uffff"+
        "\4\52\1\150\1\uffff\4\52\1\u009e\3\52\4\uffff\2\52\1\u00a4\4\52"+
        "\1\u008b\1\uffff\1\u00a9\1\175\1\uffff\1\u00aa\1\uffff\1\175\1\uffff"+
        "\6\52\1\uffff\3\52\2\uffff\1\52\1\uffff\5\52\1\u0082\1\150\2\52"+
        "\1\u00bf\1\175\1\uffff\1\u00c0\1\u00c1\3\52\1\uffff\3\52\1\175\2"+
        "\uffff\6\52\1\u00ce\2\52\1\u0092\1\u00d1\2\52\1\u00d4\1\52\1\uffff"+
        "\2\150\2\52\3\uffff\1\u00dd\1\175\3\52\1\u00e1\1\u00e2\1\u00e3\1"+
        "\u00e4\3\52\1\uffff\2\52\1\uffff\1\u00ea\1\52\1\uffff\1\u00ec\1"+
        "\uffff\1\150\1\uffff\2\150\1\52\1\u00ef\1\uffff\2\52\1\u0090\4\uffff"+
        "\1\52\1\uffff\3\52\1\uffff\1\u00fe\1\uffff\1\150\1\u0100\1\uffff"+
        "\1\u0101\2\52\10\uffff\1\52\1\u0108\1\52\1\uffff\1\u00d6\2\uffff"+
        "\1\52\1\u00e2\3\uffff\1\u00e2\1\uffff\1\52\1\175\1\uffff\1\52\1"+
        "\uffff\1\u0110\5\uffff";
    static final String DFA29_eofS =
        "\u0114\uffff";
    static final String DFA29_minS =
        "\1\11\1\145\1\141\1\56\1\72\1\74\1\76\1\75\1\55\1\75\1\53\1\51\1"+
        "\52\1\uffff\1\141\1\156\1\145\1\146\1\145\1\162\1\141\1\145\1\uffff"+
        "\1\154\1\146\1\uffff\1\52\1\uffff\1\157\1\57\1\uffff\1\56\3\uffff"+
        "\1\165\2\uffff\1\150\1\156\1\43\2\uffff\1\161\1\163\1\165\1\145"+
        "\1\56\22\uffff\1\52\1\uffff\1\154\1\156\1\162\1\144\1\154\1\60\1"+
        "\167\2\60\1\156\1\60\1\163\1\60\1\145\1\164\1\141\1\156\1\155\1"+
        "\142\1\60\1\163\1\164\3\60\2\uffff\1\157\3\uffff\1\160\1\151\1\145"+
        "\1\144\1\43\1\uffff\2\165\1\153\1\145\1\60\1\156\1\163\1\157\4\uffff"+
        "\1\163\1\141\1\60\2\145\1\151\1\154\1\60\1\uffff\2\60\1\uffff\1"+
        "\60\1\uffff\1\60\1\uffff\1\141\1\143\1\163\1\164\1\155\1\165\1\uffff"+
        "\2\145\1\164\2\uffff\1\164\1\uffff\1\160\1\145\1\164\1\156\1\154"+
        "\1\60\1\0\1\151\1\162\2\60\1\uffff\2\60\1\167\1\145\1\154\1\uffff"+
        "\1\146\1\163\1\154\1\60\2\uffff\1\153\1\150\1\163\1\151\1\171\1"+
        "\147\1\60\1\156\1\141\2\60\1\162\1\143\1\60\1\145\3\0\1\162\1\156"+
        "\3\uffff\2\60\1\154\1\151\1\163\4\60\1\156\1\40\1\147\1\uffff\1"+
        "\144\1\156\1\uffff\1\60\1\150\1\uffff\1\60\1\uffff\4\0\1\145\1\60"+
        "\1\uffff\1\171\1\156\1\60\4\uffff\1\165\1\103\1\145\1\163\1\143"+
        "\1\uffff\1\60\1\uffff\1\0\1\60\1\uffff\1\60\2\145\3\uffff\1\116"+
        "\1\uffff\1\103\2\uffff\1\162\1\60\1\145\1\uffff\1\0\2\uffff\1\144"+
        "\1\60\1\104\2\uffff\1\60\1\uffff\1\157\1\60\1\105\1\146\1\130\1"+
        "\60\1\137\1\uffff\1\120\2\uffff";
    static final String DFA29_maxS =
        "\1\176\1\145\1\162\1\56\1\72\1\74\3\76\2\75\1\175\1\52\1\uffff\1"+
        "\157\1\156\1\165\1\167\1\145\1\171\1\157\1\165\1\uffff\1\170\1\163"+
        "\1\uffff\1\52\1\uffff\1\157\1\57\1\uffff\1\56\3\uffff\1\167\2\uffff"+
        "\1\150\1\156\1\43\2\uffff\1\164\1\163\1\171\1\162\1\56\22\uffff"+
        "\1\52\1\uffff\1\154\1\156\1\162\1\164\1\154\1\172\1\167\2\172\1"+
        "\156\1\172\1\163\1\172\1\145\1\164\1\141\1\156\1\155\1\142\1\172"+
        "\1\163\1\164\3\172\2\uffff\1\157\3\uffff\1\160\2\151\1\144\1\43"+
        "\1\uffff\2\165\1\153\1\145\1\172\1\156\1\163\1\157\4\uffff\1\163"+
        "\1\141\1\172\2\145\1\151\1\154\1\172\1\uffff\2\172\1\uffff\1\172"+
        "\1\uffff\1\172\1\uffff\1\141\1\143\1\163\1\164\1\155\1\165\1\uffff"+
        "\2\145\1\164\2\uffff\1\164\1\uffff\1\160\1\145\1\164\1\156\1\154"+
        "\1\172\1\uffff\1\151\1\162\2\172\1\uffff\2\172\1\167\1\145\1\154"+
        "\1\uffff\1\146\1\163\1\154\1\172\2\uffff\1\153\1\150\1\163\1\151"+
        "\1\171\1\147\1\172\1\156\1\141\2\172\1\162\1\143\1\172\1\145\3\uffff"+
        "\1\162\1\156\3\uffff\2\172\1\154\1\151\1\163\4\172\1\156\1\40\1"+
        "\147\1\uffff\1\144\1\156\1\uffff\1\172\1\150\1\uffff\1\172\1\uffff"+
        "\4\uffff\1\145\1\172\1\uffff\1\171\1\156\1\172\4\uffff\1\165\1\122"+
        "\1\145\1\163\1\143\1\uffff\1\172\1\uffff\1\uffff\1\172\1\uffff\1"+
        "\172\2\145\3\uffff\1\116\1\uffff\1\105\2\uffff\1\162\1\172\1\145"+
        "\1\uffff\1\uffff\2\uffff\1\144\1\172\1\104\2\uffff\1\172\1\uffff"+
        "\1\157\1\172\1\105\1\146\1\130\1\172\1\137\1\uffff\1\123\2\uffff";
    static final String DFA29_acceptS =
        "\15\uffff\1\17\10\uffff\1\30\2\uffff\1\44\1\uffff\1\55\2\uffff\1"+
        "\63\1\uffff\1\72\1\77\1\101\1\uffff\1\104\1\111\3\uffff\1\122\1"+
        "\123\5\uffff\1\31\1\5\1\26\1\6\1\11\1\7\1\33\1\10\1\12\1\14\1\61"+
        "\1\13\1\66\1\15\1\22\1\45\1\64\1\60\1\uffff\1\57\31\uffff\1\50\1"+
        "\52\1\uffff\1\74\1\71\1\70\5\uffff\1\121\10\uffff\1\3\1\4\1\16\1"+
        "\23\10\uffff\1\20\2\uffff\1\40\1\uffff\1\115\1\uffff\1\21\6\uffff"+
        "\1\117\3\uffff\1\37\1\43\1\uffff\1\116\13\uffff\1\110\5\uffff\1"+
        "\36\4\uffff\1\62\1\65\24\uffff\1\2\1\105\1\106\14\uffff\1\32\2\uffff"+
        "\1\56\2\uffff\1\113\1\uffff\1\120\6\uffff\1\107\3\uffff\1\112\1"+
        "\100\1\24\1\25\5\uffff\1\102\1\uffff\1\114\2\uffff\1\76\3\uffff"+
        "\1\27\1\41\1\42\1\uffff\1\51\1\uffff\1\67\1\73\3\uffff\1\103\1\uffff"+
        "\1\1\1\35\3\uffff\1\53\1\54\1\uffff\1\34\7\uffff\1\75\1\uffff\1"+
        "\46\1\47";
    static final String DFA29_specialS =
        "\u0099\uffff\1\0\40\uffff\1\1\1\5\1\10\32\uffff\1\3\1\2\1\7\1\4"+
        "\22\uffff\1\11\21\uffff\1\6\24\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\51\1\44\25\uffff\1\51\1\11\1\42\1\50\2\uffff\1\33\1\42\1"+
            "\14\1\41\1\13\1\12\1\26\1\10\1\3\1\35\12\36\1\4\1\uffff\1\5"+
            "\1\7\1\6\1\37\1\15\32\52\1\32\1\uffff\1\40\2\52\1\uffff\1\47"+
            "\1\23\1\24\1\25\1\27\1\16\2\52\1\30\2\52\1\34\1\52\1\20\1\21"+
            "\2\52\1\1\1\43\1\2\1\17\1\52\1\46\1\52\1\22\1\52\1\31\1\33\1"+
            "\uffff\1\45",
            "\1\53",
            "\1\54\6\uffff\1\56\11\uffff\1\55",
            "\1\57",
            "\1\61",
            "\1\63",
            "\1\63",
            "\1\64\1\65",
            "\1\71\17\uffff\1\70\1\67",
            "\1\64",
            "\1\73\21\uffff\1\70",
            "\1\76\1\75\62\uffff\1\77\37\uffff\1\100",
            "\1\102",
            "",
            "\1\104\7\uffff\1\105\5\uffff\1\106",
            "\1\107",
            "\1\112\11\uffff\1\111\5\uffff\1\110",
            "\1\114\7\uffff\1\113\3\uffff\1\116\4\uffff\1\115",
            "\1\117",
            "\1\121\6\uffff\1\120",
            "\1\122\12\uffff\1\123\2\uffff\1\124",
            "\1\126\11\uffff\1\127\5\uffff\1\125",
            "",
            "\1\130\13\uffff\1\131",
            "\1\133\7\uffff\1\132\4\uffff\1\134",
            "",
            "\1\135",
            "",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "",
            "",
            "",
            "\1\143\1\uffff\1\144",
            "",
            "",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "",
            "\1\151\2\uffff\1\152",
            "\1\153",
            "\1\154\3\uffff\1\155",
            "\1\156\3\uffff\1\157\10\uffff\1\160",
            "\1\161",
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
            "\1\163",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170\7\uffff\1\171\7\uffff\1\172",
            "\1\173",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\23\52\1\174\6\52",
            "\1\176",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\5\52\1\177\24\52",
            "\1\u0081",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0083",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008c",
            "\1\u008d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\22\52\1\u008e\7\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\15\52\1\u0091\14"+
            "\52",
            "",
            "",
            "\1\u0093",
            "",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096\3\uffff\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "",
            "",
            "",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\1\u00b4",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\u00bc\1\u00bb\2\u00bc\1\u00ba\25\u00bc\1\uffff\uffdc\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00cf",
            "\1\u00d0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d2",
            "\1\u00d3",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d5",
            "\12\u00d6\1\u00d7\ufff5\u00d6",
            "\0\u00d6",
            "\12\u00da\1\u00d7\2\u00da\1\u00d8\25\u00da\1\u00d9\uffdc\u00da",
            "\1\u00db",
            "\1\u00dc",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00eb",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\0\u00d6",
            "\12\u00d6\1\u00d7\ufff5\u00d6",
            "\12\u00da\1\u00d7\2\u00da\1\u00d8\25\u00da\1\u00ed\uffdc\u00da",
            "\12\u00da\1\u00d7\2\u00da\1\u00d8\25\u00da\1\u00d9\uffdc\u00da",
            "\1\u00ee",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "",
            "\1\u00f2",
            "\1\u00f3\2\uffff\1\u00f4\1\uffff\1\u00f5\1\u00f6\1\u00f7\1"+
            "\uffff\1\u00f8\3\uffff\1\u00f9\1\uffff\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\u00da\1\u00d7\2\u00da\1\u00d8\25\u00da\1\u00ff\uffdc\u00da",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0102",
            "\1\u0103",
            "",
            "",
            "",
            "\1\u0104",
            "",
            "\1\u0105\1\uffff\1\u0106",
            "",
            "",
            "\1\u0107",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0109",
            "",
            "\12\u00da\1\u00d7\2\u00da\1\u00d8\25\u00da\1\u00ff\uffdc\u00da",
            "",
            "",
            "\1\u010a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010b",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u010c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0111",
            "",
            "\1\u0112\2\uffff\1\u0113",
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
            return "1:1: Tokens : ( T__86 | RULE_TASK | RULE_ELLIPSIS | RULE_DOT_DOT | RULE_DOUBLE_COLON | RULE_SHIFT | RULE_BOUND_FUNC_ARROW | RULE_FUNC_ARROW | RULE_COMPARE | RULE_COMPOUND_ASSIGN | RULE_PLUS_PLUS | RULE_MINUS_MINUS | RULE_PARAM_END | RULE_PARAM_START | RULE_AT_SIGIL | RULE_BOOL | RULE_BY | RULE_CALL_END | RULE_CALL_START | RULE_CATCH | RULE_CLASS | RULE_COLON | RULE_COLON_SLASH | RULE_COMMA | RULE_DOT | RULE_ELSE | RULE_EQUAL | RULE_EXTENDS | RULE_FINALLY | RULE_FOR | RULE_FORIN | RULE_FOROF | RULE_FUNC_EXIST | RULE_HERECOMMENT | RULE_IF | RULE_INDENT | RULE_INDEX_END | RULE_INDEX_PROTO | RULE_INDEX_SOAK | RULE_INDEX_START | RULE_JS | RULE_LBRACKET | RULE_LCURLY | RULE_LEADING_WHEN | RULE_LOGIC | RULE_LOOP | RULE_LPAREN | RULE_MATH | RULE_MINUS | RULE_NEW | RULE_NUMBER | RULE_OUTDENT | RULE_OWN | RULE_PLUS | RULE_POST_IF | RULE_QUESTION | RULE_QUESTION_DOT | RULE_RBRACKET | RULE_RCURLY | RULE_REGEX | RULE_RELATION | RULE_RETURN | RULE_RPAREN | RULE_STATEMENT | RULE_STRING | RULE_SUPER | RULE_SWITCH | RULE_TERMINATOR | RULE_THEN | RULE_THIS | RULE_THROW | RULE_TRY | RULE_UNARY | RULE_UNTIL | RULE_WHEN | RULE_WHILE | RULE_LOGIC_WORD | RULE_COMPARE_WORD | RULE_UNARY_WORD | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_IDENTIFIER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_153 = input.LA(1);

                        s = -1;
                        if ( (LA29_153=='\r') ) {s = 186;}

                        else if ( (LA29_153=='\n') ) {s = 187;}

                        else if ( ((LA29_153>='\u0000' && LA29_153<='\t')||(LA29_153>='\u000B' && LA29_153<='\f')||(LA29_153>='\u000E' && LA29_153<='\"')||(LA29_153>='$' && LA29_153<='\uFFFF')) ) {s = 188;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_186 = input.LA(1);

                        s = -1;
                        if ( ((LA29_186>='\u0000' && LA29_186<='\t')||(LA29_186>='\u000B' && LA29_186<='\uFFFF')) ) {s = 214;}

                        else if ( (LA29_186=='\n') ) {s = 215;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_216 = input.LA(1);

                        s = -1;
                        if ( ((LA29_216>='\u0000' && LA29_216<='\t')||(LA29_216>='\u000B' && LA29_216<='\uFFFF')) ) {s = 214;}

                        else if ( (LA29_216=='\n') ) {s = 215;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_215 = input.LA(1);

                        s = -1;
                        if ( ((LA29_215>='\u0000' && LA29_215<='\uFFFF')) ) {s = 214;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_218 = input.LA(1);

                        s = -1;
                        if ( (LA29_218=='\r') ) {s = 216;}

                        else if ( (LA29_218=='\n') ) {s = 215;}

                        else if ( (LA29_218=='#') ) {s = 217;}

                        else if ( ((LA29_218>='\u0000' && LA29_218<='\t')||(LA29_218>='\u000B' && LA29_218<='\f')||(LA29_218>='\u000E' && LA29_218<='\"')||(LA29_218>='$' && LA29_218<='\uFFFF')) ) {s = 218;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA29_187 = input.LA(1);

                        s = -1;
                        if ( ((LA29_187>='\u0000' && LA29_187<='\uFFFF')) ) {s = 214;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA29_255 = input.LA(1);

                        s = -1;
                        if ( (LA29_255=='#') ) {s = 255;}

                        else if ( (LA29_255=='\r') ) {s = 216;}

                        else if ( (LA29_255=='\n') ) {s = 215;}

                        else if ( ((LA29_255>='\u0000' && LA29_255<='\t')||(LA29_255>='\u000B' && LA29_255<='\f')||(LA29_255>='\u000E' && LA29_255<='\"')||(LA29_255>='$' && LA29_255<='\uFFFF')) ) {s = 218;}

                        else s = 214;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA29_217 = input.LA(1);

                        s = -1;
                        if ( (LA29_217=='#') ) {s = 237;}

                        else if ( (LA29_217=='\r') ) {s = 216;}

                        else if ( (LA29_217=='\n') ) {s = 215;}

                        else if ( ((LA29_217>='\u0000' && LA29_217<='\t')||(LA29_217>='\u000B' && LA29_217<='\f')||(LA29_217>='\u000E' && LA29_217<='\"')||(LA29_217>='$' && LA29_217<='\uFFFF')) ) {s = 218;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA29_188 = input.LA(1);

                        s = -1;
                        if ( (LA29_188=='\r') ) {s = 216;}

                        else if ( (LA29_188=='\n') ) {s = 215;}

                        else if ( (LA29_188=='#') ) {s = 217;}

                        else if ( ((LA29_188>='\u0000' && LA29_188<='\t')||(LA29_188>='\u000B' && LA29_188<='\f')||(LA29_188>='\u000E' && LA29_188<='\"')||(LA29_188>='$' && LA29_188<='\uFFFF')) ) {s = 218;}

                        else s = 104;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA29_237 = input.LA(1);

                        s = -1;
                        if ( (LA29_237=='#') ) {s = 255;}

                        else if ( (LA29_237=='\r') ) {s = 216;}

                        else if ( (LA29_237=='\n') ) {s = 215;}

                        else if ( ((LA29_237>='\u0000' && LA29_237<='\t')||(LA29_237>='\u000B' && LA29_237<='\f')||(LA29_237>='\u000E' && LA29_237<='\"')||(LA29_237>='$' && LA29_237<='\uFFFF')) ) {s = 218;}

                        else s = 104;

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