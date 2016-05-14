package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_DEC_OP=16;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=19;
    public static final int RULE_LEFT_CHAVES=9;
    public static final int RULE_INT=21;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=23;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int RULE_RIGHT_CHAVES=10;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_LEFT_PARENTESE=4;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int RULE_LEFT_COCHETE=6;
    public static final int RULE_DOTS=12;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_COMMA=8;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int RULE_INC_OP=15;
    public static final int RULE_INTEGER_NUMBER=18;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_RIGHT_COCHETE=7;
    public static final int RULE_SINGLE_QUOTES=20;
    public static final int RULE_DOT_COMMA=11;
    public static final int RULE_STRING=22;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_STRING_C=17;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int RULE_PLUS=13;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=25;
    public static final int RULE_RIGHT_PARENTESE=5;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_MINUS=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'CONST' )
            // InternalMyDsl.g:11:9: 'CONST'
            {
            match("CONST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'RESTRICT' )
            // InternalMyDsl.g:12:9: 'RESTRICT'
            {
            match("RESTRICT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'VOLATILE' )
            // InternalMyDsl.g:13:9: 'VOLATILE'
            {
            match("VOLATILE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'ATOMIC' )
            // InternalMyDsl.g:14:9: 'ATOMIC'
            {
            match("ATOMIC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( '*' )
            // InternalMyDsl.g:15:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( '_Static_assert' )
            // InternalMyDsl.g:16:9: '_Static_assert'
            {
            match("_Static_assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( '...' )
            // InternalMyDsl.g:17:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'GOTO' )
            // InternalMyDsl.g:18:9: 'GOTO'
            {
            match("GOTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'CONTINUE' )
            // InternalMyDsl.g:19:9: 'CONTINUE'
            {
            match("CONTINUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( 'BREAK' )
            // InternalMyDsl.g:20:9: 'BREAK'
            {
            match("BREAK"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( 'return' )
            // InternalMyDsl.g:21:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( 'CASE' )
            // InternalMyDsl.g:22:9: 'CASE'
            {
            match("CASE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( 'DEFAULT' )
            // InternalMyDsl.g:23:9: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( 'while' )
            // InternalMyDsl.g:24:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( 'do' )
            // InternalMyDsl.g:25:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( 'for' )
            // InternalMyDsl.g:26:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '=' )
            // InternalMyDsl.g:27:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( 'if' )
            // InternalMyDsl.g:28:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'else' )
            // InternalMyDsl.g:29:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'SWITCH' )
            // InternalMyDsl.g:30:9: 'SWITCH'
            {
            match("SWITCH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( '?' )
            // InternalMyDsl.g:31:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( '||' )
            // InternalMyDsl.g:32:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( '&&' )
            // InternalMyDsl.g:33:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( '|' )
            // InternalMyDsl.g:34:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( '^' )
            // InternalMyDsl.g:35:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( '&' )
            // InternalMyDsl.g:36:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( '==' )
            // InternalMyDsl.g:37:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( '!=' )
            // InternalMyDsl.g:38:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( '<' )
            // InternalMyDsl.g:39:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( '>' )
            // InternalMyDsl.g:40:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( '<=' )
            // InternalMyDsl.g:41:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( '>=' )
            // InternalMyDsl.g:42:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( '<<' )
            // InternalMyDsl.g:43:9: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( '>>' )
            // InternalMyDsl.g:44:9: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( '/' )
            // InternalMyDsl.g:45:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( '%' )
            // InternalMyDsl.g:46:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( '.' )
            // InternalMyDsl.g:47:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( 'STATIC_ASSERT' )
            // InternalMyDsl.g:48:9: 'STATIC_ASSERT'
            {
            match("STATIC_ASSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:49:7: ( 'STRING_LITERAL' )
            // InternalMyDsl.g:49:9: 'STRING_LITERAL'
            {
            match("STRING_LITERAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:50:7: ( '->' )
            // InternalMyDsl.g:50:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:51:7: ( 'STRUCT' )
            // InternalMyDsl.g:51:9: 'STRUCT'
            {
            match("STRUCT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:52:7: ( 'UNION' )
            // InternalMyDsl.g:52:9: 'UNION'
            {
            match("UNION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:53:7: ( '~' )
            // InternalMyDsl.g:53:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:54:7: ( '!' )
            // InternalMyDsl.g:54:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:55:7: ( 'void' )
            // InternalMyDsl.g:55:9: 'void'
            {
            match("void"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:56:7: ( 'char' )
            // InternalMyDsl.g:56:9: 'char'
            {
            match("char"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:57:7: ( 'short' )
            // InternalMyDsl.g:57:9: 'short'
            {
            match("short"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:58:7: ( 'int' )
            // InternalMyDsl.g:58:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:59:7: ( 'long' )
            // InternalMyDsl.g:59:9: 'long'
            {
            match("long"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:60:7: ( 'float' )
            // InternalMyDsl.g:60:9: 'float'
            {
            match("float"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:61:7: ( 'double' )
            // InternalMyDsl.g:61:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:62:7: ( 'SIGNED' )
            // InternalMyDsl.g:62:9: 'SIGNED'
            {
            match("SIGNED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:63:7: ( 'UNSIGNED' )
            // InternalMyDsl.g:63:9: 'UNSIGNED'
            {
            match("UNSIGNED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:64:7: ( 'BOOL' )
            // InternalMyDsl.g:64:9: 'BOOL'
            {
            match("BOOL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:65:7: ( 'COMPLEX' )
            // InternalMyDsl.g:65:9: 'COMPLEX'
            {
            match("COMPLEX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:66:7: ( 'IMAGINARY' )
            // InternalMyDsl.g:66:9: 'IMAGINARY'
            {
            match("IMAGINARY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:67:7: ( 'TYPEDEF_NAME' )
            // InternalMyDsl.g:67:9: 'TYPEDEF_NAME'
            {
            match("TYPEDEF_NAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:68:7: ( 'TYPEDEF' )
            // InternalMyDsl.g:68:9: 'TYPEDEF'
            {
            match("TYPEDEF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:69:7: ( 'EXTERN' )
            // InternalMyDsl.g:69:9: 'EXTERN'
            {
            match("EXTERN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:70:7: ( 'STATIC' )
            // InternalMyDsl.g:70:9: 'STATIC'
            {
            match("STATIC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:71:7: ( 'THREAD_LOCAL' )
            // InternalMyDsl.g:71:9: 'THREAD_LOCAL'
            {
            match("THREAD_LOCAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:72:7: ( 'AUTO' )
            // InternalMyDsl.g:72:9: 'AUTO'
            {
            match("AUTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:73:7: ( 'REGISTER' )
            // InternalMyDsl.g:73:9: 'REGISTER'
            {
            match("REGISTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:74:7: ( '*=' )
            // InternalMyDsl.g:74:9: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:75:7: ( '/=' )
            // InternalMyDsl.g:75:9: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:76:7: ( '%=' )
            // InternalMyDsl.g:76:9: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:77:7: ( '+=' )
            // InternalMyDsl.g:77:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:78:7: ( '-=' )
            // InternalMyDsl.g:78:9: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:79:7: ( '<<=' )
            // InternalMyDsl.g:79:9: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:80:7: ( '>>=' )
            // InternalMyDsl.g:80:9: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:81:7: ( '&=' )
            // InternalMyDsl.g:81:9: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:82:7: ( '^=' )
            // InternalMyDsl.g:82:9: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:83:7: ( '|=' )
            // InternalMyDsl.g:83:9: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "RULE_DOTS"
    public final void mRULE_DOTS() throws RecognitionException {
        try {
            int _type = RULE_DOTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8233:11: ( ':' )
            // InternalMyDsl.g:8233:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOTS"

    // $ANTLR start "RULE_MINUS"
    public final void mRULE_MINUS() throws RecognitionException {
        try {
            int _type = RULE_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8235:12: ( '-' )
            // InternalMyDsl.g:8235:14: '-'
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

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8237:11: ( '+' )
            // InternalMyDsl.g:8237:13: '+'
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

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8239:12: ( ',' )
            // InternalMyDsl.g:8239:14: ','
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

    // $ANTLR start "RULE_DOT_COMMA"
    public final void mRULE_DOT_COMMA() throws RecognitionException {
        try {
            int _type = RULE_DOT_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8241:16: ( ';' )
            // InternalMyDsl.g:8241:18: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT_COMMA"

    // $ANTLR start "RULE_LEFT_CHAVES"
    public final void mRULE_LEFT_CHAVES() throws RecognitionException {
        try {
            int _type = RULE_LEFT_CHAVES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8243:18: ( '{' )
            // InternalMyDsl.g:8243:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_CHAVES"

    // $ANTLR start "RULE_RIGHT_CHAVES"
    public final void mRULE_RIGHT_CHAVES() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_CHAVES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8245:19: ( '}' )
            // InternalMyDsl.g:8245:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_CHAVES"

    // $ANTLR start "RULE_LEFT_COCHETE"
    public final void mRULE_LEFT_COCHETE() throws RecognitionException {
        try {
            int _type = RULE_LEFT_COCHETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8247:19: ( '[' )
            // InternalMyDsl.g:8247:21: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_COCHETE"

    // $ANTLR start "RULE_RIGHT_COCHETE"
    public final void mRULE_RIGHT_COCHETE() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_COCHETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8249:20: ( ']' )
            // InternalMyDsl.g:8249:22: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_COCHETE"

    // $ANTLR start "RULE_LEFT_PARENTESE"
    public final void mRULE_LEFT_PARENTESE() throws RecognitionException {
        try {
            int _type = RULE_LEFT_PARENTESE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8251:21: ( '(' )
            // InternalMyDsl.g:8251:23: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEFT_PARENTESE"

    // $ANTLR start "RULE_RIGHT_PARENTESE"
    public final void mRULE_RIGHT_PARENTESE() throws RecognitionException {
        try {
            int _type = RULE_RIGHT_PARENTESE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8253:22: ( ')' )
            // InternalMyDsl.g:8253:24: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RIGHT_PARENTESE"

    // $ANTLR start "RULE_INC_OP"
    public final void mRULE_INC_OP() throws RecognitionException {
        try {
            int _type = RULE_INC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8255:13: ( '++' )
            // InternalMyDsl.g:8255:15: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INC_OP"

    // $ANTLR start "RULE_DEC_OP"
    public final void mRULE_DEC_OP() throws RecognitionException {
        try {
            int _type = RULE_DEC_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8257:13: ( '--' )
            // InternalMyDsl.g:8257:15: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEC_OP"

    // $ANTLR start "RULE_INTEGER_NUMBER"
    public final void mRULE_INTEGER_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8259:21: ( ( '0' .. '9' )* )
            // InternalMyDsl.g:8259:23: ( '0' .. '9' )*
            {
            // InternalMyDsl.g:8259:23: ( '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:8259:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER_NUMBER"

    // $ANTLR start "RULE_SINGLE_QUOTES"
    public final void mRULE_SINGLE_QUOTES() throws RecognitionException {
        try {
            // InternalMyDsl.g:8261:29: ( '\\'' )
            // InternalMyDsl.g:8261:31: '\\''
            {
            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SINGLE_QUOTES"

    // $ANTLR start "RULE_STRING_C"
    public final void mRULE_STRING_C() throws RecognitionException {
        try {
            int _type = RULE_STRING_C;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8263:15: ( RULE_SINGLE_QUOTES (~ ( '\\'' ) | '\\'\\'' )* RULE_SINGLE_QUOTES )
            // InternalMyDsl.g:8263:17: RULE_SINGLE_QUOTES (~ ( '\\'' ) | '\\'\\'' )* RULE_SINGLE_QUOTES
            {
            mRULE_SINGLE_QUOTES(); 
            // InternalMyDsl.g:8263:36: (~ ( '\\'' ) | '\\'\\'' )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\'') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='\'') ) {
                        alt2=2;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='&')||(LA2_0>='(' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:8263:37: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:8263:45: '\\'\\''
            	    {
            	    match("''"); 


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            mRULE_SINGLE_QUOTES(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING_C"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8265:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:8265:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:8265:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:8265:11: '^'
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

            // InternalMyDsl.g:8265:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:
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
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8267:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:8267:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:8267:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:8267:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8269:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:8269:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:8269:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:8269:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:8269:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMyDsl.g:8269:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:8269:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:8269:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:8269:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:8269:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:8269:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

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

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8271:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:8271:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:8271:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:8271:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


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
            // InternalMyDsl.g:8273:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:8273:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:8273:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:8273:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:8273:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:8273:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:8273:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMyDsl.g:8273:41: '\\r'
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
            // InternalMyDsl.g:8275:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:8275:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:8275:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:8277:16: ( . )
            // InternalMyDsl.g:8277:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_DOTS | RULE_MINUS | RULE_PLUS | RULE_COMMA | RULE_DOT_COMMA | RULE_LEFT_CHAVES | RULE_RIGHT_CHAVES | RULE_LEFT_COCHETE | RULE_RIGHT_COCHETE | RULE_LEFT_PARENTESE | RULE_RIGHT_PARENTESE | RULE_INC_OP | RULE_DEC_OP | RULE_INTEGER_NUMBER | RULE_STRING_C | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=95;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalMyDsl.g:1:10: T__27
                {
                mT__27(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__28
                {
                mT__28(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__29
                {
                mT__29(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__30
                {
                mT__30(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__31
                {
                mT__31(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__32
                {
                mT__32(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__33
                {
                mT__33(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__34
                {
                mT__34(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__35
                {
                mT__35(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__36
                {
                mT__36(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__37
                {
                mT__37(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__38
                {
                mT__38(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__39
                {
                mT__39(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__40
                {
                mT__40(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__41
                {
                mT__41(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__42
                {
                mT__42(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__43
                {
                mT__43(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__44
                {
                mT__44(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__45
                {
                mT__45(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__46
                {
                mT__46(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__47
                {
                mT__47(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__48
                {
                mT__48(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__49
                {
                mT__49(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__50
                {
                mT__50(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__51
                {
                mT__51(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__52
                {
                mT__52(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__53
                {
                mT__53(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__54
                {
                mT__54(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__55
                {
                mT__55(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__56
                {
                mT__56(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__57
                {
                mT__57(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__58
                {
                mT__58(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__59
                {
                mT__59(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__60
                {
                mT__60(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__61
                {
                mT__61(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__62
                {
                mT__62(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__63
                {
                mT__63(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__64
                {
                mT__64(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: T__65
                {
                mT__65(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:244: T__66
                {
                mT__66(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:250: T__67
                {
                mT__67(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:256: T__68
                {
                mT__68(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:262: T__69
                {
                mT__69(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:268: T__70
                {
                mT__70(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:274: T__71
                {
                mT__71(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:280: T__72
                {
                mT__72(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:286: T__73
                {
                mT__73(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:292: T__74
                {
                mT__74(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:298: T__75
                {
                mT__75(); 

                }
                break;
            case 50 :
                // InternalMyDsl.g:1:304: T__76
                {
                mT__76(); 

                }
                break;
            case 51 :
                // InternalMyDsl.g:1:310: T__77
                {
                mT__77(); 

                }
                break;
            case 52 :
                // InternalMyDsl.g:1:316: T__78
                {
                mT__78(); 

                }
                break;
            case 53 :
                // InternalMyDsl.g:1:322: T__79
                {
                mT__79(); 

                }
                break;
            case 54 :
                // InternalMyDsl.g:1:328: T__80
                {
                mT__80(); 

                }
                break;
            case 55 :
                // InternalMyDsl.g:1:334: T__81
                {
                mT__81(); 

                }
                break;
            case 56 :
                // InternalMyDsl.g:1:340: T__82
                {
                mT__82(); 

                }
                break;
            case 57 :
                // InternalMyDsl.g:1:346: T__83
                {
                mT__83(); 

                }
                break;
            case 58 :
                // InternalMyDsl.g:1:352: T__84
                {
                mT__84(); 

                }
                break;
            case 59 :
                // InternalMyDsl.g:1:358: T__85
                {
                mT__85(); 

                }
                break;
            case 60 :
                // InternalMyDsl.g:1:364: T__86
                {
                mT__86(); 

                }
                break;
            case 61 :
                // InternalMyDsl.g:1:370: T__87
                {
                mT__87(); 

                }
                break;
            case 62 :
                // InternalMyDsl.g:1:376: T__88
                {
                mT__88(); 

                }
                break;
            case 63 :
                // InternalMyDsl.g:1:382: T__89
                {
                mT__89(); 

                }
                break;
            case 64 :
                // InternalMyDsl.g:1:388: T__90
                {
                mT__90(); 

                }
                break;
            case 65 :
                // InternalMyDsl.g:1:394: T__91
                {
                mT__91(); 

                }
                break;
            case 66 :
                // InternalMyDsl.g:1:400: T__92
                {
                mT__92(); 

                }
                break;
            case 67 :
                // InternalMyDsl.g:1:406: T__93
                {
                mT__93(); 

                }
                break;
            case 68 :
                // InternalMyDsl.g:1:412: T__94
                {
                mT__94(); 

                }
                break;
            case 69 :
                // InternalMyDsl.g:1:418: T__95
                {
                mT__95(); 

                }
                break;
            case 70 :
                // InternalMyDsl.g:1:424: T__96
                {
                mT__96(); 

                }
                break;
            case 71 :
                // InternalMyDsl.g:1:430: T__97
                {
                mT__97(); 

                }
                break;
            case 72 :
                // InternalMyDsl.g:1:436: T__98
                {
                mT__98(); 

                }
                break;
            case 73 :
                // InternalMyDsl.g:1:442: T__99
                {
                mT__99(); 

                }
                break;
            case 74 :
                // InternalMyDsl.g:1:448: RULE_DOTS
                {
                mRULE_DOTS(); 

                }
                break;
            case 75 :
                // InternalMyDsl.g:1:458: RULE_MINUS
                {
                mRULE_MINUS(); 

                }
                break;
            case 76 :
                // InternalMyDsl.g:1:469: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 77 :
                // InternalMyDsl.g:1:479: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 78 :
                // InternalMyDsl.g:1:490: RULE_DOT_COMMA
                {
                mRULE_DOT_COMMA(); 

                }
                break;
            case 79 :
                // InternalMyDsl.g:1:505: RULE_LEFT_CHAVES
                {
                mRULE_LEFT_CHAVES(); 

                }
                break;
            case 80 :
                // InternalMyDsl.g:1:522: RULE_RIGHT_CHAVES
                {
                mRULE_RIGHT_CHAVES(); 

                }
                break;
            case 81 :
                // InternalMyDsl.g:1:540: RULE_LEFT_COCHETE
                {
                mRULE_LEFT_COCHETE(); 

                }
                break;
            case 82 :
                // InternalMyDsl.g:1:558: RULE_RIGHT_COCHETE
                {
                mRULE_RIGHT_COCHETE(); 

                }
                break;
            case 83 :
                // InternalMyDsl.g:1:577: RULE_LEFT_PARENTESE
                {
                mRULE_LEFT_PARENTESE(); 

                }
                break;
            case 84 :
                // InternalMyDsl.g:1:597: RULE_RIGHT_PARENTESE
                {
                mRULE_RIGHT_PARENTESE(); 

                }
                break;
            case 85 :
                // InternalMyDsl.g:1:618: RULE_INC_OP
                {
                mRULE_INC_OP(); 

                }
                break;
            case 86 :
                // InternalMyDsl.g:1:630: RULE_DEC_OP
                {
                mRULE_DEC_OP(); 

                }
                break;
            case 87 :
                // InternalMyDsl.g:1:642: RULE_INTEGER_NUMBER
                {
                mRULE_INTEGER_NUMBER(); 

                }
                break;
            case 88 :
                // InternalMyDsl.g:1:662: RULE_STRING_C
                {
                mRULE_STRING_C(); 

                }
                break;
            case 89 :
                // InternalMyDsl.g:1:676: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 90 :
                // InternalMyDsl.g:1:684: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 91 :
                // InternalMyDsl.g:1:693: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 92 :
                // InternalMyDsl.g:1:705: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 93 :
                // InternalMyDsl.g:1:721: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 94 :
                // InternalMyDsl.g:1:737: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 95 :
                // InternalMyDsl.g:1:745: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\61\4\71\1\77\1\71\1\102\7\71\1\115\3\71\1\uffff\1\127\1\132\1\134\1\136\1\141\1\144\1\150\1\152\1\156\1\71\1\uffff\7\71\1\173\11\uffff\1\61\1\uffff\1\66\1\uffff\1\66\2\uffff\2\71\1\uffff\4\71\2\uffff\1\71\2\uffff\6\71\1\u009b\2\71\2\uffff\1\u009e\5\71\14\uffff\1\u00a6\2\uffff\1\u00a8\13\uffff\1\71\1\uffff\10\71\14\uffff\1\61\5\uffff\20\71\1\uffff\1\u00c7\1\71\1\uffff\1\u00c9\5\71\4\uffff\12\71\1\u00b5\2\uffff\3\71\1\u00de\4\71\1\u00e3\1\71\1\u00e5\1\71\1\u00e7\4\71\1\uffff\1\71\1\uffff\1\u00ed\7\71\1\u00f5\1\u00f6\1\71\1\u00f8\4\71\1\u0089\1\u00fd\2\71\1\uffff\4\71\1\uffff\1\71\1\uffff\1\u0105\1\uffff\2\71\1\u0108\1\71\1\u010a\1\uffff\5\71\1\u0110\1\71\2\uffff\1\u0112\1\uffff\4\71\1\uffff\5\71\1\u011c\1\71\1\uffff\1\u011e\1\71\1\uffff\1\u0120\1\uffff\1\u0121\1\u0123\1\71\1\u0125\1\u0126\1\uffff\1\71\1\uffff\3\71\1\u012b\1\71\1\u012d\3\71\1\uffff\1\71\1\uffff\1\u0132\2\uffff\1\71\1\uffff\1\71\2\uffff\2\71\1\u0138\1\71\1\uffff\1\u013a\1\uffff\1\u013b\1\u013c\1\u013d\1\71\1\uffff\2\71\1\u0141\2\71\1\uffff\1\71\4\uffff\3\71\1\uffff\1\u0148\5\71\1\uffff\12\71\1\u0158\1\u0159\1\71\1\u015b\1\71\2\uffff\1\u015d\1\uffff\1\u015e\2\uffff";
    static final String DFA14_eofS =
        "\u015f\uffff";
    static final String DFA14_minS =
        "\1\0\1\101\1\105\1\117\1\124\1\75\1\123\1\56\2\117\1\145\1\105\1\150\1\157\1\154\1\75\1\146\1\154\1\111\1\uffff\1\75\1\46\2\75\1\74\1\75\1\52\1\75\1\55\1\116\1\uffff\1\157\2\150\1\157\1\115\1\110\1\130\1\53\11\uffff\1\60\1\uffff\1\0\1\uffff\1\0\2\uffff\1\115\1\123\1\uffff\1\107\1\114\1\117\1\124\2\uffff\1\164\2\uffff\1\124\1\105\1\117\1\164\1\106\1\151\1\60\1\162\1\157\2\uffff\1\60\1\164\1\163\1\111\1\101\1\107\14\uffff\1\75\2\uffff\1\75\13\uffff\1\111\1\uffff\1\151\1\141\1\157\1\156\1\101\1\120\1\122\1\124\14\uffff\1\60\2\0\3\uffff\1\123\1\120\1\105\1\124\1\111\1\101\1\115\1\117\1\141\1\117\1\101\1\114\1\165\1\101\1\154\1\142\1\uffff\1\60\1\141\1\uffff\1\60\1\145\2\124\1\111\1\116\4\uffff\1\117\1\111\1\144\2\162\1\147\1\107\3\105\2\0\1\uffff\1\124\1\111\1\114\1\60\1\122\1\123\1\124\1\111\1\60\1\164\1\60\1\113\1\60\1\162\1\125\1\145\1\154\1\uffff\1\164\1\uffff\1\60\1\103\1\111\1\116\1\103\1\105\1\116\1\107\2\60\1\164\1\60\1\111\1\104\1\101\1\122\1\0\1\60\1\116\1\105\1\uffff\1\111\1\124\1\111\1\103\1\uffff\1\151\1\uffff\1\60\1\uffff\1\156\1\114\1\60\1\145\1\60\1\uffff\1\110\1\103\1\107\1\124\1\104\1\60\1\116\2\uffff\1\60\1\uffff\1\116\1\105\1\104\1\116\1\uffff\1\125\1\130\1\103\1\105\1\114\1\60\1\143\1\uffff\1\60\1\124\1\uffff\1\60\1\uffff\2\60\1\137\2\60\1\uffff\1\105\1\uffff\1\101\1\106\1\137\1\60\1\105\1\60\1\124\1\122\1\105\1\uffff\1\137\1\uffff\1\60\2\uffff\1\101\1\uffff\1\114\2\uffff\1\104\1\122\1\60\1\114\1\uffff\1\60\1\uffff\3\60\1\141\1\uffff\1\123\1\111\1\60\1\131\1\116\1\uffff\1\117\4\uffff\1\163\1\123\1\124\1\uffff\1\60\1\101\1\103\1\163\2\105\1\uffff\1\115\1\101\1\145\2\122\1\105\1\114\1\162\1\124\1\101\2\60\1\164\1\60\1\114\2\uffff\1\60\1\uffff\1\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\117\1\105\1\117\1\125\1\75\1\123\1\56\1\117\1\122\1\145\1\105\1\150\2\157\1\75\1\156\1\154\1\127\1\uffff\1\174\1\75\1\172\2\75\1\76\2\75\1\76\1\116\1\uffff\1\157\2\150\1\157\1\115\1\131\1\130\1\75\11\uffff\1\71\1\uffff\1\uffff\1\uffff\1\uffff\2\uffff\1\116\1\123\1\uffff\1\123\1\114\1\117\1\124\2\uffff\1\164\2\uffff\1\124\1\105\1\117\1\164\1\106\1\151\1\172\1\162\1\157\2\uffff\1\172\1\164\1\163\1\111\1\122\1\107\14\uffff\1\75\2\uffff\1\75\13\uffff\1\123\1\uffff\1\151\1\141\1\157\1\156\1\101\1\120\1\122\1\124\14\uffff\1\71\2\uffff\3\uffff\1\124\1\120\1\105\1\124\1\111\1\101\1\115\1\117\1\141\1\117\1\101\1\114\1\165\1\101\1\154\1\142\1\uffff\1\172\1\141\1\uffff\1\172\1\145\2\124\1\125\1\116\4\uffff\1\117\1\111\1\144\2\162\1\147\1\107\3\105\2\uffff\1\uffff\1\124\1\111\1\114\1\172\1\122\1\123\1\124\1\111\1\172\1\164\1\172\1\113\1\172\1\162\1\125\1\145\1\154\1\uffff\1\164\1\uffff\1\172\1\103\1\111\1\116\1\103\1\105\1\116\1\107\2\172\1\164\1\172\1\111\1\104\1\101\1\122\1\uffff\1\172\1\116\1\105\1\uffff\1\111\1\124\1\111\1\103\1\uffff\1\151\1\uffff\1\172\1\uffff\1\156\1\114\1\172\1\145\1\172\1\uffff\1\110\1\103\1\107\1\124\1\104\1\172\1\116\2\uffff\1\172\1\uffff\1\116\1\105\1\104\1\116\1\uffff\1\125\1\130\1\103\1\105\1\114\1\172\1\143\1\uffff\1\172\1\124\1\uffff\1\172\1\uffff\2\172\1\137\2\172\1\uffff\1\105\1\uffff\1\101\1\106\1\137\1\172\1\105\1\172\1\124\1\122\1\105\1\uffff\1\137\1\uffff\1\172\2\uffff\1\101\1\uffff\1\114\2\uffff\1\104\1\122\1\172\1\114\1\uffff\1\172\1\uffff\3\172\1\141\1\uffff\1\123\1\111\1\172\1\131\1\116\1\uffff\1\117\4\uffff\1\163\1\123\1\124\1\uffff\1\172\1\101\1\103\1\163\2\105\1\uffff\1\115\1\101\1\145\2\122\1\105\1\114\1\162\1\124\1\101\2\172\1\164\1\172\1\114\2\uffff\1\172\1\uffff\1\172\2\uffff";
    static final String DFA14_acceptS =
        "\23\uffff\1\25\12\uffff\1\53\10\uffff\1\112\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\uffff\1\127\1\uffff\1\131\1\uffff\1\136\1\137\2\uffff\1\131\4\uffff\1\100\1\5\1\uffff\1\7\1\45\11\uffff\1\33\1\21\6\uffff\1\25\1\26\1\111\1\30\1\27\1\107\1\32\1\110\1\31\1\34\1\54\1\37\1\uffff\1\35\1\40\1\uffff\1\36\1\101\1\134\1\135\1\43\1\102\1\44\1\50\1\104\1\126\1\113\1\uffff\1\53\10\uffff\1\103\1\125\1\114\1\112\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\3\uffff\1\130\1\133\1\136\20\uffff\1\17\2\uffff\1\22\6\uffff\1\105\1\41\1\106\1\42\14\uffff\1\130\21\uffff\1\20\1\uffff\1\60\24\uffff\1\14\4\uffff\1\76\1\uffff\1\10\1\uffff\1\66\5\uffff\1\23\7\uffff\1\55\1\56\1\uffff\1\61\4\uffff\1\1\7\uffff\1\12\2\uffff\1\16\1\uffff\1\62\5\uffff\1\52\1\uffff\1\57\11\uffff\1\4\1\uffff\1\13\1\uffff\1\63\1\24\1\uffff\1\74\1\uffff\1\51\1\64\4\uffff\1\73\1\uffff\1\67\4\uffff\1\15\5\uffff\1\72\1\uffff\1\11\1\2\1\77\1\3\3\uffff\1\65\6\uffff\1\70\17\uffff\1\71\1\75\1\uffff\1\46\1\uffff\1\6\1\47";
    static final String DFA14_specialS =
        "\1\6\61\uffff\1\7\1\uffff\1\5\121\uffff\1\0\1\2\53\uffff\1\4\1\1\45\uffff\1\3\u0084\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\66\2\65\2\66\1\65\22\66\1\65\1\27\1\64\2\66\1\33\1\25\1\62\1\56\1\57\1\5\1\46\1\50\1\34\1\7\1\32\12\60\1\47\1\51\1\30\1\17\1\31\1\23\1\66\1\4\1\11\1\1\1\13\1\45\1\63\1\10\1\63\1\43\10\63\1\2\1\22\1\44\1\35\1\3\4\63\1\54\1\66\1\55\1\26\1\6\1\66\2\63\1\40\1\15\1\21\1\16\2\63\1\20\2\63\1\42\5\63\1\12\1\41\2\63\1\37\1\14\3\63\1\52\1\24\1\53\1\36\uff81\66",
            "\1\70\15\uffff\1\67",
            "\1\72",
            "\1\73",
            "\1\74\1\75",
            "\1\76",
            "\1\100",
            "\1\101",
            "\1\103",
            "\1\105\2\uffff\1\104",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\113\2\uffff\1\112",
            "\1\114",
            "\1\116\7\uffff\1\117",
            "\1\120",
            "\1\123\12\uffff\1\122\2\uffff\1\121",
            "",
            "\1\126\76\uffff\1\125",
            "\1\130\26\uffff\1\131",
            "\1\133\3\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\135",
            "\1\140\1\137",
            "\1\142\1\143",
            "\1\146\4\uffff\1\147\15\uffff\1\145",
            "\1\151",
            "\1\155\17\uffff\1\154\1\153",
            "\1\157",
            "",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167\20\uffff\1\166",
            "\1\170",
            "\1\172\21\uffff\1\171",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u0085",
            "",
            "\47\u0087\1\u0088\64\u0087\1\u0086\uffa3\u0087",
            "",
            "\0\u0089",
            "",
            "",
            "\1\u008c\1\u008b",
            "\1\u008d",
            "",
            "\1\u008f\13\uffff\1\u008e",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "",
            "",
            "\1\u0093",
            "",
            "",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\24\71\1\u009a\5\71",
            "\1\u009c",
            "\1\u009d",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\20\uffff\1\u00a3",
            "\1\u00a4",
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
            "\1\u00a5",
            "",
            "",
            "\1\u00a7",
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
            "\1\u00a9\11\uffff\1\u00aa",
            "",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
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
            "\12\u0085",
            "\47\u00b4\1\u00b3\uffd8\u00b4",
            "\47\u0087\1\u0088\64\u0087\1\u0086\uffa3\u0087",
            "",
            "",
            "",
            "\1\u00b6\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00c8",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd\13\uffff\1\u00ce",
            "\1\u00cf",
            "",
            "",
            "",
            "",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\47\u0089\1\u00da\uffd8\u0089",
            "\47\u0087\1\u0088\64\u0087\1\u0086\uffa3\u0087",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00e4",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00e6",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "",
            "\1\u00ec",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00f7",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\0\u00b5",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "",
            "\1\u0104",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u0106",
            "\1\u0107",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0109",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0111",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u011d",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u011f",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\u0122\1\uffff\32\71",
            "\1\u0124",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\1\u0127",
            "",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u012c",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "",
            "\1\u0131",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "",
            "\1\u0133",
            "",
            "\1\u0134",
            "",
            "",
            "\1\u0135",
            "\1\u0136",
            "\12\71\7\uffff\32\71\4\uffff\1\u0137\1\uffff\32\71",
            "\1\u0139",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "",
            "",
            "",
            "",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u015a",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "\1\u015c",
            "",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            "\12\71\7\uffff\32\71\4\uffff\1\71\1\uffff\32\71",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | RULE_DOTS | RULE_MINUS | RULE_PLUS | RULE_COMMA | RULE_DOT_COMMA | RULE_LEFT_CHAVES | RULE_RIGHT_CHAVES | RULE_LEFT_COCHETE | RULE_RIGHT_COCHETE | RULE_LEFT_PARENTESE | RULE_RIGHT_PARENTESE | RULE_INC_OP | RULE_DEC_OP | RULE_INTEGER_NUMBER | RULE_STRING_C | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_134 = input.LA(1);

                        s = -1;
                        if ( (LA14_134=='\'') ) {s = 179;}

                        else if ( ((LA14_134>='\u0000' && LA14_134<='&')||(LA14_134>='(' && LA14_134<='\uFFFF')) ) {s = 180;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_180 = input.LA(1);

                        s = -1;
                        if ( (LA14_180=='\'') ) {s = 136;}

                        else if ( (LA14_180=='\\') ) {s = 134;}

                        else if ( ((LA14_180>='\u0000' && LA14_180<='&')||(LA14_180>='(' && LA14_180<='[')||(LA14_180>=']' && LA14_180<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_135 = input.LA(1);

                        s = -1;
                        if ( (LA14_135=='\'') ) {s = 136;}

                        else if ( (LA14_135=='\\') ) {s = 134;}

                        else if ( ((LA14_135>='\u0000' && LA14_135<='&')||(LA14_135>='(' && LA14_135<='[')||(LA14_135>=']' && LA14_135<='\uFFFF')) ) {s = 135;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_218 = input.LA(1);

                        s = -1;
                        if ( ((LA14_218>='\u0000' && LA14_218<='\uFFFF')) ) {s = 181;}

                        else s = 137;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_179 = input.LA(1);

                        s = -1;
                        if ( (LA14_179=='\'') ) {s = 218;}

                        else if ( ((LA14_179>='\u0000' && LA14_179<='&')||(LA14_179>='(' && LA14_179<='\uFFFF')) ) {s = 137;}

                        else s = 181;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_52 = input.LA(1);

                        s = -1;
                        if ( ((LA14_52>='\u0000' && LA14_52<='\uFFFF')) ) {s = 137;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='C') ) {s = 1;}

                        else if ( (LA14_0=='R') ) {s = 2;}

                        else if ( (LA14_0=='V') ) {s = 3;}

                        else if ( (LA14_0=='A') ) {s = 4;}

                        else if ( (LA14_0=='*') ) {s = 5;}

                        else if ( (LA14_0=='_') ) {s = 6;}

                        else if ( (LA14_0=='.') ) {s = 7;}

                        else if ( (LA14_0=='G') ) {s = 8;}

                        else if ( (LA14_0=='B') ) {s = 9;}

                        else if ( (LA14_0=='r') ) {s = 10;}

                        else if ( (LA14_0=='D') ) {s = 11;}

                        else if ( (LA14_0=='w') ) {s = 12;}

                        else if ( (LA14_0=='d') ) {s = 13;}

                        else if ( (LA14_0=='f') ) {s = 14;}

                        else if ( (LA14_0=='=') ) {s = 15;}

                        else if ( (LA14_0=='i') ) {s = 16;}

                        else if ( (LA14_0=='e') ) {s = 17;}

                        else if ( (LA14_0=='S') ) {s = 18;}

                        else if ( (LA14_0=='?') ) {s = 19;}

                        else if ( (LA14_0=='|') ) {s = 20;}

                        else if ( (LA14_0=='&') ) {s = 21;}

                        else if ( (LA14_0=='^') ) {s = 22;}

                        else if ( (LA14_0=='!') ) {s = 23;}

                        else if ( (LA14_0=='<') ) {s = 24;}

                        else if ( (LA14_0=='>') ) {s = 25;}

                        else if ( (LA14_0=='/') ) {s = 26;}

                        else if ( (LA14_0=='%') ) {s = 27;}

                        else if ( (LA14_0=='-') ) {s = 28;}

                        else if ( (LA14_0=='U') ) {s = 29;}

                        else if ( (LA14_0=='~') ) {s = 30;}

                        else if ( (LA14_0=='v') ) {s = 31;}

                        else if ( (LA14_0=='c') ) {s = 32;}

                        else if ( (LA14_0=='s') ) {s = 33;}

                        else if ( (LA14_0=='l') ) {s = 34;}

                        else if ( (LA14_0=='I') ) {s = 35;}

                        else if ( (LA14_0=='T') ) {s = 36;}

                        else if ( (LA14_0=='E') ) {s = 37;}

                        else if ( (LA14_0=='+') ) {s = 38;}

                        else if ( (LA14_0==':') ) {s = 39;}

                        else if ( (LA14_0==',') ) {s = 40;}

                        else if ( (LA14_0==';') ) {s = 41;}

                        else if ( (LA14_0=='{') ) {s = 42;}

                        else if ( (LA14_0=='}') ) {s = 43;}

                        else if ( (LA14_0=='[') ) {s = 44;}

                        else if ( (LA14_0==']') ) {s = 45;}

                        else if ( (LA14_0=='(') ) {s = 46;}

                        else if ( (LA14_0==')') ) {s = 47;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 48;}

                        else if ( (LA14_0=='\'') ) {s = 50;}

                        else if ( (LA14_0=='F'||LA14_0=='H'||(LA14_0>='J' && LA14_0<='Q')||(LA14_0>='W' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='b')||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='k')||(LA14_0>='m' && LA14_0<='q')||(LA14_0>='t' && LA14_0<='u')||(LA14_0>='x' && LA14_0<='z')) ) {s = 51;}

                        else if ( (LA14_0=='\"') ) {s = 52;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 53;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='$')||LA14_0=='@'||LA14_0=='\\'||LA14_0=='`'||(LA14_0>='\u007F' && LA14_0<='\uFFFF')) ) {s = 54;}

                        else s = 49;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_50 = input.LA(1);

                        s = -1;
                        if ( (LA14_50=='\\') ) {s = 134;}

                        else if ( ((LA14_50>='\u0000' && LA14_50<='&')||(LA14_50>='(' && LA14_50<='[')||(LA14_50>=']' && LA14_50<='\uFFFF')) ) {s = 135;}

                        else if ( (LA14_50=='\'') ) {s = 136;}

                        else s = 54;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}