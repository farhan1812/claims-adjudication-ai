package org.farhan.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.farhan.services.CucumberGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCucumberParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WORD", "RULE_ID", "RULE_STRING", "RULE_EOL", "RULE_WS", "RULE_SL_COMMENT", "'Object:'", "'Definition:'", "'Parameters:'", "'Feature:'", "'Background:'", "'Scenario:'", "'Scenario Outline:'", "'Examples:'", "'|'", "'\"\"\"'", "'Given'", "'When'", "'Then'", "'And'", "'But'", "'*'", "'@'"
    };
    public static final int RULE_WORD=4;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
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
    public static final int T__10=10;
    public static final int RULE_ID=5;
    public static final int RULE_EOL=7;
    public static final int RULE_WS=8;
    public static final int T__26=26;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCucumberParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCucumberParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCucumberParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCucumber.g"; }


    	private CucumberGrammarAccess grammarAccess;

    	public void setGrammarAccess(CucumberGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalCucumber.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalCucumber.g:54:1: ( ruleModel EOF )
            // InternalCucumber.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCucumber.g:62:1: ruleModel : ( ( rule__Model__Alternatives ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:66:2: ( ( ( rule__Model__Alternatives ) ) )
            // InternalCucumber.g:67:2: ( ( rule__Model__Alternatives ) )
            {
            // InternalCucumber.g:67:2: ( ( rule__Model__Alternatives ) )
            // InternalCucumber.g:68:3: ( rule__Model__Alternatives )
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // InternalCucumber.g:69:3: ( rule__Model__Alternatives )
            // InternalCucumber.g:69:4: rule__Model__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Model__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStepObject"
    // InternalCucumber.g:78:1: entryRuleStepObject : ruleStepObject EOF ;
    public final void entryRuleStepObject() throws RecognitionException {
        try {
            // InternalCucumber.g:79:1: ( ruleStepObject EOF )
            // InternalCucumber.g:80:1: ruleStepObject EOF
            {
             before(grammarAccess.getStepObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleStepObject();

            state._fsp--;

             after(grammarAccess.getStepObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepObject"


    // $ANTLR start "ruleStepObject"
    // InternalCucumber.g:87:1: ruleStepObject : ( ( rule__StepObject__Group__0 ) ) ;
    public final void ruleStepObject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:91:2: ( ( ( rule__StepObject__Group__0 ) ) )
            // InternalCucumber.g:92:2: ( ( rule__StepObject__Group__0 ) )
            {
            // InternalCucumber.g:92:2: ( ( rule__StepObject__Group__0 ) )
            // InternalCucumber.g:93:3: ( rule__StepObject__Group__0 )
            {
             before(grammarAccess.getStepObjectAccess().getGroup()); 
            // InternalCucumber.g:94:3: ( rule__StepObject__Group__0 )
            // InternalCucumber.g:94:4: rule__StepObject__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepObject__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepObject"


    // $ANTLR start "entryRuleStepDefinition"
    // InternalCucumber.g:103:1: entryRuleStepDefinition : ruleStepDefinition EOF ;
    public final void entryRuleStepDefinition() throws RecognitionException {
        try {
            // InternalCucumber.g:104:1: ( ruleStepDefinition EOF )
            // InternalCucumber.g:105:1: ruleStepDefinition EOF
            {
             before(grammarAccess.getStepDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleStepDefinition();

            state._fsp--;

             after(grammarAccess.getStepDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepDefinition"


    // $ANTLR start "ruleStepDefinition"
    // InternalCucumber.g:112:1: ruleStepDefinition : ( ( rule__StepDefinition__Group__0 ) ) ;
    public final void ruleStepDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:116:2: ( ( ( rule__StepDefinition__Group__0 ) ) )
            // InternalCucumber.g:117:2: ( ( rule__StepDefinition__Group__0 ) )
            {
            // InternalCucumber.g:117:2: ( ( rule__StepDefinition__Group__0 ) )
            // InternalCucumber.g:118:3: ( rule__StepDefinition__Group__0 )
            {
             before(grammarAccess.getStepDefinitionAccess().getGroup()); 
            // InternalCucumber.g:119:3: ( rule__StepDefinition__Group__0 )
            // InternalCucumber.g:119:4: rule__StepDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepDefinition"


    // $ANTLR start "entryRuleStepParameters"
    // InternalCucumber.g:128:1: entryRuleStepParameters : ruleStepParameters EOF ;
    public final void entryRuleStepParameters() throws RecognitionException {
        try {
            // InternalCucumber.g:129:1: ( ruleStepParameters EOF )
            // InternalCucumber.g:130:1: ruleStepParameters EOF
            {
             before(grammarAccess.getStepParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleStepParameters();

            state._fsp--;

             after(grammarAccess.getStepParametersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepParameters"


    // $ANTLR start "ruleStepParameters"
    // InternalCucumber.g:137:1: ruleStepParameters : ( ( rule__StepParameters__Group__0 ) ) ;
    public final void ruleStepParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:141:2: ( ( ( rule__StepParameters__Group__0 ) ) )
            // InternalCucumber.g:142:2: ( ( rule__StepParameters__Group__0 ) )
            {
            // InternalCucumber.g:142:2: ( ( rule__StepParameters__Group__0 ) )
            // InternalCucumber.g:143:3: ( rule__StepParameters__Group__0 )
            {
             before(grammarAccess.getStepParametersAccess().getGroup()); 
            // InternalCucumber.g:144:3: ( rule__StepParameters__Group__0 )
            // InternalCucumber.g:144:4: rule__StepParameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStepParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepParameters"


    // $ANTLR start "entryRuleParametersTable"
    // InternalCucumber.g:153:1: entryRuleParametersTable : ruleParametersTable EOF ;
    public final void entryRuleParametersTable() throws RecognitionException {
        try {
            // InternalCucumber.g:154:1: ( ruleParametersTable EOF )
            // InternalCucumber.g:155:1: ruleParametersTable EOF
            {
             before(grammarAccess.getParametersTableRule()); 
            pushFollow(FOLLOW_1);
            ruleParametersTable();

            state._fsp--;

             after(grammarAccess.getParametersTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametersTable"


    // $ANTLR start "ruleParametersTable"
    // InternalCucumber.g:162:1: ruleParametersTable : ( ( ( rule__ParametersTable__RowsAssignment ) ) ( ( rule__ParametersTable__RowsAssignment )* ) ) ;
    public final void ruleParametersTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:166:2: ( ( ( ( rule__ParametersTable__RowsAssignment ) ) ( ( rule__ParametersTable__RowsAssignment )* ) ) )
            // InternalCucumber.g:167:2: ( ( ( rule__ParametersTable__RowsAssignment ) ) ( ( rule__ParametersTable__RowsAssignment )* ) )
            {
            // InternalCucumber.g:167:2: ( ( ( rule__ParametersTable__RowsAssignment ) ) ( ( rule__ParametersTable__RowsAssignment )* ) )
            // InternalCucumber.g:168:3: ( ( rule__ParametersTable__RowsAssignment ) ) ( ( rule__ParametersTable__RowsAssignment )* )
            {
            // InternalCucumber.g:168:3: ( ( rule__ParametersTable__RowsAssignment ) )
            // InternalCucumber.g:169:4: ( rule__ParametersTable__RowsAssignment )
            {
             before(grammarAccess.getParametersTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:170:4: ( rule__ParametersTable__RowsAssignment )
            // InternalCucumber.g:170:5: rule__ParametersTable__RowsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ParametersTable__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParametersTableAccess().getRowsAssignment()); 

            }

            // InternalCucumber.g:173:3: ( ( rule__ParametersTable__RowsAssignment )* )
            // InternalCucumber.g:174:4: ( rule__ParametersTable__RowsAssignment )*
            {
             before(grammarAccess.getParametersTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:175:4: ( rule__ParametersTable__RowsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCucumber.g:175:5: rule__ParametersTable__RowsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ParametersTable__RowsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getParametersTableAccess().getRowsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametersTable"


    // $ANTLR start "entryRuleFeature"
    // InternalCucumber.g:185:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalCucumber.g:186:1: ( ruleFeature EOF )
            // InternalCucumber.g:187:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalCucumber.g:194:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:198:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalCucumber.g:199:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalCucumber.g:199:2: ( ( rule__Feature__Group__0 ) )
            // InternalCucumber.g:200:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalCucumber.g:201:3: ( rule__Feature__Group__0 )
            // InternalCucumber.g:201:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleAbstractScenario"
    // InternalCucumber.g:210:1: entryRuleAbstractScenario : ruleAbstractScenario EOF ;
    public final void entryRuleAbstractScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:211:1: ( ruleAbstractScenario EOF )
            // InternalCucumber.g:212:1: ruleAbstractScenario EOF
            {
             before(grammarAccess.getAbstractScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getAbstractScenarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractScenario"


    // $ANTLR start "ruleAbstractScenario"
    // InternalCucumber.g:219:1: ruleAbstractScenario : ( ( rule__AbstractScenario__Alternatives ) ) ;
    public final void ruleAbstractScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:223:2: ( ( ( rule__AbstractScenario__Alternatives ) ) )
            // InternalCucumber.g:224:2: ( ( rule__AbstractScenario__Alternatives ) )
            {
            // InternalCucumber.g:224:2: ( ( rule__AbstractScenario__Alternatives ) )
            // InternalCucumber.g:225:3: ( rule__AbstractScenario__Alternatives )
            {
             before(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 
            // InternalCucumber.g:226:3: ( rule__AbstractScenario__Alternatives )
            // InternalCucumber.g:226:4: rule__AbstractScenario__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractScenario__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractScenarioAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractScenario"


    // $ANTLR start "entryRuleBackground"
    // InternalCucumber.g:235:1: entryRuleBackground : ruleBackground EOF ;
    public final void entryRuleBackground() throws RecognitionException {
        try {
            // InternalCucumber.g:236:1: ( ruleBackground EOF )
            // InternalCucumber.g:237:1: ruleBackground EOF
            {
             before(grammarAccess.getBackgroundRule()); 
            pushFollow(FOLLOW_1);
            ruleBackground();

            state._fsp--;

             after(grammarAccess.getBackgroundRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBackground"


    // $ANTLR start "ruleBackground"
    // InternalCucumber.g:244:1: ruleBackground : ( ( rule__Background__Group__0 ) ) ;
    public final void ruleBackground() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:248:2: ( ( ( rule__Background__Group__0 ) ) )
            // InternalCucumber.g:249:2: ( ( rule__Background__Group__0 ) )
            {
            // InternalCucumber.g:249:2: ( ( rule__Background__Group__0 ) )
            // InternalCucumber.g:250:3: ( rule__Background__Group__0 )
            {
             before(grammarAccess.getBackgroundAccess().getGroup()); 
            // InternalCucumber.g:251:3: ( rule__Background__Group__0 )
            // InternalCucumber.g:251:4: rule__Background__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackground"


    // $ANTLR start "entryRuleScenario"
    // InternalCucumber.g:260:1: entryRuleScenario : ruleScenario EOF ;
    public final void entryRuleScenario() throws RecognitionException {
        try {
            // InternalCucumber.g:261:1: ( ruleScenario EOF )
            // InternalCucumber.g:262:1: ruleScenario EOF
            {
             before(grammarAccess.getScenarioRule()); 
            pushFollow(FOLLOW_1);
            ruleScenario();

            state._fsp--;

             after(grammarAccess.getScenarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenario"


    // $ANTLR start "ruleScenario"
    // InternalCucumber.g:269:1: ruleScenario : ( ( rule__Scenario__Group__0 ) ) ;
    public final void ruleScenario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:273:2: ( ( ( rule__Scenario__Group__0 ) ) )
            // InternalCucumber.g:274:2: ( ( rule__Scenario__Group__0 ) )
            {
            // InternalCucumber.g:274:2: ( ( rule__Scenario__Group__0 ) )
            // InternalCucumber.g:275:3: ( rule__Scenario__Group__0 )
            {
             before(grammarAccess.getScenarioAccess().getGroup()); 
            // InternalCucumber.g:276:3: ( rule__Scenario__Group__0 )
            // InternalCucumber.g:276:4: rule__Scenario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenario"


    // $ANTLR start "entryRuleScenarioOutline"
    // InternalCucumber.g:285:1: entryRuleScenarioOutline : ruleScenarioOutline EOF ;
    public final void entryRuleScenarioOutline() throws RecognitionException {
        try {
            // InternalCucumber.g:286:1: ( ruleScenarioOutline EOF )
            // InternalCucumber.g:287:1: ruleScenarioOutline EOF
            {
             before(grammarAccess.getScenarioOutlineRule()); 
            pushFollow(FOLLOW_1);
            ruleScenarioOutline();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScenarioOutline"


    // $ANTLR start "ruleScenarioOutline"
    // InternalCucumber.g:294:1: ruleScenarioOutline : ( ( rule__ScenarioOutline__Group__0 ) ) ;
    public final void ruleScenarioOutline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:298:2: ( ( ( rule__ScenarioOutline__Group__0 ) ) )
            // InternalCucumber.g:299:2: ( ( rule__ScenarioOutline__Group__0 ) )
            {
            // InternalCucumber.g:299:2: ( ( rule__ScenarioOutline__Group__0 ) )
            // InternalCucumber.g:300:3: ( rule__ScenarioOutline__Group__0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup()); 
            // InternalCucumber.g:301:3: ( rule__ScenarioOutline__Group__0 )
            // InternalCucumber.g:301:4: rule__ScenarioOutline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScenarioOutline"


    // $ANTLR start "entryRuleExamples"
    // InternalCucumber.g:310:1: entryRuleExamples : ruleExamples EOF ;
    public final void entryRuleExamples() throws RecognitionException {
        try {
            // InternalCucumber.g:311:1: ( ruleExamples EOF )
            // InternalCucumber.g:312:1: ruleExamples EOF
            {
             before(grammarAccess.getExamplesRule()); 
            pushFollow(FOLLOW_1);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getExamplesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExamples"


    // $ANTLR start "ruleExamples"
    // InternalCucumber.g:319:1: ruleExamples : ( ( rule__Examples__Group__0 ) ) ;
    public final void ruleExamples() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:323:2: ( ( ( rule__Examples__Group__0 ) ) )
            // InternalCucumber.g:324:2: ( ( rule__Examples__Group__0 ) )
            {
            // InternalCucumber.g:324:2: ( ( rule__Examples__Group__0 ) )
            // InternalCucumber.g:325:3: ( rule__Examples__Group__0 )
            {
             before(grammarAccess.getExamplesAccess().getGroup()); 
            // InternalCucumber.g:326:3: ( rule__Examples__Group__0 )
            // InternalCucumber.g:326:4: rule__Examples__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExamples"


    // $ANTLR start "entryRuleExamplesTable"
    // InternalCucumber.g:335:1: entryRuleExamplesTable : ruleExamplesTable EOF ;
    public final void entryRuleExamplesTable() throws RecognitionException {
        try {
            // InternalCucumber.g:336:1: ( ruleExamplesTable EOF )
            // InternalCucumber.g:337:1: ruleExamplesTable EOF
            {
             before(grammarAccess.getExamplesTableRule()); 
            pushFollow(FOLLOW_1);
            ruleExamplesTable();

            state._fsp--;

             after(grammarAccess.getExamplesTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExamplesTable"


    // $ANTLR start "ruleExamplesTable"
    // InternalCucumber.g:344:1: ruleExamplesTable : ( ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* ) ) ;
    public final void ruleExamplesTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:348:2: ( ( ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* ) ) )
            // InternalCucumber.g:349:2: ( ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* ) )
            {
            // InternalCucumber.g:349:2: ( ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* ) )
            // InternalCucumber.g:350:3: ( ( rule__ExamplesTable__RowsAssignment ) ) ( ( rule__ExamplesTable__RowsAssignment )* )
            {
            // InternalCucumber.g:350:3: ( ( rule__ExamplesTable__RowsAssignment ) )
            // InternalCucumber.g:351:4: ( rule__ExamplesTable__RowsAssignment )
            {
             before(grammarAccess.getExamplesTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:352:4: ( rule__ExamplesTable__RowsAssignment )
            // InternalCucumber.g:352:5: rule__ExamplesTable__RowsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__ExamplesTable__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExamplesTableAccess().getRowsAssignment()); 

            }

            // InternalCucumber.g:355:3: ( ( rule__ExamplesTable__RowsAssignment )* )
            // InternalCucumber.g:356:4: ( rule__ExamplesTable__RowsAssignment )*
            {
             before(grammarAccess.getExamplesTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:357:4: ( rule__ExamplesTable__RowsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCucumber.g:357:5: rule__ExamplesTable__RowsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ExamplesTable__RowsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getExamplesTableAccess().getRowsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExamplesTable"


    // $ANTLR start "entryRuleStepTable"
    // InternalCucumber.g:367:1: entryRuleStepTable : ruleStepTable EOF ;
    public final void entryRuleStepTable() throws RecognitionException {
        try {
            // InternalCucumber.g:368:1: ( ruleStepTable EOF )
            // InternalCucumber.g:369:1: ruleStepTable EOF
            {
             before(grammarAccess.getStepTableRule()); 
            pushFollow(FOLLOW_1);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getStepTableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStepTable"


    // $ANTLR start "ruleStepTable"
    // InternalCucumber.g:376:1: ruleStepTable : ( ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* ) ) ;
    public final void ruleStepTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:380:2: ( ( ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* ) ) )
            // InternalCucumber.g:381:2: ( ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* ) )
            {
            // InternalCucumber.g:381:2: ( ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* ) )
            // InternalCucumber.g:382:3: ( ( rule__StepTable__RowsAssignment ) ) ( ( rule__StepTable__RowsAssignment )* )
            {
            // InternalCucumber.g:382:3: ( ( rule__StepTable__RowsAssignment ) )
            // InternalCucumber.g:383:4: ( rule__StepTable__RowsAssignment )
            {
             before(grammarAccess.getStepTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:384:4: ( rule__StepTable__RowsAssignment )
            // InternalCucumber.g:384:5: rule__StepTable__RowsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__StepTable__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStepTableAccess().getRowsAssignment()); 

            }

            // InternalCucumber.g:387:3: ( ( rule__StepTable__RowsAssignment )* )
            // InternalCucumber.g:388:4: ( rule__StepTable__RowsAssignment )*
            {
             before(grammarAccess.getStepTableAccess().getRowsAssignment()); 
            // InternalCucumber.g:389:4: ( rule__StepTable__RowsAssignment )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCucumber.g:389:5: rule__StepTable__RowsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__StepTable__RowsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStepTableAccess().getRowsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStepTable"


    // $ANTLR start "entryRuleRow"
    // InternalCucumber.g:399:1: entryRuleRow : ruleRow EOF ;
    public final void entryRuleRow() throws RecognitionException {
        try {
            // InternalCucumber.g:400:1: ( ruleRow EOF )
            // InternalCucumber.g:401:1: ruleRow EOF
            {
             before(grammarAccess.getRowRule()); 
            pushFollow(FOLLOW_1);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getRowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRow"


    // $ANTLR start "ruleRow"
    // InternalCucumber.g:408:1: ruleRow : ( ( rule__Row__Group__0 ) ) ;
    public final void ruleRow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:412:2: ( ( ( rule__Row__Group__0 ) ) )
            // InternalCucumber.g:413:2: ( ( rule__Row__Group__0 ) )
            {
            // InternalCucumber.g:413:2: ( ( rule__Row__Group__0 ) )
            // InternalCucumber.g:414:3: ( rule__Row__Group__0 )
            {
             before(grammarAccess.getRowAccess().getGroup()); 
            // InternalCucumber.g:415:3: ( rule__Row__Group__0 )
            // InternalCucumber.g:415:4: rule__Row__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRow"


    // $ANTLR start "entryRuleCell"
    // InternalCucumber.g:424:1: entryRuleCell : ruleCell EOF ;
    public final void entryRuleCell() throws RecognitionException {
        try {
            // InternalCucumber.g:425:1: ( ruleCell EOF )
            // InternalCucumber.g:426:1: ruleCell EOF
            {
             before(grammarAccess.getCellRule()); 
            pushFollow(FOLLOW_1);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getCellRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // InternalCucumber.g:433:1: ruleCell : ( ( rule__Cell__Group__0 ) ) ;
    public final void ruleCell() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:437:2: ( ( ( rule__Cell__Group__0 ) ) )
            // InternalCucumber.g:438:2: ( ( rule__Cell__Group__0 ) )
            {
            // InternalCucumber.g:438:2: ( ( rule__Cell__Group__0 ) )
            // InternalCucumber.g:439:3: ( rule__Cell__Group__0 )
            {
             before(grammarAccess.getCellAccess().getGroup()); 
            // InternalCucumber.g:440:3: ( rule__Cell__Group__0 )
            // InternalCucumber.g:440:4: rule__Cell__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleStep"
    // InternalCucumber.g:449:1: entryRuleStep : ruleStep EOF ;
    public final void entryRuleStep() throws RecognitionException {
        try {
            // InternalCucumber.g:450:1: ( ruleStep EOF )
            // InternalCucumber.g:451:1: ruleStep EOF
            {
             before(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getStepRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalCucumber.g:458:1: ruleStep : ( ( rule__Step__Alternatives ) ) ;
    public final void ruleStep() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:462:2: ( ( ( rule__Step__Alternatives ) ) )
            // InternalCucumber.g:463:2: ( ( rule__Step__Alternatives ) )
            {
            // InternalCucumber.g:463:2: ( ( rule__Step__Alternatives ) )
            // InternalCucumber.g:464:3: ( rule__Step__Alternatives )
            {
             before(grammarAccess.getStepAccess().getAlternatives()); 
            // InternalCucumber.g:465:3: ( rule__Step__Alternatives )
            // InternalCucumber.g:465:4: rule__Step__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Step__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStepAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleDocString"
    // InternalCucumber.g:474:1: entryRuleDocString : ruleDocString EOF ;
    public final void entryRuleDocString() throws RecognitionException {
        try {
            // InternalCucumber.g:475:1: ( ruleDocString EOF )
            // InternalCucumber.g:476:1: ruleDocString EOF
            {
             before(grammarAccess.getDocStringRule()); 
            pushFollow(FOLLOW_1);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getDocStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocString"


    // $ANTLR start "ruleDocString"
    // InternalCucumber.g:483:1: ruleDocString : ( ( rule__DocString__Group__0 ) ) ;
    public final void ruleDocString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:487:2: ( ( ( rule__DocString__Group__0 ) ) )
            // InternalCucumber.g:488:2: ( ( rule__DocString__Group__0 ) )
            {
            // InternalCucumber.g:488:2: ( ( rule__DocString__Group__0 ) )
            // InternalCucumber.g:489:3: ( rule__DocString__Group__0 )
            {
             before(grammarAccess.getDocStringAccess().getGroup()); 
            // InternalCucumber.g:490:3: ( rule__DocString__Group__0 )
            // InternalCucumber.g:490:4: rule__DocString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocString"


    // $ANTLR start "entryRuleGiven"
    // InternalCucumber.g:499:1: entryRuleGiven : ruleGiven EOF ;
    public final void entryRuleGiven() throws RecognitionException {
        try {
            // InternalCucumber.g:500:1: ( ruleGiven EOF )
            // InternalCucumber.g:501:1: ruleGiven EOF
            {
             before(grammarAccess.getGivenRule()); 
            pushFollow(FOLLOW_1);
            ruleGiven();

            state._fsp--;

             after(grammarAccess.getGivenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGiven"


    // $ANTLR start "ruleGiven"
    // InternalCucumber.g:508:1: ruleGiven : ( ( rule__Given__Group__0 ) ) ;
    public final void ruleGiven() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:512:2: ( ( ( rule__Given__Group__0 ) ) )
            // InternalCucumber.g:513:2: ( ( rule__Given__Group__0 ) )
            {
            // InternalCucumber.g:513:2: ( ( rule__Given__Group__0 ) )
            // InternalCucumber.g:514:3: ( rule__Given__Group__0 )
            {
             before(grammarAccess.getGivenAccess().getGroup()); 
            // InternalCucumber.g:515:3: ( rule__Given__Group__0 )
            // InternalCucumber.g:515:4: rule__Given__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGiven"


    // $ANTLR start "entryRuleWhen"
    // InternalCucumber.g:524:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalCucumber.g:525:1: ( ruleWhen EOF )
            // InternalCucumber.g:526:1: ruleWhen EOF
            {
             before(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getWhenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalCucumber.g:533:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:537:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalCucumber.g:538:2: ( ( rule__When__Group__0 ) )
            {
            // InternalCucumber.g:538:2: ( ( rule__When__Group__0 ) )
            // InternalCucumber.g:539:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalCucumber.g:540:3: ( rule__When__Group__0 )
            // InternalCucumber.g:540:4: rule__When__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleThen"
    // InternalCucumber.g:549:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalCucumber.g:550:1: ( ruleThen EOF )
            // InternalCucumber.g:551:1: ruleThen EOF
            {
             before(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getThenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalCucumber.g:558:1: ruleThen : ( ( rule__Then__Group__0 ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:562:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalCucumber.g:563:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalCucumber.g:563:2: ( ( rule__Then__Group__0 ) )
            // InternalCucumber.g:564:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalCucumber.g:565:3: ( rule__Then__Group__0 )
            // InternalCucumber.g:565:4: rule__Then__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleAnd"
    // InternalCucumber.g:574:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalCucumber.g:575:1: ( ruleAnd EOF )
            // InternalCucumber.g:576:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalCucumber.g:583:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:587:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalCucumber.g:588:2: ( ( rule__And__Group__0 ) )
            {
            // InternalCucumber.g:588:2: ( ( rule__And__Group__0 ) )
            // InternalCucumber.g:589:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalCucumber.g:590:3: ( rule__And__Group__0 )
            // InternalCucumber.g:590:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleBut"
    // InternalCucumber.g:599:1: entryRuleBut : ruleBut EOF ;
    public final void entryRuleBut() throws RecognitionException {
        try {
            // InternalCucumber.g:600:1: ( ruleBut EOF )
            // InternalCucumber.g:601:1: ruleBut EOF
            {
             before(grammarAccess.getButRule()); 
            pushFollow(FOLLOW_1);
            ruleBut();

            state._fsp--;

             after(grammarAccess.getButRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBut"


    // $ANTLR start "ruleBut"
    // InternalCucumber.g:608:1: ruleBut : ( ( rule__But__Group__0 ) ) ;
    public final void ruleBut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:612:2: ( ( ( rule__But__Group__0 ) ) )
            // InternalCucumber.g:613:2: ( ( rule__But__Group__0 ) )
            {
            // InternalCucumber.g:613:2: ( ( rule__But__Group__0 ) )
            // InternalCucumber.g:614:3: ( rule__But__Group__0 )
            {
             before(grammarAccess.getButAccess().getGroup()); 
            // InternalCucumber.g:615:3: ( rule__But__Group__0 )
            // InternalCucumber.g:615:4: rule__But__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__But__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBut"


    // $ANTLR start "entryRuleAsterisk"
    // InternalCucumber.g:624:1: entryRuleAsterisk : ruleAsterisk EOF ;
    public final void entryRuleAsterisk() throws RecognitionException {
        try {
            // InternalCucumber.g:625:1: ( ruleAsterisk EOF )
            // InternalCucumber.g:626:1: ruleAsterisk EOF
            {
             before(grammarAccess.getAsteriskRule()); 
            pushFollow(FOLLOW_1);
            ruleAsterisk();

            state._fsp--;

             after(grammarAccess.getAsteriskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsterisk"


    // $ANTLR start "ruleAsterisk"
    // InternalCucumber.g:633:1: ruleAsterisk : ( ( rule__Asterisk__Group__0 ) ) ;
    public final void ruleAsterisk() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:637:2: ( ( ( rule__Asterisk__Group__0 ) ) )
            // InternalCucumber.g:638:2: ( ( rule__Asterisk__Group__0 ) )
            {
            // InternalCucumber.g:638:2: ( ( rule__Asterisk__Group__0 ) )
            // InternalCucumber.g:639:3: ( rule__Asterisk__Group__0 )
            {
             before(grammarAccess.getAsteriskAccess().getGroup()); 
            // InternalCucumber.g:640:3: ( rule__Asterisk__Group__0 )
            // InternalCucumber.g:640:4: rule__Asterisk__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsteriskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsterisk"


    // $ANTLR start "entryRuleStatement"
    // InternalCucumber.g:649:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalCucumber.g:650:1: ( ruleStatement EOF )
            // InternalCucumber.g:651:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalCucumber.g:658:1: ruleStatement : ( ( rule__Statement__Group__0 ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:662:2: ( ( ( rule__Statement__Group__0 ) ) )
            // InternalCucumber.g:663:2: ( ( rule__Statement__Group__0 ) )
            {
            // InternalCucumber.g:663:2: ( ( rule__Statement__Group__0 ) )
            // InternalCucumber.g:664:3: ( rule__Statement__Group__0 )
            {
             before(grammarAccess.getStatementAccess().getGroup()); 
            // InternalCucumber.g:665:3: ( rule__Statement__Group__0 )
            // InternalCucumber.g:665:4: rule__Statement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRulePhrase"
    // InternalCucumber.g:674:1: entryRulePhrase : rulePhrase EOF ;
    public final void entryRulePhrase() throws RecognitionException {
        try {
            // InternalCucumber.g:675:1: ( rulePhrase EOF )
            // InternalCucumber.g:676:1: rulePhrase EOF
            {
             before(grammarAccess.getPhraseRule()); 
            pushFollow(FOLLOW_1);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getPhraseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhrase"


    // $ANTLR start "rulePhrase"
    // InternalCucumber.g:683:1: rulePhrase : ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) ;
    public final void rulePhrase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:687:2: ( ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) ) )
            // InternalCucumber.g:688:2: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            {
            // InternalCucumber.g:688:2: ( ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* ) )
            // InternalCucumber.g:689:3: ( ( ruleTEXT_LITERAL ) ) ( ( ruleTEXT_LITERAL )* )
            {
            // InternalCucumber.g:689:3: ( ( ruleTEXT_LITERAL ) )
            // InternalCucumber.g:690:4: ( ruleTEXT_LITERAL )
            {
             before(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalCucumber.g:691:4: ( ruleTEXT_LITERAL )
            // InternalCucumber.g:691:5: ruleTEXT_LITERAL
            {
            pushFollow(FOLLOW_4);
            ruleTEXT_LITERAL();

            state._fsp--;


            }

             after(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 

            }

            // InternalCucumber.g:694:3: ( ( ruleTEXT_LITERAL )* )
            // InternalCucumber.g:695:4: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalCucumber.g:696:4: ( ruleTEXT_LITERAL )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_WORD && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCucumber.g:696:5: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPhraseAccess().getTEXT_LITERALParserRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhrase"


    // $ANTLR start "entryRuleTag"
    // InternalCucumber.g:706:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalCucumber.g:707:1: ( ruleTag EOF )
            // InternalCucumber.g:708:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalCucumber.g:715:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:719:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalCucumber.g:720:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalCucumber.g:720:2: ( ( rule__Tag__Group__0 ) )
            // InternalCucumber.g:721:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalCucumber.g:722:3: ( rule__Tag__Group__0 )
            // InternalCucumber.g:722:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleLine"
    // InternalCucumber.g:731:1: entryRuleLine : ruleLine EOF ;
    public final void entryRuleLine() throws RecognitionException {
        try {
            // InternalCucumber.g:732:1: ( ruleLine EOF )
            // InternalCucumber.g:733:1: ruleLine EOF
            {
             before(grammarAccess.getLineRule()); 
            pushFollow(FOLLOW_1);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getLineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLine"


    // $ANTLR start "ruleLine"
    // InternalCucumber.g:740:1: ruleLine : ( ( rule__Line__Group__0 ) ) ;
    public final void ruleLine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:744:2: ( ( ( rule__Line__Group__0 ) ) )
            // InternalCucumber.g:745:2: ( ( rule__Line__Group__0 ) )
            {
            // InternalCucumber.g:745:2: ( ( rule__Line__Group__0 ) )
            // InternalCucumber.g:746:3: ( rule__Line__Group__0 )
            {
             before(grammarAccess.getLineAccess().getGroup()); 
            // InternalCucumber.g:747:3: ( rule__Line__Group__0 )
            // InternalCucumber.g:747:4: rule__Line__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLine"


    // $ANTLR start "entryRuleLineBits"
    // InternalCucumber.g:756:1: entryRuleLineBits : ruleLineBits EOF ;
    public final void entryRuleLineBits() throws RecognitionException {
        try {
            // InternalCucumber.g:757:1: ( ruleLineBits EOF )
            // InternalCucumber.g:758:1: ruleLineBits EOF
            {
             before(grammarAccess.getLineBitsRule()); 
            pushFollow(FOLLOW_1);
            ruleLineBits();

            state._fsp--;

             after(grammarAccess.getLineBitsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLineBits"


    // $ANTLR start "ruleLineBits"
    // InternalCucumber.g:765:1: ruleLineBits : ( ( ruleTEXT_LITERAL )* ) ;
    public final void ruleLineBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:769:2: ( ( ( ruleTEXT_LITERAL )* ) )
            // InternalCucumber.g:770:2: ( ( ruleTEXT_LITERAL )* )
            {
            // InternalCucumber.g:770:2: ( ( ruleTEXT_LITERAL )* )
            // InternalCucumber.g:771:3: ( ruleTEXT_LITERAL )*
            {
             before(grammarAccess.getLineBitsAccess().getTEXT_LITERALParserRuleCall()); 
            // InternalCucumber.g:772:3: ( ruleTEXT_LITERAL )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_WORD && LA5_0<=RULE_STRING)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCucumber.g:772:4: ruleTEXT_LITERAL
            	    {
            	    pushFollow(FOLLOW_4);
            	    ruleTEXT_LITERAL();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getLineBitsAccess().getTEXT_LITERALParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLineBits"


    // $ANTLR start "entryRuleTEXT_LITERAL"
    // InternalCucumber.g:781:1: entryRuleTEXT_LITERAL : ruleTEXT_LITERAL EOF ;
    public final void entryRuleTEXT_LITERAL() throws RecognitionException {
        try {
            // InternalCucumber.g:782:1: ( ruleTEXT_LITERAL EOF )
            // InternalCucumber.g:783:1: ruleTEXT_LITERAL EOF
            {
             before(grammarAccess.getTEXT_LITERALRule()); 
            pushFollow(FOLLOW_1);
            ruleTEXT_LITERAL();

            state._fsp--;

             after(grammarAccess.getTEXT_LITERALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTEXT_LITERAL"


    // $ANTLR start "ruleTEXT_LITERAL"
    // InternalCucumber.g:790:1: ruleTEXT_LITERAL : ( ( rule__TEXT_LITERAL__Alternatives ) ) ;
    public final void ruleTEXT_LITERAL() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:794:2: ( ( ( rule__TEXT_LITERAL__Alternatives ) ) )
            // InternalCucumber.g:795:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            {
            // InternalCucumber.g:795:2: ( ( rule__TEXT_LITERAL__Alternatives ) )
            // InternalCucumber.g:796:3: ( rule__TEXT_LITERAL__Alternatives )
            {
             before(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 
            // InternalCucumber.g:797:3: ( rule__TEXT_LITERAL__Alternatives )
            // InternalCucumber.g:797:4: rule__TEXT_LITERAL__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TEXT_LITERAL__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTEXT_LITERALAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTEXT_LITERAL"


    // $ANTLR start "rule__Model__Alternatives"
    // InternalCucumber.g:805:1: rule__Model__Alternatives : ( ( ruleFeature ) | ( ruleStepObject ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:809:1: ( ( ruleFeature ) | ( ruleStepObject ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13||LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==10) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCucumber.g:810:2: ( ruleFeature )
                    {
                    // InternalCucumber.g:810:2: ( ruleFeature )
                    // InternalCucumber.g:811:3: ruleFeature
                    {
                     before(grammarAccess.getModelAccess().getFeatureParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFeature();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getFeatureParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:816:2: ( ruleStepObject )
                    {
                    // InternalCucumber.g:816:2: ( ruleStepObject )
                    // InternalCucumber.g:817:3: ruleStepObject
                    {
                     before(grammarAccess.getModelAccess().getStepObjectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStepObject();

                    state._fsp--;

                     after(grammarAccess.getModelAccess().getStepObjectParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Alternatives"


    // $ANTLR start "rule__AbstractScenario__Alternatives"
    // InternalCucumber.g:826:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );
    public final void rule__AbstractScenario__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:830:1: ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalCucumber.g:831:2: ( ruleBackground )
                    {
                    // InternalCucumber.g:831:2: ( ruleBackground )
                    // InternalCucumber.g:832:3: ruleBackground
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBackground();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getBackgroundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:837:2: ( ruleScenario )
                    {
                    // InternalCucumber.g:837:2: ( ruleScenario )
                    // InternalCucumber.g:838:3: ruleScenario
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleScenario();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:843:2: ( ruleScenarioOutline )
                    {
                    // InternalCucumber.g:843:2: ( ruleScenarioOutline )
                    // InternalCucumber.g:844:3: ruleScenarioOutline
                    {
                     before(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleScenarioOutline();

                    state._fsp--;

                     after(grammarAccess.getAbstractScenarioAccess().getScenarioOutlineParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractScenario__Alternatives"


    // $ANTLR start "rule__Step__Alternatives"
    // InternalCucumber.g:853:1: rule__Step__Alternatives : ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) | ( ruleBut ) | ( ruleAsterisk ) );
    public final void rule__Step__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:857:1: ( ( ruleGiven ) | ( ruleWhen ) | ( ruleThen ) | ( ruleAnd ) | ( ruleBut ) | ( ruleAsterisk ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalCucumber.g:858:2: ( ruleGiven )
                    {
                    // InternalCucumber.g:858:2: ( ruleGiven )
                    // InternalCucumber.g:859:3: ruleGiven
                    {
                     before(grammarAccess.getStepAccess().getGivenParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGiven();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getGivenParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:864:2: ( ruleWhen )
                    {
                    // InternalCucumber.g:864:2: ( ruleWhen )
                    // InternalCucumber.g:865:3: ruleWhen
                    {
                     before(grammarAccess.getStepAccess().getWhenParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWhen();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getWhenParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:870:2: ( ruleThen )
                    {
                    // InternalCucumber.g:870:2: ( ruleThen )
                    // InternalCucumber.g:871:3: ruleThen
                    {
                     before(grammarAccess.getStepAccess().getThenParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleThen();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getThenParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalCucumber.g:876:2: ( ruleAnd )
                    {
                    // InternalCucumber.g:876:2: ( ruleAnd )
                    // InternalCucumber.g:877:3: ruleAnd
                    {
                     before(grammarAccess.getStepAccess().getAndParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAnd();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getAndParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalCucumber.g:882:2: ( ruleBut )
                    {
                    // InternalCucumber.g:882:2: ( ruleBut )
                    // InternalCucumber.g:883:3: ruleBut
                    {
                     before(grammarAccess.getStepAccess().getButParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleBut();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getButParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalCucumber.g:888:2: ( ruleAsterisk )
                    {
                    // InternalCucumber.g:888:2: ( ruleAsterisk )
                    // InternalCucumber.g:889:3: ruleAsterisk
                    {
                     before(grammarAccess.getStepAccess().getAsteriskParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleAsterisk();

                    state._fsp--;

                     after(grammarAccess.getStepAccess().getAsteriskParserRuleCall_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Step__Alternatives"


    // $ANTLR start "rule__Given__Alternatives_3"
    // InternalCucumber.g:898:1: rule__Given__Alternatives_3 : ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Given__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:902:1: ( ( ( rule__Given__TheStepTableAssignment_3_0 ) ) | ( ( rule__Given__TheDocStringAssignment_3_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalCucumber.g:903:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:903:2: ( ( rule__Given__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:904:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getGivenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:905:3: ( rule__Given__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:905:4: rule__Given__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGivenAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:909:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:909:2: ( ( rule__Given__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:910:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getGivenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:911:3: ( rule__Given__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:911:4: rule__Given__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getGivenAccess().getTheDocStringAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Alternatives_3"


    // $ANTLR start "rule__When__Alternatives_3"
    // InternalCucumber.g:919:1: rule__When__Alternatives_3 : ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) );
    public final void rule__When__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:923:1: ( ( ( rule__When__TheStepTableAssignment_3_0 ) ) | ( ( rule__When__TheDocStringAssignment_3_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalCucumber.g:924:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:924:2: ( ( rule__When__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:925:3: ( rule__When__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getWhenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:926:3: ( rule__When__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:926:4: rule__When__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhenAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:930:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:930:2: ( ( rule__When__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:931:3: ( rule__When__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getWhenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:932:3: ( rule__When__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:932:4: rule__When__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhenAccess().getTheDocStringAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Alternatives_3"


    // $ANTLR start "rule__Then__Alternatives_3"
    // InternalCucumber.g:940:1: rule__Then__Alternatives_3 : ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Then__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:944:1: ( ( ( rule__Then__TheStepTableAssignment_3_0 ) ) | ( ( rule__Then__TheDocStringAssignment_3_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            else if ( (LA11_0==19) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCucumber.g:945:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:945:2: ( ( rule__Then__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:946:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getThenAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:947:3: ( rule__Then__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:947:4: rule__Then__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getThenAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:951:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:951:2: ( ( rule__Then__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:952:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getThenAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:953:3: ( rule__Then__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:953:4: rule__Then__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getThenAccess().getTheDocStringAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Alternatives_3"


    // $ANTLR start "rule__And__Alternatives_3"
    // InternalCucumber.g:961:1: rule__And__Alternatives_3 : ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) );
    public final void rule__And__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:965:1: ( ( ( rule__And__TheStepTableAssignment_3_0 ) ) | ( ( rule__And__TheDocStringAssignment_3_1 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalCucumber.g:966:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:966:2: ( ( rule__And__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:967:3: ( rule__And__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getAndAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:968:3: ( rule__And__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:968:4: rule__And__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAndAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:972:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:972:2: ( ( rule__And__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:973:3: ( rule__And__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getAndAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:974:3: ( rule__And__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:974:4: rule__And__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAndAccess().getTheDocStringAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Alternatives_3"


    // $ANTLR start "rule__But__Alternatives_3"
    // InternalCucumber.g:982:1: rule__But__Alternatives_3 : ( ( ( rule__But__TheStepTableAssignment_3_0 ) ) | ( ( rule__But__TheDocStringAssignment_3_1 ) ) );
    public final void rule__But__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:986:1: ( ( ( rule__But__TheStepTableAssignment_3_0 ) ) | ( ( rule__But__TheDocStringAssignment_3_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            else if ( (LA13_0==19) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalCucumber.g:987:2: ( ( rule__But__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:987:2: ( ( rule__But__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:988:3: ( rule__But__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getButAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:989:3: ( rule__But__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:989:4: rule__But__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__But__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getButAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:993:2: ( ( rule__But__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:993:2: ( ( rule__But__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:994:3: ( rule__But__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getButAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:995:3: ( rule__But__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:995:4: rule__But__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__But__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getButAccess().getTheDocStringAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Alternatives_3"


    // $ANTLR start "rule__Asterisk__Alternatives_3"
    // InternalCucumber.g:1003:1: rule__Asterisk__Alternatives_3 : ( ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) ) | ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) ) );
    public final void rule__Asterisk__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1007:1: ( ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) ) | ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            else if ( (LA14_0==19) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCucumber.g:1008:2: ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) )
                    {
                    // InternalCucumber.g:1008:2: ( ( rule__Asterisk__TheStepTableAssignment_3_0 ) )
                    // InternalCucumber.g:1009:3: ( rule__Asterisk__TheStepTableAssignment_3_0 )
                    {
                     before(grammarAccess.getAsteriskAccess().getTheStepTableAssignment_3_0()); 
                    // InternalCucumber.g:1010:3: ( rule__Asterisk__TheStepTableAssignment_3_0 )
                    // InternalCucumber.g:1010:4: rule__Asterisk__TheStepTableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asterisk__TheStepTableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsteriskAccess().getTheStepTableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1014:2: ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) )
                    {
                    // InternalCucumber.g:1014:2: ( ( rule__Asterisk__TheDocStringAssignment_3_1 ) )
                    // InternalCucumber.g:1015:3: ( rule__Asterisk__TheDocStringAssignment_3_1 )
                    {
                     before(grammarAccess.getAsteriskAccess().getTheDocStringAssignment_3_1()); 
                    // InternalCucumber.g:1016:3: ( rule__Asterisk__TheDocStringAssignment_3_1 )
                    // InternalCucumber.g:1016:4: rule__Asterisk__TheDocStringAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asterisk__TheDocStringAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsteriskAccess().getTheDocStringAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Alternatives_3"


    // $ANTLR start "rule__TEXT_LITERAL__Alternatives"
    // InternalCucumber.g:1024:1: rule__TEXT_LITERAL__Alternatives : ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__TEXT_LITERAL__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1028:1: ( ( RULE_WORD ) | ( RULE_ID ) | ( RULE_STRING ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_WORD:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case RULE_STRING:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalCucumber.g:1029:2: ( RULE_WORD )
                    {
                    // InternalCucumber.g:1029:2: ( RULE_WORD )
                    // InternalCucumber.g:1030:3: RULE_WORD
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 
                    match(input,RULE_WORD,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getWORDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCucumber.g:1035:2: ( RULE_ID )
                    {
                    // InternalCucumber.g:1035:2: ( RULE_ID )
                    // InternalCucumber.g:1036:3: RULE_ID
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalCucumber.g:1041:2: ( RULE_STRING )
                    {
                    // InternalCucumber.g:1041:2: ( RULE_STRING )
                    // InternalCucumber.g:1042:3: RULE_STRING
                    {
                     before(grammarAccess.getTEXT_LITERALAccess().getSTRINGTerminalRuleCall_2()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getTEXT_LITERALAccess().getSTRINGTerminalRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TEXT_LITERAL__Alternatives"


    // $ANTLR start "rule__StepObject__Group__0"
    // InternalCucumber.g:1051:1: rule__StepObject__Group__0 : rule__StepObject__Group__0__Impl rule__StepObject__Group__1 ;
    public final void rule__StepObject__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1055:1: ( rule__StepObject__Group__0__Impl rule__StepObject__Group__1 )
            // InternalCucumber.g:1056:2: rule__StepObject__Group__0__Impl rule__StepObject__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StepObject__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepObject__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__0"


    // $ANTLR start "rule__StepObject__Group__0__Impl"
    // InternalCucumber.g:1063:1: rule__StepObject__Group__0__Impl : ( 'Object:' ) ;
    public final void rule__StepObject__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1067:1: ( ( 'Object:' ) )
            // InternalCucumber.g:1068:1: ( 'Object:' )
            {
            // InternalCucumber.g:1068:1: ( 'Object:' )
            // InternalCucumber.g:1069:2: 'Object:'
            {
             before(grammarAccess.getStepObjectAccess().getObjectKeyword_0()); 
            match(input,10,FOLLOW_2); 
             after(grammarAccess.getStepObjectAccess().getObjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__0__Impl"


    // $ANTLR start "rule__StepObject__Group__1"
    // InternalCucumber.g:1078:1: rule__StepObject__Group__1 : rule__StepObject__Group__1__Impl rule__StepObject__Group__2 ;
    public final void rule__StepObject__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1082:1: ( rule__StepObject__Group__1__Impl rule__StepObject__Group__2 )
            // InternalCucumber.g:1083:2: rule__StepObject__Group__1__Impl rule__StepObject__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StepObject__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepObject__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__1"


    // $ANTLR start "rule__StepObject__Group__1__Impl"
    // InternalCucumber.g:1090:1: rule__StepObject__Group__1__Impl : ( ( rule__StepObject__NameAssignment_1 ) ) ;
    public final void rule__StepObject__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1094:1: ( ( ( rule__StepObject__NameAssignment_1 ) ) )
            // InternalCucumber.g:1095:1: ( ( rule__StepObject__NameAssignment_1 ) )
            {
            // InternalCucumber.g:1095:1: ( ( rule__StepObject__NameAssignment_1 ) )
            // InternalCucumber.g:1096:2: ( rule__StepObject__NameAssignment_1 )
            {
             before(grammarAccess.getStepObjectAccess().getNameAssignment_1()); 
            // InternalCucumber.g:1097:2: ( rule__StepObject__NameAssignment_1 )
            // InternalCucumber.g:1097:3: rule__StepObject__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StepObject__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepObjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__1__Impl"


    // $ANTLR start "rule__StepObject__Group__2"
    // InternalCucumber.g:1105:1: rule__StepObject__Group__2 : rule__StepObject__Group__2__Impl rule__StepObject__Group__3 ;
    public final void rule__StepObject__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1109:1: ( rule__StepObject__Group__2__Impl rule__StepObject__Group__3 )
            // InternalCucumber.g:1110:2: rule__StepObject__Group__2__Impl rule__StepObject__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__StepObject__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepObject__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__2"


    // $ANTLR start "rule__StepObject__Group__2__Impl"
    // InternalCucumber.g:1117:1: rule__StepObject__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__StepObject__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1121:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1122:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1122:1: ( RULE_EOL )
            // InternalCucumber.g:1123:2: RULE_EOL
            {
             before(grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepObjectAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__2__Impl"


    // $ANTLR start "rule__StepObject__Group__3"
    // InternalCucumber.g:1132:1: rule__StepObject__Group__3 : rule__StepObject__Group__3__Impl rule__StepObject__Group__4 ;
    public final void rule__StepObject__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1136:1: ( rule__StepObject__Group__3__Impl rule__StepObject__Group__4 )
            // InternalCucumber.g:1137:2: rule__StepObject__Group__3__Impl rule__StepObject__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__StepObject__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepObject__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__3"


    // $ANTLR start "rule__StepObject__Group__3__Impl"
    // InternalCucumber.g:1144:1: rule__StepObject__Group__3__Impl : ( ( rule__StepObject__StatementsAssignment_3 )* ) ;
    public final void rule__StepObject__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1148:1: ( ( ( rule__StepObject__StatementsAssignment_3 )* ) )
            // InternalCucumber.g:1149:1: ( ( rule__StepObject__StatementsAssignment_3 )* )
            {
            // InternalCucumber.g:1149:1: ( ( rule__StepObject__StatementsAssignment_3 )* )
            // InternalCucumber.g:1150:2: ( rule__StepObject__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepObjectAccess().getStatementsAssignment_3()); 
            // InternalCucumber.g:1151:2: ( rule__StepObject__StatementsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_WORD && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCucumber.g:1151:3: rule__StepObject__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StepObject__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStepObjectAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__3__Impl"


    // $ANTLR start "rule__StepObject__Group__4"
    // InternalCucumber.g:1159:1: rule__StepObject__Group__4 : rule__StepObject__Group__4__Impl ;
    public final void rule__StepObject__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1163:1: ( rule__StepObject__Group__4__Impl )
            // InternalCucumber.g:1164:2: rule__StepObject__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepObject__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__4"


    // $ANTLR start "rule__StepObject__Group__4__Impl"
    // InternalCucumber.g:1170:1: rule__StepObject__Group__4__Impl : ( ( ( rule__StepObject__StepDefinitionsAssignment_4 ) ) ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) ) ;
    public final void rule__StepObject__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1174:1: ( ( ( ( rule__StepObject__StepDefinitionsAssignment_4 ) ) ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) ) )
            // InternalCucumber.g:1175:1: ( ( ( rule__StepObject__StepDefinitionsAssignment_4 ) ) ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) )
            {
            // InternalCucumber.g:1175:1: ( ( ( rule__StepObject__StepDefinitionsAssignment_4 ) ) ( ( rule__StepObject__StepDefinitionsAssignment_4 )* ) )
            // InternalCucumber.g:1176:2: ( ( rule__StepObject__StepDefinitionsAssignment_4 ) ) ( ( rule__StepObject__StepDefinitionsAssignment_4 )* )
            {
            // InternalCucumber.g:1176:2: ( ( rule__StepObject__StepDefinitionsAssignment_4 ) )
            // InternalCucumber.g:1177:3: ( rule__StepObject__StepDefinitionsAssignment_4 )
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_4()); 
            // InternalCucumber.g:1178:3: ( rule__StepObject__StepDefinitionsAssignment_4 )
            // InternalCucumber.g:1178:4: rule__StepObject__StepDefinitionsAssignment_4
            {
            pushFollow(FOLLOW_8);
            rule__StepObject__StepDefinitionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_4()); 

            }

            // InternalCucumber.g:1181:2: ( ( rule__StepObject__StepDefinitionsAssignment_4 )* )
            // InternalCucumber.g:1182:3: ( rule__StepObject__StepDefinitionsAssignment_4 )*
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_4()); 
            // InternalCucumber.g:1183:3: ( rule__StepObject__StepDefinitionsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==11) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCucumber.g:1183:4: rule__StepObject__StepDefinitionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__StepObject__StepDefinitionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getStepObjectAccess().getStepDefinitionsAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__Group__4__Impl"


    // $ANTLR start "rule__StepDefinition__Group__0"
    // InternalCucumber.g:1193:1: rule__StepDefinition__Group__0 : rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 ;
    public final void rule__StepDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1197:1: ( rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1 )
            // InternalCucumber.g:1198:2: rule__StepDefinition__Group__0__Impl rule__StepDefinition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StepDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__0"


    // $ANTLR start "rule__StepDefinition__Group__0__Impl"
    // InternalCucumber.g:1205:1: rule__StepDefinition__Group__0__Impl : ( 'Definition:' ) ;
    public final void rule__StepDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1209:1: ( ( 'Definition:' ) )
            // InternalCucumber.g:1210:1: ( 'Definition:' )
            {
            // InternalCucumber.g:1210:1: ( 'Definition:' )
            // InternalCucumber.g:1211:2: 'Definition:'
            {
             before(grammarAccess.getStepDefinitionAccess().getDefinitionKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStepDefinitionAccess().getDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__0__Impl"


    // $ANTLR start "rule__StepDefinition__Group__1"
    // InternalCucumber.g:1220:1: rule__StepDefinition__Group__1 : rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 ;
    public final void rule__StepDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1224:1: ( rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2 )
            // InternalCucumber.g:1225:2: rule__StepDefinition__Group__1__Impl rule__StepDefinition__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StepDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__1"


    // $ANTLR start "rule__StepDefinition__Group__1__Impl"
    // InternalCucumber.g:1232:1: rule__StepDefinition__Group__1__Impl : ( ( rule__StepDefinition__NameAssignment_1 ) ) ;
    public final void rule__StepDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1236:1: ( ( ( rule__StepDefinition__NameAssignment_1 ) ) )
            // InternalCucumber.g:1237:1: ( ( rule__StepDefinition__NameAssignment_1 ) )
            {
            // InternalCucumber.g:1237:1: ( ( rule__StepDefinition__NameAssignment_1 ) )
            // InternalCucumber.g:1238:2: ( rule__StepDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getStepDefinitionAccess().getNameAssignment_1()); 
            // InternalCucumber.g:1239:2: ( rule__StepDefinition__NameAssignment_1 )
            // InternalCucumber.g:1239:3: rule__StepDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StepDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__1__Impl"


    // $ANTLR start "rule__StepDefinition__Group__2"
    // InternalCucumber.g:1247:1: rule__StepDefinition__Group__2 : rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 ;
    public final void rule__StepDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1251:1: ( rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3 )
            // InternalCucumber.g:1252:2: rule__StepDefinition__Group__2__Impl rule__StepDefinition__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__StepDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__2"


    // $ANTLR start "rule__StepDefinition__Group__2__Impl"
    // InternalCucumber.g:1259:1: rule__StepDefinition__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__StepDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1263:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1264:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1264:1: ( RULE_EOL )
            // InternalCucumber.g:1265:2: RULE_EOL
            {
             before(grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepDefinitionAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__2__Impl"


    // $ANTLR start "rule__StepDefinition__Group__3"
    // InternalCucumber.g:1274:1: rule__StepDefinition__Group__3 : rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 ;
    public final void rule__StepDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1278:1: ( rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4 )
            // InternalCucumber.g:1279:2: rule__StepDefinition__Group__3__Impl rule__StepDefinition__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__StepDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__3"


    // $ANTLR start "rule__StepDefinition__Group__3__Impl"
    // InternalCucumber.g:1286:1: rule__StepDefinition__Group__3__Impl : ( ( rule__StepDefinition__StatementsAssignment_3 )* ) ;
    public final void rule__StepDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1290:1: ( ( ( rule__StepDefinition__StatementsAssignment_3 )* ) )
            // InternalCucumber.g:1291:1: ( ( rule__StepDefinition__StatementsAssignment_3 )* )
            {
            // InternalCucumber.g:1291:1: ( ( rule__StepDefinition__StatementsAssignment_3 )* )
            // InternalCucumber.g:1292:2: ( rule__StepDefinition__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_3()); 
            // InternalCucumber.g:1293:2: ( rule__StepDefinition__StatementsAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_WORD && LA18_0<=RULE_STRING)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalCucumber.g:1293:3: rule__StepDefinition__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StepDefinition__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getStepDefinitionAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__3__Impl"


    // $ANTLR start "rule__StepDefinition__Group__4"
    // InternalCucumber.g:1301:1: rule__StepDefinition__Group__4 : rule__StepDefinition__Group__4__Impl ;
    public final void rule__StepDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1305:1: ( rule__StepDefinition__Group__4__Impl )
            // InternalCucumber.g:1306:2: rule__StepDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__4"


    // $ANTLR start "rule__StepDefinition__Group__4__Impl"
    // InternalCucumber.g:1312:1: rule__StepDefinition__Group__4__Impl : ( ( rule__StepDefinition__StepParametersAssignment_4 )* ) ;
    public final void rule__StepDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1316:1: ( ( ( rule__StepDefinition__StepParametersAssignment_4 )* ) )
            // InternalCucumber.g:1317:1: ( ( rule__StepDefinition__StepParametersAssignment_4 )* )
            {
            // InternalCucumber.g:1317:1: ( ( rule__StepDefinition__StepParametersAssignment_4 )* )
            // InternalCucumber.g:1318:2: ( rule__StepDefinition__StepParametersAssignment_4 )*
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_4()); 
            // InternalCucumber.g:1319:2: ( rule__StepDefinition__StepParametersAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==12) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCucumber.g:1319:3: rule__StepDefinition__StepParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__StepDefinition__StepParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getStepDefinitionAccess().getStepParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__Group__4__Impl"


    // $ANTLR start "rule__StepParameters__Group__0"
    // InternalCucumber.g:1328:1: rule__StepParameters__Group__0 : rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 ;
    public final void rule__StepParameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1332:1: ( rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1 )
            // InternalCucumber.g:1333:2: rule__StepParameters__Group__0__Impl rule__StepParameters__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StepParameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__0"


    // $ANTLR start "rule__StepParameters__Group__0__Impl"
    // InternalCucumber.g:1340:1: rule__StepParameters__Group__0__Impl : ( 'Parameters:' ) ;
    public final void rule__StepParameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1344:1: ( ( 'Parameters:' ) )
            // InternalCucumber.g:1345:1: ( 'Parameters:' )
            {
            // InternalCucumber.g:1345:1: ( 'Parameters:' )
            // InternalCucumber.g:1346:2: 'Parameters:'
            {
             before(grammarAccess.getStepParametersAccess().getParametersKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStepParametersAccess().getParametersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__0__Impl"


    // $ANTLR start "rule__StepParameters__Group__1"
    // InternalCucumber.g:1355:1: rule__StepParameters__Group__1 : rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 ;
    public final void rule__StepParameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1359:1: ( rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2 )
            // InternalCucumber.g:1360:2: rule__StepParameters__Group__1__Impl rule__StepParameters__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__StepParameters__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__1"


    // $ANTLR start "rule__StepParameters__Group__1__Impl"
    // InternalCucumber.g:1367:1: rule__StepParameters__Group__1__Impl : ( ( rule__StepParameters__NameAssignment_1 ) ) ;
    public final void rule__StepParameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1371:1: ( ( ( rule__StepParameters__NameAssignment_1 ) ) )
            // InternalCucumber.g:1372:1: ( ( rule__StepParameters__NameAssignment_1 ) )
            {
            // InternalCucumber.g:1372:1: ( ( rule__StepParameters__NameAssignment_1 ) )
            // InternalCucumber.g:1373:2: ( rule__StepParameters__NameAssignment_1 )
            {
             before(grammarAccess.getStepParametersAccess().getNameAssignment_1()); 
            // InternalCucumber.g:1374:2: ( rule__StepParameters__NameAssignment_1 )
            // InternalCucumber.g:1374:3: rule__StepParameters__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStepParametersAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__1__Impl"


    // $ANTLR start "rule__StepParameters__Group__2"
    // InternalCucumber.g:1382:1: rule__StepParameters__Group__2 : rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 ;
    public final void rule__StepParameters__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1386:1: ( rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3 )
            // InternalCucumber.g:1387:2: rule__StepParameters__Group__2__Impl rule__StepParameters__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__StepParameters__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__2"


    // $ANTLR start "rule__StepParameters__Group__2__Impl"
    // InternalCucumber.g:1394:1: rule__StepParameters__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__StepParameters__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1398:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1399:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1399:1: ( RULE_EOL )
            // InternalCucumber.g:1400:2: RULE_EOL
            {
             before(grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStepParametersAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__2__Impl"


    // $ANTLR start "rule__StepParameters__Group__3"
    // InternalCucumber.g:1409:1: rule__StepParameters__Group__3 : rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 ;
    public final void rule__StepParameters__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1413:1: ( rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4 )
            // InternalCucumber.g:1414:2: rule__StepParameters__Group__3__Impl rule__StepParameters__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__StepParameters__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__3"


    // $ANTLR start "rule__StepParameters__Group__3__Impl"
    // InternalCucumber.g:1421:1: rule__StepParameters__Group__3__Impl : ( ( rule__StepParameters__StatementsAssignment_3 )* ) ;
    public final void rule__StepParameters__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1425:1: ( ( ( rule__StepParameters__StatementsAssignment_3 )* ) )
            // InternalCucumber.g:1426:1: ( ( rule__StepParameters__StatementsAssignment_3 )* )
            {
            // InternalCucumber.g:1426:1: ( ( rule__StepParameters__StatementsAssignment_3 )* )
            // InternalCucumber.g:1427:2: ( rule__StepParameters__StatementsAssignment_3 )*
            {
             before(grammarAccess.getStepParametersAccess().getStatementsAssignment_3()); 
            // InternalCucumber.g:1428:2: ( rule__StepParameters__StatementsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_WORD && LA20_0<=RULE_STRING)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCucumber.g:1428:3: rule__StepParameters__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__StepParameters__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getStepParametersAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__3__Impl"


    // $ANTLR start "rule__StepParameters__Group__4"
    // InternalCucumber.g:1436:1: rule__StepParameters__Group__4 : rule__StepParameters__Group__4__Impl ;
    public final void rule__StepParameters__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1440:1: ( rule__StepParameters__Group__4__Impl )
            // InternalCucumber.g:1441:2: rule__StepParameters__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__4"


    // $ANTLR start "rule__StepParameters__Group__4__Impl"
    // InternalCucumber.g:1447:1: rule__StepParameters__Group__4__Impl : ( ( rule__StepParameters__ParametersTableAssignment_4 ) ) ;
    public final void rule__StepParameters__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1451:1: ( ( ( rule__StepParameters__ParametersTableAssignment_4 ) ) )
            // InternalCucumber.g:1452:1: ( ( rule__StepParameters__ParametersTableAssignment_4 ) )
            {
            // InternalCucumber.g:1452:1: ( ( rule__StepParameters__ParametersTableAssignment_4 ) )
            // InternalCucumber.g:1453:2: ( rule__StepParameters__ParametersTableAssignment_4 )
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableAssignment_4()); 
            // InternalCucumber.g:1454:2: ( rule__StepParameters__ParametersTableAssignment_4 )
            // InternalCucumber.g:1454:3: rule__StepParameters__ParametersTableAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StepParameters__ParametersTableAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStepParametersAccess().getParametersTableAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalCucumber.g:1463:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1467:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalCucumber.g:1468:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalCucumber.g:1475:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__Group_0__0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1479:1: ( ( ( rule__Feature__Group_0__0 )? ) )
            // InternalCucumber.g:1480:1: ( ( rule__Feature__Group_0__0 )? )
            {
            // InternalCucumber.g:1480:1: ( ( rule__Feature__Group_0__0 )? )
            // InternalCucumber.g:1481:2: ( rule__Feature__Group_0__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_0()); 
            // InternalCucumber.g:1482:2: ( rule__Feature__Group_0__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCucumber.g:1482:3: rule__Feature__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalCucumber.g:1490:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1494:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalCucumber.g:1495:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalCucumber.g:1502:1: rule__Feature__Group__1__Impl : ( 'Feature:' ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1506:1: ( ( 'Feature:' ) )
            // InternalCucumber.g:1507:1: ( 'Feature:' )
            {
            // InternalCucumber.g:1507:1: ( 'Feature:' )
            // InternalCucumber.g:1508:2: 'Feature:'
            {
             before(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getFeatureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalCucumber.g:1517:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1521:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalCucumber.g:1522:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalCucumber.g:1529:1: rule__Feature__Group__2__Impl : ( ( rule__Feature__NameAssignment_2 ) ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1533:1: ( ( ( rule__Feature__NameAssignment_2 ) ) )
            // InternalCucumber.g:1534:1: ( ( rule__Feature__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1534:1: ( ( rule__Feature__NameAssignment_2 ) )
            // InternalCucumber.g:1535:2: ( rule__Feature__NameAssignment_2 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1536:2: ( rule__Feature__NameAssignment_2 )
            // InternalCucumber.g:1536:3: rule__Feature__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalCucumber.g:1544:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1548:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalCucumber.g:1549:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalCucumber.g:1556:1: rule__Feature__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1560:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1561:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1561:1: ( RULE_EOL )
            // InternalCucumber.g:1562:2: RULE_EOL
            {
             before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalCucumber.g:1571:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl rule__Feature__Group__5 ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1575:1: ( rule__Feature__Group__4__Impl rule__Feature__Group__5 )
            // InternalCucumber.g:1576:2: rule__Feature__Group__4__Impl rule__Feature__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Feature__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalCucumber.g:1583:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__StatementsAssignment_4 )* ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1587:1: ( ( ( rule__Feature__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1588:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1588:1: ( ( rule__Feature__StatementsAssignment_4 )* )
            // InternalCucumber.g:1589:2: ( rule__Feature__StatementsAssignment_4 )*
            {
             before(grammarAccess.getFeatureAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1590:2: ( rule__Feature__StatementsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_WORD && LA22_0<=RULE_STRING)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCucumber.g:1590:3: rule__Feature__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Feature__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group__5"
    // InternalCucumber.g:1598:1: rule__Feature__Group__5 : rule__Feature__Group__5__Impl ;
    public final void rule__Feature__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1602:1: ( rule__Feature__Group__5__Impl )
            // InternalCucumber.g:1603:2: rule__Feature__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5"


    // $ANTLR start "rule__Feature__Group__5__Impl"
    // InternalCucumber.g:1609:1: rule__Feature__Group__5__Impl : ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) ;
    public final void rule__Feature__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1613:1: ( ( ( rule__Feature__AbstractScenariosAssignment_5 )* ) )
            // InternalCucumber.g:1614:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            {
            // InternalCucumber.g:1614:1: ( ( rule__Feature__AbstractScenariosAssignment_5 )* )
            // InternalCucumber.g:1615:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_5()); 
            // InternalCucumber.g:1616:2: ( rule__Feature__AbstractScenariosAssignment_5 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=14 && LA23_0<=16)||LA23_0==26) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCucumber.g:1616:3: rule__Feature__AbstractScenariosAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Feature__AbstractScenariosAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getAbstractScenariosAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group__5__Impl"


    // $ANTLR start "rule__Feature__Group_0__0"
    // InternalCucumber.g:1625:1: rule__Feature__Group_0__0 : rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 ;
    public final void rule__Feature__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1629:1: ( rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1 )
            // InternalCucumber.g:1630:2: rule__Feature__Group_0__0__Impl rule__Feature__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Feature__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__0"


    // $ANTLR start "rule__Feature__Group_0__0__Impl"
    // InternalCucumber.g:1637:1: rule__Feature__Group_0__0__Impl : ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Feature__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1641:1: ( ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:1642:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:1642:1: ( ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:1643:2: ( ( rule__Feature__TagsAssignment_0_0 ) ) ( ( rule__Feature__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:1643:2: ( ( rule__Feature__TagsAssignment_0_0 ) )
            // InternalCucumber.g:1644:3: ( rule__Feature__TagsAssignment_0_0 )
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1645:3: ( rule__Feature__TagsAssignment_0_0 )
            // InternalCucumber.g:1645:4: rule__Feature__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_15);
            rule__Feature__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:1648:2: ( ( rule__Feature__TagsAssignment_0_0 )* )
            // InternalCucumber.g:1649:3: ( rule__Feature__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:1650:3: ( rule__Feature__TagsAssignment_0_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==26) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalCucumber.g:1650:4: rule__Feature__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Feature__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getTagsAssignment_0_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__0__Impl"


    // $ANTLR start "rule__Feature__Group_0__1"
    // InternalCucumber.g:1659:1: rule__Feature__Group_0__1 : rule__Feature__Group_0__1__Impl ;
    public final void rule__Feature__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1663:1: ( rule__Feature__Group_0__1__Impl )
            // InternalCucumber.g:1664:2: rule__Feature__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__1"


    // $ANTLR start "rule__Feature__Group_0__1__Impl"
    // InternalCucumber.g:1670:1: rule__Feature__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Feature__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1674:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1675:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1675:1: ( RULE_EOL )
            // InternalCucumber.g:1676:2: RULE_EOL
            {
             before(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__Group_0__1__Impl"


    // $ANTLR start "rule__Background__Group__0"
    // InternalCucumber.g:1686:1: rule__Background__Group__0 : rule__Background__Group__0__Impl rule__Background__Group__1 ;
    public final void rule__Background__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1690:1: ( rule__Background__Group__0__Impl rule__Background__Group__1 )
            // InternalCucumber.g:1691:2: rule__Background__Group__0__Impl rule__Background__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Background__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__0"


    // $ANTLR start "rule__Background__Group__0__Impl"
    // InternalCucumber.g:1698:1: rule__Background__Group__0__Impl : ( 'Background:' ) ;
    public final void rule__Background__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1702:1: ( ( 'Background:' ) )
            // InternalCucumber.g:1703:1: ( 'Background:' )
            {
            // InternalCucumber.g:1703:1: ( 'Background:' )
            // InternalCucumber.g:1704:2: 'Background:'
            {
             before(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getBackgroundKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__0__Impl"


    // $ANTLR start "rule__Background__Group__1"
    // InternalCucumber.g:1713:1: rule__Background__Group__1 : rule__Background__Group__1__Impl rule__Background__Group__2 ;
    public final void rule__Background__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1717:1: ( rule__Background__Group__1__Impl rule__Background__Group__2 )
            // InternalCucumber.g:1718:2: rule__Background__Group__1__Impl rule__Background__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Background__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__1"


    // $ANTLR start "rule__Background__Group__1__Impl"
    // InternalCucumber.g:1725:1: rule__Background__Group__1__Impl : ( ( rule__Background__NameAssignment_1 ) ) ;
    public final void rule__Background__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1729:1: ( ( ( rule__Background__NameAssignment_1 ) ) )
            // InternalCucumber.g:1730:1: ( ( rule__Background__NameAssignment_1 ) )
            {
            // InternalCucumber.g:1730:1: ( ( rule__Background__NameAssignment_1 ) )
            // InternalCucumber.g:1731:2: ( rule__Background__NameAssignment_1 )
            {
             before(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 
            // InternalCucumber.g:1732:2: ( rule__Background__NameAssignment_1 )
            // InternalCucumber.g:1732:3: rule__Background__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Background__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBackgroundAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__1__Impl"


    // $ANTLR start "rule__Background__Group__2"
    // InternalCucumber.g:1740:1: rule__Background__Group__2 : rule__Background__Group__2__Impl rule__Background__Group__3 ;
    public final void rule__Background__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1744:1: ( rule__Background__Group__2__Impl rule__Background__Group__3 )
            // InternalCucumber.g:1745:2: rule__Background__Group__2__Impl rule__Background__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Background__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__2"


    // $ANTLR start "rule__Background__Group__2__Impl"
    // InternalCucumber.g:1752:1: rule__Background__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Background__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1756:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1757:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1757:1: ( RULE_EOL )
            // InternalCucumber.g:1758:2: RULE_EOL
            {
             before(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getBackgroundAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__2__Impl"


    // $ANTLR start "rule__Background__Group__3"
    // InternalCucumber.g:1767:1: rule__Background__Group__3 : rule__Background__Group__3__Impl rule__Background__Group__4 ;
    public final void rule__Background__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1771:1: ( rule__Background__Group__3__Impl rule__Background__Group__4 )
            // InternalCucumber.g:1772:2: rule__Background__Group__3__Impl rule__Background__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Background__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Background__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__3"


    // $ANTLR start "rule__Background__Group__3__Impl"
    // InternalCucumber.g:1779:1: rule__Background__Group__3__Impl : ( ( rule__Background__StatementsAssignment_3 )* ) ;
    public final void rule__Background__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1783:1: ( ( ( rule__Background__StatementsAssignment_3 )* ) )
            // InternalCucumber.g:1784:1: ( ( rule__Background__StatementsAssignment_3 )* )
            {
            // InternalCucumber.g:1784:1: ( ( rule__Background__StatementsAssignment_3 )* )
            // InternalCucumber.g:1785:2: ( rule__Background__StatementsAssignment_3 )*
            {
             before(grammarAccess.getBackgroundAccess().getStatementsAssignment_3()); 
            // InternalCucumber.g:1786:2: ( rule__Background__StatementsAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_WORD && LA25_0<=RULE_STRING)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalCucumber.g:1786:3: rule__Background__StatementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Background__StatementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStatementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__3__Impl"


    // $ANTLR start "rule__Background__Group__4"
    // InternalCucumber.g:1794:1: rule__Background__Group__4 : rule__Background__Group__4__Impl ;
    public final void rule__Background__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1798:1: ( rule__Background__Group__4__Impl )
            // InternalCucumber.g:1799:2: rule__Background__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Background__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__4"


    // $ANTLR start "rule__Background__Group__4__Impl"
    // InternalCucumber.g:1805:1: rule__Background__Group__4__Impl : ( ( rule__Background__StepsAssignment_4 )* ) ;
    public final void rule__Background__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1809:1: ( ( ( rule__Background__StepsAssignment_4 )* ) )
            // InternalCucumber.g:1810:1: ( ( rule__Background__StepsAssignment_4 )* )
            {
            // InternalCucumber.g:1810:1: ( ( rule__Background__StepsAssignment_4 )* )
            // InternalCucumber.g:1811:2: ( rule__Background__StepsAssignment_4 )*
            {
             before(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 
            // InternalCucumber.g:1812:2: ( rule__Background__StepsAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=20 && LA26_0<=25)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalCucumber.g:1812:3: rule__Background__StepsAssignment_4
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Background__StepsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getBackgroundAccess().getStepsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__0"
    // InternalCucumber.g:1821:1: rule__Scenario__Group__0 : rule__Scenario__Group__0__Impl rule__Scenario__Group__1 ;
    public final void rule__Scenario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1825:1: ( rule__Scenario__Group__0__Impl rule__Scenario__Group__1 )
            // InternalCucumber.g:1826:2: rule__Scenario__Group__0__Impl rule__Scenario__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Scenario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0"


    // $ANTLR start "rule__Scenario__Group__0__Impl"
    // InternalCucumber.g:1833:1: rule__Scenario__Group__0__Impl : ( ( rule__Scenario__Group_0__0 )? ) ;
    public final void rule__Scenario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1837:1: ( ( ( rule__Scenario__Group_0__0 )? ) )
            // InternalCucumber.g:1838:1: ( ( rule__Scenario__Group_0__0 )? )
            {
            // InternalCucumber.g:1838:1: ( ( rule__Scenario__Group_0__0 )? )
            // InternalCucumber.g:1839:2: ( rule__Scenario__Group_0__0 )?
            {
             before(grammarAccess.getScenarioAccess().getGroup_0()); 
            // InternalCucumber.g:1840:2: ( rule__Scenario__Group_0__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==26) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCucumber.g:1840:3: rule__Scenario__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scenario__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__0__Impl"


    // $ANTLR start "rule__Scenario__Group__1"
    // InternalCucumber.g:1848:1: rule__Scenario__Group__1 : rule__Scenario__Group__1__Impl rule__Scenario__Group__2 ;
    public final void rule__Scenario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1852:1: ( rule__Scenario__Group__1__Impl rule__Scenario__Group__2 )
            // InternalCucumber.g:1853:2: rule__Scenario__Group__1__Impl rule__Scenario__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Scenario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1"


    // $ANTLR start "rule__Scenario__Group__1__Impl"
    // InternalCucumber.g:1860:1: rule__Scenario__Group__1__Impl : ( 'Scenario:' ) ;
    public final void rule__Scenario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1864:1: ( ( 'Scenario:' ) )
            // InternalCucumber.g:1865:1: ( 'Scenario:' )
            {
            // InternalCucumber.g:1865:1: ( 'Scenario:' )
            // InternalCucumber.g:1866:2: 'Scenario:'
            {
             before(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getScenarioKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__1__Impl"


    // $ANTLR start "rule__Scenario__Group__2"
    // InternalCucumber.g:1875:1: rule__Scenario__Group__2 : rule__Scenario__Group__2__Impl rule__Scenario__Group__3 ;
    public final void rule__Scenario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1879:1: ( rule__Scenario__Group__2__Impl rule__Scenario__Group__3 )
            // InternalCucumber.g:1880:2: rule__Scenario__Group__2__Impl rule__Scenario__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Scenario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2"


    // $ANTLR start "rule__Scenario__Group__2__Impl"
    // InternalCucumber.g:1887:1: rule__Scenario__Group__2__Impl : ( ( rule__Scenario__NameAssignment_2 ) ) ;
    public final void rule__Scenario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1891:1: ( ( ( rule__Scenario__NameAssignment_2 ) ) )
            // InternalCucumber.g:1892:1: ( ( rule__Scenario__NameAssignment_2 ) )
            {
            // InternalCucumber.g:1892:1: ( ( rule__Scenario__NameAssignment_2 ) )
            // InternalCucumber.g:1893:2: ( rule__Scenario__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioAccess().getNameAssignment_2()); 
            // InternalCucumber.g:1894:2: ( rule__Scenario__NameAssignment_2 )
            // InternalCucumber.g:1894:3: rule__Scenario__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__2__Impl"


    // $ANTLR start "rule__Scenario__Group__3"
    // InternalCucumber.g:1902:1: rule__Scenario__Group__3 : rule__Scenario__Group__3__Impl rule__Scenario__Group__4 ;
    public final void rule__Scenario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1906:1: ( rule__Scenario__Group__3__Impl rule__Scenario__Group__4 )
            // InternalCucumber.g:1907:2: rule__Scenario__Group__3__Impl rule__Scenario__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Scenario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3"


    // $ANTLR start "rule__Scenario__Group__3__Impl"
    // InternalCucumber.g:1914:1: rule__Scenario__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1918:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:1919:1: ( RULE_EOL )
            {
            // InternalCucumber.g:1919:1: ( RULE_EOL )
            // InternalCucumber.g:1920:2: RULE_EOL
            {
             before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__3__Impl"


    // $ANTLR start "rule__Scenario__Group__4"
    // InternalCucumber.g:1929:1: rule__Scenario__Group__4 : rule__Scenario__Group__4__Impl rule__Scenario__Group__5 ;
    public final void rule__Scenario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1933:1: ( rule__Scenario__Group__4__Impl rule__Scenario__Group__5 )
            // InternalCucumber.g:1934:2: rule__Scenario__Group__4__Impl rule__Scenario__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Scenario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4"


    // $ANTLR start "rule__Scenario__Group__4__Impl"
    // InternalCucumber.g:1941:1: rule__Scenario__Group__4__Impl : ( ( rule__Scenario__StatementsAssignment_4 )* ) ;
    public final void rule__Scenario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1945:1: ( ( ( rule__Scenario__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:1946:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:1946:1: ( ( rule__Scenario__StatementsAssignment_4 )* )
            // InternalCucumber.g:1947:2: ( rule__Scenario__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:1948:2: ( rule__Scenario__StatementsAssignment_4 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_WORD && LA28_0<=RULE_STRING)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCucumber.g:1948:3: rule__Scenario__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Scenario__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__4__Impl"


    // $ANTLR start "rule__Scenario__Group__5"
    // InternalCucumber.g:1956:1: rule__Scenario__Group__5 : rule__Scenario__Group__5__Impl ;
    public final void rule__Scenario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1960:1: ( rule__Scenario__Group__5__Impl )
            // InternalCucumber.g:1961:2: rule__Scenario__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__5"


    // $ANTLR start "rule__Scenario__Group__5__Impl"
    // InternalCucumber.g:1967:1: rule__Scenario__Group__5__Impl : ( ( rule__Scenario__StepsAssignment_5 )* ) ;
    public final void rule__Scenario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1971:1: ( ( ( rule__Scenario__StepsAssignment_5 )* ) )
            // InternalCucumber.g:1972:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:1972:1: ( ( rule__Scenario__StepsAssignment_5 )* )
            // InternalCucumber.g:1973:2: ( rule__Scenario__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:1974:2: ( rule__Scenario__StepsAssignment_5 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=20 && LA29_0<=25)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCucumber.g:1974:3: rule__Scenario__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Scenario__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getStepsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group__5__Impl"


    // $ANTLR start "rule__Scenario__Group_0__0"
    // InternalCucumber.g:1983:1: rule__Scenario__Group_0__0 : rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 ;
    public final void rule__Scenario__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1987:1: ( rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1 )
            // InternalCucumber.g:1988:2: rule__Scenario__Group_0__0__Impl rule__Scenario__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Scenario__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scenario__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_0__0"


    // $ANTLR start "rule__Scenario__Group_0__0__Impl"
    // InternalCucumber.g:1995:1: rule__Scenario__Group_0__0__Impl : ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Scenario__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:1999:1: ( ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:2000:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:2000:1: ( ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:2001:2: ( ( rule__Scenario__TagsAssignment_0_0 ) ) ( ( rule__Scenario__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:2001:2: ( ( rule__Scenario__TagsAssignment_0_0 ) )
            // InternalCucumber.g:2002:3: ( rule__Scenario__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:2003:3: ( rule__Scenario__TagsAssignment_0_0 )
            // InternalCucumber.g:2003:4: rule__Scenario__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_15);
            rule__Scenario__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:2006:2: ( ( rule__Scenario__TagsAssignment_0_0 )* )
            // InternalCucumber.g:2007:3: ( rule__Scenario__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:2008:3: ( rule__Scenario__TagsAssignment_0_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==26) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCucumber.g:2008:4: rule__Scenario__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Scenario__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getScenarioAccess().getTagsAssignment_0_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_0__0__Impl"


    // $ANTLR start "rule__Scenario__Group_0__1"
    // InternalCucumber.g:2017:1: rule__Scenario__Group_0__1 : rule__Scenario__Group_0__1__Impl ;
    public final void rule__Scenario__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2021:1: ( rule__Scenario__Group_0__1__Impl )
            // InternalCucumber.g:2022:2: rule__Scenario__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scenario__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_0__1"


    // $ANTLR start "rule__Scenario__Group_0__1__Impl"
    // InternalCucumber.g:2028:1: rule__Scenario__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Scenario__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2032:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2033:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2033:1: ( RULE_EOL )
            // InternalCucumber.g:2034:2: RULE_EOL
            {
             before(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__Group_0__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__0"
    // InternalCucumber.g:2044:1: rule__ScenarioOutline__Group__0 : rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 ;
    public final void rule__ScenarioOutline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2048:1: ( rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1 )
            // InternalCucumber.g:2049:2: rule__ScenarioOutline__Group__0__Impl rule__ScenarioOutline__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ScenarioOutline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__0"


    // $ANTLR start "rule__ScenarioOutline__Group__0__Impl"
    // InternalCucumber.g:2056:1: rule__ScenarioOutline__Group__0__Impl : ( ( rule__ScenarioOutline__Group_0__0 )? ) ;
    public final void rule__ScenarioOutline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2060:1: ( ( ( rule__ScenarioOutline__Group_0__0 )? ) )
            // InternalCucumber.g:2061:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            {
            // InternalCucumber.g:2061:1: ( ( rule__ScenarioOutline__Group_0__0 )? )
            // InternalCucumber.g:2062:2: ( rule__ScenarioOutline__Group_0__0 )?
            {
             before(grammarAccess.getScenarioOutlineAccess().getGroup_0()); 
            // InternalCucumber.g:2063:2: ( rule__ScenarioOutline__Group_0__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==26) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalCucumber.g:2063:3: rule__ScenarioOutline__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ScenarioOutline__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScenarioOutlineAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__1"
    // InternalCucumber.g:2071:1: rule__ScenarioOutline__Group__1 : rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 ;
    public final void rule__ScenarioOutline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2075:1: ( rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2 )
            // InternalCucumber.g:2076:2: rule__ScenarioOutline__Group__1__Impl rule__ScenarioOutline__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ScenarioOutline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__1"


    // $ANTLR start "rule__ScenarioOutline__Group__1__Impl"
    // InternalCucumber.g:2083:1: rule__ScenarioOutline__Group__1__Impl : ( 'Scenario Outline:' ) ;
    public final void rule__ScenarioOutline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2087:1: ( ( 'Scenario Outline:' ) )
            // InternalCucumber.g:2088:1: ( 'Scenario Outline:' )
            {
            // InternalCucumber.g:2088:1: ( 'Scenario Outline:' )
            // InternalCucumber.g:2089:2: 'Scenario Outline:'
            {
             before(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getScenarioOutlineAccess().getScenarioOutlineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__1__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__2"
    // InternalCucumber.g:2098:1: rule__ScenarioOutline__Group__2 : rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 ;
    public final void rule__ScenarioOutline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2102:1: ( rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3 )
            // InternalCucumber.g:2103:2: rule__ScenarioOutline__Group__2__Impl rule__ScenarioOutline__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__ScenarioOutline__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__2"


    // $ANTLR start "rule__ScenarioOutline__Group__2__Impl"
    // InternalCucumber.g:2110:1: rule__ScenarioOutline__Group__2__Impl : ( ( rule__ScenarioOutline__NameAssignment_2 ) ) ;
    public final void rule__ScenarioOutline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2114:1: ( ( ( rule__ScenarioOutline__NameAssignment_2 ) ) )
            // InternalCucumber.g:2115:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            {
            // InternalCucumber.g:2115:1: ( ( rule__ScenarioOutline__NameAssignment_2 ) )
            // InternalCucumber.g:2116:2: ( rule__ScenarioOutline__NameAssignment_2 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getNameAssignment_2()); 
            // InternalCucumber.g:2117:2: ( rule__ScenarioOutline__NameAssignment_2 )
            // InternalCucumber.g:2117:3: rule__ScenarioOutline__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__2__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__3"
    // InternalCucumber.g:2125:1: rule__ScenarioOutline__Group__3 : rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 ;
    public final void rule__ScenarioOutline__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2129:1: ( rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4 )
            // InternalCucumber.g:2130:2: rule__ScenarioOutline__Group__3__Impl rule__ScenarioOutline__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__ScenarioOutline__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__3"


    // $ANTLR start "rule__ScenarioOutline__Group__3__Impl"
    // InternalCucumber.g:2137:1: rule__ScenarioOutline__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2141:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2142:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2142:1: ( RULE_EOL )
            // InternalCucumber.g:2143:2: RULE_EOL
            {
             before(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__3__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__4"
    // InternalCucumber.g:2152:1: rule__ScenarioOutline__Group__4 : rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 ;
    public final void rule__ScenarioOutline__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2156:1: ( rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5 )
            // InternalCucumber.g:2157:2: rule__ScenarioOutline__Group__4__Impl rule__ScenarioOutline__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__ScenarioOutline__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__4"


    // $ANTLR start "rule__ScenarioOutline__Group__4__Impl"
    // InternalCucumber.g:2164:1: rule__ScenarioOutline__Group__4__Impl : ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) ;
    public final void rule__ScenarioOutline__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2168:1: ( ( ( rule__ScenarioOutline__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:2169:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:2169:1: ( ( rule__ScenarioOutline__StatementsAssignment_4 )* )
            // InternalCucumber.g:2170:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:2171:2: ( rule__ScenarioOutline__StatementsAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_WORD && LA32_0<=RULE_STRING)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalCucumber.g:2171:3: rule__ScenarioOutline__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ScenarioOutline__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__4__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__5"
    // InternalCucumber.g:2179:1: rule__ScenarioOutline__Group__5 : rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 ;
    public final void rule__ScenarioOutline__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2183:1: ( rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6 )
            // InternalCucumber.g:2184:2: rule__ScenarioOutline__Group__5__Impl rule__ScenarioOutline__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__ScenarioOutline__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__5"


    // $ANTLR start "rule__ScenarioOutline__Group__5__Impl"
    // InternalCucumber.g:2191:1: rule__ScenarioOutline__Group__5__Impl : ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) ;
    public final void rule__ScenarioOutline__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2195:1: ( ( ( rule__ScenarioOutline__StepsAssignment_5 )* ) )
            // InternalCucumber.g:2196:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            {
            // InternalCucumber.g:2196:1: ( ( rule__ScenarioOutline__StepsAssignment_5 )* )
            // InternalCucumber.g:2197:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 
            // InternalCucumber.g:2198:2: ( rule__ScenarioOutline__StepsAssignment_5 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=20 && LA33_0<=25)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCucumber.g:2198:3: rule__ScenarioOutline__StepsAssignment_5
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ScenarioOutline__StepsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getStepsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__5__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group__6"
    // InternalCucumber.g:2206:1: rule__ScenarioOutline__Group__6 : rule__ScenarioOutline__Group__6__Impl ;
    public final void rule__ScenarioOutline__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2210:1: ( rule__ScenarioOutline__Group__6__Impl )
            // InternalCucumber.g:2211:2: rule__ScenarioOutline__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__6"


    // $ANTLR start "rule__ScenarioOutline__Group__6__Impl"
    // InternalCucumber.g:2217:1: rule__ScenarioOutline__Group__6__Impl : ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) ;
    public final void rule__ScenarioOutline__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2221:1: ( ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) ) )
            // InternalCucumber.g:2222:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            {
            // InternalCucumber.g:2222:1: ( ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* ) )
            // InternalCucumber.g:2223:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) ) ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            {
            // InternalCucumber.g:2223:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 ) )
            // InternalCucumber.g:2224:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:2225:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )
            // InternalCucumber.g:2225:4: rule__ScenarioOutline__ExamplesAssignment_6
            {
            pushFollow(FOLLOW_21);
            rule__ScenarioOutline__ExamplesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

            }

            // InternalCucumber.g:2228:2: ( ( rule__ScenarioOutline__ExamplesAssignment_6 )* )
            // InternalCucumber.g:2229:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 
            // InternalCucumber.g:2230:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*
            loop34:
            do {
                int alt34=2;
                alt34 = dfa34.predict(input);
                switch (alt34) {
            	case 1 :
            	    // InternalCucumber.g:2230:4: rule__ScenarioOutline__ExamplesAssignment_6
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ScenarioOutline__ExamplesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getExamplesAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group__6__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_0__0"
    // InternalCucumber.g:2240:1: rule__ScenarioOutline__Group_0__0 : rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 ;
    public final void rule__ScenarioOutline__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2244:1: ( rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1 )
            // InternalCucumber.g:2245:2: rule__ScenarioOutline__Group_0__0__Impl rule__ScenarioOutline__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__ScenarioOutline__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_0__0"


    // $ANTLR start "rule__ScenarioOutline__Group_0__0__Impl"
    // InternalCucumber.g:2252:1: rule__ScenarioOutline__Group_0__0__Impl : ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) ;
    public final void rule__ScenarioOutline__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2256:1: ( ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:2257:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:2257:1: ( ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:2258:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) ) ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:2258:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 ) )
            // InternalCucumber.g:2259:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:2260:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )
            // InternalCucumber.g:2260:4: rule__ScenarioOutline__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_15);
            rule__ScenarioOutline__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:2263:2: ( ( rule__ScenarioOutline__TagsAssignment_0_0 )* )
            // InternalCucumber.g:2264:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:2265:3: ( rule__ScenarioOutline__TagsAssignment_0_0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCucumber.g:2265:4: rule__ScenarioOutline__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ScenarioOutline__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getScenarioOutlineAccess().getTagsAssignment_0_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_0__0__Impl"


    // $ANTLR start "rule__ScenarioOutline__Group_0__1"
    // InternalCucumber.g:2274:1: rule__ScenarioOutline__Group_0__1 : rule__ScenarioOutline__Group_0__1__Impl ;
    public final void rule__ScenarioOutline__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2278:1: ( rule__ScenarioOutline__Group_0__1__Impl )
            // InternalCucumber.g:2279:2: rule__ScenarioOutline__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ScenarioOutline__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_0__1"


    // $ANTLR start "rule__ScenarioOutline__Group_0__1__Impl"
    // InternalCucumber.g:2285:1: rule__ScenarioOutline__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__ScenarioOutline__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2289:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2290:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2290:1: ( RULE_EOL )
            // InternalCucumber.g:2291:2: RULE_EOL
            {
             before(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getScenarioOutlineAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__Group_0__1__Impl"


    // $ANTLR start "rule__Examples__Group__0"
    // InternalCucumber.g:2301:1: rule__Examples__Group__0 : rule__Examples__Group__0__Impl rule__Examples__Group__1 ;
    public final void rule__Examples__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2305:1: ( rule__Examples__Group__0__Impl rule__Examples__Group__1 )
            // InternalCucumber.g:2306:2: rule__Examples__Group__0__Impl rule__Examples__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Examples__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__0"


    // $ANTLR start "rule__Examples__Group__0__Impl"
    // InternalCucumber.g:2313:1: rule__Examples__Group__0__Impl : ( ( rule__Examples__Group_0__0 )? ) ;
    public final void rule__Examples__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2317:1: ( ( ( rule__Examples__Group_0__0 )? ) )
            // InternalCucumber.g:2318:1: ( ( rule__Examples__Group_0__0 )? )
            {
            // InternalCucumber.g:2318:1: ( ( rule__Examples__Group_0__0 )? )
            // InternalCucumber.g:2319:2: ( rule__Examples__Group_0__0 )?
            {
             before(grammarAccess.getExamplesAccess().getGroup_0()); 
            // InternalCucumber.g:2320:2: ( rule__Examples__Group_0__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCucumber.g:2320:3: rule__Examples__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Examples__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExamplesAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__0__Impl"


    // $ANTLR start "rule__Examples__Group__1"
    // InternalCucumber.g:2328:1: rule__Examples__Group__1 : rule__Examples__Group__1__Impl rule__Examples__Group__2 ;
    public final void rule__Examples__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2332:1: ( rule__Examples__Group__1__Impl rule__Examples__Group__2 )
            // InternalCucumber.g:2333:2: rule__Examples__Group__1__Impl rule__Examples__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Examples__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__1"


    // $ANTLR start "rule__Examples__Group__1__Impl"
    // InternalCucumber.g:2340:1: rule__Examples__Group__1__Impl : ( 'Examples:' ) ;
    public final void rule__Examples__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2344:1: ( ( 'Examples:' ) )
            // InternalCucumber.g:2345:1: ( 'Examples:' )
            {
            // InternalCucumber.g:2345:1: ( 'Examples:' )
            // InternalCucumber.g:2346:2: 'Examples:'
            {
             before(grammarAccess.getExamplesAccess().getExamplesKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getExamplesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__1__Impl"


    // $ANTLR start "rule__Examples__Group__2"
    // InternalCucumber.g:2355:1: rule__Examples__Group__2 : rule__Examples__Group__2__Impl rule__Examples__Group__3 ;
    public final void rule__Examples__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2359:1: ( rule__Examples__Group__2__Impl rule__Examples__Group__3 )
            // InternalCucumber.g:2360:2: rule__Examples__Group__2__Impl rule__Examples__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Examples__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__2"


    // $ANTLR start "rule__Examples__Group__2__Impl"
    // InternalCucumber.g:2367:1: rule__Examples__Group__2__Impl : ( ( rule__Examples__NameAssignment_2 ) ) ;
    public final void rule__Examples__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2371:1: ( ( ( rule__Examples__NameAssignment_2 ) ) )
            // InternalCucumber.g:2372:1: ( ( rule__Examples__NameAssignment_2 ) )
            {
            // InternalCucumber.g:2372:1: ( ( rule__Examples__NameAssignment_2 ) )
            // InternalCucumber.g:2373:2: ( rule__Examples__NameAssignment_2 )
            {
             before(grammarAccess.getExamplesAccess().getNameAssignment_2()); 
            // InternalCucumber.g:2374:2: ( rule__Examples__NameAssignment_2 )
            // InternalCucumber.g:2374:3: rule__Examples__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Examples__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__2__Impl"


    // $ANTLR start "rule__Examples__Group__3"
    // InternalCucumber.g:2382:1: rule__Examples__Group__3 : rule__Examples__Group__3__Impl rule__Examples__Group__4 ;
    public final void rule__Examples__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2386:1: ( rule__Examples__Group__3__Impl rule__Examples__Group__4 )
            // InternalCucumber.g:2387:2: rule__Examples__Group__3__Impl rule__Examples__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Examples__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__3"


    // $ANTLR start "rule__Examples__Group__3__Impl"
    // InternalCucumber.g:2394:1: rule__Examples__Group__3__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2398:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2399:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2399:1: ( RULE_EOL )
            // InternalCucumber.g:2400:2: RULE_EOL
            {
             before(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_3()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__3__Impl"


    // $ANTLR start "rule__Examples__Group__4"
    // InternalCucumber.g:2409:1: rule__Examples__Group__4 : rule__Examples__Group__4__Impl rule__Examples__Group__5 ;
    public final void rule__Examples__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2413:1: ( rule__Examples__Group__4__Impl rule__Examples__Group__5 )
            // InternalCucumber.g:2414:2: rule__Examples__Group__4__Impl rule__Examples__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Examples__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__4"


    // $ANTLR start "rule__Examples__Group__4__Impl"
    // InternalCucumber.g:2421:1: rule__Examples__Group__4__Impl : ( ( rule__Examples__StatementsAssignment_4 )* ) ;
    public final void rule__Examples__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2425:1: ( ( ( rule__Examples__StatementsAssignment_4 )* ) )
            // InternalCucumber.g:2426:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            {
            // InternalCucumber.g:2426:1: ( ( rule__Examples__StatementsAssignment_4 )* )
            // InternalCucumber.g:2427:2: ( rule__Examples__StatementsAssignment_4 )*
            {
             before(grammarAccess.getExamplesAccess().getStatementsAssignment_4()); 
            // InternalCucumber.g:2428:2: ( rule__Examples__StatementsAssignment_4 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_WORD && LA37_0<=RULE_STRING)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalCucumber.g:2428:3: rule__Examples__StatementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Examples__StatementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getExamplesAccess().getStatementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__4__Impl"


    // $ANTLR start "rule__Examples__Group__5"
    // InternalCucumber.g:2436:1: rule__Examples__Group__5 : rule__Examples__Group__5__Impl ;
    public final void rule__Examples__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2440:1: ( rule__Examples__Group__5__Impl )
            // InternalCucumber.g:2441:2: rule__Examples__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__5"


    // $ANTLR start "rule__Examples__Group__5__Impl"
    // InternalCucumber.g:2447:1: rule__Examples__Group__5__Impl : ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) ;
    public final void rule__Examples__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2451:1: ( ( ( rule__Examples__TheExamplesTableAssignment_5 ) ) )
            // InternalCucumber.g:2452:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            {
            // InternalCucumber.g:2452:1: ( ( rule__Examples__TheExamplesTableAssignment_5 ) )
            // InternalCucumber.g:2453:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_5()); 
            // InternalCucumber.g:2454:2: ( rule__Examples__TheExamplesTableAssignment_5 )
            // InternalCucumber.g:2454:3: rule__Examples__TheExamplesTableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Examples__TheExamplesTableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getTheExamplesTableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group__5__Impl"


    // $ANTLR start "rule__Examples__Group_0__0"
    // InternalCucumber.g:2463:1: rule__Examples__Group_0__0 : rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1 ;
    public final void rule__Examples__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2467:1: ( rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1 )
            // InternalCucumber.g:2468:2: rule__Examples__Group_0__0__Impl rule__Examples__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__Examples__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Examples__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_0__0"


    // $ANTLR start "rule__Examples__Group_0__0__Impl"
    // InternalCucumber.g:2475:1: rule__Examples__Group_0__0__Impl : ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) ) ;
    public final void rule__Examples__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2479:1: ( ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) ) )
            // InternalCucumber.g:2480:1: ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) )
            {
            // InternalCucumber.g:2480:1: ( ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* ) )
            // InternalCucumber.g:2481:2: ( ( rule__Examples__TagsAssignment_0_0 ) ) ( ( rule__Examples__TagsAssignment_0_0 )* )
            {
            // InternalCucumber.g:2481:2: ( ( rule__Examples__TagsAssignment_0_0 ) )
            // InternalCucumber.g:2482:3: ( rule__Examples__TagsAssignment_0_0 )
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:2483:3: ( rule__Examples__TagsAssignment_0_0 )
            // InternalCucumber.g:2483:4: rule__Examples__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_15);
            rule__Examples__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 

            }

            // InternalCucumber.g:2486:2: ( ( rule__Examples__TagsAssignment_0_0 )* )
            // InternalCucumber.g:2487:3: ( rule__Examples__TagsAssignment_0_0 )*
            {
             before(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 
            // InternalCucumber.g:2488:3: ( rule__Examples__TagsAssignment_0_0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalCucumber.g:2488:4: rule__Examples__TagsAssignment_0_0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Examples__TagsAssignment_0_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getExamplesAccess().getTagsAssignment_0_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_0__0__Impl"


    // $ANTLR start "rule__Examples__Group_0__1"
    // InternalCucumber.g:2497:1: rule__Examples__Group_0__1 : rule__Examples__Group_0__1__Impl ;
    public final void rule__Examples__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2501:1: ( rule__Examples__Group_0__1__Impl )
            // InternalCucumber.g:2502:2: rule__Examples__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Examples__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_0__1"


    // $ANTLR start "rule__Examples__Group_0__1__Impl"
    // InternalCucumber.g:2508:1: rule__Examples__Group_0__1__Impl : ( RULE_EOL ) ;
    public final void rule__Examples__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2512:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2513:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2513:1: ( RULE_EOL )
            // InternalCucumber.g:2514:2: RULE_EOL
            {
             before(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_0_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getExamplesAccess().getEOLTerminalRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__Group_0__1__Impl"


    // $ANTLR start "rule__Row__Group__0"
    // InternalCucumber.g:2524:1: rule__Row__Group__0 : rule__Row__Group__0__Impl rule__Row__Group__1 ;
    public final void rule__Row__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2528:1: ( rule__Row__Group__0__Impl rule__Row__Group__1 )
            // InternalCucumber.g:2529:2: rule__Row__Group__0__Impl rule__Row__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Row__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0"


    // $ANTLR start "rule__Row__Group__0__Impl"
    // InternalCucumber.g:2536:1: rule__Row__Group__0__Impl : ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) ;
    public final void rule__Row__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2540:1: ( ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) ) )
            // InternalCucumber.g:2541:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            {
            // InternalCucumber.g:2541:1: ( ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* ) )
            // InternalCucumber.g:2542:2: ( ( rule__Row__CellsAssignment_0 ) ) ( ( rule__Row__CellsAssignment_0 )* )
            {
            // InternalCucumber.g:2542:2: ( ( rule__Row__CellsAssignment_0 ) )
            // InternalCucumber.g:2543:3: ( rule__Row__CellsAssignment_0 )
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:2544:3: ( rule__Row__CellsAssignment_0 )
            // InternalCucumber.g:2544:4: rule__Row__CellsAssignment_0
            {
            pushFollow(FOLLOW_3);
            rule__Row__CellsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }

            // InternalCucumber.g:2547:2: ( ( rule__Row__CellsAssignment_0 )* )
            // InternalCucumber.g:2548:3: ( rule__Row__CellsAssignment_0 )*
            {
             before(grammarAccess.getRowAccess().getCellsAssignment_0()); 
            // InternalCucumber.g:2549:3: ( rule__Row__CellsAssignment_0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==18) ) {
                    int LA39_1 = input.LA(2);

                    if ( ((LA39_1>=RULE_WORD && LA39_1<=RULE_STRING)) ) {
                        alt39=1;
                    }


                }


                switch (alt39) {
            	case 1 :
            	    // InternalCucumber.g:2549:4: rule__Row__CellsAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Row__CellsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getRowAccess().getCellsAssignment_0()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__0__Impl"


    // $ANTLR start "rule__Row__Group__1"
    // InternalCucumber.g:2558:1: rule__Row__Group__1 : rule__Row__Group__1__Impl rule__Row__Group__2 ;
    public final void rule__Row__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2562:1: ( rule__Row__Group__1__Impl rule__Row__Group__2 )
            // InternalCucumber.g:2563:2: rule__Row__Group__1__Impl rule__Row__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Row__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Row__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1"


    // $ANTLR start "rule__Row__Group__1__Impl"
    // InternalCucumber.g:2570:1: rule__Row__Group__1__Impl : ( '|' ) ;
    public final void rule__Row__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2574:1: ( ( '|' ) )
            // InternalCucumber.g:2575:1: ( '|' )
            {
            // InternalCucumber.g:2575:1: ( '|' )
            // InternalCucumber.g:2576:2: '|'
            {
             before(grammarAccess.getRowAccess().getVerticalLineKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getVerticalLineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__1__Impl"


    // $ANTLR start "rule__Row__Group__2"
    // InternalCucumber.g:2585:1: rule__Row__Group__2 : rule__Row__Group__2__Impl ;
    public final void rule__Row__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2589:1: ( rule__Row__Group__2__Impl )
            // InternalCucumber.g:2590:2: rule__Row__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Row__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2"


    // $ANTLR start "rule__Row__Group__2__Impl"
    // InternalCucumber.g:2596:1: rule__Row__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Row__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2600:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2601:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2601:1: ( RULE_EOL )
            // InternalCucumber.g:2602:2: RULE_EOL
            {
             before(grammarAccess.getRowAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getRowAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__Group__2__Impl"


    // $ANTLR start "rule__Cell__Group__0"
    // InternalCucumber.g:2612:1: rule__Cell__Group__0 : rule__Cell__Group__0__Impl rule__Cell__Group__1 ;
    public final void rule__Cell__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2616:1: ( rule__Cell__Group__0__Impl rule__Cell__Group__1 )
            // InternalCucumber.g:2617:2: rule__Cell__Group__0__Impl rule__Cell__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Cell__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cell__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0"


    // $ANTLR start "rule__Cell__Group__0__Impl"
    // InternalCucumber.g:2624:1: rule__Cell__Group__0__Impl : ( '|' ) ;
    public final void rule__Cell__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2628:1: ( ( '|' ) )
            // InternalCucumber.g:2629:1: ( '|' )
            {
            // InternalCucumber.g:2629:1: ( '|' )
            // InternalCucumber.g:2630:2: '|'
            {
             before(grammarAccess.getCellAccess().getVerticalLineKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCellAccess().getVerticalLineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__0__Impl"


    // $ANTLR start "rule__Cell__Group__1"
    // InternalCucumber.g:2639:1: rule__Cell__Group__1 : rule__Cell__Group__1__Impl ;
    public final void rule__Cell__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2643:1: ( rule__Cell__Group__1__Impl )
            // InternalCucumber.g:2644:2: rule__Cell__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cell__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1"


    // $ANTLR start "rule__Cell__Group__1__Impl"
    // InternalCucumber.g:2650:1: rule__Cell__Group__1__Impl : ( ( rule__Cell__NameAssignment_1 ) ) ;
    public final void rule__Cell__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2654:1: ( ( ( rule__Cell__NameAssignment_1 ) ) )
            // InternalCucumber.g:2655:1: ( ( rule__Cell__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2655:1: ( ( rule__Cell__NameAssignment_1 ) )
            // InternalCucumber.g:2656:2: ( rule__Cell__NameAssignment_1 )
            {
             before(grammarAccess.getCellAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2657:2: ( rule__Cell__NameAssignment_1 )
            // InternalCucumber.g:2657:3: rule__Cell__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cell__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCellAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__Group__1__Impl"


    // $ANTLR start "rule__DocString__Group__0"
    // InternalCucumber.g:2666:1: rule__DocString__Group__0 : rule__DocString__Group__0__Impl rule__DocString__Group__1 ;
    public final void rule__DocString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2670:1: ( rule__DocString__Group__0__Impl rule__DocString__Group__1 )
            // InternalCucumber.g:2671:2: rule__DocString__Group__0__Impl rule__DocString__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DocString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__0"


    // $ANTLR start "rule__DocString__Group__0__Impl"
    // InternalCucumber.g:2678:1: rule__DocString__Group__0__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2682:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:2683:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:2683:1: ( '\"\"\"' )
            // InternalCucumber.g:2684:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__0__Impl"


    // $ANTLR start "rule__DocString__Group__1"
    // InternalCucumber.g:2693:1: rule__DocString__Group__1 : rule__DocString__Group__1__Impl rule__DocString__Group__2 ;
    public final void rule__DocString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2697:1: ( rule__DocString__Group__1__Impl rule__DocString__Group__2 )
            // InternalCucumber.g:2698:2: rule__DocString__Group__1__Impl rule__DocString__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DocString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__1"


    // $ANTLR start "rule__DocString__Group__1__Impl"
    // InternalCucumber.g:2705:1: rule__DocString__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2709:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2710:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2710:1: ( RULE_EOL )
            // InternalCucumber.g:2711:2: RULE_EOL
            {
             before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__1__Impl"


    // $ANTLR start "rule__DocString__Group__2"
    // InternalCucumber.g:2720:1: rule__DocString__Group__2 : rule__DocString__Group__2__Impl rule__DocString__Group__3 ;
    public final void rule__DocString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2724:1: ( rule__DocString__Group__2__Impl rule__DocString__Group__3 )
            // InternalCucumber.g:2725:2: rule__DocString__Group__2__Impl rule__DocString__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__DocString__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocString__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__2"


    // $ANTLR start "rule__DocString__Group__2__Impl"
    // InternalCucumber.g:2732:1: rule__DocString__Group__2__Impl : ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) ;
    public final void rule__DocString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2736:1: ( ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) ) )
            // InternalCucumber.g:2737:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            {
            // InternalCucumber.g:2737:1: ( ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* ) )
            // InternalCucumber.g:2738:2: ( ( rule__DocString__LinesAssignment_2 ) ) ( ( rule__DocString__LinesAssignment_2 )* )
            {
            // InternalCucumber.g:2738:2: ( ( rule__DocString__LinesAssignment_2 ) )
            // InternalCucumber.g:2739:3: ( rule__DocString__LinesAssignment_2 )
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalCucumber.g:2740:3: ( rule__DocString__LinesAssignment_2 )
            // InternalCucumber.g:2740:4: rule__DocString__LinesAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__DocString__LinesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 

            }

            // InternalCucumber.g:2743:2: ( ( rule__DocString__LinesAssignment_2 )* )
            // InternalCucumber.g:2744:3: ( rule__DocString__LinesAssignment_2 )*
            {
             before(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 
            // InternalCucumber.g:2745:3: ( rule__DocString__LinesAssignment_2 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==EOF||(LA40_0>=RULE_WORD && LA40_0<=RULE_EOL)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalCucumber.g:2745:4: rule__DocString__LinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DocString__LinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getDocStringAccess().getLinesAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__2__Impl"


    // $ANTLR start "rule__DocString__Group__3"
    // InternalCucumber.g:2754:1: rule__DocString__Group__3 : rule__DocString__Group__3__Impl rule__DocString__Group__4 ;
    public final void rule__DocString__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2758:1: ( rule__DocString__Group__3__Impl rule__DocString__Group__4 )
            // InternalCucumber.g:2759:2: rule__DocString__Group__3__Impl rule__DocString__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DocString__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DocString__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__3"


    // $ANTLR start "rule__DocString__Group__3__Impl"
    // InternalCucumber.g:2766:1: rule__DocString__Group__3__Impl : ( '\"\"\"' ) ;
    public final void rule__DocString__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2770:1: ( ( '\"\"\"' ) )
            // InternalCucumber.g:2771:1: ( '\"\"\"' )
            {
            // InternalCucumber.g:2771:1: ( '\"\"\"' )
            // InternalCucumber.g:2772:2: '\"\"\"'
            {
             before(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getQuotationMarkQuotationMarkQuotationMarkKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__3__Impl"


    // $ANTLR start "rule__DocString__Group__4"
    // InternalCucumber.g:2781:1: rule__DocString__Group__4 : rule__DocString__Group__4__Impl ;
    public final void rule__DocString__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2785:1: ( rule__DocString__Group__4__Impl )
            // InternalCucumber.g:2786:2: rule__DocString__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DocString__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__4"


    // $ANTLR start "rule__DocString__Group__4__Impl"
    // InternalCucumber.g:2792:1: rule__DocString__Group__4__Impl : ( RULE_EOL ) ;
    public final void rule__DocString__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2796:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2797:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2797:1: ( RULE_EOL )
            // InternalCucumber.g:2798:2: RULE_EOL
            {
             before(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getDocStringAccess().getEOLTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__Group__4__Impl"


    // $ANTLR start "rule__Given__Group__0"
    // InternalCucumber.g:2808:1: rule__Given__Group__0 : rule__Given__Group__0__Impl rule__Given__Group__1 ;
    public final void rule__Given__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2812:1: ( rule__Given__Group__0__Impl rule__Given__Group__1 )
            // InternalCucumber.g:2813:2: rule__Given__Group__0__Impl rule__Given__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Given__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__0"


    // $ANTLR start "rule__Given__Group__0__Impl"
    // InternalCucumber.g:2820:1: rule__Given__Group__0__Impl : ( 'Given' ) ;
    public final void rule__Given__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2824:1: ( ( 'Given' ) )
            // InternalCucumber.g:2825:1: ( 'Given' )
            {
            // InternalCucumber.g:2825:1: ( 'Given' )
            // InternalCucumber.g:2826:2: 'Given'
            {
             before(grammarAccess.getGivenAccess().getGivenKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getGivenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__0__Impl"


    // $ANTLR start "rule__Given__Group__1"
    // InternalCucumber.g:2835:1: rule__Given__Group__1 : rule__Given__Group__1__Impl rule__Given__Group__2 ;
    public final void rule__Given__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2839:1: ( rule__Given__Group__1__Impl rule__Given__Group__2 )
            // InternalCucumber.g:2840:2: rule__Given__Group__1__Impl rule__Given__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Given__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__1"


    // $ANTLR start "rule__Given__Group__1__Impl"
    // InternalCucumber.g:2847:1: rule__Given__Group__1__Impl : ( ( rule__Given__NameAssignment_1 ) ) ;
    public final void rule__Given__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2851:1: ( ( ( rule__Given__NameAssignment_1 ) ) )
            // InternalCucumber.g:2852:1: ( ( rule__Given__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2852:1: ( ( rule__Given__NameAssignment_1 ) )
            // InternalCucumber.g:2853:2: ( rule__Given__NameAssignment_1 )
            {
             before(grammarAccess.getGivenAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2854:2: ( rule__Given__NameAssignment_1 )
            // InternalCucumber.g:2854:3: rule__Given__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Given__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGivenAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__1__Impl"


    // $ANTLR start "rule__Given__Group__2"
    // InternalCucumber.g:2862:1: rule__Given__Group__2 : rule__Given__Group__2__Impl rule__Given__Group__3 ;
    public final void rule__Given__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2866:1: ( rule__Given__Group__2__Impl rule__Given__Group__3 )
            // InternalCucumber.g:2867:2: rule__Given__Group__2__Impl rule__Given__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Given__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Given__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__2"


    // $ANTLR start "rule__Given__Group__2__Impl"
    // InternalCucumber.g:2874:1: rule__Given__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Given__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2878:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2879:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2879:1: ( RULE_EOL )
            // InternalCucumber.g:2880:2: RULE_EOL
            {
             before(grammarAccess.getGivenAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getGivenAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__2__Impl"


    // $ANTLR start "rule__Given__Group__3"
    // InternalCucumber.g:2889:1: rule__Given__Group__3 : rule__Given__Group__3__Impl ;
    public final void rule__Given__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2893:1: ( rule__Given__Group__3__Impl )
            // InternalCucumber.g:2894:2: rule__Given__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Given__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__3"


    // $ANTLR start "rule__Given__Group__3__Impl"
    // InternalCucumber.g:2900:1: rule__Given__Group__3__Impl : ( ( rule__Given__Alternatives_3 )? ) ;
    public final void rule__Given__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2904:1: ( ( ( rule__Given__Alternatives_3 )? ) )
            // InternalCucumber.g:2905:1: ( ( rule__Given__Alternatives_3 )? )
            {
            // InternalCucumber.g:2905:1: ( ( rule__Given__Alternatives_3 )? )
            // InternalCucumber.g:2906:2: ( rule__Given__Alternatives_3 )?
            {
             before(grammarAccess.getGivenAccess().getAlternatives_3()); 
            // InternalCucumber.g:2907:2: ( rule__Given__Alternatives_3 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=18 && LA41_0<=19)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCucumber.g:2907:3: rule__Given__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Given__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGivenAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__Group__3__Impl"


    // $ANTLR start "rule__When__Group__0"
    // InternalCucumber.g:2916:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2920:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalCucumber.g:2921:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__When__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__0"


    // $ANTLR start "rule__When__Group__0__Impl"
    // InternalCucumber.g:2928:1: rule__When__Group__0__Impl : ( 'When' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2932:1: ( ( 'When' ) )
            // InternalCucumber.g:2933:1: ( 'When' )
            {
            // InternalCucumber.g:2933:1: ( 'When' )
            // InternalCucumber.g:2934:2: 'When'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__0__Impl"


    // $ANTLR start "rule__When__Group__1"
    // InternalCucumber.g:2943:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2947:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalCucumber.g:2948:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__When__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__1"


    // $ANTLR start "rule__When__Group__1__Impl"
    // InternalCucumber.g:2955:1: rule__When__Group__1__Impl : ( ( rule__When__NameAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2959:1: ( ( ( rule__When__NameAssignment_1 ) ) )
            // InternalCucumber.g:2960:1: ( ( rule__When__NameAssignment_1 ) )
            {
            // InternalCucumber.g:2960:1: ( ( rule__When__NameAssignment_1 ) )
            // InternalCucumber.g:2961:2: ( rule__When__NameAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getNameAssignment_1()); 
            // InternalCucumber.g:2962:2: ( rule__When__NameAssignment_1 )
            // InternalCucumber.g:2962:3: rule__When__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__When__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__1__Impl"


    // $ANTLR start "rule__When__Group__2"
    // InternalCucumber.g:2970:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2974:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalCucumber.g:2975:2: rule__When__Group__2__Impl rule__When__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__When__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__2"


    // $ANTLR start "rule__When__Group__2__Impl"
    // InternalCucumber.g:2982:1: rule__When__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:2986:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:2987:1: ( RULE_EOL )
            {
            // InternalCucumber.g:2987:1: ( RULE_EOL )
            // InternalCucumber.g:2988:2: RULE_EOL
            {
             before(grammarAccess.getWhenAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__2__Impl"


    // $ANTLR start "rule__When__Group__3"
    // InternalCucumber.g:2997:1: rule__When__Group__3 : rule__When__Group__3__Impl ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3001:1: ( rule__When__Group__3__Impl )
            // InternalCucumber.g:3002:2: rule__When__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__3"


    // $ANTLR start "rule__When__Group__3__Impl"
    // InternalCucumber.g:3008:1: rule__When__Group__3__Impl : ( ( rule__When__Alternatives_3 )? ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3012:1: ( ( ( rule__When__Alternatives_3 )? ) )
            // InternalCucumber.g:3013:1: ( ( rule__When__Alternatives_3 )? )
            {
            // InternalCucumber.g:3013:1: ( ( rule__When__Alternatives_3 )? )
            // InternalCucumber.g:3014:2: ( rule__When__Alternatives_3 )?
            {
             before(grammarAccess.getWhenAccess().getAlternatives_3()); 
            // InternalCucumber.g:3015:2: ( rule__When__Alternatives_3 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=18 && LA42_0<=19)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalCucumber.g:3015:3: rule__When__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__When__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhenAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__3__Impl"


    // $ANTLR start "rule__Then__Group__0"
    // InternalCucumber.g:3024:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3028:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalCucumber.g:3029:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Then__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__0"


    // $ANTLR start "rule__Then__Group__0__Impl"
    // InternalCucumber.g:3036:1: rule__Then__Group__0__Impl : ( 'Then' ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3040:1: ( ( 'Then' ) )
            // InternalCucumber.g:3041:1: ( 'Then' )
            {
            // InternalCucumber.g:3041:1: ( 'Then' )
            // InternalCucumber.g:3042:2: 'Then'
            {
             before(grammarAccess.getThenAccess().getThenKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getThenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__0__Impl"


    // $ANTLR start "rule__Then__Group__1"
    // InternalCucumber.g:3051:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3055:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalCucumber.g:3056:2: rule__Then__Group__1__Impl rule__Then__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Then__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__1"


    // $ANTLR start "rule__Then__Group__1__Impl"
    // InternalCucumber.g:3063:1: rule__Then__Group__1__Impl : ( ( rule__Then__NameAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3067:1: ( ( ( rule__Then__NameAssignment_1 ) ) )
            // InternalCucumber.g:3068:1: ( ( rule__Then__NameAssignment_1 ) )
            {
            // InternalCucumber.g:3068:1: ( ( rule__Then__NameAssignment_1 ) )
            // InternalCucumber.g:3069:2: ( rule__Then__NameAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getNameAssignment_1()); 
            // InternalCucumber.g:3070:2: ( rule__Then__NameAssignment_1 )
            // InternalCucumber.g:3070:3: rule__Then__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Then__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__1__Impl"


    // $ANTLR start "rule__Then__Group__2"
    // InternalCucumber.g:3078:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3082:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalCucumber.g:3083:2: rule__Then__Group__2__Impl rule__Then__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Then__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__2"


    // $ANTLR start "rule__Then__Group__2__Impl"
    // InternalCucumber.g:3090:1: rule__Then__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3094:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:3095:1: ( RULE_EOL )
            {
            // InternalCucumber.g:3095:1: ( RULE_EOL )
            // InternalCucumber.g:3096:2: RULE_EOL
            {
             before(grammarAccess.getThenAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__2__Impl"


    // $ANTLR start "rule__Then__Group__3"
    // InternalCucumber.g:3105:1: rule__Then__Group__3 : rule__Then__Group__3__Impl ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3109:1: ( rule__Then__Group__3__Impl )
            // InternalCucumber.g:3110:2: rule__Then__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__3"


    // $ANTLR start "rule__Then__Group__3__Impl"
    // InternalCucumber.g:3116:1: rule__Then__Group__3__Impl : ( ( rule__Then__Alternatives_3 )? ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3120:1: ( ( ( rule__Then__Alternatives_3 )? ) )
            // InternalCucumber.g:3121:1: ( ( rule__Then__Alternatives_3 )? )
            {
            // InternalCucumber.g:3121:1: ( ( rule__Then__Alternatives_3 )? )
            // InternalCucumber.g:3122:2: ( rule__Then__Alternatives_3 )?
            {
             before(grammarAccess.getThenAccess().getAlternatives_3()); 
            // InternalCucumber.g:3123:2: ( rule__Then__Alternatives_3 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=18 && LA43_0<=19)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalCucumber.g:3123:3: rule__Then__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Then__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getThenAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__3__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalCucumber.g:3132:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3136:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalCucumber.g:3137:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalCucumber.g:3144:1: rule__And__Group__0__Impl : ( 'And' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3148:1: ( ( 'And' ) )
            // InternalCucumber.g:3149:1: ( 'And' )
            {
            // InternalCucumber.g:3149:1: ( 'And' )
            // InternalCucumber.g:3150:2: 'And'
            {
             before(grammarAccess.getAndAccess().getAndKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getAndKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalCucumber.g:3159:1: rule__And__Group__1 : rule__And__Group__1__Impl rule__And__Group__2 ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3163:1: ( rule__And__Group__1__Impl rule__And__Group__2 )
            // InternalCucumber.g:3164:2: rule__And__Group__1__Impl rule__And__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__And__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalCucumber.g:3171:1: rule__And__Group__1__Impl : ( ( rule__And__NameAssignment_1 ) ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3175:1: ( ( ( rule__And__NameAssignment_1 ) ) )
            // InternalCucumber.g:3176:1: ( ( rule__And__NameAssignment_1 ) )
            {
            // InternalCucumber.g:3176:1: ( ( rule__And__NameAssignment_1 ) )
            // InternalCucumber.g:3177:2: ( rule__And__NameAssignment_1 )
            {
             before(grammarAccess.getAndAccess().getNameAssignment_1()); 
            // InternalCucumber.g:3178:2: ( rule__And__NameAssignment_1 )
            // InternalCucumber.g:3178:3: rule__And__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__And__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group__2"
    // InternalCucumber.g:3186:1: rule__And__Group__2 : rule__And__Group__2__Impl rule__And__Group__3 ;
    public final void rule__And__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3190:1: ( rule__And__Group__2__Impl rule__And__Group__3 )
            // InternalCucumber.g:3191:2: rule__And__Group__2__Impl rule__And__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__And__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__2"


    // $ANTLR start "rule__And__Group__2__Impl"
    // InternalCucumber.g:3198:1: rule__And__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__And__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3202:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:3203:1: ( RULE_EOL )
            {
            // InternalCucumber.g:3203:1: ( RULE_EOL )
            // InternalCucumber.g:3204:2: RULE_EOL
            {
             before(grammarAccess.getAndAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__2__Impl"


    // $ANTLR start "rule__And__Group__3"
    // InternalCucumber.g:3213:1: rule__And__Group__3 : rule__And__Group__3__Impl ;
    public final void rule__And__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3217:1: ( rule__And__Group__3__Impl )
            // InternalCucumber.g:3218:2: rule__And__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__3"


    // $ANTLR start "rule__And__Group__3__Impl"
    // InternalCucumber.g:3224:1: rule__And__Group__3__Impl : ( ( rule__And__Alternatives_3 )? ) ;
    public final void rule__And__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3228:1: ( ( ( rule__And__Alternatives_3 )? ) )
            // InternalCucumber.g:3229:1: ( ( rule__And__Alternatives_3 )? )
            {
            // InternalCucumber.g:3229:1: ( ( rule__And__Alternatives_3 )? )
            // InternalCucumber.g:3230:2: ( rule__And__Alternatives_3 )?
            {
             before(grammarAccess.getAndAccess().getAlternatives_3()); 
            // InternalCucumber.g:3231:2: ( rule__And__Alternatives_3 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=18 && LA44_0<=19)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCucumber.g:3231:3: rule__And__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__And__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__3__Impl"


    // $ANTLR start "rule__But__Group__0"
    // InternalCucumber.g:3240:1: rule__But__Group__0 : rule__But__Group__0__Impl rule__But__Group__1 ;
    public final void rule__But__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3244:1: ( rule__But__Group__0__Impl rule__But__Group__1 )
            // InternalCucumber.g:3245:2: rule__But__Group__0__Impl rule__But__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__But__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__But__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__0"


    // $ANTLR start "rule__But__Group__0__Impl"
    // InternalCucumber.g:3252:1: rule__But__Group__0__Impl : ( 'But' ) ;
    public final void rule__But__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3256:1: ( ( 'But' ) )
            // InternalCucumber.g:3257:1: ( 'But' )
            {
            // InternalCucumber.g:3257:1: ( 'But' )
            // InternalCucumber.g:3258:2: 'But'
            {
             before(grammarAccess.getButAccess().getButKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getButAccess().getButKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__0__Impl"


    // $ANTLR start "rule__But__Group__1"
    // InternalCucumber.g:3267:1: rule__But__Group__1 : rule__But__Group__1__Impl rule__But__Group__2 ;
    public final void rule__But__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3271:1: ( rule__But__Group__1__Impl rule__But__Group__2 )
            // InternalCucumber.g:3272:2: rule__But__Group__1__Impl rule__But__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__But__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__But__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__1"


    // $ANTLR start "rule__But__Group__1__Impl"
    // InternalCucumber.g:3279:1: rule__But__Group__1__Impl : ( ( rule__But__NameAssignment_1 ) ) ;
    public final void rule__But__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3283:1: ( ( ( rule__But__NameAssignment_1 ) ) )
            // InternalCucumber.g:3284:1: ( ( rule__But__NameAssignment_1 ) )
            {
            // InternalCucumber.g:3284:1: ( ( rule__But__NameAssignment_1 ) )
            // InternalCucumber.g:3285:2: ( rule__But__NameAssignment_1 )
            {
             before(grammarAccess.getButAccess().getNameAssignment_1()); 
            // InternalCucumber.g:3286:2: ( rule__But__NameAssignment_1 )
            // InternalCucumber.g:3286:3: rule__But__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__But__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getButAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__1__Impl"


    // $ANTLR start "rule__But__Group__2"
    // InternalCucumber.g:3294:1: rule__But__Group__2 : rule__But__Group__2__Impl rule__But__Group__3 ;
    public final void rule__But__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3298:1: ( rule__But__Group__2__Impl rule__But__Group__3 )
            // InternalCucumber.g:3299:2: rule__But__Group__2__Impl rule__But__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__But__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__But__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__2"


    // $ANTLR start "rule__But__Group__2__Impl"
    // InternalCucumber.g:3306:1: rule__But__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__But__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3310:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:3311:1: ( RULE_EOL )
            {
            // InternalCucumber.g:3311:1: ( RULE_EOL )
            // InternalCucumber.g:3312:2: RULE_EOL
            {
             before(grammarAccess.getButAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getButAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__2__Impl"


    // $ANTLR start "rule__But__Group__3"
    // InternalCucumber.g:3321:1: rule__But__Group__3 : rule__But__Group__3__Impl ;
    public final void rule__But__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3325:1: ( rule__But__Group__3__Impl )
            // InternalCucumber.g:3326:2: rule__But__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__But__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__3"


    // $ANTLR start "rule__But__Group__3__Impl"
    // InternalCucumber.g:3332:1: rule__But__Group__3__Impl : ( ( rule__But__Alternatives_3 )? ) ;
    public final void rule__But__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3336:1: ( ( ( rule__But__Alternatives_3 )? ) )
            // InternalCucumber.g:3337:1: ( ( rule__But__Alternatives_3 )? )
            {
            // InternalCucumber.g:3337:1: ( ( rule__But__Alternatives_3 )? )
            // InternalCucumber.g:3338:2: ( rule__But__Alternatives_3 )?
            {
             before(grammarAccess.getButAccess().getAlternatives_3()); 
            // InternalCucumber.g:3339:2: ( rule__But__Alternatives_3 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=18 && LA45_0<=19)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCucumber.g:3339:3: rule__But__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__But__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__Group__3__Impl"


    // $ANTLR start "rule__Asterisk__Group__0"
    // InternalCucumber.g:3348:1: rule__Asterisk__Group__0 : rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1 ;
    public final void rule__Asterisk__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3352:1: ( rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1 )
            // InternalCucumber.g:3353:2: rule__Asterisk__Group__0__Impl rule__Asterisk__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Asterisk__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__0"


    // $ANTLR start "rule__Asterisk__Group__0__Impl"
    // InternalCucumber.g:3360:1: rule__Asterisk__Group__0__Impl : ( '*' ) ;
    public final void rule__Asterisk__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3364:1: ( ( '*' ) )
            // InternalCucumber.g:3365:1: ( '*' )
            {
            // InternalCucumber.g:3365:1: ( '*' )
            // InternalCucumber.g:3366:2: '*'
            {
             before(grammarAccess.getAsteriskAccess().getAsteriskKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAsteriskAccess().getAsteriskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__0__Impl"


    // $ANTLR start "rule__Asterisk__Group__1"
    // InternalCucumber.g:3375:1: rule__Asterisk__Group__1 : rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2 ;
    public final void rule__Asterisk__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3379:1: ( rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2 )
            // InternalCucumber.g:3380:2: rule__Asterisk__Group__1__Impl rule__Asterisk__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Asterisk__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__1"


    // $ANTLR start "rule__Asterisk__Group__1__Impl"
    // InternalCucumber.g:3387:1: rule__Asterisk__Group__1__Impl : ( ( rule__Asterisk__NameAssignment_1 ) ) ;
    public final void rule__Asterisk__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3391:1: ( ( ( rule__Asterisk__NameAssignment_1 ) ) )
            // InternalCucumber.g:3392:1: ( ( rule__Asterisk__NameAssignment_1 ) )
            {
            // InternalCucumber.g:3392:1: ( ( rule__Asterisk__NameAssignment_1 ) )
            // InternalCucumber.g:3393:2: ( rule__Asterisk__NameAssignment_1 )
            {
             before(grammarAccess.getAsteriskAccess().getNameAssignment_1()); 
            // InternalCucumber.g:3394:2: ( rule__Asterisk__NameAssignment_1 )
            // InternalCucumber.g:3394:3: rule__Asterisk__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Asterisk__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAsteriskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__1__Impl"


    // $ANTLR start "rule__Asterisk__Group__2"
    // InternalCucumber.g:3402:1: rule__Asterisk__Group__2 : rule__Asterisk__Group__2__Impl rule__Asterisk__Group__3 ;
    public final void rule__Asterisk__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3406:1: ( rule__Asterisk__Group__2__Impl rule__Asterisk__Group__3 )
            // InternalCucumber.g:3407:2: rule__Asterisk__Group__2__Impl rule__Asterisk__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Asterisk__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__2"


    // $ANTLR start "rule__Asterisk__Group__2__Impl"
    // InternalCucumber.g:3414:1: rule__Asterisk__Group__2__Impl : ( RULE_EOL ) ;
    public final void rule__Asterisk__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3418:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:3419:1: ( RULE_EOL )
            {
            // InternalCucumber.g:3419:1: ( RULE_EOL )
            // InternalCucumber.g:3420:2: RULE_EOL
            {
             before(grammarAccess.getAsteriskAccess().getEOLTerminalRuleCall_2()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getAsteriskAccess().getEOLTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__2__Impl"


    // $ANTLR start "rule__Asterisk__Group__3"
    // InternalCucumber.g:3429:1: rule__Asterisk__Group__3 : rule__Asterisk__Group__3__Impl ;
    public final void rule__Asterisk__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3433:1: ( rule__Asterisk__Group__3__Impl )
            // InternalCucumber.g:3434:2: rule__Asterisk__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asterisk__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__3"


    // $ANTLR start "rule__Asterisk__Group__3__Impl"
    // InternalCucumber.g:3440:1: rule__Asterisk__Group__3__Impl : ( ( rule__Asterisk__Alternatives_3 )? ) ;
    public final void rule__Asterisk__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3444:1: ( ( ( rule__Asterisk__Alternatives_3 )? ) )
            // InternalCucumber.g:3445:1: ( ( rule__Asterisk__Alternatives_3 )? )
            {
            // InternalCucumber.g:3445:1: ( ( rule__Asterisk__Alternatives_3 )? )
            // InternalCucumber.g:3446:2: ( rule__Asterisk__Alternatives_3 )?
            {
             before(grammarAccess.getAsteriskAccess().getAlternatives_3()); 
            // InternalCucumber.g:3447:2: ( rule__Asterisk__Alternatives_3 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=18 && LA46_0<=19)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalCucumber.g:3447:3: rule__Asterisk__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asterisk__Alternatives_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAsteriskAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group__0"
    // InternalCucumber.g:3456:1: rule__Statement__Group__0 : rule__Statement__Group__0__Impl rule__Statement__Group__1 ;
    public final void rule__Statement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3460:1: ( rule__Statement__Group__0__Impl rule__Statement__Group__1 )
            // InternalCucumber.g:3461:2: rule__Statement__Group__0__Impl rule__Statement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Statement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0"


    // $ANTLR start "rule__Statement__Group__0__Impl"
    // InternalCucumber.g:3468:1: rule__Statement__Group__0__Impl : ( ( rule__Statement__NameAssignment_0 ) ) ;
    public final void rule__Statement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3472:1: ( ( ( rule__Statement__NameAssignment_0 ) ) )
            // InternalCucumber.g:3473:1: ( ( rule__Statement__NameAssignment_0 ) )
            {
            // InternalCucumber.g:3473:1: ( ( rule__Statement__NameAssignment_0 ) )
            // InternalCucumber.g:3474:2: ( rule__Statement__NameAssignment_0 )
            {
             before(grammarAccess.getStatementAccess().getNameAssignment_0()); 
            // InternalCucumber.g:3475:2: ( rule__Statement__NameAssignment_0 )
            // InternalCucumber.g:3475:3: rule__Statement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Statement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__0__Impl"


    // $ANTLR start "rule__Statement__Group__1"
    // InternalCucumber.g:3483:1: rule__Statement__Group__1 : rule__Statement__Group__1__Impl ;
    public final void rule__Statement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3487:1: ( rule__Statement__Group__1__Impl )
            // InternalCucumber.g:3488:2: rule__Statement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1"


    // $ANTLR start "rule__Statement__Group__1__Impl"
    // InternalCucumber.g:3494:1: rule__Statement__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Statement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3498:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:3499:1: ( RULE_EOL )
            {
            // InternalCucumber.g:3499:1: ( RULE_EOL )
            // InternalCucumber.g:3500:2: RULE_EOL
            {
             before(grammarAccess.getStatementAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getStatementAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group__1__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalCucumber.g:3510:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3514:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalCucumber.g:3515:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // InternalCucumber.g:3522:1: rule__Tag__Group__0__Impl : ( '@' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3526:1: ( ( '@' ) )
            // InternalCucumber.g:3527:1: ( '@' )
            {
            // InternalCucumber.g:3527:1: ( '@' )
            // InternalCucumber.g:3528:2: '@'
            {
             before(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalCucumber.g:3537:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3541:1: ( rule__Tag__Group__1__Impl )
            // InternalCucumber.g:3542:2: rule__Tag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // InternalCucumber.g:3548:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__NameAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3552:1: ( ( ( rule__Tag__NameAssignment_1 ) ) )
            // InternalCucumber.g:3553:1: ( ( rule__Tag__NameAssignment_1 ) )
            {
            // InternalCucumber.g:3553:1: ( ( rule__Tag__NameAssignment_1 ) )
            // InternalCucumber.g:3554:2: ( rule__Tag__NameAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getNameAssignment_1()); 
            // InternalCucumber.g:3555:2: ( rule__Tag__NameAssignment_1 )
            // InternalCucumber.g:3555:3: rule__Tag__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tag__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Line__Group__0"
    // InternalCucumber.g:3564:1: rule__Line__Group__0 : rule__Line__Group__0__Impl rule__Line__Group__1 ;
    public final void rule__Line__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3568:1: ( rule__Line__Group__0__Impl rule__Line__Group__1 )
            // InternalCucumber.g:3569:2: rule__Line__Group__0__Impl rule__Line__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Line__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Line__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0"


    // $ANTLR start "rule__Line__Group__0__Impl"
    // InternalCucumber.g:3576:1: rule__Line__Group__0__Impl : ( ( rule__Line__NameAssignment_0 ) ) ;
    public final void rule__Line__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3580:1: ( ( ( rule__Line__NameAssignment_0 ) ) )
            // InternalCucumber.g:3581:1: ( ( rule__Line__NameAssignment_0 ) )
            {
            // InternalCucumber.g:3581:1: ( ( rule__Line__NameAssignment_0 ) )
            // InternalCucumber.g:3582:2: ( rule__Line__NameAssignment_0 )
            {
             before(grammarAccess.getLineAccess().getNameAssignment_0()); 
            // InternalCucumber.g:3583:2: ( rule__Line__NameAssignment_0 )
            // InternalCucumber.g:3583:3: rule__Line__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Line__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLineAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__0__Impl"


    // $ANTLR start "rule__Line__Group__1"
    // InternalCucumber.g:3591:1: rule__Line__Group__1 : rule__Line__Group__1__Impl ;
    public final void rule__Line__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3595:1: ( rule__Line__Group__1__Impl )
            // InternalCucumber.g:3596:2: rule__Line__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Line__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1"


    // $ANTLR start "rule__Line__Group__1__Impl"
    // InternalCucumber.g:3602:1: rule__Line__Group__1__Impl : ( RULE_EOL ) ;
    public final void rule__Line__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3606:1: ( ( RULE_EOL ) )
            // InternalCucumber.g:3607:1: ( RULE_EOL )
            {
            // InternalCucumber.g:3607:1: ( RULE_EOL )
            // InternalCucumber.g:3608:2: RULE_EOL
            {
             before(grammarAccess.getLineAccess().getEOLTerminalRuleCall_1()); 
            match(input,RULE_EOL,FOLLOW_2); 
             after(grammarAccess.getLineAccess().getEOLTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__Group__1__Impl"


    // $ANTLR start "rule__StepObject__NameAssignment_1"
    // InternalCucumber.g:3618:1: rule__StepObject__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__StepObject__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3622:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3623:2: ( rulePhrase )
            {
            // InternalCucumber.g:3623:2: ( rulePhrase )
            // InternalCucumber.g:3624:3: rulePhrase
            {
             before(grammarAccess.getStepObjectAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getStepObjectAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__NameAssignment_1"


    // $ANTLR start "rule__StepObject__StatementsAssignment_3"
    // InternalCucumber.g:3633:1: rule__StepObject__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepObject__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3637:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3638:2: ( ruleStatement )
            {
            // InternalCucumber.g:3638:2: ( ruleStatement )
            // InternalCucumber.g:3639:3: ruleStatement
            {
             before(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStepObjectAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__StatementsAssignment_3"


    // $ANTLR start "rule__StepObject__StepDefinitionsAssignment_4"
    // InternalCucumber.g:3648:1: rule__StepObject__StepDefinitionsAssignment_4 : ( ruleStepDefinition ) ;
    public final void rule__StepObject__StepDefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3652:1: ( ( ruleStepDefinition ) )
            // InternalCucumber.g:3653:2: ( ruleStepDefinition )
            {
            // InternalCucumber.g:3653:2: ( ruleStepDefinition )
            // InternalCucumber.g:3654:3: ruleStepDefinition
            {
             before(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStepDefinition();

            state._fsp--;

             after(grammarAccess.getStepObjectAccess().getStepDefinitionsStepDefinitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepObject__StepDefinitionsAssignment_4"


    // $ANTLR start "rule__StepDefinition__NameAssignment_1"
    // InternalCucumber.g:3663:1: rule__StepDefinition__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__StepDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3667:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3668:2: ( rulePhrase )
            {
            // InternalCucumber.g:3668:2: ( rulePhrase )
            // InternalCucumber.g:3669:3: rulePhrase
            {
             before(grammarAccess.getStepDefinitionAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getStepDefinitionAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__NameAssignment_1"


    // $ANTLR start "rule__StepDefinition__StatementsAssignment_3"
    // InternalCucumber.g:3678:1: rule__StepDefinition__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepDefinition__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3682:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3683:2: ( ruleStatement )
            {
            // InternalCucumber.g:3683:2: ( ruleStatement )
            // InternalCucumber.g:3684:3: ruleStatement
            {
             before(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStepDefinitionAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__StatementsAssignment_3"


    // $ANTLR start "rule__StepDefinition__StepParametersAssignment_4"
    // InternalCucumber.g:3693:1: rule__StepDefinition__StepParametersAssignment_4 : ( ruleStepParameters ) ;
    public final void rule__StepDefinition__StepParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3697:1: ( ( ruleStepParameters ) )
            // InternalCucumber.g:3698:2: ( ruleStepParameters )
            {
            // InternalCucumber.g:3698:2: ( ruleStepParameters )
            // InternalCucumber.g:3699:3: ruleStepParameters
            {
             before(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStepParameters();

            state._fsp--;

             after(grammarAccess.getStepDefinitionAccess().getStepParametersStepParametersParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepDefinition__StepParametersAssignment_4"


    // $ANTLR start "rule__StepParameters__NameAssignment_1"
    // InternalCucumber.g:3708:1: rule__StepParameters__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__StepParameters__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3712:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3713:2: ( rulePhrase )
            {
            // InternalCucumber.g:3713:2: ( rulePhrase )
            // InternalCucumber.g:3714:3: rulePhrase
            {
             before(grammarAccess.getStepParametersAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getStepParametersAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__NameAssignment_1"


    // $ANTLR start "rule__StepParameters__StatementsAssignment_3"
    // InternalCucumber.g:3723:1: rule__StepParameters__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__StepParameters__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3727:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3728:2: ( ruleStatement )
            {
            // InternalCucumber.g:3728:2: ( ruleStatement )
            // InternalCucumber.g:3729:3: ruleStatement
            {
             before(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStepParametersAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__StatementsAssignment_3"


    // $ANTLR start "rule__StepParameters__ParametersTableAssignment_4"
    // InternalCucumber.g:3738:1: rule__StepParameters__ParametersTableAssignment_4 : ( ruleParametersTable ) ;
    public final void rule__StepParameters__ParametersTableAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3742:1: ( ( ruleParametersTable ) )
            // InternalCucumber.g:3743:2: ( ruleParametersTable )
            {
            // InternalCucumber.g:3743:2: ( ruleParametersTable )
            // InternalCucumber.g:3744:3: ruleParametersTable
            {
             before(grammarAccess.getStepParametersAccess().getParametersTableParametersTableParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParametersTable();

            state._fsp--;

             after(grammarAccess.getStepParametersAccess().getParametersTableParametersTableParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepParameters__ParametersTableAssignment_4"


    // $ANTLR start "rule__ParametersTable__RowsAssignment"
    // InternalCucumber.g:3753:1: rule__ParametersTable__RowsAssignment : ( ruleRow ) ;
    public final void rule__ParametersTable__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3757:1: ( ( ruleRow ) )
            // InternalCucumber.g:3758:2: ( ruleRow )
            {
            // InternalCucumber.g:3758:2: ( ruleRow )
            // InternalCucumber.g:3759:3: ruleRow
            {
             before(grammarAccess.getParametersTableAccess().getRowsRowParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getParametersTableAccess().getRowsRowParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParametersTable__RowsAssignment"


    // $ANTLR start "rule__Feature__TagsAssignment_0_0"
    // InternalCucumber.g:3768:1: rule__Feature__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Feature__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3772:1: ( ( ruleTag ) )
            // InternalCucumber.g:3773:2: ( ruleTag )
            {
            // InternalCucumber.g:3773:2: ( ruleTag )
            // InternalCucumber.g:3774:3: ruleTag
            {
             before(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__TagsAssignment_0_0"


    // $ANTLR start "rule__Feature__NameAssignment_2"
    // InternalCucumber.g:3783:1: rule__Feature__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Feature__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3787:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3788:2: ( rulePhrase )
            {
            // InternalCucumber.g:3788:2: ( rulePhrase )
            // InternalCucumber.g:3789:3: rulePhrase
            {
             before(grammarAccess.getFeatureAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getNamePhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__NameAssignment_2"


    // $ANTLR start "rule__Feature__StatementsAssignment_4"
    // InternalCucumber.g:3798:1: rule__Feature__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Feature__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3802:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3803:2: ( ruleStatement )
            {
            // InternalCucumber.g:3803:2: ( ruleStatement )
            // InternalCucumber.g:3804:3: ruleStatement
            {
             before(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__StatementsAssignment_4"


    // $ANTLR start "rule__Feature__AbstractScenariosAssignment_5"
    // InternalCucumber.g:3813:1: rule__Feature__AbstractScenariosAssignment_5 : ( ruleAbstractScenario ) ;
    public final void rule__Feature__AbstractScenariosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3817:1: ( ( ruleAbstractScenario ) )
            // InternalCucumber.g:3818:2: ( ruleAbstractScenario )
            {
            // InternalCucumber.g:3818:2: ( ruleAbstractScenario )
            // InternalCucumber.g:3819:3: ruleAbstractScenario
            {
             before(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractScenario();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getAbstractScenariosAbstractScenarioParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature__AbstractScenariosAssignment_5"


    // $ANTLR start "rule__Background__NameAssignment_1"
    // InternalCucumber.g:3828:1: rule__Background__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Background__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3832:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3833:2: ( rulePhrase )
            {
            // InternalCucumber.g:3833:2: ( rulePhrase )
            // InternalCucumber.g:3834:3: rulePhrase
            {
             before(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__NameAssignment_1"


    // $ANTLR start "rule__Background__StatementsAssignment_3"
    // InternalCucumber.g:3843:1: rule__Background__StatementsAssignment_3 : ( ruleStatement ) ;
    public final void rule__Background__StatementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3847:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3848:2: ( ruleStatement )
            {
            // InternalCucumber.g:3848:2: ( ruleStatement )
            // InternalCucumber.g:3849:3: ruleStatement
            {
             before(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStatementsStatementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__StatementsAssignment_3"


    // $ANTLR start "rule__Background__StepsAssignment_4"
    // InternalCucumber.g:3858:1: rule__Background__StepsAssignment_4 : ( ruleStep ) ;
    public final void rule__Background__StepsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3862:1: ( ( ruleStep ) )
            // InternalCucumber.g:3863:2: ( ruleStep )
            {
            // InternalCucumber.g:3863:2: ( ruleStep )
            // InternalCucumber.g:3864:3: ruleStep
            {
             before(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getBackgroundAccess().getStepsStepParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Background__StepsAssignment_4"


    // $ANTLR start "rule__Scenario__TagsAssignment_0_0"
    // InternalCucumber.g:3873:1: rule__Scenario__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Scenario__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3877:1: ( ( ruleTag ) )
            // InternalCucumber.g:3878:2: ( ruleTag )
            {
            // InternalCucumber.g:3878:2: ( ruleTag )
            // InternalCucumber.g:3879:3: ruleTag
            {
             before(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__TagsAssignment_0_0"


    // $ANTLR start "rule__Scenario__NameAssignment_2"
    // InternalCucumber.g:3888:1: rule__Scenario__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Scenario__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3892:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3893:2: ( rulePhrase )
            {
            // InternalCucumber.g:3893:2: ( rulePhrase )
            // InternalCucumber.g:3894:3: rulePhrase
            {
             before(grammarAccess.getScenarioAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getNamePhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__NameAssignment_2"


    // $ANTLR start "rule__Scenario__StatementsAssignment_4"
    // InternalCucumber.g:3903:1: rule__Scenario__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Scenario__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3907:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3908:2: ( ruleStatement )
            {
            // InternalCucumber.g:3908:2: ( ruleStatement )
            // InternalCucumber.g:3909:3: ruleStatement
            {
             before(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__StatementsAssignment_4"


    // $ANTLR start "rule__Scenario__StepsAssignment_5"
    // InternalCucumber.g:3918:1: rule__Scenario__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__Scenario__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3922:1: ( ( ruleStep ) )
            // InternalCucumber.g:3923:2: ( ruleStep )
            {
            // InternalCucumber.g:3923:2: ( ruleStep )
            // InternalCucumber.g:3924:3: ruleStep
            {
             before(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioAccess().getStepsStepParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scenario__StepsAssignment_5"


    // $ANTLR start "rule__ScenarioOutline__TagsAssignment_0_0"
    // InternalCucumber.g:3933:1: rule__ScenarioOutline__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__ScenarioOutline__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3937:1: ( ( ruleTag ) )
            // InternalCucumber.g:3938:2: ( ruleTag )
            {
            // InternalCucumber.g:3938:2: ( ruleTag )
            // InternalCucumber.g:3939:3: ruleTag
            {
             before(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__TagsAssignment_0_0"


    // $ANTLR start "rule__ScenarioOutline__NameAssignment_2"
    // InternalCucumber.g:3948:1: rule__ScenarioOutline__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__ScenarioOutline__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3952:1: ( ( rulePhrase ) )
            // InternalCucumber.g:3953:2: ( rulePhrase )
            {
            // InternalCucumber.g:3953:2: ( rulePhrase )
            // InternalCucumber.g:3954:3: rulePhrase
            {
             before(grammarAccess.getScenarioOutlineAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getNamePhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__NameAssignment_2"


    // $ANTLR start "rule__ScenarioOutline__StatementsAssignment_4"
    // InternalCucumber.g:3963:1: rule__ScenarioOutline__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__ScenarioOutline__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3967:1: ( ( ruleStatement ) )
            // InternalCucumber.g:3968:2: ( ruleStatement )
            {
            // InternalCucumber.g:3968:2: ( ruleStatement )
            // InternalCucumber.g:3969:3: ruleStatement
            {
             before(grammarAccess.getScenarioOutlineAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__StatementsAssignment_4"


    // $ANTLR start "rule__ScenarioOutline__StepsAssignment_5"
    // InternalCucumber.g:3978:1: rule__ScenarioOutline__StepsAssignment_5 : ( ruleStep ) ;
    public final void rule__ScenarioOutline__StepsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3982:1: ( ( ruleStep ) )
            // InternalCucumber.g:3983:2: ( ruleStep )
            {
            // InternalCucumber.g:3983:2: ( ruleStep )
            // InternalCucumber.g:3984:3: ruleStep
            {
             before(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStep();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getStepsStepParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__StepsAssignment_5"


    // $ANTLR start "rule__ScenarioOutline__ExamplesAssignment_6"
    // InternalCucumber.g:3993:1: rule__ScenarioOutline__ExamplesAssignment_6 : ( ruleExamples ) ;
    public final void rule__ScenarioOutline__ExamplesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:3997:1: ( ( ruleExamples ) )
            // InternalCucumber.g:3998:2: ( ruleExamples )
            {
            // InternalCucumber.g:3998:2: ( ruleExamples )
            // InternalCucumber.g:3999:3: ruleExamples
            {
             before(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExamples();

            state._fsp--;

             after(grammarAccess.getScenarioOutlineAccess().getExamplesExamplesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScenarioOutline__ExamplesAssignment_6"


    // $ANTLR start "rule__Examples__TagsAssignment_0_0"
    // InternalCucumber.g:4008:1: rule__Examples__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Examples__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4012:1: ( ( ruleTag ) )
            // InternalCucumber.g:4013:2: ( ruleTag )
            {
            // InternalCucumber.g:4013:2: ( ruleTag )
            // InternalCucumber.g:4014:3: ruleTag
            {
             before(grammarAccess.getExamplesAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTagsTagParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__TagsAssignment_0_0"


    // $ANTLR start "rule__Examples__NameAssignment_2"
    // InternalCucumber.g:4023:1: rule__Examples__NameAssignment_2 : ( rulePhrase ) ;
    public final void rule__Examples__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4027:1: ( ( rulePhrase ) )
            // InternalCucumber.g:4028:2: ( rulePhrase )
            {
            // InternalCucumber.g:4028:2: ( rulePhrase )
            // InternalCucumber.g:4029:3: rulePhrase
            {
             before(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getNamePhraseParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__NameAssignment_2"


    // $ANTLR start "rule__Examples__StatementsAssignment_4"
    // InternalCucumber.g:4038:1: rule__Examples__StatementsAssignment_4 : ( ruleStatement ) ;
    public final void rule__Examples__StatementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4042:1: ( ( ruleStatement ) )
            // InternalCucumber.g:4043:2: ( ruleStatement )
            {
            // InternalCucumber.g:4043:2: ( ruleStatement )
            // InternalCucumber.g:4044:3: ruleStatement
            {
             before(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getStatementsStatementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__StatementsAssignment_4"


    // $ANTLR start "rule__Examples__TheExamplesTableAssignment_5"
    // InternalCucumber.g:4053:1: rule__Examples__TheExamplesTableAssignment_5 : ( ruleExamplesTable ) ;
    public final void rule__Examples__TheExamplesTableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4057:1: ( ( ruleExamplesTable ) )
            // InternalCucumber.g:4058:2: ( ruleExamplesTable )
            {
            // InternalCucumber.g:4058:2: ( ruleExamplesTable )
            // InternalCucumber.g:4059:3: ruleExamplesTable
            {
             before(grammarAccess.getExamplesAccess().getTheExamplesTableExamplesTableParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExamplesTable();

            state._fsp--;

             after(grammarAccess.getExamplesAccess().getTheExamplesTableExamplesTableParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Examples__TheExamplesTableAssignment_5"


    // $ANTLR start "rule__ExamplesTable__RowsAssignment"
    // InternalCucumber.g:4068:1: rule__ExamplesTable__RowsAssignment : ( ruleRow ) ;
    public final void rule__ExamplesTable__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4072:1: ( ( ruleRow ) )
            // InternalCucumber.g:4073:2: ( ruleRow )
            {
            // InternalCucumber.g:4073:2: ( ruleRow )
            // InternalCucumber.g:4074:3: ruleRow
            {
             before(grammarAccess.getExamplesTableAccess().getRowsRowParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getExamplesTableAccess().getRowsRowParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExamplesTable__RowsAssignment"


    // $ANTLR start "rule__StepTable__RowsAssignment"
    // InternalCucumber.g:4083:1: rule__StepTable__RowsAssignment : ( ruleRow ) ;
    public final void rule__StepTable__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4087:1: ( ( ruleRow ) )
            // InternalCucumber.g:4088:2: ( ruleRow )
            {
            // InternalCucumber.g:4088:2: ( ruleRow )
            // InternalCucumber.g:4089:3: ruleRow
            {
             before(grammarAccess.getStepTableAccess().getRowsRowParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRow();

            state._fsp--;

             after(grammarAccess.getStepTableAccess().getRowsRowParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StepTable__RowsAssignment"


    // $ANTLR start "rule__Row__CellsAssignment_0"
    // InternalCucumber.g:4098:1: rule__Row__CellsAssignment_0 : ( ruleCell ) ;
    public final void rule__Row__CellsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4102:1: ( ( ruleCell ) )
            // InternalCucumber.g:4103:2: ( ruleCell )
            {
            // InternalCucumber.g:4103:2: ( ruleCell )
            // InternalCucumber.g:4104:3: ruleCell
            {
             before(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCell();

            state._fsp--;

             after(grammarAccess.getRowAccess().getCellsCellParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Row__CellsAssignment_0"


    // $ANTLR start "rule__Cell__NameAssignment_1"
    // InternalCucumber.g:4113:1: rule__Cell__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Cell__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4117:1: ( ( rulePhrase ) )
            // InternalCucumber.g:4118:2: ( rulePhrase )
            {
            // InternalCucumber.g:4118:2: ( rulePhrase )
            // InternalCucumber.g:4119:3: rulePhrase
            {
             before(grammarAccess.getCellAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getCellAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cell__NameAssignment_1"


    // $ANTLR start "rule__DocString__LinesAssignment_2"
    // InternalCucumber.g:4128:1: rule__DocString__LinesAssignment_2 : ( ruleLine ) ;
    public final void rule__DocString__LinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4132:1: ( ( ruleLine ) )
            // InternalCucumber.g:4133:2: ( ruleLine )
            {
            // InternalCucumber.g:4133:2: ( ruleLine )
            // InternalCucumber.g:4134:3: ruleLine
            {
             before(grammarAccess.getDocStringAccess().getLinesLineParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLine();

            state._fsp--;

             after(grammarAccess.getDocStringAccess().getLinesLineParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DocString__LinesAssignment_2"


    // $ANTLR start "rule__Given__NameAssignment_1"
    // InternalCucumber.g:4143:1: rule__Given__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Given__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4147:1: ( ( rulePhrase ) )
            // InternalCucumber.g:4148:2: ( rulePhrase )
            {
            // InternalCucumber.g:4148:2: ( rulePhrase )
            // InternalCucumber.g:4149:3: rulePhrase
            {
             before(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__NameAssignment_1"


    // $ANTLR start "rule__Given__TheStepTableAssignment_3_0"
    // InternalCucumber.g:4158:1: rule__Given__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Given__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4162:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:4163:2: ( ruleStepTable )
            {
            // InternalCucumber.g:4163:2: ( ruleStepTable )
            // InternalCucumber.g:4164:3: ruleStepTable
            {
             before(grammarAccess.getGivenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__Given__TheDocStringAssignment_3_1"
    // InternalCucumber.g:4173:1: rule__Given__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Given__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4177:1: ( ( ruleDocString ) )
            // InternalCucumber.g:4178:2: ( ruleDocString )
            {
            // InternalCucumber.g:4178:2: ( ruleDocString )
            // InternalCucumber.g:4179:3: ruleDocString
            {
             before(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getGivenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Given__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__When__NameAssignment_1"
    // InternalCucumber.g:4188:1: rule__When__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__When__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4192:1: ( ( rulePhrase ) )
            // InternalCucumber.g:4193:2: ( rulePhrase )
            {
            // InternalCucumber.g:4193:2: ( rulePhrase )
            // InternalCucumber.g:4194:3: rulePhrase
            {
             before(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__NameAssignment_1"


    // $ANTLR start "rule__When__TheStepTableAssignment_3_0"
    // InternalCucumber.g:4203:1: rule__When__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__When__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4207:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:4208:2: ( ruleStepTable )
            {
            // InternalCucumber.g:4208:2: ( ruleStepTable )
            // InternalCucumber.g:4209:3: ruleStepTable
            {
             before(grammarAccess.getWhenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__When__TheDocStringAssignment_3_1"
    // InternalCucumber.g:4218:1: rule__When__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__When__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4222:1: ( ( ruleDocString ) )
            // InternalCucumber.g:4223:2: ( ruleDocString )
            {
            // InternalCucumber.g:4223:2: ( ruleDocString )
            // InternalCucumber.g:4224:3: ruleDocString
            {
             before(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__Then__NameAssignment_1"
    // InternalCucumber.g:4233:1: rule__Then__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Then__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4237:1: ( ( rulePhrase ) )
            // InternalCucumber.g:4238:2: ( rulePhrase )
            {
            // InternalCucumber.g:4238:2: ( rulePhrase )
            // InternalCucumber.g:4239:3: rulePhrase
            {
             before(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getThenAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__NameAssignment_1"


    // $ANTLR start "rule__Then__TheStepTableAssignment_3_0"
    // InternalCucumber.g:4248:1: rule__Then__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Then__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4252:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:4253:2: ( ruleStepTable )
            {
            // InternalCucumber.g:4253:2: ( ruleStepTable )
            // InternalCucumber.g:4254:3: ruleStepTable
            {
             before(grammarAccess.getThenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getThenAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__Then__TheDocStringAssignment_3_1"
    // InternalCucumber.g:4263:1: rule__Then__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Then__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4267:1: ( ( ruleDocString ) )
            // InternalCucumber.g:4268:2: ( ruleDocString )
            {
            // InternalCucumber.g:4268:2: ( ruleDocString )
            // InternalCucumber.g:4269:3: ruleDocString
            {
             before(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getThenAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__And__NameAssignment_1"
    // InternalCucumber.g:4278:1: rule__And__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__And__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4282:1: ( ( rulePhrase ) )
            // InternalCucumber.g:4283:2: ( rulePhrase )
            {
            // InternalCucumber.g:4283:2: ( rulePhrase )
            // InternalCucumber.g:4284:3: rulePhrase
            {
             before(grammarAccess.getAndAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getAndAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__NameAssignment_1"


    // $ANTLR start "rule__And__TheStepTableAssignment_3_0"
    // InternalCucumber.g:4293:1: rule__And__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__And__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4297:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:4298:2: ( ruleStepTable )
            {
            // InternalCucumber.g:4298:2: ( ruleStepTable )
            // InternalCucumber.g:4299:3: ruleStepTable
            {
             before(grammarAccess.getAndAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getAndAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__And__TheDocStringAssignment_3_1"
    // InternalCucumber.g:4308:1: rule__And__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__And__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4312:1: ( ( ruleDocString ) )
            // InternalCucumber.g:4313:2: ( ruleDocString )
            {
            // InternalCucumber.g:4313:2: ( ruleDocString )
            // InternalCucumber.g:4314:3: ruleDocString
            {
             before(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getAndAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__But__NameAssignment_1"
    // InternalCucumber.g:4323:1: rule__But__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__But__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4327:1: ( ( rulePhrase ) )
            // InternalCucumber.g:4328:2: ( rulePhrase )
            {
            // InternalCucumber.g:4328:2: ( rulePhrase )
            // InternalCucumber.g:4329:3: rulePhrase
            {
             before(grammarAccess.getButAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getButAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__NameAssignment_1"


    // $ANTLR start "rule__But__TheStepTableAssignment_3_0"
    // InternalCucumber.g:4338:1: rule__But__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__But__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4342:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:4343:2: ( ruleStepTable )
            {
            // InternalCucumber.g:4343:2: ( ruleStepTable )
            // InternalCucumber.g:4344:3: ruleStepTable
            {
             before(grammarAccess.getButAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getButAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__But__TheDocStringAssignment_3_1"
    // InternalCucumber.g:4353:1: rule__But__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__But__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4357:1: ( ( ruleDocString ) )
            // InternalCucumber.g:4358:2: ( ruleDocString )
            {
            // InternalCucumber.g:4358:2: ( ruleDocString )
            // InternalCucumber.g:4359:3: ruleDocString
            {
             before(grammarAccess.getButAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getButAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__But__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__Asterisk__NameAssignment_1"
    // InternalCucumber.g:4368:1: rule__Asterisk__NameAssignment_1 : ( rulePhrase ) ;
    public final void rule__Asterisk__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4372:1: ( ( rulePhrase ) )
            // InternalCucumber.g:4373:2: ( rulePhrase )
            {
            // InternalCucumber.g:4373:2: ( rulePhrase )
            // InternalCucumber.g:4374:3: rulePhrase
            {
             before(grammarAccess.getAsteriskAccess().getNamePhraseParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getAsteriskAccess().getNamePhraseParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__NameAssignment_1"


    // $ANTLR start "rule__Asterisk__TheStepTableAssignment_3_0"
    // InternalCucumber.g:4383:1: rule__Asterisk__TheStepTableAssignment_3_0 : ( ruleStepTable ) ;
    public final void rule__Asterisk__TheStepTableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4387:1: ( ( ruleStepTable ) )
            // InternalCucumber.g:4388:2: ( ruleStepTable )
            {
            // InternalCucumber.g:4388:2: ( ruleStepTable )
            // InternalCucumber.g:4389:3: ruleStepTable
            {
             before(grammarAccess.getAsteriskAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStepTable();

            state._fsp--;

             after(grammarAccess.getAsteriskAccess().getTheStepTableStepTableParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__TheStepTableAssignment_3_0"


    // $ANTLR start "rule__Asterisk__TheDocStringAssignment_3_1"
    // InternalCucumber.g:4398:1: rule__Asterisk__TheDocStringAssignment_3_1 : ( ruleDocString ) ;
    public final void rule__Asterisk__TheDocStringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4402:1: ( ( ruleDocString ) )
            // InternalCucumber.g:4403:2: ( ruleDocString )
            {
            // InternalCucumber.g:4403:2: ( ruleDocString )
            // InternalCucumber.g:4404:3: ruleDocString
            {
             before(grammarAccess.getAsteriskAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDocString();

            state._fsp--;

             after(grammarAccess.getAsteriskAccess().getTheDocStringDocStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asterisk__TheDocStringAssignment_3_1"


    // $ANTLR start "rule__Statement__NameAssignment_0"
    // InternalCucumber.g:4413:1: rule__Statement__NameAssignment_0 : ( rulePhrase ) ;
    public final void rule__Statement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4417:1: ( ( rulePhrase ) )
            // InternalCucumber.g:4418:2: ( rulePhrase )
            {
            // InternalCucumber.g:4418:2: ( rulePhrase )
            // InternalCucumber.g:4419:3: rulePhrase
            {
             before(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePhrase();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getNamePhraseParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__NameAssignment_0"


    // $ANTLR start "rule__Tag__NameAssignment_1"
    // InternalCucumber.g:4428:1: rule__Tag__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Tag__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4432:1: ( ( RULE_ID ) )
            // InternalCucumber.g:4433:2: ( RULE_ID )
            {
            // InternalCucumber.g:4433:2: ( RULE_ID )
            // InternalCucumber.g:4434:3: RULE_ID
            {
             before(grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tag__NameAssignment_1"


    // $ANTLR start "rule__Line__NameAssignment_0"
    // InternalCucumber.g:4443:1: rule__Line__NameAssignment_0 : ( ruleLineBits ) ;
    public final void rule__Line__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCucumber.g:4447:1: ( ( ruleLineBits ) )
            // InternalCucumber.g:4448:2: ( ruleLineBits )
            {
            // InternalCucumber.g:4448:2: ( ruleLineBits )
            // InternalCucumber.g:4449:3: ruleLineBits
            {
             before(grammarAccess.getLineAccess().getNameLineBitsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLineBits();

            state._fsp--;

             after(grammarAccess.getLineAccess().getNameLineBitsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Line__NameAssignment_0"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\16\1\uffff\1\5\2\uffff\1\7\1\5\1\17\1\7";
    static final String dfa_3s = "\1\32\1\uffff\1\5\2\uffff\1\32\1\5\1\20\1\32";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\2\1\3\4\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\4\11\uffff\1\2",
            "",
            "\1\5",
            "",
            "",
            "\1\7\22\uffff\1\6",
            "\1\10",
            "\1\3\1\4",
            "\1\7\22\uffff\1\6"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "826:1: rule__AbstractScenario__Alternatives : ( ( ruleBackground ) | ( ruleScenario ) | ( ruleScenarioOutline ) );";
        }
    }
    static final String dfa_7s = "\10\uffff";
    static final String dfa_8s = "\1\1\7\uffff";
    static final String dfa_9s = "\1\16\1\uffff\1\5\1\uffff\1\7\1\5\1\17\1\7";
    static final String dfa_10s = "\1\32\1\uffff\1\5\1\uffff\1\32\1\5\1\21\1\32";
    static final String dfa_11s = "\1\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_12s = "\10\uffff}>";
    static final String[] dfa_13s = {
            "\3\1\1\3\10\uffff\1\2",
            "",
            "\1\4",
            "",
            "\1\6\22\uffff\1\5",
            "\1\7",
            "\2\1\1\3",
            "\1\6\22\uffff\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 2230:3: ( rule__ScenarioOutline__ExamplesAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000072L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000870L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000872L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000401C070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000000401C002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003F00070L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003F00002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000401C000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000007F20070L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000007F20072L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});

}