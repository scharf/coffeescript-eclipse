package csep.example.cake.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import csep.example.cake.services.CakefileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalCakefileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TASK", "RULE_CALL_START", "RULE_COMMA", "RULE_PARAM_START", "RULE_PARAM_END", "RULE_FUNC_ARROW", "RULE_CALL_END", "RULE_TERMINATOR", "RULE_STATEMENT", "RULE_HERECOMMENT", "RULE_EQUAL", "RULE_STRING", "RULE_RETURN", "RULE_POST_IF", "RULE_THROW", "RULE_CLASS", "RULE_EXTENDS", "RULE_FOR", "RULE_WHILE", "RULE_WHEN", "RULE_UNTIL", "RULE_OWN", "RULE_FOROF", "RULE_FORIN", "RULE_BY", "RULE_LBRACKET", "RULE_DOT_DOT", "RULE_ELLIPSIS", "RULE_RBRACKET", "RULE_COMPOUND_ASSIGN", "RULE_INDENT", "RULE_OUTDENT", "RULE_LOGIC", "RULE_COMPARE", "RULE_RELATION", "RULE_SHIFT", "RULE_PLUS", "RULE_MINUS", "RULE_MATH", "RULE_UNARY", "RULE_PLUS_PLUS", "RULE_MINUS_MINUS", "RULE_QUESTION", "RULE_SUPER", "RULE_FUNC_EXIST", "RULE_AT_SIGIL", "RULE_DOT", "RULE_QUESTION_DOT", "RULE_DOUBLE_COLON", "RULE_INDEX_START", "RULE_INDEX_END", "RULE_THIS", "RULE_LOOP", "RULE_TRY", "RULE_CATCH", "RULE_FINALLY", "RULE_SWITCH", "RULE_ELSE", "RULE_LEADING_WHEN", "RULE_IF", "RULE_IDENTIFIER", "RULE_LCURLY", "RULE_RCURLY", "RULE_COLON", "RULE_BOUND_FUNC_ARROW", "RULE_NUMBER", "RULE_BOOL", "RULE_JS", "RULE_REGEX", "RULE_LPAREN", "RULE_RPAREN", "RULE_COLON_SLASH", "RULE_INDEX_PROTO", "RULE_INDEX_SOAK", "RULE_NEW", "RULE_THEN", "RULE_LOGIC_WORD", "RULE_COMPARE_WORD", "RULE_UNARY_WORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'require'"
    };
    public static final int RULE_BOUND_FUNC_ARROW=68;
    public static final int RULE_SWITCH=60;
    public static final int RULE_THROW=18;
    public static final int RULE_PARAM_START=7;
    public static final int RULE_TERMINATOR=11;
    public static final int RULE_CALL_END=10;
    public static final int RULE_RETURN=16;
    public static final int RULE_FOR=21;
    public static final int RULE_BOOL=70;
    public static final int RULE_LBRACKET=29;
    public static final int RULE_DOUBLE_COLON=52;
    public static final int RULE_MINUS_MINUS=45;
    public static final int RULE_COMPARE_WORD=81;
    public static final int EOF=-1;
    public static final int RULE_OUTDENT=35;
    public static final int RULE_RELATION=38;
    public static final int RULE_REGEX=72;
    public static final int RULE_CLASS=19;
    public static final int RULE_WHILE=22;
    public static final int RULE_COLON_SLASH=75;
    public static final int RULE_FUNC_EXIST=48;
    public static final int RULE_DOT=50;
    public static final int RULE_POST_IF=17;
    public static final int RULE_PLUS_PLUS=44;
    public static final int RULE_OWN=25;
    public static final int RULE_NUMBER=69;
    public static final int RULE_LOOP=56;
    public static final int RULE_LPAREN=73;
    public static final int RULE_FUNC_ARROW=9;
    public static final int RULE_AT_SIGIL=49;
    public static final int RULE_EXTENDS=20;
    public static final int RULE_SHIFT=39;
    public static final int RULE_INDEX_END=54;
    public static final int RULE_COMPARE=37;
    public static final int RULE_QUESTION_DOT=51;
    public static final int RULE_RBRACKET=32;
    public static final int RULE_COMPOUND_ASSIGN=33;
    public static final int RULE_SUPER=47;
    public static final int RULE_THEN=79;
    public static final int RULE_UNARY_WORD=82;
    public static final int RULE_LEADING_WHEN=62;
    public static final int RULE_TASK=4;
    public static final int RULE_DOT_DOT=30;
    public static final int RULE_STATEMENT=12;
    public static final int RULE_PLUS=40;
    public static final int RULE_BY=28;
    public static final int RULE_INDEX_SOAK=77;
    public static final int RULE_CATCH=58;
    public static final int RULE_CALL_START=5;
    public static final int RULE_INDEX_PROTO=76;
    public static final int RULE_IDENTIFIER=64;
    public static final int RULE_COMMA=6;
    public static final int RULE_TRY=57;
    public static final int RULE_JS=71;
    public static final int RULE_EQUAL=14;
    public static final int RULE_INDENT=34;
    public static final int RULE_HERECOMMENT=13;
    public static final int RULE_FORIN=27;
    public static final int RULE_ELLIPSIS=31;
    public static final int RULE_SL_COMMENT=84;
    public static final int RULE_PARAM_END=8;
    public static final int T__86=86;
    public static final int RULE_ML_COMMENT=83;
    public static final int RULE_WHEN=23;
    public static final int RULE_INDEX_START=53;
    public static final int RULE_COLON=67;
    public static final int RULE_MINUS=41;
    public static final int RULE_STRING=15;
    public static final int RULE_NEW=78;
    public static final int RULE_LOGIC_WORD=80;
    public static final int RULE_LOGIC=36;
    public static final int RULE_RPAREN=74;
    public static final int RULE_WS=85;
    public static final int RULE_FOROF=26;
    public static final int RULE_IF=63;
    public static final int RULE_THIS=55;
    public static final int RULE_UNARY=43;
    public static final int RULE_RCURLY=66;
    public static final int RULE_ELSE=61;
    public static final int RULE_FINALLY=59;
    public static final int RULE_MATH=42;
    public static final int RULE_LCURLY=65;
    public static final int RULE_QUESTION=46;
    public static final int RULE_UNTIL=24;

    // delegates
    // delegators


        public InternalCakefileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCakefileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCakefileParser.tokenNames; }
    public String getGrammarFileName() { return "../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g"; }



     	private CakefileGrammarAccess grammarAccess;
     	
        public InternalCakefileParser(TokenStream input, CakefileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Cakefile";	
       	}
       	
       	@Override
       	protected CakefileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleCakefile"
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:67:1: entryRuleCakefile returns [EObject current=null] : iv_ruleCakefile= ruleCakefile EOF ;
    public final EObject entryRuleCakefile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCakefile = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:68:2: (iv_ruleCakefile= ruleCakefile EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:69:2: iv_ruleCakefile= ruleCakefile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCakefileRule()); 
            }
            pushFollow(FOLLOW_ruleCakefile_in_entryRuleCakefile75);
            iv_ruleCakefile=ruleCakefile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCakefile; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCakefile85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCakefile"


    // $ANTLR start "ruleCakefile"
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:76:1: ruleCakefile returns [EObject current=null] : ( (lv_tasks_0_0= ruleTaskDeclaration ) )* ;
    public final EObject ruleCakefile() throws RecognitionException {
        EObject current = null;

        EObject lv_tasks_0_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:79:28: ( ( (lv_tasks_0_0= ruleTaskDeclaration ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:80:1: ( (lv_tasks_0_0= ruleTaskDeclaration ) )*
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:80:1: ( (lv_tasks_0_0= ruleTaskDeclaration ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_TASK) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:81:1: (lv_tasks_0_0= ruleTaskDeclaration )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:81:1: (lv_tasks_0_0= ruleTaskDeclaration )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:82:3: lv_tasks_0_0= ruleTaskDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCakefileAccess().getTasksTaskDeclarationParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTaskDeclaration_in_ruleCakefile130);
            	    lv_tasks_0_0=ruleTaskDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCakefileRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tasks",
            	              		lv_tasks_0_0, 
            	              		"TaskDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleCakefile"


    // $ANTLR start "entryRuleTaskDeclaration"
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:106:1: entryRuleTaskDeclaration returns [EObject current=null] : iv_ruleTaskDeclaration= ruleTaskDeclaration EOF ;
    public final EObject entryRuleTaskDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDeclaration = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:107:2: (iv_ruleTaskDeclaration= ruleTaskDeclaration EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:108:2: iv_ruleTaskDeclaration= ruleTaskDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTaskDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleTaskDeclaration_in_entryRuleTaskDeclaration166);
            iv_ruleTaskDeclaration=ruleTaskDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTaskDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTaskDeclaration176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTaskDeclaration"


    // $ANTLR start "ruleTaskDeclaration"
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:115:1: ruleTaskDeclaration returns [EObject current=null] : (this_TASK_0= RULE_TASK this_CALL_START_1= RULE_CALL_START ( (lv_name_2_0= ruleStringLiteral ) ) this_COMMA_3= RULE_COMMA ( (lv_description_4_0= ruleStringLiteral ) ) this_COMMA_5= RULE_COMMA (this_PARAM_START_6= RULE_PARAM_START ( (lv_options_7_0= ruleId ) ) this_PARAM_END_8= RULE_PARAM_END )? this_FUNC_ARROW_9= RULE_FUNC_ARROW ( (lv_body_10_0= ruleBlock ) ) this_CALL_END_11= RULE_CALL_END this_TERMINATOR_12= RULE_TERMINATOR ) ;
    public final EObject ruleTaskDeclaration() throws RecognitionException {
        EObject current = null;

        Token this_TASK_0=null;
        Token this_CALL_START_1=null;
        Token this_COMMA_3=null;
        Token this_COMMA_5=null;
        Token this_PARAM_START_6=null;
        Token this_PARAM_END_8=null;
        Token this_FUNC_ARROW_9=null;
        Token this_CALL_END_11=null;
        Token this_TERMINATOR_12=null;
        EObject lv_name_2_0 = null;

        EObject lv_description_4_0 = null;

        EObject lv_options_7_0 = null;

        EObject lv_body_10_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:118:28: ( (this_TASK_0= RULE_TASK this_CALL_START_1= RULE_CALL_START ( (lv_name_2_0= ruleStringLiteral ) ) this_COMMA_3= RULE_COMMA ( (lv_description_4_0= ruleStringLiteral ) ) this_COMMA_5= RULE_COMMA (this_PARAM_START_6= RULE_PARAM_START ( (lv_options_7_0= ruleId ) ) this_PARAM_END_8= RULE_PARAM_END )? this_FUNC_ARROW_9= RULE_FUNC_ARROW ( (lv_body_10_0= ruleBlock ) ) this_CALL_END_11= RULE_CALL_END this_TERMINATOR_12= RULE_TERMINATOR ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:119:1: (this_TASK_0= RULE_TASK this_CALL_START_1= RULE_CALL_START ( (lv_name_2_0= ruleStringLiteral ) ) this_COMMA_3= RULE_COMMA ( (lv_description_4_0= ruleStringLiteral ) ) this_COMMA_5= RULE_COMMA (this_PARAM_START_6= RULE_PARAM_START ( (lv_options_7_0= ruleId ) ) this_PARAM_END_8= RULE_PARAM_END )? this_FUNC_ARROW_9= RULE_FUNC_ARROW ( (lv_body_10_0= ruleBlock ) ) this_CALL_END_11= RULE_CALL_END this_TERMINATOR_12= RULE_TERMINATOR )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:119:1: (this_TASK_0= RULE_TASK this_CALL_START_1= RULE_CALL_START ( (lv_name_2_0= ruleStringLiteral ) ) this_COMMA_3= RULE_COMMA ( (lv_description_4_0= ruleStringLiteral ) ) this_COMMA_5= RULE_COMMA (this_PARAM_START_6= RULE_PARAM_START ( (lv_options_7_0= ruleId ) ) this_PARAM_END_8= RULE_PARAM_END )? this_FUNC_ARROW_9= RULE_FUNC_ARROW ( (lv_body_10_0= ruleBlock ) ) this_CALL_END_11= RULE_CALL_END this_TERMINATOR_12= RULE_TERMINATOR )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:119:2: this_TASK_0= RULE_TASK this_CALL_START_1= RULE_CALL_START ( (lv_name_2_0= ruleStringLiteral ) ) this_COMMA_3= RULE_COMMA ( (lv_description_4_0= ruleStringLiteral ) ) this_COMMA_5= RULE_COMMA (this_PARAM_START_6= RULE_PARAM_START ( (lv_options_7_0= ruleId ) ) this_PARAM_END_8= RULE_PARAM_END )? this_FUNC_ARROW_9= RULE_FUNC_ARROW ( (lv_body_10_0= ruleBlock ) ) this_CALL_END_11= RULE_CALL_END this_TERMINATOR_12= RULE_TERMINATOR
            {
            this_TASK_0=(Token)match(input,RULE_TASK,FOLLOW_RULE_TASK_in_ruleTaskDeclaration212); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_TASK_0, grammarAccess.getTaskDeclarationAccess().getTASKTerminalRuleCall_0()); 
                  
            }
            this_CALL_START_1=(Token)match(input,RULE_CALL_START,FOLLOW_RULE_CALL_START_in_ruleTaskDeclaration222); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CALL_START_1, grammarAccess.getTaskDeclarationAccess().getCALL_STARTTerminalRuleCall_1()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:127:1: ( (lv_name_2_0= ruleStringLiteral ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:128:1: (lv_name_2_0= ruleStringLiteral )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:128:1: (lv_name_2_0= ruleStringLiteral )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:129:3: lv_name_2_0= ruleStringLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskDeclarationAccess().getNameStringLiteralParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_ruleTaskDeclaration242);
            lv_name_2_0=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTaskDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"StringLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleTaskDeclaration253); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMA_3, grammarAccess.getTaskDeclarationAccess().getCOMMATerminalRuleCall_3()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:149:1: ( (lv_description_4_0= ruleStringLiteral ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:150:1: (lv_description_4_0= ruleStringLiteral )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:150:1: (lv_description_4_0= ruleStringLiteral )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:151:3: lv_description_4_0= ruleStringLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskDeclarationAccess().getDescriptionStringLiteralParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_ruleTaskDeclaration273);
            lv_description_4_0=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTaskDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"description",
                      		lv_description_4_0, 
                      		"StringLiteral");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_COMMA_5=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleTaskDeclaration284); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_COMMA_5, grammarAccess.getTaskDeclarationAccess().getCOMMATerminalRuleCall_5()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:171:1: (this_PARAM_START_6= RULE_PARAM_START ( (lv_options_7_0= ruleId ) ) this_PARAM_END_8= RULE_PARAM_END )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_PARAM_START) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:171:2: this_PARAM_START_6= RULE_PARAM_START ( (lv_options_7_0= ruleId ) ) this_PARAM_END_8= RULE_PARAM_END
                    {
                    this_PARAM_START_6=(Token)match(input,RULE_PARAM_START,FOLLOW_RULE_PARAM_START_in_ruleTaskDeclaration295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAM_START_6, grammarAccess.getTaskDeclarationAccess().getPARAM_STARTTerminalRuleCall_6_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:175:1: ( (lv_options_7_0= ruleId ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:176:1: (lv_options_7_0= ruleId )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:176:1: (lv_options_7_0= ruleId )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:177:3: lv_options_7_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTaskDeclarationAccess().getOptionsIdParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleTaskDeclaration315);
                    lv_options_7_0=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTaskDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"options",
                              		lv_options_7_0, 
                              		"Id");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_PARAM_END_8=(Token)match(input,RULE_PARAM_END,FOLLOW_RULE_PARAM_END_in_ruleTaskDeclaration326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAM_END_8, grammarAccess.getTaskDeclarationAccess().getPARAM_ENDTerminalRuleCall_6_2()); 
                          
                    }

                    }
                    break;

            }

            this_FUNC_ARROW_9=(Token)match(input,RULE_FUNC_ARROW,FOLLOW_RULE_FUNC_ARROW_in_ruleTaskDeclaration338); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_FUNC_ARROW_9, grammarAccess.getTaskDeclarationAccess().getFUNC_ARROWTerminalRuleCall_7()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:201:1: ( (lv_body_10_0= ruleBlock ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:202:1: (lv_body_10_0= ruleBlock )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:202:1: (lv_body_10_0= ruleBlock )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:203:3: lv_body_10_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTaskDeclarationAccess().getBodyBlockParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleTaskDeclaration358);
            lv_body_10_0=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTaskDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_10_0, 
                      		"Block");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_CALL_END_11=(Token)match(input,RULE_CALL_END,FOLLOW_RULE_CALL_END_in_ruleTaskDeclaration369); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CALL_END_11, grammarAccess.getTaskDeclarationAccess().getCALL_ENDTerminalRuleCall_9()); 
                  
            }
            this_TERMINATOR_12=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleTaskDeclaration379); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_TERMINATOR_12, grammarAccess.getTaskDeclarationAccess().getTERMINATORTerminalRuleCall_10()); 
                  
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
    // $ANTLR end "ruleTaskDeclaration"


    // $ANTLR start "entryRuleBody"
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:237:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:238:2: (iv_ruleBody= ruleBody EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:239:2: iv_ruleBody= ruleBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBodyRule()); 
            }
            pushFollow(FOLLOW_ruleBody_in_entryRuleBody416);
            iv_ruleBody=ruleBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBody426); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:246:1: ruleBody returns [EObject current=null] : ( ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )* ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        Token this_TERMINATOR_1=null;
        EObject lv_lines_0_0 = null;

        EObject lv_lines_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:249:28: ( ( ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:250:1: ( ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:250:1: ( ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:250:2: ( (lv_lines_0_0= ruleLine ) ) (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )*
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:250:2: ( (lv_lines_0_0= ruleLine ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:251:1: (lv_lines_0_0= ruleLine )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:251:1: (lv_lines_0_0= ruleLine )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:252:3: lv_lines_0_0= ruleLine
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBodyAccess().getLinesLineParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLine_in_ruleBody472);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:268:2: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )? )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_TERMINATOR) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:268:3: this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleLine ) )?
            	    {
            	    this_TERMINATOR_1=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleBody484); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TERMINATOR_1, grammarAccess.getBodyAccess().getTERMINATORTerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:272:1: ( (lv_lines_2_0= ruleLine ) )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_PARAM_START||LA3_0==RULE_FUNC_ARROW||(LA3_0>=RULE_STATEMENT && LA3_0<=RULE_HERECOMMENT)||(LA3_0>=RULE_STRING && LA3_0<=RULE_RETURN)||(LA3_0>=RULE_THROW && LA3_0<=RULE_CLASS)||(LA3_0>=RULE_FOR && LA3_0<=RULE_WHILE)||LA3_0==RULE_UNTIL||LA3_0==RULE_LBRACKET||(LA3_0>=RULE_PLUS && LA3_0<=RULE_MINUS)||(LA3_0>=RULE_UNARY && LA3_0<=RULE_MINUS_MINUS)||LA3_0==RULE_SUPER||LA3_0==RULE_AT_SIGIL||(LA3_0>=RULE_THIS && LA3_0<=RULE_TRY)||LA3_0==RULE_SWITCH||(LA3_0>=RULE_IF && LA3_0<=RULE_LCURLY)||(LA3_0>=RULE_BOUND_FUNC_ARROW && LA3_0<=RULE_LPAREN)) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:273:1: (lv_lines_2_0= ruleLine )
            	            {
            	            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:273:1: (lv_lines_2_0= ruleLine )
            	            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:274:3: lv_lines_2_0= ruleLine
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getBodyAccess().getLinesLineParserRuleCall_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLine_in_ruleBody504);
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
            	    break loop4;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:298:1: entryRuleLine returns [EObject current=null] : iv_ruleLine= ruleLine EOF ;
    public final EObject entryRuleLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLine = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:299:2: (iv_ruleLine= ruleLine EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:300:2: iv_ruleLine= ruleLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLineRule()); 
            }
            pushFollow(FOLLOW_ruleLine_in_entryRuleLine543);
            iv_ruleLine=ruleLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLine553); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:307:1: ruleLine returns [EObject current=null] : (this_Stmt_0= ruleStmt | this_Expression_1= ruleExpression ) ;
    public final EObject ruleLine() throws RecognitionException {
        EObject current = null;

        EObject this_Stmt_0 = null;

        EObject this_Expression_1 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:310:28: ( (this_Stmt_0= ruleStmt | this_Expression_1= ruleExpression ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:311:1: (this_Stmt_0= ruleStmt | this_Expression_1= ruleExpression )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:311:1: (this_Stmt_0= ruleStmt | this_Expression_1= ruleExpression )
            int alt5=2;
            switch ( input.LA(1) ) {
            case RULE_STATEMENT:
            case RULE_HERECOMMENT:
            case RULE_RETURN:
            case RULE_THROW:
            case RULE_CLASS:
                {
                alt5=1;
                }
                break;
            case RULE_IDENTIFIER:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==EOF||LA5_2==RULE_CALL_START||LA5_2==RULE_TERMINATOR||LA5_2==RULE_POST_IF||(LA5_2>=RULE_FOR && LA5_2<=RULE_WHILE)||LA5_2==RULE_UNTIL||LA5_2==RULE_COMPOUND_ASSIGN||(LA5_2>=RULE_OUTDENT && LA5_2<=RULE_MATH)||LA5_2==RULE_QUESTION||LA5_2==RULE_FUNC_EXIST||(LA5_2>=RULE_DOT && LA5_2<=RULE_INDEX_START)||LA5_2==RULE_RPAREN) ) {
                    alt5=2;
                }
                else if ( (LA5_2==RULE_EQUAL) ) {
                    int LA5_4 = input.LA(3);

                    if ( (LA5_4==86) ) {
                        alt5=1;
                    }
                    else if ( (LA5_4==RULE_PARAM_START||LA5_4==RULE_FUNC_ARROW||LA5_4==RULE_STRING||LA5_4==RULE_CLASS||(LA5_4>=RULE_FOR && LA5_4<=RULE_WHILE)||LA5_4==RULE_UNTIL||LA5_4==RULE_LBRACKET||LA5_4==RULE_INDENT||(LA5_4>=RULE_PLUS && LA5_4<=RULE_MINUS)||(LA5_4>=RULE_UNARY && LA5_4<=RULE_MINUS_MINUS)||LA5_4==RULE_SUPER||LA5_4==RULE_AT_SIGIL||(LA5_4>=RULE_THIS && LA5_4<=RULE_TRY)||LA5_4==RULE_SWITCH||(LA5_4>=RULE_IF && LA5_4<=RULE_LCURLY)||(LA5_4>=RULE_BOUND_FUNC_ARROW && LA5_4<=RULE_LPAREN)) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_PARAM_START:
            case RULE_FUNC_ARROW:
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
            case RULE_BOUND_FUNC_ARROW:
            case RULE_NUMBER:
            case RULE_BOOL:
            case RULE_JS:
            case RULE_REGEX:
            case RULE_LPAREN:
                {
                alt5=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:312:5: this_Stmt_0= ruleStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLineAccess().getStmtParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStmt_in_ruleLine600);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:322:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLineAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleLine627);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:338:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:339:2: (iv_ruleStmt= ruleStmt EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:340:2: iv_ruleStmt= ruleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_ruleStmt_in_entryRuleStmt662);
            iv_ruleStmt=ruleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStmt672); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:347:1: ruleStmt returns [EObject current=null] : (this_ReturnStmt_0= ruleReturnStmt | this_ThrowStmt_1= ruleThrowStmt | ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt ) | this_Comment_3= ruleComment | this_ClassDeclaration_4= ruleClassDeclaration | ( (lv_statement_5_0= RULE_STATEMENT ) ) ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:350:28: ( (this_ReturnStmt_0= ruleReturnStmt | this_ThrowStmt_1= ruleThrowStmt | ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt ) | this_Comment_3= ruleComment | this_ClassDeclaration_4= ruleClassDeclaration | ( (lv_statement_5_0= RULE_STATEMENT ) ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:351:1: (this_ReturnStmt_0= ruleReturnStmt | this_ThrowStmt_1= ruleThrowStmt | ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt ) | this_Comment_3= ruleComment | this_ClassDeclaration_4= ruleClassDeclaration | ( (lv_statement_5_0= RULE_STATEMENT ) ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:351:1: (this_ReturnStmt_0= ruleReturnStmt | this_ThrowStmt_1= ruleThrowStmt | ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt ) | this_Comment_3= ruleComment | this_ClassDeclaration_4= ruleClassDeclaration | ( (lv_statement_5_0= RULE_STATEMENT ) ) )
            int alt6=6;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_RETURN) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_THROW) ) {
                alt6=2;
            }
            else if ( (LA6_0==RULE_IDENTIFIER) && (synpred1_InternalCakefile())) {
                alt6=3;
            }
            else if ( (LA6_0==RULE_HERECOMMENT) ) {
                alt6=4;
            }
            else if ( (LA6_0==RULE_CLASS) ) {
                alt6=5;
            }
            else if ( (LA6_0==RULE_STATEMENT) ) {
                alt6=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:352:5: this_ReturnStmt_0= ruleReturnStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getReturnStmtParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReturnStmt_in_ruleStmt719);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:362:5: this_ThrowStmt_1= ruleThrowStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getThrowStmtParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleThrowStmt_in_ruleStmt746);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:371:6: ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:371:6: ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:371:7: ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=>this_RequireStmt_2= ruleRequireStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getRequireStmtParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequireStmt_in_ruleStmt794);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:387:5: this_Comment_3= ruleComment
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getCommentParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComment_in_ruleStmt822);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:397:5: this_ClassDeclaration_4= ruleClassDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getStmtAccess().getClassDeclarationParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClassDeclaration_in_ruleStmt849);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:406:6: ( (lv_statement_5_0= RULE_STATEMENT ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:406:6: ( (lv_statement_5_0= RULE_STATEMENT ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:407:1: (lv_statement_5_0= RULE_STATEMENT )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:407:1: (lv_statement_5_0= RULE_STATEMENT )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:408:3: lv_statement_5_0= RULE_STATEMENT
                    {
                    lv_statement_5_0=(Token)match(input,RULE_STATEMENT,FOLLOW_RULE_STATEMENT_in_ruleStmt871); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:432:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:433:2: (iv_ruleComment= ruleComment EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:434:2: iv_ruleComment= ruleComment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommentRule()); 
            }
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment912);
            iv_ruleComment=ruleComment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment922); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:441:1: ruleComment returns [EObject current=null] : ( (lv_comment_0_0= RULE_HERECOMMENT ) ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token lv_comment_0_0=null;

         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:444:28: ( ( (lv_comment_0_0= RULE_HERECOMMENT ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:445:1: ( (lv_comment_0_0= RULE_HERECOMMENT ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:445:1: ( (lv_comment_0_0= RULE_HERECOMMENT ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:446:1: (lv_comment_0_0= RULE_HERECOMMENT )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:446:1: (lv_comment_0_0= RULE_HERECOMMENT )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:447:3: lv_comment_0_0= RULE_HERECOMMENT
            {
            lv_comment_0_0=(Token)match(input,RULE_HERECOMMENT,FOLLOW_RULE_HERECOMMENT_in_ruleComment963); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:471:1: entryRuleRequireStmt returns [EObject current=null] : iv_ruleRequireStmt= ruleRequireStmt EOF ;
    public final EObject entryRuleRequireStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireStmt = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:472:2: (iv_ruleRequireStmt= ruleRequireStmt EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:473:2: iv_ruleRequireStmt= ruleRequireStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequireStmtRule()); 
            }
            pushFollow(FOLLOW_ruleRequireStmt_in_entryRuleRequireStmt1003);
            iv_ruleRequireStmt=ruleRequireStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequireStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequireStmt1013); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:480:1: ruleRequireStmt returns [EObject current=null] : ( ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:483:28: ( ( ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:484:1: ( ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:484:1: ( ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:484:2: ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) ) this_CALL_START_3= RULE_CALL_START ( (lv_uri_4_0= RULE_STRING ) ) this_CALL_END_5= RULE_CALL_END
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:484:2: ( ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:484:3: ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )=> ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:489:5: ( ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require' )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:489:6: ( (lv_importedNamespace_0_0= ruleId ) ) this_EQUAL_1= RULE_EQUAL otherlv_2= 'require'
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:489:6: ( (lv_importedNamespace_0_0= ruleId ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:490:1: (lv_importedNamespace_0_0= ruleId )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:490:1: (lv_importedNamespace_0_0= ruleId )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:491:3: lv_importedNamespace_0_0= ruleId
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequireStmtAccess().getImportedNamespaceIdParserRuleCall_0_0_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleId_in_ruleRequireStmt1081);
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

            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleRequireStmt1092); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_EQUAL_1, grammarAccess.getRequireStmtAccess().getEQUALTerminalRuleCall_0_0_1()); 
                  
            }
            otherlv_2=(Token)match(input,86,FOLLOW_86_in_ruleRequireStmt1103); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRequireStmtAccess().getRequireKeyword_0_0_2());
                  
            }

            }


            }

            this_CALL_START_3=(Token)match(input,RULE_CALL_START,FOLLOW_RULE_CALL_START_in_ruleRequireStmt1116); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CALL_START_3, grammarAccess.getRequireStmtAccess().getCALL_STARTTerminalRuleCall_1()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:519:1: ( (lv_uri_4_0= RULE_STRING ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:520:1: (lv_uri_4_0= RULE_STRING )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:520:1: (lv_uri_4_0= RULE_STRING )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:521:3: lv_uri_4_0= RULE_STRING
            {
            lv_uri_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRequireStmt1132); if (state.failed) return current;
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

            this_CALL_END_5=(Token)match(input,RULE_CALL_END,FOLLOW_RULE_CALL_END_in_ruleRequireStmt1148); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:549:1: entryRuleReturnStmt returns [EObject current=null] : iv_ruleReturnStmt= ruleReturnStmt EOF ;
    public final EObject entryRuleReturnStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturnStmt = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:550:2: (iv_ruleReturnStmt= ruleReturnStmt EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:551:2: iv_ruleReturnStmt= ruleReturnStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnStmtRule()); 
            }
            pushFollow(FOLLOW_ruleReturnStmt_in_entryRuleReturnStmt1183);
            iv_ruleReturnStmt=ruleReturnStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturnStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnStmt1193); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:558:1: ruleReturnStmt returns [EObject current=null] : ( () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleReturnStmt() throws RecognitionException {
        EObject current = null;

        Token this_RETURN_1=null;
        Token this_POST_IF_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_condition_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:561:28: ( ( () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:562:1: ( () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:562:1: ( () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:562:2: () this_RETURN_1= RULE_RETURN ( (lv_expression_2_0= ruleExpression ) )? (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:562:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:563:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getReturnStmtAccess().getReturnStmtAction_0(),
                          current);
                  
            }

            }

            this_RETURN_1=(Token)match(input,RULE_RETURN,FOLLOW_RULE_RETURN_in_ruleReturnStmt1238); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_RETURN_1, grammarAccess.getReturnStmtAccess().getRETURNTerminalRuleCall_1()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:572:1: ( (lv_expression_2_0= ruleExpression ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_PARAM_START||LA7_0==RULE_FUNC_ARROW||LA7_0==RULE_STRING||(LA7_0>=RULE_FOR && LA7_0<=RULE_WHILE)||LA7_0==RULE_UNTIL||LA7_0==RULE_LBRACKET||(LA7_0>=RULE_PLUS && LA7_0<=RULE_MINUS)||(LA7_0>=RULE_UNARY && LA7_0<=RULE_MINUS_MINUS)||LA7_0==RULE_SUPER||LA7_0==RULE_AT_SIGIL||(LA7_0>=RULE_THIS && LA7_0<=RULE_TRY)||LA7_0==RULE_SWITCH||(LA7_0>=RULE_IF && LA7_0<=RULE_LCURLY)||(LA7_0>=RULE_BOUND_FUNC_ARROW && LA7_0<=RULE_LPAREN)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:573:1: (lv_expression_2_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:573:1: (lv_expression_2_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:574:3: lv_expression_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStmtAccess().getExpressionExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnStmt1258);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:590:3: (this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_POST_IF) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:590:4: this_POST_IF_3= RULE_POST_IF ( (lv_condition_4_0= ruleExpression ) )
                    {
                    this_POST_IF_3=(Token)match(input,RULE_POST_IF,FOLLOW_RULE_POST_IF_in_ruleReturnStmt1271); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POST_IF_3, grammarAccess.getReturnStmtAccess().getPOST_IFTerminalRuleCall_3_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:594:1: ( (lv_condition_4_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:595:1: (lv_condition_4_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:595:1: (lv_condition_4_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:596:3: lv_condition_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getReturnStmtAccess().getConditionExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleReturnStmt1291);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:620:1: entryRuleThrowStmt returns [EObject current=null] : iv_ruleThrowStmt= ruleThrowStmt EOF ;
    public final EObject entryRuleThrowStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThrowStmt = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:621:2: (iv_ruleThrowStmt= ruleThrowStmt EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:622:2: iv_ruleThrowStmt= ruleThrowStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThrowStmtRule()); 
            }
            pushFollow(FOLLOW_ruleThrowStmt_in_entryRuleThrowStmt1329);
            iv_ruleThrowStmt=ruleThrowStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThrowStmt; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThrowStmt1339); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:629:1: ruleThrowStmt returns [EObject current=null] : (this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) ) ) ;
    public final EObject ruleThrowStmt() throws RecognitionException {
        EObject current = null;

        Token this_THROW_0=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:632:28: ( (this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:633:1: (this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:633:1: (this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:633:2: this_THROW_0= RULE_THROW ( (lv_exp_1_0= ruleExpression ) )
            {
            this_THROW_0=(Token)match(input,RULE_THROW,FOLLOW_RULE_THROW_in_ruleThrowStmt1375); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_THROW_0, grammarAccess.getThrowStmtAccess().getTHROWTerminalRuleCall_0()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:637:1: ( (lv_exp_1_0= ruleExpression ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:638:1: (lv_exp_1_0= ruleExpression )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:638:1: (lv_exp_1_0= ruleExpression )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:639:3: lv_exp_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getThrowStmtAccess().getExpExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleThrowStmt1395);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:663:1: entryRuleSuperClass returns [EObject current=null] : iv_ruleSuperClass= ruleSuperClass EOF ;
    public final EObject entryRuleSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperClass = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:664:2: (iv_ruleSuperClass= ruleSuperClass EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:665:2: iv_ruleSuperClass= ruleSuperClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuperClassRule()); 
            }
            pushFollow(FOLLOW_ruleSuperClass_in_entryRuleSuperClass1431);
            iv_ruleSuperClass=ruleSuperClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuperClass; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperClass1441); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:672:1: ruleSuperClass returns [EObject current=null] : (this_IdRef_0= ruleIdRef | this_Property_1= ruleProperty ) ;
    public final EObject ruleSuperClass() throws RecognitionException {
        EObject current = null;

        EObject this_IdRef_0 = null;

        EObject this_Property_1 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:675:28: ( (this_IdRef_0= ruleIdRef | this_Property_1= ruleProperty ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:676:1: (this_IdRef_0= ruleIdRef | this_Property_1= ruleProperty )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:676:1: (this_IdRef_0= ruleIdRef | this_Property_1= ruleProperty )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_IDENTIFIER) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=RULE_DOT && LA9_1<=RULE_INDEX_START)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||LA9_1==RULE_TERMINATOR||(LA9_1>=RULE_INDENT && LA9_1<=RULE_OUTDENT)||LA9_1==RULE_RPAREN) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:677:5: this_IdRef_0= ruleIdRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSuperClassAccess().getIdRefParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdRef_in_ruleSuperClass1488);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:687:5: this_Property_1= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSuperClassAccess().getPropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleSuperClass1515);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:703:1: entryRuleClassDeclaration returns [EObject current=null] : iv_ruleClassDeclaration= ruleClassDeclaration EOF ;
    public final EObject entryRuleClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDeclaration = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:704:2: (iv_ruleClassDeclaration= ruleClassDeclaration EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:705:2: iv_ruleClassDeclaration= ruleClassDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClassDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleClassDeclaration_in_entryRuleClassDeclaration1550);
            iv_ruleClassDeclaration=ruleClassDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClassDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDeclaration1560); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:712:1: ruleClassDeclaration returns [EObject current=null] : ( () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )? ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:715:28: ( ( () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:716:1: ( () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:716:1: ( () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:716:2: () this_CLASS_1= RULE_CLASS ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:716:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:717:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClassDeclarationAccess().getClassDeclarationAction_0(),
                          current);
                  
            }

            }

            this_CLASS_1=(Token)match(input,RULE_CLASS,FOLLOW_RULE_CLASS_in_ruleClassDeclaration1605); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CLASS_1, grammarAccess.getClassDeclarationAccess().getCLASSTerminalRuleCall_1()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:726:1: ( ( (lv_body_2_0= ruleBlock ) ) | (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? ) | ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) ) )?
            int alt13=4;
            switch ( input.LA(1) ) {
                case RULE_INDENT:
                    {
                    alt13=1;
                    }
                    break;
                case RULE_EXTENDS:
                    {
                    alt13=2;
                    }
                    break;
                case RULE_IDENTIFIER:
                    {
                    alt13=3;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:726:2: ( (lv_body_2_0= ruleBlock ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:726:2: ( (lv_body_2_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:727:1: (lv_body_2_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:727:1: (lv_body_2_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:728:3: lv_body_2_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getBodyBlockParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleClassDeclaration1626);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:745:6: (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:745:6: (this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:745:7: this_EXTENDS_3= RULE_EXTENDS ( (lv_extend_4_0= ruleSuperClass ) ) ( (lv_body_5_0= ruleBlock ) )?
                    {
                    this_EXTENDS_3=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleClassDeclaration1644); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_3, grammarAccess.getClassDeclarationAccess().getEXTENDSTerminalRuleCall_2_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:749:1: ( (lv_extend_4_0= ruleSuperClass ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:750:1: (lv_extend_4_0= ruleSuperClass )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:750:1: (lv_extend_4_0= ruleSuperClass )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:751:3: lv_extend_4_0= ruleSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getExtendSuperClassParserRuleCall_2_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuperClass_in_ruleClassDeclaration1664);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:767:2: ( (lv_body_5_0= ruleBlock ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_INDENT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:768:1: (lv_body_5_0= ruleBlock )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:768:1: (lv_body_5_0= ruleBlock )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:769:3: lv_body_5_0= ruleBlock
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getBodyBlockParserRuleCall_2_1_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlock_in_ruleClassDeclaration1685);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:786:6: ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:786:6: ( ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:786:7: ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) ) (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )? ( (lv_body_9_0= ruleBlock ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:786:7: ( ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:787:1: ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:787:1: ( (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:788:1: (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:788:1: (lv_name_6_1= ruleId | lv_name_6_2= ruleProperty )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_IDENTIFIER) ) {
                        int LA11_1 = input.LA(2);

                        if ( ((LA11_1>=RULE_DOT && LA11_1<=RULE_INDEX_START)) ) {
                            alt11=2;
                        }
                        else if ( (LA11_1==RULE_EXTENDS||LA11_1==RULE_INDENT) ) {
                            alt11=1;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:789:3: lv_name_6_1= ruleId
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getNameIdParserRuleCall_2_2_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleId_in_ruleClassDeclaration1717);
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:804:8: lv_name_6_2= ruleProperty
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getNamePropertyParserRuleCall_2_2_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleProperty_in_ruleClassDeclaration1736);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:822:2: (this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_EXTENDS) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:822:3: this_EXTENDS_7= RULE_EXTENDS ( (lv_extend_8_0= ruleSuperClass ) )
                            {
                            this_EXTENDS_7=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleClassDeclaration1751); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_EXTENDS_7, grammarAccess.getClassDeclarationAccess().getEXTENDSTerminalRuleCall_2_2_1_0()); 
                                  
                            }
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:826:1: ( (lv_extend_8_0= ruleSuperClass ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:827:1: (lv_extend_8_0= ruleSuperClass )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:827:1: (lv_extend_8_0= ruleSuperClass )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:828:3: lv_extend_8_0= ruleSuperClass
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getExtendSuperClassParserRuleCall_2_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSuperClass_in_ruleClassDeclaration1771);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:844:4: ( (lv_body_9_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:845:1: (lv_body_9_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:845:1: (lv_body_9_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:846:3: lv_body_9_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getClassDeclarationAccess().getBodyBlockParserRuleCall_2_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleClassDeclaration1794);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:870:1: entryRuleAssignedClassDeclaration returns [EObject current=null] : iv_ruleAssignedClassDeclaration= ruleAssignedClassDeclaration EOF ;
    public final EObject entryRuleAssignedClassDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignedClassDeclaration = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:871:2: (iv_ruleAssignedClassDeclaration= ruleAssignedClassDeclaration EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:872:2: iv_ruleAssignedClassDeclaration= ruleAssignedClassDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignedClassDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleAssignedClassDeclaration_in_entryRuleAssignedClassDeclaration1833);
            iv_ruleAssignedClassDeclaration=ruleAssignedClassDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignedClassDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignedClassDeclaration1843); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:879:1: ruleAssignedClassDeclaration returns [EObject current=null] : ( () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )? ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:882:28: ( ( () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:883:1: ( () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:883:1: ( () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:883:2: () this_CLASS_1= RULE_CLASS ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:883:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:884:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAssignedClassDeclarationAccess().getClassDeclarationAction_0(),
                          current);
                  
            }

            }

            this_CLASS_1=(Token)match(input,RULE_CLASS,FOLLOW_RULE_CLASS_in_ruleAssignedClassDeclaration1888); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CLASS_1, grammarAccess.getAssignedClassDeclarationAccess().getCLASSTerminalRuleCall_1()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:893:1: ( (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) ) | ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_EXTENDS) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_IDENTIFIER) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:893:2: (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:893:2: (this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:893:3: this_EXTENDS_2= RULE_EXTENDS ( (lv_extend_3_0= ruleSuperClass ) ) ( (lv_body_4_0= ruleBlock ) )
                    {
                    this_EXTENDS_2=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleAssignedClassDeclaration1900); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXTENDS_2, grammarAccess.getAssignedClassDeclarationAccess().getEXTENDSTerminalRuleCall_2_0_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:897:1: ( (lv_extend_3_0= ruleSuperClass ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:898:1: (lv_extend_3_0= ruleSuperClass )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:898:1: (lv_extend_3_0= ruleSuperClass )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:899:3: lv_extend_3_0= ruleSuperClass
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getExtendSuperClassParserRuleCall_2_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSuperClass_in_ruleAssignedClassDeclaration1920);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:915:2: ( (lv_body_4_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:916:1: (lv_body_4_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:916:1: (lv_body_4_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:917:3: lv_body_4_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getBodyBlockParserRuleCall_2_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleAssignedClassDeclaration1941);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:934:6: ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:934:6: ( ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:934:7: ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) ) (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )? ( (lv_body_8_0= ruleBlock ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:934:7: ( ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:935:1: ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:935:1: ( (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:936:1: (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:936:1: (lv_name_5_1= ruleId | lv_name_5_2= ruleProperty )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_IDENTIFIER) ) {
                        int LA14_1 = input.LA(2);

                        if ( (LA14_1==RULE_EXTENDS||LA14_1==RULE_INDENT) ) {
                            alt14=1;
                        }
                        else if ( ((LA14_1>=RULE_DOT && LA14_1<=RULE_INDEX_START)) ) {
                            alt14=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:937:3: lv_name_5_1= ruleId
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getNameIdParserRuleCall_2_1_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleId_in_ruleAssignedClassDeclaration1972);
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:952:8: lv_name_5_2= ruleProperty
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getNamePropertyParserRuleCall_2_1_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleProperty_in_ruleAssignedClassDeclaration1991);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:970:2: (this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_EXTENDS) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:970:3: this_EXTENDS_6= RULE_EXTENDS ( (lv_extend_7_0= ruleSuperClass ) )
                            {
                            this_EXTENDS_6=(Token)match(input,RULE_EXTENDS,FOLLOW_RULE_EXTENDS_in_ruleAssignedClassDeclaration2006); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_EXTENDS_6, grammarAccess.getAssignedClassDeclarationAccess().getEXTENDSTerminalRuleCall_2_1_1_0()); 
                                  
                            }
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:974:1: ( (lv_extend_7_0= ruleSuperClass ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:975:1: (lv_extend_7_0= ruleSuperClass )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:975:1: (lv_extend_7_0= ruleSuperClass )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:976:3: lv_extend_7_0= ruleSuperClass
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getExtendSuperClassParserRuleCall_2_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSuperClass_in_ruleAssignedClassDeclaration2026);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:992:4: ( (lv_body_8_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:993:1: (lv_body_8_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:993:1: (lv_body_8_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:994:3: lv_body_8_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignedClassDeclarationAccess().getBodyBlockParserRuleCall_2_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleAssignedClassDeclaration2049);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1018:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1019:2: (iv_ruleExpression= ruleExpression EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1020:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2088);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2098); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1027:1: ruleExpression returns [EObject current=null] : this_Postfix_0= rulePostfix ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Postfix_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1030:28: (this_Postfix_0= rulePostfix )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1032:5: this_Postfix_0= rulePostfix
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getPostfixParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_rulePostfix_in_ruleExpression2144);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1048:1: entryRulePostfix returns [EObject current=null] : iv_rulePostfix= rulePostfix EOF ;
    public final EObject entryRulePostfix() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfix = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1049:2: (iv_rulePostfix= rulePostfix EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1050:2: iv_rulePostfix= rulePostfix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixRule()); 
            }
            pushFollow(FOLLOW_rulePostfix_in_entryRulePostfix2178);
            iv_rulePostfix=rulePostfix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfix; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePostfix2188); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1057:1: rulePostfix returns [EObject current=null] : (this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )? ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1060:28: ( (this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1061:1: (this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1061:1: (this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1062:5: this_Assignment_0= ruleAssignment ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPostfixAccess().getAssignmentParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignment_in_rulePostfix2235);
            this_Assignment_0=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Assignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1070:1: ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )?
            int alt19=5;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1070:2: ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1070:2: ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1070:3: ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1070:3: ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1070:4: ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF
                    {
                    this_POST_IF_1=(Token)match(input,RULE_POST_IF,FOLLOW_RULE_POST_IF_in_rulePostfix2253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POST_IF_1, grammarAccess.getPostfixAccess().getPOST_IFTerminalRuleCall_1_0_0()); 
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1074:2: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1075:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getIfDummyAction_1_0_1(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1080:2: ( (lv_condition_3_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1081:1: (lv_condition_3_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1081:1: (lv_condition_3_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1082:3: lv_condition_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAccess().getConditionExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePostfix2283);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1099:6: ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1099:6: ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1099:7: ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1099:7: ( ( RULE_FOR )=>this_FOR_4= RULE_FOR )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1099:8: ( RULE_FOR )=>this_FOR_4= RULE_FOR
                    {
                    this_FOR_4=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_rulePostfix2308); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOR_4, grammarAccess.getPostfixAccess().getFORTerminalRuleCall_1_1_0()); 
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1103:2: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1104:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getForDummyAction_1_1_1(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1109:2: ( (lv_body_6_0= ruleForBody ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1110:1: (lv_body_6_0= ruleForBody )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1110:1: (lv_body_6_0= ruleForBody )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1111:3: lv_body_6_0= ruleForBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAccess().getBodyForBodyParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForBody_in_rulePostfix2338);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1128:6: ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1128:6: ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1128:7: ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )?
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1128:7: ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1128:8: ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE
                    {
                    this_WHILE_7=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_rulePostfix2363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_7, grammarAccess.getPostfixAccess().getWHILETerminalRuleCall_1_2_0()); 
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1132:2: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1133:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getWhileDummyAction_1_2_1(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1138:2: ( (lv_body_9_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1139:1: (lv_body_9_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1139:1: (lv_body_9_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1140:3: lv_body_9_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAccess().getBodyExpressionParserRuleCall_1_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePostfix2393);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1156:2: ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_WHEN) ) {
                        int LA17_1 = input.LA(2);

                        if ( (synpred6_InternalCakefile()) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1156:3: ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1156:3: ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1156:4: ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN
                            {
                            this_WHEN_10=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_rulePostfix2411); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_10, grammarAccess.getPostfixAccess().getWHENTerminalRuleCall_1_2_3_0()); 
                                  
                            }

                            }

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1160:2: ( (lv_when_11_0= ruleExpression ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1161:1: (lv_when_11_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1161:1: (lv_when_11_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1162:3: lv_when_11_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPostfixAccess().getWhenExpressionParserRuleCall_1_2_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePostfix2432);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1179:6: ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1179:6: ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1179:7: ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )?
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1179:7: ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1179:8: ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL
                    {
                    this_UNTIL_12=(Token)match(input,RULE_UNTIL,FOLLOW_RULE_UNTIL_in_rulePostfix2459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNTIL_12, grammarAccess.getPostfixAccess().getUNTILTerminalRuleCall_1_3_0()); 
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1183:2: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1184:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getPostfixAccess().getUntilDummyAction_1_3_1(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1189:2: ( (lv_body_14_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1190:1: (lv_body_14_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1190:1: (lv_body_14_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1191:3: lv_body_14_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPostfixAccess().getBodyExpressionParserRuleCall_1_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePostfix2489);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1207:2: ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_WHEN) ) {
                        int LA18_1 = input.LA(2);

                        if ( (synpred8_InternalCakefile()) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1207:3: ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1207:3: ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1207:4: ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN
                            {
                            this_WHEN_15=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_rulePostfix2507); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_15, grammarAccess.getPostfixAccess().getWHENTerminalRuleCall_1_3_3_0()); 
                                  
                            }

                            }

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1211:2: ( (lv_when_16_0= ruleExpression ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1212:1: (lv_when_16_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1212:1: (lv_when_16_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1213:3: lv_when_16_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPostfixAccess().getWhenExpressionParserRuleCall_1_3_3_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePostfix2528);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1237:1: entryRuleForBody returns [EObject current=null] : iv_ruleForBody= ruleForBody EOF ;
    public final EObject entryRuleForBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForBody = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1238:2: (iv_ruleForBody= ruleForBody EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1239:2: iv_ruleForBody= ruleForBody EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForBodyRule()); 
            }
            pushFollow(FOLLOW_ruleForBody_in_entryRuleForBody2569);
            iv_ruleForBody=ruleForBody();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForBody; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForBody2579); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1246:1: ruleForBody returns [EObject current=null] : ( (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) ) ) ;
    public final EObject ruleForBody() throws RecognitionException {
        EObject current = null;

        Token this_OWN_0=null;
        Token this_COMMA_2=null;
        EObject lv_indexes_1_0 = null;

        EObject lv_indexes_3_0 = null;

        EObject lv_source_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1249:28: ( ( (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1250:1: ( (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1250:1: ( (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1250:2: (this_OWN_0= RULE_OWN )? ( (lv_indexes_1_0= ruleForValue ) ) (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )* ( (lv_source_4_0= ruleForSource ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1250:2: (this_OWN_0= RULE_OWN )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_OWN) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1250:3: this_OWN_0= RULE_OWN
                    {
                    this_OWN_0=(Token)match(input,RULE_OWN,FOLLOW_RULE_OWN_in_ruleForBody2616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OWN_0, grammarAccess.getForBodyAccess().getOWNTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;

            }

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1254:3: ( (lv_indexes_1_0= ruleForValue ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1255:1: (lv_indexes_1_0= ruleForValue )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1255:1: (lv_indexes_1_0= ruleForValue )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1256:3: lv_indexes_1_0= ruleForValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForBodyAccess().getIndexesForValueParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForValue_in_ruleForBody2638);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1272:2: (this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1272:3: this_COMMA_2= RULE_COMMA ( (lv_indexes_3_0= ruleForValue ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleForBody2650); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getForBodyAccess().getCOMMATerminalRuleCall_2_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1276:1: ( (lv_indexes_3_0= ruleForValue ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1277:1: (lv_indexes_3_0= ruleForValue )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1277:1: (lv_indexes_3_0= ruleForValue )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1278:3: lv_indexes_3_0= ruleForValue
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForBodyAccess().getIndexesForValueParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleForValue_in_ruleForBody2670);
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
            	    break loop21;
                }
            } while (true);

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1294:4: ( (lv_source_4_0= ruleForSource ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1295:1: (lv_source_4_0= ruleForSource )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1295:1: (lv_source_4_0= ruleForSource )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1296:3: lv_source_4_0= ruleForSource
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForBodyAccess().getSourceForSourceParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleForSource_in_ruleForBody2693);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1320:1: entryRuleForValue returns [EObject current=null] : iv_ruleForValue= ruleForValue EOF ;
    public final EObject entryRuleForValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForValue = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1321:2: (iv_ruleForValue= ruleForValue EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1322:2: iv_ruleForValue= ruleForValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForValueRule()); 
            }
            pushFollow(FOLLOW_ruleForValue_in_entryRuleForValue2729);
            iv_ruleForValue=ruleForValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForValue2739); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1329:1: ruleForValue returns [EObject current=null] : this_Id_0= ruleId ;
    public final EObject ruleForValue() throws RecognitionException {
        EObject current = null;

        EObject this_Id_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1332:28: (this_Id_0= ruleId )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1334:5: this_Id_0= ruleId
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getForValueAccess().getIdParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleId_in_ruleForValue2785);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1350:1: entryRuleForSource returns [EObject current=null] : iv_ruleForSource= ruleForSource EOF ;
    public final EObject entryRuleForSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForSource = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1351:2: (iv_ruleForSource= ruleForSource EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1352:2: iv_ruleForSource= ruleForSource EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForSourceRule()); 
            }
            pushFollow(FOLLOW_ruleForSource_in_entryRuleForSource2819);
            iv_ruleForSource=ruleForSource();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForSource; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForSource2829); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1359:1: ruleForSource returns [EObject current=null] : ( () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) ) ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1362:28: ( ( () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1363:1: ( () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1363:1: ( () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1363:2: () ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1363:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1364:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForSourceAccess().getForSourceAction_0(),
                          current);
                  
            }

            }

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1369:2: ( ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? ) | ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_FOROF) && (synpred9_InternalCakefile())) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_FORIN) && (synpred11_InternalCakefile())) {
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1369:3: ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1369:3: ( ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1369:4: ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF ) ( (lv_source_2_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )?
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1369:4: ( ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1369:5: ( RULE_FOROF )=>this_FOROF_1= RULE_FOROF
                    {
                    this_FOROF_1=(Token)match(input,RULE_FOROF,FOLLOW_RULE_FOROF_in_ruleForSource2882); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOROF_1, grammarAccess.getForSourceAccess().getFOROFTerminalRuleCall_1_0_0()); 
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1373:2: ( (lv_source_2_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1374:1: (lv_source_2_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1374:1: (lv_source_2_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1375:3: lv_source_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForSourceAccess().getSourceExpressionParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForSource2903);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1391:2: ( ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_WHEN) ) {
                        int LA22_1 = input.LA(2);

                        if ( (synpred10_InternalCakefile()) ) {
                            alt22=1;
                        }
                    }
                    switch (alt22) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1391:3: ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN ) ( (lv_when_4_0= ruleExpression ) )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1391:3: ( ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1391:4: ( RULE_WHEN )=>this_WHEN_3= RULE_WHEN
                            {
                            this_WHEN_3=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_ruleForSource2921); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_3, grammarAccess.getForSourceAccess().getWHENTerminalRuleCall_1_0_2_0()); 
                                  
                            }

                            }

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1395:2: ( (lv_when_4_0= ruleExpression ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1396:1: (lv_when_4_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1396:1: (lv_when_4_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1397:3: lv_when_4_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForSourceAccess().getWhenExpressionParserRuleCall_1_0_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleForSource2942);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1414:6: ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1414:6: ( ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1414:7: ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN ) ( (lv_source_6_0= ruleExpression ) ) ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )?
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1414:7: ( ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1414:8: ( RULE_FORIN )=>this_FORIN_5= RULE_FORIN
                    {
                    this_FORIN_5=(Token)match(input,RULE_FORIN,FOLLOW_RULE_FORIN_in_ruleForSource2969); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FORIN_5, grammarAccess.getForSourceAccess().getFORINTerminalRuleCall_1_1_0()); 
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1418:2: ( (lv_source_6_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1419:1: (lv_source_6_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1419:1: (lv_source_6_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1420:3: lv_source_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForSourceAccess().getSourceExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleForSource2990);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1436:2: ( ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? ) | ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? ) )?
                    int alt25=3;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_WHEN) ) {
                        int LA25_1 = input.LA(2);

                        if ( (synpred12_InternalCakefile()) ) {
                            alt25=1;
                        }
                    }
                    else if ( (LA25_0==RULE_BY) ) {
                        int LA25_2 = input.LA(2);

                        if ( (synpred14_InternalCakefile()) ) {
                            alt25=2;
                        }
                    }
                    switch (alt25) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1436:3: ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1436:3: ( ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )? )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1436:4: ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN ) ( (lv_when_8_0= ruleExpression ) ) ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )?
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1436:4: ( ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1436:5: ( RULE_WHEN )=>this_WHEN_7= RULE_WHEN
                            {
                            this_WHEN_7=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_ruleForSource3009); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_7, grammarAccess.getForSourceAccess().getWHENTerminalRuleCall_1_1_2_0_0()); 
                                  
                            }

                            }

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1440:2: ( (lv_when_8_0= ruleExpression ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1441:1: (lv_when_8_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1441:1: (lv_when_8_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1442:3: lv_when_8_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForSourceAccess().getWhenExpressionParserRuleCall_1_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleForSource3030);
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

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1458:2: ( ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) ) )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==RULE_BY) ) {
                                int LA23_1 = input.LA(2);

                                if ( (synpred13_InternalCakefile()) ) {
                                    alt23=1;
                                }
                            }
                            switch (alt23) {
                                case 1 :
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1458:3: ( ( RULE_BY )=>this_BY_9= RULE_BY ) ( (lv_by_10_0= ruleExpression ) )
                                    {
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1458:3: ( ( RULE_BY )=>this_BY_9= RULE_BY )
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1458:4: ( RULE_BY )=>this_BY_9= RULE_BY
                                    {
                                    this_BY_9=(Token)match(input,RULE_BY,FOLLOW_RULE_BY_in_ruleForSource3048); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_BY_9, grammarAccess.getForSourceAccess().getBYTerminalRuleCall_1_1_2_0_2_0()); 
                                          
                                    }

                                    }

                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1462:2: ( (lv_by_10_0= ruleExpression ) )
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1463:1: (lv_by_10_0= ruleExpression )
                                    {
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1463:1: (lv_by_10_0= ruleExpression )
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1464:3: lv_by_10_0= ruleExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getForSourceAccess().getByExpressionParserRuleCall_1_1_2_0_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpression_in_ruleForSource3069);
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1481:6: ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1481:6: ( ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )? )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1481:7: ( ( RULE_BY )=>this_BY_11= RULE_BY ) ( (lv_by_12_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )?
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1481:7: ( ( RULE_BY )=>this_BY_11= RULE_BY )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1481:8: ( RULE_BY )=>this_BY_11= RULE_BY
                            {
                            this_BY_11=(Token)match(input,RULE_BY,FOLLOW_RULE_BY_in_ruleForSource3096); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_BY_11, grammarAccess.getForSourceAccess().getBYTerminalRuleCall_1_1_2_1_0()); 
                                  
                            }

                            }

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1485:2: ( (lv_by_12_0= ruleExpression ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1486:1: (lv_by_12_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1486:1: (lv_by_12_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1487:3: lv_by_12_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getForSourceAccess().getByExpressionParserRuleCall_1_1_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleForSource3117);
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

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1503:2: ( ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==RULE_WHEN) ) {
                                int LA24_1 = input.LA(2);

                                if ( (synpred15_InternalCakefile()) ) {
                                    alt24=1;
                                }
                            }
                            switch (alt24) {
                                case 1 :
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1503:3: ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN ) ( (lv_when_14_0= ruleExpression ) )
                                    {
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1503:3: ( ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN )
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1503:4: ( RULE_WHEN )=>this_WHEN_13= RULE_WHEN
                                    {
                                    this_WHEN_13=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_ruleForSource3135); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_WHEN_13, grammarAccess.getForSourceAccess().getWHENTerminalRuleCall_1_1_2_1_2_0()); 
                                          
                                    }

                                    }

                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1507:2: ( (lv_when_14_0= ruleExpression ) )
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1508:1: (lv_when_14_0= ruleExpression )
                                    {
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1508:1: (lv_when_14_0= ruleExpression )
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1509:3: lv_when_14_0= ruleExpression
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getForSourceAccess().getWhenExpressionParserRuleCall_1_1_2_1_2_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpression_in_ruleForSource3156);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1533:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1534:2: (iv_ruleRange= ruleRange EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1535:2: iv_ruleRange= ruleRange EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRangeRule()); 
            }
            pushFollow(FOLLOW_ruleRange_in_entryRuleRange3199);
            iv_ruleRange=ruleRange();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRange; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRange3209); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1542:1: ruleRange returns [EObject current=null] : ( ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1545:28: ( ( ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1546:1: ( ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1546:1: ( ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1546:2: ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) ) ( (lv_end_4_0= ruleExpression ) ) this_RBRACKET_5= RULE_RBRACKET
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1546:2: ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1546:3: ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1551:25: (this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1551:26: this_LBRACKET_0= RULE_LBRACKET ( (lv_start_1_0= ruleExpression ) ) (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS )
            {
            this_LBRACKET_0=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleRange3275); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LBRACKET_0, grammarAccess.getRangeAccess().getLBRACKETTerminalRuleCall_0_0_0()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1555:1: ( (lv_start_1_0= ruleExpression ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1556:1: (lv_start_1_0= ruleExpression )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1556:1: (lv_start_1_0= ruleExpression )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1557:3: lv_start_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getStartExpressionParserRuleCall_0_0_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleRange3295);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1573:2: (this_DOT_DOT_2= RULE_DOT_DOT | this_ELLIPSIS_3= RULE_ELLIPSIS )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_DOT_DOT) ) {
                alt27=1;
            }
            else if ( (LA27_0==RULE_ELLIPSIS) ) {
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1573:3: this_DOT_DOT_2= RULE_DOT_DOT
                    {
                    this_DOT_DOT_2=(Token)match(input,RULE_DOT_DOT,FOLLOW_RULE_DOT_DOT_in_ruleRange3307); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DOT_DOT_2, grammarAccess.getRangeAccess().getDOT_DOTTerminalRuleCall_0_0_2_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1578:6: this_ELLIPSIS_3= RULE_ELLIPSIS
                    {
                    this_ELLIPSIS_3=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleRange3323); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ELLIPSIS_3, grammarAccess.getRangeAccess().getELLIPSISTerminalRuleCall_0_0_2_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1582:4: ( (lv_end_4_0= ruleExpression ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1583:1: (lv_end_4_0= ruleExpression )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1583:1: (lv_end_4_0= ruleExpression )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1584:3: lv_end_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRangeAccess().getEndExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleRange3346);
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

            this_RBRACKET_5=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleRange3357); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1612:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1613:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1614:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment3392);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment3402); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1621:1: ruleAssignment returns [EObject current=null] : ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_1=null;
        Token lv_operator_1_2=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject this_LogicOp_3 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1624:28: ( ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:1: ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:1: ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp )
            int alt29=2;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:2: ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:2: ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:3: ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:3: ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:4: ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1639:6: ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1639:7: ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1639:7: ( (lv_left_0_0= ruleAssignable ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1640:1: (lv_left_0_0= ruleAssignable )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1640:1: (lv_left_0_0= ruleAssignable )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1641:3: lv_left_0_0= ruleAssignable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getLeftAssignableParserRuleCall_0_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignable_in_ruleAssignment3490);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1657:2: ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1658:1: ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1658:1: ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1659:1: (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1659:1: (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_EQUAL) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_COMPOUND_ASSIGN) ) {
                        alt28=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1660:3: lv_operator_1_1= RULE_EQUAL
                            {
                            lv_operator_1_1=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleAssignment3509); if (state.failed) return current;
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1675:8: lv_operator_1_2= RULE_COMPOUND_ASSIGN
                            {
                            lv_operator_1_2=(Token)match(input,RULE_COMPOUND_ASSIGN,FOLLOW_RULE_COMPOUND_ASSIGN_in_ruleAssignment3529); if (state.failed) return current;
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1693:4: ( (lv_right_2_0= ruleAssigned ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1694:1: (lv_right_2_0= ruleAssigned )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1694:1: (lv_right_2_0= ruleAssigned )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1695:3: lv_right_2_0= ruleAssigned
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssignmentAccess().getRightAssignedParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssigned_in_ruleAssignment3560);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1713:5: this_LogicOp_3= ruleLogicOp
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignmentAccess().getLogicOpParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLogicOp_in_ruleAssignment3589);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1729:1: entryRuleAssigned returns [EObject current=null] : iv_ruleAssigned= ruleAssigned EOF ;
    public final EObject entryRuleAssigned() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssigned = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1730:2: (iv_ruleAssigned= ruleAssigned EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1731:2: iv_ruleAssigned= ruleAssigned EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignedRule()); 
            }
            pushFollow(FOLLOW_ruleAssigned_in_entryRuleAssigned3624);
            iv_ruleAssigned=ruleAssigned();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssigned; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssigned3634); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1738:1: ruleAssigned returns [EObject current=null] : (this_Expression_0= ruleExpression | (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT ) | this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration ) ;
    public final EObject ruleAssigned() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token this_OUTDENT_3=null;
        EObject this_Expression_0 = null;

        EObject this_Expression_2 = null;

        EObject this_AssignedClassDeclaration_4 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1741:28: ( (this_Expression_0= ruleExpression | (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT ) | this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1742:1: (this_Expression_0= ruleExpression | (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT ) | this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1742:1: (this_Expression_0= ruleExpression | (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT ) | this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_PARAM_START:
            case RULE_FUNC_ARROW:
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
            case RULE_BOUND_FUNC_ARROW:
            case RULE_NUMBER:
            case RULE_BOOL:
            case RULE_JS:
            case RULE_REGEX:
            case RULE_LPAREN:
                {
                alt30=1;
                }
                break;
            case RULE_INDENT:
                {
                alt30=2;
                }
                break;
            case RULE_CLASS:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1743:5: this_Expression_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignedAccess().getExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAssigned3681);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1752:6: (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1752:6: (this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1752:7: this_INDENT_1= RULE_INDENT this_Expression_2= ruleExpression this_OUTDENT_3= RULE_OUTDENT
                    {
                    this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleAssigned3698); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_1, grammarAccess.getAssignedAccess().getINDENTTerminalRuleCall_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignedAccess().getExpressionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAssigned3719);
                    this_Expression_2=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_OUTDENT_3=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleAssigned3729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OUTDENT_3, grammarAccess.getAssignedAccess().getOUTDENTTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1771:5: this_AssignedClassDeclaration_4= ruleAssignedClassDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignedAccess().getAssignedClassDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignedClassDeclaration_in_ruleAssigned3757);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1787:1: entryRuleLogicOp returns [EObject current=null] : iv_ruleLogicOp= ruleLogicOp EOF ;
    public final EObject entryRuleLogicOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOp = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1788:2: (iv_ruleLogicOp= ruleLogicOp EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1789:2: iv_ruleLogicOp= ruleLogicOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicOpRule()); 
            }
            pushFollow(FOLLOW_ruleLogicOp_in_entryRuleLogicOp3792);
            iv_ruleLogicOp=ruleLogicOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOp3802); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1796:1: ruleLogicOp returns [EObject current=null] : (this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )* ) ;
    public final EObject ruleLogicOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_CompareOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1799:28: ( (this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1800:1: (this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1800:1: (this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1801:5: this_CompareOp_0= ruleCompareOp ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLogicOpAccess().getCompareOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCompareOp_in_ruleLogicOp3849);
            this_CompareOp_0=ruleCompareOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_CompareOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1809:1: ( ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_LOGIC) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred18_InternalCakefile()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1809:2: ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) ) ( (lv_right_3_0= ruleCompareOp ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1809:2: ( ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1809:3: ( ( () ( ( RULE_LOGIC ) ) ) )=> ( () ( (lv_operator_2_0= RULE_LOGIC ) ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1815:6: ( () ( (lv_operator_2_0= RULE_LOGIC ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1815:7: () ( (lv_operator_2_0= RULE_LOGIC ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1815:7: ()
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1816:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getLogicOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1821:2: ( (lv_operator_2_0= RULE_LOGIC ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1822:1: (lv_operator_2_0= RULE_LOGIC )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1822:1: (lv_operator_2_0= RULE_LOGIC )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1823:3: lv_operator_2_0= RULE_LOGIC
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_LOGIC,FOLLOW_RULE_LOGIC_in_ruleLogicOp3895); if (state.failed) return current;
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

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1839:4: ( (lv_right_3_0= ruleCompareOp ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1840:1: (lv_right_3_0= ruleCompareOp )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1840:1: (lv_right_3_0= ruleCompareOp )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1841:3: lv_right_3_0= ruleCompareOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicOpAccess().getRightCompareOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCompareOp_in_ruleLogicOp3923);
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
    // $ANTLR end "ruleLogicOp"


    // $ANTLR start "entryRuleCompareOp"
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1865:1: entryRuleCompareOp returns [EObject current=null] : iv_ruleCompareOp= ruleCompareOp EOF ;
    public final EObject entryRuleCompareOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompareOp = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1866:2: (iv_ruleCompareOp= ruleCompareOp EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1867:2: iv_ruleCompareOp= ruleCompareOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareOpRule()); 
            }
            pushFollow(FOLLOW_ruleCompareOp_in_entryRuleCompareOp3961);
            iv_ruleCompareOp=ruleCompareOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompareOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompareOp3971); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1874:1: ruleCompareOp returns [EObject current=null] : (this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )* ) ;
    public final EObject ruleCompareOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_RelationOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1877:28: ( (this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1878:1: (this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1878:1: (this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1879:5: this_RelationOp_0= ruleRelationOp ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareOpAccess().getRelationOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleRelationOp_in_ruleCompareOp4018);
            this_RelationOp_0=ruleRelationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_RelationOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1887:1: ( ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMPARE) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred19_InternalCakefile()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1887:2: ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) ) ( (lv_right_3_0= ruleRelationOp ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1887:2: ( ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1887:3: ( ( () ( ( RULE_COMPARE ) ) ) )=> ( () ( (lv_operator_2_0= RULE_COMPARE ) ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1893:6: ( () ( (lv_operator_2_0= RULE_COMPARE ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1893:7: () ( (lv_operator_2_0= RULE_COMPARE ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1893:7: ()
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1894:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCompareOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1899:2: ( (lv_operator_2_0= RULE_COMPARE ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1900:1: (lv_operator_2_0= RULE_COMPARE )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1900:1: (lv_operator_2_0= RULE_COMPARE )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1901:3: lv_operator_2_0= RULE_COMPARE
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_ruleCompareOp4064); if (state.failed) return current;
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

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1917:4: ( (lv_right_3_0= ruleRelationOp ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1918:1: (lv_right_3_0= ruleRelationOp )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1918:1: (lv_right_3_0= ruleRelationOp )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1919:3: lv_right_3_0= ruleRelationOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCompareOpAccess().getRightRelationOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelationOp_in_ruleCompareOp4092);
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
    // $ANTLR end "ruleCompareOp"


    // $ANTLR start "entryRuleRelationOp"
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1943:1: entryRuleRelationOp returns [EObject current=null] : iv_ruleRelationOp= ruleRelationOp EOF ;
    public final EObject entryRuleRelationOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationOp = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1944:2: (iv_ruleRelationOp= ruleRelationOp EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1945:2: iv_ruleRelationOp= ruleRelationOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationOpRule()); 
            }
            pushFollow(FOLLOW_ruleRelationOp_in_entryRuleRelationOp4130);
            iv_ruleRelationOp=ruleRelationOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationOp4140); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1952:1: ruleRelationOp returns [EObject current=null] : (this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )* ) ;
    public final EObject ruleRelationOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_ShiftOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1955:28: ( (this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1956:1: (this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1956:1: (this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1957:5: this_ShiftOp_0= ruleShiftOp ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationOpAccess().getShiftOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleShiftOp_in_ruleRelationOp4187);
            this_ShiftOp_0=ruleShiftOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ShiftOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1965:1: ( ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_RELATION) ) {
                    int LA33_2 = input.LA(2);

                    if ( (synpred20_InternalCakefile()) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1965:2: ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) ) ( (lv_right_3_0= ruleShiftOp ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1965:2: ( ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1965:3: ( ( () ( ( RULE_RELATION ) ) ) )=> ( () ( (lv_operator_2_0= RULE_RELATION ) ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1971:6: ( () ( (lv_operator_2_0= RULE_RELATION ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1971:7: () ( (lv_operator_2_0= RULE_RELATION ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1971:7: ()
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1972:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getRelationOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1977:2: ( (lv_operator_2_0= RULE_RELATION ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1978:1: (lv_operator_2_0= RULE_RELATION )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1978:1: (lv_operator_2_0= RULE_RELATION )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1979:3: lv_operator_2_0= RULE_RELATION
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_RELATION,FOLLOW_RULE_RELATION_in_ruleRelationOp4233); if (state.failed) return current;
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

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1995:4: ( (lv_right_3_0= ruleShiftOp ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1996:1: (lv_right_3_0= ruleShiftOp )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1996:1: (lv_right_3_0= ruleShiftOp )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1997:3: lv_right_3_0= ruleShiftOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationOpAccess().getRightShiftOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleShiftOp_in_ruleRelationOp4261);
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
    // $ANTLR end "ruleRelationOp"


    // $ANTLR start "entryRuleShiftOp"
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2021:1: entryRuleShiftOp returns [EObject current=null] : iv_ruleShiftOp= ruleShiftOp EOF ;
    public final EObject entryRuleShiftOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShiftOp = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2022:2: (iv_ruleShiftOp= ruleShiftOp EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2023:2: iv_ruleShiftOp= ruleShiftOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getShiftOpRule()); 
            }
            pushFollow(FOLLOW_ruleShiftOp_in_entryRuleShiftOp4299);
            iv_ruleShiftOp=ruleShiftOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleShiftOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleShiftOp4309); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2030:1: ruleShiftOp returns [EObject current=null] : (this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )* ) ;
    public final EObject ruleShiftOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_AdditiveOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2033:28: ( (this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2034:1: (this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2034:1: (this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2035:5: this_AdditiveOp_0= ruleAdditiveOp ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getShiftOpAccess().getAdditiveOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveOp_in_ruleShiftOp4356);
            this_AdditiveOp_0=ruleAdditiveOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2043:1: ( ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_SHIFT) ) {
                    int LA34_2 = input.LA(2);

                    if ( (synpred21_InternalCakefile()) ) {
                        alt34=1;
                    }


                }


                switch (alt34) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2043:2: ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) ) ( (lv_right_3_0= ruleAdditiveOp ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2043:2: ( ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2043:3: ( ( () ( ( RULE_SHIFT ) ) ) )=> ( () ( (lv_operator_2_0= RULE_SHIFT ) ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2049:6: ( () ( (lv_operator_2_0= RULE_SHIFT ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2049:7: () ( (lv_operator_2_0= RULE_SHIFT ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2049:7: ()
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2050:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getShiftOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2055:2: ( (lv_operator_2_0= RULE_SHIFT ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2056:1: (lv_operator_2_0= RULE_SHIFT )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2056:1: (lv_operator_2_0= RULE_SHIFT )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2057:3: lv_operator_2_0= RULE_SHIFT
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_SHIFT,FOLLOW_RULE_SHIFT_in_ruleShiftOp4402); if (state.failed) return current;
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

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2073:4: ( (lv_right_3_0= ruleAdditiveOp ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2074:1: (lv_right_3_0= ruleAdditiveOp )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2074:1: (lv_right_3_0= ruleAdditiveOp )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2075:3: lv_right_3_0= ruleAdditiveOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getShiftOpAccess().getRightAdditiveOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveOp_in_ruleShiftOp4430);
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
            	    break loop34;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2099:1: entryRuleAdditiveOp returns [EObject current=null] : iv_ruleAdditiveOp= ruleAdditiveOp EOF ;
    public final EObject entryRuleAdditiveOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveOp = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2100:2: (iv_ruleAdditiveOp= ruleAdditiveOp EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2101:2: iv_ruleAdditiveOp= ruleAdditiveOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveOpRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveOp_in_entryRuleAdditiveOp4468);
            iv_ruleAdditiveOp=ruleAdditiveOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveOp4478); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2108:1: ruleAdditiveOp returns [EObject current=null] : (this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )* ) ;
    public final EObject ruleAdditiveOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_MathOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2111:28: ( (this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2112:1: (this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2112:1: (this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2113:5: this_MathOp_0= ruleMathOp ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveOpAccess().getMathOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMathOp_in_ruleAdditiveOp4525);
            this_MathOp_0=ruleMathOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MathOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2121:1: ( ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_PLUS) ) {
                    int LA36_2 = input.LA(2);

                    if ( (synpred22_InternalCakefile()) ) {
                        alt36=1;
                    }


                }
                else if ( (LA36_0==RULE_MINUS) ) {
                    int LA36_3 = input.LA(2);

                    if ( (synpred22_InternalCakefile()) ) {
                        alt36=1;
                    }


                }


                switch (alt36) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2121:2: ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) ) ( (lv_right_3_0= ruleMathOp ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2121:2: ( ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2121:3: ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )=> ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2132:6: ( () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2132:7: () ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2132:7: ()
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2133:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2138:2: ( ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2139:1: ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2139:1: ( (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2140:1: (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2140:1: (lv_operator_2_1= RULE_PLUS | lv_operator_2_2= RULE_MINUS )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_PLUS) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==RULE_MINUS) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2141:3: lv_operator_2_1= RULE_PLUS
            	            {
            	            lv_operator_2_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleAdditiveOp4588); if (state.failed) return current;
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
            	            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2156:8: lv_operator_2_2= RULE_MINUS
            	            {
            	            lv_operator_2_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleAdditiveOp4608); if (state.failed) return current;
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

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2174:4: ( (lv_right_3_0= ruleMathOp ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2175:1: (lv_right_3_0= ruleMathOp )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2175:1: (lv_right_3_0= ruleMathOp )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2176:3: lv_right_3_0= ruleMathOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveOpAccess().getRightMathOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMathOp_in_ruleAdditiveOp4639);
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
    // $ANTLR end "ruleAdditiveOp"


    // $ANTLR start "entryRuleMathOp"
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2200:1: entryRuleMathOp returns [EObject current=null] : iv_ruleMathOp= ruleMathOp EOF ;
    public final EObject entryRuleMathOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathOp = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2201:2: (iv_ruleMathOp= ruleMathOp EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2202:2: iv_ruleMathOp= ruleMathOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMathOpRule()); 
            }
            pushFollow(FOLLOW_ruleMathOp_in_entryRuleMathOp4677);
            iv_ruleMathOp=ruleMathOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMathOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathOp4687); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2209:1: ruleMathOp returns [EObject current=null] : (this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )* ) ;
    public final EObject ruleMathOp() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        EObject this_UnaryOp_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2212:28: ( (this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2213:1: (this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2213:1: (this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2214:5: this_UnaryOp_0= ruleUnaryOp ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMathOpAccess().getUnaryOpParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryOp_in_ruleMathOp4734);
            this_UnaryOp_0=ruleUnaryOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryOp_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2222:1: ( ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_MATH) ) {
                    int LA37_2 = input.LA(2);

                    if ( (synpred23_InternalCakefile()) ) {
                        alt37=1;
                    }


                }


                switch (alt37) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2222:2: ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) ) ( (lv_right_3_0= ruleUnaryOp ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2222:2: ( ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2222:3: ( ( () ( ( RULE_MATH ) ) ) )=> ( () ( (lv_operator_2_0= RULE_MATH ) ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2228:6: ( () ( (lv_operator_2_0= RULE_MATH ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2228:7: () ( (lv_operator_2_0= RULE_MATH ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2228:7: ()
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2229:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMathOpAccess().getBinaryExpLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2234:2: ( (lv_operator_2_0= RULE_MATH ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2235:1: (lv_operator_2_0= RULE_MATH )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2235:1: (lv_operator_2_0= RULE_MATH )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2236:3: lv_operator_2_0= RULE_MATH
            	    {
            	    lv_operator_2_0=(Token)match(input,RULE_MATH,FOLLOW_RULE_MATH_in_ruleMathOp4780); if (state.failed) return current;
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

            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2252:4: ( (lv_right_3_0= ruleUnaryOp ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2253:1: (lv_right_3_0= ruleUnaryOp )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2253:1: (lv_right_3_0= ruleUnaryOp )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2254:3: lv_right_3_0= ruleUnaryOp
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMathOpAccess().getRightUnaryOpParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryOp_in_ruleMathOp4808);
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
            	    break loop37;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2278:1: entryRuleUnaryOp returns [EObject current=null] : iv_ruleUnaryOp= ruleUnaryOp EOF ;
    public final EObject entryRuleUnaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryOp = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2279:2: (iv_ruleUnaryOp= ruleUnaryOp EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2280:2: iv_ruleUnaryOp= ruleUnaryOp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOpRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp4846);
            iv_ruleUnaryOp=ruleUnaryOp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryOp4856); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2287:1: ruleUnaryOp returns [EObject current=null] : ( ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression ) | ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable ) | (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? ) ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2290:28: ( ( ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression ) | ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable ) | (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2291:1: ( ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression ) | ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable ) | (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2291:1: ( ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression ) | ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable ) | (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? ) )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_PLUS:
            case RULE_MINUS:
            case RULE_UNARY:
                {
                alt41=1;
                }
                break;
            case RULE_PLUS_PLUS:
            case RULE_MINUS_MINUS:
                {
                alt41=2;
                }
                break;
            case RULE_PARAM_START:
            case RULE_FUNC_ARROW:
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
            case RULE_BOUND_FUNC_ARROW:
            case RULE_NUMBER:
            case RULE_BOOL:
            case RULE_JS:
            case RULE_REGEX:
            case RULE_LPAREN:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2291:2: ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2291:2: ( (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2291:3: (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS ) this_Expression_3= ruleExpression
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2291:3: (this_UNARY_0= RULE_UNARY | this_PLUS_1= RULE_PLUS | this_MINUS_2= RULE_MINUS )
                    int alt38=3;
                    switch ( input.LA(1) ) {
                    case RULE_UNARY:
                        {
                        alt38=1;
                        }
                        break;
                    case RULE_PLUS:
                        {
                        alt38=2;
                        }
                        break;
                    case RULE_MINUS:
                        {
                        alt38=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }

                    switch (alt38) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2291:4: this_UNARY_0= RULE_UNARY
                            {
                            this_UNARY_0=(Token)match(input,RULE_UNARY,FOLLOW_RULE_UNARY_in_ruleUnaryOp4894); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_UNARY_0, grammarAccess.getUnaryOpAccess().getUNARYTerminalRuleCall_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2296:6: this_PLUS_1= RULE_PLUS
                            {
                            this_PLUS_1=(Token)match(input,RULE_PLUS,FOLLOW_RULE_PLUS_in_ruleUnaryOp4910); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_PLUS_1, grammarAccess.getUnaryOpAccess().getPLUSTerminalRuleCall_0_0_1()); 
                                  
                            }

                            }
                            break;
                        case 3 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2301:6: this_MINUS_2= RULE_MINUS
                            {
                            this_MINUS_2=(Token)match(input,RULE_MINUS,FOLLOW_RULE_MINUS_in_ruleUnaryOp4926); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_MINUS_2, grammarAccess.getUnaryOpAccess().getMINUSTerminalRuleCall_0_0_2()); 
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOpAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleUnaryOp4948);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2315:6: ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2315:6: ( (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2315:7: (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS ) this_Variable_6= ruleVariable
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2315:7: (this_PLUS_PLUS_4= RULE_PLUS_PLUS | this_MINUS_MINUS_5= RULE_MINUS_MINUS )
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==RULE_PLUS_PLUS) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==RULE_MINUS_MINUS) ) {
                        alt39=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 39, 0, input);

                        throw nvae;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2315:8: this_PLUS_PLUS_4= RULE_PLUS_PLUS
                            {
                            this_PLUS_PLUS_4=(Token)match(input,RULE_PLUS_PLUS,FOLLOW_RULE_PLUS_PLUS_in_ruleUnaryOp4967); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_PLUS_PLUS_4, grammarAccess.getUnaryOpAccess().getPLUS_PLUSTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2320:6: this_MINUS_MINUS_5= RULE_MINUS_MINUS
                            {
                            this_MINUS_MINUS_5=(Token)match(input,RULE_MINUS_MINUS,FOLLOW_RULE_MINUS_MINUS_in_ruleUnaryOp4983); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_MINUS_MINUS_5, grammarAccess.getUnaryOpAccess().getMINUS_MINUSTerminalRuleCall_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOpAccess().getVariableParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleUnaryOp5005);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2334:6: (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2334:6: (this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2335:5: this_Application_7= ruleApplication (this_QUESTION_8= RULE_QUESTION )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryOpAccess().getApplicationParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleApplication_in_ruleUnaryOp5034);
                    this_Application_7=ruleApplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Application_7; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2343:1: (this_QUESTION_8= RULE_QUESTION )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_QUESTION) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2343:2: this_QUESTION_8= RULE_QUESTION
                            {
                            this_QUESTION_8=(Token)match(input,RULE_QUESTION,FOLLOW_RULE_QUESTION_in_ruleUnaryOp5045); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2355:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2356:2: (iv_ruleApplication= ruleApplication EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2357:2: iv_ruleApplication= ruleApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getApplicationRule()); 
            }
            pushFollow(FOLLOW_ruleApplication_in_entryRuleApplication5083);
            iv_ruleApplication=ruleApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleApplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleApplication5093); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2364:1: ruleApplication returns [EObject current=null] : ( ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) ) | ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* ) ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2367:28: ( ( ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) ) | ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2368:1: ( ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) ) | ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2368:1: ( ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) ) | ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_SUPER) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_PARAM_START||LA44_0==RULE_FUNC_ARROW||LA44_0==RULE_STRING||(LA44_0>=RULE_FOR && LA44_0<=RULE_WHILE)||LA44_0==RULE_UNTIL||LA44_0==RULE_LBRACKET||LA44_0==RULE_AT_SIGIL||(LA44_0>=RULE_THIS && LA44_0<=RULE_TRY)||LA44_0==RULE_SWITCH||(LA44_0>=RULE_IF && LA44_0<=RULE_LCURLY)||(LA44_0>=RULE_BOUND_FUNC_ARROW && LA44_0<=RULE_LPAREN)) ) {
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2368:2: ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2368:2: ( () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2368:3: () (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2368:3: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2369:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getApplicationAccess().getSuperCallAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2374:2: (this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2374:3: this_SUPER_1= RULE_SUPER (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )?
                    {
                    this_SUPER_1=(Token)match(input,RULE_SUPER,FOLLOW_RULE_SUPER_in_ruleApplication5140); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SUPER_1, grammarAccess.getApplicationAccess().getSUPERTerminalRuleCall_0_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2378:1: (this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_CALL_START) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2378:2: this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END
                            {
                            this_CALL_START_2=(Token)match(input,RULE_CALL_START,FOLLOW_RULE_CALL_START_in_ruleApplication5151); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_CALL_START_2, grammarAccess.getApplicationAccess().getCALL_STARTTerminalRuleCall_0_1_1_0()); 
                                  
                            }
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2382:1: ( (lv_args_3_0= ruleArgList ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2383:1: (lv_args_3_0= ruleArgList )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2383:1: (lv_args_3_0= ruleArgList )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2384:3: lv_args_3_0= ruleArgList
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getApplicationAccess().getArgsArgListParserRuleCall_0_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleArgList_in_ruleApplication5171);
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

                            this_CALL_END_4=(Token)match(input,RULE_CALL_END,FOLLOW_RULE_CALL_END_in_ruleApplication5182); if (state.failed) return current;
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2405:6: ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2405:6: ( ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )* )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2405:7: ( (lv_value_5_0= rulePrimaryExpression ) ) ( (lv_features_6_0= ruleFeatureCall ) )*
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2405:7: ( (lv_value_5_0= rulePrimaryExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2406:1: (lv_value_5_0= rulePrimaryExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2406:1: (lv_value_5_0= rulePrimaryExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2407:3: lv_value_5_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getApplicationAccess().getValuePrimaryExpressionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleApplication5213);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2423:2: ( (lv_features_6_0= ruleFeatureCall ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_CALL_START||LA43_0==RULE_FUNC_EXIST||(LA43_0>=RULE_DOT && LA43_0<=RULE_INDEX_START)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2424:1: (lv_features_6_0= ruleFeatureCall )
                    	    {
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2424:1: (lv_features_6_0= ruleFeatureCall )
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2425:3: lv_features_6_0= ruleFeatureCall
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getApplicationAccess().getFeaturesFeatureCallParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleFeatureCall_in_ruleApplication5234);
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
                    	    break loop43;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2449:1: entryRuleFeatureCall returns [EObject current=null] : iv_ruleFeatureCall= ruleFeatureCall EOF ;
    public final EObject entryRuleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureCall = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2450:2: (iv_ruleFeatureCall= ruleFeatureCall EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2451:2: iv_ruleFeatureCall= ruleFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall5272);
            iv_ruleFeatureCall=ruleFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureCall5282); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2458:1: ruleFeatureCall returns [EObject current=null] : (this_FunctionCall_0= ruleFunctionCall | this_PropertyAccess_1= rulePropertyAccess ) ;
    public final EObject ruleFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionCall_0 = null;

        EObject this_PropertyAccess_1 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2461:28: ( (this_FunctionCall_0= ruleFunctionCall | this_PropertyAccess_1= rulePropertyAccess ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2462:1: (this_FunctionCall_0= ruleFunctionCall | this_PropertyAccess_1= rulePropertyAccess )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2462:1: (this_FunctionCall_0= ruleFunctionCall | this_PropertyAccess_1= rulePropertyAccess )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_CALL_START||LA45_0==RULE_FUNC_EXIST) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=RULE_DOT && LA45_0<=RULE_INDEX_START)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2463:5: this_FunctionCall_0= ruleFunctionCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallAccess().getFunctionCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionCall_in_ruleFeatureCall5329);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2473:5: this_PropertyAccess_1= rulePropertyAccess
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureCallAccess().getPropertyAccessParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePropertyAccess_in_ruleFeatureCall5356);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2489:1: entryRuleFunctionCall returns [EObject current=null] : iv_ruleFunctionCall= ruleFunctionCall EOF ;
    public final EObject entryRuleFunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionCall = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2490:2: (iv_ruleFunctionCall= ruleFunctionCall EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2491:2: iv_ruleFunctionCall= ruleFunctionCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5391);
            iv_ruleFunctionCall=ruleFunctionCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionCall5401); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2498:1: ruleFunctionCall returns [EObject current=null] : ( () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END ) ;
    public final EObject ruleFunctionCall() throws RecognitionException {
        EObject current = null;

        Token this_FUNC_EXIST_1=null;
        Token this_CALL_START_2=null;
        Token this_CALL_END_4=null;
        EObject lv_args_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2501:28: ( ( () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2502:1: ( () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2502:1: ( () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2502:2: () (this_FUNC_EXIST_1= RULE_FUNC_EXIST )? this_CALL_START_2= RULE_CALL_START ( (lv_args_3_0= ruleArgList ) ) this_CALL_END_4= RULE_CALL_END
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2502:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2503:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
                          current);
                  
            }

            }

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2508:2: (this_FUNC_EXIST_1= RULE_FUNC_EXIST )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_FUNC_EXIST) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2508:3: this_FUNC_EXIST_1= RULE_FUNC_EXIST
                    {
                    this_FUNC_EXIST_1=(Token)match(input,RULE_FUNC_EXIST,FOLLOW_RULE_FUNC_EXIST_in_ruleFunctionCall5447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FUNC_EXIST_1, grammarAccess.getFunctionCallAccess().getFUNC_EXISTTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }

            this_CALL_START_2=(Token)match(input,RULE_CALL_START,FOLLOW_RULE_CALL_START_in_ruleFunctionCall5459); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_CALL_START_2, grammarAccess.getFunctionCallAccess().getCALL_STARTTerminalRuleCall_2()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2516:1: ( (lv_args_3_0= ruleArgList ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2517:1: (lv_args_3_0= ruleArgList )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2517:1: (lv_args_3_0= ruleArgList )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2518:3: lv_args_3_0= ruleArgList
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsArgListParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArgList_in_ruleFunctionCall5479);
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

            this_CALL_END_4=(Token)match(input,RULE_CALL_END,FOLLOW_RULE_CALL_END_in_ruleFunctionCall5490); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2546:1: entryRulePropertyAccess returns [EObject current=null] : iv_rulePropertyAccess= rulePropertyAccess EOF ;
    public final EObject entryRulePropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyAccess = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2547:2: (iv_rulePropertyAccess= rulePropertyAccess EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2548:2: iv_rulePropertyAccess= rulePropertyAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyAccessRule()); 
            }
            pushFollow(FOLLOW_rulePropertyAccess_in_entryRulePropertyAccess5525);
            iv_rulePropertyAccess=rulePropertyAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyAccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyAccess5535); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2555:1: rulePropertyAccess returns [EObject current=null] : (this_NamedPropertyAccess_0= ruleNamedPropertyAccess | this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess ) ;
    public final EObject rulePropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject this_NamedPropertyAccess_0 = null;

        EObject this_IndexedPropertyAccess_1 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2558:28: ( (this_NamedPropertyAccess_0= ruleNamedPropertyAccess | this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2559:1: (this_NamedPropertyAccess_0= ruleNamedPropertyAccess | this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2559:1: (this_NamedPropertyAccess_0= ruleNamedPropertyAccess | this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_DOT && LA47_0<=RULE_DOUBLE_COLON)) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_INDEX_START) ) {
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2560:5: this_NamedPropertyAccess_0= ruleNamedPropertyAccess
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccessAccess().getNamedPropertyAccessParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNamedPropertyAccess_in_rulePropertyAccess5582);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2570:5: this_IndexedPropertyAccess_1= ruleIndexedPropertyAccess
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccessAccess().getIndexedPropertyAccessParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIndexedPropertyAccess_in_rulePropertyAccess5609);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2586:1: entryRuleThisProperty returns [EObject current=null] : iv_ruleThisProperty= ruleThisProperty EOF ;
    public final EObject entryRuleThisProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThisProperty = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2587:2: (iv_ruleThisProperty= ruleThisProperty EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2588:2: iv_ruleThisProperty= ruleThisProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getThisPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleThisProperty_in_entryRuleThisProperty5644);
            iv_ruleThisProperty=ruleThisProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleThisProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleThisProperty5654); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2595:1: ruleThisProperty returns [EObject current=null] : (this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId ) ;
    public final EObject ruleThisProperty() throws RecognitionException {
        EObject current = null;

        Token this_AT_SIGIL_0=null;
        EObject this_Id_1 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2598:28: ( (this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2599:1: (this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2599:1: (this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2599:2: this_AT_SIGIL_0= RULE_AT_SIGIL this_Id_1= ruleId
            {
            this_AT_SIGIL_0=(Token)match(input,RULE_AT_SIGIL,FOLLOW_RULE_AT_SIGIL_in_ruleThisProperty5690); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_AT_SIGIL_0, grammarAccess.getThisPropertyAccess().getAT_SIGILTerminalRuleCall_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getThisPropertyAccess().getIdParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleId_in_ruleThisProperty5711);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2620:1: entryRuleNamedPropertyAccess returns [EObject current=null] : iv_ruleNamedPropertyAccess= ruleNamedPropertyAccess EOF ;
    public final EObject entryRuleNamedPropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedPropertyAccess = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2621:2: (iv_ruleNamedPropertyAccess= ruleNamedPropertyAccess EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2622:2: iv_ruleNamedPropertyAccess= ruleNamedPropertyAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedPropertyAccessRule()); 
            }
            pushFollow(FOLLOW_ruleNamedPropertyAccess_in_entryRuleNamedPropertyAccess5746);
            iv_ruleNamedPropertyAccess=ruleNamedPropertyAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedPropertyAccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedPropertyAccess5756); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2629:1: ruleNamedPropertyAccess returns [EObject current=null] : ( ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) ) | ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? ) ) ;
    public final EObject ruleNamedPropertyAccess() throws RecognitionException {
        EObject current = null;

        Token lv_accessor_0_1=null;
        Token lv_accessor_0_2=null;
        Token lv_accessor_2_0=null;
        EObject lv_name_1_0 = null;

        EObject lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2632:28: ( ( ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) ) | ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2633:1: ( ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) ) | ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2633:1: ( ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) ) | ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_DOT && LA50_0<=RULE_QUESTION_DOT)) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_DOUBLE_COLON) ) {
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2633:2: ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2633:2: ( ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2633:3: ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) ) ( (lv_name_1_0= ruleId ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2633:3: ( ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2634:1: ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2634:1: ( (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2635:1: (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2635:1: (lv_accessor_0_1= RULE_DOT | lv_accessor_0_2= RULE_QUESTION_DOT )
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( (LA48_0==RULE_DOT) ) {
                        alt48=1;
                    }
                    else if ( (LA48_0==RULE_QUESTION_DOT) ) {
                        alt48=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 0, input);

                        throw nvae;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2636:3: lv_accessor_0_1= RULE_DOT
                            {
                            lv_accessor_0_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleNamedPropertyAccess5801); if (state.failed) return current;
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2651:8: lv_accessor_0_2= RULE_QUESTION_DOT
                            {
                            lv_accessor_0_2=(Token)match(input,RULE_QUESTION_DOT,FOLLOW_RULE_QUESTION_DOT_in_ruleNamedPropertyAccess5821); if (state.failed) return current;
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2669:2: ( (lv_name_1_0= ruleId ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2670:1: (lv_name_1_0= ruleId )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2670:1: (lv_name_1_0= ruleId )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2671:3: lv_name_1_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNamedPropertyAccessAccess().getNameIdParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleNamedPropertyAccess5850);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2688:6: ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2688:6: ( ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2688:7: ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) ) ( (lv_name_3_0= ruleId ) )?
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2688:7: ( (lv_accessor_2_0= RULE_DOUBLE_COLON ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2689:1: (lv_accessor_2_0= RULE_DOUBLE_COLON )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2689:1: (lv_accessor_2_0= RULE_DOUBLE_COLON )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2690:3: lv_accessor_2_0= RULE_DOUBLE_COLON
                    {
                    lv_accessor_2_0=(Token)match(input,RULE_DOUBLE_COLON,FOLLOW_RULE_DOUBLE_COLON_in_ruleNamedPropertyAccess5875); if (state.failed) return current;
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2706:2: ( (lv_name_3_0= ruleId ) )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==RULE_IDENTIFIER) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2707:1: (lv_name_3_0= ruleId )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2707:1: (lv_name_3_0= ruleId )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2708:3: lv_name_3_0= ruleId
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getNamedPropertyAccessAccess().getNameIdParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleId_in_ruleNamedPropertyAccess5901);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2732:1: entryRuleIndexedPropertyAccess returns [EObject current=null] : iv_ruleIndexedPropertyAccess= ruleIndexedPropertyAccess EOF ;
    public final EObject entryRuleIndexedPropertyAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexedPropertyAccess = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2733:2: (iv_ruleIndexedPropertyAccess= ruleIndexedPropertyAccess EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2734:2: iv_ruleIndexedPropertyAccess= ruleIndexedPropertyAccess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexedPropertyAccessRule()); 
            }
            pushFollow(FOLLOW_ruleIndexedPropertyAccess_in_entryRuleIndexedPropertyAccess5939);
            iv_ruleIndexedPropertyAccess=ruleIndexedPropertyAccess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndexedPropertyAccess; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndexedPropertyAccess5949); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2741:1: ruleIndexedPropertyAccess returns [EObject current=null] : (this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END ) ;
    public final EObject ruleIndexedPropertyAccess() throws RecognitionException {
        EObject current = null;

        Token this_INDEX_START_0=null;
        Token this_INDEX_END_2=null;
        EObject lv_index_1_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2744:28: ( (this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2745:1: (this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2745:1: (this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2745:2: this_INDEX_START_0= RULE_INDEX_START ( (lv_index_1_0= ruleIndex ) ) this_INDEX_END_2= RULE_INDEX_END
            {
            this_INDEX_START_0=(Token)match(input,RULE_INDEX_START,FOLLOW_RULE_INDEX_START_in_ruleIndexedPropertyAccess5985); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INDEX_START_0, grammarAccess.getIndexedPropertyAccessAccess().getINDEX_STARTTerminalRuleCall_0()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2749:1: ( (lv_index_1_0= ruleIndex ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2750:1: (lv_index_1_0= ruleIndex )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2750:1: (lv_index_1_0= ruleIndex )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2751:3: lv_index_1_0= ruleIndex
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIndexedPropertyAccessAccess().getIndexIndexParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIndex_in_ruleIndexedPropertyAccess6005);
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

            this_INDEX_END_2=(Token)match(input,RULE_INDEX_END,FOLLOW_RULE_INDEX_END_in_ruleIndexedPropertyAccess6016); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2779:1: entryRuleIndex returns [EObject current=null] : iv_ruleIndex= ruleIndex EOF ;
    public final EObject entryRuleIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndex = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2780:2: (iv_ruleIndex= ruleIndex EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2781:2: iv_ruleIndex= ruleIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndexRule()); 
            }
            pushFollow(FOLLOW_ruleIndex_in_entryRuleIndex6051);
            iv_ruleIndex=ruleIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndex; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndex6061); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2788:1: ruleIndex returns [EObject current=null] : ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2791:28: ( ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2792:1: ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2792:1: ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) )
            int alt54=3;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2792:2: ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2792:2: ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2792:3: ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2792:3: ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2792:4: ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2803:1: ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2804:1: (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2804:1: (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS )
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2805:3: lv_dots_0_1= RULE_DOT_DOT
                            {
                            lv_dots_0_1=(Token)match(input,RULE_DOT_DOT,FOLLOW_RULE_DOT_DOT_in_ruleIndex6132); if (state.failed) return current;
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2820:8: lv_dots_0_2= RULE_ELLIPSIS
                            {
                            lv_dots_0_2=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleIndex6152); if (state.failed) return current;
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2838:2: ( (lv_end_1_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2839:1: (lv_end_1_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2839:1: (lv_end_1_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2840:3: lv_end_1_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIndexAccess().getEndExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIndex6181);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:6: ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:6: ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:7: ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )?
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:7: ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:8: ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2871:6: ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2871:7: ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2871:7: ( (lv_start_2_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2872:1: (lv_start_2_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2872:1: (lv_start_2_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2873:3: lv_start_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIndexAccess().getStartExpressionParserRuleCall_1_0_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIndex6251);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2889:2: ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2890:1: ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2890:1: ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2891:1: (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2891:1: (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_DOT_DOT) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==RULE_ELLIPSIS) ) {
                        alt52=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2892:3: lv_dots_3_1= RULE_DOT_DOT
                            {
                            lv_dots_3_1=(Token)match(input,RULE_DOT_DOT,FOLLOW_RULE_DOT_DOT_in_ruleIndex6270); if (state.failed) return current;
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2907:8: lv_dots_3_2= RULE_ELLIPSIS
                            {
                            lv_dots_3_2=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleIndex6290); if (state.failed) return current;
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2925:4: ( (lv_end_4_0= ruleExpression ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==RULE_PARAM_START||LA53_0==RULE_FUNC_ARROW||LA53_0==RULE_STRING||(LA53_0>=RULE_FOR && LA53_0<=RULE_WHILE)||LA53_0==RULE_UNTIL||LA53_0==RULE_LBRACKET||(LA53_0>=RULE_PLUS && LA53_0<=RULE_MINUS)||(LA53_0>=RULE_UNARY && LA53_0<=RULE_MINUS_MINUS)||LA53_0==RULE_SUPER||LA53_0==RULE_AT_SIGIL||(LA53_0>=RULE_THIS && LA53_0<=RULE_TRY)||LA53_0==RULE_SWITCH||(LA53_0>=RULE_IF && LA53_0<=RULE_LCURLY)||(LA53_0>=RULE_BOUND_FUNC_ARROW && LA53_0<=RULE_LPAREN)) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2926:1: (lv_end_4_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2926:1: (lv_end_4_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2927:3: lv_end_4_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getIndexAccess().getEndExpressionParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleIndex6321);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2944:6: ( (lv_exp_5_0= ruleExpression ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2944:6: ( (lv_exp_5_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2945:1: (lv_exp_5_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2945:1: (lv_exp_5_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2946:3: lv_exp_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIndexAccess().getExpExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIndex6350);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2970:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2971:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2972:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6386);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression6396); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2979:1: rulePrimaryExpression returns [EObject current=null] : (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2982:28: ( (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2983:1: (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2983:1: (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef )
            int alt62=16;
            alt62 = dfa62.predict(input);
            switch (alt62) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2984:5: this_IfExp_0= ruleIfExp
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIfExpParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfExp_in_rulePrimaryExpression6443);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2994:5: this_Parenthetical_1= ruleParenthetical
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getParentheticalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthetical_in_rulePrimaryExpression6470);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3004:5: this_Literal_2= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_rulePrimaryExpression6497);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3013:6: ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3013:6: ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3013:7: ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getRangeParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRange_in_rulePrimaryExpression6553);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3028:6: ( ( RULE_LBRACKET )=>this_Array_4= ruleArray )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3028:6: ( ( RULE_LBRACKET )=>this_Array_4= ruleArray )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3028:7: ( RULE_LBRACKET )=>this_Array_4= ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getArrayParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArray_in_rulePrimaryExpression6587);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3038:6: ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3038:6: ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3038:7: ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getDictionaryParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionary_in_rulePrimaryExpression6621);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3049:5: this_Lambda_6= ruleLambda
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLambdaParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLambda_in_rulePrimaryExpression6649);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3059:5: this_ThisProperty_7= ruleThisProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getThisPropertyParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleThisProperty_in_rulePrimaryExpression6676);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3068:6: ( () this_THIS_9= RULE_THIS )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3068:6: ( () this_THIS_9= RULE_THIS )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3068:7: () this_THIS_9= RULE_THIS
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3068:7: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3069:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getThisAloneAction_8_0(),
                                  current);
                          
                    }

                    }

                    this_THIS_9=(Token)match(input,RULE_THIS,FOLLOW_RULE_THIS_in_rulePrimaryExpression6702); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_THIS_9, grammarAccess.getPrimaryExpressionAccess().getTHISTerminalRuleCall_8_1()); 
                          
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3079:6: ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3079:6: ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3079:7: () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3079:7: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3080:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getForAction_9_0(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3085:2: (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3085:3: this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) )
                    {
                    this_FOR_11=(Token)match(input,RULE_FOR,FOLLOW_RULE_FOR_in_rulePrimaryExpression6730); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FOR_11, grammarAccess.getPrimaryExpressionAccess().getFORTerminalRuleCall_9_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3089:1: ( (lv_loop_12_0= ruleForBody ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3090:1: (lv_loop_12_0= ruleForBody )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3090:1: (lv_loop_12_0= ruleForBody )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3091:3: lv_loop_12_0= ruleForBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLoopForBodyParserRuleCall_9_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleForBody_in_rulePrimaryExpression6750);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3107:2: ( (lv_body_13_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3108:1: (lv_body_13_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3108:1: (lv_body_13_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3109:3: lv_body_13_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_9_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6771);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3126:6: ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3126:6: ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3126:7: () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3126:7: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3127:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getWhileAction_10_0(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3132:2: (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3132:3: this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) )
                    {
                    this_WHILE_15=(Token)match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_rulePrimaryExpression6801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_WHILE_15, grammarAccess.getPrimaryExpressionAccess().getWHILETerminalRuleCall_10_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3136:1: ( (lv_loop_16_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3137:1: (lv_loop_16_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3137:1: (lv_loop_16_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3138:3: lv_loop_16_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLoopExpressionParserRuleCall_10_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression6821);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3154:2: (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==RULE_WHEN) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3154:3: this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) )
                            {
                            this_WHEN_17=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_rulePrimaryExpression6833); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_17, grammarAccess.getPrimaryExpressionAccess().getWHENTerminalRuleCall_10_1_2_0()); 
                                  
                            }
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3158:1: ( (lv_when_18_0= ruleExpression ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3159:1: (lv_when_18_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3159:1: (lv_when_18_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3160:3: lv_when_18_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getWhenExpressionParserRuleCall_10_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression6853);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3176:4: ( (lv_body_19_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3177:1: (lv_body_19_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3177:1: (lv_body_19_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3178:3: lv_body_19_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_10_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6876);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3195:6: ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3195:6: ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3195:7: () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3195:7: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3196:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getUntilAction_11_0(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3201:2: (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3201:3: this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) )
                    {
                    this_UNTIL_21=(Token)match(input,RULE_UNTIL,FOLLOW_RULE_UNTIL_in_rulePrimaryExpression6906); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_UNTIL_21, grammarAccess.getPrimaryExpressionAccess().getUNTILTerminalRuleCall_11_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3205:1: ( (lv_loop_22_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3206:1: (lv_loop_22_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3206:1: (lv_loop_22_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3207:3: lv_loop_22_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLoopExpressionParserRuleCall_11_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression6926);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3223:2: (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_WHEN) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3223:3: this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) )
                            {
                            this_WHEN_23=(Token)match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_rulePrimaryExpression6938); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_WHEN_23, grammarAccess.getPrimaryExpressionAccess().getWHENTerminalRuleCall_11_1_2_0()); 
                                  
                            }
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3227:1: ( (lv_when_24_0= ruleExpression ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3228:1: (lv_when_24_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3228:1: (lv_when_24_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3229:3: lv_when_24_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getWhenExpressionParserRuleCall_11_1_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression6958);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3245:4: ( (lv_body_25_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3246:1: (lv_body_25_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3246:1: (lv_body_25_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3247:3: lv_body_25_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_11_1_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression6981);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3264:6: ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3264:6: ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3264:7: () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3264:7: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3265:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getLoopAction_12_0(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3270:2: (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3270:3: this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) )
                    {
                    this_LOOP_27=(Token)match(input,RULE_LOOP,FOLLOW_RULE_LOOP_in_rulePrimaryExpression7011); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LOOP_27, grammarAccess.getPrimaryExpressionAccess().getLOOPTerminalRuleCall_12_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3274:1: ( (lv_body_28_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3275:1: (lv_body_28_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3275:1: (lv_body_28_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3276:3: lv_body_28_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_12_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression7031);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3293:6: ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3293:6: ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3293:7: () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3293:7: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3294:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getTryCatchAction_13_0(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3299:2: (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3299:3: this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )?
                    {
                    this_TRY_30=(Token)match(input,RULE_TRY,FOLLOW_RULE_TRY_in_rulePrimaryExpression7061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_TRY_30, grammarAccess.getPrimaryExpressionAccess().getTRYTerminalRuleCall_13_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3303:1: ( (lv_body_31_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3304:1: (lv_body_31_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3304:1: (lv_body_31_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3305:3: lv_body_31_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getBodyBlockParserRuleCall_13_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression7081);
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3321:2: ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )?
                    int alt58=3;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==RULE_CATCH) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==RULE_FINALLY) ) {
                        alt58=2;
                    }
                    switch (alt58) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3321:3: (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3321:3: (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3321:4: this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )?
                            {
                            this_CATCH_32=(Token)match(input,RULE_CATCH,FOLLOW_RULE_CATCH_in_rulePrimaryExpression7094); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_CATCH_32, grammarAccess.getPrimaryExpressionAccess().getCATCHTerminalRuleCall_13_1_2_0_0()); 
                                  
                            }
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3325:1: ( (lv_exception_33_0= ruleId ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3326:1: (lv_exception_33_0= ruleId )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3326:1: (lv_exception_33_0= ruleId )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3327:3: lv_exception_33_0= ruleId
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExceptionIdParserRuleCall_13_1_2_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleId_in_rulePrimaryExpression7114);
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

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3343:2: ( (lv_catchBlock_34_0= ruleBlock ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3344:1: (lv_catchBlock_34_0= ruleBlock )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3344:1: (lv_catchBlock_34_0= ruleBlock )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3345:3: lv_catchBlock_34_0= ruleBlock
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCatchBlockBlockParserRuleCall_13_1_2_0_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression7135);
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

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3361:2: (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )?
                            int alt57=2;
                            int LA57_0 = input.LA(1);

                            if ( (LA57_0==RULE_FINALLY) ) {
                                alt57=1;
                            }
                            switch (alt57) {
                                case 1 :
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3361:3: this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) )
                                    {
                                    this_FINALLY_35=(Token)match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_rulePrimaryExpression7147); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {
                                       
                                          newLeafNode(this_FINALLY_35, grammarAccess.getPrimaryExpressionAccess().getFINALLYTerminalRuleCall_13_1_2_0_3_0()); 
                                          
                                    }
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3365:1: ( (lv_finallyBlock_36_0= ruleBlock ) )
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3366:1: (lv_finallyBlock_36_0= ruleBlock )
                                    {
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3366:1: (lv_finallyBlock_36_0= ruleBlock )
                                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3367:3: lv_finallyBlock_36_0= ruleBlock
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFinallyBlockBlockParserRuleCall_13_1_2_0_3_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression7167);
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3384:6: (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3384:6: (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3384:7: this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) )
                            {
                            this_FINALLY_37=(Token)match(input,RULE_FINALLY,FOLLOW_RULE_FINALLY_in_rulePrimaryExpression7188); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_FINALLY_37, grammarAccess.getPrimaryExpressionAccess().getFINALLYTerminalRuleCall_13_1_2_1_0()); 
                                  
                            }
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3388:1: ( (lv_finallyBlock_38_0= ruleBlock ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3389:1: (lv_finallyBlock_38_0= ruleBlock )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3389:1: (lv_finallyBlock_38_0= ruleBlock )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3390:3: lv_finallyBlock_38_0= ruleBlock
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFinallyBlockBlockParserRuleCall_13_1_2_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression7208);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3407:6: ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3407:6: ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3407:7: () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3407:7: ()
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3408:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getSwitchAction_14_0(),
                                  current);
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3413:2: (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3413:3: this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT
                    {
                    this_SWITCH_40=(Token)match(input,RULE_SWITCH,FOLLOW_RULE_SWITCH_in_rulePrimaryExpression7241); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SWITCH_40, grammarAccess.getPrimaryExpressionAccess().getSWITCHTerminalRuleCall_14_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3417:1: ( (lv_exp_41_0= ruleExpression ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==RULE_PARAM_START||LA59_0==RULE_FUNC_ARROW||LA59_0==RULE_STRING||(LA59_0>=RULE_FOR && LA59_0<=RULE_WHILE)||LA59_0==RULE_UNTIL||LA59_0==RULE_LBRACKET||(LA59_0>=RULE_PLUS && LA59_0<=RULE_MINUS)||(LA59_0>=RULE_UNARY && LA59_0<=RULE_MINUS_MINUS)||LA59_0==RULE_SUPER||LA59_0==RULE_AT_SIGIL||(LA59_0>=RULE_THIS && LA59_0<=RULE_TRY)||LA59_0==RULE_SWITCH||(LA59_0>=RULE_IF && LA59_0<=RULE_LCURLY)||(LA59_0>=RULE_BOUND_FUNC_ARROW && LA59_0<=RULE_LPAREN)) ) {
                        alt59=1;
                    }
                    switch (alt59) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3418:1: (lv_exp_41_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3418:1: (lv_exp_41_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3419:3: lv_exp_41_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpExpressionParserRuleCall_14_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression7261);
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

                    this_INDENT_42=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_rulePrimaryExpression7273); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_42, grammarAccess.getPrimaryExpressionAccess().getINDENTTerminalRuleCall_14_1_2()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3439:1: ( (lv_cases_43_0= ruleCase ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==RULE_LEADING_WHEN) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3440:1: (lv_cases_43_0= ruleCase )
                    	    {
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3440:1: (lv_cases_43_0= ruleCase )
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3441:3: lv_cases_43_0= ruleCase
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCasesCaseParserRuleCall_14_1_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCase_in_rulePrimaryExpression7293);
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
                    	    break loop60;
                        }
                    } while (true);

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3457:3: (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_ELSE) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3457:4: this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) )
                            {
                            this_ELSE_44=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_rulePrimaryExpression7306); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_ELSE_44, grammarAccess.getPrimaryExpressionAccess().getELSETerminalRuleCall_14_1_4_0()); 
                                  
                            }
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3461:1: ( (lv_elseBlock_45_0= ruleBlock ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3462:1: (lv_elseBlock_45_0= ruleBlock )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3462:1: (lv_elseBlock_45_0= ruleBlock )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3463:3: lv_elseBlock_45_0= ruleBlock
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getElseBlockBlockParserRuleCall_14_1_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBlock_in_rulePrimaryExpression7326);
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

                    this_OUTDENT_46=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_rulePrimaryExpression7339); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OUTDENT_46, grammarAccess.getPrimaryExpressionAccess().getOUTDENTTerminalRuleCall_14_1_5()); 
                          
                    }

                    }


                    }


                    }
                    break;
                case 16 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3485:5: this_IdRef_47= ruleIdRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIdRefParserRuleCall_15()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdRef_in_rulePrimaryExpression7368);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3501:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3502:2: (iv_ruleBlock= ruleBlock EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3503:2: iv_ruleBlock= ruleBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock7403);
            iv_ruleBlock=ruleBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock7413); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3510:1: ruleBlock returns [EObject current=null] : ( () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_1=null;
        Token this_OUTDENT_3=null;
        EObject this_Body_2 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3513:28: ( ( () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3514:1: ( () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3514:1: ( () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3514:2: () this_INDENT_1= RULE_INDENT (this_Body_2= ruleBody )? this_OUTDENT_3= RULE_OUTDENT
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3514:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3515:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBlockAccess().getBlockAction_0(),
                          current);
                  
            }

            }

            this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleBlock7458); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INDENT_1, grammarAccess.getBlockAccess().getINDENTTerminalRuleCall_1()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3524:1: (this_Body_2= ruleBody )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_PARAM_START||LA63_0==RULE_FUNC_ARROW||(LA63_0>=RULE_STATEMENT && LA63_0<=RULE_HERECOMMENT)||(LA63_0>=RULE_STRING && LA63_0<=RULE_RETURN)||(LA63_0>=RULE_THROW && LA63_0<=RULE_CLASS)||(LA63_0>=RULE_FOR && LA63_0<=RULE_WHILE)||LA63_0==RULE_UNTIL||LA63_0==RULE_LBRACKET||(LA63_0>=RULE_PLUS && LA63_0<=RULE_MINUS)||(LA63_0>=RULE_UNARY && LA63_0<=RULE_MINUS_MINUS)||LA63_0==RULE_SUPER||LA63_0==RULE_AT_SIGIL||(LA63_0>=RULE_THIS && LA63_0<=RULE_TRY)||LA63_0==RULE_SWITCH||(LA63_0>=RULE_IF && LA63_0<=RULE_LCURLY)||(LA63_0>=RULE_BOUND_FUNC_ARROW && LA63_0<=RULE_LPAREN)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3525:5: this_Body_2= ruleBody
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBlockAccess().getBodyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBody_in_ruleBlock7480);
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

            this_OUTDENT_3=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleBlock7492); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3545:1: entryRuleCase returns [EObject current=null] : iv_ruleCase= ruleCase EOF ;
    public final EObject entryRuleCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCase = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3546:2: (iv_ruleCase= ruleCase EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3547:2: iv_ruleCase= ruleCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseRule()); 
            }
            pushFollow(FOLLOW_ruleCase_in_entryRuleCase7527);
            iv_ruleCase=ruleCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCase7537); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3554:1: ruleCase returns [EObject current=null] : (this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )? ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3557:28: ( (this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3558:1: (this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3558:1: (this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3558:2: this_LEADING_WHEN_0= RULE_LEADING_WHEN ( (lv_whens_1_0= ruleExpression ) ) (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )* ( (lv_then_4_0= ruleBlock ) ) (this_TERMINATOR_5= RULE_TERMINATOR )?
            {
            this_LEADING_WHEN_0=(Token)match(input,RULE_LEADING_WHEN,FOLLOW_RULE_LEADING_WHEN_in_ruleCase7573); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LEADING_WHEN_0, grammarAccess.getCaseAccess().getLEADING_WHENTerminalRuleCall_0()); 
                  
            }
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3562:1: ( (lv_whens_1_0= ruleExpression ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3563:1: (lv_whens_1_0= ruleExpression )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3563:1: (lv_whens_1_0= ruleExpression )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3564:3: lv_whens_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getWhensExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCase7593);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3580:2: (this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_COMMA) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3580:3: this_COMMA_2= RULE_COMMA ( (lv_whens_3_0= ruleExpression ) )
            	    {
            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleCase7605); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_2, grammarAccess.getCaseAccess().getCOMMATerminalRuleCall_2_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3584:1: ( (lv_whens_3_0= ruleExpression ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3585:1: (lv_whens_3_0= ruleExpression )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3585:1: (lv_whens_3_0= ruleExpression )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3586:3: lv_whens_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCaseAccess().getWhensExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleCase7625);
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
            	    break loop64;
                }
            } while (true);

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3602:4: ( (lv_then_4_0= ruleBlock ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3603:1: (lv_then_4_0= ruleBlock )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3603:1: (lv_then_4_0= ruleBlock )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3604:3: lv_then_4_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCaseAccess().getThenBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleCase7648);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3620:2: (this_TERMINATOR_5= RULE_TERMINATOR )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_TERMINATOR) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3620:3: this_TERMINATOR_5= RULE_TERMINATOR
                    {
                    this_TERMINATOR_5=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleCase7660); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3632:1: entryRuleIfExp returns [EObject current=null] : iv_ruleIfExp= ruleIfExp EOF ;
    public final EObject entryRuleIfExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfExp = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3633:2: (iv_ruleIfExp= ruleIfExp EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3634:2: iv_ruleIfExp= ruleIfExp EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfExpRule()); 
            }
            pushFollow(FOLLOW_ruleIfExp_in_entryRuleIfExp7697);
            iv_ruleIfExp=ruleIfExp();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfExp; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfExp7707); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3641:1: ruleIfExp returns [EObject current=null] : ( ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) ;
    public final EObject ruleIfExp() throws RecognitionException {
        EObject current = null;

        Token this_ELSE_1=null;
        Token this_ELSE_3=null;
        EObject lv_blocks_0_0 = null;

        EObject lv_blocks_2_0 = null;

        EObject lv_defaultBlock_4_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3644:28: ( ( ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3645:1: ( ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3645:1: ( ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3645:2: ( (lv_blocks_0_0= ruleCondBlock ) ) (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )* (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3645:2: ( (lv_blocks_0_0= ruleCondBlock ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3646:1: (lv_blocks_0_0= ruleCondBlock )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3646:1: (lv_blocks_0_0= ruleCondBlock )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3647:3: lv_blocks_0_0= ruleCondBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp7753);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3663:2: (this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ELSE) ) {
                    int LA66_1 = input.LA(2);

                    if ( (LA66_1==RULE_IF) ) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3663:3: this_ELSE_1= RULE_ELSE ( (lv_blocks_2_0= ruleCondBlock ) )
            	    {
            	    this_ELSE_1=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_ruleIfExp7765); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ELSE_1, grammarAccess.getIfExpAccess().getELSETerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3667:1: ( (lv_blocks_2_0= ruleCondBlock ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3668:1: (lv_blocks_2_0= ruleCondBlock )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3668:1: (lv_blocks_2_0= ruleCondBlock )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3669:3: lv_blocks_2_0= ruleCondBlock
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIfExpAccess().getBlocksCondBlockParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCondBlock_in_ruleIfExp7785);
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
            	    break loop66;
                }
            } while (true);

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3685:4: (this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ELSE) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3685:5: this_ELSE_3= RULE_ELSE ( (lv_defaultBlock_4_0= ruleBlock ) )
                    {
                    this_ELSE_3=(Token)match(input,RULE_ELSE,FOLLOW_RULE_ELSE_in_ruleIfExp7799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ELSE_3, grammarAccess.getIfExpAccess().getELSETerminalRuleCall_2_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3689:1: ( (lv_defaultBlock_4_0= ruleBlock ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3690:1: (lv_defaultBlock_4_0= ruleBlock )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3690:1: (lv_defaultBlock_4_0= ruleBlock )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3691:3: lv_defaultBlock_4_0= ruleBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfExpAccess().getDefaultBlockBlockParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBlock_in_ruleIfExp7819);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3715:1: entryRuleCondBlock returns [EObject current=null] : iv_ruleCondBlock= ruleCondBlock EOF ;
    public final EObject entryRuleCondBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondBlock = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3716:2: (iv_ruleCondBlock= ruleCondBlock EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3717:2: iv_ruleCondBlock= ruleCondBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCondBlockRule()); 
            }
            pushFollow(FOLLOW_ruleCondBlock_in_entryRuleCondBlock7857);
            iv_ruleCondBlock=ruleCondBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondBlock7867); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3724:1: ruleCondBlock returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) ;
    public final EObject ruleCondBlock() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        EObject lv_condition_1_0 = null;

        EObject lv_action_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3727:28: ( ( ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3728:1: ( ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3728:1: ( ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3728:2: ( (lv_operator_0_0= RULE_IF ) ) ( (lv_condition_1_0= ruleExpression ) ) ( (lv_action_2_0= ruleBlock ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3728:2: ( (lv_operator_0_0= RULE_IF ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3729:1: (lv_operator_0_0= RULE_IF )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3729:1: (lv_operator_0_0= RULE_IF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3730:3: lv_operator_0_0= RULE_IF
            {
            lv_operator_0_0=(Token)match(input,RULE_IF,FOLLOW_RULE_IF_in_ruleCondBlock7909); if (state.failed) return current;
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3746:2: ( (lv_condition_1_0= ruleExpression ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3747:1: (lv_condition_1_0= ruleExpression )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3747:1: (lv_condition_1_0= ruleExpression )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3748:3: lv_condition_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCondBlockAccess().getConditionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleCondBlock7935);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3764:2: ( (lv_action_2_0= ruleBlock ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3765:1: (lv_action_2_0= ruleBlock )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3765:1: (lv_action_2_0= ruleBlock )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3766:3: lv_action_2_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCondBlockAccess().getActionBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleCondBlock7956);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3790:1: entryRuleIdRef returns [EObject current=null] : iv_ruleIdRef= ruleIdRef EOF ;
    public final EObject entryRuleIdRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdRef = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3791:2: (iv_ruleIdRef= ruleIdRef EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3792:2: iv_ruleIdRef= ruleIdRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdRefRule()); 
            }
            pushFollow(FOLLOW_ruleIdRef_in_entryRuleIdRef7992);
            iv_ruleIdRef=ruleIdRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdRef8002); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3799:1: ruleIdRef returns [EObject current=null] : ( (otherlv_0= RULE_IDENTIFIER ) ) ;
    public final EObject ruleIdRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3802:28: ( ( (otherlv_0= RULE_IDENTIFIER ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3803:1: ( (otherlv_0= RULE_IDENTIFIER ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3803:1: ( (otherlv_0= RULE_IDENTIFIER ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3804:1: (otherlv_0= RULE_IDENTIFIER )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3804:1: (otherlv_0= RULE_IDENTIFIER )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3805:3: otherlv_0= RULE_IDENTIFIER
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getIdRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleIdRef8046); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3824:1: entryRuleId returns [EObject current=null] : iv_ruleId= ruleId EOF ;
    public final EObject entryRuleId() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleId = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3825:2: (iv_ruleId= ruleId EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3826:2: iv_ruleId= ruleId EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdRule()); 
            }
            pushFollow(FOLLOW_ruleId_in_entryRuleId8081);
            iv_ruleId=ruleId();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleId; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleId8091); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3833:1: ruleId returns [EObject current=null] : ( (lv_name_0_0= RULE_IDENTIFIER ) ) ;
    public final EObject ruleId() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3836:28: ( ( (lv_name_0_0= RULE_IDENTIFIER ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3837:1: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3837:1: ( (lv_name_0_0= RULE_IDENTIFIER ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3838:1: (lv_name_0_0= RULE_IDENTIFIER )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3838:1: (lv_name_0_0= RULE_IDENTIFIER )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3839:3: lv_name_0_0= RULE_IDENTIFIER
            {
            lv_name_0_0=(Token)match(input,RULE_IDENTIFIER,FOLLOW_RULE_IDENTIFIER_in_ruleId8132); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3863:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3864:2: (iv_ruleProperty= ruleProperty EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3865:2: iv_ruleProperty= ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleProperty_in_entryRuleProperty8172);
            iv_ruleProperty=ruleProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProperty8182); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3872:1: ruleProperty returns [EObject current=null] : ( ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) ) | ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END ) ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3875:28: ( ( ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) ) | ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:1: ( ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) ) | ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:1: ( ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) ) | ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_IDENTIFIER) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==RULE_INDEX_START) && (synpred30_InternalCakefile())) {
                    alt69=2;
                }
                else if ( (LA69_1==RULE_DOT) && (synpred29_InternalCakefile())) {
                    alt69=1;
                }
                else if ( (LA69_1==RULE_DOUBLE_COLON) && (synpred29_InternalCakefile())) {
                    alt69=1;
                }
                else if ( (LA69_1==RULE_QUESTION_DOT) && (synpred29_InternalCakefile())) {
                    alt69=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:2: ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:2: ( ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:3: ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) ) ( (lv_prop_2_0= ruleId ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:3: ( ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:4: ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )=> (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3888:6: (this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3889:5: this_IdRef_0= ruleIdRef ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) )
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getIdRefParserRuleCall_0_0_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdRef_in_ruleProperty8274);
                    this_IdRef_0=ruleIdRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdRef_0; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3897:1: ( ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3898:1: ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3898:1: ( (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3899:1: (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3899:1: (lv_accessor_1_1= RULE_DOT | lv_accessor_1_2= RULE_DOUBLE_COLON | lv_accessor_1_3= RULE_QUESTION_DOT )
                    int alt68=3;
                    switch ( input.LA(1) ) {
                    case RULE_DOT:
                        {
                        alt68=1;
                        }
                        break;
                    case RULE_DOUBLE_COLON:
                        {
                        alt68=2;
                        }
                        break;
                    case RULE_QUESTION_DOT:
                        {
                        alt68=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3900:3: lv_accessor_1_1= RULE_DOT
                            {
                            lv_accessor_1_1=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleProperty8292); if (state.failed) return current;
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3915:8: lv_accessor_1_2= RULE_DOUBLE_COLON
                            {
                            lv_accessor_1_2=(Token)match(input,RULE_DOUBLE_COLON,FOLLOW_RULE_DOUBLE_COLON_in_ruleProperty8312); if (state.failed) return current;
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3930:8: lv_accessor_1_3= RULE_QUESTION_DOT
                            {
                            lv_accessor_1_3=(Token)match(input,RULE_QUESTION_DOT,FOLLOW_RULE_QUESTION_DOT_in_ruleProperty8332); if (state.failed) return current;
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

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3948:4: ( (lv_prop_2_0= ruleId ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3949:1: (lv_prop_2_0= ruleId )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3949:1: (lv_prop_2_0= ruleId )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3950:3: lv_prop_2_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getPropIdParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleProperty8363);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:6: ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:6: ( ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:7: ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) ) ( (lv_index_5_0= ruleIndex ) ) this_INDEX_END_6= RULE_INDEX_END
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:7: ( ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:8: ( ( ruleIdRef RULE_INDEX_START ) )=> (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:41: (this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3968:5: this_IdRef_3= ruleIdRef this_INDEX_START_4= RULE_INDEX_START
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPropertyAccess().getIdRefParserRuleCall_1_0_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIdRef_in_ruleProperty8404);
                    this_IdRef_3=ruleIdRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IdRef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_INDEX_START_4=(Token)match(input,RULE_INDEX_START,FOLLOW_RULE_INDEX_START_in_ruleProperty8414); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDEX_START_4, grammarAccess.getPropertyAccess().getINDEX_STARTTerminalRuleCall_1_0_0_1()); 
                          
                    }

                    }


                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3980:3: ( (lv_index_5_0= ruleIndex ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3981:1: (lv_index_5_0= ruleIndex )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3981:1: (lv_index_5_0= ruleIndex )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3982:3: lv_index_5_0= ruleIndex
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPropertyAccess().getIndexIndexParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIndex_in_ruleProperty8436);
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

                    this_INDEX_END_6=(Token)match(input,RULE_INDEX_END,FOLLOW_RULE_INDEX_END_in_ruleProperty8447); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4010:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4011:2: (iv_ruleVariable= ruleVariable EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4012:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable8483);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable8493); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4019:1: ruleVariable returns [EObject current=null] : (this_Id_0= ruleId | ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* ) | this_Property_7= ruleProperty ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4022:28: ( (this_Id_0= ruleId | ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* ) | this_Property_7= ruleProperty ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4023:1: (this_Id_0= ruleId | ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* ) | this_Property_7= ruleProperty )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4023:1: (this_Id_0= ruleId | ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* ) | this_Property_7= ruleProperty )
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_IDENTIFIER) ) {
                int LA72_1 = input.LA(2);

                if ( (LA72_1==EOF||LA72_1==RULE_COMMA||LA72_1==RULE_PARAM_END||(LA72_1>=RULE_CALL_END && LA72_1<=RULE_TERMINATOR)||LA72_1==RULE_EQUAL||LA72_1==RULE_POST_IF||(LA72_1>=RULE_FOR && LA72_1<=RULE_UNTIL)||LA72_1==RULE_BY||(LA72_1>=RULE_DOT_DOT && LA72_1<=RULE_MATH)||LA72_1==RULE_INDEX_END||LA72_1==RULE_RCURLY||LA72_1==RULE_RPAREN) ) {
                    alt72=1;
                }
                else if ( ((LA72_1>=RULE_DOT && LA72_1<=RULE_INDEX_START)) ) {
                    alt72=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 72, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA72_0==RULE_AT_SIGIL||LA72_0==RULE_THIS) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4024:5: this_Id_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getIdParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleVariable8540);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4033:6: ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4033:6: ( (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )* )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4033:7: (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) ) this_Id_4= ruleId (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )*
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4033:7: (this_AT_SIGIL_1= RULE_AT_SIGIL | (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT ) )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==RULE_AT_SIGIL) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==RULE_THIS) ) {
                        alt70=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4033:8: this_AT_SIGIL_1= RULE_AT_SIGIL
                            {
                            this_AT_SIGIL_1=(Token)match(input,RULE_AT_SIGIL,FOLLOW_RULE_AT_SIGIL_in_ruleVariable8558); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_AT_SIGIL_1, grammarAccess.getVariableAccess().getAT_SIGILTerminalRuleCall_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4038:6: (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4038:6: (this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4038:7: this_THIS_2= RULE_THIS this_DOT_3= RULE_DOT
                            {
                            this_THIS_2=(Token)match(input,RULE_THIS,FOLLOW_RULE_THIS_in_ruleVariable8575); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_THIS_2, grammarAccess.getVariableAccess().getTHISTerminalRuleCall_1_0_1_0()); 
                                  
                            }
                            this_DOT_3=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariable8585); if (state.failed) return current;
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
                    pushFollow(FOLLOW_ruleId_in_ruleVariable8608);
                    this_Id_4=ruleId();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Id_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4055:1: (this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==RULE_DOT) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4055:2: this_DOT_5= RULE_DOT ( (lv_props_6_0= ruleId ) )
                    	    {
                    	    this_DOT_5=(Token)match(input,RULE_DOT,FOLLOW_RULE_DOT_in_ruleVariable8619); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_DOT_5, grammarAccess.getVariableAccess().getDOTTerminalRuleCall_1_2_0()); 
                    	          
                    	    }
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4059:1: ( (lv_props_6_0= ruleId ) )
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4060:1: (lv_props_6_0= ruleId )
                    	    {
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4060:1: (lv_props_6_0= ruleId )
                    	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4061:3: lv_props_6_0= ruleId
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getVariableAccess().getPropsIdParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleId_in_ruleVariable8639);
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
                    	    break loop71;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4079:5: this_Property_7= ruleProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableAccess().getPropertyParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleProperty_in_ruleVariable8670);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4095:1: entryRuleAssignableArray returns [EObject current=null] : iv_ruleAssignableArray= ruleAssignableArray EOF ;
    public final EObject entryRuleAssignableArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableArray = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4096:2: (iv_ruleAssignableArray= ruleAssignableArray EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4097:2: iv_ruleAssignableArray= ruleAssignableArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignableArrayRule()); 
            }
            pushFollow(FOLLOW_ruleAssignableArray_in_entryRuleAssignableArray8705);
            iv_ruleAssignableArray=ruleAssignableArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignableArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignableArray8715); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4104:1: ruleAssignableArray returns [EObject current=null] : ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET ) ;
    public final EObject ruleAssignableArray() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_0=null;
        Token this_RBRACKET_2=null;
        EObject this_AssignableArgList_1 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4107:28: ( ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4108:1: ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4108:1: ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4108:2: ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_AssignableArgList_1= ruleAssignableArgList this_RBRACKET_2= RULE_RBRACKET
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4108:2: ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4108:3: ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET
            {
            this_LBRACKET_0=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleAssignableArray8757); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LBRACKET_0, grammarAccess.getAssignableArrayAccess().getLBRACKETTerminalRuleCall_0()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAssignableArrayAccess().getAssignableArgListParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleAssignableArgList_in_ruleAssignableArray8779);
            this_AssignableArgList_1=ruleAssignableArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AssignableArgList_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_RBRACKET_2=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleAssignableArray8789); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4133:1: entryRuleAssignableArgList returns [EObject current=null] : iv_ruleAssignableArgList= ruleAssignableArgList EOF ;
    public final EObject entryRuleAssignableArgList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableArgList = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4134:2: (iv_ruleAssignableArgList= ruleAssignableArgList EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4135:2: iv_ruleAssignableArgList= ruleAssignableArgList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignableArgListRule()); 
            }
            pushFollow(FOLLOW_ruleAssignableArgList_in_entryRuleAssignableArgList8824);
            iv_ruleAssignableArgList=ruleAssignableArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignableArgList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignableArgList8834); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4142:1: ruleAssignableArgList returns [EObject current=null] : ( ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )* ) ;
    public final EObject ruleAssignableArgList() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4145:28: ( ( ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4146:1: ( ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4146:1: ( ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4146:2: ( (lv_args_0_0= ruleAssignableArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )*
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4146:2: ( (lv_args_0_0= ruleAssignableArg ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4147:1: (lv_args_0_0= ruleAssignableArg )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4147:1: (lv_args_0_0= ruleAssignableArg )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4148:3: lv_args_0_0= ruleAssignableArg
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignableArgListAccess().getArgsAssignableArgParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignableArg_in_ruleAssignableArgList8880);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4164:2: (this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_COMMA) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4164:3: this_COMMA_1= RULE_COMMA ( (lv_args_2_0= ruleAssignableArg ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleAssignableArgList8892); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getAssignableArgListAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4168:1: ( (lv_args_2_0= ruleAssignableArg ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4169:1: (lv_args_2_0= ruleAssignableArg )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4169:1: (lv_args_2_0= ruleAssignableArg )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4170:3: lv_args_2_0= ruleAssignableArg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssignableArgListAccess().getArgsAssignableArgParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssignableArg_in_ruleAssignableArgList8912);
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
            	    break loop73;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4194:1: entryRuleAssignableArg returns [EObject current=null] : iv_ruleAssignableArg= ruleAssignableArg EOF ;
    public final EObject entryRuleAssignableArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignableArg = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4195:2: (iv_ruleAssignableArg= ruleAssignableArg EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4196:2: iv_ruleAssignableArg= ruleAssignableArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignableArgRule()); 
            }
            pushFollow(FOLLOW_ruleAssignableArg_in_entryRuleAssignableArg8950);
            iv_ruleAssignableArg=ruleAssignableArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignableArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignableArg8960); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4203:1: ruleAssignableArg returns [EObject current=null] : ( ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? ) ;
    public final EObject ruleAssignableArg() throws RecognitionException {
        EObject current = null;

        Token lv_splat_1_0=null;
        EObject lv_arg_0_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4206:28: ( ( ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4207:1: ( ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4207:1: ( ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4207:2: ( (lv_arg_0_0= ruleAssignable ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4207:2: ( (lv_arg_0_0= ruleAssignable ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4208:1: (lv_arg_0_0= ruleAssignable )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4208:1: (lv_arg_0_0= ruleAssignable )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4209:3: lv_arg_0_0= ruleAssignable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignableArgAccess().getArgAssignableParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAssignable_in_ruleAssignableArg9006);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4225:2: ( (lv_splat_1_0= RULE_ELLIPSIS ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_ELLIPSIS) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4226:1: (lv_splat_1_0= RULE_ELLIPSIS )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4226:1: (lv_splat_1_0= RULE_ELLIPSIS )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4227:3: lv_splat_1_0= RULE_ELLIPSIS
                    {
                    lv_splat_1_0=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleAssignableArg9023); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4251:1: entryRuleAssignable returns [EObject current=null] : iv_ruleAssignable= ruleAssignable EOF ;
    public final EObject entryRuleAssignable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignable = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4252:2: (iv_ruleAssignable= ruleAssignable EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4253:2: iv_ruleAssignable= ruleAssignable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignableRule()); 
            }
            pushFollow(FOLLOW_ruleAssignable_in_entryRuleAssignable9065);
            iv_ruleAssignable=ruleAssignable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignable9075); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4260:1: ruleAssignable returns [EObject current=null] : (this_Variable_0= ruleVariable | ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary ) | ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray ) ) ;
    public final EObject ruleAssignable() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Dictionary_1 = null;

        EObject this_AssignableArray_2 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4263:28: ( (this_Variable_0= ruleVariable | ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary ) | ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4264:1: (this_Variable_0= ruleVariable | ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary ) | ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4264:1: (this_Variable_0= ruleVariable | ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary ) | ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray ) )
            int alt75=3;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_AT_SIGIL||LA75_0==RULE_THIS||LA75_0==RULE_IDENTIFIER) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_LCURLY) && (synpred32_InternalCakefile())) {
                alt75=2;
            }
            else if ( (LA75_0==RULE_LBRACKET) && (synpred33_InternalCakefile())) {
                alt75=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4265:5: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignableAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleAssignable9122);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4274:6: ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4274:6: ( ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4274:7: ( RULE_LCURLY )=>this_Dictionary_1= ruleDictionary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignableAccess().getDictionaryParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionary_in_ruleAssignable9155);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4284:6: ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4284:6: ( ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4284:7: ( RULE_LBRACKET )=>this_AssignableArray_2= ruleAssignableArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAssignableAccess().getAssignableArrayParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssignableArray_in_ruleAssignable9189);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4301:1: entryRuleArg returns [EObject current=null] : iv_ruleArg= ruleArg EOF ;
    public final EObject entryRuleArg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArg = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4302:2: (iv_ruleArg= ruleArg EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4303:2: iv_ruleArg= ruleArg EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgRule()); 
            }
            pushFollow(FOLLOW_ruleArg_in_entryRuleArg9225);
            iv_ruleArg=ruleArg();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArg; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArg9235); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4310:1: ruleArg returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? ) ;
    public final EObject ruleArg() throws RecognitionException {
        EObject current = null;

        Token lv_splat_1_0=null;
        EObject lv_exp_0_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4313:28: ( ( ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4314:1: ( ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4314:1: ( ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4314:2: ( (lv_exp_0_0= ruleExpression ) ) ( (lv_splat_1_0= RULE_ELLIPSIS ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4314:2: ( (lv_exp_0_0= ruleExpression ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4315:1: (lv_exp_0_0= ruleExpression )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4315:1: (lv_exp_0_0= ruleExpression )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4316:3: lv_exp_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgAccess().getExpExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArg9281);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4332:2: ( (lv_splat_1_0= RULE_ELLIPSIS ) )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ELLIPSIS) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4333:1: (lv_splat_1_0= RULE_ELLIPSIS )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4333:1: (lv_splat_1_0= RULE_ELLIPSIS )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4334:3: lv_splat_1_0= RULE_ELLIPSIS
                    {
                    lv_splat_1_0=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleArg9298); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4358:1: entryRuleArgLine returns [EObject current=null] : iv_ruleArgLine= ruleArgLine EOF ;
    public final EObject entryRuleArgLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgLine = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4359:2: (iv_ruleArgLine= ruleArgLine EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4360:2: iv_ruleArgLine= ruleArgLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgLineRule()); 
            }
            pushFollow(FOLLOW_ruleArgLine_in_entryRuleArgLine9340);
            iv_ruleArgLine=ruleArgLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgLine9350); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4367:1: ruleArgLine returns [EObject current=null] : ( ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )? ) ;
    public final EObject ruleArgLine() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_COMMA_3=null;
        EObject lv_head_0_0 = null;

        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4370:28: ( ( ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4371:1: ( ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4371:1: ( ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4371:2: ( (lv_head_0_0= ruleArg ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )* (this_COMMA_3= RULE_COMMA )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4371:2: ( (lv_head_0_0= ruleArg ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4372:1: (lv_head_0_0= ruleArg )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4372:1: (lv_head_0_0= ruleArg )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4373:3: lv_head_0_0= ruleArg
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgLineAccess().getHeadArgParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArg_in_ruleArgLine9396);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4389:2: (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==RULE_COMMA) ) {
                    int LA77_1 = input.LA(2);

                    if ( (LA77_1==RULE_PARAM_START||LA77_1==RULE_FUNC_ARROW||LA77_1==RULE_STRING||(LA77_1>=RULE_FOR && LA77_1<=RULE_WHILE)||LA77_1==RULE_UNTIL||LA77_1==RULE_LBRACKET||(LA77_1>=RULE_PLUS && LA77_1<=RULE_MINUS)||(LA77_1>=RULE_UNARY && LA77_1<=RULE_MINUS_MINUS)||LA77_1==RULE_SUPER||LA77_1==RULE_AT_SIGIL||(LA77_1>=RULE_THIS && LA77_1<=RULE_TRY)||LA77_1==RULE_SWITCH||(LA77_1>=RULE_IF && LA77_1<=RULE_LCURLY)||(LA77_1>=RULE_BOUND_FUNC_ARROW && LA77_1<=RULE_LPAREN)) ) {
                        alt77=1;
                    }


                }


                switch (alt77) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4389:3: this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleArg ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleArgLine9408); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getArgLineAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4393:1: ( (lv_tail_2_0= ruleArg ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4394:1: (lv_tail_2_0= ruleArg )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4394:1: (lv_tail_2_0= ruleArg )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4395:3: lv_tail_2_0= ruleArg
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgLineAccess().getTailArgParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArg_in_ruleArgLine9428);
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
            	    break loop77;
                }
            } while (true);

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4411:4: (this_COMMA_3= RULE_COMMA )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_COMMA) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4411:5: this_COMMA_3= RULE_COMMA
                    {
                    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleArgLine9442); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4423:1: entryRuleExplicitArgList returns [EObject current=null] : iv_ruleExplicitArgList= ruleExplicitArgList EOF ;
    public final EObject entryRuleExplicitArgList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitArgList = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4424:2: (iv_ruleExplicitArgList= ruleExplicitArgList EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4425:2: iv_ruleExplicitArgList= ruleExplicitArgList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExplicitArgListRule()); 
            }
            pushFollow(FOLLOW_ruleExplicitArgList_in_entryRuleExplicitArgList9479);
            iv_ruleExplicitArgList=ruleExplicitArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExplicitArgList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitArgList9489); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4432:1: ruleExplicitArgList returns [EObject current=null] : ( ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4435:28: ( ( ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4436:1: ( ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4436:1: ( ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4436:2: ( (lv_lines_0_0= ruleArgLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )*
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4436:2: ( (lv_lines_0_0= ruleArgLine ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4437:1: (lv_lines_0_0= ruleArgLine )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4437:1: (lv_lines_0_0= ruleArgLine )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4438:3: lv_lines_0_0= ruleArgLine
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExplicitArgListAccess().getLinesArgLineParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArgLine_in_ruleExplicitArgList9535);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4454:2: ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )*
            loop79:
            do {
                int alt79=3;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_TERMINATOR) ) {
                    alt79=1;
                }
                else if ( (LA79_0==RULE_INDENT) ) {
                    alt79=2;
                }


                switch (alt79) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4454:3: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4454:3: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4454:4: this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleArgLine ) )
            	    {
            	    this_TERMINATOR_1=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleExplicitArgList9548); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TERMINATOR_1, grammarAccess.getExplicitArgListAccess().getTERMINATORTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4458:1: ( (lv_lines_2_0= ruleArgLine ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4459:1: (lv_lines_2_0= ruleArgLine )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4459:1: (lv_lines_2_0= ruleArgLine )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4460:3: lv_lines_2_0= ruleArgLine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExplicitArgListAccess().getLinesArgLineParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArgLine_in_ruleExplicitArgList9568);
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
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4477:6: (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4477:6: (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4477:7: this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleArgLine ) ) this_OUTDENT_5= RULE_OUTDENT
            	    {
            	    this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleExplicitArgList9587); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INDENT_3, grammarAccess.getExplicitArgListAccess().getINDENTTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4481:1: ( (lv_lines_4_0= ruleArgLine ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4482:1: (lv_lines_4_0= ruleArgLine )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4482:1: (lv_lines_4_0= ruleArgLine )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4483:3: lv_lines_4_0= ruleArgLine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExplicitArgListAccess().getLinesArgLineParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleArgLine_in_ruleExplicitArgList9607);
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

            	    this_OUTDENT_5=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleExplicitArgList9618); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OUTDENT_5, grammarAccess.getExplicitArgListAccess().getOUTDENTTerminalRuleCall_1_1_2()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4511:1: entryRuleArgList returns [EObject current=null] : iv_ruleArgList= ruleArgList EOF ;
    public final EObject entryRuleArgList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgList = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4512:2: (iv_ruleArgList= ruleArgList EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4513:2: iv_ruleArgList= ruleArgList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgListRule()); 
            }
            pushFollow(FOLLOW_ruleArgList_in_entryRuleArgList9656);
            iv_ruleArgList=ruleArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgList; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgList9666); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4520:1: ruleArgList returns [EObject current=null] : ( () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )? ) ;
    public final EObject ruleArgList() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_2=null;
        Token this_OUTDENT_4=null;
        EObject lv_dummy_1_0 = null;

        EObject lv_dummy_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4523:28: ( ( () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4524:1: ( () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4524:1: ( () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4524:2: () ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4524:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4525:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getArgListAccess().getArgListAction_0(),
                          current);
                  
            }

            }

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4530:2: ( ( (lv_dummy_1_0= ruleExplicitArgList ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT ) )?
            int alt80=3;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_PARAM_START||LA80_0==RULE_FUNC_ARROW||LA80_0==RULE_STRING||(LA80_0>=RULE_FOR && LA80_0<=RULE_WHILE)||LA80_0==RULE_UNTIL||LA80_0==RULE_LBRACKET||(LA80_0>=RULE_PLUS && LA80_0<=RULE_MINUS)||(LA80_0>=RULE_UNARY && LA80_0<=RULE_MINUS_MINUS)||LA80_0==RULE_SUPER||LA80_0==RULE_AT_SIGIL||(LA80_0>=RULE_THIS && LA80_0<=RULE_TRY)||LA80_0==RULE_SWITCH||(LA80_0>=RULE_IF && LA80_0<=RULE_LCURLY)||(LA80_0>=RULE_BOUND_FUNC_ARROW && LA80_0<=RULE_LPAREN)) ) {
                alt80=1;
            }
            else if ( (LA80_0==RULE_INDENT) ) {
                alt80=2;
            }
            switch (alt80) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4530:3: ( (lv_dummy_1_0= ruleExplicitArgList ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4530:3: ( (lv_dummy_1_0= ruleExplicitArgList ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4531:1: (lv_dummy_1_0= ruleExplicitArgList )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4531:1: (lv_dummy_1_0= ruleExplicitArgList )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4532:3: lv_dummy_1_0= ruleExplicitArgList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgListAccess().getDummyExplicitArgListParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExplicitArgList_in_ruleArgList9722);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4549:6: (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4549:6: (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4549:7: this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitArgList ) ) this_OUTDENT_4= RULE_OUTDENT
                    {
                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleArgList9740); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_2, grammarAccess.getArgListAccess().getINDENTTerminalRuleCall_1_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4553:1: ( (lv_dummy_3_0= ruleExplicitArgList ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4554:1: (lv_dummy_3_0= ruleExplicitArgList )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4554:1: (lv_dummy_3_0= ruleExplicitArgList )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4555:3: lv_dummy_3_0= ruleExplicitArgList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArgListAccess().getDummyExplicitArgListParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExplicitArgList_in_ruleArgList9760);
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

                    this_OUTDENT_4=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleArgList9771); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4583:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4584:2: (iv_ruleArray= ruleArray EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4585:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray9809);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray9819); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4592:1: ruleArray returns [EObject current=null] : ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token this_LBRACKET_0=null;
        Token this_RBRACKET_2=null;
        EObject this_ArgList_1 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4595:28: ( ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4596:1: ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4596:1: ( ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4596:2: ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET ) this_ArgList_1= ruleArgList this_RBRACKET_2= RULE_RBRACKET
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4596:2: ( ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4596:3: ( RULE_LBRACKET )=>this_LBRACKET_0= RULE_LBRACKET
            {
            this_LBRACKET_0=(Token)match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_ruleArray9861); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LBRACKET_0, grammarAccess.getArrayAccess().getLBRACKETTerminalRuleCall_0()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrayAccess().getArgListParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleArgList_in_ruleArray9883);
            this_ArgList_1=ruleArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ArgList_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_RBRACKET_2=(Token)match(input,RULE_RBRACKET,FOLLOW_RULE_RBRACKET_in_ruleArray9893); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4621:1: entryRuleDictionary returns [EObject current=null] : iv_ruleDictionary= ruleDictionary EOF ;
    public final EObject entryRuleDictionary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictionary = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4622:2: (iv_ruleDictionary= ruleDictionary EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4623:2: iv_ruleDictionary= ruleDictionary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictionaryRule()); 
            }
            pushFollow(FOLLOW_ruleDictionary_in_entryRuleDictionary9928);
            iv_ruleDictionary=ruleDictionary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictionary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictionary9938); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4630:1: ruleDictionary returns [EObject current=null] : ( ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY ) ;
    public final EObject ruleDictionary() throws RecognitionException {
        EObject current = null;

        Token this_LCURLY_0=null;
        Token this_RCURLY_2=null;
        EObject this_DictItems_1 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4633:28: ( ( ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4634:1: ( ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4634:1: ( ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4634:2: ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY ) this_DictItems_1= ruleDictItems this_RCURLY_2= RULE_RCURLY
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4634:2: ( ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4634:3: ( RULE_LCURLY )=>this_LCURLY_0= RULE_LCURLY
            {
            this_LCURLY_0=(Token)match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_ruleDictionary9980); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LCURLY_0, grammarAccess.getDictionaryAccess().getLCURLYTerminalRuleCall_0()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDictionaryAccess().getDictItemsParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleDictItems_in_ruleDictionary10002);
            this_DictItems_1=ruleDictItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_DictItems_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            this_RCURLY_2=(Token)match(input,RULE_RCURLY,FOLLOW_RULE_RCURLY_in_ruleDictionary10012); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4659:1: entryRuleDictItems returns [EObject current=null] : iv_ruleDictItems= ruleDictItems EOF ;
    public final EObject entryRuleDictItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictItems = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4660:2: (iv_ruleDictItems= ruleDictItems EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4661:2: iv_ruleDictItems= ruleDictItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictItemsRule()); 
            }
            pushFollow(FOLLOW_ruleDictItems_in_entryRuleDictItems10047);
            iv_ruleDictItems=ruleDictItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictItems; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictItems10057); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4668:1: ruleDictItems returns [EObject current=null] : ( () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )? ) ;
    public final EObject ruleDictItems() throws RecognitionException {
        EObject current = null;

        Token this_INDENT_2=null;
        Token this_OUTDENT_4=null;
        EObject lv_dummy_1_0 = null;

        EObject lv_dummy_3_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4671:28: ( ( () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4672:1: ( () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4672:1: ( () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4672:2: () ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4672:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4673:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDictItemsAccess().getDictItemsAction_0(),
                          current);
                  
            }

            }

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4678:2: ( ( (lv_dummy_1_0= ruleExplicitDictItems ) ) | (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT ) )?
            int alt81=3;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_STRING||LA81_0==RULE_IDENTIFIER||(LA81_0>=RULE_NUMBER && LA81_0<=RULE_REGEX)) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_INDENT) ) {
                alt81=2;
            }
            switch (alt81) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4678:3: ( (lv_dummy_1_0= ruleExplicitDictItems ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4678:3: ( (lv_dummy_1_0= ruleExplicitDictItems ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4679:1: (lv_dummy_1_0= ruleExplicitDictItems )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4679:1: (lv_dummy_1_0= ruleExplicitDictItems )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4680:3: lv_dummy_1_0= ruleExplicitDictItems
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictItemsAccess().getDummyExplicitDictItemsParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExplicitDictItems_in_ruleDictItems10113);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4697:6: (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4697:6: (this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4697:7: this_INDENT_2= RULE_INDENT ( (lv_dummy_3_0= ruleExplicitDictItems ) ) this_OUTDENT_4= RULE_OUTDENT
                    {
                    this_INDENT_2=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleDictItems10131); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_2, grammarAccess.getDictItemsAccess().getINDENTTerminalRuleCall_1_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4701:1: ( (lv_dummy_3_0= ruleExplicitDictItems ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4702:1: (lv_dummy_3_0= ruleExplicitDictItems )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4702:1: (lv_dummy_3_0= ruleExplicitDictItems )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4703:3: lv_dummy_3_0= ruleExplicitDictItems
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDictItemsAccess().getDummyExplicitDictItemsParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExplicitDictItems_in_ruleDictItems10151);
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

                    this_OUTDENT_4=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleDictItems10162); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4731:1: entryRuleExplicitDictItems returns [EObject current=null] : iv_ruleExplicitDictItems= ruleExplicitDictItems EOF ;
    public final EObject entryRuleExplicitDictItems() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExplicitDictItems = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4732:2: (iv_ruleExplicitDictItems= ruleExplicitDictItems EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4733:2: iv_ruleExplicitDictItems= ruleExplicitDictItems EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExplicitDictItemsRule()); 
            }
            pushFollow(FOLLOW_ruleExplicitDictItems_in_entryRuleExplicitDictItems10200);
            iv_ruleExplicitDictItems=ruleExplicitDictItems();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExplicitDictItems; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExplicitDictItems10210); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4740:1: ruleExplicitDictItems returns [EObject current=null] : ( ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4743:28: ( ( ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4744:1: ( ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4744:1: ( ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )* )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4744:2: ( (lv_lines_0_0= ruleDictLine ) ) ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )*
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4744:2: ( (lv_lines_0_0= ruleDictLine ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4745:1: (lv_lines_0_0= ruleDictLine )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4745:1: (lv_lines_0_0= ruleDictLine )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4746:3: lv_lines_0_0= ruleDictLine
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExplicitDictItemsAccess().getLinesDictLineParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDictLine_in_ruleExplicitDictItems10256);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4762:2: ( (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) ) | (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT ) )*
            loop82:
            do {
                int alt82=3;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_TERMINATOR) ) {
                    alt82=1;
                }
                else if ( (LA82_0==RULE_INDENT) ) {
                    alt82=2;
                }


                switch (alt82) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4762:3: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4762:3: (this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4762:4: this_TERMINATOR_1= RULE_TERMINATOR ( (lv_lines_2_0= ruleDictLine ) )
            	    {
            	    this_TERMINATOR_1=(Token)match(input,RULE_TERMINATOR,FOLLOW_RULE_TERMINATOR_in_ruleExplicitDictItems10269); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_TERMINATOR_1, grammarAccess.getExplicitDictItemsAccess().getTERMINATORTerminalRuleCall_1_0_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4766:1: ( (lv_lines_2_0= ruleDictLine ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4767:1: (lv_lines_2_0= ruleDictLine )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4767:1: (lv_lines_2_0= ruleDictLine )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4768:3: lv_lines_2_0= ruleDictLine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExplicitDictItemsAccess().getLinesDictLineParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDictLine_in_ruleExplicitDictItems10289);
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
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4785:6: (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4785:6: (this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4785:7: this_INDENT_3= RULE_INDENT ( (lv_lines_4_0= ruleDictLine ) ) this_OUTDENT_5= RULE_OUTDENT
            	    {
            	    this_INDENT_3=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleExplicitDictItems10308); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_INDENT_3, grammarAccess.getExplicitDictItemsAccess().getINDENTTerminalRuleCall_1_1_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4789:1: ( (lv_lines_4_0= ruleDictLine ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4790:1: (lv_lines_4_0= ruleDictLine )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4790:1: (lv_lines_4_0= ruleDictLine )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4791:3: lv_lines_4_0= ruleDictLine
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExplicitDictItemsAccess().getLinesDictLineParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDictLine_in_ruleExplicitDictItems10328);
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

            	    this_OUTDENT_5=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleExplicitDictItems10339); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_OUTDENT_5, grammarAccess.getExplicitDictItemsAccess().getOUTDENTTerminalRuleCall_1_1_2()); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4819:1: entryRuleDictLine returns [EObject current=null] : iv_ruleDictLine= ruleDictLine EOF ;
    public final EObject entryRuleDictLine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictLine = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4820:2: (iv_ruleDictLine= ruleDictLine EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4821:2: iv_ruleDictLine= ruleDictLine EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictLineRule()); 
            }
            pushFollow(FOLLOW_ruleDictLine_in_entryRuleDictLine10377);
            iv_ruleDictLine=ruleDictLine();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictLine; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictLine10387); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4828:1: ruleDictLine returns [EObject current=null] : ( ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )? ) ;
    public final EObject ruleDictLine() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_1=null;
        Token this_COMMA_3=null;
        EObject lv_head_0_0 = null;

        EObject lv_tail_2_0 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4831:28: ( ( ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4832:1: ( ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4832:1: ( ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4832:2: ( (lv_head_0_0= ruleDictItem ) ) (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )* (this_COMMA_3= RULE_COMMA )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4832:2: ( (lv_head_0_0= ruleDictItem ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4833:1: (lv_head_0_0= ruleDictItem )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4833:1: (lv_head_0_0= ruleDictItem )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4834:3: lv_head_0_0= ruleDictItem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictLineAccess().getHeadDictItemParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDictItem_in_ruleDictLine10433);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4850:2: (this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==RULE_COMMA) ) {
                    int LA83_1 = input.LA(2);

                    if ( (LA83_1==RULE_STRING||LA83_1==RULE_IDENTIFIER||(LA83_1>=RULE_NUMBER && LA83_1<=RULE_REGEX)) ) {
                        alt83=1;
                    }


                }


                switch (alt83) {
            	case 1 :
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4850:3: this_COMMA_1= RULE_COMMA ( (lv_tail_2_0= ruleDictItem ) )
            	    {
            	    this_COMMA_1=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleDictLine10445); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_1, grammarAccess.getDictLineAccess().getCOMMATerminalRuleCall_1_0()); 
            	          
            	    }
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4854:1: ( (lv_tail_2_0= ruleDictItem ) )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4855:1: (lv_tail_2_0= ruleDictItem )
            	    {
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4855:1: (lv_tail_2_0= ruleDictItem )
            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4856:3: lv_tail_2_0= ruleDictItem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDictLineAccess().getTailDictItemParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDictItem_in_ruleDictLine10465);
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
            	    break loop83;
                }
            } while (true);

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4872:4: (this_COMMA_3= RULE_COMMA )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_COMMA) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4872:5: this_COMMA_3= RULE_COMMA
                    {
                    this_COMMA_3=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleDictLine10479); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4884:1: entryRuleDictItem returns [EObject current=null] : iv_ruleDictItem= ruleDictItem EOF ;
    public final EObject entryRuleDictItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictItem = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4885:2: (iv_ruleDictItem= ruleDictItem EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4886:2: iv_ruleDictItem= ruleDictItem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictItemRule()); 
            }
            pushFollow(FOLLOW_ruleDictItem_in_entryRuleDictItem10516);
            iv_ruleDictItem=ruleDictItem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictItem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictItem10526); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4893:1: ruleDictItem returns [EObject current=null] : ( () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )? ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4896:28: ( ( () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4897:1: ( () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4897:1: ( () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4897:2: () ( (lv_key_1_0= ruleDictKey ) ) (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4897:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4898:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDictItemAccess().getDictItemAction_0(),
                          current);
                  
            }

            }

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4903:2: ( (lv_key_1_0= ruleDictKey ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4904:1: (lv_key_1_0= ruleDictKey )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4904:1: (lv_key_1_0= ruleDictKey )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4905:3: lv_key_1_0= ruleDictKey
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDictItemAccess().getKeyDictKeyParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDictKey_in_ruleDictItem10581);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4921:2: (this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_COLON) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4921:3: this_COLON_2= RULE_COLON ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) )
                    {
                    this_COLON_2=(Token)match(input,RULE_COLON,FOLLOW_RULE_COLON_in_ruleDictItem10593); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_COLON_2, grammarAccess.getDictItemAccess().getCOLONTerminalRuleCall_2_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4925:1: ( ( (lv_value_3_0= ruleExpression ) ) | (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT ) )
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==RULE_PARAM_START||LA85_0==RULE_FUNC_ARROW||LA85_0==RULE_STRING||(LA85_0>=RULE_FOR && LA85_0<=RULE_WHILE)||LA85_0==RULE_UNTIL||LA85_0==RULE_LBRACKET||(LA85_0>=RULE_PLUS && LA85_0<=RULE_MINUS)||(LA85_0>=RULE_UNARY && LA85_0<=RULE_MINUS_MINUS)||LA85_0==RULE_SUPER||LA85_0==RULE_AT_SIGIL||(LA85_0>=RULE_THIS && LA85_0<=RULE_TRY)||LA85_0==RULE_SWITCH||(LA85_0>=RULE_IF && LA85_0<=RULE_LCURLY)||(LA85_0>=RULE_BOUND_FUNC_ARROW && LA85_0<=RULE_LPAREN)) ) {
                        alt85=1;
                    }
                    else if ( (LA85_0==RULE_INDENT) ) {
                        alt85=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 85, 0, input);

                        throw nvae;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4925:2: ( (lv_value_3_0= ruleExpression ) )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4925:2: ( (lv_value_3_0= ruleExpression ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4926:1: (lv_value_3_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4926:1: (lv_value_3_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4927:3: lv_value_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDictItemAccess().getValueExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleDictItem10614);
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
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4944:6: (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4944:6: (this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4944:7: this_INDENT_4= RULE_INDENT ( (lv_value_5_0= ruleExpression ) ) this_OUTDENT_6= RULE_OUTDENT
                            {
                            this_INDENT_4=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleDictItem10632); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_INDENT_4, grammarAccess.getDictItemAccess().getINDENTTerminalRuleCall_2_1_1_0()); 
                                  
                            }
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4948:1: ( (lv_value_5_0= ruleExpression ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4949:1: (lv_value_5_0= ruleExpression )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4949:1: (lv_value_5_0= ruleExpression )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4950:3: lv_value_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getDictItemAccess().getValueExpressionParserRuleCall_2_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleDictItem10652);
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

                            this_OUTDENT_6=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleDictItem10663); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4978:1: entryRuleDictKey returns [EObject current=null] : iv_ruleDictKey= ruleDictKey EOF ;
    public final EObject entryRuleDictKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDictKey = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4979:2: (iv_ruleDictKey= ruleDictKey EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4980:2: iv_ruleDictKey= ruleDictKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDictKeyRule()); 
            }
            pushFollow(FOLLOW_ruleDictKey_in_entryRuleDictKey10702);
            iv_ruleDictKey=ruleDictKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDictKey; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDictKey10712); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4987:1: ruleDictKey returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_Id_1= ruleId ) ;
    public final EObject ruleDictKey() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_Id_1 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4990:28: ( (this_Literal_0= ruleLiteral | this_Id_1= ruleId ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4991:1: (this_Literal_0= ruleLiteral | this_Id_1= ruleId )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4991:1: (this_Literal_0= ruleLiteral | this_Id_1= ruleId )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_STRING||(LA87_0>=RULE_NUMBER && LA87_0<=RULE_REGEX)) ) {
                alt87=1;
            }
            else if ( (LA87_0==RULE_IDENTIFIER) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4992:5: this_Literal_0= ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDictKeyAccess().getLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteral_in_ruleDictKey10759);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5002:5: this_Id_1= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getDictKeyAccess().getIdParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleDictKey10786);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5018:1: entryRuleLambda returns [EObject current=null] : iv_ruleLambda= ruleLambda EOF ;
    public final EObject entryRuleLambda() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLambda = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5019:2: (iv_ruleLambda= ruleLambda EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5020:2: iv_ruleLambda= ruleLambda EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLambdaRule()); 
            }
            pushFollow(FOLLOW_ruleLambda_in_entryRuleLambda10821);
            iv_ruleLambda=ruleLambda();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLambda; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLambda10831); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5027:1: ruleLambda returns [EObject current=null] : ( (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) ) ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5030:28: ( ( (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5031:1: ( (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5031:1: ( (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5031:2: (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )? (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW ) ( (lv_body_7_0= ruleBlock ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5031:2: (this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==RULE_PARAM_START) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5031:3: this_PARAM_START_0= RULE_PARAM_START ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )? this_PARAM_END_4= RULE_PARAM_END
                    {
                    this_PARAM_START_0=(Token)match(input,RULE_PARAM_START,FOLLOW_RULE_PARAM_START_in_ruleLambda10868); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAM_START_0, grammarAccess.getLambdaAccess().getPARAM_STARTTerminalRuleCall_0_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5035:1: ( ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )* )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_LBRACKET||LA89_0==RULE_AT_SIGIL||(LA89_0>=RULE_IDENTIFIER && LA89_0<=RULE_LCURLY)) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5035:2: ( (lv_params_1_0= ruleParam ) ) (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )*
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5035:2: ( (lv_params_1_0= ruleParam ) )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5036:1: (lv_params_1_0= ruleParam )
                            {
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5036:1: (lv_params_1_0= ruleParam )
                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5037:3: lv_params_1_0= ruleParam
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLambdaAccess().getParamsParamParserRuleCall_0_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParam_in_ruleLambda10889);
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

                            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5053:2: (this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) ) )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( (LA88_0==RULE_COMMA) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5053:3: this_COMMA_2= RULE_COMMA ( (lv_params_3_0= ruleParam ) )
                            	    {
                            	    this_COMMA_2=(Token)match(input,RULE_COMMA,FOLLOW_RULE_COMMA_in_ruleLambda10901); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {
                            	       
                            	          newLeafNode(this_COMMA_2, grammarAccess.getLambdaAccess().getCOMMATerminalRuleCall_0_1_1_0()); 
                            	          
                            	    }
                            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5057:1: ( (lv_params_3_0= ruleParam ) )
                            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5058:1: (lv_params_3_0= ruleParam )
                            	    {
                            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5058:1: (lv_params_3_0= ruleParam )
                            	    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5059:3: lv_params_3_0= ruleParam
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getLambdaAccess().getParamsParamParserRuleCall_0_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParam_in_ruleLambda10921);
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
                            	    break loop88;
                                }
                            } while (true);


                            }
                            break;

                    }

                    this_PARAM_END_4=(Token)match(input,RULE_PARAM_END,FOLLOW_RULE_PARAM_END_in_ruleLambda10936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_PARAM_END_4, grammarAccess.getLambdaAccess().getPARAM_ENDTerminalRuleCall_0_2()); 
                          
                    }

                    }
                    break;

            }

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5079:3: (this_FUNC_ARROW_5= RULE_FUNC_ARROW | this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_FUNC_ARROW) ) {
                alt91=1;
            }
            else if ( (LA91_0==RULE_BOUND_FUNC_ARROW) ) {
                alt91=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5079:4: this_FUNC_ARROW_5= RULE_FUNC_ARROW
                    {
                    this_FUNC_ARROW_5=(Token)match(input,RULE_FUNC_ARROW,FOLLOW_RULE_FUNC_ARROW_in_ruleLambda10949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_FUNC_ARROW_5, grammarAccess.getLambdaAccess().getFUNC_ARROWTerminalRuleCall_1_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5084:6: this_BOUND_FUNC_ARROW_6= RULE_BOUND_FUNC_ARROW
                    {
                    this_BOUND_FUNC_ARROW_6=(Token)match(input,RULE_BOUND_FUNC_ARROW,FOLLOW_RULE_BOUND_FUNC_ARROW_in_ruleLambda10965); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_BOUND_FUNC_ARROW_6, grammarAccess.getLambdaAccess().getBOUND_FUNC_ARROWTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5088:2: ( (lv_body_7_0= ruleBlock ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5089:1: (lv_body_7_0= ruleBlock )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5089:1: (lv_body_7_0= ruleBlock )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5090:3: lv_body_7_0= ruleBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLambdaAccess().getBodyBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBlock_in_ruleLambda10986);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5114:1: entryRuleParam returns [EObject current=null] : iv_ruleParam= ruleParam EOF ;
    public final EObject entryRuleParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParam = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5115:2: (iv_ruleParam= ruleParam EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5116:2: iv_ruleParam= ruleParam EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_ruleParam_in_entryRuleParam11022);
            iv_ruleParam=ruleParam();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParam11032); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5123:1: ruleParam returns [EObject current=null] : ( (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )? ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5126:28: ( ( (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )? ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5127:1: ( (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )? )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5127:1: ( (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )? )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5127:2: (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty ) ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )?
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5127:2: (this_Id_0= ruleId | ( ( RULE_LBRACKET )=>this_Array_1= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary ) | this_ThisProperty_3= ruleThisProperty )
            int alt92=4;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_IDENTIFIER) ) {
                alt92=1;
            }
            else if ( (LA92_0==RULE_LBRACKET) && (synpred36_InternalCakefile())) {
                alt92=2;
            }
            else if ( (LA92_0==RULE_LCURLY) && (synpred37_InternalCakefile())) {
                alt92=3;
            }
            else if ( (LA92_0==RULE_AT_SIGIL) ) {
                alt92=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5128:5: this_Id_0= ruleId
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParamAccess().getIdParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleId_in_ruleParam11080);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5137:6: ( ( RULE_LBRACKET )=>this_Array_1= ruleArray )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5137:6: ( ( RULE_LBRACKET )=>this_Array_1= ruleArray )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5137:7: ( RULE_LBRACKET )=>this_Array_1= ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParamAccess().getArrayParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArray_in_ruleParam11113);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5147:6: ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5147:6: ( ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5147:7: ( RULE_LCURLY )=>this_Dictionary_2= ruleDictionary
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParamAccess().getDictionaryParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDictionary_in_ruleParam11147);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5158:5: this_ThisProperty_3= ruleThisProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getParamAccess().getThisPropertyParserRuleCall_0_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleThisProperty_in_ruleParam11175);
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

            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5166:2: ( ( (lv_splat_4_0= RULE_ELLIPSIS ) ) | (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) ) )?
            int alt93=3;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ELLIPSIS) ) {
                alt93=1;
            }
            else if ( (LA93_0==RULE_EQUAL) ) {
                alt93=2;
            }
            switch (alt93) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5166:3: ( (lv_splat_4_0= RULE_ELLIPSIS ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5166:3: ( (lv_splat_4_0= RULE_ELLIPSIS ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5167:1: (lv_splat_4_0= RULE_ELLIPSIS )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5167:1: (lv_splat_4_0= RULE_ELLIPSIS )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5168:3: lv_splat_4_0= RULE_ELLIPSIS
                    {
                    lv_splat_4_0=(Token)match(input,RULE_ELLIPSIS,FOLLOW_RULE_ELLIPSIS_in_ruleParam11193); if (state.failed) return current;
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5185:6: (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5185:6: (this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5185:7: this_EQUAL_5= RULE_EQUAL ( (lv_defaultValue_6_0= ruleExpression ) )
                    {
                    this_EQUAL_5=(Token)match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_ruleParam11216); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EQUAL_5, grammarAccess.getParamAccess().getEQUALTerminalRuleCall_1_1_0()); 
                          
                    }
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5189:1: ( (lv_defaultValue_6_0= ruleExpression ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5190:1: (lv_defaultValue_6_0= ruleExpression )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5190:1: (lv_defaultValue_6_0= ruleExpression )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5191:3: lv_defaultValue_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParamAccess().getDefaultValueExpressionParserRuleCall_1_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleParam11236);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5215:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5216:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5217:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral11275);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral11285); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5224:1: ruleNumberLiteral returns [EObject current=null] : ( () this_NUMBER_1= RULE_NUMBER ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token this_NUMBER_1=null;

         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5227:28: ( ( () this_NUMBER_1= RULE_NUMBER ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5228:1: ( () this_NUMBER_1= RULE_NUMBER )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5228:1: ( () this_NUMBER_1= RULE_NUMBER )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5228:2: () this_NUMBER_1= RULE_NUMBER
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5228:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5229:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNumberLiteralAccess().getNumberLiteralAction_0(),
                          current);
                  
            }

            }

            this_NUMBER_1=(Token)match(input,RULE_NUMBER,FOLLOW_RULE_NUMBER_in_ruleNumberLiteral11330); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5246:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5247:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5248:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11365);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral11375); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5255:1: ruleStringLiteral returns [EObject current=null] : ( () this_STRING_1= RULE_STRING ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5258:28: ( ( () this_STRING_1= RULE_STRING ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5259:1: ( () this_STRING_1= RULE_STRING )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5259:1: ( () this_STRING_1= RULE_STRING )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5259:2: () this_STRING_1= RULE_STRING
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5259:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5260:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStringLiteralAccess().getStringLiteralAction_0(),
                          current);
                  
            }

            }

            this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral11420); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5277:1: entryRuleBoolLiteral returns [EObject current=null] : iv_ruleBoolLiteral= ruleBoolLiteral EOF ;
    public final EObject entryRuleBoolLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolLiteral = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5278:2: (iv_ruleBoolLiteral= ruleBoolLiteral EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5279:2: iv_ruleBoolLiteral= ruleBoolLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral11455);
            iv_ruleBoolLiteral=ruleBoolLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolLiteral11465); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5286:1: ruleBoolLiteral returns [EObject current=null] : ( () this_BOOL_1= RULE_BOOL ) ;
    public final EObject ruleBoolLiteral() throws RecognitionException {
        EObject current = null;

        Token this_BOOL_1=null;

         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5289:28: ( ( () this_BOOL_1= RULE_BOOL ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5290:1: ( () this_BOOL_1= RULE_BOOL )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5290:1: ( () this_BOOL_1= RULE_BOOL )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5290:2: () this_BOOL_1= RULE_BOOL
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5290:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5291:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBoolLiteralAccess().getBoolLiteralAction_0(),
                          current);
                  
            }

            }

            this_BOOL_1=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleBoolLiteral11510); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5308:1: entryRuleJSLiteral returns [EObject current=null] : iv_ruleJSLiteral= ruleJSLiteral EOF ;
    public final EObject entryRuleJSLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSLiteral = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5309:2: (iv_ruleJSLiteral= ruleJSLiteral EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5310:2: iv_ruleJSLiteral= ruleJSLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJSLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleJSLiteral_in_entryRuleJSLiteral11545);
            iv_ruleJSLiteral=ruleJSLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJSLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJSLiteral11555); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5317:1: ruleJSLiteral returns [EObject current=null] : ( () this_JS_1= RULE_JS ) ;
    public final EObject ruleJSLiteral() throws RecognitionException {
        EObject current = null;

        Token this_JS_1=null;

         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5320:28: ( ( () this_JS_1= RULE_JS ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5321:1: ( () this_JS_1= RULE_JS )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5321:1: ( () this_JS_1= RULE_JS )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5321:2: () this_JS_1= RULE_JS
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5321:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5322:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJSLiteralAccess().getJSLiteralAction_0(),
                          current);
                  
            }

            }

            this_JS_1=(Token)match(input,RULE_JS,FOLLOW_RULE_JS_in_ruleJSLiteral11600); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5339:1: entryRuleRegexLiteral returns [EObject current=null] : iv_ruleRegexLiteral= ruleRegexLiteral EOF ;
    public final EObject entryRuleRegexLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexLiteral = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5340:2: (iv_ruleRegexLiteral= ruleRegexLiteral EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5341:2: iv_ruleRegexLiteral= ruleRegexLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegexLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleRegexLiteral_in_entryRuleRegexLiteral11635);
            iv_ruleRegexLiteral=ruleRegexLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegexLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRegexLiteral11645); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5348:1: ruleRegexLiteral returns [EObject current=null] : ( () this_REGEX_1= RULE_REGEX ) ;
    public final EObject ruleRegexLiteral() throws RecognitionException {
        EObject current = null;

        Token this_REGEX_1=null;

         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5351:28: ( ( () this_REGEX_1= RULE_REGEX ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5352:1: ( () this_REGEX_1= RULE_REGEX )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5352:1: ( () this_REGEX_1= RULE_REGEX )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5352:2: () this_REGEX_1= RULE_REGEX
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5352:2: ()
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5353:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRegexLiteralAccess().getRegexLiteralAction_0(),
                          current);
                  
            }

            }

            this_REGEX_1=(Token)match(input,RULE_REGEX,FOLLOW_RULE_REGEX_in_ruleRegexLiteral11690); if (state.failed) return current;
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5370:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5371:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5372:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral11725);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral11735); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5379:1: ruleLiteral returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_JSLiteral_3= ruleJSLiteral | this_RegexLiteral_4= ruleRegexLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_StringLiteral_1 = null;

        EObject this_BoolLiteral_2 = null;

        EObject this_JSLiteral_3 = null;

        EObject this_RegexLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5382:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_JSLiteral_3= ruleJSLiteral | this_RegexLiteral_4= ruleRegexLiteral ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5383:1: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_JSLiteral_3= ruleJSLiteral | this_RegexLiteral_4= ruleRegexLiteral )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5383:1: (this_NumberLiteral_0= ruleNumberLiteral | this_StringLiteral_1= ruleStringLiteral | this_BoolLiteral_2= ruleBoolLiteral | this_JSLiteral_3= ruleJSLiteral | this_RegexLiteral_4= ruleRegexLiteral )
            int alt94=5;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt94=1;
                }
                break;
            case RULE_STRING:
                {
                alt94=2;
                }
                break;
            case RULE_BOOL:
                {
                alt94=3;
                }
                break;
            case RULE_JS:
                {
                alt94=4;
                }
                break;
            case RULE_REGEX:
                {
                alt94=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5384:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteral11782);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5394:5: this_StringLiteral_1= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteral11809);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5404:5: this_BoolLiteral_2= ruleBoolLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getBoolLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBoolLiteral_in_ruleLiteral11836);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5414:5: this_JSLiteral_3= ruleJSLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getJSLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJSLiteral_in_ruleLiteral11863);
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
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5424:5: this_RegexLiteral_4= ruleRegexLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralAccess().getRegexLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRegexLiteral_in_ruleLiteral11890);
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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5440:1: entryRuleParenthetical returns [EObject current=null] : iv_ruleParenthetical= ruleParenthetical EOF ;
    public final EObject entryRuleParenthetical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthetical = null;


        try {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5441:2: (iv_ruleParenthetical= ruleParenthetical EOF )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5442:2: iv_ruleParenthetical= ruleParenthetical EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentheticalRule()); 
            }
            pushFollow(FOLLOW_ruleParenthetical_in_entryRuleParenthetical11925);
            iv_ruleParenthetical=ruleParenthetical();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthetical; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthetical11935); if (state.failed) return current;

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
    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5449:1: ruleParenthetical returns [EObject current=null] : ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) ) ;
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
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5452:28: ( ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) ) )
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:1: ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) )
            {
            // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:1: ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) )
            int alt95=2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:2: ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:2: ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:3: ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:3: ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:4: ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:34: (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:35: this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT
                    {
                    this_LPAREN_0=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleParenthetical11983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_0, grammarAccess.getParentheticalAccess().getLPARENTerminalRuleCall_0_0_0_0()); 
                          
                    }
                    this_INDENT_1=(Token)match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_ruleParenthetical11993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INDENT_1, grammarAccess.getParentheticalAccess().getINDENTTerminalRuleCall_0_0_0_1()); 
                          
                    }

                    }


                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5461:3: ( (lv_content_2_0= ruleBody ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5462:1: (lv_content_2_0= ruleBody )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5462:1: (lv_content_2_0= ruleBody )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5463:3: lv_content_2_0= ruleBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParentheticalAccess().getContentBodyParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBody_in_ruleParenthetical12015);
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

                    this_OUTDENT_3=(Token)match(input,RULE_OUTDENT,FOLLOW_RULE_OUTDENT_in_ruleParenthetical12026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_OUTDENT_3, grammarAccess.getParentheticalAccess().getOUTDENTTerminalRuleCall_0_2()); 
                          
                    }
                    this_RPAREN_4=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleParenthetical12036); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_RPAREN_4, grammarAccess.getParentheticalAccess().getRPARENTerminalRuleCall_0_3()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5488:6: ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5488:6: ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5488:7: ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5488:7: ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5488:8: ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN
                    {
                    this_LPAREN_5=(Token)match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_ruleParenthetical12060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LPAREN_5, grammarAccess.getParentheticalAccess().getLPARENTerminalRuleCall_1_0()); 
                          
                    }

                    }

                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5492:2: ( (lv_content_6_0= ruleBody ) )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5493:1: (lv_content_6_0= ruleBody )
                    {
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5493:1: (lv_content_6_0= ruleBody )
                    // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5494:3: lv_content_6_0= ruleBody
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getParentheticalAccess().getContentBodyParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleBody_in_ruleParenthetical12081);
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

                    this_RPAREN_7=(Token)match(input,RULE_RPAREN,FOLLOW_RULE_RPAREN_in_ruleParenthetical12092); if (state.failed) return current;
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

    // $ANTLR start synpred1_InternalCakefile
    public final void synpred1_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:371:7: ( ( ( ( ruleId ) ) RULE_EQUAL 'require' ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:371:8: ( ( ( ruleId ) ) RULE_EQUAL 'require' )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:371:8: ( ( ( ruleId ) ) RULE_EQUAL 'require' )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:371:9: ( ( ruleId ) ) RULE_EQUAL 'require'
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:371:9: ( ( ruleId ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:372:1: ( ruleId )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:372:1: ( ruleId )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:373:1: ruleId
        {
        pushFollow(FOLLOW_ruleId_in_synpred1_InternalCakefile767);
        ruleId();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,RULE_EQUAL,FOLLOW_RULE_EQUAL_in_synpred1_InternalCakefile773); if (state.failed) return ;
        match(input,86,FOLLOW_86_in_synpred1_InternalCakefile775); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalCakefile

    // $ANTLR start synpred3_InternalCakefile
    public final void synpred3_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1070:4: ( RULE_POST_IF )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1070:6: RULE_POST_IF
        {
        match(input,RULE_POST_IF,FOLLOW_RULE_POST_IF_in_synpred3_InternalCakefile2248); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalCakefile

    // $ANTLR start synpred4_InternalCakefile
    public final void synpred4_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1099:8: ( RULE_FOR )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1099:10: RULE_FOR
        {
        match(input,RULE_FOR,FOLLOW_RULE_FOR_in_synpred4_InternalCakefile2303); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalCakefile

    // $ANTLR start synpred5_InternalCakefile
    public final void synpred5_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1128:8: ( RULE_WHILE )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1128:10: RULE_WHILE
        {
        match(input,RULE_WHILE,FOLLOW_RULE_WHILE_in_synpred5_InternalCakefile2358); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalCakefile

    // $ANTLR start synpred6_InternalCakefile
    public final void synpred6_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1156:4: ( RULE_WHEN )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1156:6: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred6_InternalCakefile2406); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_InternalCakefile

    // $ANTLR start synpred7_InternalCakefile
    public final void synpred7_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1179:8: ( RULE_UNTIL )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1179:10: RULE_UNTIL
        {
        match(input,RULE_UNTIL,FOLLOW_RULE_UNTIL_in_synpred7_InternalCakefile2454); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalCakefile

    // $ANTLR start synpred8_InternalCakefile
    public final void synpred8_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1207:4: ( RULE_WHEN )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1207:6: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred8_InternalCakefile2502); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalCakefile

    // $ANTLR start synpred9_InternalCakefile
    public final void synpred9_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1369:5: ( RULE_FOROF )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1369:7: RULE_FOROF
        {
        match(input,RULE_FOROF,FOLLOW_RULE_FOROF_in_synpred9_InternalCakefile2877); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalCakefile

    // $ANTLR start synpred10_InternalCakefile
    public final void synpred10_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1391:4: ( RULE_WHEN )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1391:6: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred10_InternalCakefile2916); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalCakefile

    // $ANTLR start synpred11_InternalCakefile
    public final void synpred11_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1414:8: ( RULE_FORIN )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1414:10: RULE_FORIN
        {
        match(input,RULE_FORIN,FOLLOW_RULE_FORIN_in_synpred11_InternalCakefile2964); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_InternalCakefile

    // $ANTLR start synpred12_InternalCakefile
    public final void synpred12_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1436:5: ( RULE_WHEN )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1436:7: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred12_InternalCakefile3004); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalCakefile

    // $ANTLR start synpred13_InternalCakefile
    public final void synpred13_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1458:4: ( RULE_BY )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1458:6: RULE_BY
        {
        match(input,RULE_BY,FOLLOW_RULE_BY_in_synpred13_InternalCakefile3043); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalCakefile

    // $ANTLR start synpred14_InternalCakefile
    public final void synpred14_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1481:8: ( RULE_BY )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1481:10: RULE_BY
        {
        match(input,RULE_BY,FOLLOW_RULE_BY_in_synpred14_InternalCakefile3091); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalCakefile

    // $ANTLR start synpred15_InternalCakefile
    public final void synpred15_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1503:4: ( RULE_WHEN )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1503:6: RULE_WHEN
        {
        match(input,RULE_WHEN,FOLLOW_RULE_WHEN_in_synpred15_InternalCakefile3130); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalCakefile

    // $ANTLR start synpred17_InternalCakefile
    public final void synpred17_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:4: ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:5: ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:5: ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:6: ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1625:6: ( ( ruleAssignable ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1626:1: ( ruleAssignable )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1626:1: ( ruleAssignable )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1627:1: ruleAssignable
        {
        pushFollow(FOLLOW_ruleAssignable_in_synpred17_InternalCakefile3444);
        ruleAssignable();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1629:2: ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1630:1: ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1630:1: ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1631:1: ( RULE_EQUAL | RULE_COMPOUND_ASSIGN )
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
    // $ANTLR end synpred17_InternalCakefile

    // $ANTLR start synpred18_InternalCakefile
    public final void synpred18_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1809:3: ( ( () ( ( RULE_LOGIC ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1809:4: ( () ( ( RULE_LOGIC ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1809:4: ( () ( ( RULE_LOGIC ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1809:5: () ( ( RULE_LOGIC ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1809:5: ()
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1810:1: 
        {
        }

        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1810:2: ( ( RULE_LOGIC ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1811:1: ( RULE_LOGIC )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1811:1: ( RULE_LOGIC )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1812:1: RULE_LOGIC
        {
        match(input,RULE_LOGIC,FOLLOW_RULE_LOGIC_in_synpred18_InternalCakefile3868); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred18_InternalCakefile

    // $ANTLR start synpred19_InternalCakefile
    public final void synpred19_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1887:3: ( ( () ( ( RULE_COMPARE ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1887:4: ( () ( ( RULE_COMPARE ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1887:4: ( () ( ( RULE_COMPARE ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1887:5: () ( ( RULE_COMPARE ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1887:5: ()
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1888:1: 
        {
        }

        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1888:2: ( ( RULE_COMPARE ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1889:1: ( RULE_COMPARE )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1889:1: ( RULE_COMPARE )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1890:1: RULE_COMPARE
        {
        match(input,RULE_COMPARE,FOLLOW_RULE_COMPARE_in_synpred19_InternalCakefile4037); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred19_InternalCakefile

    // $ANTLR start synpred20_InternalCakefile
    public final void synpred20_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1965:3: ( ( () ( ( RULE_RELATION ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1965:4: ( () ( ( RULE_RELATION ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1965:4: ( () ( ( RULE_RELATION ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1965:5: () ( ( RULE_RELATION ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1965:5: ()
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1966:1: 
        {
        }

        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1966:2: ( ( RULE_RELATION ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1967:1: ( RULE_RELATION )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1967:1: ( RULE_RELATION )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:1968:1: RULE_RELATION
        {
        match(input,RULE_RELATION,FOLLOW_RULE_RELATION_in_synpred20_InternalCakefile4206); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred20_InternalCakefile

    // $ANTLR start synpred21_InternalCakefile
    public final void synpred21_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2043:3: ( ( () ( ( RULE_SHIFT ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2043:4: ( () ( ( RULE_SHIFT ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2043:4: ( () ( ( RULE_SHIFT ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2043:5: () ( ( RULE_SHIFT ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2043:5: ()
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2044:1: 
        {
        }

        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2044:2: ( ( RULE_SHIFT ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2045:1: ( RULE_SHIFT )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2045:1: ( RULE_SHIFT )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2046:1: RULE_SHIFT
        {
        match(input,RULE_SHIFT,FOLLOW_RULE_SHIFT_in_synpred21_InternalCakefile4375); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred21_InternalCakefile

    // $ANTLR start synpred22_InternalCakefile
    public final void synpred22_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2121:3: ( ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2121:4: ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2121:4: ( () ( ( ( RULE_PLUS | RULE_MINUS ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2121:5: () ( ( ( RULE_PLUS | RULE_MINUS ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2121:5: ()
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2122:1: 
        {
        }

        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2122:2: ( ( ( RULE_PLUS | RULE_MINUS ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2123:1: ( ( RULE_PLUS | RULE_MINUS ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2123:1: ( ( RULE_PLUS | RULE_MINUS ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2124:1: ( RULE_PLUS | RULE_MINUS )
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
    // $ANTLR end synpred22_InternalCakefile

    // $ANTLR start synpred23_InternalCakefile
    public final void synpred23_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2222:3: ( ( () ( ( RULE_MATH ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2222:4: ( () ( ( RULE_MATH ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2222:4: ( () ( ( RULE_MATH ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2222:5: () ( ( RULE_MATH ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2222:5: ()
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2223:1: 
        {
        }

        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2223:2: ( ( RULE_MATH ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2224:1: ( RULE_MATH )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2224:1: ( RULE_MATH )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2225:1: RULE_MATH
        {
        match(input,RULE_MATH,FOLLOW_RULE_MATH_in_synpred23_InternalCakefile4753); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23_InternalCakefile

    // $ANTLR start synpred24_InternalCakefile
    public final void synpred24_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2792:4: ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2793:1: ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2793:1: ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2794:1: ( RULE_DOT_DOT | RULE_ELLIPSIS )
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
    // $ANTLR end synpred24_InternalCakefile

    // $ANTLR start synpred25_InternalCakefile
    public final void synpred25_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:8: ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:9: ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:9: ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:10: ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2857:10: ( ( ruleExpression ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2858:1: ( ruleExpression )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2858:1: ( ruleExpression )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2859:1: ruleExpression
        {
        pushFollow(FOLLOW_ruleExpression_in_synpred25_InternalCakefile6205);
        ruleExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2861:2: ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2862:1: ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2862:1: ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:2863:1: ( RULE_DOT_DOT | RULE_ELLIPSIS )
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
    // $ANTLR end synpred25_InternalCakefile

    // $ANTLR start synpred26_InternalCakefile
    public final void synpred26_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3013:7: ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3013:8: ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3013:8: ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3013:10: RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS )
        {
        match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_synpred26_InternalCakefile6515); if (state.failed) return ;
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3013:23: ( ( ruleExpression ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3014:1: ( ruleExpression )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3014:1: ( ruleExpression )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3015:1: ruleExpression
        {
        pushFollow(FOLLOW_ruleExpression_in_synpred26_InternalCakefile6520);
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
    // $ANTLR end synpred26_InternalCakefile

    // $ANTLR start synpred27_InternalCakefile
    public final void synpred27_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3028:7: ( RULE_LBRACKET )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3028:9: RULE_LBRACKET
        {
        match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_synpred27_InternalCakefile6571); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_InternalCakefile

    // $ANTLR start synpred28_InternalCakefile
    public final void synpred28_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3038:7: ( RULE_LCURLY )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3038:9: RULE_LCURLY
        {
        match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_synpred28_InternalCakefile6605); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalCakefile

    // $ANTLR start synpred29_InternalCakefile
    public final void synpred29_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:4: ( ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:5: ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:5: ( ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:7: ruleIdRef ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) )
        {
        pushFollow(FOLLOW_ruleIdRef_in_synpred29_InternalCakefile8221);
        ruleIdRef();

        state._fsp--;
        if (state.failed) return ;
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3876:16: ( ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3877:1: ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3877:1: ( ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3878:1: ( RULE_DOT | RULE_DOUBLE_COLON | RULE_QUESTION_DOT )
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
    // $ANTLR end synpred29_InternalCakefile

    // $ANTLR start synpred30_InternalCakefile
    public final void synpred30_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:8: ( ( ruleIdRef RULE_INDEX_START ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:9: ( ruleIdRef RULE_INDEX_START )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:9: ( ruleIdRef RULE_INDEX_START )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:3967:11: ruleIdRef RULE_INDEX_START
        {
        pushFollow(FOLLOW_ruleIdRef_in_synpred30_InternalCakefile8384);
        ruleIdRef();

        state._fsp--;
        if (state.failed) return ;
        match(input,RULE_INDEX_START,FOLLOW_RULE_INDEX_START_in_synpred30_InternalCakefile8386); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred30_InternalCakefile

    // $ANTLR start synpred32_InternalCakefile
    public final void synpred32_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4274:7: ( RULE_LCURLY )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4274:9: RULE_LCURLY
        {
        match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_synpred32_InternalCakefile9139); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalCakefile

    // $ANTLR start synpred33_InternalCakefile
    public final void synpred33_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4284:7: ( RULE_LBRACKET )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:4284:9: RULE_LBRACKET
        {
        match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_synpred33_InternalCakefile9173); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalCakefile

    // $ANTLR start synpred36_InternalCakefile
    public final void synpred36_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5137:7: ( RULE_LBRACKET )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5137:9: RULE_LBRACKET
        {
        match(input,RULE_LBRACKET,FOLLOW_RULE_LBRACKET_in_synpred36_InternalCakefile11097); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalCakefile

    // $ANTLR start synpred37_InternalCakefile
    public final void synpred37_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5147:7: ( RULE_LCURLY )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5147:9: RULE_LCURLY
        {
        match(input,RULE_LCURLY,FOLLOW_RULE_LCURLY_in_synpred37_InternalCakefile11131); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalCakefile

    // $ANTLR start synpred38_InternalCakefile
    public final void synpred38_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:4: ( ( RULE_LPAREN RULE_INDENT ) )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:5: ( RULE_LPAREN RULE_INDENT )
        {
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:5: ( RULE_LPAREN RULE_INDENT )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5453:7: RULE_LPAREN RULE_INDENT
        {
        match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_synpred38_InternalCakefile11974); if (state.failed) return ;
        match(input,RULE_INDENT,FOLLOW_RULE_INDENT_in_synpred38_InternalCakefile11976); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred38_InternalCakefile

    // $ANTLR start synpred39_InternalCakefile
    public final void synpred39_InternalCakefile_fragment() throws RecognitionException {   
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5488:8: ( RULE_LPAREN )
        // ../csep.example.cake/src-gen/csep/example/cake/parser/antlr/internal/InternalCakefile.g:5488:10: RULE_LPAREN
        {
        match(input,RULE_LPAREN,FOLLOW_RULE_LPAREN_in_synpred39_InternalCakefile12055); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_InternalCakefile

    // Delegated rules

    public final boolean synpred17_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalCakefile() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalCakefile_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA29 dfa29 = new DFA29(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA95 dfa95 = new DFA95(this);
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\1\5\11\uffff";
    static final String DFA19_minS =
        "\1\6\4\0\5\uffff";
    static final String DFA19_maxS =
        "\1\112\4\0\5\uffff";
    static final String DFA19_acceptS =
        "\5\uffff\1\5\1\1\1\2\1\3\1\4";
    static final String DFA19_specialS =
        "\1\uffff\1\3\1\2\1\1\1\0\5\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\5\1\uffff\1\5\1\uffff\2\5\5\uffff\1\1\3\uffff\1\2\1\3\1\5"+
            "\1\4\3\uffff\1\5\1\uffff\3\5\1\uffff\11\5\13\uffff\1\5\13\uffff"+
            "\1\5\7\uffff\1\5",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1070:1: ( ( ( ( RULE_POST_IF )=>this_POST_IF_1= RULE_POST_IF ) () ( (lv_condition_3_0= ruleExpression ) ) ) | ( ( ( RULE_FOR )=>this_FOR_4= RULE_FOR ) () ( (lv_body_6_0= ruleForBody ) ) ) | ( ( ( RULE_WHILE )=>this_WHILE_7= RULE_WHILE ) () ( (lv_body_9_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_10= RULE_WHEN ) ( (lv_when_11_0= ruleExpression ) ) )? ) | ( ( ( RULE_UNTIL )=>this_UNTIL_12= RULE_UNTIL ) () ( (lv_body_14_0= ruleExpression ) ) ( ( ( RULE_WHEN )=>this_WHEN_15= RULE_WHEN ) ( (lv_when_16_0= ruleExpression ) ) )? ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred7_InternalCakefile()) ) {s = 9;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_InternalCakefile()) ) {s = 8;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalCakefile()) ) {s = 7;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_1 = input.LA(1);

                         
                        int index19_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_InternalCakefile()) ) {s = 6;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index19_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\35\uffff";
    static final String DFA29_eofS =
        "\35\uffff";
    static final String DFA29_minS =
        "\1\7\5\0\27\uffff";
    static final String DFA29_maxS =
        "\1\111\5\0\27\uffff";
    static final String DFA29_acceptS =
        "\6\uffff\1\2\25\uffff\1\1";
    static final String DFA29_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\27\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\6\1\uffff\1\6\5\uffff\1\6\5\uffff\2\6\1\uffff\1\6\4\uffff"+
            "\1\5\12\uffff\2\6\1\uffff\3\6\1\uffff\1\6\1\uffff\1\2\5\uffff"+
            "\1\3\2\6\2\uffff\1\6\2\uffff\1\6\1\1\1\4\2\uffff\6\6",
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
            return "1625:1: ( ( ( ( ( ( ( ruleAssignable ) ) ( ( ( RULE_EQUAL | RULE_COMPOUND_ASSIGN ) ) ) ) )=> ( ( (lv_left_0_0= ruleAssignable ) ) ( ( (lv_operator_1_1= RULE_EQUAL | lv_operator_1_2= RULE_COMPOUND_ASSIGN ) ) ) ) ) ( (lv_right_2_0= ruleAssigned ) ) ) | this_LogicOp_3= ruleLogicOp )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_1 = input.LA(1);

                         
                        int index29_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCakefile()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index29_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA29_2 = input.LA(1);

                         
                        int index29_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCakefile()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index29_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA29_3 = input.LA(1);

                         
                        int index29_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCakefile()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index29_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA29_4 = input.LA(1);

                         
                        int index29_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCakefile()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index29_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA29_5 = input.LA(1);

                         
                        int index29_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalCakefile()) ) {s = 28;}

                        else if ( (true) ) {s = 6;}

                         
                        input.seek(index29_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\40\uffff";
    static final String DFA54_eofS =
        "\40\uffff";
    static final String DFA54_minS =
        "\1\7\2\uffff\33\0\2\uffff";
    static final String DFA54_maxS =
        "\1\111\2\uffff\33\0\2\uffff";
    static final String DFA54_acceptS =
        "\1\uffff\2\1\33\uffff\1\2\1\3";
    static final String DFA54_specialS =
        "\1\0\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
        "\1\32\1\33\2\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\25\1\uffff\1\26\5\uffff\1\21\5\uffff\1\30\1\31\1\uffff\1"+
            "\32\4\uffff\1\7\1\1\1\2\10\uffff\1\11\1\12\1\uffff\1\10\1\13"+
            "\1\14\1\uffff\1\15\1\uffff\1\4\5\uffff\1\5\1\33\1\34\2\uffff"+
            "\1\35\2\uffff\1\16\1\3\1\6\2\uffff\1\27\1\20\1\22\1\23\1\24"+
            "\1\17",
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

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "2792:1: ( ( ( ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=> ( (lv_dots_0_1= RULE_DOT_DOT | lv_dots_0_2= RULE_ELLIPSIS ) ) ) ( (lv_end_1_0= ruleExpression ) ) ) | ( ( ( ( ( ( ruleExpression ) ) ( ( ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) ) ) )=> ( ( (lv_start_2_0= ruleExpression ) ) ( ( (lv_dots_3_1= RULE_DOT_DOT | lv_dots_3_2= RULE_ELLIPSIS ) ) ) ) ) ( (lv_end_4_0= ruleExpression ) )? ) | ( (lv_exp_5_0= ruleExpression ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA54_0==RULE_DOT_DOT) && (synpred24_InternalCakefile())) {s = 1;}

                        else if ( (LA54_0==RULE_ELLIPSIS) && (synpred24_InternalCakefile())) {s = 2;}

                        else if ( (LA54_0==RULE_IDENTIFIER) ) {s = 3;}

                        else if ( (LA54_0==RULE_AT_SIGIL) ) {s = 4;}

                        else if ( (LA54_0==RULE_THIS) ) {s = 5;}

                        else if ( (LA54_0==RULE_LCURLY) ) {s = 6;}

                        else if ( (LA54_0==RULE_LBRACKET) ) {s = 7;}

                        else if ( (LA54_0==RULE_UNARY) ) {s = 8;}

                        else if ( (LA54_0==RULE_PLUS) ) {s = 9;}

                        else if ( (LA54_0==RULE_MINUS) ) {s = 10;}

                        else if ( (LA54_0==RULE_PLUS_PLUS) ) {s = 11;}

                        else if ( (LA54_0==RULE_MINUS_MINUS) ) {s = 12;}

                        else if ( (LA54_0==RULE_SUPER) ) {s = 13;}

                        else if ( (LA54_0==RULE_IF) ) {s = 14;}

                        else if ( (LA54_0==RULE_LPAREN) ) {s = 15;}

                        else if ( (LA54_0==RULE_NUMBER) ) {s = 16;}

                        else if ( (LA54_0==RULE_STRING) ) {s = 17;}

                        else if ( (LA54_0==RULE_BOOL) ) {s = 18;}

                        else if ( (LA54_0==RULE_JS) ) {s = 19;}

                        else if ( (LA54_0==RULE_REGEX) ) {s = 20;}

                        else if ( (LA54_0==RULE_PARAM_START) ) {s = 21;}

                        else if ( (LA54_0==RULE_FUNC_ARROW) ) {s = 22;}

                        else if ( (LA54_0==RULE_BOUND_FUNC_ARROW) ) {s = 23;}

                        else if ( (LA54_0==RULE_FOR) ) {s = 24;}

                        else if ( (LA54_0==RULE_WHILE) ) {s = 25;}

                        else if ( (LA54_0==RULE_UNTIL) ) {s = 26;}

                        else if ( (LA54_0==RULE_LOOP) ) {s = 27;}

                        else if ( (LA54_0==RULE_TRY) ) {s = 28;}

                        else if ( (LA54_0==RULE_SWITCH) ) {s = 29;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_3 = input.LA(1);

                         
                        int index54_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_4 = input.LA(1);

                         
                        int index54_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_6 = input.LA(1);

                         
                        int index54_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_7 = input.LA(1);

                         
                        int index54_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_8 = input.LA(1);

                         
                        int index54_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_11 = input.LA(1);

                         
                        int index54_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_11);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_12 = input.LA(1);

                         
                        int index54_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA54_13 = input.LA(1);

                         
                        int index54_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_13);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA54_14 = input.LA(1);

                         
                        int index54_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA54_15 = input.LA(1);

                         
                        int index54_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_15);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA54_16 = input.LA(1);

                         
                        int index54_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA54_17 = input.LA(1);

                         
                        int index54_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_17);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA54_18 = input.LA(1);

                         
                        int index54_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_18);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA54_19 = input.LA(1);

                         
                        int index54_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_19);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA54_20 = input.LA(1);

                         
                        int index54_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_20);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA54_21 = input.LA(1);

                         
                        int index54_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_21);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA54_22 = input.LA(1);

                         
                        int index54_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_22);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA54_23 = input.LA(1);

                         
                        int index54_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA54_24 = input.LA(1);

                         
                        int index54_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_24);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA54_25 = input.LA(1);

                         
                        int index54_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA54_26 = input.LA(1);

                         
                        int index54_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_26);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA54_27 = input.LA(1);

                         
                        int index54_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_27);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA54_28 = input.LA(1);

                         
                        int index54_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_28);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA54_29 = input.LA(1);

                         
                        int index54_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalCakefile()) ) {s = 30;}

                        else if ( (true) ) {s = 31;}

                         
                        input.seek(index54_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\30\uffff";
    static final String DFA62_eofS =
        "\30\uffff";
    static final String DFA62_minS =
        "\1\7\7\uffff\1\0\17\uffff";
    static final String DFA62_maxS =
        "\1\111\7\uffff\1\0\17\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\1\1\2\1\3\5\uffff\1\6\1\7\2\uffff\1\10\1\11\1\12\1\13"+
        "\1\14\1\15\1\16\1\17\1\20\1\4\1\5";
    static final String DFA62_specialS =
        "\1\0\7\uffff\1\1\17\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\12\1\uffff\1\12\5\uffff\1\3\5\uffff\1\17\1\20\1\uffff\1\21"+
            "\4\uffff\1\10\23\uffff\1\15\5\uffff\1\16\1\22\1\23\2\uffff\1"+
            "\24\2\uffff\1\1\1\25\1\11\2\uffff\1\12\4\3\1\2",
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

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "2983:1: (this_IfExp_0= ruleIfExp | this_Parenthetical_1= ruleParenthetical | this_Literal_2= ruleLiteral | ( ( ( RULE_LBRACKET ( ( ruleExpression ) ) ( RULE_DOT_DOT | RULE_ELLIPSIS ) ) )=>this_Range_3= ruleRange ) | ( ( RULE_LBRACKET )=>this_Array_4= ruleArray ) | ( ( RULE_LCURLY )=>this_Dictionary_5= ruleDictionary ) | this_Lambda_6= ruleLambda | this_ThisProperty_7= ruleThisProperty | ( () this_THIS_9= RULE_THIS ) | ( () (this_FOR_11= RULE_FOR ( (lv_loop_12_0= ruleForBody ) ) ( (lv_body_13_0= ruleBlock ) ) ) ) | ( () (this_WHILE_15= RULE_WHILE ( (lv_loop_16_0= ruleExpression ) ) (this_WHEN_17= RULE_WHEN ( (lv_when_18_0= ruleExpression ) ) )? ( (lv_body_19_0= ruleBlock ) ) ) ) | ( () (this_UNTIL_21= RULE_UNTIL ( (lv_loop_22_0= ruleExpression ) ) (this_WHEN_23= RULE_WHEN ( (lv_when_24_0= ruleExpression ) ) )? ( (lv_body_25_0= ruleBlock ) ) ) ) | ( () (this_LOOP_27= RULE_LOOP ( (lv_body_28_0= ruleBlock ) ) ) ) | ( () (this_TRY_30= RULE_TRY ( (lv_body_31_0= ruleBlock ) ) ( (this_CATCH_32= RULE_CATCH ( (lv_exception_33_0= ruleId ) ) ( (lv_catchBlock_34_0= ruleBlock ) ) (this_FINALLY_35= RULE_FINALLY ( (lv_finallyBlock_36_0= ruleBlock ) ) )? ) | (this_FINALLY_37= RULE_FINALLY ( (lv_finallyBlock_38_0= ruleBlock ) ) ) )? ) ) | ( () (this_SWITCH_40= RULE_SWITCH ( (lv_exp_41_0= ruleExpression ) )? this_INDENT_42= RULE_INDENT ( (lv_cases_43_0= ruleCase ) )* (this_ELSE_44= RULE_ELSE ( (lv_elseBlock_45_0= ruleBlock ) ) )? this_OUTDENT_46= RULE_OUTDENT ) ) | this_IdRef_47= ruleIdRef )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_0 = input.LA(1);

                         
                        int index62_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA62_0==RULE_IF) ) {s = 1;}

                        else if ( (LA62_0==RULE_LPAREN) ) {s = 2;}

                        else if ( (LA62_0==RULE_STRING||(LA62_0>=RULE_NUMBER && LA62_0<=RULE_REGEX)) ) {s = 3;}

                        else if ( (LA62_0==RULE_LBRACKET) ) {s = 8;}

                        else if ( (LA62_0==RULE_LCURLY) && (synpred28_InternalCakefile())) {s = 9;}

                        else if ( (LA62_0==RULE_PARAM_START||LA62_0==RULE_FUNC_ARROW||LA62_0==RULE_BOUND_FUNC_ARROW) ) {s = 10;}

                        else if ( (LA62_0==RULE_AT_SIGIL) ) {s = 13;}

                        else if ( (LA62_0==RULE_THIS) ) {s = 14;}

                        else if ( (LA62_0==RULE_FOR) ) {s = 15;}

                        else if ( (LA62_0==RULE_WHILE) ) {s = 16;}

                        else if ( (LA62_0==RULE_UNTIL) ) {s = 17;}

                        else if ( (LA62_0==RULE_LOOP) ) {s = 18;}

                        else if ( (LA62_0==RULE_TRY) ) {s = 19;}

                        else if ( (LA62_0==RULE_SWITCH) ) {s = 20;}

                        else if ( (LA62_0==RULE_IDENTIFIER) ) {s = 21;}

                         
                        input.seek(index62_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_8 = input.LA(1);

                         
                        int index62_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalCakefile()) ) {s = 22;}

                        else if ( (synpred27_InternalCakefile()) ) {s = 23;}

                         
                        input.seek(index62_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA95_eotS =
        "\43\uffff";
    static final String DFA95_eofS =
        "\43\uffff";
    static final String DFA95_minS =
        "\1\111\1\7\41\uffff";
    static final String DFA95_maxS =
        "\2\111\41\uffff";
    static final String DFA95_acceptS =
        "\2\uffff\40\2\1\1";
    static final String DFA95_specialS =
        "\1\uffff\1\0\41\uffff}>";
    static final String[] DFA95_transitionS = {
            "\1\1",
            "\1\31\1\uffff\1\32\2\uffff\1\7\1\5\1\uffff\1\25\1\2\1\uffff"+
            "\1\3\1\6\1\uffff\1\34\1\35\1\uffff\1\36\4\uffff\1\13\4\uffff"+
            "\1\42\5\uffff\1\15\1\16\1\uffff\1\14\1\17\1\20\1\uffff\1\21"+
            "\1\uffff\1\10\5\uffff\1\11\1\37\1\40\2\uffff\1\41\2\uffff\1"+
            "\22\1\4\1\12\2\uffff\1\33\1\24\1\26\1\27\1\30\1\23",
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

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }
        public String getDescription() {
            return "5453:1: ( ( ( ( ( RULE_LPAREN RULE_INDENT ) )=> (this_LPAREN_0= RULE_LPAREN this_INDENT_1= RULE_INDENT ) ) ( (lv_content_2_0= ruleBody ) ) this_OUTDENT_3= RULE_OUTDENT this_RPAREN_4= RULE_RPAREN ) | ( ( ( RULE_LPAREN )=>this_LPAREN_5= RULE_LPAREN ) ( (lv_content_6_0= ruleBody ) ) this_RPAREN_7= RULE_RPAREN ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA95_1 = input.LA(1);

                         
                        int index95_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA95_1==RULE_RETURN) && (synpred39_InternalCakefile())) {s = 2;}

                        else if ( (LA95_1==RULE_THROW) && (synpred39_InternalCakefile())) {s = 3;}

                        else if ( (LA95_1==RULE_IDENTIFIER) && (synpred39_InternalCakefile())) {s = 4;}

                        else if ( (LA95_1==RULE_HERECOMMENT) && (synpred39_InternalCakefile())) {s = 5;}

                        else if ( (LA95_1==RULE_CLASS) && (synpred39_InternalCakefile())) {s = 6;}

                        else if ( (LA95_1==RULE_STATEMENT) && (synpred39_InternalCakefile())) {s = 7;}

                        else if ( (LA95_1==RULE_AT_SIGIL) && (synpred39_InternalCakefile())) {s = 8;}

                        else if ( (LA95_1==RULE_THIS) && (synpred39_InternalCakefile())) {s = 9;}

                        else if ( (LA95_1==RULE_LCURLY) && (synpred39_InternalCakefile())) {s = 10;}

                        else if ( (LA95_1==RULE_LBRACKET) && (synpred39_InternalCakefile())) {s = 11;}

                        else if ( (LA95_1==RULE_UNARY) && (synpred39_InternalCakefile())) {s = 12;}

                        else if ( (LA95_1==RULE_PLUS) && (synpred39_InternalCakefile())) {s = 13;}

                        else if ( (LA95_1==RULE_MINUS) && (synpred39_InternalCakefile())) {s = 14;}

                        else if ( (LA95_1==RULE_PLUS_PLUS) && (synpred39_InternalCakefile())) {s = 15;}

                        else if ( (LA95_1==RULE_MINUS_MINUS) && (synpred39_InternalCakefile())) {s = 16;}

                        else if ( (LA95_1==RULE_SUPER) && (synpred39_InternalCakefile())) {s = 17;}

                        else if ( (LA95_1==RULE_IF) && (synpred39_InternalCakefile())) {s = 18;}

                        else if ( (LA95_1==RULE_LPAREN) && (synpred39_InternalCakefile())) {s = 19;}

                        else if ( (LA95_1==RULE_NUMBER) && (synpred39_InternalCakefile())) {s = 20;}

                        else if ( (LA95_1==RULE_STRING) && (synpred39_InternalCakefile())) {s = 21;}

                        else if ( (LA95_1==RULE_BOOL) && (synpred39_InternalCakefile())) {s = 22;}

                        else if ( (LA95_1==RULE_JS) && (synpred39_InternalCakefile())) {s = 23;}

                        else if ( (LA95_1==RULE_REGEX) && (synpred39_InternalCakefile())) {s = 24;}

                        else if ( (LA95_1==RULE_PARAM_START) && (synpred39_InternalCakefile())) {s = 25;}

                        else if ( (LA95_1==RULE_FUNC_ARROW) && (synpred39_InternalCakefile())) {s = 26;}

                        else if ( (LA95_1==RULE_BOUND_FUNC_ARROW) && (synpred39_InternalCakefile())) {s = 27;}

                        else if ( (LA95_1==RULE_FOR) && (synpred39_InternalCakefile())) {s = 28;}

                        else if ( (LA95_1==RULE_WHILE) && (synpred39_InternalCakefile())) {s = 29;}

                        else if ( (LA95_1==RULE_UNTIL) && (synpred39_InternalCakefile())) {s = 30;}

                        else if ( (LA95_1==RULE_LOOP) && (synpred39_InternalCakefile())) {s = 31;}

                        else if ( (LA95_1==RULE_TRY) && (synpred39_InternalCakefile())) {s = 32;}

                        else if ( (LA95_1==RULE_SWITCH) && (synpred39_InternalCakefile())) {s = 33;}

                        else if ( (LA95_1==RULE_INDENT) && (synpred38_InternalCakefile())) {s = 34;}

                         
                        input.seek(index95_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 95, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleCakefile_in_entryRuleCakefile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCakefile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTaskDeclaration_in_ruleCakefile130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleTaskDeclaration_in_entryRuleTaskDeclaration166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTaskDeclaration176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TASK_in_ruleTaskDeclaration212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_CALL_START_in_ruleTaskDeclaration222 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleTaskDeclaration242 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleTaskDeclaration253 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleTaskDeclaration273 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleTaskDeclaration284 = new BitSet(new long[]{0x0000000000000280L});
    public static final BitSet FOLLOW_RULE_PARAM_START_in_ruleTaskDeclaration295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleId_in_ruleTaskDeclaration315 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_PARAM_END_in_ruleTaskDeclaration326 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_FUNC_ARROW_in_ruleTaskDeclaration338 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleTaskDeclaration358 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CALL_END_in_ruleTaskDeclaration369 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleTaskDeclaration379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBody_in_entryRuleBody416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBody426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLine_in_ruleBody472 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleBody484 = new BitSet(new long[]{0x9382BB00216DBA82L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleLine_in_ruleBody504 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleLine_in_entryRuleLine543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLine553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_ruleLine600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLine627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStmt_in_entryRuleStmt662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStmt672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStmt_in_ruleStmt719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrowStmt_in_ruleStmt746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequireStmt_in_ruleStmt794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleStmt822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDeclaration_in_ruleStmt849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STATEMENT_in_ruleStmt871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HERECOMMENT_in_ruleComment963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequireStmt_in_entryRuleRequireStmt1003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequireStmt1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleRequireStmt1081 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleRequireStmt1092 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleRequireStmt1103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_CALL_START_in_ruleRequireStmt1116 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRequireStmt1132 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CALL_END_in_ruleRequireStmt1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnStmt_in_entryRuleReturnStmt1183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnStmt1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_in_ruleReturnStmt1238 = new BitSet(new long[]{0x9382BB00216FB282L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStmt1258 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_RULE_POST_IF_in_ruleReturnStmt1271 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleReturnStmt1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThrowStmt_in_entryRuleThrowStmt1329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThrowStmt1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THROW_in_ruleThrowStmt1375 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleThrowStmt1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperClass_in_entryRuleSuperClass1431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperClass1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleSuperClass1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleSuperClass1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDeclaration_in_entryRuleClassDeclaration1550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDeclaration1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLASS_in_ruleClassDeclaration1605 = new BitSet(new long[]{0x0082000400100002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleClassDeclaration1626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleClassDeclaration1644 = new BitSet(new long[]{0x0082000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSuperClass_in_ruleClassDeclaration1664 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleClassDeclaration1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleClassDeclaration1717 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleClassDeclaration1736 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleClassDeclaration1751 = new BitSet(new long[]{0x0082000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSuperClass_in_ruleClassDeclaration1771 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleClassDeclaration1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignedClassDeclaration_in_entryRuleAssignedClassDeclaration1833 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignedClassDeclaration1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CLASS_in_ruleAssignedClassDeclaration1888 = new BitSet(new long[]{0x0082000000100002L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleAssignedClassDeclaration1900 = new BitSet(new long[]{0x0082000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSuperClass_in_ruleAssignedClassDeclaration1920 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAssignedClassDeclaration1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleAssignedClassDeclaration1972 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleAssignedClassDeclaration1991 = new BitSet(new long[]{0x0000000400100000L});
    public static final BitSet FOLLOW_RULE_EXTENDS_in_ruleAssignedClassDeclaration2006 = new BitSet(new long[]{0x0082000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleSuperClass_in_ruleAssignedClassDeclaration2026 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleAssignedClassDeclaration2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_ruleExpression2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePostfix_in_entryRulePostfix2178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePostfix2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rulePostfix2235 = new BitSet(new long[]{0x0000000001620002L});
    public static final BitSet FOLLOW_RULE_POST_IF_in_rulePostfix2253 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_rulePostfix2308 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleForBody_in_rulePostfix2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_rulePostfix2363 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2393 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_rulePostfix2411 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNTIL_in_rulePostfix2459 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2489 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_rulePostfix2507 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePostfix2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForBody_in_entryRuleForBody2569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForBody2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OWN_in_ruleForBody2616 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleForValue_in_ruleForBody2638 = new BitSet(new long[]{0x000000000C000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleForBody2650 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleForValue_in_ruleForBody2670 = new BitSet(new long[]{0x000000000C000040L});
    public static final BitSet FOLLOW_ruleForSource_in_ruleForBody2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForValue_in_entryRuleForValue2729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForValue2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleForValue2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForSource_in_entryRuleForSource2819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForSource2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOROF_in_ruleForSource2882 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2903 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_ruleForSource2921 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORIN_in_ruleForSource2969 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource2990 = new BitSet(new long[]{0x0000000010800002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_ruleForSource3009 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource3030 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_RULE_BY_in_ruleForSource3048 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BY_in_ruleForSource3096 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource3117 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_ruleForSource3135 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleForSource3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_entryRuleRange3199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRange3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleRange3275 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRange3295 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_RULE_DOT_DOT_in_ruleRange3307 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleRange3323 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleRange3346 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleRange3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment3392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignable_in_ruleAssignment3490 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleAssignment3509 = new BitSet(new long[]{0x9382BB04216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_RULE_COMPOUND_ASSIGN_in_ruleAssignment3529 = new BitSet(new long[]{0x9382BB04216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleAssigned_in_ruleAssignment3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOp_in_ruleAssignment3589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssigned_in_entryRuleAssigned3624 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssigned3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssigned3681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleAssigned3698 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssigned3719 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleAssigned3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignedClassDeclaration_in_ruleAssigned3757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOp_in_entryRuleLogicOp3792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOp3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompareOp_in_ruleLogicOp3849 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_RULE_LOGIC_in_ruleLogicOp3895 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleCompareOp_in_ruleLogicOp3923 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleCompareOp_in_entryRuleCompareOp3961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompareOp3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationOp_in_ruleCompareOp4018 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_ruleCompareOp4064 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleRelationOp_in_ruleCompareOp4092 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleRelationOp_in_entryRuleRelationOp4130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationOp4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShiftOp_in_ruleRelationOp4187 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_RULE_RELATION_in_ruleRelationOp4233 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleShiftOp_in_ruleRelationOp4261 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_ruleShiftOp_in_entryRuleShiftOp4299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShiftOp4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOp_in_ruleShiftOp4356 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_RULE_SHIFT_in_ruleShiftOp4402 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleAdditiveOp_in_ruleShiftOp4430 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_ruleAdditiveOp_in_entryRuleAdditiveOp4468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveOp4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathOp_in_ruleAdditiveOp4525 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleAdditiveOp4588 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleAdditiveOp4608 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleMathOp_in_ruleAdditiveOp4639 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_ruleMathOp_in_entryRuleMathOp4677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathOp4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleMathOp4734 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_RULE_MATH_in_ruleMathOp4780 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_ruleMathOp4808 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_entryRuleUnaryOp4846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryOp4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNARY_in_ruleUnaryOp4894 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_RULE_PLUS_in_ruleUnaryOp4910 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_RULE_MINUS_in_ruleUnaryOp4926 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleUnaryOp4948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PLUS_PLUS_in_ruleUnaryOp4967 = new BitSet(new long[]{0x0082000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_MINUS_MINUS_in_ruleUnaryOp4983 = new BitSet(new long[]{0x0082000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleUnaryOp5005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_ruleUnaryOp5034 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_RULE_QUESTION_in_ruleUnaryOp5045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleApplication_in_entryRuleApplication5083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleApplication5093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SUPER_in_ruleApplication5140 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_CALL_START_in_ruleApplication5151 = new BitSet(new long[]{0x9382BB04216DB680L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleArgList_in_ruleApplication5171 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CALL_END_in_ruleApplication5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleApplication5213 = new BitSet(new long[]{0x003D000000000022L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_ruleApplication5234 = new BitSet(new long[]{0x003D000000000022L});
    public static final BitSet FOLLOW_ruleFeatureCall_in_entryRuleFeatureCall5272 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureCall5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_ruleFeatureCall5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAccess_in_ruleFeatureCall5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionCall_in_entryRuleFunctionCall5391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionCall5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FUNC_EXIST_in_ruleFunctionCall5447 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_CALL_START_in_ruleFunctionCall5459 = new BitSet(new long[]{0x9382BB04216DB680L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleArgList_in_ruleFunctionCall5479 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_CALL_END_in_ruleFunctionCall5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAccess_in_entryRulePropertyAccess5525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyAccess5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPropertyAccess_in_rulePropertyAccess5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedPropertyAccess_in_rulePropertyAccess5609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisProperty_in_entryRuleThisProperty5644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThisProperty5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_SIGIL_in_ruleThisProperty5690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleId_in_ruleThisProperty5711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedPropertyAccess_in_entryRuleNamedPropertyAccess5746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedPropertyAccess5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleNamedPropertyAccess5801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_QUESTION_DOT_in_ruleNamedPropertyAccess5821 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleId_in_ruleNamedPropertyAccess5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOUBLE_COLON_in_ruleNamedPropertyAccess5875 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleId_in_ruleNamedPropertyAccess5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndexedPropertyAccess_in_entryRuleIndexedPropertyAccess5939 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndexedPropertyAccess5949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDEX_START_in_ruleIndexedPropertyAccess5985 = new BitSet(new long[]{0x9382BB00E16DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleIndex_in_ruleIndexedPropertyAccess6005 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RULE_INDEX_END_in_ruleIndexedPropertyAccess6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndex_in_entryRuleIndex6051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndex6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_DOT_in_ruleIndex6132 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleIndex6152 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIndex6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIndex6251 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_RULE_DOT_DOT_in_ruleIndex6270 = new BitSet(new long[]{0x9382BB00216DB282L,0x00000000000003F3L});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleIndex6290 = new BitSet(new long[]{0x9382BB00216DB282L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIndex6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIndex6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression6386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_rulePrimaryExpression6443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthetical_in_rulePrimaryExpression6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePrimaryExpression6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRange_in_rulePrimaryExpression6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rulePrimaryExpression6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_rulePrimaryExpression6621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLambda_in_rulePrimaryExpression6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThisProperty_in_rulePrimaryExpression6676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_THIS_in_rulePrimaryExpression6702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_rulePrimaryExpression6730 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleForBody_in_rulePrimaryExpression6750 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_rulePrimaryExpression6801 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression6821 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_RULE_WHEN_in_rulePrimaryExpression6833 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression6853 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNTIL_in_rulePrimaryExpression6906 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression6926 = new BitSet(new long[]{0x0000000400800000L});
    public static final BitSet FOLLOW_RULE_WHEN_in_rulePrimaryExpression6938 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression6958 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression6981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOOP_in_rulePrimaryExpression7011 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression7031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TRY_in_rulePrimaryExpression7061 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression7081 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_RULE_CATCH_in_rulePrimaryExpression7094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleId_in_rulePrimaryExpression7114 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression7135 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_rulePrimaryExpression7147 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FINALLY_in_rulePrimaryExpression7188 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SWITCH_in_rulePrimaryExpression7241 = new BitSet(new long[]{0x9382BB04216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression7261 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_INDENT_in_rulePrimaryExpression7273 = new BitSet(new long[]{0x6000000800000000L});
    public static final BitSet FOLLOW_ruleCase_in_rulePrimaryExpression7293 = new BitSet(new long[]{0x6000000800000000L});
    public static final BitSet FOLLOW_RULE_ELSE_in_rulePrimaryExpression7306 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_rulePrimaryExpression7326 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_rulePrimaryExpression7339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_rulePrimaryExpression7368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock7403 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleBlock7458 = new BitSet(new long[]{0x9382BB08216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleBody_in_ruleBlock7480 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleBlock7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCase_in_entryRuleCase7527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCase7537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEADING_WHEN_in_ruleCase7573 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCase7593 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleCase7605 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCase7625 = new BitSet(new long[]{0x0000000400000040L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCase7648 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleCase7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfExp_in_entryRuleIfExp7697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfExp7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp7753 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_ruleIfExp7765 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_ruleCondBlock_in_ruleIfExp7785 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_RULE_ELSE_in_ruleIfExp7799 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleIfExp7819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondBlock_in_entryRuleCondBlock7857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondBlock7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IF_in_ruleCondBlock7909 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCondBlock7935 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleCondBlock7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_entryRuleIdRef7992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdRef8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleIdRef8046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_entryRuleId8081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleId8091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENTIFIER_in_ruleId8132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty8172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProperty8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleProperty8274 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleProperty8292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_DOUBLE_COLON_in_ruleProperty8312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_QUESTION_DOT_in_ruleProperty8332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleId_in_ruleProperty8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_ruleProperty8404 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RULE_INDEX_START_in_ruleProperty8414 = new BitSet(new long[]{0x9382BB00E16DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleIndex_in_ruleProperty8436 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_RULE_INDEX_END_in_ruleProperty8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable8483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable8493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleVariable8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_AT_SIGIL_in_ruleVariable8558 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_THIS_in_ruleVariable8575 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariable8585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleId_in_ruleVariable8608 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_RULE_DOT_in_ruleVariable8619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleId_in_ruleVariable8639 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_ruleProperty_in_ruleVariable8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignableArray_in_entryRuleAssignableArray8705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignableArray8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleAssignableArray8757 = new BitSet(new long[]{0x0082000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAssignableArgList_in_ruleAssignableArray8779 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleAssignableArray8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignableArgList_in_entryRuleAssignableArgList8824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignableArgList8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignableArg_in_ruleAssignableArgList8880 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleAssignableArgList8892 = new BitSet(new long[]{0x0082000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAssignableArg_in_ruleAssignableArgList8912 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleAssignableArg_in_entryRuleAssignableArg8950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignableArg8960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignable_in_ruleAssignableArg9006 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleAssignableArg9023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignable_in_entryRuleAssignable9065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignable9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAssignable9122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_ruleAssignable9155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignableArray_in_ruleAssignable9189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_entryRuleArg9225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArg9235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArg9281 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleArg9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgLine_in_entryRuleArgLine9340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgLine9350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArg_in_ruleArgLine9396 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleArgLine9408 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleArg_in_ruleArgLine9428 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleArgLine9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitArgList_in_entryRuleExplicitArgList9479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitArgList9489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgLine_in_ruleExplicitArgList9535 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleExplicitArgList9548 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleArgLine_in_ruleExplicitArgList9568 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleExplicitArgList9587 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleArgLine_in_ruleExplicitArgList9607 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleExplicitArgList9618 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_ruleArgList_in_entryRuleArgList9656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgList9666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitArgList_in_ruleArgList9722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleArgList9740 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExplicitArgList_in_ruleArgList9760 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleArgList9771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray9809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray9819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_ruleArray9861 = new BitSet(new long[]{0x9382BB05216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleArgList_in_ruleArray9883 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_RULE_RBRACKET_in_ruleArray9893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictionary_in_entryRuleDictionary9928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictionary9938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_ruleDictionary9980 = new BitSet(new long[]{0x0000000400008000L,0x00000000000001E5L});
    public static final BitSet FOLLOW_ruleDictItems_in_ruleDictionary10002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_RULE_RCURLY_in_ruleDictionary10012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictItems_in_entryRuleDictItems10047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictItems10057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitDictItems_in_ruleDictItems10113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleDictItems10131 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001E1L});
    public static final BitSet FOLLOW_ruleExplicitDictItems_in_ruleDictItems10151 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleDictItems10162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExplicitDictItems_in_entryRuleExplicitDictItems10200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExplicitDictItems10210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictLine_in_ruleExplicitDictItems10256 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_RULE_TERMINATOR_in_ruleExplicitDictItems10269 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001E1L});
    public static final BitSet FOLLOW_ruleDictLine_in_ruleExplicitDictItems10289 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleExplicitDictItems10308 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001E1L});
    public static final BitSet FOLLOW_ruleDictLine_in_ruleExplicitDictItems10328 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleExplicitDictItems10339 = new BitSet(new long[]{0x0000000400000802L});
    public static final BitSet FOLLOW_ruleDictLine_in_entryRuleDictLine10377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictLine10387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictItem_in_ruleDictLine10433 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleDictLine10445 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001E1L});
    public static final BitSet FOLLOW_ruleDictItem_in_ruleDictLine10465 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleDictLine10479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictItem_in_entryRuleDictItem10516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictItem10526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictKey_in_ruleDictItem10581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_RULE_COLON_in_ruleDictItem10593 = new BitSet(new long[]{0x9382BB04216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDictItem10614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleDictItem10632 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleDictItem10652 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleDictItem10663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDictKey_in_entryRuleDictKey10702 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDictKey10712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleDictKey10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleDictKey10786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLambda_in_entryRuleLambda10821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLambda10831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PARAM_START_in_ruleLambda10868 = new BitSet(new long[]{0x0002000020000100L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleParam_in_ruleLambda10889 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_COMMA_in_ruleLambda10901 = new BitSet(new long[]{0x0002000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleParam_in_ruleLambda10921 = new BitSet(new long[]{0x0000000000000140L});
    public static final BitSet FOLLOW_RULE_PARAM_END_in_ruleLambda10936 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_FUNC_ARROW_in_ruleLambda10949 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_BOUND_FUNC_ARROW_in_ruleLambda10965 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleLambda10986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParam_in_entryRuleParam11022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParam11032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_ruleParam11080 = new BitSet(new long[]{0x0000000080004002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleParam11113 = new BitSet(new long[]{0x0000000080004002L});
    public static final BitSet FOLLOW_ruleDictionary_in_ruleParam11147 = new BitSet(new long[]{0x0000000080004002L});
    public static final BitSet FOLLOW_ruleThisProperty_in_ruleParam11175 = new BitSet(new long[]{0x0000000080004002L});
    public static final BitSet FOLLOW_RULE_ELLIPSIS_in_ruleParam11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_ruleParam11216 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParam11236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral11275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral11285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NUMBER_in_ruleNumberLiteral11330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral11365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral11375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_entryRuleBoolLiteral11455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolLiteral11465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleBoolLiteral11510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSLiteral_in_entryRuleJSLiteral11545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJSLiteral11555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_JS_in_ruleJSLiteral11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegexLiteral_in_entryRuleRegexLiteral11635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRegexLiteral11645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REGEX_in_ruleRegexLiteral11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral11725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral11735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteral11782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteral11809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolLiteral_in_ruleLiteral11836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJSLiteral_in_ruleLiteral11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRegexLiteral_in_ruleLiteral11890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthetical_in_entryRuleParenthetical11925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthetical11935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleParenthetical11983 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_INDENT_in_ruleParenthetical11993 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleBody_in_ruleParenthetical12015 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_RULE_OUTDENT_in_ruleParenthetical12026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleParenthetical12036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_ruleParenthetical12060 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleBody_in_ruleParenthetical12081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_RPAREN_in_ruleParenthetical12092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleId_in_synpred1_InternalCakefile767 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RULE_EQUAL_in_synpred1_InternalCakefile773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_synpred1_InternalCakefile775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POST_IF_in_synpred3_InternalCakefile2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOR_in_synpred4_InternalCakefile2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHILE_in_synpred5_InternalCakefile2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred6_InternalCakefile2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_UNTIL_in_synpred7_InternalCakefile2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred8_InternalCakefile2502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FOROF_in_synpred9_InternalCakefile2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred10_InternalCakefile2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FORIN_in_synpred11_InternalCakefile2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred12_InternalCakefile3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BY_in_synpred13_InternalCakefile3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BY_in_synpred14_InternalCakefile3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WHEN_in_synpred15_InternalCakefile3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignable_in_synpred17_InternalCakefile3444 = new BitSet(new long[]{0x0000000200004000L});
    public static final BitSet FOLLOW_set_in_synpred17_InternalCakefile3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOGIC_in_synpred18_InternalCakefile3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMPARE_in_synpred19_InternalCakefile4037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RELATION_in_synpred20_InternalCakefile4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SHIFT_in_synpred21_InternalCakefile4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred22_InternalCakefile4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MATH_in_synpred23_InternalCakefile4753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_synpred24_InternalCakefile6101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred25_InternalCakefile6205 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_synpred25_InternalCakefile6214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_synpred26_InternalCakefile6515 = new BitSet(new long[]{0x9382BB00216DB280L,0x00000000000003F3L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred26_InternalCakefile6520 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_set_in_synpred26_InternalCakefile6525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_synpred27_InternalCakefile6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_synpred28_InternalCakefile6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_synpred29_InternalCakefile8221 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_set_in_synpred29_InternalCakefile8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdRef_in_synpred30_InternalCakefile8384 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_RULE_INDEX_START_in_synpred30_InternalCakefile8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_synpred32_InternalCakefile9139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_synpred33_InternalCakefile9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LBRACKET_in_synpred36_InternalCakefile11097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LCURLY_in_synpred37_InternalCakefile11131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_synpred38_InternalCakefile11974 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_RULE_INDENT_in_synpred38_InternalCakefile11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LPAREN_in_synpred39_InternalCakefile12055 = new BitSet(new long[]{0x0000000000000002L});

}