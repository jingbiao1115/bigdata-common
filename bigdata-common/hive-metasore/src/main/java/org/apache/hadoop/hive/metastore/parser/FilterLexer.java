// $ANTLR 3.4 org/apache/hadoop/hive/metastore/parser/Filter.g 2017-07-25 10:00:31

package org.apache.hadoop.hive.metastore.parser;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FilterLexer extends Lexer {
    public static final int EOF=-1;
    public static final int BETWEEN=4;
    public static final int COMMA=5;
    public static final int DateLiteral=6;
    public static final int DateString=7;
    public static final int Digit=8;
    public static final int EQUAL=9;
    public static final int GREATERTHAN=10;
    public static final int GREATERTHANOREQUALTO=11;
    public static final int IN=12;
    public static final int Identifier=13;
    public static final int IntegralLiteral=14;
    public static final int KW_AND=15;
    public static final int KW_CONST=16;
    public static final int KW_DATE=17;
    public static final int KW_LIKE=18;
    public static final int KW_NOT=19;
    public static final int KW_OR=20;
    public static final int KW_STRUCT=21;
    public static final int LESSTHAN=22;
    public static final int LESSTHANOREQUALTO=23;
    public static final int LPAREN=24;
    public static final int Letter=25;
    public static final int NOTEQUAL=26;
    public static final int RPAREN=27;
    public static final int StringLiteral=28;
    public static final int WS=29;

      public String errorMsg;

      private static final Pattern datePattern = Pattern.compile(".*(\\d\\d\\d\\d-\\d\\d-\\d\\d).*");
      private static final ThreadLocal<SimpleDateFormat> dateFormat =
           new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
          SimpleDateFormat val = new SimpleDateFormat("yyyy-MM-dd");
          val.setLenient(false); // Without this, 2020-20-20 becomes 2021-08-20.
          return val;
        };
      };

      public static java.sql.Date ExtractDate (String input) {
        Matcher m = datePattern.matcher(input);
        if (!m.matches()) {
          return null;
        }
        try {
          return new java.sql.Date(dateFormat.get().parse(m.group(1)).getTime());
        } catch (ParseException pe) {
          return null;
        }
      }

      @Override
      public void emitErrorMessage(String msg) {
        // save for caller to detect invalid filter
        errorMsg = msg;
      }


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public FilterLexer() {} 
    public FilterLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FilterLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "org/apache/hadoop/hive/metastore/parser/Filter.g"; }

    // $ANTLR start "KW_NOT"
    public final void mKW_NOT() throws RecognitionException {
        try {
            int _type = KW_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:421:8: ( 'NOT' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:421:10: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NOT"

    // $ANTLR start "KW_AND"
    public final void mKW_AND() throws RecognitionException {
        try {
            int _type = KW_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:422:8: ( 'AND' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:422:10: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AND"

    // $ANTLR start "KW_OR"
    public final void mKW_OR() throws RecognitionException {
        try {
            int _type = KW_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:423:7: ( 'OR' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:423:9: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OR"

    // $ANTLR start "KW_LIKE"
    public final void mKW_LIKE() throws RecognitionException {
        try {
            int _type = KW_LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:424:9: ( 'LIKE' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:424:11: 'LIKE'
            {
            match("LIKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LIKE"

    // $ANTLR start "KW_DATE"
    public final void mKW_DATE() throws RecognitionException {
        try {
            int _type = KW_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:425:9: ( 'date' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:425:11: 'date'
            {
            match("date"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATE"

    // $ANTLR start "KW_CONST"
    public final void mKW_CONST() throws RecognitionException {
        try {
            int _type = KW_CONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:426:10: ( 'CONST' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:426:12: 'CONST'
            {
            match("CONST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONST"

    // $ANTLR start "KW_STRUCT"
    public final void mKW_STRUCT() throws RecognitionException {
        try {
            int _type = KW_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:427:11: ( 'STRUCT' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:427:13: 'STRUCT'
            {
            match("STRUCT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STRUCT"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:430:8: ( '(' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:430:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:431:8: ( ')' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:431:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:432:7: ( ',' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:432:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:433:7: ( '=' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:433:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:434:10: ( '<>' | '!=' )
            int alt1=2;
            switch ( input.LA(1) ) {
            case '<':
                {
                alt1=1;
                }
                break;
            case '!':
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:434:12: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:434:19: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "LESSTHANOREQUALTO"
    public final void mLESSTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = LESSTHANOREQUALTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:435:19: ( '<=' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:435:21: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHANOREQUALTO"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:436:10: ( '<' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:436:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHAN"

    // $ANTLR start "GREATERTHANOREQUALTO"
    public final void mGREATERTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = GREATERTHANOREQUALTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:437:22: ( '>=' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:437:24: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHANOREQUALTO"

    // $ANTLR start "GREATERTHAN"
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            int _type = GREATERTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:438:13: ( '>' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:438:15: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHAN"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:439:9: ( 'BETWEEN' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:439:11: 'BETWEEN'
            {
            match("BETWEEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BETWEEN"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:440:4: ( 'IN' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:440:6: 'IN'
            {
            match("IN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:446:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:451:5: ( '0' .. '9' )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "DateString"
    public final void mDateString() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:455:5: ( ( Digit ) ( Digit ) ( Digit ) ( Digit ) '-' ( Digit ) ( Digit ) '-' ( Digit ) ( Digit ) )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:456:5: ( Digit ) ( Digit ) ( Digit ) ( Digit ) '-' ( Digit ) ( Digit ) '-' ( Digit ) ( Digit )
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('-'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            match('-'); 

            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DateString"

    // $ANTLR start "DateLiteral"
    public final void mDateLiteral() throws RecognitionException {
        try {
            int _type = DateLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:463:5: ( ( KW_DATE )? DateString {...}?)
            // org/apache/hadoop/hive/metastore/parser/Filter.g:464:5: ( KW_DATE )? DateString {...}?
            {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:464:5: ( KW_DATE )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case 'd':
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:464:5: KW_DATE
                    {
                    mKW_DATE(); 


                    }
                    break;

            }


            mDateString(); 


            if ( !(( ExtractDate(getText()) != null )) ) {
                throw new FailedPredicateException(input, "DateLiteral", " ExtractDate(getText()) != null ");
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DateLiteral"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:468:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' ) )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:469:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )
            {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:469:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )
            int alt5=2;
            switch ( input.LA(1) ) {
            case '\'':
                {
                alt5=1;
                }
                break;
            case '\"':
                {
                alt5=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:469:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
                    {
                    match('\''); 

                    // org/apache/hadoop/hive/metastore/parser/Filter.g:469:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
                    loop3:
                    do {
                        int alt3=3;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '\u0000' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                            alt3=1;
                        }
                        else if ( (LA3_0=='\\') ) {
                            alt3=2;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:469:14: ~ ( '\\'' | '\\\\' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:469:29: ( '\\\\' . )
                    	    {
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:469:29: ( '\\\\' . )
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:469:30: '\\\\' .
                    	    {
                    	    match('\\'); 

                    	    matchAny(); 

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    match('\''); 

                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:470:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
                    {
                    match('\"'); 

                    // org/apache/hadoop/hive/metastore/parser/Filter.g:470:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '[')||(LA4_0 >= ']' && LA4_0 <= '\uFFFF')) ) {
                            alt4=1;
                        }
                        else if ( (LA4_0=='\\') ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:470:14: ~ ( '\\\"' | '\\\\' )
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:470:29: ( '\\\\' . )
                    	    {
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:470:29: ( '\\\\' . )
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:470:30: '\\\\' .
                    	    {
                    	    match('\\'); 

                    	    matchAny(); 

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match('\"'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "IntegralLiteral"
    public final void mIntegralLiteral() throws RecognitionException {
        try {
            int _type = IntegralLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:475:5: ( ( '-' )? ( Digit )+ )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:476:5: ( '-' )? ( Digit )+
            {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:476:5: ( '-' )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case '-':
                    {
                    alt6=1;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:476:6: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // org/apache/hadoop/hive/metastore/parser/Filter.g:476:12: ( Digit )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt7=1;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntegralLiteral"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:480:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:481:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // org/apache/hadoop/hive/metastore/parser/Filter.g:481:22: ( Letter | Digit | '_' )*
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt8=1;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // org/apache/hadoop/hive/metastore/parser/Filter.g:484:5: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:484:9: ( ' ' | '\\r' | '\\t' | '\\n' )+
            {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:484:9: ( ' ' | '\\r' | '\\t' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case '\t':
                case '\n':
                case '\r':
                case ' ':
                    {
                    alt9=1;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // org/apache/hadoop/hive/metastore/parser/Filter.g:1:8: ( KW_NOT | KW_AND | KW_OR | KW_LIKE | KW_DATE | KW_CONST | KW_STRUCT | LPAREN | RPAREN | COMMA | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | BETWEEN | IN | DateLiteral | StringLiteral | IntegralLiteral | Identifier | WS )
        int alt10=23;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:10: KW_NOT
                {
                mKW_NOT(); 


                }
                break;
            case 2 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:17: KW_AND
                {
                mKW_AND(); 


                }
                break;
            case 3 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:24: KW_OR
                {
                mKW_OR(); 


                }
                break;
            case 4 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:30: KW_LIKE
                {
                mKW_LIKE(); 


                }
                break;
            case 5 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:38: KW_DATE
                {
                mKW_DATE(); 


                }
                break;
            case 6 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:46: KW_CONST
                {
                mKW_CONST(); 


                }
                break;
            case 7 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:55: KW_STRUCT
                {
                mKW_STRUCT(); 


                }
                break;
            case 8 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:65: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 9 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:72: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 10 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:79: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 11 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:85: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 12 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:91: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 13 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:100: LESSTHANOREQUALTO
                {
                mLESSTHANOREQUALTO(); 


                }
                break;
            case 14 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:118: LESSTHAN
                {
                mLESSTHAN(); 


                }
                break;
            case 15 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:127: GREATERTHANOREQUALTO
                {
                mGREATERTHANOREQUALTO(); 


                }
                break;
            case 16 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:148: GREATERTHAN
                {
                mGREATERTHAN(); 


                }
                break;
            case 17 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:160: BETWEEN
                {
                mBETWEEN(); 


                }
                break;
            case 18 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:168: IN
                {
                mIN(); 


                }
                break;
            case 19 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:171: DateLiteral
                {
                mDateLiteral(); 


                }
                break;
            case 20 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:183: StringLiteral
                {
                mStringLiteral(); 


                }
                break;
            case 21 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:197: IntegralLiteral
                {
                mIntegralLiteral(); 


                }
                break;
            case 22 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:213: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 23 :
                // org/apache/hadoop/hive/metastore/parser/Filter.g:1:224: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\1\uffff\7\24\4\uffff\1\36\1\uffff\1\40\2\24\1\23\4\uffff\2\24\1"+
        "\46\4\24\4\uffff\1\24\1\54\1\23\1\56\1\57\1\uffff\5\24\1\uffff\1"+
        "\23\2\uffff\1\66\1\67\3\24\1\23\2\uffff\1\24\1\77\2\24\1\uffff\1"+
        "\23\1\24\1\uffff\1\103\2\24\1\uffff\1\106\1\24\1\uffff";
    static final String DFA10_eofS =
        "\107\uffff";
    static final String DFA10_minS =
        "\1\11\1\117\1\116\1\122\1\111\1\141\1\117\1\124\4\uffff\1\75\1\uffff"+
        "\1\75\1\105\1\116\1\60\4\uffff\1\124\1\104\1\60\1\113\1\164\1\116"+
        "\1\122\4\uffff\1\124\4\60\1\uffff\1\105\1\145\1\123\1\125\1\127"+
        "\1\uffff\1\60\2\uffff\2\60\1\124\1\103\1\105\1\55\2\uffff\2\60\1"+
        "\124\1\105\1\uffff\2\60\1\uffff\1\60\1\116\1\60\1\uffff\1\60\1\55"+
        "\1\uffff";
    static final String DFA10_maxS =
        "\1\172\1\117\1\116\1\122\1\111\1\141\1\117\1\124\4\uffff\1\76\1"+
        "\uffff\1\75\1\105\1\116\1\172\4\uffff\1\124\1\104\1\172\1\113\1"+
        "\164\1\116\1\122\4\uffff\1\124\4\172\1\uffff\1\105\1\145\1\123\1"+
        "\125\1\127\1\uffff\1\172\2\uffff\2\172\1\124\1\103\1\105\1\172\2"+
        "\uffff\1\71\1\172\1\124\1\105\1\uffff\1\172\1\71\1\uffff\1\172\1"+
        "\116\1\71\1\uffff\1\172\1\55\1\uffff";
    static final String DFA10_acceptS =
        "\10\uffff\1\10\1\11\1\12\1\13\1\uffff\1\14\4\uffff\1\24\1\25\1\26"+
        "\1\27\7\uffff\1\15\1\16\1\17\1\20\5\uffff\1\3\5\uffff\1\22\1\uffff"+
        "\1\1\1\2\6\uffff\1\4\1\5\4\uffff\1\23\2\uffff\1\6\3\uffff\1\7\2"+
        "\uffff\1\21";
    static final String DFA10_specialS =
        "\107\uffff}>";
    static final String[] DFA10_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\1\15\1\22\4\uffff\1\22\1\10"+
            "\1\11\2\uffff\1\12\1\23\2\uffff\12\21\2\uffff\1\14\1\13\1\16"+
            "\2\uffff\1\2\1\17\1\6\5\24\1\20\2\24\1\4\1\24\1\1\1\3\3\24\1"+
            "\7\7\24\6\uffff\3\24\1\5\26\24",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "",
            "",
            "",
            "\1\35\1\15",
            "",
            "\1\37",
            "\1\41",
            "\1\42",
            "\12\43\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "",
            "",
            "\1\44",
            "\1\45",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "",
            "",
            "\1\53",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\55\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\12\65\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\70\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74\2\uffff\12\75\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\12\76",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\100",
            "\1\101",
            "",
            "\12\75\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\102",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\104",
            "\12\105",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\74",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KW_NOT | KW_AND | KW_OR | KW_LIKE | KW_DATE | KW_CONST | KW_STRUCT | LPAREN | RPAREN | COMMA | EQUAL | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | BETWEEN | IN | DateLiteral | StringLiteral | IntegralLiteral | Identifier | WS );";
        }
    }
 

}