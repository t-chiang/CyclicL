package org.xtext.mcmaster.requirements.gherkin.rgh.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.mcmaster.requirements.gherkin.rgh.services.RghGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRghParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'Module'", "'Operation'", "'Given'", "'{'", "'}'", "'When'", "'Then'", "'Precond'", "':'", "'Event'", "'Postcond'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRghParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRghParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRghParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRgh.g"; }



     	private RghGrammarAccess grammarAccess;

        public InternalRghParser(TokenStream input, RghGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RghGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRgh.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRgh.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalRgh.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRgh.g:71:1: ruleModel returns [EObject current=null] : ( (lv_requirement_0_0= ruleSteps ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_requirement_0_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:77:2: ( ( (lv_requirement_0_0= ruleSteps ) )* )
            // InternalRgh.g:78:2: ( (lv_requirement_0_0= ruleSteps ) )*
            {
            // InternalRgh.g:78:2: ( (lv_requirement_0_0= ruleSteps ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=14)||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRgh.g:79:3: (lv_requirement_0_0= ruleSteps )
            	    {
            	    // InternalRgh.g:79:3: (lv_requirement_0_0= ruleSteps )
            	    // InternalRgh.g:80:4: lv_requirement_0_0= ruleSteps
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getRequirementStepsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_requirement_0_0=ruleSteps();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"requirement",
            	    					lv_requirement_0_0,
            	    					"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Steps");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSteps"
    // InternalRgh.g:100:1: entryRuleSteps returns [EObject current=null] : iv_ruleSteps= ruleSteps EOF ;
    public final EObject entryRuleSteps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSteps = null;


        try {
            // InternalRgh.g:100:46: (iv_ruleSteps= ruleSteps EOF )
            // InternalRgh.g:101:2: iv_ruleSteps= ruleSteps EOF
            {
             newCompositeNode(grammarAccess.getStepsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSteps=ruleSteps();

            state._fsp--;

             current =iv_ruleSteps; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSteps"


    // $ANTLR start "ruleSteps"
    // InternalRgh.g:107:1: ruleSteps returns [EObject current=null] : (this_Context_0= ruleContext | this_Given_1= ruleGiven | this_When_2= ruleWhen | this_Then_3= ruleThen ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        EObject this_Context_0 = null;

        EObject this_Given_1 = null;

        EObject this_When_2 = null;

        EObject this_Then_3 = null;



        	enterRule();

        try {
            // InternalRgh.g:113:2: ( (this_Context_0= ruleContext | this_Given_1= ruleGiven | this_When_2= ruleWhen | this_Then_3= ruleThen ) )
            // InternalRgh.g:114:2: (this_Context_0= ruleContext | this_Given_1= ruleGiven | this_When_2= ruleWhen | this_Then_3= ruleThen )
            {
            // InternalRgh.g:114:2: (this_Context_0= ruleContext | this_Given_1= ruleGiven | this_When_2= ruleWhen | this_Then_3= ruleThen )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRgh.g:115:3: this_Context_0= ruleContext
                    {

                    			newCompositeNode(grammarAccess.getStepsAccess().getContextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Context_0=ruleContext();

                    state._fsp--;


                    			current = this_Context_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRgh.g:124:3: this_Given_1= ruleGiven
                    {

                    			newCompositeNode(grammarAccess.getStepsAccess().getGivenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Given_1=ruleGiven();

                    state._fsp--;


                    			current = this_Given_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRgh.g:133:3: this_When_2= ruleWhen
                    {

                    			newCompositeNode(grammarAccess.getStepsAccess().getWhenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_When_2=ruleWhen();

                    state._fsp--;


                    			current = this_When_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRgh.g:142:3: this_Then_3= ruleThen
                    {

                    			newCompositeNode(grammarAccess.getStepsAccess().getThenParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Then_3=ruleThen();

                    state._fsp--;


                    			current = this_Then_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSteps"


    // $ANTLR start "entryRuleContext"
    // InternalRgh.g:154:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalRgh.g:154:48: (iv_ruleContext= ruleContext EOF )
            // InternalRgh.g:155:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalRgh.g:161:1: ruleContext returns [EObject current=null] : (this_Module_0= ruleModule | this_Operation_1= ruleOperation ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        EObject this_Module_0 = null;

        EObject this_Operation_1 = null;



        	enterRule();

        try {
            // InternalRgh.g:167:2: ( (this_Module_0= ruleModule | this_Operation_1= ruleOperation ) )
            // InternalRgh.g:168:2: (this_Module_0= ruleModule | this_Operation_1= ruleOperation )
            {
            // InternalRgh.g:168:2: (this_Module_0= ruleModule | this_Operation_1= ruleOperation )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            else if ( (LA3_0==13) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRgh.g:169:3: this_Module_0= ruleModule
                    {

                    			newCompositeNode(grammarAccess.getContextAccess().getModuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Module_0=ruleModule();

                    state._fsp--;


                    			current = this_Module_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRgh.g:178:3: this_Operation_1= ruleOperation
                    {

                    			newCompositeNode(grammarAccess.getContextAccess().getOperationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Operation_1=ruleOperation();

                    state._fsp--;


                    			current = this_Operation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalRgh.g:190:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRgh.g:190:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRgh.g:191:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalRgh.g:197:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRgh.g:203:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRgh.g:204:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRgh.g:204:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRgh.g:205:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRgh.g:212:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRgh.g:213:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,11,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleModule"
    // InternalRgh.g:230:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalRgh.g:230:47: (iv_ruleModule= ruleModule EOF )
            // InternalRgh.g:231:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalRgh.g:237:1: ruleModule returns [EObject current=null] : (otherlv_0= 'Module' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalRgh.g:243:2: ( (otherlv_0= 'Module' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalRgh.g:244:2: (otherlv_0= 'Module' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalRgh.g:244:2: (otherlv_0= 'Module' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalRgh.g:245:3: otherlv_0= 'Module' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalRgh.g:249:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:250:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:250:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:251:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleOperation"
    // InternalRgh.g:271:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalRgh.g:271:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalRgh.g:272:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalRgh.g:278:1: ruleOperation returns [EObject current=null] : (otherlv_0= 'Operation' ( (lv_name_1_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:284:2: ( (otherlv_0= 'Operation' ( (lv_name_1_0= ruleQualifiedName ) ) ) )
            // InternalRgh.g:285:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleQualifiedName ) ) )
            {
            // InternalRgh.g:285:2: (otherlv_0= 'Operation' ( (lv_name_1_0= ruleQualifiedName ) ) )
            // InternalRgh.g:286:3: otherlv_0= 'Operation' ( (lv_name_1_0= ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOperationAccess().getOperationKeyword_0());
            		
            // InternalRgh.g:290:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalRgh.g:291:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalRgh.g:291:4: (lv_name_1_0= ruleQualifiedName )
            // InternalRgh.g:292:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleGiven"
    // InternalRgh.g:313:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalRgh.g:313:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalRgh.g:314:2: iv_ruleGiven= ruleGiven EOF
            {
             newCompositeNode(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGiven=ruleGiven();

            state._fsp--;

             current =iv_ruleGiven; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalRgh.g:320:1: ruleGiven returns [EObject current=null] : ( () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}' ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_preconditions_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:326:2: ( ( () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}' ) )
            // InternalRgh.g:327:2: ( () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}' )
            {
            // InternalRgh.g:327:2: ( () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}' )
            // InternalRgh.g:328:3: () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}'
            {
            // InternalRgh.g:328:3: ()
            // InternalRgh.g:329:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGivenAccess().getGivenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getGivenKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGivenAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRgh.g:343:3: ( (lv_preconditions_3_0= rulePrecondition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRgh.g:344:4: (lv_preconditions_3_0= rulePrecondition )
            	    {
            	    // InternalRgh.g:344:4: (lv_preconditions_3_0= rulePrecondition )
            	    // InternalRgh.g:345:5: lv_preconditions_3_0= rulePrecondition
            	    {

            	    					newCompositeNode(grammarAccess.getGivenAccess().getPreconditionsPreconditionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_preconditions_3_0=rulePrecondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGivenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"preconditions",
            	    						lv_preconditions_3_0,
            	    						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Precondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGivenAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleWhen"
    // InternalRgh.g:370:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalRgh.g:370:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalRgh.g:371:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalRgh.g:377:1: ruleWhen returns [EObject current=null] : ( () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_events_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:383:2: ( ( () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) )
            // InternalRgh.g:384:2: ( () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            {
            // InternalRgh.g:384:2: ( () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            // InternalRgh.g:385:3: () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}'
            {
            // InternalRgh.g:385:3: ()
            // InternalRgh.g:386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhenAccess().getWhenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getWhenAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRgh.g:400:3: ( (lv_events_3_0= ruleEvent ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRgh.g:401:4: (lv_events_3_0= ruleEvent )
            	    {
            	    // InternalRgh.g:401:4: (lv_events_3_0= ruleEvent )
            	    // InternalRgh.g:402:5: lv_events_3_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getWhenAccess().getEventsEventParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_events_3_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_3_0,
            	    						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWhenAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleThen"
    // InternalRgh.g:427:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalRgh.g:427:45: (iv_ruleThen= ruleThen EOF )
            // InternalRgh.g:428:2: iv_ruleThen= ruleThen EOF
            {
             newCompositeNode(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen=ruleThen();

            state._fsp--;

             current =iv_ruleThen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalRgh.g:434:1: ruleThen returns [EObject current=null] : ( () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}' ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_postconditions_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:440:2: ( ( () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}' ) )
            // InternalRgh.g:441:2: ( () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}' )
            {
            // InternalRgh.g:441:2: ( () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}' )
            // InternalRgh.g:442:3: () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}'
            {
            // InternalRgh.g:442:3: ()
            // InternalRgh.g:443:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThenAccess().getThenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getThenKeyword_1());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getThenAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRgh.g:457:3: ( (lv_postconditions_3_0= rulePostcondition ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRgh.g:458:4: (lv_postconditions_3_0= rulePostcondition )
            	    {
            	    // InternalRgh.g:458:4: (lv_postconditions_3_0= rulePostcondition )
            	    // InternalRgh.g:459:5: lv_postconditions_3_0= rulePostcondition
            	    {

            	    					newCompositeNode(grammarAccess.getThenAccess().getPostconditionsPostconditionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_postconditions_3_0=rulePostcondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getThenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"postconditions",
            	    						lv_postconditions_3_0,
            	    						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Postcondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getThenAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRulePrecondition"
    // InternalRgh.g:484:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalRgh.g:484:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalRgh.g:485:2: iv_rulePrecondition= rulePrecondition EOF
            {
             newCompositeNode(grammarAccess.getPreconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrecondition=rulePrecondition();

            state._fsp--;

             current =iv_rulePrecondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrecondition"


    // $ANTLR start "rulePrecondition"
    // InternalRgh.g:491:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:497:2: ( (otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalRgh.g:498:2: (otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalRgh.g:498:2: (otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            // InternalRgh.g:499:3: otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPrecondKeyword_0());
            		
            // InternalRgh.g:503:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:504:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:504:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:505:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPreconditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreconditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPreconditionAccess().getColonKeyword_2());
            		
            // InternalRgh.g:525:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalRgh.g:526:4: (lv_description_3_0= ruleDescription )
            {
            // InternalRgh.g:526:4: (lv_description_3_0= ruleDescription )
            // InternalRgh.g:527:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getPreconditionAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreconditionRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrecondition"


    // $ANTLR start "entryRuleEvent"
    // InternalRgh.g:548:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalRgh.g:548:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalRgh.g:549:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalRgh.g:555:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:561:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalRgh.g:562:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalRgh.g:562:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            // InternalRgh.g:563:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalRgh.g:567:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:568:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:568:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:569:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getColonKeyword_2());
            		
            // InternalRgh.g:589:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalRgh.g:590:4: (lv_description_3_0= ruleDescription )
            {
            // InternalRgh.g:590:4: (lv_description_3_0= ruleDescription )
            // InternalRgh.g:591:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getEventAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRulePostcondition"
    // InternalRgh.g:612:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalRgh.g:612:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalRgh.g:613:2: iv_rulePostcondition= rulePostcondition EOF
            {
             newCompositeNode(grammarAccess.getPostconditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePostcondition=rulePostcondition();

            state._fsp--;

             current =iv_rulePostcondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostcondition"


    // $ANTLR start "rulePostcondition"
    // InternalRgh.g:619:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:625:2: ( (otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalRgh.g:626:2: (otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalRgh.g:626:2: (otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            // InternalRgh.g:627:3: otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostcondKeyword_0());
            		
            // InternalRgh.g:631:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:632:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:632:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:633:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPostconditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPostconditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getColonKeyword_2());
            		
            // InternalRgh.g:653:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalRgh.g:654:4: (lv_description_3_0= ruleDescription )
            {
            // InternalRgh.g:654:4: (lv_description_3_0= ruleDescription )
            // InternalRgh.g:655:5: lv_description_3_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getPostconditionAccess().getDescriptionDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_3_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPostconditionRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Description");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostcondition"


    // $ANTLR start "entryRuleDescription"
    // InternalRgh.g:676:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalRgh.g:676:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalRgh.g:677:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // InternalRgh.g:683:1: ruleDescription returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRgh.g:689:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRgh.g:690:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRgh.g:690:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRgh.g:691:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalRgh.g:691:3: (lv_value_0_0= RULE_STRING )
            // InternalRgh.g:692:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDescriptionAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDescriptionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000067002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});

}