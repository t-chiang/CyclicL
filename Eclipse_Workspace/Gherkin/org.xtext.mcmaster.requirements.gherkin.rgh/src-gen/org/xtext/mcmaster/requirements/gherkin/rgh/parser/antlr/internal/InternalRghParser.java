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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Check'", "'{'", "'}'", "'exists'", "'Feature'", "'Given'", "'When'", "'Then'", "'Precond'", "':'", "'Event'", "'Postcond'"
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

                if ( (LA1_0==11||(LA1_0>=16 && LA1_0<=18)) ) {
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
            case 11:
                {
                alt2=1;
                }
                break;
            case 16:
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
    // InternalRgh.g:161:1: ruleContext returns [EObject current=null] : ( () otherlv_1= 'Check' otherlv_2= '{' ( (lv_feature_3_0= ruleFeature ) )* otherlv_4= '}' otherlv_5= 'exists' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_feature_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:167:2: ( ( () otherlv_1= 'Check' otherlv_2= '{' ( (lv_feature_3_0= ruleFeature ) )* otherlv_4= '}' otherlv_5= 'exists' ) )
            // InternalRgh.g:168:2: ( () otherlv_1= 'Check' otherlv_2= '{' ( (lv_feature_3_0= ruleFeature ) )* otherlv_4= '}' otherlv_5= 'exists' )
            {
            // InternalRgh.g:168:2: ( () otherlv_1= 'Check' otherlv_2= '{' ( (lv_feature_3_0= ruleFeature ) )* otherlv_4= '}' otherlv_5= 'exists' )
            // InternalRgh.g:169:3: () otherlv_1= 'Check' otherlv_2= '{' ( (lv_feature_3_0= ruleFeature ) )* otherlv_4= '}' otherlv_5= 'exists'
            {
            // InternalRgh.g:169:3: ()
            // InternalRgh.g:170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContextAccess().getContextAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getCheckKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRgh.g:184:3: ( (lv_feature_3_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRgh.g:185:4: (lv_feature_3_0= ruleFeature )
            	    {
            	    // InternalRgh.g:185:4: (lv_feature_3_0= ruleFeature )
            	    // InternalRgh.g:186:5: lv_feature_3_0= ruleFeature
            	    {

            	    					newCompositeNode(grammarAccess.getContextAccess().getFeatureFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_feature_3_0=ruleFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextRule());
            	    					}
            	    					add(
            	    						current,
            	    						"feature",
            	    						lv_feature_3_0,
            	    						"org.xtext.mcmaster.requirements.gherkin.rgh.Rgh.Feature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContextAccess().getExistsKeyword_5());
            		

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


    // $ANTLR start "entryRuleFeature"
    // InternalRgh.g:215:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalRgh.g:215:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalRgh.g:216:2: iv_ruleFeature= ruleFeature EOF
            {
             newCompositeNode(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalRgh.g:222:1: ruleFeature returns [EObject current=null] : (otherlv_0= 'Feature' ( (lv_name_1_0= ruleDescription ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:228:2: ( (otherlv_0= 'Feature' ( (lv_name_1_0= ruleDescription ) ) ) )
            // InternalRgh.g:229:2: (otherlv_0= 'Feature' ( (lv_name_1_0= ruleDescription ) ) )
            {
            // InternalRgh.g:229:2: (otherlv_0= 'Feature' ( (lv_name_1_0= ruleDescription ) ) )
            // InternalRgh.g:230:3: otherlv_0= 'Feature' ( (lv_name_1_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getFeatureAccess().getFeatureKeyword_0());
            		
            // InternalRgh.g:234:3: ( (lv_name_1_0= ruleDescription ) )
            // InternalRgh.g:235:4: (lv_name_1_0= ruleDescription )
            {
            // InternalRgh.g:235:4: (lv_name_1_0= ruleDescription )
            // InternalRgh.g:236:5: lv_name_1_0= ruleDescription
            {

            					newCompositeNode(grammarAccess.getFeatureAccess().getNameDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFeatureRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleGiven"
    // InternalRgh.g:257:1: entryRuleGiven returns [EObject current=null] : iv_ruleGiven= ruleGiven EOF ;
    public final EObject entryRuleGiven() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGiven = null;


        try {
            // InternalRgh.g:257:46: (iv_ruleGiven= ruleGiven EOF )
            // InternalRgh.g:258:2: iv_ruleGiven= ruleGiven EOF
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
    // InternalRgh.g:264:1: ruleGiven returns [EObject current=null] : ( () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}' ) ;
    public final EObject ruleGiven() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_preconditions_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:270:2: ( ( () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}' ) )
            // InternalRgh.g:271:2: ( () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}' )
            {
            // InternalRgh.g:271:2: ( () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}' )
            // InternalRgh.g:272:3: () otherlv_1= 'Given' otherlv_2= '{' ( (lv_preconditions_3_0= rulePrecondition ) )* otherlv_4= '}'
            {
            // InternalRgh.g:272:3: ()
            // InternalRgh.g:273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGivenAccess().getGivenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getGivenAccess().getGivenKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGivenAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRgh.g:287:3: ( (lv_preconditions_3_0= rulePrecondition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRgh.g:288:4: (lv_preconditions_3_0= rulePrecondition )
            	    {
            	    // InternalRgh.g:288:4: (lv_preconditions_3_0= rulePrecondition )
            	    // InternalRgh.g:289:5: lv_preconditions_3_0= rulePrecondition
            	    {

            	    					newCompositeNode(grammarAccess.getGivenAccess().getPreconditionsPreconditionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
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
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalRgh.g:314:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalRgh.g:314:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalRgh.g:315:2: iv_ruleWhen= ruleWhen EOF
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
    // InternalRgh.g:321:1: ruleWhen returns [EObject current=null] : ( () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_events_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:327:2: ( ( () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' ) )
            // InternalRgh.g:328:2: ( () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            {
            // InternalRgh.g:328:2: ( () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}' )
            // InternalRgh.g:329:3: () otherlv_1= 'When' otherlv_2= '{' ( (lv_events_3_0= ruleEvent ) )* otherlv_4= '}'
            {
            // InternalRgh.g:329:3: ()
            // InternalRgh.g:330:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWhenAccess().getWhenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getWhenAccess().getWhenKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getWhenAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRgh.g:344:3: ( (lv_events_3_0= ruleEvent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRgh.g:345:4: (lv_events_3_0= ruleEvent )
            	    {
            	    // InternalRgh.g:345:4: (lv_events_3_0= ruleEvent )
            	    // InternalRgh.g:346:5: lv_events_3_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getWhenAccess().getEventsEventParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
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
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalRgh.g:371:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalRgh.g:371:45: (iv_ruleThen= ruleThen EOF )
            // InternalRgh.g:372:2: iv_ruleThen= ruleThen EOF
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
    // InternalRgh.g:378:1: ruleThen returns [EObject current=null] : ( () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}' ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_postconditions_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:384:2: ( ( () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}' ) )
            // InternalRgh.g:385:2: ( () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}' )
            {
            // InternalRgh.g:385:2: ( () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}' )
            // InternalRgh.g:386:3: () otherlv_1= 'Then' otherlv_2= '{' ( (lv_postconditions_3_0= rulePostcondition ) )* otherlv_4= '}'
            {
            // InternalRgh.g:386:3: ()
            // InternalRgh.g:387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThenAccess().getThenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getThenAccess().getThenKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getThenAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRgh.g:401:3: ( (lv_postconditions_3_0= rulePostcondition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRgh.g:402:4: (lv_postconditions_3_0= rulePostcondition )
            	    {
            	    // InternalRgh.g:402:4: (lv_postconditions_3_0= rulePostcondition )
            	    // InternalRgh.g:403:5: lv_postconditions_3_0= rulePostcondition
            	    {

            	    					newCompositeNode(grammarAccess.getThenAccess().getPostconditionsPostconditionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
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
            	    break loop6;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalRgh.g:428:1: entryRulePrecondition returns [EObject current=null] : iv_rulePrecondition= rulePrecondition EOF ;
    public final EObject entryRulePrecondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrecondition = null;


        try {
            // InternalRgh.g:428:53: (iv_rulePrecondition= rulePrecondition EOF )
            // InternalRgh.g:429:2: iv_rulePrecondition= rulePrecondition EOF
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
    // InternalRgh.g:435:1: rulePrecondition returns [EObject current=null] : (otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject rulePrecondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:441:2: ( (otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalRgh.g:442:2: (otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalRgh.g:442:2: (otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            // InternalRgh.g:443:3: otherlv_0= 'Precond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPreconditionAccess().getPrecondKeyword_0());
            		
            // InternalRgh.g:447:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:448:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:448:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:449:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPreconditionAccess().getColonKeyword_2());
            		
            // InternalRgh.g:469:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalRgh.g:470:4: (lv_description_3_0= ruleDescription )
            {
            // InternalRgh.g:470:4: (lv_description_3_0= ruleDescription )
            // InternalRgh.g:471:5: lv_description_3_0= ruleDescription
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
    // InternalRgh.g:492:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalRgh.g:492:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalRgh.g:493:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalRgh.g:499:1: ruleEvent returns [EObject current=null] : (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:505:2: ( (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalRgh.g:506:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalRgh.g:506:2: (otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            // InternalRgh.g:507:3: otherlv_0= 'Event' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getEventAccess().getEventKeyword_0());
            		
            // InternalRgh.g:511:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:512:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:512:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:513:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getEventAccess().getColonKeyword_2());
            		
            // InternalRgh.g:533:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalRgh.g:534:4: (lv_description_3_0= ruleDescription )
            {
            // InternalRgh.g:534:4: (lv_description_3_0= ruleDescription )
            // InternalRgh.g:535:5: lv_description_3_0= ruleDescription
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
    // InternalRgh.g:556:1: entryRulePostcondition returns [EObject current=null] : iv_rulePostcondition= rulePostcondition EOF ;
    public final EObject entryRulePostcondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostcondition = null;


        try {
            // InternalRgh.g:556:54: (iv_rulePostcondition= rulePostcondition EOF )
            // InternalRgh.g:557:2: iv_rulePostcondition= rulePostcondition EOF
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
    // InternalRgh.g:563:1: rulePostcondition returns [EObject current=null] : (otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) ;
    public final EObject rulePostcondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_description_3_0 = null;



        	enterRule();

        try {
            // InternalRgh.g:569:2: ( (otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) ) )
            // InternalRgh.g:570:2: (otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            {
            // InternalRgh.g:570:2: (otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) ) )
            // InternalRgh.g:571:3: otherlv_0= 'Postcond' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_description_3_0= ruleDescription ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getPostconditionAccess().getPostcondKeyword_0());
            		
            // InternalRgh.g:575:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRgh.g:576:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRgh.g:576:4: (lv_name_1_0= RULE_ID )
            // InternalRgh.g:577:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPostconditionAccess().getColonKeyword_2());
            		
            // InternalRgh.g:597:3: ( (lv_description_3_0= ruleDescription ) )
            // InternalRgh.g:598:4: (lv_description_3_0= ruleDescription )
            {
            // InternalRgh.g:598:4: (lv_description_3_0= ruleDescription )
            // InternalRgh.g:599:5: lv_description_3_0= ruleDescription
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
    // InternalRgh.g:620:1: entryRuleDescription returns [EObject current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final EObject entryRuleDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescription = null;


        try {
            // InternalRgh.g:620:52: (iv_ruleDescription= ruleDescription EOF )
            // InternalRgh.g:621:2: iv_ruleDescription= ruleDescription EOF
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
    // InternalRgh.g:627:1: ruleDescription returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleDescription() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRgh.g:633:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalRgh.g:634:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalRgh.g:634:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalRgh.g:635:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalRgh.g:635:3: (lv_value_0_0= RULE_STRING )
            // InternalRgh.g:636:4: lv_value_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000070802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});

}