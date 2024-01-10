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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Given'", "'{'", "'}'", "'When'", "'Then'", "'Precondition'", "':'", "'Event'", "'Postcondition'"
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
    public static final int RULE_ML_COMMENT=7;

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

                if ( (LA1_0==11||(LA1_0>=14 && LA1_0<=15)) ) {
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
    // InternalRgh.g:107:1: ruleSteps returns [EObject current=null] : (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen ) ;
    public final EObject ruleSteps() throws RecognitionException {
        EObject current = null;

        EObject this_Given_0 = null;

        EObject this_When_1 = null;

        EObject this_Then_2 = null;



        	enterRule();

        try {
            // InternalRgh.g:113:2: ( (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen ) )
            // InternalRgh.g:114:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen )
            {
            // InternalRgh.g:114:2: (this_Given_0= ruleGiven | this_When_1= ruleWhen | this_Then_2= ruleThen )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRgh.g:115:3: this_Given_0= ruleGiven
                    {

                    			newCompositeNode(grammarAccess.getStepsAccess().getGivenParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Given_0=ruleGiven();

                    state._fsp--;


                    			current = this_Given_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRgh.g:124:3: this_When_1= ruleWhen
                    {

                    			newCompositeNode(grammarAccess.getStepsAccess().getWhenParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_When_1=ruleWhen();

                    state._fsp--;


                    			current = this_When_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRgh.g:133:3: this_Then_2= ruleThen
                    {

                    			newCompositeNode(grammarAccess.getStepsAccess().getThenParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Then_2=ruleThen();

                    state._fsp--;


                    			current = this_Then_2;
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


    // $ANTLR start "entryRuleGiven"
    // InternalRgh.g:145:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalRgh.g:145:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalRgh.g:146:2: iv_ruleGiven= ruleGiven EOF
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
    // InternalRgh.g:152:1: ruleGiven returns [EObject current=null] : (otherlv_0= 'Given' otherlv_1= '{' ( (lv_preconditions_2_0= rulePrecondition ) )* otherlv_3= '}' ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_preconditions_2_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:158:2: ( (otherlv_0= 'Given' otherlv_1= '{' ( (lv_preconditions_2_0= rulePrecondition ) )* otherlv_3= '}' ) )
            // InternalRgh.g:159:2: (otherlv_0= 'Given' otherlv_1= '{' ( (lv_preconditions_2_0= rulePrecondition ) )* otherlv_3= '}' )
            {
            // InternalRgh.g:159:2: (otherlv_0= 'Given' otherlv_1= '{' ( (lv_preconditions_2_0= rulePrecondition ) )* otherlv_3= '}' )
            // InternalRgh.g:160:3: otherlv_0= 'Given' otherlv_1= '{' ( (lv_preconditions_2_0= rulePrecondition ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGivenAccess().getGivenKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRgh.g:168:3: ( (lv_preconditions_2_0= rulePrecondition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRgh.g:169:4: (lv_preconditions_2_0= rulePrecondition )
            	    {
            	    // InternalRgh.g:169:4: (lv_preconditions_2_0= rulePrecondition )
            	    // InternalRgh.g:170:5: lv_preconditions_2_0= rulePrecondition
            	    {

            	    					newCompositeNode(grammarAccess.getGivenAccess().getPreconditionsPreconditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_preconditions_2_0=rulePrecondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGivenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"preconditions",
            	    						lv_preconditions_2_0,
            	    						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Precondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGivenAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalRgh.g:195:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalRgh.g:195:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalRgh.g:196:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalRgh.g:202:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'When' otherlv_1= '{' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= '}' ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_events_2_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:208:2: ( (otherlv_0= 'When' otherlv_1= '{' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= '}' ) )
            // InternalRgh.g:209:2: (otherlv_0= 'When' otherlv_1= '{' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= '}' )
            {
            // InternalRgh.g:209:2: (otherlv_0= 'When' otherlv_1= '{' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= '}' )
            // InternalRgh.g:210:3: otherlv_0= 'When' otherlv_1= '{' ( (lv_events_2_0= ruleEvent ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRgh.g:218:3: ( (lv_events_2_0= ruleEvent ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRgh.g:219:4: (lv_events_2_0= ruleEvent )
            	    {
            	    // InternalRgh.g:219:4: (lv_events_2_0= ruleEvent )
            	    // InternalRgh.g:220:5: lv_events_2_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getWhenAccess().getEventsEventParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_events_2_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWhenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_2_0,
            	    						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getWhenAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalRgh.g:245:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalRgh.g:245:45: (iv_ruleThen= ruleThen EOF )
            // InternalRgh.g:246:2: iv_ruleThen= ruleThen EOF
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
    // InternalRgh.g:252:1: ruleThen returns [EObject current=null] : (otherlv_0= 'Then' otherlv_1= '{' ( (lv_postconditions_2_0= rulePostcondition ) )* otherlv_3= '}' ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_postconditions_2_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:258:2: ( (otherlv_0= 'Then' otherlv_1= '{' ( (lv_postconditions_2_0= rulePostcondition ) )* otherlv_3= '}' ) )
            // InternalRgh.g:259:2: (otherlv_0= 'Then' otherlv_1= '{' ( (lv_postconditions_2_0= rulePostcondition ) )* otherlv_3= '}' )
            {
            // InternalRgh.g:259:2: (otherlv_0= 'Then' otherlv_1= '{' ( (lv_postconditions_2_0= rulePostcondition ) )* otherlv_3= '}' )
            // InternalRgh.g:260:3: otherlv_0= 'Then' otherlv_1= '{' ( (lv_postconditions_2_0= rulePostcondition ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getThenAccess().getThenKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRgh.g:268:3: ( (lv_postconditions_2_0= rulePostcondition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRgh.g:269:4: (lv_postconditions_2_0= rulePostcondition )
            	    {
            	    // InternalRgh.g:269:4: (lv_postconditions_2_0= rulePostcondition )
            	    // InternalRgh.g:270:5: lv_postconditions_2_0= rulePostcondition
            	    {

            	    					newCompositeNode(grammarAccess.getThenAccess().getPostconditionsPostconditionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_postconditions_2_0=rulePostcondition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getThenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"postconditions",
            	    						lv_postconditions_2_0,
            	    						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Postcondition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getThenAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalRgh.g:295:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalRgh.g:295:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalRgh.g:296:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalRgh.g:302:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'Precondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:308:2: ( (otherlv_0= 'Precondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalRgh.g:309:2: (otherlv_0= 'Precondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalRgh.g:309:2: (otherlv_0= 'Precondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            // InternalRgh.g:310:3: otherlv_0= 'Precondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPreconditionKeyword_0());
            		
            // InternalRgh.g:314:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:315:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:315:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:316:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPreconditionAccess().getColonKeyword_2());
            		
            // InternalRgh.g:336:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalRgh.g:337:4: (lv_description_3_0= ruleDescription )
            {
            // InternalRgh.g:337:4: (lv_description_3_0= ruleDescription )
            // InternalRgh.g:338:5: lv_description_3_0= ruleDescription
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
    // InternalRgh.g:359:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalRgh.g:359:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalRgh.g:360:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalRgh.g:366:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:372:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalRgh.g:373:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalRgh.g:373:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            // InternalRgh.g:374:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalRgh.g:378:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:379:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:379:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:380:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getColonKeyword_2());
            		
            // InternalRgh.g:400:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalRgh.g:401:4: (lv_description_3_0= ruleDescription )
            {
            // InternalRgh.g:401:4: (lv_description_3_0= ruleDescription )
            // InternalRgh.g:402:5: lv_description_3_0= ruleDescription
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
    // InternalRgh.g:423:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalRgh.g:423:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalRgh.g:424:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalRgh.g:430:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'Postcondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:436:2: ( (otherlv_0= 'Postcondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalRgh.g:437:2: (otherlv_0= 'Postcondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalRgh.g:437:2: (otherlv_0= 'Postcondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            // InternalRgh.g:438:3: otherlv_0= 'Postcondition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostconditionKeyword_0());
            		
            // InternalRgh.g:442:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:443:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:443:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:444:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getColonKeyword_2());
            		
            // InternalRgh.g:464:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalRgh.g:465:4: (lv_description_3_0= ruleDescription )
            {
            // InternalRgh.g:465:4: (lv_description_3_0= ruleDescription )
            // InternalRgh.g:466:5: lv_description_3_0= ruleDescription
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
    // InternalRgh.g:487:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalRgh.g:487:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalRgh.g:488:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalRgh.g:494:1: ruleDescription returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRgh.g:500:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRgh.g:501:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRgh.g:501:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRgh.g:502:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalRgh.g:502:3: (lv_value_0_0= RULE_STRING )
            // InternalRgh.g:503:4: lv_value_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000042000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});

}