package csep.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import csep.services.CoffeeScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCoffeeScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TERMINATOR", "RULE_STATEMENT", "RULE_HERECOMMENT", "RULE_EQUAL", "RULE_CALL_START", "RULE_STRING", "RULE_CALL_END", "RULE_RETURN", "RULE_POST_IF", "RULE_THROW", "RULE_CLASS", "RULE_EXTENDS", "RULE_FOR", "RULE_WHILE", "RULE_WHEN", "RULE_UNTIL", "RULE_OWN", "RULE_COMMA", "RULE_FOROF", "RULE_FORIN", "RULE_BY", "RULE_LBRACKET", "RULE_DOT_DOT", "RULE_ELLIPSIS", "RULE_RBRACKET", "RULE_COMPOUND_ASSIGN", "RULE_INDENT", "RULE_OUTDENT", "RULE_LOGIC", "RULE_COMPARE", "RULE_RELATION", "RULE_SHIFT", "RULE_PLUS", "RULE_MINUS", "RULE_MATH", "RULE_UNARY", "RULE_PLUS_PLUS", "RULE_MINUS_MINUS", "RULE_QUESTION", "RULE_SUPER", "RULE_FUNC_EXIST", "RULE_AT_SIGIL", "RULE_DOT", "RULE_QUESTION_DOT", "RULE_DOUBLE_COLON", "RULE_INDEX_START", "RULE_INDEX_END", "RULE_THIS", "RULE_LOOP", "RULE_TRY", "RULE_CATCH", "RULE_FINALLY", "RULE_SWITCH", "RULE_ELSE", "RULE_LEADING_WHEN", "RULE_IF", "RULE_IDENTIFIER", "RULE_LCURLY", "RULE_RCURLY", "RULE_COLON", "RULE_PARAM_START", "RULE_PARAM_END", "RULE_FUNC_ARROW", "RULE_BOUND_FUNC_ARROW", "RULE_NUMBER", "RULE_BOOL", "RULE_JS", "RULE_REGEX", "RULE_LPAREN", "RULE_RPAREN", "RULE_COLON_SLASH", "RULE_INDEX_PROTO", "RULE_INDEX_SOAK", "RULE_NEW", "RULE_THEN", "RULE_LOGIC_WORD", "RULE_COMPARE_WORD", "RULE_UNARY_WORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'require'"
    };
    public static final int RULE_BOUND_FUNC_ARROW=67;
    public static final int RULE_SWITCH=56;
    public static final int RULE_THROW=13;
    public static final int RULE_PARAM_START=64;
    public static final int RULE_TERMINATOR=4;
    public static final int RULE_CALL_END=10;
    public static final int RULE_RETURN=11;
    public static final int RULE_FOR=16;
    public static final int RULE_BOOL=69;
    public static final int RULE_LBRACKET=25;
    public static final int RULE_DOUBLE_COLON=48;
    public static final int RULE_MINUS_MINUS=41;
    public static final int RULE_COMPARE_WORD=80;
    public static final int EOF=-1;
    public static final int RULE_OUTDENT=31;
    public static final int RULE_RELATION=34;
    public static final int RULE_REGEX=71;
    public static final int RULE_CLASS=14;
    public static final int RULE_WHILE=17;
    public static final int RULE_COLON_SLASH=74;
    public static final int RULE_FUNC_EXIST=44;
    public static final int RULE_DOT=46;
    public static final int RULE_POST_IF=12;
    public static final int RULE_PLUS_PLUS=40;
    public static final int RULE_OWN=20;
    public static final int RULE_NUMBER=68;
    public static final int RULE_LOOP=52;
    public static final int RULE_LPAREN=72;
    public static final int RULE_FUNC_ARROW=66;
    public static final int RULE_AT_SIGIL=45;
    public static final int RULE_EXTENDS=15;
    public static final int RULE_SHIFT=35;
    public static final int RULE_INDEX_END=50;
    public static final int RULE_COMPARE=33;
    public static final int RULE_QUESTION_DOT=47;
    public static final int RULE_RBRACKET=28;
    public static final int RULE_COMPOUND_ASSIGN=29;
    public static final int RULE_SUPER=43;
    public static final int RULE_THEN=78;
    public static final int RULE_UNARY_WORD=81;
    public static final int RULE_LEADING_WHEN=58;
    public static final int RULE_DOT_DOT=26;
    public static final int RULE_STATEMENT=5;
    public static final int RULE_PLUS=36;
    public static final int RULE_BY=24;
    public static final int RULE_INDEX_SOAK=76;
    public static final int RULE_CATCH=54;
    public static final int RULE_CALL_START=8;
    public static final int RULE_INDEX_PROTO=75;
    public static final int RULE_IDENTIFIER=60;
    public static final int RULE_COMMA=21;
    public static final int RULE_TRY=53;
    public static final int RULE_JS=70;
    public static final int RULE_EQUAL=7;
    public static final int RULE_INDENT=30;
    public static final int RULE_HERECOMMENT=6;
    public static final int RULE_FORIN=23;
    public static final int RULE_ELLIPSIS=27;
    public static final int T__85=85;
    public static final int RULE_SL_COMMENT=83;
    public static final int RULE_PARAM_END=65;
    public static final int RULE_ML_COMMENT=82;
    public static final int RULE_WHEN=18;
    public static final int RULE_INDEX_START=49;
    public static final int RULE_COLON=63;
    public static final int RULE_MINUS=37;
    public static final int RULE_STRING=9;
    public static final int RULE_NEW=77;
    public static final int RULE_LOGIC_WORD=79;
    public static final int RULE_LOGIC=32;
    public static final int RULE_RPAREN=73;
    public static final int RULE_WS=84;
    public static final int RULE_FOROF=22;
    public static final int RULE_IF=59;
    public static final int RULE_THIS=51;
    public static final int RULE_UNARY=39;
    public static final int RULE_RCURLY=62;
    public static final int RULE_ELSE=57;
    public static final int RULE_FINALLY=55;
    public static final int RULE_MATH=38;
    public static final int RULE_LCURLY=61;
    public static final int RULE_UNTIL=19;
    public static final int RULE_QUESTION=42;

    // delegates
    // delegators


        public InternalCoffeeScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCoffeeScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCoffeeScriptParser.tokenNames; }
    public String getGrammarFileName() { return "../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g"; }



     	private CoffeeScriptGrammarAccess grammarAccess;
     	
        public InternalCoffeeScriptParser(TokenStream input, CoffeeScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Root";	
       	}
       	
       	@Override
       	protected CoffeeScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRoot"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:67:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:68:2: (iv_ruleRoot= ruleRoot EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:69:2: iv_ruleRoot= ruleRoot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRootRule()); 
            }
            pushFollow(FOLLOW_ruleRoot_in_entryRuleRoot75);
            iv_ruleRoot=ruleRoot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRoot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoot85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:76:1: ruleRoot returns [EObject current=null] : (this_Body_0= ruleBody | (this_Block_1= ruleBlock this_TERMINATOR_2= RULE_TERMINATOR ) )? ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token this_TERMINATOR_2=null;
        EObject this_Body_0 = null;

        EObject this_Block_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:79:28: ( (this_Body_0= ruleBody | (this_Block_1= ruleBlock this_TERMINATOR_2= RULE_TERMINATOR ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:80:1: (this_Body_0= ruleBody | (this_Block_1= ruleBlock this_TERMINATOR_2= RULE_TERMINATOR ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:80:1: (this_Body_0= ruleBody | (this_Block_1= ruleBlock this_TERMINATOR_2= RULE_TERMINATOR ) )?
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STATEMENT && LA1_0<=RULE_HERECOMMENT)||LA1_0==RULE_STRING||LA1_0==RULE_RETURN||(LA1_0>=RULE_THROW && LA1_0<=RULE_CLASS)||(LA1_0>=RULE_FOR && LA1_0<=RULE_WHILE)||LA1_0==RULE_UNTIL||LA1_0==RULE_LBRACKET||(LA1_0>=RULE_PLUS && LA1_0<=RULE_MINUS)||(LA1_0>=RULE_UNARY && LA1_0<=RULE_MINUS_MINUS)||LA1_0==RULE_SUPER||LA1_0==RULE_AT_SIGIL||(LA1_0>=RULE_THIS && LA1_0<=RULE_TRY)||LA1_0==RULE_SWITCH||(LA1_0>=RULE_IF && LA1_0<=RULE_LCURLY)||LA1_0==RULE_PARAM_START||(LA1_0>=RULE_FUNC_ARROW && LA1_0<=RULE_LPAREN)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_INDENT) ) {
                alt1=2;
            }
            switch (alt1) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:81:5: this_Body_0= ruleBody
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRootAccess().getBodyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBody_in_ruleRoot132);
                    this_Body_0=ruleBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Body_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:90:6: (this_Block_1= ruleBlock this_TERMINATOR_2= RULE_TERMINATOR )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:90:6: (this_Block_1= ruleBlock this_TERMINATOR_2= RULE_TERMINATOR )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:91:5: this_Block_1= ruleBlock this_TERMINATOR_2= RULE_TERMINATOR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRootAccess().getBlockParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleRoot160);
                    this_Block_1=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Block_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_TERMINATOR_2=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleRoot170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TERMINATOR_2, grammarAccess.getRootAccess().getTERMINATORTerminalRuleCall_1_1()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleBody"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:111:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:112:2: (iv_ruleBody= ruleBody EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:113:2: iv_ruleBody= ruleBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody207);
            iv_ruleBody=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody217); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:120:1: ruleBody returns [EObject current=null] : ( ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )* ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token this_TERMINATOR_1=null;
        EObject lv_lines_0_0 = null;

        EObject lv_lines_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:123:28: ( ( ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:124:1: ( ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:124:1: ( ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:124:2: ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )*
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:124:2: ( (lv_lines_0_0= ruleLine ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:125:1: (lv_lines_0_0= ruleLine )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:125:1: (lv_lines_0_0= ruleLine )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:126:3: lv_lines_0_0= ruleLine
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBodyAccess().getLinesLineParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLine_in_ruleBody263);
            lv_lines_0_0=ruleLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBodyRule());
              	        }
                     		add(
                     			current, 
                     			"lines",
                      		lv_lines_0_0, 
                      		"Line");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:142:2: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_TERMINATOR) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:142:3: this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )?
            	    {
            	    this_TERMINATOR_1=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleBody275); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TERMINATOR_1, grammarAccess.getBodyAccess().getTERMINATORTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:146:1: ( (lv_lines_2_0= ruleLine ) )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( ((LA2_0>=RULE_STATEMENT && LA2_0<=RULE_HERECOMMENT)||LA2_0==RULE_STRING||LA2_0==RULE_RETURN||(LA2_0>=RULE_THROW && LA2_0<=RULE_CLASS)||(LA2_0>=RULE_FOR && LA2_0<=RULE_WHILE)||LA2_0==RULE_UNTIL||LA2_0==RULE_LBRACKET||(LA2_0>=RULE_PLUS && LA2_0<=RULE_MINUS)||(LA2_0>=RULE_UNARY && LA2_0<=RULE_MINUS_MINUS)||LA2_0==RULE_SUPER||LA2_0==RULE_AT_SIGIL||(LA2_0>=RULE_THIS && LA2_0<=RULE_TRY)||LA2_0==RULE_SWITCH||(LA2_0>=RULE_IF && LA2_0<=RULE_LCURLY)||LA2_0==RULE_PARAM_START||(LA2_0>=RULE_FUNC_ARROW && LA2_0<=RULE_LPAREN)) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:147:1: (lv_lines_2_0= ruleLine )
            	            {
            	            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:147:1: (lv_lines_2_0= ruleLine )
            	            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:148:3: lv_lines_2_0= ruleLine
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getBodyAccess().getLinesLineParserRuleCall_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLine_in_ruleBody295);
            	            lv_lines_2_0=ruleLine();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getBodyRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"lines",
            	                      		lv_lines_2_0, 
            	                      		"Line");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleLine"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:172:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:173:2: (iv_ruleLine= ruleLine EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:174:2: iv_ruleLine= ruleLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLineRule()); 
            }
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine334);
            iv_ruleLine=ruleLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine344); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:181:1: ruleLine returns [EObject current=null] : (this_Stmt_0= ruleStmt | this_Expression_1= ruleExpression ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject this_Stmt_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:184:28: ( (this_Stmt_0= ruleStmt | this_Expression_1= ruleExpression ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:185:1: (this_Stmt_0= ruleStmt | this_Expression_1= ruleExpression )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:185:1: (this_Stmt_0= ruleStmt | this_Expression_1= ruleExpression )
            int alt4=2;
            switch ( input.LA(1) ) {
            case RULE_STATEMENT:
            case RULE_HERECOMMENT:
            case RULE_RETURN:
            case RULE_THROW:
            case RULE_CLASS:
                {
                alt4=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==EOF||LA4_2==RULE_TERMINATOR||LA4_2==RULE_CALL_START||LA4_2==RULE_POST_IF||(LA4_2>=RULE_FOR && LA4_2<=RULE_WHILE)||LA4_2==RULE_UNTIL||LA4_2==RULE_COMPOUND_ASSIGN||(LA4_2>=RULE_OUTDENT && LA4_2<=RULE_MATH)||LA4_2==RULE_QUESTION||LA4_2==RULE_FUNC_EXIST||(LA4_2>=RULE_DOT && LA4_2<=RULE_INDEX_START)||LA4_2==RULE_RPAREN) ) {
                    alt4=2;
                }
                else if ( (LA4_2==RULE_EQUAL) ) {
                    int LA4_4 = input.LA(3);

                    if ( (LA4_4==RULE_STRING||LA4_4==RULE_CLASS||(LA4_4>=RULE_FOR && LA4_4<=RULE_WHILE)||LA4_4==RULE_UNTIL||LA4_4==RULE_LBRACKET||LA4_4==RULE_INDENT||(LA4_4>=RULE_PLUS && LA4_4<=RULE_MINUS)||(LA4_4>=RULE_UNARY && LA4_4<=RULE_MINUS_MINUS)||LA4_4==RULE_SUPER||LA4_4==RULE_AT_SIGIL||(LA4_4>=RULE_THIS && LA4_4<=RULE_TRY)||LA4_4==RULE_SWITCH||(LA4_4>=RULE_IF && LA4_4<=RULE_LCURLY)||LA4_4==RULE_PARAM_START||(LA4_4>=RULE_FUNC_ARROW && LA4_4<=RULE_LPAREN)) ) {
                        alt4=2;
                    }
                    else if ( (LA4_4==85) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_FOR:
            case RULE_WHILE:
            case RULE_UNTIL:
            case RULE_LBRACKET:
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_UNARY:
            case RULE_PLUS_PLUS:
            case RULE_MINUS_MINUS:
            case RULE_SUPER:
            case RULE_AT_SIGIL:
            case RULE_THIS:
            case RULE_LOOP:
            case RULE_TRY:
            case RULE_SWITCH:
            case RULE_IF:
            case RULE_LCURLY:
            case RULE_PARAM_START:
            case RULE_FUNC_ARROW:
            case RULE_BOUND_FUNC_ARROW:
            case RULE_NUMBER:
            case RULE_BOOL:
            case RULE_JS:
            case RULE_REGEX:
            case RULE_LPAREN:
                {
                alt4=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:186:5: this_Stmt_0= ruleStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLineAccess().getStmtParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStmt_in_ruleLine391);
                    this_Stmt_0=ruleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Stmt_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:196:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLineAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLine418);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleStmt"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:212:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:213:2: (iv_ruleStmt= ruleStmt EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:214:2: iv_ruleStmt= ruleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_ruleStmt_in_entryRuleStmt453);
            iv_ruleStmt=ruleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmt463); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:221:1: ruleStmt returns [EObject current=null] : (this_ReturnStmt_0= ruleReturnStmt | this_ThrowStmt_1= ruleThrowStmt | ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt ) | this_Comment_3= ruleComment | this_ClassDeclaration_4= ruleClassDeclaration | ( (lv_statement_5_0= RULE_STATEMENT ) ) ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        Token lv_statement_5_0=null;
        EObject this_ReturnStmt_0 = null;

        EObject this_ThrowStmt_1 = null;

        EObject this_RequireStmt_2 = null;

        EObject this_Comment_3 = null;

        EObject this_ClassDeclaration_4 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:224:28: ( (this_ReturnStmt_0= ruleReturnStmt | this_ThrowStmt_1= ruleThrowStmt | ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt ) | this_Comment_3= ruleComment | this_ClassDeclaration_4= ruleClassDeclaration | ( (lv_statement_5_0= RULE_STATEMENT ) ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:225:1: (this_ReturnStmt_0= ruleReturnStmt | this_ThrowStmt_1= ruleThrowStmt | ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt ) | this_Comment_3= ruleComment | this_ClassDeclaration_4= ruleClassDeclaration | ( (lv_statement_5_0= RULE_STATEMENT ) ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:225:1: (this_ReturnStmt_0= ruleReturnStmt | this_ThrowStmt_1= ruleThrowStmt | ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt ) | this_Comment_3= ruleComment | this_ClassDeclaration_4= ruleClassDeclaration | ( (lv_statement_5_0= RULE_STATEMENT ) ) )
            int alt5=6;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_RETURN) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_THROW) ) {
                alt5=2;
            }
            else if ( (LA5_0==RULE_IDENTIFIER) && (synpred1_InternalCoffeeScript())) {
                alt5=3;
            }
            else if ( (LA5_0==RULE_HERECOMMENT) ) {
                alt5=4;
            }
            else if ( (LA5_0==RULE_CLASS) ) {
                alt5=5;
            }
            else if ( (LA5_0==RULE_STATEMENT) ) {
                alt5=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:226:5: this_ReturnStmt_0= ruleReturnStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getReturnStmtParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnStmt_in_ruleStmt510);
                    this_ReturnStmt_0=ruleReturnStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReturnStmt_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:236:5: this_ThrowStmt_1= ruleThrowStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getThrowStmtParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleThrowStmt_in_ruleStmt537);
                    this_ThrowStmt_1=ruleThrowStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ThrowStmt_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:245:6: ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:245:6: ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:245:7: ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getRequireStmtParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequireStmt_in_ruleStmt585);
                    this_RequireStmt_2=ruleRequireStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RequireStmt_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:261:5: this_Comment_3= ruleComment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getCommentParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComment_in_ruleStmt613);
                    this_Comment_3=ruleComment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Comment_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:271:5: this_ClassDeclaration_4= ruleClassDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getClassDeclarationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassDeclaration_in_ruleStmt640);
                    this_ClassDeclaration_4=ruleClassDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClassDeclaration_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:280:6: ( (lv_statement_5_0= RULE_STATEMENT ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:280:6: ( (lv_statement_5_0= RULE_STATEMENT ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:281:1: (lv_statement_5_0= RULE_STATEMENT )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:281:1: (lv_statement_5_0= RULE_STATEMENT )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:282:3: lv_statement_5_0= RULE_STATEMENT
                    {
                    lv_statement_5_0=(Token)match(input,RULE_STATEMENT,FOLLOW_RULE_STATEMENT_in_ruleStmt662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_statement_5_0, grammarAccess.getStmtAccess().getStatementSTATEMENTTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStmtRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"statement",
                              		lv_statement_5_0, 
                              		"STATEMENT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleComment"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:306:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:307:2: (iv_ruleComment= ruleComment EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:308:2: iv_ruleComment= ruleComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentRule()); 
            }
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment703);
            iv_ruleComment=ruleComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment713); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:315:1: ruleComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_HERECOMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;

         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:318:28: ( ( (lv_comment_0_0= RULE_HERECOMMENT ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:319:1: ( (lv_comment_0_0= RULE_HERECOMMENT ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:319:1: ( (lv_comment_0_0= RULE_HERECOMMENT ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:320:1: (lv_comment_0_0= RULE_HERECOMMENT )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:320:1: (lv_comment_0_0= RULE_HERECOMMENT )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:321:3: lv_comment_0_0= RULE_HERECOMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_HERECOMMENT,FOLLOW_RULE_HERECOMMENT_in_ruleComment754); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_comment_0_0, grammarAccess.getCommentAccess().getCommentHERECOMMENTTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCommentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"comment",
                      		lv_comment_0_0, 
                      		"HERECOMMENT");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleRequireStmt"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:345:1: entryRuleRequireStmt returns [EObject current=null] : iv_ruleRequireStmt= ruleRequireStmt EOF ;
    public final EObject entryRuleRequireStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireStmt = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:346:2: (iv_ruleRequireStmt= ruleRequireStmt EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:347:2: iv_ruleRequireStmt= ruleRequireStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequireStmtRule()); 
            }
            pushFollow(FOLLOW_ruleRequireStmt_in_entryRuleRequireStmt794);
            iv_ruleRequireStmt=ruleRequireStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequireStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequireStmt804); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequireStmt"


    // $ANTLR start "ruleRequireStmt"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:354:1: ruleRequireStmt returns [EObject current=null] : ( ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END ) ;
    public final EObject ruleRequireStmt() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        Token otherlv_2=null;
        Token this_CALL_START_3=null;
        Token lv_uri_4_0=null;
        Token this_CALL_END_5=null;
        EObject lv_importedNamespace_0_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:357:28: ( ( ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:358:1: ( ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:358:1: ( ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:358:2: ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:358:2: ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:358:3: ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:363:5: ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:363:6: ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require'
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:363:6: ( (lv_importedNamespace_0_0= ruleId ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:364:1: (lv_importedNamespace_0_0= ruleId )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:364:1: (lv_importedNamespace_0_0= ruleId )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:365:3: lv_importedNamespace_0_0= ruleId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequireStmtAccess().getImportedNamespaceIdParserRuleCall_0_0_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleId_in_ruleRequireStmt872);
            lv_importedNamespace_0_0=ruleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRequireStmtRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_0_0, 
                      		"Id");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleRequireStmt883); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUAL_1, grammarAccess.getRequireStmtAccess().getEQUALTerminalRuleCall_0_0_1()); 
                  
            }
            otherlv_2=(Token)match(input,85,FOLLOW_85_in_ruleRequireStmt894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRequireStmtAccess().getRequireKeyword_0_0_2());
                  
            }

            }


            }

            this_CALL_START_3=(Token)match(input,RULE_CALL_START,FOLLOW_RULE_CALL_START_in_ruleRequireStmt907); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CALL_START_3, grammarAccess.getRequireStmtAccess().getCALL_STARTTerminalRuleCall_1()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:393:1: ( (lv_uri_4_0= RULE_STRING ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:394:1: (lv_uri_4_0= RULE_STRING )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:394:1: (lv_uri_4_0= RULE_STRING )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:395:3: lv_uri_4_0= RULE_STRING
            {
            lv_uri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequireStmt923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_uri_4_0, grammarAccess.getRequireStmtAccess().getUriSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequireStmtRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"uri",
                      		lv_uri_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            this_CALL_END_5=(Token)match(input,RULE_CALL_END,FOLLOW_RULE_CALL_END_in_ruleRequireStmt939); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CALL_END_5, grammarAccess.getRequireStmtAccess().getCALL_ENDTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequireStmt"


    // $ANTLR start "entryRuleReturnStmt"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:423:1: entryRuleReturnStmt returns [EObject current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final EObject entryRuleReturnStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStmt = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:424:2: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:425:2: iv_ruleReturnStmt= ruleReturnStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStmtRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStmt_in_entryRuleReturnStmt974);
            iv_ruleReturnStmt=ruleReturnStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStmt984); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturnStmt"


    // $ANTLR start "ruleReturnStmt"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:432:1: ruleReturnStmt returns [EObject current=null] : ( () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleReturnStmt() throws RecognitionException {
        EObject current = null;

        Token this_RETURN_1=null;
        Token this_POST_IF_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_condition_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:435:28: ( ( () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:436:1: ( () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:436:1: ( () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:436:2: () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:436:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:437:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnStmtAccess().getReturnStmtAction_0(),
                          current);
                  
            }

            }

            this_RETURN_1=(Token)match(input,RULE_RETURN,FOLLOW_RULE_RETURN_in_ruleReturnStmt1029); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RETURN_1, grammarAccess.getReturnStmtAccess().getRETURNTerminalRuleCall_1()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:446:1: ( (lv_expression_2_0= ruleExpression ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING||(LA6_0>=RULE_FOR && LA6_0<=RULE_WHILE)||LA6_0==RULE_UNTIL||LA6_0==RULE_LBRACKET||(LA6_0>=RULE_PLUS && LA6_0<=RULE_MINUS)||(LA6_0>=RULE_UNARY && LA6_0<=RULE_MINUS_MINUS)||LA6_0==RULE_SUPER||LA6_0==RULE_AT_SIGIL||(LA6_0>=RULE_THIS && LA6_0<=RULE_TRY)||LA6_0==RULE_SWITCH||(LA6_0>=RULE_IF && LA6_0<=RULE_LCURLY)||LA6_0==RULE_PARAM_START||(LA6_0>=RULE_FUNC_ARROW && LA6_0<=RULE_LPAREN)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:447:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:447:1: (lv_expression_2_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:448:3: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStmtAccess().getExpressionExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnStmt1049);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReturnStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:464:3: (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_POST_IF) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:464:4: this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) )
                    {
                    this_POST_IF_3=(Token)match(input,RULE_POST_IF,FOLLOW_RULE_POST_IF_in_ruleReturnStmt1062); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POST_IF_3, grammarAccess.getReturnStmtAccess().getPOST_IFTerminalRuleCall_3_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:468:1: ( (lv_condition_4_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:469:1: (lv_condition_4_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:469:1: (lv_condition_4_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:470:3: lv_condition_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStmtAccess().getConditionExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnStmt1082);
                    lv_condition_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getReturnStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturnStmt"


    // $ANTLR start "entryRuleThrowStmt"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:494:1: entryRuleThrowStmt returns [EObject current=null] : iv_ruleThrowStmt= ruleThrowStmt EOF ;
    public final EObject entryRuleThrowStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStmt = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:495:2: (iv_ruleThrowStmt= ruleThrowStmt EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:496:2: iv_ruleThrowStmt= ruleThrowStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThrowStmtRule()); 
            }
            pushFollow(FOLLOW_ruleThrowStmt_in_entryRuleThrowStmt1120);
            iv_ruleThrowStmt=ruleThrowStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThrowStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrowStmt1130); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThrowStmt"


    // $ANTLR start "ruleThrowStmt"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:503:1: ruleThrowStmt returns [EObject current=null] : (this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) ) ) ;
    public final EObject ruleThrowStmt() throws RecognitionException {
        EObject current = null;

        Token this_THROW_0=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:506:28: ( (this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:507:1: (this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:507:1: (this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:507:2: this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) )
            {
            this_THROW_0=(Token)match(input,RULE_THROW,FOLLOW_RULE_THROW_in_ruleThrowStmt1166); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_THROW_0, grammarAccess.getThrowStmtAccess().getTHROWTerminalRuleCall_0()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:511:1: ( (lv_exp_1_0= ruleExpression ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:512:1: (lv_exp_1_0= ruleExpression )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:512:1: (lv_exp_1_0= ruleExpression )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:513:3: lv_exp_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getThrowStmtAccess().getExpExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleThrowStmt1186);
            lv_exp_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getThrowStmtRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThrowStmt"


    // $ANTLR start "entryRuleSuperClass"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:537:1: entryRuleSuperClass returns [EObject current=null] : iv_ruleSuperClass= ruleSuperClass EOF ;
    public final EObject entryRuleSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperClass = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:538:2: (iv_ruleSuperClass= ruleSuperClass EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:539:2: iv_ruleSuperClass= ruleSuperClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuperClassRule()); 
            }
            pushFollow(FOLLOW_ruleSuperClass_in_entryRuleSuperClass1222);
            iv_ruleSuperClass=ruleSuperClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuperClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperClass1232); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperClass"


    // $ANTLR start "ruleSuperClass"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:546:1: ruleSuperClass returns [EObject current=null] : (this_IdRef_0= ruleIdRef | this_Property_1= ruleProperty ) ;
    public final EObject ruleSuperClass() throws RecognitionException {
        EObject current = null;

        EObject this_IdRef_0 = null;

        EObject this_Property_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:549:28: ( (this_IdRef_0= ruleIdRef | this_Property_1= ruleProperty ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:550:1: (this_IdRef_0= ruleIdRef | this_Property_1= ruleProperty )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:550:1: (this_IdRef_0= ruleIdRef | this_Property_1= ruleProperty )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_IDENTIFIER) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=RULE_DOT && LA8_1<=RULE_INDEX_START)) ) {
                    alt8=2;
                }
                else if ( (LA8_1==EOF||LA8_1==RULE_TERMINATOR||(LA8_1>=RULE_INDENT && LA8_1<=RULE_OUTDENT)||LA8_1==RULE_RPAREN) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:551:5: this_IdRef_0= ruleIdRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSuperClassAccess().getIdRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdRef_in_ruleSuperClass1279);
                    this_IdRef_0=ruleIdRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:561:5: this_Property_1= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSuperClassAccess().getPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleSuperClass1306);
                    this_Property_1=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Property_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperClass"


    // $ANTLR start "entryRuleClassDeclaration"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:577:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:578:2: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:579:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleClassDeclaration_in_entryRuleClassDeclaration1341);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDeclaration1351); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDeclaration"


    // $ANTLR start "ruleClassDeclaration"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:586:1: ruleClassDeclaration returns [EObject current=null] : ( () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )? ) ;
    public final EObject ruleClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token this_CLASS_1=null;
        Token this_EXTENDS_3=null;
        Token this_EXTENDS_7=null;
        EObject lv_body_2_0 = null;

        EObject lv_extend_4_0 = null;

        EObject lv_body_5_0 = null;

        EObject lv_name_6_1 = null;

        EObject lv_name_6_2 = null;

        EObject lv_extend_8_0 = null;

        EObject lv_body_9_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:589:28: ( ( () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:590:1: ( () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:590:1: ( () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:590:2: () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:590:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:591:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassDeclarationAccess().getClassDeclarationAction_0(),
                          current);
                  
            }

            }

            this_CLASS_1=(Token)match(input,RULE_CLASS,FOLLOW_RULE_CLASS_in_ruleClassDeclaration1396); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CLASS_1, grammarAccess.getClassDeclarationAccess().getCLASSTerminalRuleCall_1()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:600:1: ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )?
            int alt12=4;
            switch ( input.LA(1) ) {
                case RULE_INDENT:
                    {
                    alt12=1;
                    }
                    break;
                case RULE_EXTENDS:
                    {
                    alt12=2;
                    }
                    break;
                case RULE_IDENTIFIER:
                    {
                    alt12=3;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:600:2: ( (lv_body_2_0= ruleBlock ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:600:2: ( (lv_body_2_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:601:1: (lv_body_2_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:601:1: (lv_body_2_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:602:3: lv_body_2_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getBodyBlockParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleClassDeclaration1417);
                    lv_body_2_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_2_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:619:6: (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:619:6: (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:619:7: this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )?
                    {
                    this_EXTENDS_3=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleClassDeclaration1435); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_3, grammarAccess.getClassDeclarationAccess().getEXTENDSTerminalRuleCall_2_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:623:1: ( (lv_extend_4_0= ruleSuperClass ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:624:1: (lv_extend_4_0= ruleSuperClass )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:624:1: (lv_extend_4_0= ruleSuperClass )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:625:3: lv_extend_4_0= ruleSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getExtendSuperClassParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuperClass_in_ruleClassDeclaration1455);
                    lv_extend_4_0=ruleSuperClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"extend",
                              		lv_extend_4_0, 
                              		"SuperClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:641:2: ( (lv_body_5_0= ruleBlock ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_INDENT) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:642:1: (lv_body_5_0= ruleBlock )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:642:1: (lv_body_5_0= ruleBlock )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:643:3: lv_body_5_0= ruleBlock
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getBodyBlockParserRuleCall_2_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlock_in_ruleClassDeclaration1476);
                            lv_body_5_0=ruleBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"body",
                                      		lv_body_5_0, 
                                      		"Block");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:660:6: ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:660:6: ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:660:7: ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:660:7: ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:661:1: ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:661:1: ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:662:1: (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:662:1: (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_IDENTIFIER) ) {
                        int LA10_1 = input.LA(2);

                        if ( ((LA10_1>=RULE_DOT && LA10_1<=RULE_INDEX_START)) ) {
                            alt10=2;
                        }
                        else if ( (LA10_1==RULE_EXTENDS||LA10_1==RULE_INDENT) ) {
                            alt10=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:663:3: lv_name_6_1= ruleId
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameIdParserRuleCall_2_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleId_in_ruleClassDeclaration1508);
                            lv_name_6_1=ruleId();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_6_1, 
                                      		"Id");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:678:8: lv_name_6_2= ruleProperty
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getNamePropertyParserRuleCall_2_2_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleProperty_in_ruleClassDeclaration1527);
                            lv_name_6_2=ruleProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_6_2, 
                                      		"Property");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:696:2: (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_EXTENDS) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:696:3: this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) )
                            {
                            this_EXTENDS_7=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleClassDeclaration1542); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_EXTENDS_7, grammarAccess.getClassDeclarationAccess().getEXTENDSTerminalRuleCall_2_2_1_0()); 
                                  
                            }
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:700:1: ( (lv_extend_8_0= ruleSuperClass ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:701:1: (lv_extend_8_0= ruleSuperClass )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:701:1: (lv_extend_8_0= ruleSuperClass )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:702:3: lv_extend_8_0= ruleSuperClass
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getExtendSuperClassParserRuleCall_2_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSuperClass_in_ruleClassDeclaration1562);
                            lv_extend_8_0=ruleSuperClass();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"extend",
                                      		lv_extend_8_0, 
                                      		"SuperClass");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:718:4: ( (lv_body_9_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:719:1: (lv_body_9_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:719:1: (lv_body_9_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:720:3: lv_body_9_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getBodyBlockParserRuleCall_2_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleClassDeclaration1585);
                    lv_body_9_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getClassDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_9_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDeclaration"


    // $ANTLR start "entryRuleAssignedClassDeclaration"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:744:1: entryRuleAssignedClassDeclaration returns [EObject current=null] : iv_ruleAssignedClassDeclaration= ruleAssignedClassDeclaration EOF ;
    public final EObject entryRuleAssignedClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignedClassDeclaration = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:745:2: (iv_ruleAssignedClassDeclaration= ruleAssignedClassDeclaration EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:746:2: iv_ruleAssignedClassDeclaration= ruleAssignedClassDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignedClassDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleAssignedClassDeclaration_in_entryRuleAssignedClassDeclaration1624);
            iv_ruleAssignedClassDeclaration=ruleAssignedClassDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignedClassDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignedClassDeclaration1634); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignedClassDeclaration"


    // $ANTLR start "ruleAssignedClassDeclaration"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:753:1: ruleAssignedClassDeclaration returns [EObject current=null] : ( () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )? ) ;
    public final EObject ruleAssignedClassDeclaration() throws RecognitionException {
        EObject current = null;

        Token this_CLASS_1=null;
        Token this_EXTENDS_2=null;
        Token this_EXTENDS_6=null;
        EObject lv_extend_3_0 = null;

        EObject lv_body_4_0 = null;

        EObject lv_name_5_1 = null;

        EObject lv_name_5_2 = null;

        EObject lv_extend_7_0 = null;

        EObject lv_body_8_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:756:28: ( ( () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:757:1: ( () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:757:1: ( () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:757:2: () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:757:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:758:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAssignedClassDeclarationAccess().getClassDeclarationAction_0(),
                          current);
                  
            }

            }

            this_CLASS_1=(Token)match(input,RULE_CLASS,FOLLOW_RULE_CLASS_in_ruleAssignedClassDeclaration1679); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CLASS_1, grammarAccess.getAssignedClassDeclarationAccess().getCLASSTerminalRuleCall_1()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:767:1: ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_EXTENDS) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_IDENTIFIER) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:767:2: (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:767:2: (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:767:3: this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) )
                    {
                    this_EXTENDS_2=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleAssignedClassDeclaration1691); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_2, grammarAccess.getAssignedClassDeclarationAccess().getEXTENDSTerminalRuleCall_2_0_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:771:1: ( (lv_extend_3_0= ruleSuperClass ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:772:1: (lv_extend_3_0= ruleSuperClass )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:772:1: (lv_extend_3_0= ruleSuperClass )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:773:3: lv_extend_3_0= ruleSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getExtendSuperClassParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuperClass_in_ruleAssignedClassDeclaration1711);
                    lv_extend_3_0=ruleSuperClass();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignedClassDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"extend",
                              		lv_extend_3_0, 
                              		"SuperClass");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:789:2: ( (lv_body_4_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:790:1: (lv_body_4_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:790:1: (lv_body_4_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:791:3: lv_body_4_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getBodyBlockParserRuleCall_2_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleAssignedClassDeclaration1732);
                    lv_body_4_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignedClassDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_4_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:808:6: ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:808:6: ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:808:7: ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:808:7: ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:809:1: ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:809:1: ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:810:1: (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:810:1: (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_IDENTIFIER) ) {
                        int LA13_1 = input.LA(2);

                        if ( ((LA13_1>=RULE_DOT && LA13_1<=RULE_INDEX_START)) ) {
                            alt13=2;
                        }
                        else if ( (LA13_1==RULE_EXTENDS||LA13_1==RULE_INDENT) ) {
                            alt13=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:811:3: lv_name_5_1= ruleId
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getNameIdParserRuleCall_2_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleId_in_ruleAssignedClassDeclaration1763);
                            lv_name_5_1=ruleId();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAssignedClassDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_5_1, 
                                      		"Id");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:826:8: lv_name_5_2= ruleProperty
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getNamePropertyParserRuleCall_2_1_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleProperty_in_ruleAssignedClassDeclaration1782);
                            lv_name_5_2=ruleProperty();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAssignedClassDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_5_2, 
                                      		"Property");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:844:2: (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_EXTENDS) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:844:3: this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) )
                            {
                            this_EXTENDS_6=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleAssignedClassDeclaration1797); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_EXTENDS_6, grammarAccess.getAssignedClassDeclarationAccess().getEXTENDSTerminalRuleCall_2_1_1_0()); 
                                  
                            }
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:848:1: ( (lv_extend_7_0= ruleSuperClass ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:849:1: (lv_extend_7_0= ruleSuperClass )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:849:1: (lv_extend_7_0= ruleSuperClass )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:850:3: lv_extend_7_0= ruleSuperClass
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getExtendSuperClassParserRuleCall_2_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSuperClass_in_ruleAssignedClassDeclaration1817);
                            lv_extend_7_0=ruleSuperClass();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAssignedClassDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"extend",
                                      		lv_extend_7_0, 
                                      		"SuperClass");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:866:4: ( (lv_body_8_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:867:1: (lv_body_8_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:867:1: (lv_body_8_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:868:3: lv_body_8_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getBodyBlockParserRuleCall_2_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleAssignedClassDeclaration1840);
                    lv_body_8_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignedClassDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_8_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignedClassDeclaration"


    // $ANTLR start "entryRuleExpression"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:892:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:893:2: (iv_ruleExpression= ruleExpression EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:894:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1879);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1889); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:901:1: ruleExpression returns [EObject current=null] : this_Postfix_0= rulePostfix ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Postfix_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:904:28: (this_Postfix_0= rulePostfix )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:906:5: this_Postfix_0= rulePostfix
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getPostfixParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePostfix_in_ruleExpression1935);
            this_Postfix_0=rulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Postfix_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePostfix"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:922:1: entryRulePostfix returns [EObject current=null] : iv_rulePostfix= rulePostfix EOF ;
    public final EObject entryRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfix = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:923:2: (iv_rulePostfix= rulePostfix EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:924:2: iv_rulePostfix= rulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixRule()); 
            }
            pushFollow(FOLLOW_rulePostfix_in_entryRulePostfix1969);
            iv_rulePostfix=rulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfix1979); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfix"


    // $ANTLR start "rulePostfix"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:931:1: rulePostfix returns [EObject current=null] : (this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )? ) ;
    public final EObject rulePostfix() throws RecognitionException {
        EObject current = null;

        Token this_POST_IF_1=null;
        Token this_FOR_4=null;
        Token this_WHILE_7=null;
        Token this_WHEN_10=null;
        Token this_UNTIL_12=null;
        Token this_WHEN_15=null;
        EObject this_Assignment_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_body_6_0 = null;

        EObject lv_body_9_0 = null;

        EObject lv_when_11_0 = null;

        EObject lv_body_14_0 = null;

        EObject lv_when_16_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:934:28: ( (this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:935:1: (this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:935:1: (this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:936:5: this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixAccess().getAssignmentParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignment_in_rulePostfix2026);
            this_Assignment_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Assignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:944:1: ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )?
            int alt18=5;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:944:2: ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:944:2: ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:944:3: ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:944:3: ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:944:4: ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF
                    {
                    this_POST_IF_1=(Token)match(input,RULE_POST_IF,FOLLOW_RULE_POST_IF_in_rulePostfix2044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POST_IF_1, grammarAccess.getPostfixAccess().getPOST_IFTerminalRuleCall_1_0_0()); 
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:948:2: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:949:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getIfDummyAction_1_0_1(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:954:2: ( (lv_condition_3_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:955:1: (lv_condition_3_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:955:1: (lv_condition_3_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:956:3: lv_condition_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAccess().getConditionExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePostfix2074);
                    lv_condition_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_3_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:973:6: ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:973:6: ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:973:7: ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:973:7: ( ( RULE_FOR )=>this_FOR_4= RULE_FOR )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:973:8: ( RULE_FOR )=>this_FOR_4= RULE_FOR
                    {
                    this_FOR_4=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_rulePostfix2099); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOR_4, grammarAccess.getPostfixAccess().getFORTerminalRuleCall_1_1_0()); 
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:977:2: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:978:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getForDummyAction_1_1_1(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:983:2: ( (lv_body_6_0= ruleForBody ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:984:1: (lv_body_6_0= ruleForBody )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:984:1: (lv_body_6_0= ruleForBody )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:985:3: lv_body_6_0= ruleForBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAccess().getBodyForBodyParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForBody_in_rulePostfix2129);
                    lv_body_6_0=ruleForBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_6_0, 
                              		"ForBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1002:6: ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1002:6: ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1002:7: ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )?
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1002:7: ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1002:8: ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE
                    {
                    this_WHILE_7=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_rulePostfix2154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_7, grammarAccess.getPostfixAccess().getWHILETerminalRuleCall_1_2_0()); 
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1006:2: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1007:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getWhileDummyAction_1_2_1(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1012:2: ( (lv_body_9_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1013:1: (lv_body_9_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1013:1: (lv_body_9_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1014:3: lv_body_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAccess().getBodyExpressionParserRuleCall_1_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePostfix2184);
                    lv_body_9_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_9_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1030:2: ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==RULE_WHEN) ) {
                        int LA16_1 = input.LA(2);

                        if ( (synpred6_InternalCoffeeScript()) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1030:3: ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1030:3: ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1030:4: ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN
                            {
                            this_WHEN_10=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_rulePostfix2202); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_10, grammarAccess.getPostfixAccess().getWHENTerminalRuleCall_1_2_3_0()); 
                                  
                            }

                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1034:2: ( (lv_when_11_0= ruleExpression ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1035:1: (lv_when_11_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1035:1: (lv_when_11_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1036:3: lv_when_11_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPostfixAccess().getWhenExpressionParserRuleCall_1_2_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePostfix2223);
                            lv_when_11_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPostfixRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"when",
                                      		lv_when_11_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1053:6: ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1053:6: ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1053:7: ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )?
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1053:7: ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1053:8: ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL
                    {
                    this_UNTIL_12=(Token)match(input,RULE_UNTIL,FOLLOW_RULE_UNTIL_in_rulePostfix2250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNTIL_12, grammarAccess.getPostfixAccess().getUNTILTerminalRuleCall_1_3_0()); 
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1057:2: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1058:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getUntilDummyAction_1_3_1(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1063:2: ( (lv_body_14_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1064:1: (lv_body_14_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1064:1: (lv_body_14_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1065:3: lv_body_14_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAccess().getBodyExpressionParserRuleCall_1_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePostfix2280);
                    lv_body_14_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPostfixRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_14_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1081:2: ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_WHEN) ) {
                        int LA17_1 = input.LA(2);

                        if ( (synpred8_InternalCoffeeScript()) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1081:3: ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1081:3: ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1081:4: ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN
                            {
                            this_WHEN_15=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_rulePostfix2298); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_15, grammarAccess.getPostfixAccess().getWHENTerminalRuleCall_1_3_3_0()); 
                                  
                            }

                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1085:2: ( (lv_when_16_0= ruleExpression ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1086:1: (lv_when_16_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1086:1: (lv_when_16_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1087:3: lv_when_16_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPostfixAccess().getWhenExpressionParserRuleCall_1_3_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePostfix2319);
                            lv_when_16_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPostfixRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"when",
                                      		lv_when_16_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostfix"


    // $ANTLR start "entryRuleForBody"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1111:1: entryRuleForBody returns [EObject current=null] : iv_ruleForBody= ruleForBody EOF ;
    public final EObject entryRuleForBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForBody = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1112:2: (iv_ruleForBody= ruleForBody EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1113:2: iv_ruleForBody= ruleForBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForBodyRule()); 
            }
            pushFollow(FOLLOW_ruleForBody_in_entryRuleForBody2360);
            iv_ruleForBody=ruleForBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForBody2370); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForBody"


    // $ANTLR start "ruleForBody"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1120:1: ruleForBody returns [EObject current=null] : ( (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) ) ) ;
    public final EObject ruleForBody() throws RecognitionException {
        EObject current = null;

        Token this_OWN_0=null;
        Token this_COMMA_2=null;
        EObject lv_indexes_1_0 = null;

        EObject lv_indexes_3_0 = null;

        EObject lv_source_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1123:28: ( ( (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1124:1: ( (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1124:1: ( (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1124:2: (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1124:2: (this_OWN_0= RULE_OWN )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_OWN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1124:3: this_OWN_0= RULE_OWN
                    {
                    this_OWN_0=(Token)match(input,RULE_OWN,FOLLOW_RULE_OWN_in_ruleForBody2407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OWN_0, grammarAccess.getForBodyAccess().getOWNTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1128:3: ( (lv_indexes_1_0= ruleForValue ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1129:1: (lv_indexes_1_0= ruleForValue )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1129:1: (lv_indexes_1_0= ruleForValue )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1130:3: lv_indexes_1_0= ruleForValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForBodyAccess().getIndexesForValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForValue_in_ruleForBody2429);
            lv_indexes_1_0=ruleForValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForBodyRule());
              	        }
                     		add(
                     			current, 
                     			"indexes",
                      		lv_indexes_1_0, 
                      		"ForValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1146:2: (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1146:3: this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleForBody2441); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getForBodyAccess().getCOMMATerminalRuleCall_2_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1150:1: ( (lv_indexes_3_0= ruleForValue ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1151:1: (lv_indexes_3_0= ruleForValue )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1151:1: (lv_indexes_3_0= ruleForValue )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1152:3: lv_indexes_3_0= ruleForValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForBodyAccess().getIndexesForValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleForValue_in_ruleForBody2461);
            	    lv_indexes_3_0=ruleForValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getForBodyRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indexes",
            	              		lv_indexes_3_0, 
            	              		"ForValue");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1168:4: ( (lv_source_4_0= ruleForSource ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1169:1: (lv_source_4_0= ruleForSource )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1169:1: (lv_source_4_0= ruleForSource )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1170:3: lv_source_4_0= ruleForSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForBodyAccess().getSourceForSourceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForSource_in_ruleForBody2484);
            lv_source_4_0=ruleForSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForBodyRule());
              	        }
                     		set(
                     			current, 
                     			"source",
                      		lv_source_4_0, 
                      		"ForSource");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForBody"


    // $ANTLR start "entryRuleForValue"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1194:1: entryRuleForValue returns [EObject current=null] : iv_ruleForValue= ruleForValue EOF ;
    public final EObject entryRuleForValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForValue = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1195:2: (iv_ruleForValue= ruleForValue EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1196:2: iv_ruleForValue= ruleForValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForValueRule()); 
            }
            pushFollow(FOLLOW_ruleForValue_in_entryRuleForValue2520);
            iv_ruleForValue=ruleForValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForValue2530); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForValue"


    // $ANTLR start "ruleForValue"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1203:1: ruleForValue returns [EObject current=null] : this_Id_0= ruleId ;
    public final EObject ruleForValue() throws RecognitionException {
        EObject current = null;

        EObject this_Id_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1206:28: (this_Id_0= ruleId )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1208:5: this_Id_0= ruleId
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForValueAccess().getIdParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleId_in_ruleForValue2576);
            this_Id_0=ruleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Id_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForValue"


    // $ANTLR start "entryRuleForSource"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1224:1: entryRuleForSource returns [EObject current=null] : iv_ruleForSource= ruleForSource EOF ;
    public final EObject entryRuleForSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForSource = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1225:2: (iv_ruleForSource= ruleForSource EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1226:2: iv_ruleForSource= ruleForSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForSourceRule()); 
            }
            pushFollow(FOLLOW_ruleForSource_in_entryRuleForSource2610);
            iv_ruleForSource=ruleForSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForSource2620); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForSource"


    // $ANTLR start "ruleForSource"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1233:1: ruleForSource returns [EObject current=null] : ( () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) ) ) ;
    public final EObject ruleForSource() throws RecognitionException {
        EObject current = null;

        Token this_FOROF_1=null;
        Token this_WHEN_3=null;
        Token this_FORIN_5=null;
        Token this_WHEN_7=null;
        Token this_BY_9=null;
        Token this_BY_11=null;
        Token this_WHEN_13=null;
        EObject lv_source_2_0 = null;

        EObject lv_when_4_0 = null;

        EObject lv_source_6_0 = null;

        EObject lv_when_8_0 = null;

        EObject lv_by_10_0 = null;

        EObject lv_by_12_0 = null;

        EObject lv_when_14_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1236:28: ( ( () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1237:1: ( () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1237:1: ( () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1237:2: () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1237:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1238:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForSourceAccess().getForSourceAction_0(),
                          current);
                  
            }

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1243:2: ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_FOROF) && (synpred9_InternalCoffeeScript())) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_FORIN) && (synpred11_InternalCoffeeScript())) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1243:3: ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1243:3: ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1243:4: ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )?
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1243:4: ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1243:5: ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF
                    {
                    this_FOROF_1=(Token)match(input,RULE_FOROF,FOLLOW_RULE_FOROF_in_ruleForSource2673); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOROF_1, grammarAccess.getForSourceAccess().getFOROFTerminalRuleCall_1_0_0()); 
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1247:2: ( (lv_source_2_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1248:1: (lv_source_2_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1248:1: (lv_source_2_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1249:3: lv_source_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForSourceAccess().getSourceExpressionParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForSource2694);
                    lv_source_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForSourceRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1265:2: ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_WHEN) ) {
                        int LA21_1 = input.LA(2);

                        if ( (synpred10_InternalCoffeeScript()) ) {
                            alt21=1;
                        }
                    }
                    switch (alt21) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1265:3: ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1265:3: ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1265:4: ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN
                            {
                            this_WHEN_3=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_ruleForSource2712); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_3, grammarAccess.getForSourceAccess().getWHENTerminalRuleCall_1_0_2_0()); 
                                  
                            }

                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1269:2: ( (lv_when_4_0= ruleExpression ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1270:1: (lv_when_4_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1270:1: (lv_when_4_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1271:3: lv_when_4_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForSourceAccess().getWhenExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleForSource2733);
                            lv_when_4_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForSourceRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"when",
                                      		lv_when_4_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1288:6: ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1288:6: ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1288:7: ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )?
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1288:7: ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1288:8: ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN
                    {
                    this_FORIN_5=(Token)match(input,RULE_FORIN,FOLLOW_RULE_FORIN_in_ruleForSource2760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FORIN_5, grammarAccess.getForSourceAccess().getFORINTerminalRuleCall_1_1_0()); 
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1292:2: ( (lv_source_6_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1293:1: (lv_source_6_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1293:1: (lv_source_6_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1294:3: lv_source_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForSourceAccess().getSourceExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForSource2781);
                    lv_source_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForSourceRule());
                      	        }
                             		set(
                             			current, 
                             			"source",
                              		lv_source_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1310:2: ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )?
                    int alt24=3;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_WHEN) ) {
                        int LA24_1 = input.LA(2);

                        if ( (synpred12_InternalCoffeeScript()) ) {
                            alt24=1;
                        }
                    }
                    else if ( (LA24_0==RULE_BY) ) {
                        int LA24_2 = input.LA(2);

                        if ( (synpred14_InternalCoffeeScript()) ) {
                            alt24=2;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1310:3: ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1310:3: ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1310:4: ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )?
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1310:4: ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1310:5: ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN
                            {
                            this_WHEN_7=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_ruleForSource2800); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_7, grammarAccess.getForSourceAccess().getWHENTerminalRuleCall_1_1_2_0_0()); 
                                  
                            }

                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1314:2: ( (lv_when_8_0= ruleExpression ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1315:1: (lv_when_8_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1315:1: (lv_when_8_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1316:3: lv_when_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForSourceAccess().getWhenExpressionParserRuleCall_1_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleForSource2821);
                            lv_when_8_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForSourceRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"when",
                                      		lv_when_8_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1332:2: ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )?
                            int alt22=2;
                            int LA22_0 = input.LA(1);

                            if ( (LA22_0==RULE_BY) ) {
                                int LA22_1 = input.LA(2);

                                if ( (synpred13_InternalCoffeeScript()) ) {
                                    alt22=1;
                                }
                            }
                            switch (alt22) {
                                case 1 :
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1332:3: ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) )
                                    {
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1332:3: ( ( RULE_BY )=>this_BY_9= RULE_BY )
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1332:4: ( RULE_BY )=>this_BY_9= RULE_BY
                                    {
                                    this_BY_9=(Token)match(input,RULE_BY,FOLLOW_RULE_BY_in_ruleForSource2839); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_BY_9, grammarAccess.getForSourceAccess().getBYTerminalRuleCall_1_1_2_0_2_0()); 
                                          
                                    }

                                    }

                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1336:2: ( (lv_by_10_0= ruleExpression ) )
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1337:1: (lv_by_10_0= ruleExpression )
                                    {
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1337:1: (lv_by_10_0= ruleExpression )
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1338:3: lv_by_10_0= ruleExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getForSourceAccess().getByExpressionParserRuleCall_1_1_2_0_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpression_in_ruleForSource2860);
                                    lv_by_10_0=ruleExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getForSourceRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"by",
                                              		lv_by_10_0, 
                                              		"Expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1355:6: ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1355:6: ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1355:7: ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )?
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1355:7: ( ( RULE_BY )=>this_BY_11= RULE_BY )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1355:8: ( RULE_BY )=>this_BY_11= RULE_BY
                            {
                            this_BY_11=(Token)match(input,RULE_BY,FOLLOW_RULE_BY_in_ruleForSource2887); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_BY_11, grammarAccess.getForSourceAccess().getBYTerminalRuleCall_1_1_2_1_0()); 
                                  
                            }

                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1359:2: ( (lv_by_12_0= ruleExpression ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1360:1: (lv_by_12_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1360:1: (lv_by_12_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1361:3: lv_by_12_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForSourceAccess().getByExpressionParserRuleCall_1_1_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleForSource2908);
                            lv_by_12_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getForSourceRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"by",
                                      		lv_by_12_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1377:2: ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==RULE_WHEN) ) {
                                int LA23_1 = input.LA(2);

                                if ( (synpred15_InternalCoffeeScript()) ) {
                                    alt23=1;
                                }
                            }
                            switch (alt23) {
                                case 1 :
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1377:3: ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) )
                                    {
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1377:3: ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN )
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1377:4: ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN
                                    {
                                    this_WHEN_13=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_ruleForSource2926); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_WHEN_13, grammarAccess.getForSourceAccess().getWHENTerminalRuleCall_1_1_2_1_2_0()); 
                                          
                                    }

                                    }

                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1381:2: ( (lv_when_14_0= ruleExpression ) )
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1382:1: (lv_when_14_0= ruleExpression )
                                    {
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1382:1: (lv_when_14_0= ruleExpression )
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1383:3: lv_when_14_0= ruleExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getForSourceAccess().getWhenExpressionParserRuleCall_1_1_2_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpression_in_ruleForSource2947);
                                    lv_when_14_0=ruleExpression();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getForSourceRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"when",
                                              		lv_when_14_0, 
                                              		"Expression");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForSource"


    // $ANTLR start "entryRuleRange"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1407:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1408:2: (iv_ruleRange= ruleRange EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1409:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange2990);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange3000); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1416:1: ruleRange returns [EObject current=null] : ( ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_0=null;
        Token this_DOT_DOT_2=null;
        Token this_ELLIPSIS_3=null;
        Token this_RBRACKET_5=null;
        EObject lv_start_1_0 = null;

        EObject lv_end_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1419:28: ( ( ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1420:1: ( ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1420:1: ( ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1420:2: ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1420:2: ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1420:3: ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1425:25: (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1425:26: this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS )
            {
            this_LBRACKET_0=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleRange3066); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LBRACKET_0, grammarAccess.getRangeAccess().getLBRACKETTerminalRuleCall_0_0_0()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1429:1: ( (lv_start_1_0= ruleExpression ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1430:1: (lv_start_1_0= ruleExpression )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1430:1: (lv_start_1_0= ruleExpression )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1431:3: lv_start_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getStartExpressionParserRuleCall_0_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleRange3086);
            lv_start_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"start",
                      		lv_start_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1447:2: (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DOT_DOT) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ELLIPSIS) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1447:3: this_DOT_DOT_2= RULE_DOT_DOT
                    {
                    this_DOT_DOT_2=(Token)match(input,RULE_DOT_DOT,FOLLOW_RULE_DOT_DOT_in_ruleRange3098); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_DOT_2, grammarAccess.getRangeAccess().getDOT_DOTTerminalRuleCall_0_0_2_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1452:6: this_ELLIPSIS_3= RULE_ELLIPSIS
                    {
                    this_ELLIPSIS_3=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleRange3114); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ELLIPSIS_3, grammarAccess.getRangeAccess().getELLIPSISTerminalRuleCall_0_0_2_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1456:4: ( (lv_end_4_0= ruleExpression ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1457:1: (lv_end_4_0= ruleExpression )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1457:1: (lv_end_4_0= ruleExpression )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1458:3: lv_end_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getEndExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleRange3137);
            lv_end_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRangeRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_4_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_RBRACKET_5=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleRange3148); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RBRACKET_5, grammarAccess.getRangeAccess().getRBRACKETTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleAssignment"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1486:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1487:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1488:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3183);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3193); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1495:1: ruleAssignment returns [EObject current=null] : ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject this_LogicOp_3 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1498:28: ( ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:1: ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:1: ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:2: ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:2: ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:3: ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:3: ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:4: ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1513:6: ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1513:7: ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1513:7: ( (lv_left_0_0= ruleAssignable ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1514:1: (lv_left_0_0= ruleAssignable )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1514:1: (lv_left_0_0= ruleAssignable )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1515:3: lv_left_0_0= ruleAssignable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getLeftAssignableParserRuleCall_0_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignable_in_ruleAssignment3281);
                    lv_left_0_0=ruleAssignable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"left",
                              		lv_left_0_0, 
                              		"Assignable");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1531:2: ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1532:1: ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1532:1: ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1533:1: (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1533:1: (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_EQUAL) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==RULE_COMPOUND_ASSIGN) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1534:3: lv_operator_1_1= RULE_EQUAL
                            {
                            lv_operator_1_1=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleAssignment3300); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_operator_1_1, grammarAccess.getAssignmentAccess().getOperatorEQUALTerminalRuleCall_0_0_0_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAssignmentRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_1, 
                                      		"EQUAL");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1549:8: lv_operator_1_2= RULE_COMPOUND_ASSIGN
                            {
                            lv_operator_1_2=(Token)match(input,RULE_COMPOUND_ASSIGN,FOLLOW_RULE_COMPOUND_ASSIGN_in_ruleAssignment3320); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_operator_1_2, grammarAccess.getAssignmentAccess().getOperatorCOMPOUND_ASSIGNTerminalRuleCall_0_0_0_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAssignmentRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"operator",
                                      		lv_operator_1_2, 
                                      		"COMPOUND_ASSIGN");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1567:4: ( (lv_right_2_0= ruleAssigned ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1568:1: (lv_right_2_0= ruleAssigned )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1568:1: (lv_right_2_0= ruleAssigned )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1569:3: lv_right_2_0= ruleAssigned
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightAssignedParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssigned_in_ruleAssignment3351);
                    lv_right_2_0=ruleAssigned();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_2_0, 
                              		"Assigned");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1587:5: this_LogicOp_3= ruleLogicOp
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentAccess().getLogicOpParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLogicOp_in_ruleAssignment3380);
                    this_LogicOp_3=ruleLogicOp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LogicOp_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleAssigned"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1603:1: entryRuleAssigned returns [EObject current=null] : iv_ruleAssigned= ruleAssigned EOF ;
    public final EObject entryRuleAssigned() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssigned = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1604:2: (iv_ruleAssigned= ruleAssigned EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1605:2: iv_ruleAssigned= ruleAssigned EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignedRule()); 
            }
            pushFollow(FOLLOW_ruleAssigned_in_entryRuleAssigned3415);
            iv_ruleAssigned=ruleAssigned();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssigned; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssigned3425); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssigned"


    // $ANTLR start "ruleAssigned"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1612:1: ruleAssigned returns [EObject current=null] : (this_Expression_0= ruleExpression | (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT ) | this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration ) ;
    public final EObject ruleAssigned() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token this_OUTDENT_3=null;
        EObject this_Expression_0 = null;

        EObject this_Expression_2 = null;

        EObject this_AssignedClassDeclaration_4 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1615:28: ( (this_Expression_0= ruleExpression | (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT ) | this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1616:1: (this_Expression_0= ruleExpression | (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT ) | this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1616:1: (this_Expression_0= ruleExpression | (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT ) | this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_FOR:
            case RULE_WHILE:
            case RULE_UNTIL:
            case RULE_LBRACKET:
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_UNARY:
            case RULE_PLUS_PLUS:
            case RULE_MINUS_MINUS:
            case RULE_SUPER:
            case RULE_AT_SIGIL:
            case RULE_THIS:
            case RULE_LOOP:
            case RULE_TRY:
            case RULE_SWITCH:
            case RULE_IF:
            case RULE_IDENTIFIER:
            case RULE_LCURLY:
            case RULE_PARAM_START:
            case RULE_FUNC_ARROW:
            case RULE_BOUND_FUNC_ARROW:
            case RULE_NUMBER:
            case RULE_BOOL:
            case RULE_JS:
            case RULE_REGEX:
            case RULE_LPAREN:
                {
                alt29=1;
                }
                break;
            case RULE_INDENT:
                {
                alt29=2;
                }
                break;
            case RULE_CLASS:
                {
                alt29=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1617:5: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignedAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAssigned3472);
                    this_Expression_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1626:6: (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1626:6: (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1626:7: this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT
                    {
                    this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleAssigned3489); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_1, grammarAccess.getAssignedAccess().getINDENTTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignedAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAssigned3510);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_OUTDENT_3=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleAssigned3520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OUTDENT_3, grammarAccess.getAssignedAccess().getOUTDENTTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1645:5: this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignedAccess().getAssignedClassDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignedClassDeclaration_in_ruleAssigned3548);
                    this_AssignedClassDeclaration_4=ruleAssignedClassDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssignedClassDeclaration_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssigned"


    // $ANTLR start "entryRuleLogicOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1661:1: entryRuleLogicOp returns [EObject current=null] : iv_ruleLogicOp= ruleLogicOp EOF ;
    public final EObject entryRuleLogicOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOp = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1662:2: (iv_ruleLogicOp= ruleLogicOp EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1663:2: iv_ruleLogicOp= ruleLogicOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicOpRule()); 
            }
            pushFollow(FOLLOW_ruleLogicOp_in_entryRuleLogicOp3583);
            iv_ruleLogicOp=ruleLogicOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOp3593); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicOp"


    // $ANTLR start "ruleLogicOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1670:1: ruleLogicOp returns [EObject current=null] : (this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )* ) ;
    public final EObject ruleLogicOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_CompareOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1673:28: ( (this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1674:1: (this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1674:1: (this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1675:5: this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicOpAccess().getCompareOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOp_in_ruleLogicOp3640);
            this_CompareOp_0=ruleCompareOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1683:1: ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_LOGIC) ) {
                    int LA30_2 = input.LA(2);

                    if ( (synpred18_InternalCoffeeScript()) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1683:2: ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1683:2: ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1683:3: ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1689:6: ( () ( (lv_operator_2_0= RULE_LOGIC ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1689:7: () ( (lv_operator_2_0= RULE_LOGIC ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1689:7: ()
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1690:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1695:2: ( (lv_operator_2_0= RULE_LOGIC ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1696:1: (lv_operator_2_0= RULE_LOGIC )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1696:1: (lv_operator_2_0= RULE_LOGIC )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1697:3: lv_operator_2_0= RULE_LOGIC
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_LOGIC,FOLLOW_RULE_LOGIC_in_ruleLogicOp3686); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_operator_2_0, grammarAccess.getLogicOpAccess().getOperatorLOGICTerminalRuleCall_1_0_0_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getLogicOpRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"LOGIC");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1713:4: ( (lv_right_3_0= ruleCompareOp ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1714:1: (lv_right_3_0= ruleCompareOp )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1714:1: (lv_right_3_0= ruleCompareOp )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1715:3: lv_right_3_0= ruleCompareOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicOpAccess().getRightCompareOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareOp_in_ruleLogicOp3714);
            	    lv_right_3_0=ruleCompareOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicOpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"CompareOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicOp"


    // $ANTLR start "entryRuleCompareOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1739:1: entryRuleCompareOp returns [EObject current=null] : iv_ruleCompareOp= ruleCompareOp EOF ;
    public final EObject entryRuleCompareOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOp = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1740:2: (iv_ruleCompareOp= ruleCompareOp EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1741:2: iv_ruleCompareOp= ruleCompareOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOpRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOp_in_entryRuleCompareOp3752);
            iv_ruleCompareOp=ruleCompareOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOp3762); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompareOp"


    // $ANTLR start "ruleCompareOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1748:1: ruleCompareOp returns [EObject current=null] : (this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )* ) ;
    public final EObject ruleCompareOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_RelationOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1751:28: ( (this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1752:1: (this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1752:1: (this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1753:5: this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOpAccess().getRelationOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationOp_in_ruleCompareOp3809);
            this_RelationOp_0=ruleRelationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1761:1: ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_COMPARE) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred19_InternalCoffeeScript()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1761:2: ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1761:2: ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1761:3: ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1767:6: ( () ( (lv_operator_2_0= RULE_COMPARE ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1767:7: () ( (lv_operator_2_0= RULE_COMPARE ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1767:7: ()
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1768:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCompareOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1773:2: ( (lv_operator_2_0= RULE_COMPARE ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1774:1: (lv_operator_2_0= RULE_COMPARE )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1774:1: (lv_operator_2_0= RULE_COMPARE )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1775:3: lv_operator_2_0= RULE_COMPARE
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_ruleCompareOp3855); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_operator_2_0, grammarAccess.getCompareOpAccess().getOperatorCOMPARETerminalRuleCall_1_0_0_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getCompareOpRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"COMPARE");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1791:4: ( (lv_right_3_0= ruleRelationOp ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1792:1: (lv_right_3_0= ruleRelationOp )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1792:1: (lv_right_3_0= ruleRelationOp )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1793:3: lv_right_3_0= ruleRelationOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompareOpAccess().getRightRelationOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationOp_in_ruleCompareOp3883);
            	    lv_right_3_0=ruleRelationOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCompareOpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"RelationOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompareOp"


    // $ANTLR start "entryRuleRelationOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1817:1: entryRuleRelationOp returns [EObject current=null] : iv_ruleRelationOp= ruleRelationOp EOF ;
    public final EObject entryRuleRelationOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationOp = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1818:2: (iv_ruleRelationOp= ruleRelationOp EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1819:2: iv_ruleRelationOp= ruleRelationOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationOpRule()); 
            }
            pushFollow(FOLLOW_ruleRelationOp_in_entryRuleRelationOp3921);
            iv_ruleRelationOp=ruleRelationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationOp3931); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationOp"


    // $ANTLR start "ruleRelationOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1826:1: ruleRelationOp returns [EObject current=null] : (this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )* ) ;
    public final EObject ruleRelationOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_ShiftOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1829:28: ( (this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1830:1: (this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1830:1: (this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1831:5: this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationOpAccess().getShiftOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftOp_in_ruleRelationOp3978);
            this_ShiftOp_0=ruleShiftOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1839:1: ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_RELATION) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred20_InternalCoffeeScript()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1839:2: ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1839:2: ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1839:3: ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1845:6: ( () ( (lv_operator_2_0= RULE_RELATION ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1845:7: () ( (lv_operator_2_0= RULE_RELATION ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1845:7: ()
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1846:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1851:2: ( (lv_operator_2_0= RULE_RELATION ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1852:1: (lv_operator_2_0= RULE_RELATION )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1852:1: (lv_operator_2_0= RULE_RELATION )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1853:3: lv_operator_2_0= RULE_RELATION
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_RELATION,FOLLOW_RULE_RELATION_in_ruleRelationOp4024); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_operator_2_0, grammarAccess.getRelationOpAccess().getOperatorRELATIONTerminalRuleCall_1_0_0_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRelationOpRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"RELATION");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1869:4: ( (lv_right_3_0= ruleShiftOp ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1870:1: (lv_right_3_0= ruleShiftOp )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1870:1: (lv_right_3_0= ruleShiftOp )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1871:3: lv_right_3_0= ruleShiftOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationOpAccess().getRightShiftOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOp_in_ruleRelationOp4052);
            	    lv_right_3_0=ruleShiftOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationOpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"ShiftOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationOp"


    // $ANTLR start "entryRuleShiftOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1895:1: entryRuleShiftOp returns [EObject current=null] : iv_ruleShiftOp= ruleShiftOp EOF ;
    public final EObject entryRuleShiftOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftOp = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1896:2: (iv_ruleShiftOp= ruleShiftOp EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1897:2: iv_ruleShiftOp= ruleShiftOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftOpRule()); 
            }
            pushFollow(FOLLOW_ruleShiftOp_in_entryRuleShiftOp4090);
            iv_ruleShiftOp=ruleShiftOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftOp4100); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleShiftOp"


    // $ANTLR start "ruleShiftOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1904:1: ruleShiftOp returns [EObject current=null] : (this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )* ) ;
    public final EObject ruleShiftOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AdditiveOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1907:28: ( (this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1908:1: (this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1908:1: (this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1909:5: this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftOpAccess().getAdditiveOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveOp_in_ruleShiftOp4147);
            this_AdditiveOp_0=ruleAdditiveOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1917:1: ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_SHIFT) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred21_InternalCoffeeScript()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1917:2: ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1917:2: ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1917:3: ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1923:6: ( () ( (lv_operator_2_0= RULE_SHIFT ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1923:7: () ( (lv_operator_2_0= RULE_SHIFT ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1923:7: ()
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1924:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1929:2: ( (lv_operator_2_0= RULE_SHIFT ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1930:1: (lv_operator_2_0= RULE_SHIFT )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1930:1: (lv_operator_2_0= RULE_SHIFT )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1931:3: lv_operator_2_0= RULE_SHIFT
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_SHIFT,FOLLOW_RULE_SHIFT_in_ruleShiftOp4193); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_operator_2_0, grammarAccess.getShiftOpAccess().getOperatorSHIFTTerminalRuleCall_1_0_0_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getShiftOpRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"SHIFT");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1947:4: ( (lv_right_3_0= ruleAdditiveOp ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1948:1: (lv_right_3_0= ruleAdditiveOp )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1948:1: (lv_right_3_0= ruleAdditiveOp )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1949:3: lv_right_3_0= ruleAdditiveOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftOpAccess().getRightAdditiveOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOp_in_ruleShiftOp4221);
            	    lv_right_3_0=ruleAdditiveOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getShiftOpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AdditiveOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleShiftOp"


    // $ANTLR start "entryRuleAdditiveOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1973:1: entryRuleAdditiveOp returns [EObject current=null] : iv_ruleAdditiveOp= ruleAdditiveOp EOF ;
    public final EObject entryRuleAdditiveOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveOp = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1974:2: (iv_ruleAdditiveOp= ruleAdditiveOp EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1975:2: iv_ruleAdditiveOp= ruleAdditiveOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveOpRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveOp_in_entryRuleAdditiveOp4259);
            iv_ruleAdditiveOp=ruleAdditiveOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveOp4269); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveOp"


    // $ANTLR start "ruleAdditiveOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1982:1: ruleAdditiveOp returns [EObject current=null] : (this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )* ) ;
    public final EObject ruleAdditiveOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_MathOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1985:28: ( (this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1986:1: (this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1986:1: (this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1987:5: this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveOpAccess().getMathOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMathOp_in_ruleAdditiveOp4316);
            this_MathOp_0=ruleMathOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MathOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1995:1: ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_PLUS) ) {
                    int LA35_2 = input.LA(2);

                    if ( (synpred22_InternalCoffeeScript()) ) {
                        alt35=1;
                    }


                }
                else if ( (LA35_0==RULE_MINUS) ) {
                    int LA35_3 = input.LA(2);

                    if ( (synpred22_InternalCoffeeScript()) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1995:2: ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1995:2: ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1995:3: ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2006:6: ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2006:7: () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2006:7: ()
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2007:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2012:2: ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2013:1: ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2013:1: ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2014:1: (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2014:1: (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==RULE_PLUS) ) {
            	        alt34=1;
            	    }
            	    else if ( (LA34_0==RULE_MINUS) ) {
            	        alt34=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 34, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2015:3: lv_operator_2_1= RULE_PLUS
            	            {
            	            lv_operator_2_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleAdditiveOp4379); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_operator_2_1, grammarAccess.getAdditiveOpAccess().getOperatorPLUSTerminalRuleCall_1_0_0_1_0_0()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAdditiveOpRule());
            	              	        }
            	                     		setWithLastConsumed(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_1, 
            	                      		"PLUS");
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2030:8: lv_operator_2_2= RULE_MINUS
            	            {
            	            lv_operator_2_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleAdditiveOp4399); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              			newLeafNode(lv_operator_2_2, grammarAccess.getAdditiveOpAccess().getOperatorMINUSTerminalRuleCall_1_0_0_1_0_1()); 
            	              		
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getAdditiveOpRule());
            	              	        }
            	                     		setWithLastConsumed(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_2, 
            	                      		"MINUS");
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2048:4: ( (lv_right_3_0= ruleMathOp ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2049:1: (lv_right_3_0= ruleMathOp )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2049:1: (lv_right_3_0= ruleMathOp )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2050:3: lv_right_3_0= ruleMathOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveOpAccess().getRightMathOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMathOp_in_ruleAdditiveOp4430);
            	    lv_right_3_0=ruleMathOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveOpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"MathOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOp"


    // $ANTLR start "entryRuleMathOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2074:1: entryRuleMathOp returns [EObject current=null] : iv_ruleMathOp= ruleMathOp EOF ;
    public final EObject entryRuleMathOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathOp = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2075:2: (iv_ruleMathOp= ruleMathOp EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2076:2: iv_ruleMathOp= ruleMathOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMathOpRule()); 
            }
            pushFollow(FOLLOW_ruleMathOp_in_entryRuleMathOp4468);
            iv_ruleMathOp=ruleMathOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMathOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOp4478); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMathOp"


    // $ANTLR start "ruleMathOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2083:1: ruleMathOp returns [EObject current=null] : (this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )* ) ;
    public final EObject ruleMathOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_UnaryOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2086:28: ( (this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2087:1: (this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2087:1: (this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2088:5: this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMathOpAccess().getUnaryOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOp_in_ruleMathOp4525);
            this_UnaryOp_0=ruleUnaryOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2096:1: ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_MATH) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred23_InternalCoffeeScript()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2096:2: ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2096:2: ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2096:3: ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2102:6: ( () ( (lv_operator_2_0= RULE_MATH ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2102:7: () ( (lv_operator_2_0= RULE_MATH ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2102:7: ()
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2103:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMathOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2108:2: ( (lv_operator_2_0= RULE_MATH ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2109:1: (lv_operator_2_0= RULE_MATH )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2109:1: (lv_operator_2_0= RULE_MATH )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2110:3: lv_operator_2_0= RULE_MATH
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_MATH,FOLLOW_RULE_MATH_in_ruleMathOp4571); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_operator_2_0, grammarAccess.getMathOpAccess().getOperatorMATHTerminalRuleCall_1_0_0_1_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getMathOpRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"MATH");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2126:4: ( (lv_right_3_0= ruleUnaryOp ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2127:1: (lv_right_3_0= ruleUnaryOp )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2127:1: (lv_right_3_0= ruleUnaryOp )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2128:3: lv_right_3_0= ruleUnaryOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMathOpAccess().getRightUnaryOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOp_in_ruleMathOp4599);
            	    lv_right_3_0=ruleUnaryOp();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMathOpRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"UnaryOp");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMathOp"


    // $ANTLR start "entryRuleUnaryOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2152:1: entryRuleUnaryOp returns [EObject current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final EObject entryRuleUnaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOp = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2153:2: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2154:2: iv_ruleUnaryOp= ruleUnaryOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOpRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp4637);
            iv_ruleUnaryOp=ruleUnaryOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOp4647); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOp"


    // $ANTLR start "ruleUnaryOp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2161:1: ruleUnaryOp returns [EObject current=null] : ( ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression ) | ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable ) | (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? ) ) ;
    public final EObject ruleUnaryOp() throws RecognitionException {
        EObject current = null;

        Token this_UNARY_0=null;
        Token this_PLUS_1=null;
        Token this_MINUS_2=null;
        Token this_PLUS_PLUS_4=null;
        Token this_MINUS_MINUS_5=null;
        Token this_QUESTION_8=null;
        EObject this_Expression_3 = null;

        EObject this_Variable_6 = null;

        EObject this_Application_7 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2164:28: ( ( ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression ) | ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable ) | (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2165:1: ( ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression ) | ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable ) | (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2165:1: ( ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression ) | ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable ) | (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_UNARY:
                {
                alt40=1;
                }
                break;
            case RULE_PLUS_PLUS:
            case RULE_MINUS_MINUS:
                {
                alt40=2;
                }
                break;
            case RULE_STRING:
            case RULE_FOR:
            case RULE_WHILE:
            case RULE_UNTIL:
            case RULE_LBRACKET:
            case RULE_SUPER:
            case RULE_AT_SIGIL:
            case RULE_THIS:
            case RULE_LOOP:
            case RULE_TRY:
            case RULE_SWITCH:
            case RULE_IF:
            case RULE_IDENTIFIER:
            case RULE_LCURLY:
            case RULE_PARAM_START:
            case RULE_FUNC_ARROW:
            case RULE_BOUND_FUNC_ARROW:
            case RULE_NUMBER:
            case RULE_BOOL:
            case RULE_JS:
            case RULE_REGEX:
            case RULE_LPAREN:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2165:2: ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2165:2: ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2165:3: (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2165:3: (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS )
                    int alt37=3;
                    switch ( input.LA(1) ) {
                    case RULE_UNARY:
                        {
                        alt37=1;
                        }
                        break;
                    case RULE_PLUS:
                        {
                        alt37=2;
                        }
                        break;
                    case RULE_MINUS:
                        {
                        alt37=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }

                    switch (alt37) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2165:4: this_UNARY_0= RULE_UNARY
                            {
                            this_UNARY_0=(Token)match(input,RULE_UNARY,FOLLOW_RULE_UNARY_in_ruleUnaryOp4685); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_UNARY_0, grammarAccess.getUnaryOpAccess().getUNARYTerminalRuleCall_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2170:6: this_PLUS_1= RULE_PLUS
                            {
                            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleUnaryOp4701); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_PLUS_1, grammarAccess.getUnaryOpAccess().getPLUSTerminalRuleCall_0_0_1()); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2175:6: this_MINUS_2= RULE_MINUS
                            {
                            this_MINUS_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleUnaryOp4717); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_MINUS_2, grammarAccess.getUnaryOpAccess().getMINUSTerminalRuleCall_0_0_2()); 
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOpAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleUnaryOp4739);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2189:6: ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2189:6: ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2189:7: (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2189:7: (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_PLUS_PLUS) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==RULE_MINUS_MINUS) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2189:8: this_PLUS_PLUS_4= RULE_PLUS_PLUS
                            {
                            this_PLUS_PLUS_4=(Token)match(input,RULE_PLUS_PLUS,FOLLOW_RULE_PLUS_PLUS_in_ruleUnaryOp4758); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_PLUS_PLUS_4, grammarAccess.getUnaryOpAccess().getPLUS_PLUSTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2194:6: this_MINUS_MINUS_5= RULE_MINUS_MINUS
                            {
                            this_MINUS_MINUS_5=(Token)match(input,RULE_MINUS_MINUS,FOLLOW_RULE_MINUS_MINUS_in_ruleUnaryOp4774); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_MINUS_MINUS_5, grammarAccess.getUnaryOpAccess().getMINUS_MINUSTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOpAccess().getVariableParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleUnaryOp4796);
                    this_Variable_6=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2208:6: (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2208:6: (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2209:5: this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOpAccess().getApplicationParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleApplication_in_ruleUnaryOp4825);
                    this_Application_7=ruleApplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Application_7; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2217:1: (this_QUESTION_8= RULE_QUESTION )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_QUESTION) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2217:2: this_QUESTION_8= RULE_QUESTION
                            {
                            this_QUESTION_8=(Token)match(input,RULE_QUESTION,FOLLOW_RULE_QUESTION_in_ruleUnaryOp4836); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_QUESTION_8, grammarAccess.getUnaryOpAccess().getQUESTIONTerminalRuleCall_2_1()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "entryRuleApplication"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2229:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2230:2: (iv_ruleApplication= ruleApplication EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2231:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication4874);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication4884); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2238:1: ruleApplication returns [EObject current=null] : ( ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) ) | ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* ) ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token this_SUPER_1=null;
        Token this_CALL_START_2=null;
        Token this_CALL_END_4=null;
        EObject lv_args_3_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_features_6_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2241:28: ( ( ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) ) | ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2242:1: ( ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) ) | ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2242:1: ( ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) ) | ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_SUPER) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_STRING||(LA43_0>=RULE_FOR && LA43_0<=RULE_WHILE)||LA43_0==RULE_UNTIL||LA43_0==RULE_LBRACKET||LA43_0==RULE_AT_SIGIL||(LA43_0>=RULE_THIS && LA43_0<=RULE_TRY)||LA43_0==RULE_SWITCH||(LA43_0>=RULE_IF && LA43_0<=RULE_LCURLY)||LA43_0==RULE_PARAM_START||(LA43_0>=RULE_FUNC_ARROW && LA43_0<=RULE_LPAREN)) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2242:2: ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2242:2: ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2242:3: () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2242:3: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2243:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getApplicationAccess().getSuperCallAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2248:2: (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2248:3: this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )?
                    {
                    this_SUPER_1=(Token)match(input,RULE_SUPER,FOLLOW_RULE_SUPER_in_ruleApplication4931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SUPER_1, grammarAccess.getApplicationAccess().getSUPERTerminalRuleCall_0_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2252:1: (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_CALL_START) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2252:2: this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END
                            {
                            this_CALL_START_2=(Token)match(input,RULE_CALL_START,FOLLOW_RULE_CALL_START_in_ruleApplication4942); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_CALL_START_2, grammarAccess.getApplicationAccess().getCALL_STARTTerminalRuleCall_0_1_1_0()); 
                                  
                            }
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2256:1: ( (lv_args_3_0= ruleArgList ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2257:1: (lv_args_3_0= ruleArgList )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2257:1: (lv_args_3_0= ruleArgList )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2258:3: lv_args_3_0= ruleArgList
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getApplicationAccess().getArgsArgListParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleArgList_in_ruleApplication4962);
                            lv_args_3_0=ruleArgList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getApplicationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"args",
                                      		lv_args_3_0, 
                                      		"ArgList");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            this_CALL_END_4=(Token)match(input,RULE_CALL_END,FOLLOW_RULE_CALL_END_in_ruleApplication4973); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_CALL_END_4, grammarAccess.getApplicationAccess().getCALL_ENDTerminalRuleCall_0_1_1_2()); 
                                  
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2279:6: ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2279:6: ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2279:7: ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )*
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2279:7: ( (lv_value_5_0= rulePrimaryExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2280:1: (lv_value_5_0= rulePrimaryExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2280:1: (lv_value_5_0= rulePrimaryExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2281:3: lv_value_5_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getValuePrimaryExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleApplication5004);
                    lv_value_5_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_5_0, 
                              		"PrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2297:2: ( (lv_features_6_0= ruleFeatureCall ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==RULE_CALL_START||LA42_0==RULE_FUNC_EXIST||(LA42_0>=RULE_DOT && LA42_0<=RULE_INDEX_START)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2298:1: (lv_features_6_0= ruleFeatureCall )
                    	    {
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2298:1: (lv_features_6_0= ruleFeatureCall )
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2299:3: lv_features_6_0= ruleFeatureCall
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getApplicationAccess().getFeaturesFeatureCallParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFeatureCall_in_ruleApplication5025);
                    	    lv_features_6_0=ruleFeatureCall();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"features",
                    	              		lv_features_6_0, 
                    	              		"FeatureCall");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleFeatureCall"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2323:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2324:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2325:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall5063);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall5073); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureCall"


    // $ANTLR start "ruleFeatureCall"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2332:1: ruleFeatureCall returns [EObject current=null] : (this_FunctionCall_0= ruleFunctionCall | this_PropertyAccess_1= rulePropertyAccess ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionCall_0 = null;

        EObject this_PropertyAccess_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2335:28: ( (this_FunctionCall_0= ruleFunctionCall | this_PropertyAccess_1= rulePropertyAccess ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2336:1: (this_FunctionCall_0= ruleFunctionCall | this_PropertyAccess_1= rulePropertyAccess )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2336:1: (this_FunctionCall_0= ruleFunctionCall | this_PropertyAccess_1= rulePropertyAccess )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_CALL_START||LA44_0==RULE_FUNC_EXIST) ) {
                alt44=1;
            }
            else if ( ((LA44_0>=RULE_DOT && LA44_0<=RULE_INDEX_START)) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2337:5: this_FunctionCall_0= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallAccess().getFunctionCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleFeatureCall5120);
                    this_FunctionCall_0=ruleFunctionCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2347:5: this_PropertyAccess_1= rulePropertyAccess
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallAccess().getPropertyAccessParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyAccess_in_ruleFeatureCall5147);
                    this_PropertyAccess_1=rulePropertyAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PropertyAccess_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureCall"


    // $ANTLR start "entryRuleFunctionCall"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2363:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2364:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2365:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5182);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5192); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionCall"


    // $ANTLR start "ruleFunctionCall"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2372:1: ruleFunctionCall returns [EObject current=null] : ( () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token this_FUNC_EXIST_1=null;
        Token this_CALL_START_2=null;
        Token this_CALL_END_4=null;
        EObject lv_args_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2375:28: ( ( () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2376:1: ( () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2376:1: ( () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2376:2: () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2376:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2377:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2382:2: (this_FUNC_EXIST_1= RULE_FUNC_EXIST )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_FUNC_EXIST) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2382:3: this_FUNC_EXIST_1= RULE_FUNC_EXIST
                    {
                    this_FUNC_EXIST_1=(Token)match(input,RULE_FUNC_EXIST,FOLLOW_RULE_FUNC_EXIST_in_ruleFunctionCall5238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FUNC_EXIST_1, grammarAccess.getFunctionCallAccess().getFUNC_EXISTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            this_CALL_START_2=(Token)match(input,RULE_CALL_START,FOLLOW_RULE_CALL_START_in_ruleFunctionCall5250); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CALL_START_2, grammarAccess.getFunctionCallAccess().getCALL_STARTTerminalRuleCall_2()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2390:1: ( (lv_args_3_0= ruleArgList ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2391:1: (lv_args_3_0= ruleArgList )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2391:1: (lv_args_3_0= ruleArgList )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2392:3: lv_args_3_0= ruleArgList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsArgListParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArgList_in_ruleFunctionCall5270);
            lv_args_3_0=ruleArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionCallRule());
              	        }
                     		set(
                     			current, 
                     			"args",
                      		lv_args_3_0, 
                      		"ArgList");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_CALL_END_4=(Token)match(input,RULE_CALL_END,FOLLOW_RULE_CALL_END_in_ruleFunctionCall5281); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CALL_END_4, grammarAccess.getFunctionCallAccess().getCALL_ENDTerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionCall"


    // $ANTLR start "entryRulePropertyAccess"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2420:1: entryRulePropertyAccess returns [EObject current=null] : iv_rulePropertyAccess= rulePropertyAccess EOF ;
    public final EObject entryRulePropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAccess = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2421:2: (iv_rulePropertyAccess= rulePropertyAccess EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2422:2: iv_rulePropertyAccess= rulePropertyAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyAccessRule()); 
            }
            pushFollow(FOLLOW_rulePropertyAccess_in_entryRulePropertyAccess5316);
            iv_rulePropertyAccess=rulePropertyAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyAccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAccess5326); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyAccess"


    // $ANTLR start "rulePropertyAccess"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2429:1: rulePropertyAccess returns [EObject current=null] : (this_NamedPropertyAccess_0= ruleNamedPropertyAccess | this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess ) ;
    public final EObject rulePropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject this_NamedPropertyAccess_0 = null;

        EObject this_IndexedPropertyAccess_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2432:28: ( (this_NamedPropertyAccess_0= ruleNamedPropertyAccess | this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2433:1: (this_NamedPropertyAccess_0= ruleNamedPropertyAccess | this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2433:1: (this_NamedPropertyAccess_0= ruleNamedPropertyAccess | this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_DOT && LA46_0<=RULE_DOUBLE_COLON)) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_INDEX_START) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2434:5: this_NamedPropertyAccess_0= ruleNamedPropertyAccess
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccessAccess().getNamedPropertyAccessParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedPropertyAccess_in_rulePropertyAccess5373);
                    this_NamedPropertyAccess_0=ruleNamedPropertyAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NamedPropertyAccess_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2444:5: this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccessAccess().getIndexedPropertyAccessParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIndexedPropertyAccess_in_rulePropertyAccess5400);
                    this_IndexedPropertyAccess_1=ruleIndexedPropertyAccess();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IndexedPropertyAccess_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyAccess"


    // $ANTLR start "entryRuleThisProperty"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2460:1: entryRuleThisProperty returns [EObject current=null] : iv_ruleThisProperty= ruleThisProperty EOF ;
    public final EObject entryRuleThisProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThisProperty = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2461:2: (iv_ruleThisProperty= ruleThisProperty EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2462:2: iv_ruleThisProperty= ruleThisProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThisPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleThisProperty_in_entryRuleThisProperty5435);
            iv_ruleThisProperty=ruleThisProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThisProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThisProperty5445); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThisProperty"


    // $ANTLR start "ruleThisProperty"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2469:1: ruleThisProperty returns [EObject current=null] : (this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId ) ;
    public final EObject ruleThisProperty() throws RecognitionException {
        EObject current = null;

        Token this_AT_SIGIL_0=null;
        EObject this_Id_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2472:28: ( (this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2473:1: (this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2473:1: (this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2473:2: this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId
            {
            this_AT_SIGIL_0=(Token)match(input,RULE_AT_SIGIL,FOLLOW_RULE_AT_SIGIL_in_ruleThisProperty5481); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_SIGIL_0, grammarAccess.getThisPropertyAccess().getAT_SIGILTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getThisPropertyAccess().getIdParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleId_in_ruleThisProperty5502);
            this_Id_1=ruleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Id_1; 
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThisProperty"


    // $ANTLR start "entryRuleNamedPropertyAccess"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2494:1: entryRuleNamedPropertyAccess returns [EObject current=null] : iv_ruleNamedPropertyAccess= ruleNamedPropertyAccess EOF ;
    public final EObject entryRuleNamedPropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedPropertyAccess = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2495:2: (iv_ruleNamedPropertyAccess= ruleNamedPropertyAccess EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2496:2: iv_ruleNamedPropertyAccess= ruleNamedPropertyAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedPropertyAccessRule()); 
            }
            pushFollow(FOLLOW_ruleNamedPropertyAccess_in_entryRuleNamedPropertyAccess5537);
            iv_ruleNamedPropertyAccess=ruleNamedPropertyAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedPropertyAccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedPropertyAccess5547); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedPropertyAccess"


    // $ANTLR start "ruleNamedPropertyAccess"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2503:1: ruleNamedPropertyAccess returns [EObject current=null] : ( ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) ) | ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? ) ) ;
    public final EObject ruleNamedPropertyAccess() throws RecognitionException {
        EObject current = null;

        Token lv_accessor_0_1=null;
        Token lv_accessor_0_2=null;
        Token lv_accessor_2_0=null;
        EObject lv_name_1_0 = null;

        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2506:28: ( ( ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) ) | ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2507:1: ( ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) ) | ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2507:1: ( ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) ) | ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? ) )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_DOT && LA49_0<=RULE_QUESTION_DOT)) ) {
                alt49=1;
            }
            else if ( (LA49_0==RULE_DOUBLE_COLON) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2507:2: ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2507:2: ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2507:3: ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2507:3: ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2508:1: ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2508:1: ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2509:1: (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2509:1: (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_DOT) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==RULE_QUESTION_DOT) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2510:3: lv_accessor_0_1= RULE_DOT
                            {
                            lv_accessor_0_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleNamedPropertyAccess5592); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_accessor_0_1, grammarAccess.getNamedPropertyAccessAccess().getAccessorDOTTerminalRuleCall_0_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getNamedPropertyAccessRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"accessor",
                                      		lv_accessor_0_1, 
                                      		"DOT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2525:8: lv_accessor_0_2= RULE_QUESTION_DOT
                            {
                            lv_accessor_0_2=(Token)match(input,RULE_QUESTION_DOT,FOLLOW_RULE_QUESTION_DOT_in_ruleNamedPropertyAccess5612); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_accessor_0_2, grammarAccess.getNamedPropertyAccessAccess().getAccessorQUESTION_DOTTerminalRuleCall_0_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getNamedPropertyAccessRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"accessor",
                                      		lv_accessor_0_2, 
                                      		"QUESTION_DOT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2543:2: ( (lv_name_1_0= ruleId ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2544:1: (lv_name_1_0= ruleId )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2544:1: (lv_name_1_0= ruleId )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2545:3: lv_name_1_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNamedPropertyAccessAccess().getNameIdParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleNamedPropertyAccess5641);
                    lv_name_1_0=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNamedPropertyAccessRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_1_0, 
                              		"Id");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2562:6: ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2562:6: ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2562:7: ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )?
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2562:7: ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2563:1: (lv_accessor_2_0= RULE_DOUBLE_COLON )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2563:1: (lv_accessor_2_0= RULE_DOUBLE_COLON )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2564:3: lv_accessor_2_0= RULE_DOUBLE_COLON
                    {
                    lv_accessor_2_0=(Token)match(input,RULE_DOUBLE_COLON,FOLLOW_RULE_DOUBLE_COLON_in_ruleNamedPropertyAccess5666); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_accessor_2_0, grammarAccess.getNamedPropertyAccessAccess().getAccessorDOUBLE_COLONTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getNamedPropertyAccessRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"accessor",
                              		lv_accessor_2_0, 
                              		"DOUBLE_COLON");
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2580:2: ( (lv_name_3_0= ruleId ) )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_IDENTIFIER) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2581:1: (lv_name_3_0= ruleId )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2581:1: (lv_name_3_0= ruleId )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2582:3: lv_name_3_0= ruleId
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNamedPropertyAccessAccess().getNameIdParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleId_in_ruleNamedPropertyAccess5692);
                            lv_name_3_0=ruleId();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getNamedPropertyAccessRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"name",
                                      		lv_name_3_0, 
                                      		"Id");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedPropertyAccess"


    // $ANTLR start "entryRuleIndexedPropertyAccess"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2606:1: entryRuleIndexedPropertyAccess returns [EObject current=null] : iv_ruleIndexedPropertyAccess= ruleIndexedPropertyAccess EOF ;
    public final EObject entryRuleIndexedPropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedPropertyAccess = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2607:2: (iv_ruleIndexedPropertyAccess= ruleIndexedPropertyAccess EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2608:2: iv_ruleIndexedPropertyAccess= ruleIndexedPropertyAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedPropertyAccessRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedPropertyAccess_in_entryRuleIndexedPropertyAccess5730);
            iv_ruleIndexedPropertyAccess=ruleIndexedPropertyAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedPropertyAccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedPropertyAccess5740); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndexedPropertyAccess"


    // $ANTLR start "ruleIndexedPropertyAccess"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2615:1: ruleIndexedPropertyAccess returns [EObject current=null] : (this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END ) ;
    public final EObject ruleIndexedPropertyAccess() throws RecognitionException {
        EObject current = null;

        Token this_INDEX_START_0=null;
        Token this_INDEX_END_2=null;
        EObject lv_index_1_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2618:28: ( (this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2619:1: (this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2619:1: (this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2619:2: this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END
            {
            this_INDEX_START_0=(Token)match(input,RULE_INDEX_START,FOLLOW_RULE_INDEX_START_in_ruleIndexedPropertyAccess5776); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INDEX_START_0, grammarAccess.getIndexedPropertyAccessAccess().getINDEX_STARTTerminalRuleCall_0()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2623:1: ( (lv_index_1_0= ruleIndex ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2624:1: (lv_index_1_0= ruleIndex )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2624:1: (lv_index_1_0= ruleIndex )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2625:3: lv_index_1_0= ruleIndex
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIndexedPropertyAccessAccess().getIndexIndexParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndex_in_ruleIndexedPropertyAccess5796);
            lv_index_1_0=ruleIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIndexedPropertyAccessRule());
              	        }
                     		set(
                     			current, 
                     			"index",
                      		lv_index_1_0, 
                      		"Index");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_INDEX_END_2=(Token)match(input,RULE_INDEX_END,FOLLOW_RULE_INDEX_END_in_ruleIndexedPropertyAccess5807); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INDEX_END_2, grammarAccess.getIndexedPropertyAccessAccess().getINDEX_ENDTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndexedPropertyAccess"


    // $ANTLR start "entryRuleIndex"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2653:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2654:2: (iv_ruleIndex= ruleIndex EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2655:2: iv_ruleIndex= ruleIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexRule()); 
            }
            pushFollow(FOLLOW_ruleIndex_in_entryRuleIndex5842);
            iv_ruleIndex=ruleIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndex5852); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndex"


    // $ANTLR start "ruleIndex"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2662:1: ruleIndex returns [EObject current=null] : ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) ) ;
    public final EObject ruleIndex() throws RecognitionException {
        EObject current = null;

        Token lv_dots_0_1=null;
        Token lv_dots_0_2=null;
        Token lv_dots_3_1=null;
        Token lv_dots_3_2=null;
        EObject lv_end_1_0 = null;

        EObject lv_start_2_0 = null;

        EObject lv_end_4_0 = null;

        EObject lv_exp_5_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2665:28: ( ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2666:1: ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2666:1: ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) )
            int alt53=3;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2666:2: ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2666:2: ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2666:3: ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2666:3: ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2666:4: ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2677:1: ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2678:1: (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2678:1: (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_DOT_DOT) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_ELLIPSIS) ) {
                        alt50=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2679:3: lv_dots_0_1= RULE_DOT_DOT
                            {
                            lv_dots_0_1=(Token)match(input,RULE_DOT_DOT,FOLLOW_RULE_DOT_DOT_in_ruleIndex5923); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_dots_0_1, grammarAccess.getIndexAccess().getDotsDOT_DOTTerminalRuleCall_0_0_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIndexRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"dots",
                                      		lv_dots_0_1, 
                                      		"DOT_DOT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2694:8: lv_dots_0_2= RULE_ELLIPSIS
                            {
                            lv_dots_0_2=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleIndex5943); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_dots_0_2, grammarAccess.getIndexAccess().getDotsELLIPSISTerminalRuleCall_0_0_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIndexRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"dots",
                                      		lv_dots_0_2, 
                                      		"ELLIPSIS");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2712:2: ( (lv_end_1_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2713:1: (lv_end_1_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2713:1: (lv_end_1_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2714:3: lv_end_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIndexAccess().getEndExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIndex5972);
                    lv_end_1_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIndexRule());
                      	        }
                             		set(
                             			current, 
                             			"end",
                              		lv_end_1_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:6: ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:6: ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:7: ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )?
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:7: ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:8: ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2745:6: ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2745:7: ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2745:7: ( (lv_start_2_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2746:1: (lv_start_2_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2746:1: (lv_start_2_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2747:3: lv_start_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIndexAccess().getStartExpressionParserRuleCall_1_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIndex6042);
                    lv_start_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIndexRule());
                      	        }
                             		set(
                             			current, 
                             			"start",
                              		lv_start_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2763:2: ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2764:1: ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2764:1: ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2765:1: (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2765:1: (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==RULE_DOT_DOT) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==RULE_ELLIPSIS) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2766:3: lv_dots_3_1= RULE_DOT_DOT
                            {
                            lv_dots_3_1=(Token)match(input,RULE_DOT_DOT,FOLLOW_RULE_DOT_DOT_in_ruleIndex6061); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_dots_3_1, grammarAccess.getIndexAccess().getDotsDOT_DOTTerminalRuleCall_1_0_0_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIndexRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"dots",
                                      		lv_dots_3_1, 
                                      		"DOT_DOT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2781:8: lv_dots_3_2= RULE_ELLIPSIS
                            {
                            lv_dots_3_2=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleIndex6081); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_dots_3_2, grammarAccess.getIndexAccess().getDotsELLIPSISTerminalRuleCall_1_0_0_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getIndexRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"dots",
                                      		lv_dots_3_2, 
                                      		"ELLIPSIS");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2799:4: ( (lv_end_4_0= ruleExpression ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_STRING||(LA52_0>=RULE_FOR && LA52_0<=RULE_WHILE)||LA52_0==RULE_UNTIL||LA52_0==RULE_LBRACKET||(LA52_0>=RULE_PLUS && LA52_0<=RULE_MINUS)||(LA52_0>=RULE_UNARY && LA52_0<=RULE_MINUS_MINUS)||LA52_0==RULE_SUPER||LA52_0==RULE_AT_SIGIL||(LA52_0>=RULE_THIS && LA52_0<=RULE_TRY)||LA52_0==RULE_SWITCH||(LA52_0>=RULE_IF && LA52_0<=RULE_LCURLY)||LA52_0==RULE_PARAM_START||(LA52_0>=RULE_FUNC_ARROW && LA52_0<=RULE_LPAREN)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2800:1: (lv_end_4_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2800:1: (lv_end_4_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2801:3: lv_end_4_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getIndexAccess().getEndExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleIndex6112);
                            lv_end_4_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getIndexRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"end",
                                      		lv_end_4_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2818:6: ( (lv_exp_5_0= ruleExpression ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2818:6: ( (lv_exp_5_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2819:1: (lv_exp_5_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2819:1: (lv_exp_5_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2820:3: lv_exp_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIndexAccess().getExpExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIndex6141);
                    lv_exp_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIndexRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndex"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2844:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2845:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2846:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6177);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression6187); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2853:1: rulePrimaryExpression returns [EObject current=null] : (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_THIS_9=null;
        Token this_FOR_11=null;
        Token this_WHILE_15=null;
        Token this_WHEN_17=null;
        Token this_UNTIL_21=null;
        Token this_WHEN_23=null;
        Token this_LOOP_27=null;
        Token this_TRY_30=null;
        Token this_CATCH_32=null;
        Token this_FINALLY_35=null;
        Token this_FINALLY_37=null;
        Token this_SWITCH_40=null;
        Token this_INDENT_42=null;
        Token this_ELSE_44=null;
        Token this_OUTDENT_46=null;
        EObject this_IfExp_0 = null;

        EObject this_Parenthetical_1 = null;

        EObject this_Literal_2 = null;

        EObject this_Range_3 = null;

        EObject this_Array_4 = null;

        EObject this_Dictionary_5 = null;

        EObject this_Lambda_6 = null;

        EObject this_ThisProperty_7 = null;

        EObject lv_loop_12_0 = null;

        EObject lv_body_13_0 = null;

        EObject lv_loop_16_0 = null;

        EObject lv_when_18_0 = null;

        EObject lv_body_19_0 = null;

        EObject lv_loop_22_0 = null;

        EObject lv_when_24_0 = null;

        EObject lv_body_25_0 = null;

        EObject lv_body_28_0 = null;

        EObject lv_body_31_0 = null;

        EObject lv_exception_33_0 = null;

        EObject lv_catchBlock_34_0 = null;

        EObject lv_finallyBlock_36_0 = null;

        EObject lv_finallyBlock_38_0 = null;

        EObject lv_exp_41_0 = null;

        EObject lv_cases_43_0 = null;

        EObject lv_elseBlock_45_0 = null;

        EObject this_IdRef_47 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2856:28: ( (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2857:1: (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2857:1: (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef )
            int alt61=16;
            alt61 = dfa61.predict(input);
            switch (alt61) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2858:5: this_IfExp_0= ruleIfExp
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIfExpParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfExp_in_rulePrimaryExpression6234);
                    this_IfExp_0=ruleIfExp();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfExp_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2868:5: this_Parenthetical_1= ruleParenthetical
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParentheticalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthetical_in_rulePrimaryExpression6261);
                    this_Parenthetical_1=ruleParenthetical();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Parenthetical_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2878:5: this_Literal_2= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression6288);
                    this_Literal_2=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2887:6: ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2887:6: ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2887:7: ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getRangeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRange_in_rulePrimaryExpression6344);
                    this_Range_3=ruleRange();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Range_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2902:6: ( ( RULE_LBRACKET )=>this_Array_4= ruleArray )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2902:6: ( ( RULE_LBRACKET )=>this_Array_4= ruleArray )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2902:7: ( RULE_LBRACKET )=>this_Array_4= ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArrayParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArray_in_rulePrimaryExpression6378);
                    this_Array_4=ruleArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Array_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2912:6: ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2912:6: ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2912:7: ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getDictionaryParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionary_in_rulePrimaryExpression6412);
                    this_Dictionary_5=ruleDictionary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Dictionary_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2923:5: this_Lambda_6= ruleLambda
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLambdaParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLambda_in_rulePrimaryExpression6440);
                    this_Lambda_6=ruleLambda();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Lambda_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2933:5: this_ThisProperty_7= ruleThisProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getThisPropertyParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleThisProperty_in_rulePrimaryExpression6467);
                    this_ThisProperty_7=ruleThisProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ThisProperty_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2942:6: ( () this_THIS_9= RULE_THIS )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2942:6: ( () this_THIS_9= RULE_THIS )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2942:7: () this_THIS_9= RULE_THIS
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2942:7: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2943:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getThisAloneAction_8_0(),
                                  current);
                          
                    }

                    }

                    this_THIS_9=(Token)match(input,RULE_THIS,FOLLOW_RULE_THIS_in_rulePrimaryExpression6493); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_THIS_9, grammarAccess.getPrimaryExpressionAccess().getTHISTerminalRuleCall_8_1()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2953:6: ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2953:6: ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2953:7: () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2953:7: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2954:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getForAction_9_0(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2959:2: (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2959:3: this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) )
                    {
                    this_FOR_11=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_rulePrimaryExpression6521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOR_11, grammarAccess.getPrimaryExpressionAccess().getFORTerminalRuleCall_9_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2963:1: ( (lv_loop_12_0= ruleForBody ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2964:1: (lv_loop_12_0= ruleForBody )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2964:1: (lv_loop_12_0= ruleForBody )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2965:3: lv_loop_12_0= ruleForBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLoopForBodyParserRuleCall_9_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForBody_in_rulePrimaryExpression6541);
                    lv_loop_12_0=ruleForBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"loop",
                              		lv_loop_12_0, 
                              		"ForBody");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2981:2: ( (lv_body_13_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2982:1: (lv_body_13_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2982:1: (lv_body_13_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2983:3: lv_body_13_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_9_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6562);
                    lv_body_13_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_13_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3000:6: ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3000:6: ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3000:7: () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3000:7: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3001:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getWhileAction_10_0(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3006:2: (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3006:3: this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) )
                    {
                    this_WHILE_15=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_rulePrimaryExpression6592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_15, grammarAccess.getPrimaryExpressionAccess().getWHILETerminalRuleCall_10_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3010:1: ( (lv_loop_16_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3011:1: (lv_loop_16_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3011:1: (lv_loop_16_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3012:3: lv_loop_16_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLoopExpressionParserRuleCall_10_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression6612);
                    lv_loop_16_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"loop",
                              		lv_loop_16_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3028:2: (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_WHEN) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3028:3: this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) )
                            {
                            this_WHEN_17=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_rulePrimaryExpression6624); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_17, grammarAccess.getPrimaryExpressionAccess().getWHENTerminalRuleCall_10_1_2_0()); 
                                  
                            }
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3032:1: ( (lv_when_18_0= ruleExpression ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3033:1: (lv_when_18_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3033:1: (lv_when_18_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3034:3: lv_when_18_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getWhenExpressionParserRuleCall_10_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression6644);
                            lv_when_18_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"when",
                                      		lv_when_18_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3050:4: ( (lv_body_19_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3051:1: (lv_body_19_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3051:1: (lv_body_19_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3052:3: lv_body_19_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_10_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6667);
                    lv_body_19_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_19_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3069:6: ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3069:6: ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3069:7: () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3069:7: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3070:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getUntilAction_11_0(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3075:2: (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3075:3: this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) )
                    {
                    this_UNTIL_21=(Token)match(input,RULE_UNTIL,FOLLOW_RULE_UNTIL_in_rulePrimaryExpression6697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNTIL_21, grammarAccess.getPrimaryExpressionAccess().getUNTILTerminalRuleCall_11_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3079:1: ( (lv_loop_22_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3080:1: (lv_loop_22_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3080:1: (lv_loop_22_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3081:3: lv_loop_22_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLoopExpressionParserRuleCall_11_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression6717);
                    lv_loop_22_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"loop",
                              		lv_loop_22_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3097:2: (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_WHEN) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3097:3: this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) )
                            {
                            this_WHEN_23=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_rulePrimaryExpression6729); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_23, grammarAccess.getPrimaryExpressionAccess().getWHENTerminalRuleCall_11_1_2_0()); 
                                  
                            }
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3101:1: ( (lv_when_24_0= ruleExpression ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3102:1: (lv_when_24_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3102:1: (lv_when_24_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3103:3: lv_when_24_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getWhenExpressionParserRuleCall_11_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression6749);
                            lv_when_24_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"when",
                                      		lv_when_24_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3119:4: ( (lv_body_25_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3120:1: (lv_body_25_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3120:1: (lv_body_25_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3121:3: lv_body_25_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_11_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6772);
                    lv_body_25_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_25_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3138:6: ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3138:6: ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3138:7: () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3138:7: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3139:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLoopAction_12_0(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3144:2: (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3144:3: this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) )
                    {
                    this_LOOP_27=(Token)match(input,RULE_LOOP,FOLLOW_RULE_LOOP_in_rulePrimaryExpression6802); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LOOP_27, grammarAccess.getPrimaryExpressionAccess().getLOOPTerminalRuleCall_12_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3148:1: ( (lv_body_28_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3149:1: (lv_body_28_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3149:1: (lv_body_28_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3150:3: lv_body_28_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_12_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6822);
                    lv_body_28_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_28_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3167:6: ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3167:6: ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3167:7: () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3167:7: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3168:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getTryCatchAction_13_0(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3173:2: (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3173:3: this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )?
                    {
                    this_TRY_30=(Token)match(input,RULE_TRY,FOLLOW_RULE_TRY_in_rulePrimaryExpression6852); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TRY_30, grammarAccess.getPrimaryExpressionAccess().getTRYTerminalRuleCall_13_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3177:1: ( (lv_body_31_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3178:1: (lv_body_31_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3178:1: (lv_body_31_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3179:3: lv_body_31_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_13_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6872);
                    lv_body_31_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"body",
                              		lv_body_31_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3195:2: ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )?
                    int alt57=3;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_CATCH) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==RULE_FINALLY) ) {
                        alt57=2;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3195:3: (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3195:3: (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3195:4: this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )?
                            {
                            this_CATCH_32=(Token)match(input,RULE_CATCH,FOLLOW_RULE_CATCH_in_rulePrimaryExpression6885); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_CATCH_32, grammarAccess.getPrimaryExpressionAccess().getCATCHTerminalRuleCall_13_1_2_0_0()); 
                                  
                            }
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3199:1: ( (lv_exception_33_0= ruleId ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3200:1: (lv_exception_33_0= ruleId )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3200:1: (lv_exception_33_0= ruleId )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3201:3: lv_exception_33_0= ruleId
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExceptionIdParserRuleCall_13_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleId_in_rulePrimaryExpression6905);
                            lv_exception_33_0=ruleId();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exception",
                                      		lv_exception_33_0, 
                                      		"Id");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3217:2: ( (lv_catchBlock_34_0= ruleBlock ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3218:1: (lv_catchBlock_34_0= ruleBlock )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3218:1: (lv_catchBlock_34_0= ruleBlock )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3219:3: lv_catchBlock_34_0= ruleBlock
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCatchBlockBlockParserRuleCall_13_1_2_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6926);
                            lv_catchBlock_34_0=ruleBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"catchBlock",
                                      		lv_catchBlock_34_0, 
                                      		"Block");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3235:2: (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )?
                            int alt56=2;
                            int LA56_0 = input.LA(1);

                            if ( (LA56_0==RULE_FINALLY) ) {
                                alt56=1;
                            }
                            switch (alt56) {
                                case 1 :
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3235:3: this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) )
                                    {
                                    this_FINALLY_35=(Token)match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_rulePrimaryExpression6938); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_FINALLY_35, grammarAccess.getPrimaryExpressionAccess().getFINALLYTerminalRuleCall_13_1_2_0_3_0()); 
                                          
                                    }
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3239:1: ( (lv_finallyBlock_36_0= ruleBlock ) )
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3240:1: (lv_finallyBlock_36_0= ruleBlock )
                                    {
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3240:1: (lv_finallyBlock_36_0= ruleBlock )
                                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3241:3: lv_finallyBlock_36_0= ruleBlock
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFinallyBlockBlockParserRuleCall_13_1_2_0_3_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6958);
                                    lv_finallyBlock_36_0=ruleBlock();

                                    state._fsp--;
                                    if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                                      	        }
                                             		set(
                                             			current, 
                                             			"finallyBlock",
                                              		lv_finallyBlock_36_0, 
                                              		"Block");
                                      	        afterParserOrEnumRuleCall();
                                      	    
                                    }

                                    }


                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3258:6: (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3258:6: (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3258:7: this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) )
                            {
                            this_FINALLY_37=(Token)match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_rulePrimaryExpression6979); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FINALLY_37, grammarAccess.getPrimaryExpressionAccess().getFINALLYTerminalRuleCall_13_1_2_1_0()); 
                                  
                            }
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3262:1: ( (lv_finallyBlock_38_0= ruleBlock ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3263:1: (lv_finallyBlock_38_0= ruleBlock )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3263:1: (lv_finallyBlock_38_0= ruleBlock )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3264:3: lv_finallyBlock_38_0= ruleBlock
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFinallyBlockBlockParserRuleCall_13_1_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6999);
                            lv_finallyBlock_38_0=ruleBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyBlock",
                                      		lv_finallyBlock_38_0, 
                                      		"Block");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 15 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3281:6: ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3281:6: ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3281:7: () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3281:7: ()
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3282:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSwitchAction_14_0(),
                                  current);
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3287:2: (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3287:3: this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT
                    {
                    this_SWITCH_40=(Token)match(input,RULE_SWITCH,FOLLOW_RULE_SWITCH_in_rulePrimaryExpression7032); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SWITCH_40, grammarAccess.getPrimaryExpressionAccess().getSWITCHTerminalRuleCall_14_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3291:1: ( (lv_exp_41_0= ruleExpression ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_STRING||(LA58_0>=RULE_FOR && LA58_0<=RULE_WHILE)||LA58_0==RULE_UNTIL||LA58_0==RULE_LBRACKET||(LA58_0>=RULE_PLUS && LA58_0<=RULE_MINUS)||(LA58_0>=RULE_UNARY && LA58_0<=RULE_MINUS_MINUS)||LA58_0==RULE_SUPER||LA58_0==RULE_AT_SIGIL||(LA58_0>=RULE_THIS && LA58_0<=RULE_TRY)||LA58_0==RULE_SWITCH||(LA58_0>=RULE_IF && LA58_0<=RULE_LCURLY)||LA58_0==RULE_PARAM_START||(LA58_0>=RULE_FUNC_ARROW && LA58_0<=RULE_LPAREN)) ) {
                        alt58=1;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3292:1: (lv_exp_41_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3292:1: (lv_exp_41_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3293:3: lv_exp_41_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpExpressionParserRuleCall_14_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression7052);
                            lv_exp_41_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exp",
                                      		lv_exp_41_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    this_INDENT_42=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_rulePrimaryExpression7064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_42, grammarAccess.getPrimaryExpressionAccess().getINDENTTerminalRuleCall_14_1_2()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3313:1: ( (lv_cases_43_0= ruleCase ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_LEADING_WHEN) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3314:1: (lv_cases_43_0= ruleCase )
                    	    {
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3314:1: (lv_cases_43_0= ruleCase )
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3315:3: lv_cases_43_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_14_1_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression7084);
                    	    lv_cases_43_0=ruleCase();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"cases",
                    	              		lv_cases_43_0, 
                    	              		"Case");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3331:3: (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_ELSE) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3331:4: this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) )
                            {
                            this_ELSE_44=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_rulePrimaryExpression7097); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ELSE_44, grammarAccess.getPrimaryExpressionAccess().getELSETerminalRuleCall_14_1_4_0()); 
                                  
                            }
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3335:1: ( (lv_elseBlock_45_0= ruleBlock ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3336:1: (lv_elseBlock_45_0= ruleBlock )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3336:1: (lv_elseBlock_45_0= ruleBlock )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3337:3: lv_elseBlock_45_0= ruleBlock
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseBlockBlockParserRuleCall_14_1_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression7117);
                            lv_elseBlock_45_0=ruleBlock();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"elseBlock",
                                      		lv_elseBlock_45_0, 
                                      		"Block");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    this_OUTDENT_46=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_rulePrimaryExpression7130); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OUTDENT_46, grammarAccess.getPrimaryExpressionAccess().getOUTDENTTerminalRuleCall_14_1_5()); 
                          
                    }

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3359:5: this_IdRef_47= ruleIdRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIdRefParserRuleCall_15()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdRef_in_rulePrimaryExpression7159);
                    this_IdRef_47=ruleIdRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdRef_47; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleBlock"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3375:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3376:2: (iv_ruleBlock= ruleBlock EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3377:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock7194);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock7204); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3384:1: ruleBlock returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token this_OUTDENT_3=null;
        EObject this_Body_2 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3387:28: ( ( () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3388:1: ( () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3388:1: ( () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3388:2: () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3388:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3389:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleBlock7249); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INDENT_1, grammarAccess.getBlockAccess().getINDENTTerminalRuleCall_1()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3398:1: (this_Body_2= ruleBody )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( ((LA62_0>=RULE_STATEMENT && LA62_0<=RULE_HERECOMMENT)||LA62_0==RULE_STRING||LA62_0==RULE_RETURN||(LA62_0>=RULE_THROW && LA62_0<=RULE_CLASS)||(LA62_0>=RULE_FOR && LA62_0<=RULE_WHILE)||LA62_0==RULE_UNTIL||LA62_0==RULE_LBRACKET||(LA62_0>=RULE_PLUS && LA62_0<=RULE_MINUS)||(LA62_0>=RULE_UNARY && LA62_0<=RULE_MINUS_MINUS)||LA62_0==RULE_SUPER||LA62_0==RULE_AT_SIGIL||(LA62_0>=RULE_THIS && LA62_0<=RULE_TRY)||LA62_0==RULE_SWITCH||(LA62_0>=RULE_IF && LA62_0<=RULE_LCURLY)||LA62_0==RULE_PARAM_START||(LA62_0>=RULE_FUNC_ARROW && LA62_0<=RULE_LPAREN)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3399:5: this_Body_2= ruleBody
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockAccess().getBodyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBody_in_ruleBlock7271);
                    this_Body_2=ruleBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Body_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            this_OUTDENT_3=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleBlock7283); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_OUTDENT_3, grammarAccess.getBlockAccess().getOUTDENTTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleCase"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3419:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3420:2: (iv_ruleCase= ruleCase EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3421:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase7318);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase7328); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCase"


    // $ANTLR start "ruleCase"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3428:1: ruleCase returns [EObject current=null] : (this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )? ) ;
    public final EObject ruleCase() throws RecognitionException {
        EObject current = null;

        Token this_LEADING_WHEN_0=null;
        Token this_COMMA_2=null;
        Token this_TERMINATOR_5=null;
        EObject lv_whens_1_0 = null;

        EObject lv_whens_3_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3431:28: ( (this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3432:1: (this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3432:1: (this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3432:2: this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )?
            {
            this_LEADING_WHEN_0=(Token)match(input,RULE_LEADING_WHEN,FOLLOW_RULE_LEADING_WHEN_in_ruleCase7364); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEADING_WHEN_0, grammarAccess.getCaseAccess().getLEADING_WHENTerminalRuleCall_0()); 
                  
            }
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3436:1: ( (lv_whens_1_0= ruleExpression ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3437:1: (lv_whens_1_0= ruleExpression )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3437:1: (lv_whens_1_0= ruleExpression )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3438:3: lv_whens_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhensExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCase7384);
            lv_whens_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		add(
                     			current, 
                     			"whens",
                      		lv_whens_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3454:2: (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_COMMA) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3454:3: this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCase7396); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getCaseAccess().getCOMMATerminalRuleCall_2_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3458:1: ( (lv_whens_3_0= ruleExpression ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3459:1: (lv_whens_3_0= ruleExpression )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3459:1: (lv_whens_3_0= ruleExpression )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3460:3: lv_whens_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCaseAccess().getWhensExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleCase7416);
            	    lv_whens_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCaseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"whens",
            	              		lv_whens_3_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3476:4: ( (lv_then_4_0= ruleBlock ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3477:1: (lv_then_4_0= ruleBlock )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3477:1: (lv_then_4_0= ruleBlock )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3478:3: lv_then_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleCase7439);
            lv_then_4_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCaseRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3494:2: (this_TERMINATOR_5= RULE_TERMINATOR )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_TERMINATOR) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3494:3: this_TERMINATOR_5= RULE_TERMINATOR
                    {
                    this_TERMINATOR_5=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleCase7451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TERMINATOR_5, grammarAccess.getCaseAccess().getTERMINATORTerminalRuleCall_4()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCase"


    // $ANTLR start "entryRuleIfExp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3506:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3507:2: (iv_ruleIfExp= ruleIfExp EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3508:2: iv_ruleIfExp= ruleIfExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpRule()); 
            }
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp7488);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp7498); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfExp"


    // $ANTLR start "ruleIfExp"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3515:1: ruleIfExp returns [EObject current=null] : ( ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token this_ELSE_1=null;
        Token this_ELSE_3=null;
        EObject lv_blocks_0_0 = null;

        EObject lv_blocks_2_0 = null;

        EObject lv_defaultBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3518:28: ( ( ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3519:1: ( ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3519:1: ( ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3519:2: ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3519:2: ( (lv_blocks_0_0= ruleCondBlock ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3520:1: (lv_blocks_0_0= ruleCondBlock )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3520:1: (lv_blocks_0_0= ruleCondBlock )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3521:3: lv_blocks_0_0= ruleCondBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp7544);
            lv_blocks_0_0=ruleCondBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfExpRule());
              	        }
                     		add(
                     			current, 
                     			"blocks",
                      		lv_blocks_0_0, 
                      		"CondBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3537:2: (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_ELSE) ) {
                    int LA65_1 = input.LA(2);

                    if ( (LA65_1==RULE_IF) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3537:3: this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) )
            	    {
            	    this_ELSE_1=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_ruleIfExp7556); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ELSE_1, grammarAccess.getIfExpAccess().getELSETerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3541:1: ( (lv_blocks_2_0= ruleCondBlock ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3542:1: (lv_blocks_2_0= ruleCondBlock )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3542:1: (lv_blocks_2_0= ruleCondBlock )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3543:3: lv_blocks_2_0= ruleCondBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp7576);
            	    lv_blocks_2_0=ruleCondBlock();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIfExpRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"blocks",
            	              		lv_blocks_2_0, 
            	              		"CondBlock");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3559:4: (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ELSE) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3559:5: this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) )
                    {
                    this_ELSE_3=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_ruleIfExp7590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ELSE_3, grammarAccess.getIfExpAccess().getELSETerminalRuleCall_2_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3563:1: ( (lv_defaultBlock_4_0= ruleBlock ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3564:1: (lv_defaultBlock_4_0= ruleBlock )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3564:1: (lv_defaultBlock_4_0= ruleBlock )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3565:3: lv_defaultBlock_4_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleIfExp7610);
                    lv_defaultBlock_4_0=ruleBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfExpRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultBlock",
                              		lv_defaultBlock_4_0, 
                              		"Block");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfExp"


    // $ANTLR start "entryRuleCondBlock"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3589:1: entryRuleCondBlock returns [EObject current=null] : iv_ruleCondBlock= ruleCondBlock EOF ;
    public final EObject entryRuleCondBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondBlock = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3590:2: (iv_ruleCondBlock= ruleCondBlock EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3591:2: iv_ruleCondBlock= ruleCondBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondBlockRule()); 
            }
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock7648);
            iv_ruleCondBlock=ruleCondBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock7658); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondBlock"


    // $ANTLR start "ruleCondBlock"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3598:1: ruleCondBlock returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) ;
    public final EObject ruleCondBlock() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3601:28: ( ( ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3602:1: ( ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3602:1: ( ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3602:2: ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3602:2: ( (lv_operator_0_0= RULE_IF ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3603:1: (lv_operator_0_0= RULE_IF )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3603:1: (lv_operator_0_0= RULE_IF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3604:3: lv_operator_0_0= RULE_IF
            {
            lv_operator_0_0=(Token)match(input,RULE_IF,FOLLOW_RULE_IF_in_ruleCondBlock7700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_operator_0_0, grammarAccess.getCondBlockAccess().getOperatorIFTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCondBlockRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"IF");
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3620:2: ( (lv_condition_1_0= ruleExpression ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3621:1: (lv_condition_1_0= ruleExpression )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3621:1: (lv_condition_1_0= ruleExpression )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3622:3: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCondBlockAccess().getConditionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCondBlock7726);
            lv_condition_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCondBlockRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3638:2: ( (lv_action_2_0= ruleBlock ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3639:1: (lv_action_2_0= ruleBlock )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3639:1: (lv_action_2_0= ruleBlock )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3640:3: lv_action_2_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleCondBlock7747);
            lv_action_2_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCondBlockRule());
              	        }
                     		set(
                     			current, 
                     			"action",
                      		lv_action_2_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondBlock"


    // $ANTLR start "entryRuleIdRef"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3664:1: entryRuleIdRef returns [EObject current=null] : iv_ruleIdRef= ruleIdRef EOF ;
    public final EObject entryRuleIdRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdRef = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3665:2: (iv_ruleIdRef= ruleIdRef EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3666:2: iv_ruleIdRef= ruleIdRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdRefRule()); 
            }
            pushFollow(FOLLOW_ruleIdRef_in_entryRuleIdRef7783);
            iv_ruleIdRef=ruleIdRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdRef7793); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdRef"


    // $ANTLR start "ruleIdRef"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3673:1: ruleIdRef returns [EObject current=null] : ( (otherlv_0= RULE_IDENTIFIER ) ) ;
    public final EObject ruleIdRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3676:28: ( ( (otherlv_0= RULE_IDENTIFIER ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3677:1: ( (otherlv_0= RULE_IDENTIFIER ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3677:1: ( (otherlv_0= RULE_IDENTIFIER ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3678:1: (otherlv_0= RULE_IDENTIFIER )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3678:1: (otherlv_0= RULE_IDENTIFIER )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3679:3: otherlv_0= RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleIdRef7837); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getIdRefAccess().getValIdCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdRef"


    // $ANTLR start "entryRuleId"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3698:1: entryRuleId returns [EObject current=null] : iv_ruleId= ruleId EOF ;
    public final EObject entryRuleId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleId = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3699:2: (iv_ruleId= ruleId EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3700:2: iv_ruleId= ruleId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdRule()); 
            }
            pushFollow(FOLLOW_ruleId_in_entryRuleId7872);
            iv_ruleId=ruleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleId7882); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleId"


    // $ANTLR start "ruleId"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3707:1: ruleId returns [EObject current=null] : ( (lv_name_0_0= RULE_IDENTIFIER ) ) ;
    public final EObject ruleId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3710:28: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3711:1: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3711:1: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3712:1: (lv_name_0_0= RULE_IDENTIFIER )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3712:1: (lv_name_0_0= RULE_IDENTIFIER )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3713:3: lv_name_0_0= RULE_IDENTIFIER
            {
            lv_name_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleId7923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getIdAccess().getNameIDENTIFIERTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIdRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"IDENTIFIER");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleId"


    // $ANTLR start "entryRuleProperty"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3737:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3738:2: (iv_ruleProperty= ruleProperty EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3739:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty7963);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty7973); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3746:1: ruleProperty returns [EObject current=null] : ( ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) ) | ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_accessor_1_1=null;
        Token lv_accessor_1_2=null;
        Token lv_accessor_1_3=null;
        Token this_INDEX_START_4=null;
        Token this_INDEX_END_6=null;
        EObject this_IdRef_0 = null;

        EObject lv_prop_2_0 = null;

        EObject this_IdRef_3 = null;

        EObject lv_index_5_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3749:28: ( ( ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) ) | ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:1: ( ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) ) | ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:1: ( ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) ) | ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_IDENTIFIER) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==RULE_INDEX_START) && (synpred30_InternalCoffeeScript())) {
                    alt68=2;
                }
                else if ( (LA68_1==RULE_DOT) && (synpred29_InternalCoffeeScript())) {
                    alt68=1;
                }
                else if ( (LA68_1==RULE_DOUBLE_COLON) && (synpred29_InternalCoffeeScript())) {
                    alt68=1;
                }
                else if ( (LA68_1==RULE_QUESTION_DOT) && (synpred29_InternalCoffeeScript())) {
                    alt68=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:2: ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:2: ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:3: ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:3: ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:4: ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3762:6: (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3763:5: this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getIdRefParserRuleCall_0_0_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdRef_in_ruleProperty8065);
                    this_IdRef_0=ruleIdRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3771:1: ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3772:1: ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3772:1: ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3773:1: (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3773:1: (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT )
                    int alt67=3;
                    switch ( input.LA(1) ) {
                    case RULE_DOT:
                        {
                        alt67=1;
                        }
                        break;
                    case RULE_DOUBLE_COLON:
                        {
                        alt67=2;
                        }
                        break;
                    case RULE_QUESTION_DOT:
                        {
                        alt67=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }

                    switch (alt67) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3774:3: lv_accessor_1_1= RULE_DOT
                            {
                            lv_accessor_1_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleProperty8083); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_accessor_1_1, grammarAccess.getPropertyAccess().getAccessorDOTTerminalRuleCall_0_0_0_1_0_0()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPropertyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"accessor",
                                      		lv_accessor_1_1, 
                                      		"DOT");
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3789:8: lv_accessor_1_2= RULE_DOUBLE_COLON
                            {
                            lv_accessor_1_2=(Token)match(input,RULE_DOUBLE_COLON,FOLLOW_RULE_DOUBLE_COLON_in_ruleProperty8103); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_accessor_1_2, grammarAccess.getPropertyAccess().getAccessorDOUBLE_COLONTerminalRuleCall_0_0_0_1_0_1()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPropertyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"accessor",
                                      		lv_accessor_1_2, 
                                      		"DOUBLE_COLON");
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3804:8: lv_accessor_1_3= RULE_QUESTION_DOT
                            {
                            lv_accessor_1_3=(Token)match(input,RULE_QUESTION_DOT,FOLLOW_RULE_QUESTION_DOT_in_ruleProperty8123); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              			newLeafNode(lv_accessor_1_3, grammarAccess.getPropertyAccess().getAccessorQUESTION_DOTTerminalRuleCall_0_0_0_1_0_2()); 
                              		
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getPropertyRule());
                              	        }
                                     		setWithLastConsumed(
                                     			current, 
                                     			"accessor",
                                      		lv_accessor_1_3, 
                                      		"QUESTION_DOT");
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3822:4: ( (lv_prop_2_0= ruleId ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3823:1: (lv_prop_2_0= ruleId )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3823:1: (lv_prop_2_0= ruleId )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3824:3: lv_prop_2_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getPropIdParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleProperty8154);
                    lv_prop_2_0=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"prop",
                              		lv_prop_2_0, 
                              		"Id");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:6: ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:6: ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:7: ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:7: ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:8: ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:41: (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3842:5: this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getIdRefParserRuleCall_1_0_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdRef_in_ruleProperty8195);
                    this_IdRef_3=ruleIdRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdRef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_INDEX_START_4=(Token)match(input,RULE_INDEX_START,FOLLOW_RULE_INDEX_START_in_ruleProperty8205); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDEX_START_4, grammarAccess.getPropertyAccess().getINDEX_STARTTerminalRuleCall_1_0_0_1()); 
                          
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3854:3: ( (lv_index_5_0= ruleIndex ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3855:1: (lv_index_5_0= ruleIndex )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3855:1: (lv_index_5_0= ruleIndex )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3856:3: lv_index_5_0= ruleIndex
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getIndexIndexParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIndex_in_ruleProperty8227);
                    lv_index_5_0=ruleIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPropertyRule());
                      	        }
                             		set(
                             			current, 
                             			"index",
                              		lv_index_5_0, 
                              		"Index");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_INDEX_END_6=(Token)match(input,RULE_INDEX_END,FOLLOW_RULE_INDEX_END_in_ruleProperty8238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDEX_END_6, grammarAccess.getPropertyAccess().getINDEX_ENDTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleVariable"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3884:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3885:2: (iv_ruleVariable= ruleVariable EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3886:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable8274);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable8284); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3893:1: ruleVariable returns [EObject current=null] : (this_Id_0= ruleId | ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* ) | this_Property_7= ruleProperty ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token this_AT_SIGIL_1=null;
        Token this_THIS_2=null;
        Token this_DOT_3=null;
        Token this_DOT_5=null;
        EObject this_Id_0 = null;

        EObject this_Id_4 = null;

        EObject lv_props_6_0 = null;

        EObject this_Property_7 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3896:28: ( (this_Id_0= ruleId | ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* ) | this_Property_7= ruleProperty ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3897:1: (this_Id_0= ruleId | ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* ) | this_Property_7= ruleProperty )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3897:1: (this_Id_0= ruleId | ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* ) | this_Property_7= ruleProperty )
            int alt71=3;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_IDENTIFIER) ) {
                int LA71_1 = input.LA(2);

                if ( ((LA71_1>=RULE_DOT && LA71_1<=RULE_INDEX_START)) ) {
                    alt71=3;
                }
                else if ( (LA71_1==EOF||LA71_1==RULE_TERMINATOR||LA71_1==RULE_EQUAL||LA71_1==RULE_CALL_END||LA71_1==RULE_POST_IF||(LA71_1>=RULE_FOR && LA71_1<=RULE_UNTIL)||LA71_1==RULE_COMMA||LA71_1==RULE_BY||(LA71_1>=RULE_DOT_DOT && LA71_1<=RULE_MATH)||LA71_1==RULE_INDEX_END||LA71_1==RULE_RCURLY||LA71_1==RULE_PARAM_END||LA71_1==RULE_RPAREN) ) {
                    alt71=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA71_0==RULE_AT_SIGIL||LA71_0==RULE_THIS) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3898:5: this_Id_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getIdParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleVariable8331);
                    this_Id_0=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Id_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3907:6: ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3907:6: ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3907:7: (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )*
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3907:7: (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_AT_SIGIL) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==RULE_THIS) ) {
                        alt69=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3907:8: this_AT_SIGIL_1= RULE_AT_SIGIL
                            {
                            this_AT_SIGIL_1=(Token)match(input,RULE_AT_SIGIL,FOLLOW_RULE_AT_SIGIL_in_ruleVariable8349); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_AT_SIGIL_1, grammarAccess.getVariableAccess().getAT_SIGILTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3912:6: (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3912:6: (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3912:7: this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT
                            {
                            this_THIS_2=(Token)match(input,RULE_THIS,FOLLOW_RULE_THIS_in_ruleVariable8366); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_THIS_2, grammarAccess.getVariableAccess().getTHISTerminalRuleCall_1_0_1_0()); 
                                  
                            }
                            this_DOT_3=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariable8376); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_DOT_3, grammarAccess.getVariableAccess().getDOTTerminalRuleCall_1_0_1_1()); 
                                  
                            }

                            }


                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getIdParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleVariable8399);
                    this_Id_4=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Id_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3929:1: (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==RULE_DOT) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3929:2: this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) )
                    	    {
                    	    this_DOT_5=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariable8410); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_DOT_5, grammarAccess.getVariableAccess().getDOTTerminalRuleCall_1_2_0()); 
                    	          
                    	    }
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3933:1: ( (lv_props_6_0= ruleId ) )
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3934:1: (lv_props_6_0= ruleId )
                    	    {
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3934:1: (lv_props_6_0= ruleId )
                    	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3935:3: lv_props_6_0= ruleId
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getVariableAccess().getPropsIdParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleId_in_ruleVariable8430);
                    	    lv_props_6_0=ruleId();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getVariableRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"props",
                    	              		lv_props_6_0, 
                    	              		"Id");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3953:5: this_Property_7= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getPropertyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleVariable8461);
                    this_Property_7=ruleProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Property_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleAssignableArray"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3969:1: entryRuleAssignableArray returns [EObject current=null] : iv_ruleAssignableArray= ruleAssignableArray EOF ;
    public final EObject entryRuleAssignableArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableArray = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3970:2: (iv_ruleAssignableArray= ruleAssignableArray EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3971:2: iv_ruleAssignableArray= ruleAssignableArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignableArrayRule()); 
            }
            pushFollow(FOLLOW_ruleAssignableArray_in_entryRuleAssignableArray8496);
            iv_ruleAssignableArray=ruleAssignableArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignableArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignableArray8506); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignableArray"


    // $ANTLR start "ruleAssignableArray"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3978:1: ruleAssignableArray returns [EObject current=null] : ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET ) ;
    public final EObject ruleAssignableArray() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_0=null;
        Token this_RBRACKET_2=null;
        EObject this_AssignableArgList_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3981:28: ( ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3982:1: ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3982:1: ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3982:2: ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3982:2: ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3982:3: ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET
            {
            this_LBRACKET_0=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleAssignableArray8548); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LBRACKET_0, grammarAccess.getAssignableArrayAccess().getLBRACKETTerminalRuleCall_0()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignableArrayAccess().getAssignableArgListParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignableArgList_in_ruleAssignableArray8570);
            this_AssignableArgList_1=ruleAssignableArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AssignableArgList_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_RBRACKET_2=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleAssignableArray8580); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RBRACKET_2, grammarAccess.getAssignableArrayAccess().getRBRACKETTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignableArray"


    // $ANTLR start "entryRuleAssignableArgList"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4007:1: entryRuleAssignableArgList returns [EObject current=null] : iv_ruleAssignableArgList= ruleAssignableArgList EOF ;
    public final EObject entryRuleAssignableArgList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableArgList = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4008:2: (iv_ruleAssignableArgList= ruleAssignableArgList EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4009:2: iv_ruleAssignableArgList= ruleAssignableArgList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignableArgListRule()); 
            }
            pushFollow(FOLLOW_ruleAssignableArgList_in_entryRuleAssignableArgList8615);
            iv_ruleAssignableArgList=ruleAssignableArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignableArgList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignableArgList8625); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignableArgList"


    // $ANTLR start "ruleAssignableArgList"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4016:1: ruleAssignableArgList returns [EObject current=null] : ( ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )* ) ;
    public final EObject ruleAssignableArgList() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4019:28: ( ( ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4020:1: ( ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4020:1: ( ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4020:2: ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )*
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4020:2: ( (lv_args_0_0= ruleAssignableArg ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4021:1: (lv_args_0_0= ruleAssignableArg )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4021:1: (lv_args_0_0= ruleAssignableArg )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4022:3: lv_args_0_0= ruleAssignableArg
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignableArgListAccess().getArgsAssignableArgParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignableArg_in_ruleAssignableArgList8671);
            lv_args_0_0=ruleAssignableArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignableArgListRule());
              	        }
                     		add(
                     			current, 
                     			"args",
                      		lv_args_0_0, 
                      		"AssignableArg");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4038:2: (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==RULE_COMMA) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4038:3: this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleAssignableArgList8683); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getAssignableArgListAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4042:1: ( (lv_args_2_0= ruleAssignableArg ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4043:1: (lv_args_2_0= ruleAssignableArg )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4043:1: (lv_args_2_0= ruleAssignableArg )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4044:3: lv_args_2_0= ruleAssignableArg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignableArgListAccess().getArgsAssignableArgParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignableArg_in_ruleAssignableArgList8703);
            	    lv_args_2_0=ruleAssignableArg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssignableArgListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"args",
            	              		lv_args_2_0, 
            	              		"AssignableArg");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignableArgList"


    // $ANTLR start "entryRuleAssignableArg"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4068:1: entryRuleAssignableArg returns [EObject current=null] : iv_ruleAssignableArg= ruleAssignableArg EOF ;
    public final EObject entryRuleAssignableArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableArg = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4069:2: (iv_ruleAssignableArg= ruleAssignableArg EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4070:2: iv_ruleAssignableArg= ruleAssignableArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignableArgRule()); 
            }
            pushFollow(FOLLOW_ruleAssignableArg_in_entryRuleAssignableArg8741);
            iv_ruleAssignableArg=ruleAssignableArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignableArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignableArg8751); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignableArg"


    // $ANTLR start "ruleAssignableArg"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4077:1: ruleAssignableArg returns [EObject current=null] : ( ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? ) ;
    public final EObject ruleAssignableArg() throws RecognitionException {
        EObject current = null;

        Token lv_splat_1_0=null;
        EObject lv_arg_0_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4080:28: ( ( ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4081:1: ( ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4081:1: ( ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4081:2: ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4081:2: ( (lv_arg_0_0= ruleAssignable ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4082:1: (lv_arg_0_0= ruleAssignable )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4082:1: (lv_arg_0_0= ruleAssignable )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4083:3: lv_arg_0_0= ruleAssignable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignableArgAccess().getArgAssignableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignable_in_ruleAssignableArg8797);
            lv_arg_0_0=ruleAssignable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignableArgRule());
              	        }
                     		set(
                     			current, 
                     			"arg",
                      		lv_arg_0_0, 
                      		"Assignable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4099:2: ( (lv_splat_1_0= RULE_ELLIPSIS ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ELLIPSIS) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4100:1: (lv_splat_1_0= RULE_ELLIPSIS )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4100:1: (lv_splat_1_0= RULE_ELLIPSIS )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4101:3: lv_splat_1_0= RULE_ELLIPSIS
                    {
                    lv_splat_1_0=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleAssignableArg8814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_splat_1_0, grammarAccess.getAssignableArgAccess().getSplatELLIPSISTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAssignableArgRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"splat",
                              		true, 
                              		"ELLIPSIS");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignableArg"


    // $ANTLR start "entryRuleAssignable"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4125:1: entryRuleAssignable returns [EObject current=null] : iv_ruleAssignable= ruleAssignable EOF ;
    public final EObject entryRuleAssignable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignable = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4126:2: (iv_ruleAssignable= ruleAssignable EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4127:2: iv_ruleAssignable= ruleAssignable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignableRule()); 
            }
            pushFollow(FOLLOW_ruleAssignable_in_entryRuleAssignable8856);
            iv_ruleAssignable=ruleAssignable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignable8866); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignable"


    // $ANTLR start "ruleAssignable"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4134:1: ruleAssignable returns [EObject current=null] : (this_Variable_0= ruleVariable | ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary ) | ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray ) ) ;
    public final EObject ruleAssignable() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Dictionary_1 = null;

        EObject this_AssignableArray_2 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4137:28: ( (this_Variable_0= ruleVariable | ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary ) | ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4138:1: (this_Variable_0= ruleVariable | ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary ) | ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4138:1: (this_Variable_0= ruleVariable | ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary ) | ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray ) )
            int alt74=3;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_AT_SIGIL||LA74_0==RULE_THIS||LA74_0==RULE_IDENTIFIER) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_LCURLY) && (synpred32_InternalCoffeeScript())) {
                alt74=2;
            }
            else if ( (LA74_0==RULE_LBRACKET) && (synpred33_InternalCoffeeScript())) {
                alt74=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4139:5: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignableAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleAssignable8913);
                    this_Variable_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4148:6: ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4148:6: ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4148:7: ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignableAccess().getDictionaryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionary_in_ruleAssignable8946);
                    this_Dictionary_1=ruleDictionary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Dictionary_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4158:6: ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4158:6: ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4158:7: ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignableAccess().getAssignableArrayParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignableArray_in_ruleAssignable8980);
                    this_AssignableArray_2=ruleAssignableArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AssignableArray_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignable"


    // $ANTLR start "entryRuleArg"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4175:1: entryRuleArg returns [EObject current=null] : iv_ruleArg= ruleArg EOF ;
    public final EObject entryRuleArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4176:2: (iv_ruleArg= ruleArg EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4177:2: iv_ruleArg= ruleArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgRule()); 
            }
            pushFollow(FOLLOW_ruleArg_in_entryRuleArg9016);
            iv_ruleArg=ruleArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg9026); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArg"


    // $ANTLR start "ruleArg"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4184:1: ruleArg returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? ) ;
    public final EObject ruleArg() throws RecognitionException {
        EObject current = null;

        Token lv_splat_1_0=null;
        EObject lv_exp_0_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4187:28: ( ( ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4188:1: ( ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4188:1: ( ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4188:2: ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4188:2: ( (lv_exp_0_0= ruleExpression ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4189:1: (lv_exp_0_0= ruleExpression )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4189:1: (lv_exp_0_0= ruleExpression )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4190:3: lv_exp_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgAccess().getExpExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArg9072);
            lv_exp_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArgRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4206:2: ( (lv_splat_1_0= RULE_ELLIPSIS ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_ELLIPSIS) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4207:1: (lv_splat_1_0= RULE_ELLIPSIS )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4207:1: (lv_splat_1_0= RULE_ELLIPSIS )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4208:3: lv_splat_1_0= RULE_ELLIPSIS
                    {
                    lv_splat_1_0=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleArg9089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_splat_1_0, grammarAccess.getArgAccess().getSplatELLIPSISTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArgRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"splat",
                              		true, 
                              		"ELLIPSIS");
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArg"


    // $ANTLR start "entryRuleArgLine"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4232:1: entryRuleArgLine returns [EObject current=null] : iv_ruleArgLine= ruleArgLine EOF ;
    public final EObject entryRuleArgLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgLine = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4233:2: (iv_ruleArgLine= ruleArgLine EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4234:2: iv_ruleArgLine= ruleArgLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgLineRule()); 
            }
            pushFollow(FOLLOW_ruleArgLine_in_entryRuleArgLine9131);
            iv_ruleArgLine=ruleArgLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgLine9141); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgLine"


    // $ANTLR start "ruleArgLine"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4241:1: ruleArgLine returns [EObject current=null] : ( ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )? ) ;
    public final EObject ruleArgLine() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_COMMA_3=null;
        EObject lv_head_0_0 = null;

        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4244:28: ( ( ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4245:1: ( ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4245:1: ( ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4245:2: ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4245:2: ( (lv_head_0_0= ruleArg ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4246:1: (lv_head_0_0= ruleArg )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4246:1: (lv_head_0_0= ruleArg )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4247:3: lv_head_0_0= ruleArg
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgLineAccess().getHeadArgParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArg_in_ruleArgLine9187);
            lv_head_0_0=ruleArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArgLineRule());
              	        }
                     		set(
                     			current, 
                     			"head",
                      		lv_head_0_0, 
                      		"Arg");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4263:2: (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_COMMA) ) {
                    int LA76_1 = input.LA(2);

                    if ( (LA76_1==RULE_STRING||(LA76_1>=RULE_FOR && LA76_1<=RULE_WHILE)||LA76_1==RULE_UNTIL||LA76_1==RULE_LBRACKET||(LA76_1>=RULE_PLUS && LA76_1<=RULE_MINUS)||(LA76_1>=RULE_UNARY && LA76_1<=RULE_MINUS_MINUS)||LA76_1==RULE_SUPER||LA76_1==RULE_AT_SIGIL||(LA76_1>=RULE_THIS && LA76_1<=RULE_TRY)||LA76_1==RULE_SWITCH||(LA76_1>=RULE_IF && LA76_1<=RULE_LCURLY)||LA76_1==RULE_PARAM_START||(LA76_1>=RULE_FUNC_ARROW && LA76_1<=RULE_LPAREN)) ) {
                        alt76=1;
                    }


                }


                switch (alt76) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4263:3: this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleArgLine9199); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getArgLineAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4267:1: ( (lv_tail_2_0= ruleArg ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4268:1: (lv_tail_2_0= ruleArg )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4268:1: (lv_tail_2_0= ruleArg )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4269:3: lv_tail_2_0= ruleArg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgLineAccess().getTailArgParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArg_in_ruleArgLine9219);
            	    lv_tail_2_0=ruleArg();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArgLineRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tail",
            	              		lv_tail_2_0, 
            	              		"Arg");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4285:4: (this_COMMA_3= RULE_COMMA )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_COMMA) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4285:5: this_COMMA_3= RULE_COMMA
                    {
                    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleArgLine9233); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_3, grammarAccess.getArgLineAccess().getCOMMATerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgLine"


    // $ANTLR start "entryRuleExplicitArgList"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4297:1: entryRuleExplicitArgList returns [EObject current=null] : iv_ruleExplicitArgList= ruleExplicitArgList EOF ;
    public final EObject entryRuleExplicitArgList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitArgList = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4298:2: (iv_ruleExplicitArgList= ruleExplicitArgList EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4299:2: iv_ruleExplicitArgList= ruleExplicitArgList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExplicitArgListRule()); 
            }
            pushFollow(FOLLOW_ruleExplicitArgList_in_entryRuleExplicitArgList9270);
            iv_ruleExplicitArgList=ruleExplicitArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExplicitArgList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitArgList9280); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExplicitArgList"


    // $ANTLR start "ruleExplicitArgList"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4306:1: ruleExplicitArgList returns [EObject current=null] : ( ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* ) ;
    public final EObject ruleExplicitArgList() throws RecognitionException {
        EObject current = null;

        Token this_TERMINATOR_1=null;
        Token this_INDENT_3=null;
        Token this_OUTDENT_5=null;
        EObject lv_lines_0_0 = null;

        EObject lv_lines_2_0 = null;

        EObject lv_lines_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4309:28: ( ( ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4310:1: ( ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4310:1: ( ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4310:2: ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )*
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4310:2: ( (lv_lines_0_0= ruleArgLine ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4311:1: (lv_lines_0_0= ruleArgLine )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4311:1: (lv_lines_0_0= ruleArgLine )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4312:3: lv_lines_0_0= ruleArgLine
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExplicitArgListAccess().getLinesArgLineParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArgLine_in_ruleExplicitArgList9326);
            lv_lines_0_0=ruleArgLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExplicitArgListRule());
              	        }
                     		add(
                     			current, 
                     			"lines",
                      		lv_lines_0_0, 
                      		"ArgLine");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4328:2: ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )*
            loop78:
            do {
                int alt78=3;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_TERMINATOR) ) {
                    alt78=1;
                }
                else if ( (LA78_0==RULE_INDENT) ) {
                    alt78=2;
                }


                switch (alt78) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4328:3: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4328:3: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4328:4: this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) )
            	    {
            	    this_TERMINATOR_1=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleExplicitArgList9339); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TERMINATOR_1, grammarAccess.getExplicitArgListAccess().getTERMINATORTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4332:1: ( (lv_lines_2_0= ruleArgLine ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4333:1: (lv_lines_2_0= ruleArgLine )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4333:1: (lv_lines_2_0= ruleArgLine )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4334:3: lv_lines_2_0= ruleArgLine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExplicitArgListAccess().getLinesArgLineParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArgLine_in_ruleExplicitArgList9359);
            	    lv_lines_2_0=ruleArgLine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExplicitArgListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"lines",
            	              		lv_lines_2_0, 
            	              		"ArgLine");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4351:6: (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4351:6: (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4351:7: this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT
            	    {
            	    this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleExplicitArgList9378); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INDENT_3, grammarAccess.getExplicitArgListAccess().getINDENTTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4355:1: ( (lv_lines_4_0= ruleArgLine ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4356:1: (lv_lines_4_0= ruleArgLine )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4356:1: (lv_lines_4_0= ruleArgLine )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4357:3: lv_lines_4_0= ruleArgLine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExplicitArgListAccess().getLinesArgLineParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArgLine_in_ruleExplicitArgList9398);
            	    lv_lines_4_0=ruleArgLine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExplicitArgListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"lines",
            	              		lv_lines_4_0, 
            	              		"ArgLine");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_OUTDENT_5=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleExplicitArgList9409); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OUTDENT_5, grammarAccess.getExplicitArgListAccess().getOUTDENTTerminalRuleCall_1_1_2()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExplicitArgList"


    // $ANTLR start "entryRuleArgList"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4385:1: entryRuleArgList returns [EObject current=null] : iv_ruleArgList= ruleArgList EOF ;
    public final EObject entryRuleArgList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgList = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4386:2: (iv_ruleArgList= ruleArgList EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4387:2: iv_ruleArgList= ruleArgList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgListRule()); 
            }
            pushFollow(FOLLOW_ruleArgList_in_entryRuleArgList9447);
            iv_ruleArgList=ruleArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgList9457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgList"


    // $ANTLR start "ruleArgList"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4394:1: ruleArgList returns [EObject current=null] : ( () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )? ) ;
    public final EObject ruleArgList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_2=null;
        Token this_OUTDENT_4=null;
        EObject lv_dummy_1_0 = null;

        EObject lv_dummy_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4397:28: ( ( () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4398:1: ( () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4398:1: ( () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4398:2: () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4398:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4399:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArgListAccess().getArgListAction_0(),
                          current);
                  
            }

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4404:2: ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )?
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_STRING||(LA79_0>=RULE_FOR && LA79_0<=RULE_WHILE)||LA79_0==RULE_UNTIL||LA79_0==RULE_LBRACKET||(LA79_0>=RULE_PLUS && LA79_0<=RULE_MINUS)||(LA79_0>=RULE_UNARY && LA79_0<=RULE_MINUS_MINUS)||LA79_0==RULE_SUPER||LA79_0==RULE_AT_SIGIL||(LA79_0>=RULE_THIS && LA79_0<=RULE_TRY)||LA79_0==RULE_SWITCH||(LA79_0>=RULE_IF && LA79_0<=RULE_LCURLY)||LA79_0==RULE_PARAM_START||(LA79_0>=RULE_FUNC_ARROW && LA79_0<=RULE_LPAREN)) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_INDENT) ) {
                alt79=2;
            }
            switch (alt79) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4404:3: ( (lv_dummy_1_0= ruleExplicitArgList ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4404:3: ( (lv_dummy_1_0= ruleExplicitArgList ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4405:1: (lv_dummy_1_0= ruleExplicitArgList )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4405:1: (lv_dummy_1_0= ruleExplicitArgList )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4406:3: lv_dummy_1_0= ruleExplicitArgList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgListAccess().getDummyExplicitArgListParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExplicitArgList_in_ruleArgList9513);
                    lv_dummy_1_0=ruleExplicitArgList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArgListRule());
                      	        }
                             		set(
                             			current, 
                             			"dummy",
                              		lv_dummy_1_0, 
                              		"ExplicitArgList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4423:6: (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4423:6: (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4423:7: this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT
                    {
                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleArgList9531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_2, grammarAccess.getArgListAccess().getINDENTTerminalRuleCall_1_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4427:1: ( (lv_dummy_3_0= ruleExplicitArgList ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4428:1: (lv_dummy_3_0= ruleExplicitArgList )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4428:1: (lv_dummy_3_0= ruleExplicitArgList )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4429:3: lv_dummy_3_0= ruleExplicitArgList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgListAccess().getDummyExplicitArgListParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExplicitArgList_in_ruleArgList9551);
                    lv_dummy_3_0=ruleExplicitArgList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArgListRule());
                      	        }
                             		set(
                             			current, 
                             			"dummy",
                              		lv_dummy_3_0, 
                              		"ExplicitArgList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_OUTDENT_4=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleArgList9562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OUTDENT_4, grammarAccess.getArgListAccess().getOUTDENTTerminalRuleCall_1_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgList"


    // $ANTLR start "entryRuleArray"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4457:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4458:2: (iv_ruleArray= ruleArray EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4459:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray9600);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray9610); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4466:1: ruleArray returns [EObject current=null] : ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_0=null;
        Token this_RBRACKET_2=null;
        EObject this_ArgList_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4469:28: ( ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4470:1: ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4470:1: ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4470:2: ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4470:2: ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4470:3: ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET
            {
            this_LBRACKET_0=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleArray9652); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LBRACKET_0, grammarAccess.getArrayAccess().getLBRACKETTerminalRuleCall_0()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrayAccess().getArgListParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleArgList_in_ruleArray9674);
            this_ArgList_1=ruleArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArgList_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_RBRACKET_2=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleArray9684); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RBRACKET_2, grammarAccess.getArrayAccess().getRBRACKETTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleDictionary"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4495:1: entryRuleDictionary returns [EObject current=null] : iv_ruleDictionary= ruleDictionary EOF ;
    public final EObject entryRuleDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionary = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4496:2: (iv_ruleDictionary= ruleDictionary EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4497:2: iv_ruleDictionary= ruleDictionary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryRule()); 
            }
            pushFollow(FOLLOW_ruleDictionary_in_entryRuleDictionary9719);
            iv_ruleDictionary=ruleDictionary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionary9729); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictionary"


    // $ANTLR start "ruleDictionary"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4504:1: ruleDictionary returns [EObject current=null] : ( ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY ) ;
    public final EObject ruleDictionary() throws RecognitionException {
        EObject current = null;

        Token this_LCURLY_0=null;
        Token this_RCURLY_2=null;
        EObject this_DictItems_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4507:28: ( ( ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4508:1: ( ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4508:1: ( ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4508:2: ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4508:2: ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4508:3: ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY
            {
            this_LCURLY_0=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleDictionary9771); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_0, grammarAccess.getDictionaryAccess().getLCURLYTerminalRuleCall_0()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDictionaryAccess().getDictItemsParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleDictItems_in_ruleDictionary9793);
            this_DictItems_1=ruleDictItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DictItems_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_RCURLY_2=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleDictionary9803); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RCURLY_2, grammarAccess.getDictionaryAccess().getRCURLYTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictionary"


    // $ANTLR start "entryRuleDictItems"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4533:1: entryRuleDictItems returns [EObject current=null] : iv_ruleDictItems= ruleDictItems EOF ;
    public final EObject entryRuleDictItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictItems = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4534:2: (iv_ruleDictItems= ruleDictItems EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4535:2: iv_ruleDictItems= ruleDictItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictItemsRule()); 
            }
            pushFollow(FOLLOW_ruleDictItems_in_entryRuleDictItems9838);
            iv_ruleDictItems=ruleDictItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictItems; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictItems9848); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictItems"


    // $ANTLR start "ruleDictItems"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4542:1: ruleDictItems returns [EObject current=null] : ( () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )? ) ;
    public final EObject ruleDictItems() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_2=null;
        Token this_OUTDENT_4=null;
        EObject lv_dummy_1_0 = null;

        EObject lv_dummy_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4545:28: ( ( () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4546:1: ( () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4546:1: ( () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4546:2: () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4546:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4547:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDictItemsAccess().getDictItemsAction_0(),
                          current);
                  
            }

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4552:2: ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_STRING||LA80_0==RULE_IDENTIFIER||(LA80_0>=RULE_NUMBER && LA80_0<=RULE_REGEX)) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_INDENT) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4552:3: ( (lv_dummy_1_0= ruleExplicitDictItems ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4552:3: ( (lv_dummy_1_0= ruleExplicitDictItems ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4553:1: (lv_dummy_1_0= ruleExplicitDictItems )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4553:1: (lv_dummy_1_0= ruleExplicitDictItems )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4554:3: lv_dummy_1_0= ruleExplicitDictItems
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictItemsAccess().getDummyExplicitDictItemsParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExplicitDictItems_in_ruleDictItems9904);
                    lv_dummy_1_0=ruleExplicitDictItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDictItemsRule());
                      	        }
                             		set(
                             			current, 
                             			"dummy",
                              		lv_dummy_1_0, 
                              		"ExplicitDictItems");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4571:6: (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4571:6: (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4571:7: this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT
                    {
                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleDictItems9922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_2, grammarAccess.getDictItemsAccess().getINDENTTerminalRuleCall_1_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4575:1: ( (lv_dummy_3_0= ruleExplicitDictItems ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4576:1: (lv_dummy_3_0= ruleExplicitDictItems )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4576:1: (lv_dummy_3_0= ruleExplicitDictItems )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4577:3: lv_dummy_3_0= ruleExplicitDictItems
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictItemsAccess().getDummyExplicitDictItemsParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExplicitDictItems_in_ruleDictItems9942);
                    lv_dummy_3_0=ruleExplicitDictItems();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDictItemsRule());
                      	        }
                             		set(
                             			current, 
                             			"dummy",
                              		lv_dummy_3_0, 
                              		"ExplicitDictItems");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_OUTDENT_4=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleDictItems9953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OUTDENT_4, grammarAccess.getDictItemsAccess().getOUTDENTTerminalRuleCall_1_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictItems"


    // $ANTLR start "entryRuleExplicitDictItems"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4605:1: entryRuleExplicitDictItems returns [EObject current=null] : iv_ruleExplicitDictItems= ruleExplicitDictItems EOF ;
    public final EObject entryRuleExplicitDictItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitDictItems = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4606:2: (iv_ruleExplicitDictItems= ruleExplicitDictItems EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4607:2: iv_ruleExplicitDictItems= ruleExplicitDictItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExplicitDictItemsRule()); 
            }
            pushFollow(FOLLOW_ruleExplicitDictItems_in_entryRuleExplicitDictItems9991);
            iv_ruleExplicitDictItems=ruleExplicitDictItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExplicitDictItems; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitDictItems10001); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExplicitDictItems"


    // $ANTLR start "ruleExplicitDictItems"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4614:1: ruleExplicitDictItems returns [EObject current=null] : ( ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* ) ;
    public final EObject ruleExplicitDictItems() throws RecognitionException {
        EObject current = null;

        Token this_TERMINATOR_1=null;
        Token this_INDENT_3=null;
        Token this_OUTDENT_5=null;
        EObject lv_lines_0_0 = null;

        EObject lv_lines_2_0 = null;

        EObject lv_lines_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4617:28: ( ( ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4618:1: ( ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4618:1: ( ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4618:2: ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )*
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4618:2: ( (lv_lines_0_0= ruleDictLine ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4619:1: (lv_lines_0_0= ruleDictLine )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4619:1: (lv_lines_0_0= ruleDictLine )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4620:3: lv_lines_0_0= ruleDictLine
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExplicitDictItemsAccess().getLinesDictLineParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDictLine_in_ruleExplicitDictItems10047);
            lv_lines_0_0=ruleDictLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExplicitDictItemsRule());
              	        }
                     		add(
                     			current, 
                     			"lines",
                      		lv_lines_0_0, 
                      		"DictLine");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4636:2: ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )*
            loop81:
            do {
                int alt81=3;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==RULE_TERMINATOR) ) {
                    alt81=1;
                }
                else if ( (LA81_0==RULE_INDENT) ) {
                    alt81=2;
                }


                switch (alt81) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4636:3: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4636:3: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4636:4: this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) )
            	    {
            	    this_TERMINATOR_1=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleExplicitDictItems10060); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TERMINATOR_1, grammarAccess.getExplicitDictItemsAccess().getTERMINATORTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4640:1: ( (lv_lines_2_0= ruleDictLine ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4641:1: (lv_lines_2_0= ruleDictLine )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4641:1: (lv_lines_2_0= ruleDictLine )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4642:3: lv_lines_2_0= ruleDictLine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExplicitDictItemsAccess().getLinesDictLineParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDictLine_in_ruleExplicitDictItems10080);
            	    lv_lines_2_0=ruleDictLine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExplicitDictItemsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"lines",
            	              		lv_lines_2_0, 
            	              		"DictLine");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4659:6: (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4659:6: (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4659:7: this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT
            	    {
            	    this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleExplicitDictItems10099); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INDENT_3, grammarAccess.getExplicitDictItemsAccess().getINDENTTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4663:1: ( (lv_lines_4_0= ruleDictLine ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4664:1: (lv_lines_4_0= ruleDictLine )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4664:1: (lv_lines_4_0= ruleDictLine )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4665:3: lv_lines_4_0= ruleDictLine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExplicitDictItemsAccess().getLinesDictLineParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDictLine_in_ruleExplicitDictItems10119);
            	    lv_lines_4_0=ruleDictLine();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExplicitDictItemsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"lines",
            	              		lv_lines_4_0, 
            	              		"DictLine");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    this_OUTDENT_5=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleExplicitDictItems10130); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OUTDENT_5, grammarAccess.getExplicitDictItemsAccess().getOUTDENTTerminalRuleCall_1_1_2()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExplicitDictItems"


    // $ANTLR start "entryRuleDictLine"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4693:1: entryRuleDictLine returns [EObject current=null] : iv_ruleDictLine= ruleDictLine EOF ;
    public final EObject entryRuleDictLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictLine = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4694:2: (iv_ruleDictLine= ruleDictLine EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4695:2: iv_ruleDictLine= ruleDictLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictLineRule()); 
            }
            pushFollow(FOLLOW_ruleDictLine_in_entryRuleDictLine10168);
            iv_ruleDictLine=ruleDictLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictLine10178); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictLine"


    // $ANTLR start "ruleDictLine"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4702:1: ruleDictLine returns [EObject current=null] : ( ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )? ) ;
    public final EObject ruleDictLine() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_COMMA_3=null;
        EObject lv_head_0_0 = null;

        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4705:28: ( ( ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4706:1: ( ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4706:1: ( ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4706:2: ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4706:2: ( (lv_head_0_0= ruleDictItem ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4707:1: (lv_head_0_0= ruleDictItem )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4707:1: (lv_head_0_0= ruleDictItem )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4708:3: lv_head_0_0= ruleDictItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictLineAccess().getHeadDictItemParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDictItem_in_ruleDictLine10224);
            lv_head_0_0=ruleDictItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDictLineRule());
              	        }
                     		set(
                     			current, 
                     			"head",
                      		lv_head_0_0, 
                      		"DictItem");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4724:2: (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_COMMA) ) {
                    int LA82_1 = input.LA(2);

                    if ( (LA82_1==RULE_STRING||LA82_1==RULE_IDENTIFIER||(LA82_1>=RULE_NUMBER && LA82_1<=RULE_REGEX)) ) {
                        alt82=1;
                    }


                }


                switch (alt82) {
            	case 1 :
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4724:3: this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleDictLine10236); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getDictLineAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4728:1: ( (lv_tail_2_0= ruleDictItem ) )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4729:1: (lv_tail_2_0= ruleDictItem )
            	    {
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4729:1: (lv_tail_2_0= ruleDictItem )
            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4730:3: lv_tail_2_0= ruleDictItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDictLineAccess().getTailDictItemParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDictItem_in_ruleDictLine10256);
            	    lv_tail_2_0=ruleDictItem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDictLineRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tail",
            	              		lv_tail_2_0, 
            	              		"DictItem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4746:4: (this_COMMA_3= RULE_COMMA )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_COMMA) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4746:5: this_COMMA_3= RULE_COMMA
                    {
                    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleDictLine10270); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COMMA_3, grammarAccess.getDictLineAccess().getCOMMATerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictLine"


    // $ANTLR start "entryRuleDictItem"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4758:1: entryRuleDictItem returns [EObject current=null] : iv_ruleDictItem= ruleDictItem EOF ;
    public final EObject entryRuleDictItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictItem = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4759:2: (iv_ruleDictItem= ruleDictItem EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4760:2: iv_ruleDictItem= ruleDictItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictItemRule()); 
            }
            pushFollow(FOLLOW_ruleDictItem_in_entryRuleDictItem10307);
            iv_ruleDictItem=ruleDictItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictItem10317); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictItem"


    // $ANTLR start "ruleDictItem"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4767:1: ruleDictItem returns [EObject current=null] : ( () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )? ) ;
    public final EObject ruleDictItem() throws RecognitionException {
        EObject current = null;

        Token this_COLON_2=null;
        Token this_INDENT_4=null;
        Token this_OUTDENT_6=null;
        EObject lv_key_1_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4770:28: ( ( () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4771:1: ( () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4771:1: ( () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4771:2: () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4771:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4772:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDictItemAccess().getDictItemAction_0(),
                          current);
                  
            }

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4777:2: ( (lv_key_1_0= ruleDictKey ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4778:1: (lv_key_1_0= ruleDictKey )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4778:1: (lv_key_1_0= ruleDictKey )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4779:3: lv_key_1_0= ruleDictKey
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictItemAccess().getKeyDictKeyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDictKey_in_ruleDictItem10372);
            lv_key_1_0=ruleDictKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDictItemRule());
              	        }
                     		set(
                     			current, 
                     			"key",
                      		lv_key_1_0, 
                      		"DictKey");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4795:2: (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_COLON) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4795:3: this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) )
                    {
                    this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleDictItem10384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_2, grammarAccess.getDictItemAccess().getCOLONTerminalRuleCall_2_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4799:1: ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) )
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==RULE_STRING||(LA84_0>=RULE_FOR && LA84_0<=RULE_WHILE)||LA84_0==RULE_UNTIL||LA84_0==RULE_LBRACKET||(LA84_0>=RULE_PLUS && LA84_0<=RULE_MINUS)||(LA84_0>=RULE_UNARY && LA84_0<=RULE_MINUS_MINUS)||LA84_0==RULE_SUPER||LA84_0==RULE_AT_SIGIL||(LA84_0>=RULE_THIS && LA84_0<=RULE_TRY)||LA84_0==RULE_SWITCH||(LA84_0>=RULE_IF && LA84_0<=RULE_LCURLY)||LA84_0==RULE_PARAM_START||(LA84_0>=RULE_FUNC_ARROW && LA84_0<=RULE_LPAREN)) ) {
                        alt84=1;
                    }
                    else if ( (LA84_0==RULE_INDENT) ) {
                        alt84=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 84, 0, input);

                        throw nvae;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4799:2: ( (lv_value_3_0= ruleExpression ) )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4799:2: ( (lv_value_3_0= ruleExpression ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4800:1: (lv_value_3_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4800:1: (lv_value_3_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4801:3: lv_value_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDictItemAccess().getValueExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleDictItem10405);
                            lv_value_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDictItemRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_3_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4818:6: (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4818:6: (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4818:7: this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT
                            {
                            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleDictItem10423); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INDENT_4, grammarAccess.getDictItemAccess().getINDENTTerminalRuleCall_2_1_1_0()); 
                                  
                            }
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4822:1: ( (lv_value_5_0= ruleExpression ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4823:1: (lv_value_5_0= ruleExpression )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4823:1: (lv_value_5_0= ruleExpression )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4824:3: lv_value_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDictItemAccess().getValueExpressionParserRuleCall_2_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleDictItem10443);
                            lv_value_5_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getDictItemRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"value",
                                      		lv_value_5_0, 
                                      		"Expression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            this_OUTDENT_6=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleDictItem10454); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_OUTDENT_6, grammarAccess.getDictItemAccess().getOUTDENTTerminalRuleCall_2_1_1_2()); 
                                  
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictItem"


    // $ANTLR start "entryRuleDictKey"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4852:1: entryRuleDictKey returns [EObject current=null] : iv_ruleDictKey= ruleDictKey EOF ;
    public final EObject entryRuleDictKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictKey = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4853:2: (iv_ruleDictKey= ruleDictKey EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4854:2: iv_ruleDictKey= ruleDictKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictKeyRule()); 
            }
            pushFollow(FOLLOW_ruleDictKey_in_entryRuleDictKey10493);
            iv_ruleDictKey=ruleDictKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictKey; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictKey10503); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDictKey"


    // $ANTLR start "ruleDictKey"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4861:1: ruleDictKey returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Id_1= ruleId ) ;
    public final EObject ruleDictKey() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Id_1 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4864:28: ( (this_Literal_0= ruleLiteral | this_Id_1= ruleId ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4865:1: (this_Literal_0= ruleLiteral | this_Id_1= ruleId )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4865:1: (this_Literal_0= ruleLiteral | this_Id_1= ruleId )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_STRING||(LA86_0>=RULE_NUMBER && LA86_0<=RULE_REGEX)) ) {
                alt86=1;
            }
            else if ( (LA86_0==RULE_IDENTIFIER) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4866:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDictKeyAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleDictKey10550);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Literal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4876:5: this_Id_1= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDictKeyAccess().getIdParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleDictKey10577);
                    this_Id_1=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Id_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDictKey"


    // $ANTLR start "entryRuleLambda"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4892:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4893:2: (iv_ruleLambda= ruleLambda EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4894:2: iv_ruleLambda= ruleLambda EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaRule()); 
            }
            pushFollow(FOLLOW_ruleLambda_in_entryRuleLambda10612);
            iv_ruleLambda=ruleLambda();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambda; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLambda10622); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLambda"


    // $ANTLR start "ruleLambda"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4901:1: ruleLambda returns [EObject current=null] : ( (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) ) ) ;
    public final EObject ruleLambda() throws RecognitionException {
        EObject current = null;

        Token this_PARAM_START_0=null;
        Token this_COMMA_2=null;
        Token this_PARAM_END_4=null;
        Token this_FUNC_ARROW_5=null;
        Token this_BOUND_FUNC_ARROW_6=null;
        EObject lv_params_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_body_7_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4904:28: ( ( (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4905:1: ( (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4905:1: ( (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4905:2: (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4905:2: (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_PARAM_START) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4905:3: this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END
                    {
                    this_PARAM_START_0=(Token)match(input,RULE_PARAM_START,FOLLOW_RULE_PARAM_START_in_ruleLambda10659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAM_START_0, grammarAccess.getLambdaAccess().getPARAM_STARTTerminalRuleCall_0_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4909:1: ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==RULE_LBRACKET||LA88_0==RULE_AT_SIGIL||(LA88_0>=RULE_IDENTIFIER && LA88_0<=RULE_LCURLY)) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4909:2: ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )*
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4909:2: ( (lv_params_1_0= ruleParam ) )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4910:1: (lv_params_1_0= ruleParam )
                            {
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4910:1: (lv_params_1_0= ruleParam )
                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4911:3: lv_params_1_0= ruleParam
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLambdaAccess().getParamsParamParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParam_in_ruleLambda10680);
                            lv_params_1_0=ruleParam();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLambdaRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"params",
                                      		lv_params_1_0, 
                                      		"Param");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4927:2: (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )*
                            loop87:
                            do {
                                int alt87=2;
                                int LA87_0 = input.LA(1);

                                if ( (LA87_0==RULE_COMMA) ) {
                                    alt87=1;
                                }


                                switch (alt87) {
                            	case 1 :
                            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4927:3: this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) )
                            	    {
                            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleLambda10692); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_COMMA_2, grammarAccess.getLambdaAccess().getCOMMATerminalRuleCall_0_1_1_0()); 
                            	          
                            	    }
                            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4931:1: ( (lv_params_3_0= ruleParam ) )
                            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4932:1: (lv_params_3_0= ruleParam )
                            	    {
                            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4932:1: (lv_params_3_0= ruleParam )
                            	    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4933:3: lv_params_3_0= ruleParam
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getLambdaAccess().getParamsParamParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParam_in_ruleLambda10712);
                            	    lv_params_3_0=ruleParam();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getLambdaRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"params",
                            	              		lv_params_3_0, 
                            	              		"Param");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop87;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_PARAM_END_4=(Token)match(input,RULE_PARAM_END,FOLLOW_RULE_PARAM_END_in_ruleLambda10727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAM_END_4, grammarAccess.getLambdaAccess().getPARAM_ENDTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4953:3: (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_FUNC_ARROW) ) {
                alt90=1;
            }
            else if ( (LA90_0==RULE_BOUND_FUNC_ARROW) ) {
                alt90=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4953:4: this_FUNC_ARROW_5= RULE_FUNC_ARROW
                    {
                    this_FUNC_ARROW_5=(Token)match(input,RULE_FUNC_ARROW,FOLLOW_RULE_FUNC_ARROW_in_ruleLambda10740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FUNC_ARROW_5, grammarAccess.getLambdaAccess().getFUNC_ARROWTerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4958:6: this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW
                    {
                    this_BOUND_FUNC_ARROW_6=(Token)match(input,RULE_BOUND_FUNC_ARROW,FOLLOW_RULE_BOUND_FUNC_ARROW_in_ruleLambda10756); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOUND_FUNC_ARROW_6, grammarAccess.getLambdaAccess().getBOUND_FUNC_ARROWTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4962:2: ( (lv_body_7_0= ruleBlock ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4963:1: (lv_body_7_0= ruleBlock )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4963:1: (lv_body_7_0= ruleBlock )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4964:3: lv_body_7_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLambdaAccess().getBodyBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleLambda10777);
            lv_body_7_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLambdaRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_7_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLambda"


    // $ANTLR start "entryRuleParam"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4988:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4989:2: (iv_ruleParam= ruleParam EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4990:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam10813);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam10823); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParam"


    // $ANTLR start "ruleParam"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4997:1: ruleParam returns [EObject current=null] : ( (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )? ) ;
    public final EObject ruleParam() throws RecognitionException {
        EObject current = null;

        Token lv_splat_4_0=null;
        Token this_EQUAL_5=null;
        EObject this_Id_0 = null;

        EObject this_Array_1 = null;

        EObject this_Dictionary_2 = null;

        EObject this_ThisProperty_3 = null;

        EObject lv_defaultValue_6_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5000:28: ( ( (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )? ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5001:1: ( (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )? )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5001:1: ( (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )? )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5001:2: (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )?
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5001:2: (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty )
            int alt91=4;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_IDENTIFIER) ) {
                alt91=1;
            }
            else if ( (LA91_0==RULE_LBRACKET) && (synpred36_InternalCoffeeScript())) {
                alt91=2;
            }
            else if ( (LA91_0==RULE_LCURLY) && (synpred37_InternalCoffeeScript())) {
                alt91=3;
            }
            else if ( (LA91_0==RULE_AT_SIGIL) ) {
                alt91=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5002:5: this_Id_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParamAccess().getIdParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleParam10871);
                    this_Id_0=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Id_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5011:6: ( ( RULE_LBRACKET )=>this_Array_1= ruleArray )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5011:6: ( ( RULE_LBRACKET )=>this_Array_1= ruleArray )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5011:7: ( RULE_LBRACKET )=>this_Array_1= ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParamAccess().getArrayParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArray_in_ruleParam10904);
                    this_Array_1=ruleArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Array_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5021:6: ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5021:6: ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5021:7: ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParamAccess().getDictionaryParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionary_in_ruleParam10938);
                    this_Dictionary_2=ruleDictionary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Dictionary_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5032:5: this_ThisProperty_3= ruleThisProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParamAccess().getThisPropertyParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleThisProperty_in_ruleParam10966);
                    this_ThisProperty_3=ruleThisProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ThisProperty_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5040:2: ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )?
            int alt92=3;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ELLIPSIS) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_EQUAL) ) {
                alt92=2;
            }
            switch (alt92) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5040:3: ( (lv_splat_4_0= RULE_ELLIPSIS ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5040:3: ( (lv_splat_4_0= RULE_ELLIPSIS ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5041:1: (lv_splat_4_0= RULE_ELLIPSIS )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5041:1: (lv_splat_4_0= RULE_ELLIPSIS )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5042:3: lv_splat_4_0= RULE_ELLIPSIS
                    {
                    lv_splat_4_0=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleParam10984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_splat_4_0, grammarAccess.getParamAccess().getSplatELLIPSISTerminalRuleCall_1_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getParamRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"splat",
                              		true, 
                              		"ELLIPSIS");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5059:6: (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5059:6: (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5059:7: this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) )
                    {
                    this_EQUAL_5=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleParam11007); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUAL_5, grammarAccess.getParamAccess().getEQUALTerminalRuleCall_1_1_0()); 
                          
                    }
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5063:1: ( (lv_defaultValue_6_0= ruleExpression ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5064:1: (lv_defaultValue_6_0= ruleExpression )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5064:1: (lv_defaultValue_6_0= ruleExpression )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5065:3: lv_defaultValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamAccess().getDefaultValueExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleParam11027);
                    lv_defaultValue_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParamRule());
                      	        }
                             		set(
                             			current, 
                             			"defaultValue",
                              		lv_defaultValue_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParam"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5089:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5090:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5091:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral11066);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral11076); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5098:1: ruleNumberLiteral returns [EObject current=null] : ( () this_NUMBER_1= RULE_NUMBER ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5101:28: ( ( () this_NUMBER_1= RULE_NUMBER ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5102:1: ( () this_NUMBER_1= RULE_NUMBER )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5102:1: ( () this_NUMBER_1= RULE_NUMBER )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5102:2: () this_NUMBER_1= RULE_NUMBER
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5102:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5103:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                          current);
                  
            }

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleNumberLiteral11121); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_NUMBER_1, grammarAccess.getNumberLiteralAccess().getNUMBERTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5120:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5121:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5122:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11156);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral11166); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5129:1: ruleStringLiteral returns [EObject current=null] : ( () this_STRING_1= RULE_STRING ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5132:28: ( ( () this_STRING_1= RULE_STRING ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5133:1: ( () this_STRING_1= RULE_STRING )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5133:1: ( () this_STRING_1= RULE_STRING )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5133:2: () this_STRING_1= RULE_STRING
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5133:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5134:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral11211); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_1, grammarAccess.getStringLiteralAccess().getSTRINGTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBoolLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5151:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5152:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5153:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral11246);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral11256); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolLiteral"


    // $ANTLR start "ruleBoolLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5160:1: ruleBoolLiteral returns [EObject current=null] : ( () this_BOOL_1= RULE_BOOL ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token this_BOOL_1=null;

         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5163:28: ( ( () this_BOOL_1= RULE_BOOL ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5164:1: ( () this_BOOL_1= RULE_BOOL )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5164:1: ( () this_BOOL_1= RULE_BOOL )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5164:2: () this_BOOL_1= RULE_BOOL
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5164:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5165:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            this_BOOL_1=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral11301); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_BOOL_1, grammarAccess.getBoolLiteralAccess().getBOOLTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolLiteral"


    // $ANTLR start "entryRuleJSLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5182:1: entryRuleJSLiteral returns [EObject current=null] : iv_ruleJSLiteral= ruleJSLiteral EOF ;
    public final EObject entryRuleJSLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSLiteral = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5183:2: (iv_ruleJSLiteral= ruleJSLiteral EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5184:2: iv_ruleJSLiteral= ruleJSLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJSLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleJSLiteral_in_entryRuleJSLiteral11336);
            iv_ruleJSLiteral=ruleJSLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJSLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJSLiteral11346); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSLiteral"


    // $ANTLR start "ruleJSLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5191:1: ruleJSLiteral returns [EObject current=null] : ( () this_JS_1= RULE_JS ) ;
    public final EObject ruleJSLiteral() throws RecognitionException {
        EObject current = null;

        Token this_JS_1=null;

         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5194:28: ( ( () this_JS_1= RULE_JS ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5195:1: ( () this_JS_1= RULE_JS )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5195:1: ( () this_JS_1= RULE_JS )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5195:2: () this_JS_1= RULE_JS
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5195:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5196:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJSLiteralAccess().getJSLiteralAction_0(),
                          current);
                  
            }

            }

            this_JS_1=(Token)match(input,RULE_JS,FOLLOW_RULE_JS_in_ruleJSLiteral11391); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_JS_1, grammarAccess.getJSLiteralAccess().getJSTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSLiteral"


    // $ANTLR start "entryRuleRegexLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5213:1: entryRuleRegexLiteral returns [EObject current=null] : iv_ruleRegexLiteral= ruleRegexLiteral EOF ;
    public final EObject entryRuleRegexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexLiteral = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5214:2: (iv_ruleRegexLiteral= ruleRegexLiteral EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5215:2: iv_ruleRegexLiteral= ruleRegexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRegexLiteral_in_entryRuleRegexLiteral11426);
            iv_ruleRegexLiteral=ruleRegexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegexLiteral11436); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegexLiteral"


    // $ANTLR start "ruleRegexLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5222:1: ruleRegexLiteral returns [EObject current=null] : ( () this_REGEX_1= RULE_REGEX ) ;
    public final EObject ruleRegexLiteral() throws RecognitionException {
        EObject current = null;

        Token this_REGEX_1=null;

         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5225:28: ( ( () this_REGEX_1= RULE_REGEX ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5226:1: ( () this_REGEX_1= RULE_REGEX )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5226:1: ( () this_REGEX_1= RULE_REGEX )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5226:2: () this_REGEX_1= RULE_REGEX
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5226:2: ()
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5227:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegexLiteralAccess().getRegexLiteralAction_0(),
                          current);
                  
            }

            }

            this_REGEX_1=(Token)match(input,RULE_REGEX,FOLLOW_RULE_REGEX_in_ruleRegexLiteral11481); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_REGEX_1, grammarAccess.getRegexLiteralAccess().getREGEXTerminalRuleCall_1()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegexLiteral"


    // $ANTLR start "entryRuleLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5244:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5245:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5246:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral11516);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral11526); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5253:1: ruleLiteral returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_JSLiteral_3= ruleJSLiteral | this_RegexLiteral_4= ruleRegexLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BoolLiteral_2 = null;

        EObject this_JSLiteral_3 = null;

        EObject this_RegexLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5256:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_JSLiteral_3= ruleJSLiteral | this_RegexLiteral_4= ruleRegexLiteral ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5257:1: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_JSLiteral_3= ruleJSLiteral | this_RegexLiteral_4= ruleRegexLiteral )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5257:1: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_JSLiteral_3= ruleJSLiteral | this_RegexLiteral_4= ruleRegexLiteral )
            int alt93=5;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt93=1;
                }
                break;
            case RULE_STRING:
                {
                alt93=2;
                }
                break;
            case RULE_BOOL:
                {
                alt93=3;
                }
                break;
            case RULE_JS:
                {
                alt93=4;
                }
                break;
            case RULE_REGEX:
                {
                alt93=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5258:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral11573);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5268:5: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral11600);
                    this_StringLiteral_1=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5278:5: this_BoolLiteral_2= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral11627);
                    this_BoolLiteral_2=ruleBoolLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BoolLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5288:5: this_JSLiteral_3= ruleJSLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getJSLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJSLiteral_in_ruleLiteral11654);
                    this_JSLiteral_3=ruleJSLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JSLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5298:5: this_RegexLiteral_4= ruleRegexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRegexLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegexLiteral_in_ruleLiteral11681);
                    this_RegexLiteral_4=ruleRegexLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RegexLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleParenthetical"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5314:1: entryRuleParenthetical returns [EObject current=null] : iv_ruleParenthetical= ruleParenthetical EOF ;
    public final EObject entryRuleParenthetical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthetical = null;


        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5315:2: (iv_ruleParenthetical= ruleParenthetical EOF )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5316:2: iv_ruleParenthetical= ruleParenthetical EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentheticalRule()); 
            }
            pushFollow(FOLLOW_ruleParenthetical_in_entryRuleParenthetical11716);
            iv_ruleParenthetical=ruleParenthetical();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthetical; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthetical11726); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthetical"


    // $ANTLR start "ruleParenthetical"
    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5323:1: ruleParenthetical returns [EObject current=null] : ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) ) ;
    public final EObject ruleParenthetical() throws RecognitionException {
        EObject current = null;

        Token this_LPAREN_0=null;
        Token this_INDENT_1=null;
        Token this_OUTDENT_3=null;
        Token this_RPAREN_4=null;
        Token this_LPAREN_5=null;
        Token this_RPAREN_7=null;
        EObject lv_content_2_0 = null;

        EObject lv_content_6_0 = null;


         enterRule(); 
            
        try {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5326:28: ( ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) ) )
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:1: ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) )
            {
            // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:1: ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) )
            int alt94=2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:2: ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:2: ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:3: ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:3: ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:4: ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:34: (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:35: this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT
                    {
                    this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleParenthetical11774); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_0, grammarAccess.getParentheticalAccess().getLPARENTerminalRuleCall_0_0_0_0()); 
                          
                    }
                    this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleParenthetical11784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_1, grammarAccess.getParentheticalAccess().getINDENTTerminalRuleCall_0_0_0_1()); 
                          
                    }

                    }


                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5335:3: ( (lv_content_2_0= ruleBody ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5336:1: (lv_content_2_0= ruleBody )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5336:1: (lv_content_2_0= ruleBody )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5337:3: lv_content_2_0= ruleBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParentheticalAccess().getContentBodyParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBody_in_ruleParenthetical11806);
                    lv_content_2_0=ruleBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParentheticalRule());
                      	        }
                             		set(
                             			current, 
                             			"content",
                              		lv_content_2_0, 
                              		"Body");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_OUTDENT_3=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleParenthetical11817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OUTDENT_3, grammarAccess.getParentheticalAccess().getOUTDENTTerminalRuleCall_0_2()); 
                          
                    }
                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleParenthetical11827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_4, grammarAccess.getParentheticalAccess().getRPARENTerminalRuleCall_0_3()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5362:6: ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5362:6: ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5362:7: ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5362:7: ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5362:8: ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN
                    {
                    this_LPAREN_5=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleParenthetical11851); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_5, grammarAccess.getParentheticalAccess().getLPARENTerminalRuleCall_1_0()); 
                          
                    }

                    }

                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5366:2: ( (lv_content_6_0= ruleBody ) )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5367:1: (lv_content_6_0= ruleBody )
                    {
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5367:1: (lv_content_6_0= ruleBody )
                    // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5368:3: lv_content_6_0= ruleBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParentheticalAccess().getContentBodyParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBody_in_ruleParenthetical11872);
                    lv_content_6_0=ruleBody();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getParentheticalRule());
                      	        }
                             		set(
                             			current, 
                             			"content",
                              		lv_content_6_0, 
                              		"Body");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_RPAREN_7=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleParenthetical11883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_7, grammarAccess.getParentheticalAccess().getRPARENTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthetical"

    // $ANTLR start synpred1_InternalCoffeeScript
    public final void synpred1_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:245:7: ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:245:8: ( ( ( ruleId ) ) RULE_EQUAL 'require' )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:245:8: ( ( ( ruleId ) ) RULE_EQUAL 'require' )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:245:9: ( ( ruleId ) ) RULE_EQUAL 'require'
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:245:9: ( ( ruleId ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:246:1: ( ruleId )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:246:1: ( ruleId )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:247:1: ruleId
        {
        pushFollow(FOLLOW_ruleId_in_synpred1_InternalCoffeeScript558);
        ruleId();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_synpred1_InternalCoffeeScript564); if (state.failed) return ;
        match(input,85,FOLLOW_85_in_synpred1_InternalCoffeeScript566); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCoffeeScript

    // $ANTLR start synpred3_InternalCoffeeScript
    public final void synpred3_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:944:4: ( RULE_POST_IF )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:944:6: RULE_POST_IF
        {
        match(input,RULE_POST_IF,FOLLOW_RULE_POST_IF_in_synpred3_InternalCoffeeScript2039); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalCoffeeScript

    // $ANTLR start synpred4_InternalCoffeeScript
    public final void synpred4_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:973:8: ( RULE_FOR )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:973:10: RULE_FOR
        {
        match(input,RULE_FOR,FOLLOW_RULE_FOR_in_synpred4_InternalCoffeeScript2094); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalCoffeeScript

    // $ANTLR start synpred5_InternalCoffeeScript
    public final void synpred5_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1002:8: ( RULE_WHILE )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1002:10: RULE_WHILE
        {
        match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_synpred5_InternalCoffeeScript2149); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalCoffeeScript

    // $ANTLR start synpred6_InternalCoffeeScript
    public final void synpred6_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1030:4: ( RULE_WHEN )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1030:6: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred6_InternalCoffeeScript2197); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalCoffeeScript

    // $ANTLR start synpred7_InternalCoffeeScript
    public final void synpred7_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1053:8: ( RULE_UNTIL )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1053:10: RULE_UNTIL
        {
        match(input,RULE_UNTIL,FOLLOW_RULE_UNTIL_in_synpred7_InternalCoffeeScript2245); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalCoffeeScript

    // $ANTLR start synpred8_InternalCoffeeScript
    public final void synpred8_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1081:4: ( RULE_WHEN )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1081:6: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred8_InternalCoffeeScript2293); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalCoffeeScript

    // $ANTLR start synpred9_InternalCoffeeScript
    public final void synpred9_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1243:5: ( RULE_FOROF )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1243:7: RULE_FOROF
        {
        match(input,RULE_FOROF,FOLLOW_RULE_FOROF_in_synpred9_InternalCoffeeScript2668); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalCoffeeScript

    // $ANTLR start synpred10_InternalCoffeeScript
    public final void synpred10_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1265:4: ( RULE_WHEN )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1265:6: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred10_InternalCoffeeScript2707); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalCoffeeScript

    // $ANTLR start synpred11_InternalCoffeeScript
    public final void synpred11_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1288:8: ( RULE_FORIN )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1288:10: RULE_FORIN
        {
        match(input,RULE_FORIN,FOLLOW_RULE_FORIN_in_synpred11_InternalCoffeeScript2755); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalCoffeeScript

    // $ANTLR start synpred12_InternalCoffeeScript
    public final void synpred12_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1310:5: ( RULE_WHEN )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1310:7: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred12_InternalCoffeeScript2795); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalCoffeeScript

    // $ANTLR start synpred13_InternalCoffeeScript
    public final void synpred13_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1332:4: ( RULE_BY )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1332:6: RULE_BY
        {
        match(input,RULE_BY,FOLLOW_RULE_BY_in_synpred13_InternalCoffeeScript2834); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalCoffeeScript

    // $ANTLR start synpred14_InternalCoffeeScript
    public final void synpred14_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1355:8: ( RULE_BY )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1355:10: RULE_BY
        {
        match(input,RULE_BY,FOLLOW_RULE_BY_in_synpred14_InternalCoffeeScript2882); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalCoffeeScript

    // $ANTLR start synpred15_InternalCoffeeScript
    public final void synpred15_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1377:4: ( RULE_WHEN )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1377:6: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred15_InternalCoffeeScript2921); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalCoffeeScript

    // $ANTLR start synpred17_InternalCoffeeScript
    public final void synpred17_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:4: ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:5: ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:5: ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:6: ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1499:6: ( ( ruleAssignable ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1500:1: ( ruleAssignable )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1500:1: ( ruleAssignable )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1501:1: ruleAssignable
        {
        pushFollow(FOLLOW_ruleAssignable_in_synpred17_InternalCoffeeScript3235);
        ruleAssignable();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1503:2: ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1504:1: ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1504:1: ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1505:1: ( RULE_EQUAL | RULE_COMPOUND_ASSIGN )
        {
        if ( input.LA(1)==RULE_EQUAL||input.LA(1)==RULE_COMPOUND_ASSIGN ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred17_InternalCoffeeScript

    // $ANTLR start synpred18_InternalCoffeeScript
    public final void synpred18_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1683:3: ( ( () ( ( RULE_LOGIC ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1683:4: ( () ( ( RULE_LOGIC ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1683:4: ( () ( ( RULE_LOGIC ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1683:5: () ( ( RULE_LOGIC ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1683:5: ()
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1684:1: 
        {
        }

        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1684:2: ( ( RULE_LOGIC ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1685:1: ( RULE_LOGIC )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1685:1: ( RULE_LOGIC )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1686:1: RULE_LOGIC
        {
        match(input,RULE_LOGIC,FOLLOW_RULE_LOGIC_in_synpred18_InternalCoffeeScript3659); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalCoffeeScript

    // $ANTLR start synpred19_InternalCoffeeScript
    public final void synpred19_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1761:3: ( ( () ( ( RULE_COMPARE ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1761:4: ( () ( ( RULE_COMPARE ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1761:4: ( () ( ( RULE_COMPARE ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1761:5: () ( ( RULE_COMPARE ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1761:5: ()
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1762:1: 
        {
        }

        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1762:2: ( ( RULE_COMPARE ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1763:1: ( RULE_COMPARE )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1763:1: ( RULE_COMPARE )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1764:1: RULE_COMPARE
        {
        match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_synpred19_InternalCoffeeScript3828); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred19_InternalCoffeeScript

    // $ANTLR start synpred20_InternalCoffeeScript
    public final void synpred20_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1839:3: ( ( () ( ( RULE_RELATION ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1839:4: ( () ( ( RULE_RELATION ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1839:4: ( () ( ( RULE_RELATION ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1839:5: () ( ( RULE_RELATION ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1839:5: ()
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1840:1: 
        {
        }

        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1840:2: ( ( RULE_RELATION ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1841:1: ( RULE_RELATION )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1841:1: ( RULE_RELATION )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1842:1: RULE_RELATION
        {
        match(input,RULE_RELATION,FOLLOW_RULE_RELATION_in_synpred20_InternalCoffeeScript3997); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalCoffeeScript

    // $ANTLR start synpred21_InternalCoffeeScript
    public final void synpred21_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1917:3: ( ( () ( ( RULE_SHIFT ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1917:4: ( () ( ( RULE_SHIFT ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1917:4: ( () ( ( RULE_SHIFT ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1917:5: () ( ( RULE_SHIFT ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1917:5: ()
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1918:1: 
        {
        }

        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1918:2: ( ( RULE_SHIFT ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1919:1: ( RULE_SHIFT )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1919:1: ( RULE_SHIFT )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1920:1: RULE_SHIFT
        {
        match(input,RULE_SHIFT,FOLLOW_RULE_SHIFT_in_synpred21_InternalCoffeeScript4166); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalCoffeeScript

    // $ANTLR start synpred22_InternalCoffeeScript
    public final void synpred22_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1995:3: ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1995:4: ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1995:4: ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1995:5: () ( ( ( RULE_PLUS | RULE_MINUS ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1995:5: ()
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1996:1: 
        {
        }

        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1996:2: ( ( ( RULE_PLUS | RULE_MINUS ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1997:1: ( ( RULE_PLUS | RULE_MINUS ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1997:1: ( ( RULE_PLUS | RULE_MINUS ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:1998:1: ( RULE_PLUS | RULE_MINUS )
        {
        if ( (input.LA(1)>=RULE_PLUS && input.LA(1)<=RULE_MINUS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred22_InternalCoffeeScript

    // $ANTLR start synpred23_InternalCoffeeScript
    public final void synpred23_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2096:3: ( ( () ( ( RULE_MATH ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2096:4: ( () ( ( RULE_MATH ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2096:4: ( () ( ( RULE_MATH ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2096:5: () ( ( RULE_MATH ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2096:5: ()
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2097:1: 
        {
        }

        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2097:2: ( ( RULE_MATH ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2098:1: ( RULE_MATH )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2098:1: ( RULE_MATH )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2099:1: RULE_MATH
        {
        match(input,RULE_MATH,FOLLOW_RULE_MATH_in_synpred23_InternalCoffeeScript4544); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalCoffeeScript

    // $ANTLR start synpred24_InternalCoffeeScript
    public final void synpred24_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2666:4: ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2667:1: ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2667:1: ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2668:1: ( RULE_DOT_DOT | RULE_ELLIPSIS )
        {
        if ( (input.LA(1)>=RULE_DOT_DOT && input.LA(1)<=RULE_ELLIPSIS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred24_InternalCoffeeScript

    // $ANTLR start synpred25_InternalCoffeeScript
    public final void synpred25_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:8: ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:9: ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:9: ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:10: ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2731:10: ( ( ruleExpression ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2732:1: ( ruleExpression )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2732:1: ( ruleExpression )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2733:1: ruleExpression
        {
        pushFollow(FOLLOW_ruleExpression_in_synpred25_InternalCoffeeScript5996);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2735:2: ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2736:1: ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2736:1: ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2737:1: ( RULE_DOT_DOT | RULE_ELLIPSIS )
        {
        if ( (input.LA(1)>=RULE_DOT_DOT && input.LA(1)<=RULE_ELLIPSIS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred25_InternalCoffeeScript

    // $ANTLR start synpred26_InternalCoffeeScript
    public final void synpred26_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2887:7: ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2887:8: ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2887:8: ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2887:10: RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS )
        {
        match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_synpred26_InternalCoffeeScript6306); if (state.failed) return ;
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2887:23: ( ( ruleExpression ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2888:1: ( ruleExpression )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2888:1: ( ruleExpression )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2889:1: ruleExpression
        {
        pushFollow(FOLLOW_ruleExpression_in_synpred26_InternalCoffeeScript6311);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        if ( (input.LA(1)>=RULE_DOT_DOT && input.LA(1)<=RULE_ELLIPSIS) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }
    }
    // $ANTLR end synpred26_InternalCoffeeScript

    // $ANTLR start synpred27_InternalCoffeeScript
    public final void synpred27_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2902:7: ( RULE_LBRACKET )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2902:9: RULE_LBRACKET
        {
        match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_synpred27_InternalCoffeeScript6362); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalCoffeeScript

    // $ANTLR start synpred28_InternalCoffeeScript
    public final void synpred28_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2912:7: ( RULE_LCURLY )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:2912:9: RULE_LCURLY
        {
        match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_synpred28_InternalCoffeeScript6396); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalCoffeeScript

    // $ANTLR start synpred29_InternalCoffeeScript
    public final void synpred29_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:4: ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:5: ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:5: ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:7: ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) )
        {
        pushFollow(FOLLOW_ruleIdRef_in_synpred29_InternalCoffeeScript8012);
        ruleIdRef();

        state._fsp--;
        if (state.failed) return ;
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3750:16: ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3751:1: ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3751:1: ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3752:1: ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT )
        {
        if ( (input.LA(1)>=RULE_DOT && input.LA(1)<=RULE_DOUBLE_COLON) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred29_InternalCoffeeScript

    // $ANTLR start synpred30_InternalCoffeeScript
    public final void synpred30_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:8: ( ( ruleIdRef RULE_INDEX_START ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:9: ( ruleIdRef RULE_INDEX_START )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:9: ( ruleIdRef RULE_INDEX_START )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:3841:11: ruleIdRef RULE_INDEX_START
        {
        pushFollow(FOLLOW_ruleIdRef_in_synpred30_InternalCoffeeScript8175);
        ruleIdRef();

        state._fsp--;
        if (state.failed) return ;
        match(input,RULE_INDEX_START,FOLLOW_RULE_INDEX_START_in_synpred30_InternalCoffeeScript8177); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalCoffeeScript

    // $ANTLR start synpred32_InternalCoffeeScript
    public final void synpred32_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4148:7: ( RULE_LCURLY )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4148:9: RULE_LCURLY
        {
        match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_synpred32_InternalCoffeeScript8930); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalCoffeeScript

    // $ANTLR start synpred33_InternalCoffeeScript
    public final void synpred33_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4158:7: ( RULE_LBRACKET )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:4158:9: RULE_LBRACKET
        {
        match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_synpred33_InternalCoffeeScript8964); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalCoffeeScript

    // $ANTLR start synpred36_InternalCoffeeScript
    public final void synpred36_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5011:7: ( RULE_LBRACKET )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5011:9: RULE_LBRACKET
        {
        match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_synpred36_InternalCoffeeScript10888); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalCoffeeScript

    // $ANTLR start synpred37_InternalCoffeeScript
    public final void synpred37_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5021:7: ( RULE_LCURLY )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5021:9: RULE_LCURLY
        {
        match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_synpred37_InternalCoffeeScript10922); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalCoffeeScript

    // $ANTLR start synpred38_InternalCoffeeScript
    public final void synpred38_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:4: ( ( RULE_LPAREN RULE_INDENT ) )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:5: ( RULE_LPAREN RULE_INDENT )
        {
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:5: ( RULE_LPAREN RULE_INDENT )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5327:7: RULE_LPAREN RULE_INDENT
        {
        match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_synpred38_InternalCoffeeScript11765); if (state.failed) return ;
        match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_synpred38_InternalCoffeeScript11767); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalCoffeeScript

    // $ANTLR start synpred39_InternalCoffeeScript
    public final void synpred39_InternalCoffeeScript_fragment() throws RecognitionException {   
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5362:8: ( RULE_LPAREN )
        // ../csep/src-gen/csep/parser/antlr/internal/InternalCoffeeScript.g:5362:10: RULE_LPAREN
        {
        match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_synpred39_InternalCoffeeScript11846); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalCoffeeScript

    // Delegated rules

    public final boolean synpred30_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalCoffeeScript() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalCoffeeScript_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA94 dfa94 = new DFA94(this);
    static final String DFA18_eotS =
        "\12\uffff";
    static final String DFA18_eofS =
        "\1\5\11\uffff";
    static final String DFA18_minS =
        "\1\4\4\0\5\uffff";
    static final String DFA18_maxS =
        "\1\111\4\0\5\uffff";
    static final String DFA18_acceptS =
        "\5\uffff\1\5\1\1\1\2\1\3\1\4";
    static final String DFA18_specialS =
        "\1\uffff\1\3\1\2\1\1\1\0\5\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\5\5\uffff\1\5\1\uffff\1\1\3\uffff\1\2\1\3\1\5\1\4\1\uffff"+
            "\1\5\2\uffff\1\5\1\uffff\3\5\1\uffff\11\5\13\uffff\1\5\13\uffff"+
            "\1\5\2\uffff\1\5\7\uffff\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "944:1: ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCoffeeScript()) ) {s = 9;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_3 = input.LA(1);

                         
                        int index18_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalCoffeeScript()) ) {s = 8;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index18_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_2 = input.LA(1);

                         
                        int index18_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCoffeeScript()) ) {s = 7;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index18_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCoffeeScript()) ) {s = 6;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA28_eotS =
        "\35\uffff";
    static final String DFA28_eofS =
        "\35\uffff";
    static final String DFA28_minS =
        "\1\11\5\0\27\uffff";
    static final String DFA28_maxS =
        "\1\110\5\0\27\uffff";
    static final String DFA28_acceptS =
        "\6\uffff\1\2\25\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\27\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\6\6\uffff\2\6\1\uffff\1\6\5\uffff\1\5\12\uffff\2\6\1\uffff"+
            "\3\6\1\uffff\1\6\1\uffff\1\2\5\uffff\1\3\2\6\2\uffff\1\6\2\uffff"+
            "\1\6\1\1\1\4\2\uffff\1\6\1\uffff\7\6",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1499:1: ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCoffeeScript()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCoffeeScript()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA28_3 = input.LA(1);

                         
                        int index28_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCoffeeScript()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index28_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA28_4 = input.LA(1);

                         
                        int index28_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCoffeeScript()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index28_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA28_5 = input.LA(1);

                         
                        int index28_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCoffeeScript()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index28_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\40\uffff";
    static final String DFA53_eofS =
        "\40\uffff";
    static final String DFA53_minS =
        "\1\11\2\uffff\33\0\2\uffff";
    static final String DFA53_maxS =
        "\1\110\2\uffff\33\0\2\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\2\1\33\uffff\1\2\1\3";
    static final String DFA53_specialS =
        "\1\0\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\2\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\21\6\uffff\1\30\1\31\1\uffff\1\32\5\uffff\1\7\1\1\1\2\10"+
            "\uffff\1\11\1\12\1\uffff\1\10\1\13\1\14\1\uffff\1\15\1\uffff"+
            "\1\4\5\uffff\1\5\1\33\1\34\2\uffff\1\35\2\uffff\1\16\1\3\1\6"+
            "\2\uffff\1\25\1\uffff\1\26\1\27\1\20\1\22\1\23\1\24\1\17",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "2666:1: ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==RULE_DOT_DOT) && (synpred24_InternalCoffeeScript())) {s = 1;}

                        else if ( (LA53_0==RULE_ELLIPSIS) && (synpred24_InternalCoffeeScript())) {s = 2;}

                        else if ( (LA53_0==RULE_IDENTIFIER) ) {s = 3;}

                        else if ( (LA53_0==RULE_AT_SIGIL) ) {s = 4;}

                        else if ( (LA53_0==RULE_THIS) ) {s = 5;}

                        else if ( (LA53_0==RULE_LCURLY) ) {s = 6;}

                        else if ( (LA53_0==RULE_LBRACKET) ) {s = 7;}

                        else if ( (LA53_0==RULE_UNARY) ) {s = 8;}

                        else if ( (LA53_0==RULE_PLUS) ) {s = 9;}

                        else if ( (LA53_0==RULE_MINUS) ) {s = 10;}

                        else if ( (LA53_0==RULE_PLUS_PLUS) ) {s = 11;}

                        else if ( (LA53_0==RULE_MINUS_MINUS) ) {s = 12;}

                        else if ( (LA53_0==RULE_SUPER) ) {s = 13;}

                        else if ( (LA53_0==RULE_IF) ) {s = 14;}

                        else if ( (LA53_0==RULE_LPAREN) ) {s = 15;}

                        else if ( (LA53_0==RULE_NUMBER) ) {s = 16;}

                        else if ( (LA53_0==RULE_STRING) ) {s = 17;}

                        else if ( (LA53_0==RULE_BOOL) ) {s = 18;}

                        else if ( (LA53_0==RULE_JS) ) {s = 19;}

                        else if ( (LA53_0==RULE_REGEX) ) {s = 20;}

                        else if ( (LA53_0==RULE_PARAM_START) ) {s = 21;}

                        else if ( (LA53_0==RULE_FUNC_ARROW) ) {s = 22;}

                        else if ( (LA53_0==RULE_BOUND_FUNC_ARROW) ) {s = 23;}

                        else if ( (LA53_0==RULE_FOR) ) {s = 24;}

                        else if ( (LA53_0==RULE_WHILE) ) {s = 25;}

                        else if ( (LA53_0==RULE_UNTIL) ) {s = 26;}

                        else if ( (LA53_0==RULE_LOOP) ) {s = 27;}

                        else if ( (LA53_0==RULE_TRY) ) {s = 28;}

                        else if ( (LA53_0==RULE_SWITCH) ) {s = 29;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_3 = input.LA(1);

                         
                        int index53_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_4 = input.LA(1);

                         
                        int index53_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA53_5 = input.LA(1);

                         
                        int index53_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA53_6 = input.LA(1);

                         
                        int index53_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA53_7 = input.LA(1);

                         
                        int index53_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA53_10 = input.LA(1);

                         
                        int index53_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA53_11 = input.LA(1);

                         
                        int index53_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA53_12 = input.LA(1);

                         
                        int index53_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA53_13 = input.LA(1);

                         
                        int index53_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA53_14 = input.LA(1);

                         
                        int index53_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA53_15 = input.LA(1);

                         
                        int index53_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA53_16 = input.LA(1);

                         
                        int index53_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA53_17 = input.LA(1);

                         
                        int index53_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA53_18 = input.LA(1);

                         
                        int index53_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA53_19 = input.LA(1);

                         
                        int index53_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA53_20 = input.LA(1);

                         
                        int index53_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA53_21 = input.LA(1);

                         
                        int index53_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA53_22 = input.LA(1);

                         
                        int index53_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA53_23 = input.LA(1);

                         
                        int index53_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA53_24 = input.LA(1);

                         
                        int index53_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_24);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA53_25 = input.LA(1);

                         
                        int index53_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA53_26 = input.LA(1);

                         
                        int index53_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_26);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA53_27 = input.LA(1);

                         
                        int index53_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_27);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA53_28 = input.LA(1);

                         
                        int index53_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_28);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA53_29 = input.LA(1);

                         
                        int index53_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCoffeeScript()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index53_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA61_eotS =
        "\30\uffff";
    static final String DFA61_eofS =
        "\30\uffff";
    static final String DFA61_minS =
        "\1\11\7\uffff\1\0\17\uffff";
    static final String DFA61_maxS =
        "\1\110\7\uffff\1\0\17\uffff";
    static final String DFA61_acceptS =
        "\1\uffff\1\1\1\2\1\3\5\uffff\1\6\1\7\2\uffff\1\10\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\1\20\1\4\1\5";
    static final String DFA61_specialS =
        "\1\0\7\uffff\1\1\17\uffff}>";
    static final String[] DFA61_transitionS = {
            "\1\3\6\uffff\1\17\1\20\1\uffff\1\21\5\uffff\1\10\23\uffff\1"+
            "\15\5\uffff\1\16\1\22\1\23\2\uffff\1\24\2\uffff\1\1\1\25\1\11"+
            "\2\uffff\1\12\1\uffff\2\12\4\3\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
    static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
    static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
    static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
    static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
    static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
    static final short[][] DFA61_transition;

    static {
        int numStates = DFA61_transitionS.length;
        DFA61_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = DFA61_eot;
            this.eof = DFA61_eof;
            this.min = DFA61_min;
            this.max = DFA61_max;
            this.accept = DFA61_accept;
            this.special = DFA61_special;
            this.transition = DFA61_transition;
        }
        public String getDescription() {
            return "2857:1: (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_0 = input.LA(1);

                         
                        int index61_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA61_0==RULE_IF) ) {s = 1;}

                        else if ( (LA61_0==RULE_LPAREN) ) {s = 2;}

                        else if ( (LA61_0==RULE_STRING||(LA61_0>=RULE_NUMBER && LA61_0<=RULE_REGEX)) ) {s = 3;}

                        else if ( (LA61_0==RULE_LBRACKET) ) {s = 8;}

                        else if ( (LA61_0==RULE_LCURLY) && (synpred28_InternalCoffeeScript())) {s = 9;}

                        else if ( (LA61_0==RULE_PARAM_START||(LA61_0>=RULE_FUNC_ARROW && LA61_0<=RULE_BOUND_FUNC_ARROW)) ) {s = 10;}

                        else if ( (LA61_0==RULE_AT_SIGIL) ) {s = 13;}

                        else if ( (LA61_0==RULE_THIS) ) {s = 14;}

                        else if ( (LA61_0==RULE_FOR) ) {s = 15;}

                        else if ( (LA61_0==RULE_WHILE) ) {s = 16;}

                        else if ( (LA61_0==RULE_UNTIL) ) {s = 17;}

                        else if ( (LA61_0==RULE_LOOP) ) {s = 18;}

                        else if ( (LA61_0==RULE_TRY) ) {s = 19;}

                        else if ( (LA61_0==RULE_SWITCH) ) {s = 20;}

                        else if ( (LA61_0==RULE_IDENTIFIER) ) {s = 21;}

                         
                        input.seek(index61_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_8 = input.LA(1);

                         
                        int index61_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCoffeeScript()) ) {s = 22;}

                        else if ( (synpred27_InternalCoffeeScript()) ) {s = 23;}

                         
                        input.seek(index61_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA94_eotS =
        "\43\uffff";
    static final String DFA94_eofS =
        "\43\uffff";
    static final String DFA94_minS =
        "\1\110\1\5\41\uffff";
    static final String DFA94_maxS =
        "\2\110\41\uffff";
    static final String DFA94_acceptS =
        "\2\uffff\1\1\40\2";
    static final String DFA94_specialS =
        "\1\uffff\1\0\41\uffff}>";
    static final String[] DFA94_transitionS = {
            "\1\1",
            "\1\10\1\6\2\uffff\1\26\1\uffff\1\3\1\uffff\1\4\1\7\1\uffff"+
            "\1\35\1\36\1\uffff\1\37\5\uffff\1\14\4\uffff\1\2\5\uffff\1\16"+
            "\1\17\1\uffff\1\15\1\20\1\21\1\uffff\1\22\1\uffff\1\11\5\uffff"+
            "\1\12\1\40\1\41\2\uffff\1\42\2\uffff\1\23\1\5\1\13\2\uffff\1"+
            "\32\1\uffff\1\33\1\34\1\25\1\27\1\30\1\31\1\24",
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
            ""
    };

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }
        public String getDescription() {
            return "5327:1: ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA94_1 = input.LA(1);

                         
                        int index94_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA94_1==RULE_INDENT) && (synpred38_InternalCoffeeScript())) {s = 2;}

                        else if ( (LA94_1==RULE_RETURN) && (synpred39_InternalCoffeeScript())) {s = 3;}

                        else if ( (LA94_1==RULE_THROW) && (synpred39_InternalCoffeeScript())) {s = 4;}

                        else if ( (LA94_1==RULE_IDENTIFIER) && (synpred39_InternalCoffeeScript())) {s = 5;}

                        else if ( (LA94_1==RULE_HERECOMMENT) && (synpred39_InternalCoffeeScript())) {s = 6;}

                        else if ( (LA94_1==RULE_CLASS) && (synpred39_InternalCoffeeScript())) {s = 7;}

                        else if ( (LA94_1==RULE_STATEMENT) && (synpred39_InternalCoffeeScript())) {s = 8;}

                        else if ( (LA94_1==RULE_AT_SIGIL) && (synpred39_InternalCoffeeScript())) {s = 9;}

                        else if ( (LA94_1==RULE_THIS) && (synpred39_InternalCoffeeScript())) {s = 10;}

                        else if ( (LA94_1==RULE_LCURLY) && (synpred39_InternalCoffeeScript())) {s = 11;}

                        else if ( (LA94_1==RULE_LBRACKET) && (synpred39_InternalCoffeeScript())) {s = 12;}

                        else if ( (LA94_1==RULE_UNARY) && (synpred39_InternalCoffeeScript())) {s = 13;}

                        else if ( (LA94_1==RULE_PLUS) && (synpred39_InternalCoffeeScript())) {s = 14;}

                        else if ( (LA94_1==RULE_MINUS) && (synpred39_InternalCoffeeScript())) {s = 15;}

                        else if ( (LA94_1==RULE_PLUS_PLUS) && (synpred39_InternalCoffeeScript())) {s = 16;}

                        else if ( (LA94_1==RULE_MINUS_MINUS) && (synpred39_InternalCoffeeScript())) {s = 17;}

                        else if ( (LA94_1==RULE_SUPER) && (synpred39_InternalCoffeeScript())) {s = 18;}

                        else if ( (LA94_1==RULE_IF) && (synpred39_InternalCoffeeScript())) {s = 19;}

                        else if ( (LA94_1==RULE_LPAREN) && (synpred39_InternalCoffeeScript())) {s = 20;}

                        else if ( (LA94_1==RULE_NUMBER) && (synpred39_InternalCoffeeScript())) {s = 21;}

                        else if ( (LA94_1==RULE_STRING) && (synpred39_InternalCoffeeScript())) {s = 22;}

                        else if ( (LA94_1==RULE_BOOL) && (synpred39_InternalCoffeeScript())) {s = 23;}

                        else if ( (LA94_1==RULE_JS) && (synpred39_InternalCoffeeScript())) {s = 24;}

                        else if ( (LA94_1==RULE_REGEX) && (synpred39_InternalCoffeeScript())) {s = 25;}

                        else if ( (LA94_1==RULE_PARAM_START) && (synpred39_InternalCoffeeScript())) {s = 26;}

                        else if ( (LA94_1==RULE_FUNC_ARROW) && (synpred39_InternalCoffeeScript())) {s = 27;}

                        else if ( (LA94_1==RULE_BOUND_FUNC_ARROW) && (synpred39_InternalCoffeeScript())) {s = 28;}

                        else if ( (LA94_1==RULE_FOR) && (synpred39_InternalCoffeeScript())) {s = 29;}

                        else if ( (LA94_1==RULE_WHILE) && (synpred39_InternalCoffeeScript())) {s = 30;}

                        else if ( (LA94_1==RULE_UNTIL) && (synpred39_InternalCoffeeScript())) {s = 31;}

                        else if ( (LA94_1==RULE_LOOP) && (synpred39_InternalCoffeeScript())) {s = 32;}

                        else if ( (LA94_1==RULE_TRY) && (synpred39_InternalCoffeeScript())) {s = 33;}

                        else if ( (LA94_1==RULE_SWITCH) && (synpred39_InternalCoffeeScript())) {s = 34;}

                         
                        input.seek(index94_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 94, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleRoot_in_entryRuleRoot75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoot85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_ruleRoot132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleRoot160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleRoot170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_ruleBody263 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleBody275 = new BitSet(new long[]{0x39382BB0020B6A72L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleLine_in_ruleBody295 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine334 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_ruleLine391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLine418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_entryRuleStmt453 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmt463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStmt_in_ruleStmt510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrowStmt_in_ruleStmt537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequireStmt_in_ruleStmt585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleStmt613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDeclaration_in_ruleStmt640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATEMENT_in_ruleStmt662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HERECOMMENT_in_ruleComment754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequireStmt_in_entryRuleRequireStmt794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequireStmt804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleRequireStmt872 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleRequireStmt883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleRequireStmt894 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CALL_START_in_ruleRequireStmt907 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequireStmt923 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CALL_END_in_ruleRequireStmt939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStmt_in_entryRuleReturnStmt974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStmt984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_in_ruleReturnStmt1029 = new BitSet(new long[]{0x39382BB0020B7A62L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStmt1049 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_RULE_POST_IF_in_ruleReturnStmt1062 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStmt1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrowStmt_in_entryRuleThrowStmt1120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrowStmt1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THROW_in_ruleThrowStmt1166 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleThrowStmt1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperClass_in_entryRuleSuperClass1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperClass1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleSuperClass1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleSuperClass1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDeclaration_in_entryRuleClassDeclaration1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDeclaration1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLASS_in_ruleClassDeclaration1396 = new BitSet(new long[]{0x1008200040008002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleClassDeclaration1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleClassDeclaration1435 = new BitSet(new long[]{0x1008200000000000L});
    public static final BitSet FOLLOW_ruleSuperClass_in_ruleClassDeclaration1455 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleClassDeclaration1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleClassDeclaration1508 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleClassDeclaration1527 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleClassDeclaration1542 = new BitSet(new long[]{0x1008200000000000L});
    public static final BitSet FOLLOW_ruleSuperClass_in_ruleClassDeclaration1562 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleClassDeclaration1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignedClassDeclaration_in_entryRuleAssignedClassDeclaration1624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignedClassDeclaration1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLASS_in_ruleAssignedClassDeclaration1679 = new BitSet(new long[]{0x1008200000008002L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleAssignedClassDeclaration1691 = new BitSet(new long[]{0x1008200000000000L});
    public static final BitSet FOLLOW_ruleSuperClass_in_ruleAssignedClassDeclaration1711 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAssignedClassDeclaration1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleAssignedClassDeclaration1763 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleAssignedClassDeclaration1782 = new BitSet(new long[]{0x0000000040008000L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleAssignedClassDeclaration1797 = new BitSet(new long[]{0x1008200000000000L});
    public static final BitSet FOLLOW_ruleSuperClass_in_ruleAssignedClassDeclaration1817 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAssignedClassDeclaration1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1879 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_ruleExpression1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_entryRulePostfix1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfix1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rulePostfix2026 = new BitSet(new long[]{0x00000000000B1002L});
    public static final BitSet FOLLOW_RULE_POST_IF_in_rulePostfix2044 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_rulePostfix2099 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_ruleForBody_in_rulePostfix2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_rulePostfix2154 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2184 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_rulePostfix2202 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNTIL_in_rulePostfix2250 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2280 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_rulePostfix2298 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForBody_in_entryRuleForBody2360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForBody2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OWN_in_ruleForBody2407 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_ruleForValue_in_ruleForBody2429 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleForBody2441 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_ruleForValue_in_ruleForBody2461 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_ruleForSource_in_ruleForBody2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForValue_in_entryRuleForValue2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForValue2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleForValue2576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForSource_in_entryRuleForSource2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForSource2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOROF_in_ruleForSource2673 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2694 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_ruleForSource2712 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORIN_in_ruleForSource2760 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2781 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_ruleForSource2800 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2821 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_RULE_BY_in_ruleForSource2839 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BY_in_ruleForSource2887 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2908 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_ruleForSource2926 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange2990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange3000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleRange3066 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRange3086 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_RULE_DOT_DOT_in_ruleRange3098 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleRange3114 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRange3137 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleRange3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignable_in_ruleAssignment3281 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleAssignment3300 = new BitSet(new long[]{0x39382BB0420B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_RULE_COMPOUND_ASSIGN_in_ruleAssignment3320 = new BitSet(new long[]{0x39382BB0420B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleAssigned_in_ruleAssignment3351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOp_in_ruleAssignment3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigned_in_entryRuleAssigned3415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssigned3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssigned3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleAssigned3489 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssigned3510 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleAssigned3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignedClassDeclaration_in_ruleAssigned3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOp_in_entryRuleLogicOp3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOp3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOp_in_ruleLogicOp3640 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_RULE_LOGIC_in_ruleLogicOp3686 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleCompareOp_in_ruleLogicOp3714 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleCompareOp_in_entryRuleCompareOp3752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOp3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationOp_in_ruleCompareOp3809 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_ruleCompareOp3855 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleRelationOp_in_ruleCompareOp3883 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleRelationOp_in_entryRuleRelationOp3921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationOp3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOp_in_ruleRelationOp3978 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_RULE_RELATION_in_ruleRelationOp4024 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleShiftOp_in_ruleRelationOp4052 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleShiftOp_in_entryRuleShiftOp4090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftOp4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOp_in_ruleShiftOp4147 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_RULE_SHIFT_in_ruleShiftOp4193 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleAdditiveOp_in_ruleShiftOp4221 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleAdditiveOp_in_entryRuleAdditiveOp4259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveOp4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOp_in_ruleAdditiveOp4316 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleAdditiveOp4379 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleAdditiveOp4399 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleMathOp_in_ruleAdditiveOp4430 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_ruleMathOp_in_entryRuleMathOp4468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOp4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleMathOp4525 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_RULE_MATH_in_ruleMathOp4571 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleMathOp4599 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp4637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOp4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNARY_in_ruleUnaryOp4685 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleUnaryOp4701 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleUnaryOp4717 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleUnaryOp4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_PLUS_in_ruleUnaryOp4758 = new BitSet(new long[]{0x1008200000000000L});
    public static final BitSet FOLLOW_RULE_MINUS_MINUS_in_ruleUnaryOp4774 = new BitSet(new long[]{0x1008200000000000L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleUnaryOp4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleUnaryOp4825 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_QUESTION_in_ruleUnaryOp4836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication4874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SUPER_in_ruleApplication4931 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_CALL_START_in_ruleApplication4942 = new BitSet(new long[]{0x39382BB0420B6E60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleArgList_in_ruleApplication4962 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CALL_END_in_ruleApplication4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleApplication5004 = new BitSet(new long[]{0x0003D00000000102L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleApplication5025 = new BitSet(new long[]{0x0003D00000000102L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall5063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleFeatureCall5120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAccess_in_ruleFeatureCall5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FUNC_EXIST_in_ruleFunctionCall5238 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_CALL_START_in_ruleFunctionCall5250 = new BitSet(new long[]{0x39382BB0420B6E60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleArgList_in_ruleFunctionCall5270 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CALL_END_in_ruleFunctionCall5281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAccess_in_entryRulePropertyAccess5316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAccess5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPropertyAccess_in_rulePropertyAccess5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedPropertyAccess_in_rulePropertyAccess5400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisProperty_in_entryRuleThisProperty5435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThisProperty5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_SIGIL_in_ruleThisProperty5481 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleId_in_ruleThisProperty5502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPropertyAccess_in_entryRuleNamedPropertyAccess5537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedPropertyAccess5547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleNamedPropertyAccess5592 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RULE_QUESTION_DOT_in_ruleNamedPropertyAccess5612 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleId_in_ruleNamedPropertyAccess5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_COLON_in_ruleNamedPropertyAccess5666 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleNamedPropertyAccess5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedPropertyAccess_in_entryRuleIndexedPropertyAccess5730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedPropertyAccess5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDEX_START_in_ruleIndexedPropertyAccess5776 = new BitSet(new long[]{0x39382BB00E0B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleIndex_in_ruleIndexedPropertyAccess5796 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RULE_INDEX_END_in_ruleIndexedPropertyAccess5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndex_in_entryRuleIndex5842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndex5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_DOT_in_ruleIndex5923 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleIndex5943 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIndex5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIndex6042 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_RULE_DOT_DOT_in_ruleIndex6061 = new BitSet(new long[]{0x39382BB0020B6A62L,0x00000000000001FDL});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleIndex6081 = new BitSet(new long[]{0x39382BB0020B6A62L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIndex6112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIndex6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_rulePrimaryExpression6234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthetical_in_rulePrimaryExpression6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression6288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rulePrimaryExpression6344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rulePrimaryExpression6378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_rulePrimaryExpression6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLambda_in_rulePrimaryExpression6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisProperty_in_rulePrimaryExpression6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THIS_in_rulePrimaryExpression6493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_rulePrimaryExpression6521 = new BitSet(new long[]{0x1000000000100000L});
    public static final BitSet FOLLOW_ruleForBody_in_rulePrimaryExpression6541 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_rulePrimaryExpression6592 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression6612 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_RULE_WHEN_in_rulePrimaryExpression6624 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression6644 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNTIL_in_rulePrimaryExpression6697 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression6717 = new BitSet(new long[]{0x0000000040040000L});
    public static final BitSet FOLLOW_RULE_WHEN_in_rulePrimaryExpression6729 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression6749 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOOP_in_rulePrimaryExpression6802 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRY_in_rulePrimaryExpression6852 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6872 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_RULE_CATCH_in_rulePrimaryExpression6885 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleId_in_rulePrimaryExpression6905 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6926 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_rulePrimaryExpression6938 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_rulePrimaryExpression6979 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SWITCH_in_rulePrimaryExpression7032 = new BitSet(new long[]{0x39382BB0420B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression7052 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_INDENT_in_rulePrimaryExpression7064 = new BitSet(new long[]{0x0600000080000000L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression7084 = new BitSet(new long[]{0x0600000080000000L});
    public static final BitSet FOLLOW_RULE_ELSE_in_rulePrimaryExpression7097 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression7117 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_rulePrimaryExpression7130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_rulePrimaryExpression7159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock7194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleBlock7249 = new BitSet(new long[]{0x39382BB0820B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleBody_in_ruleBlock7271 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleBlock7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase7318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEADING_WHEN_in_ruleCase7364 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCase7384 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCase7396 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCase7416 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCase7439 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleCase7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp7488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp7498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp7544 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_ruleIfExp7556 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp7576 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_ruleIfExp7590 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfExp7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock7648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock7658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_in_ruleCondBlock7700 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondBlock7726 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCondBlock7747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_entryRuleIdRef7783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdRef7793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleIdRef7837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_entryRuleId7872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleId7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleId7923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty7963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleProperty8065 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleProperty8083 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RULE_DOUBLE_COLON_in_ruleProperty8103 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RULE_QUESTION_DOT_in_ruleProperty8123 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleId_in_ruleProperty8154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleProperty8195 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RULE_INDEX_START_in_ruleProperty8205 = new BitSet(new long[]{0x39382BB00E0B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleIndex_in_ruleProperty8227 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RULE_INDEX_END_in_ruleProperty8238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8274 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable8284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleVariable8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_SIGIL_in_ruleVariable8349 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RULE_THIS_in_ruleVariable8366 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariable8376 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleId_in_ruleVariable8399 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariable8410 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_ruleId_in_ruleVariable8430 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleVariable8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignableArray_in_entryRuleAssignableArray8496 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignableArray8506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleAssignableArray8548 = new BitSet(new long[]{0x3008200002000000L});
    public static final BitSet FOLLOW_ruleAssignableArgList_in_ruleAssignableArray8570 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleAssignableArray8580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignableArgList_in_entryRuleAssignableArgList8615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignableArgList8625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignableArg_in_ruleAssignableArgList8671 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleAssignableArgList8683 = new BitSet(new long[]{0x3008200002000000L});
    public static final BitSet FOLLOW_ruleAssignableArg_in_ruleAssignableArgList8703 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAssignableArg_in_entryRuleAssignableArg8741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignableArg8751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignable_in_ruleAssignableArg8797 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleAssignableArg8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignable_in_entryRuleAssignable8856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignable8866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssignable8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_ruleAssignable8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignableArray_in_ruleAssignable8980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_entryRuleArg9016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArg9072 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleArg9089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgLine_in_entryRuleArgLine9131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgLine9141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_ruleArgLine9187 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleArgLine9199 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleArg_in_ruleArgLine9219 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleArgLine9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitArgList_in_entryRuleExplicitArgList9270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitArgList9280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgLine_in_ruleExplicitArgList9326 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleExplicitArgList9339 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleArgLine_in_ruleExplicitArgList9359 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleExplicitArgList9378 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleArgLine_in_ruleExplicitArgList9398 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleExplicitArgList9409 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_ruleArgList_in_entryRuleArgList9447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgList9457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitArgList_in_ruleArgList9513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleArgList9531 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExplicitArgList_in_ruleArgList9551 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleArgList9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray9600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleArray9652 = new BitSet(new long[]{0x39382BB0520B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleArgList_in_ruleArray9674 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleArray9684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_entryRuleDictionary9719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionary9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleDictionary9771 = new BitSet(new long[]{0x5000000040000200L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleDictItems_in_ruleDictionary9793 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleDictionary9803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictItems_in_entryRuleDictItems9838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictItems9848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitDictItems_in_ruleDictItems9904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleDictItems9922 = new BitSet(new long[]{0x1000000000000200L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleExplicitDictItems_in_ruleDictItems9942 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleDictItems9953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitDictItems_in_entryRuleExplicitDictItems9991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitDictItems10001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictLine_in_ruleExplicitDictItems10047 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleExplicitDictItems10060 = new BitSet(new long[]{0x1000000000000200L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleDictLine_in_ruleExplicitDictItems10080 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleExplicitDictItems10099 = new BitSet(new long[]{0x1000000000000200L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleDictLine_in_ruleExplicitDictItems10119 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleExplicitDictItems10130 = new BitSet(new long[]{0x0000000040000012L});
    public static final BitSet FOLLOW_ruleDictLine_in_entryRuleDictLine10168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictLine10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictItem_in_ruleDictLine10224 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleDictLine10236 = new BitSet(new long[]{0x1000000000000200L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleDictItem_in_ruleDictLine10256 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleDictLine10270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictItem_in_entryRuleDictItem10307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictItem10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictKey_in_ruleDictItem10372 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleDictItem10384 = new BitSet(new long[]{0x39382BB0420B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDictItem10405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleDictItem10423 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDictItem10443 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleDictItem10454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictKey_in_entryRuleDictKey10493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictKey10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleDictKey10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleDictKey10577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLambda_in_entryRuleLambda10612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLambda10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAM_START_in_ruleLambda10659 = new BitSet(new long[]{0x3000200002000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_ruleLambda10680 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleLambda10692 = new BitSet(new long[]{0x3000200002000000L});
    public static final BitSet FOLLOW_ruleParam_in_ruleLambda10712 = new BitSet(new long[]{0x0000000000200000L,0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAM_END_in_ruleLambda10727 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_RULE_FUNC_ARROW_in_ruleLambda10740 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_BOUND_FUNC_ARROW_in_ruleLambda10756 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleLambda10777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam10813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam10823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleParam10871 = new BitSet(new long[]{0x0000000008000082L});
    public static final BitSet FOLLOW_ruleArray_in_ruleParam10904 = new BitSet(new long[]{0x0000000008000082L});
    public static final BitSet FOLLOW_ruleDictionary_in_ruleParam10938 = new BitSet(new long[]{0x0000000008000082L});
    public static final BitSet FOLLOW_ruleThisProperty_in_ruleParam10966 = new BitSet(new long[]{0x0000000008000082L});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleParam10984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleParam11007 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParam11027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral11066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral11076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleNumberLiteral11121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11156 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral11166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral11211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral11246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral11256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSLiteral_in_entryRuleJSLiteral11336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJSLiteral11346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JS_in_ruleJSLiteral11391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegexLiteral_in_entryRuleRegexLiteral11426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegexLiteral11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGEX_in_ruleRegexLiteral11481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral11516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral11526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral11573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral11627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSLiteral_in_ruleLiteral11654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegexLiteral_in_ruleLiteral11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthetical_in_entryRuleParenthetical11716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthetical11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleParenthetical11774 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleParenthetical11784 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleBody_in_ruleParenthetical11806 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleParenthetical11817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleParenthetical11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleParenthetical11851 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleBody_in_ruleParenthetical11872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleParenthetical11883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_synpred1_InternalCoffeeScript558 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_synpred1_InternalCoffeeScript564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_synpred1_InternalCoffeeScript566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POST_IF_in_synpred3_InternalCoffeeScript2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_synpred4_InternalCoffeeScript2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_synpred5_InternalCoffeeScript2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred6_InternalCoffeeScript2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNTIL_in_synpred7_InternalCoffeeScript2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred8_InternalCoffeeScript2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOROF_in_synpred9_InternalCoffeeScript2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred10_InternalCoffeeScript2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORIN_in_synpred11_InternalCoffeeScript2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred12_InternalCoffeeScript2795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BY_in_synpred13_InternalCoffeeScript2834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BY_in_synpred14_InternalCoffeeScript2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred15_InternalCoffeeScript2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignable_in_synpred17_InternalCoffeeScript3235 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_set_in_synpred17_InternalCoffeeScript3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOGIC_in_synpred18_InternalCoffeeScript3659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_synpred19_InternalCoffeeScript3828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATION_in_synpred20_InternalCoffeeScript3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SHIFT_in_synpred21_InternalCoffeeScript4166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred22_InternalCoffeeScript4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MATH_in_synpred23_InternalCoffeeScript4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred24_InternalCoffeeScript5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred25_InternalCoffeeScript5996 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_set_in_synpred25_InternalCoffeeScript6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_synpred26_InternalCoffeeScript6306 = new BitSet(new long[]{0x39382BB0020B6A60L,0x00000000000001FDL});
    public static final BitSet FOLLOW_ruleExpression_in_synpred26_InternalCoffeeScript6311 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_set_in_synpred26_InternalCoffeeScript6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_synpred27_InternalCoffeeScript6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_synpred28_InternalCoffeeScript6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_synpred29_InternalCoffeeScript8012 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_set_in_synpred29_InternalCoffeeScript8017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_synpred30_InternalCoffeeScript8175 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_RULE_INDEX_START_in_synpred30_InternalCoffeeScript8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_synpred32_InternalCoffeeScript8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_synpred33_InternalCoffeeScript8964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_synpred36_InternalCoffeeScript10888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_synpred37_InternalCoffeeScript10922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_synpred38_InternalCoffeeScript11765 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_RULE_INDENT_in_synpred38_InternalCoffeeScript11767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_synpred39_InternalCoffeeScript11846 = new BitSet(new long[]{0x0000000000000002L});

}