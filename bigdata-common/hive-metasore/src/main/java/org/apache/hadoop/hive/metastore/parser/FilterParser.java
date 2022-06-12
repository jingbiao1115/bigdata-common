// $ANTLR 3.4 org/apache/hadoop/hive/metastore/parser/Filter.g 2017-07-25 10:00:31

package org.apache.hadoop.hive.metastore.parser;

import org.apache.hadoop.hive.metastore.parser.ExpressionTree;
import org.apache.hadoop.hive.metastore.parser.ExpressionTree.LeafNode;
import org.apache.hadoop.hive.metastore.parser.ExpressionTree.Operator;
import org.apache.hadoop.hive.metastore.parser.ExpressionTree.LogicalOperator;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FilterParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BETWEEN", "COMMA", "DateLiteral", "DateString", "Digit", "EQUAL", "GREATERTHAN", "GREATERTHANOREQUALTO", "IN", "Identifier", "IntegralLiteral", "KW_AND", "KW_CONST", "KW_DATE", "KW_LIKE", "KW_NOT", "KW_OR", "KW_STRUCT", "LESSTHAN", "LESSTHANOREQUALTO", "LPAREN", "Letter", "NOTEQUAL", "RPAREN", "StringLiteral", "WS"
    };

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

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FilterParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FilterParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return FilterParser.tokenNames; }
    public String getGrammarFileName() { return "org/apache/hadoop/hive/metastore/parser/Filter.g"; }


      public ExpressionTree tree = new ExpressionTree();

      public static String TrimQuotes (String input) {
        if (input.length () > 1) {
          if ((input.charAt (0) == '"' && input.charAt (input.length () - 1) == '"')
            || (input.charAt (0) == '\'' && input.charAt (input.length () - 1) == '\'')) {
            return input.substring (1, input.length () - 1);
          }
        }
        return input;
      }



    // $ANTLR start "filter"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:99:1: filter : orExpression ;
    public final void filter() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:100:5: ( orExpression )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:101:5: orExpression
            {
            pushFollow(FOLLOW_orExpression_in_filter84);
            orExpression();

            state._fsp--;


            }

        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "filter"



    // $ANTLR start "orExpression"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:104:1: orExpression : andExpression ( KW_OR andExpression )* ;
    public final void orExpression() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:105:5: ( andExpression ( KW_OR andExpression )* )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:106:5: andExpression ( KW_OR andExpression )*
            {
            pushFollow(FOLLOW_andExpression_in_orExpression106);
            andExpression();

            state._fsp--;


            // org/apache/hadoop/hive/metastore/parser/Filter.g:106:19: ( KW_OR andExpression )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case KW_OR:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:106:20: KW_OR andExpression
            	    {
            	    match(input,KW_OR,FOLLOW_KW_OR_in_orExpression109); 

            	    pushFollow(FOLLOW_andExpression_in_orExpression111);
            	    andExpression();

            	    state._fsp--;


            	     tree.addIntermediateNode(LogicalOperator.OR); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "orExpression"



    // $ANTLR start "andExpression"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:109:1: andExpression : expression ( KW_AND expression )* ;
    public final void andExpression() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:110:5: ( expression ( KW_AND expression )* )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:111:5: expression ( KW_AND expression )*
            {
            pushFollow(FOLLOW_expression_in_andExpression137);
            expression();

            state._fsp--;


            // org/apache/hadoop/hive/metastore/parser/Filter.g:111:16: ( KW_AND expression )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case KW_AND:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:111:17: KW_AND expression
            	    {
            	    match(input,KW_AND,FOLLOW_KW_AND_in_andExpression140); 

            	    pushFollow(FOLLOW_expression_in_andExpression142);
            	    expression();

            	    state._fsp--;


            	     tree.addIntermediateNode(LogicalOperator.AND); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "andExpression"



    // $ANTLR start "expression"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:114:1: expression : ( LPAREN orExpression RPAREN | operatorExpression );
    public final void expression() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:115:5: ( LPAREN orExpression RPAREN | operatorExpression )
            int alt3=2;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                switch ( input.LA(2) ) {
                case Identifier:
                    {
                    switch ( input.LA(3) ) {
                    case RPAREN:
                        {
                        alt3=2;
                        }
                        break;
                    case BETWEEN:
                    case EQUAL:
                    case GREATERTHAN:
                    case GREATERTHANOREQUALTO:
                    case KW_LIKE:
                    case KW_NOT:
                    case LESSTHAN:
                    case LESSTHANOREQUALTO:
                    case NOTEQUAL:
                        {
                        alt3=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;

                    }

                    }
                    break;
                case KW_STRUCT:
                    {
                    alt3=2;
                    }
                    break;
                case DateLiteral:
                case IntegralLiteral:
                case LPAREN:
                case StringLiteral:
                    {
                    alt3=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

                }
                break;
            case DateLiteral:
            case Identifier:
            case IntegralLiteral:
            case StringLiteral:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:116:5: LPAREN orExpression RPAREN
                    {
                    match(input,LPAREN,FOLLOW_LPAREN_in_expression169); 

                    pushFollow(FOLLOW_orExpression_in_expression171);
                    orExpression();

                    state._fsp--;


                    match(input,RPAREN,FOLLOW_RPAREN_in_expression173); 

                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:118:5: operatorExpression
                    {
                    pushFollow(FOLLOW_operatorExpression_in_expression185);
                    operatorExpression();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "expression"



    // $ANTLR start "operatorExpression"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:121:1: operatorExpression : ( betweenExpression | inExpression | multiColInExpression | binOpExpression );
    public final void operatorExpression() throws RecognitionException {
        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:122:5: ( betweenExpression | inExpression | multiColInExpression | binOpExpression )
            int alt4=4;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                switch ( input.LA(2) ) {
                case BETWEEN:
                case KW_NOT:
                    {
                    alt4=1;
                    }
                    break;
                case EQUAL:
                case GREATERTHAN:
                case GREATERTHANOREQUALTO:
                case KW_LIKE:
                case LESSTHAN:
                case LESSTHANOREQUALTO:
                case NOTEQUAL:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }

                }
                break;
            case LPAREN:
                {
                switch ( input.LA(2) ) {
                case Identifier:
                    {
                    alt4=2;
                    }
                    break;
                case KW_STRUCT:
                    {
                    alt4=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;

                }

                }
                break;
            case DateLiteral:
            case IntegralLiteral:
            case StringLiteral:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:123:5: betweenExpression
                    {
                    pushFollow(FOLLOW_betweenExpression_in_operatorExpression206);
                    betweenExpression();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:125:5: inExpression
                    {
                    pushFollow(FOLLOW_inExpression_in_operatorExpression218);
                    inExpression();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:127:5: multiColInExpression
                    {
                    pushFollow(FOLLOW_multiColInExpression_in_operatorExpression230);
                    multiColInExpression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:129:5: binOpExpression
                    {
                    pushFollow(FOLLOW_binOpExpression_in_operatorExpression242);
                    binOpExpression();

                    state._fsp--;


                    }
                    break;

            }
        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "operatorExpression"



    // $ANTLR start "binOpExpression"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:132:1: binOpExpression : ( ( (key= Identifier op= operator value= DateLiteral ) | (value= DateLiteral op= operator key= Identifier ) ) | ( (key= Identifier op= operator value= StringLiteral ) | (value= StringLiteral op= operator key= Identifier ) ) | ( (key= Identifier op= operator value= IntegralLiteral ) | (value= IntegralLiteral op= operator key= Identifier ) ) ) ;
    public final void binOpExpression() throws RecognitionException {
        Token key=null;
        Token value=null;
        Operator op =null;



            boolean isReverseOrder = false;
            Object val = null;

        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:137:5: ( ( ( (key= Identifier op= operator value= DateLiteral ) | (value= DateLiteral op= operator key= Identifier ) ) | ( (key= Identifier op= operator value= StringLiteral ) | (value= StringLiteral op= operator key= Identifier ) ) | ( (key= Identifier op= operator value= IntegralLiteral ) | (value= IntegralLiteral op= operator key= Identifier ) ) ) )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:138:5: ( ( (key= Identifier op= operator value= DateLiteral ) | (value= DateLiteral op= operator key= Identifier ) ) | ( (key= Identifier op= operator value= StringLiteral ) | (value= StringLiteral op= operator key= Identifier ) ) | ( (key= Identifier op= operator value= IntegralLiteral ) | (value= IntegralLiteral op= operator key= Identifier ) ) )
            {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:138:5: ( ( (key= Identifier op= operator value= DateLiteral ) | (value= DateLiteral op= operator key= Identifier ) ) | ( (key= Identifier op= operator value= StringLiteral ) | (value= StringLiteral op= operator key= Identifier ) ) | ( (key= Identifier op= operator value= IntegralLiteral ) | (value= IntegralLiteral op= operator key= Identifier ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                switch ( input.LA(2) ) {
                case EQUAL:
                case GREATERTHAN:
                case GREATERTHANOREQUALTO:
                case KW_LIKE:
                case LESSTHAN:
                case LESSTHANOREQUALTO:
                case NOTEQUAL:
                    {
                    switch ( input.LA(3) ) {
                    case DateLiteral:
                        {
                        alt8=1;
                        }
                        break;
                    case StringLiteral:
                        {
                        alt8=2;
                        }
                        break;
                    case IntegralLiteral:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }

                }
                break;
            case DateLiteral:
                {
                alt8=1;
                }
                break;
            case StringLiteral:
                {
                alt8=2;
                }
                break;
            case IntegralLiteral:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:139:8: ( (key= Identifier op= operator value= DateLiteral ) | (value= DateLiteral op= operator key= Identifier ) )
                    {
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:139:8: ( (key= Identifier op= operator value= DateLiteral ) | (value= DateLiteral op= operator key= Identifier ) )
                    int alt5=2;
                    switch ( input.LA(1) ) {
                    case Identifier:
                        {
                        alt5=1;
                        }
                        break;
                    case DateLiteral:
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
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:140:10: (key= Identifier op= operator value= DateLiteral )
                            {
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:140:10: (key= Identifier op= operator value= DateLiteral )
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:140:11: key= Identifier op= operator value= DateLiteral
                            {
                            key=(Token)match(input,Identifier,FOLLOW_Identifier_in_binOpExpression293); 

                            pushFollow(FOLLOW_operator_in_binOpExpression299);
                            op=operator();

                            state._fsp--;


                            value=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_binOpExpression306); 

                            }


                            }
                            break;
                        case 2 :
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:142:10: (value= DateLiteral op= operator key= Identifier )
                            {
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:142:10: (value= DateLiteral op= operator key= Identifier )
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:142:11: value= DateLiteral op= operator key= Identifier
                            {
                            value=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_binOpExpression334); 

                            pushFollow(FOLLOW_operator_in_binOpExpression341);
                            op=operator();

                            state._fsp--;


                            key=(Token)match(input,Identifier,FOLLOW_Identifier_in_binOpExpression347); 

                            }


                             isReverseOrder = true; 

                            }
                            break;

                    }


                     val = FilterLexer.ExtractDate(value.getText()); 

                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:145:8: ( (key= Identifier op= operator value= StringLiteral ) | (value= StringLiteral op= operator key= Identifier ) )
                    {
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:145:8: ( (key= Identifier op= operator value= StringLiteral ) | (value= StringLiteral op= operator key= Identifier ) )
                    int alt6=2;
                    switch ( input.LA(1) ) {
                    case Identifier:
                        {
                        alt6=1;
                        }
                        break;
                    case StringLiteral:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;

                    }

                    switch (alt6) {
                        case 1 :
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:146:10: (key= Identifier op= operator value= StringLiteral )
                            {
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:146:10: (key= Identifier op= operator value= StringLiteral )
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:146:11: key= Identifier op= operator value= StringLiteral
                            {
                            key=(Token)match(input,Identifier,FOLLOW_Identifier_in_binOpExpression395); 

                            pushFollow(FOLLOW_operator_in_binOpExpression401);
                            op=operator();

                            state._fsp--;


                            value=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_binOpExpression408); 

                            }


                            }
                            break;
                        case 2 :
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:148:10: (value= StringLiteral op= operator key= Identifier )
                            {
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:148:10: (value= StringLiteral op= operator key= Identifier )
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:148:11: value= StringLiteral op= operator key= Identifier
                            {
                            value=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_binOpExpression436); 

                            pushFollow(FOLLOW_operator_in_binOpExpression443);
                            op=operator();

                            state._fsp--;


                            key=(Token)match(input,Identifier,FOLLOW_Identifier_in_binOpExpression449); 

                            }


                             isReverseOrder = true; 

                            }
                            break;

                    }


                     val = TrimQuotes(value.getText()); 

                    }
                    break;
                case 3 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:151:8: ( (key= Identifier op= operator value= IntegralLiteral ) | (value= IntegralLiteral op= operator key= Identifier ) )
                    {
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:151:8: ( (key= Identifier op= operator value= IntegralLiteral ) | (value= IntegralLiteral op= operator key= Identifier ) )
                    int alt7=2;
                    switch ( input.LA(1) ) {
                    case Identifier:
                        {
                        alt7=1;
                        }
                        break;
                    case IntegralLiteral:
                        {
                        alt7=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;

                    }

                    switch (alt7) {
                        case 1 :
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:152:10: (key= Identifier op= operator value= IntegralLiteral )
                            {
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:152:10: (key= Identifier op= operator value= IntegralLiteral )
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:152:11: key= Identifier op= operator value= IntegralLiteral
                            {
                            key=(Token)match(input,Identifier,FOLLOW_Identifier_in_binOpExpression497); 

                            pushFollow(FOLLOW_operator_in_binOpExpression503);
                            op=operator();

                            state._fsp--;


                            value=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_binOpExpression509); 

                            }


                            }
                            break;
                        case 2 :
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:154:10: (value= IntegralLiteral op= operator key= Identifier )
                            {
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:154:10: (value= IntegralLiteral op= operator key= Identifier )
                            // org/apache/hadoop/hive/metastore/parser/Filter.g:154:11: value= IntegralLiteral op= operator key= Identifier
                            {
                            value=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_binOpExpression537); 

                            pushFollow(FOLLOW_operator_in_binOpExpression543);
                            op=operator();

                            state._fsp--;


                            key=(Token)match(input,Identifier,FOLLOW_Identifier_in_binOpExpression549); 

                            }


                             isReverseOrder = true; 

                            }
                            break;

                    }


                     val = Long.parseLong(value.getText()); 

                    }
                    break;

            }



                    LeafNode node = new LeafNode();
                    node.keyName = key.getText();
                    node.value = val;
                    node.operator = op;
                    node.isReverseOrder = isReverseOrder;

                    tree.addLeafNode(node);
                

            }

        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "binOpExpression"



    // $ANTLR start "operator"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:167:1: operator returns [Operator op] : t= ( LESSTHAN | LESSTHANOREQUALTO | GREATERTHAN | GREATERTHANOREQUALTO | KW_LIKE | EQUAL | NOTEQUAL ) ;
    public final Operator operator() throws RecognitionException {
        Operator op = null;


        Token t=null;

        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:168:4: (t= ( LESSTHAN | LESSTHANOREQUALTO | GREATERTHAN | GREATERTHANOREQUALTO | KW_LIKE | EQUAL | NOTEQUAL ) )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:169:4: t= ( LESSTHAN | LESSTHANOREQUALTO | GREATERTHAN | GREATERTHANOREQUALTO | KW_LIKE | EQUAL | NOTEQUAL )
            {
            t=(Token)input.LT(1);

            if ( (input.LA(1) >= EQUAL && input.LA(1) <= GREATERTHANOREQUALTO)||input.LA(1)==KW_LIKE||(input.LA(1) >= LESSTHAN && input.LA(1) <= LESSTHANOREQUALTO)||input.LA(1)==NOTEQUAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }



                  op = Operator.fromString(t.getText().toUpperCase());
               

            }

        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return op;
    }
    // $ANTLR end "operator"



    // $ANTLR start "betweenExpression"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:174:1: betweenExpression : (key= Identifier ( KW_NOT )? BETWEEN ( (left= DateLiteral KW_AND right= DateLiteral ) | (left= StringLiteral KW_AND right= StringLiteral ) | (left= IntegralLiteral KW_AND right= IntegralLiteral ) ) ) ;
    public final void betweenExpression() throws RecognitionException {
        Token key=null;
        Token left=null;
        Token right=null;


            Object leftV = null;
            Object rightV = null;
            boolean isPositive = true;

        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:180:5: ( (key= Identifier ( KW_NOT )? BETWEEN ( (left= DateLiteral KW_AND right= DateLiteral ) | (left= StringLiteral KW_AND right= StringLiteral ) | (left= IntegralLiteral KW_AND right= IntegralLiteral ) ) ) )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:181:5: (key= Identifier ( KW_NOT )? BETWEEN ( (left= DateLiteral KW_AND right= DateLiteral ) | (left= StringLiteral KW_AND right= StringLiteral ) | (left= IntegralLiteral KW_AND right= IntegralLiteral ) ) )
            {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:181:5: (key= Identifier ( KW_NOT )? BETWEEN ( (left= DateLiteral KW_AND right= DateLiteral ) | (left= StringLiteral KW_AND right= StringLiteral ) | (left= IntegralLiteral KW_AND right= IntegralLiteral ) ) )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:182:8: key= Identifier ( KW_NOT )? BETWEEN ( (left= DateLiteral KW_AND right= DateLiteral ) | (left= StringLiteral KW_AND right= StringLiteral ) | (left= IntegralLiteral KW_AND right= IntegralLiteral ) )
            {
            key=(Token)match(input,Identifier,FOLLOW_Identifier_in_betweenExpression662); 

            // org/apache/hadoop/hive/metastore/parser/Filter.g:182:25: ( KW_NOT )?
            int alt9=2;
            switch ( input.LA(1) ) {
                case KW_NOT:
                    {
                    alt9=1;
                    }
                    break;
            }

            switch (alt9) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:182:26: KW_NOT
                    {
                    match(input,KW_NOT,FOLLOW_KW_NOT_in_betweenExpression665); 

                     isPositive = false; 

                    }
                    break;

            }


            match(input,BETWEEN,FOLLOW_BETWEEN_in_betweenExpression672); 

            // org/apache/hadoop/hive/metastore/parser/Filter.g:183:8: ( (left= DateLiteral KW_AND right= DateLiteral ) | (left= StringLiteral KW_AND right= StringLiteral ) | (left= IntegralLiteral KW_AND right= IntegralLiteral ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case DateLiteral:
                {
                alt10=1;
                }
                break;
            case StringLiteral:
                {
                alt10=2;
                }
                break;
            case IntegralLiteral:
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
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:184:10: (left= DateLiteral KW_AND right= DateLiteral )
                    {
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:184:10: (left= DateLiteral KW_AND right= DateLiteral )
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:184:11: left= DateLiteral KW_AND right= DateLiteral
                    {
                    left=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_betweenExpression697); 

                    match(input,KW_AND,FOLLOW_KW_AND_in_betweenExpression699); 

                    right=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_betweenExpression705); 

                    }



                                leftV = FilterLexer.ExtractDate(left.getText());
                                rightV = FilterLexer.ExtractDate(right.getText());
                             

                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:189:10: (left= StringLiteral KW_AND right= StringLiteral )
                    {
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:189:10: (left= StringLiteral KW_AND right= StringLiteral )
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:189:11: left= StringLiteral KW_AND right= StringLiteral
                    {
                    left=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_betweenExpression735); 

                    match(input,KW_AND,FOLLOW_KW_AND_in_betweenExpression737); 

                    right=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_betweenExpression743); 

                    }


                     leftV = TrimQuotes(left.getText());
                                rightV = TrimQuotes(right.getText());
                             

                    }
                    break;
                case 3 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:193:10: (left= IntegralLiteral KW_AND right= IntegralLiteral )
                    {
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:193:10: (left= IntegralLiteral KW_AND right= IntegralLiteral )
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:193:11: left= IntegralLiteral KW_AND right= IntegralLiteral
                    {
                    left=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_betweenExpression773); 

                    match(input,KW_AND,FOLLOW_KW_AND_in_betweenExpression775); 

                    right=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_betweenExpression781); 

                    }


                     leftV = Long.parseLong(left.getText());
                                rightV = Long.parseLong(right.getText());
                             

                    }
                    break;

            }


            }



                    LeafNode leftNode = new LeafNode(), rightNode = new LeafNode();
                    leftNode.keyName = rightNode.keyName = key.getText();
                    leftNode.value = leftV;
                    rightNode.value = rightV;
                    leftNode.operator = isPositive ? Operator.GREATERTHANOREQUALTO : Operator.LESSTHAN;
                    rightNode.operator = isPositive ? Operator.LESSTHANOREQUALTO : Operator.GREATERTHAN;
                    tree.addLeafNode(leftNode);
                    tree.addLeafNode(rightNode);
                    tree.addIntermediateNode(isPositive ? LogicalOperator.AND : LogicalOperator.OR);
                

            }

        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "betweenExpression"



    // $ANTLR start "inExpression"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:210:1: inExpression : ( LPAREN key= Identifier RPAREN ( KW_NOT )? IN LPAREN ( (constant= DateLiteral ( COMMA constant= DateLiteral )* ) | (constant= StringLiteral ( COMMA constant= StringLiteral )* ) | (constant= IntegralLiteral ( COMMA constant= IntegralLiteral )* ) ) RPAREN ) ;
    public final void inExpression() throws RecognitionException {
        Token key=null;
        Token constant=null;


            List constants = new ArrayList();
            Object constantV = null;
            boolean isPositive = true;

        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:216:5: ( ( LPAREN key= Identifier RPAREN ( KW_NOT )? IN LPAREN ( (constant= DateLiteral ( COMMA constant= DateLiteral )* ) | (constant= StringLiteral ( COMMA constant= StringLiteral )* ) | (constant= IntegralLiteral ( COMMA constant= IntegralLiteral )* ) ) RPAREN ) )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:217:5: ( LPAREN key= Identifier RPAREN ( KW_NOT )? IN LPAREN ( (constant= DateLiteral ( COMMA constant= DateLiteral )* ) | (constant= StringLiteral ( COMMA constant= StringLiteral )* ) | (constant= IntegralLiteral ( COMMA constant= IntegralLiteral )* ) ) RPAREN )
            {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:217:5: ( LPAREN key= Identifier RPAREN ( KW_NOT )? IN LPAREN ( (constant= DateLiteral ( COMMA constant= DateLiteral )* ) | (constant= StringLiteral ( COMMA constant= StringLiteral )* ) | (constant= IntegralLiteral ( COMMA constant= IntegralLiteral )* ) ) RPAREN )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:218:9: LPAREN key= Identifier RPAREN ( KW_NOT )? IN LPAREN ( (constant= DateLiteral ( COMMA constant= DateLiteral )* ) | (constant= StringLiteral ( COMMA constant= StringLiteral )* ) | (constant= IntegralLiteral ( COMMA constant= IntegralLiteral )* ) ) RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_inExpression836); 

            key=(Token)match(input,Identifier,FOLLOW_Identifier_in_inExpression842); 

            match(input,RPAREN,FOLLOW_RPAREN_in_inExpression844); 

            // org/apache/hadoop/hive/metastore/parser/Filter.g:218:40: ( KW_NOT )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case KW_NOT:
                    {
                    alt11=1;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:218:42: KW_NOT
                    {
                    match(input,KW_NOT,FOLLOW_KW_NOT_in_inExpression848); 

                     isPositive = false; 

                    }
                    break;

            }


            match(input,IN,FOLLOW_IN_in_inExpression855); 

            match(input,LPAREN,FOLLOW_LPAREN_in_inExpression857); 

            // org/apache/hadoop/hive/metastore/parser/Filter.g:219:9: ( (constant= DateLiteral ( COMMA constant= DateLiteral )* ) | (constant= StringLiteral ( COMMA constant= StringLiteral )* ) | (constant= IntegralLiteral ( COMMA constant= IntegralLiteral )* ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case DateLiteral:
                {
                alt15=1;
                }
                break;
            case StringLiteral:
                {
                alt15=2;
                }
                break;
            case IntegralLiteral:
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
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:220:13: (constant= DateLiteral ( COMMA constant= DateLiteral )* )
                    {
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:220:13: (constant= DateLiteral ( COMMA constant= DateLiteral )* )
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:221:17: constant= DateLiteral ( COMMA constant= DateLiteral )*
                    {
                    constant=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_inExpression903); 


                                        constantV = FilterLexer.ExtractDate(constant.getText());
                                        constants.add(constantV);
                                    

                    // org/apache/hadoop/hive/metastore/parser/Filter.g:226:17: ( COMMA constant= DateLiteral )*
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt12=1;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:227:21: COMMA constant= DateLiteral
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_inExpression961); 

                    	    constant=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_inExpression967); 


                    	                            constantV = FilterLexer.ExtractDate(constant.getText());
                    	                            constants.add(constantV);
                    	                        

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:235:13: (constant= StringLiteral ( COMMA constant= StringLiteral )* )
                    {
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:235:13: (constant= StringLiteral ( COMMA constant= StringLiteral )* )
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:236:17: constant= StringLiteral ( COMMA constant= StringLiteral )*
                    {
                    constant=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_inExpression1072); 


                                        constantV = TrimQuotes(constant.getText());
                                        constants.add(constantV);
                                    

                    // org/apache/hadoop/hive/metastore/parser/Filter.g:241:17: ( COMMA constant= StringLiteral )*
                    loop13:
                    do {
                        int alt13=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt13=1;
                            }
                            break;

                        }

                        switch (alt13) {
                    	case 1 :
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:242:21: COMMA constant= StringLiteral
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_inExpression1130); 

                    	    constant=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_inExpression1136); 


                    	                            constantV = TrimQuotes(constant.getText());
                    	                            constants.add(constantV);
                    	                        

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:250:13: (constant= IntegralLiteral ( COMMA constant= IntegralLiteral )* )
                    {
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:250:13: (constant= IntegralLiteral ( COMMA constant= IntegralLiteral )* )
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:251:17: constant= IntegralLiteral ( COMMA constant= IntegralLiteral )*
                    {
                    constant=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_inExpression1241); 


                                        constantV = Long.parseLong(constant.getText());
                                        constants.add(constantV);
                                    

                    // org/apache/hadoop/hive/metastore/parser/Filter.g:256:17: ( COMMA constant= IntegralLiteral )*
                    loop14:
                    do {
                        int alt14=2;
                        switch ( input.LA(1) ) {
                        case COMMA:
                            {
                            alt14=1;
                            }
                            break;

                        }

                        switch (alt14) {
                    	case 1 :
                    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:257:21: COMMA constant= IntegralLiteral
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_inExpression1299); 

                    	    constant=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_inExpression1305); 


                    	                            constantV = Long.parseLong(constant.getText());
                    	                            constants.add(constantV);
                    	                        

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_inExpression1372); 

            }



                    for (int i = 0; i < constants.size(); i++) {
                        Object value = constants.get(i);
                        LeafNode leaf = new LeafNode();
                        leaf.keyName = key.getText();
                        leaf.value = value;
                        leaf.operator = isPositive ? Operator.EQUALS : Operator.NOTEQUALS2;
                        tree.addLeafNode(leaf);
                        if (i != 0) {
                            tree.addIntermediateNode(isPositive ? LogicalOperator.OR : LogicalOperator.AND);
                        }
                    }
                

            }

        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "inExpression"



    // $ANTLR start "multiColInExpression"
    // org/apache/hadoop/hive/metastore/parser/Filter.g:280:1: multiColInExpression : ( LPAREN ( KW_STRUCT LPAREN key= Identifier ( COMMA key= Identifier )* RPAREN ) RPAREN ( KW_NOT )? IN LPAREN KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN ( COMMA KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN )* RPAREN ) ;
    public final void multiColInExpression() throws RecognitionException {
        Token key=null;
        Token constant=null;


            List<String> keyNames = new ArrayList<String>();
            List constants = new ArrayList();
            List partialConstants;
            String keyV = null;
            Object constantV = null;
            boolean isPositive = true;

        try {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:289:5: ( ( LPAREN ( KW_STRUCT LPAREN key= Identifier ( COMMA key= Identifier )* RPAREN ) RPAREN ( KW_NOT )? IN LPAREN KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN ( COMMA KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN )* RPAREN ) )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:290:5: ( LPAREN ( KW_STRUCT LPAREN key= Identifier ( COMMA key= Identifier )* RPAREN ) RPAREN ( KW_NOT )? IN LPAREN KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN ( COMMA KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN )* RPAREN )
            {
            // org/apache/hadoop/hive/metastore/parser/Filter.g:290:5: ( LPAREN ( KW_STRUCT LPAREN key= Identifier ( COMMA key= Identifier )* RPAREN ) RPAREN ( KW_NOT )? IN LPAREN KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN ( COMMA KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN )* RPAREN )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:291:9: LPAREN ( KW_STRUCT LPAREN key= Identifier ( COMMA key= Identifier )* RPAREN ) RPAREN ( KW_NOT )? IN LPAREN KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN ( COMMA KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN )* RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_multiColInExpression1415); 

            // org/apache/hadoop/hive/metastore/parser/Filter.g:292:9: ( KW_STRUCT LPAREN key= Identifier ( COMMA key= Identifier )* RPAREN )
            // org/apache/hadoop/hive/metastore/parser/Filter.g:293:13: KW_STRUCT LPAREN key= Identifier ( COMMA key= Identifier )* RPAREN
            {
            match(input,KW_STRUCT,FOLLOW_KW_STRUCT_in_multiColInExpression1439); 

            match(input,LPAREN,FOLLOW_LPAREN_in_multiColInExpression1441); 

            key=(Token)match(input,Identifier,FOLLOW_Identifier_in_multiColInExpression1447); 


                            keyV = key.getText();
                            keyNames.add(keyV);
                        

            // org/apache/hadoop/hive/metastore/parser/Filter.g:298:13: ( COMMA key= Identifier )*
            loop16:
            do {
                int alt16=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt16=1;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:299:17: COMMA key= Identifier
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiColInExpression1493); 

            	    key=(Token)match(input,Identifier,FOLLOW_Identifier_in_multiColInExpression1499); 


            	                        keyV = key.getText();
            	                        keyNames.add(keyV);
            	                    

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_multiColInExpression1534); 

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_multiColInExpression1546); 

            // org/apache/hadoop/hive/metastore/parser/Filter.g:305:18: ( KW_NOT )?
            int alt17=2;
            switch ( input.LA(1) ) {
                case KW_NOT:
                    {
                    alt17=1;
                    }
                    break;
            }

            switch (alt17) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:305:20: KW_NOT
                    {
                    match(input,KW_NOT,FOLLOW_KW_NOT_in_multiColInExpression1550); 

                     isPositive = false; 

                    }
                    break;

            }


            match(input,IN,FOLLOW_IN_in_multiColInExpression1557); 

            match(input,LPAREN,FOLLOW_LPAREN_in_multiColInExpression1559); 

            match(input,KW_CONST,FOLLOW_KW_CONST_in_multiColInExpression1561); 

            match(input,KW_STRUCT,FOLLOW_KW_STRUCT_in_multiColInExpression1563); 

            match(input,LPAREN,FOLLOW_LPAREN_in_multiColInExpression1565); 


                        partialConstants = new ArrayList();
                    

            // org/apache/hadoop/hive/metastore/parser/Filter.g:309:9: (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral )
            int alt18=3;
            switch ( input.LA(1) ) {
            case DateLiteral:
                {
                alt18=1;
                }
                break;
            case StringLiteral:
                {
                alt18=2;
                }
                break;
            case IntegralLiteral:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:310:13: constant= DateLiteral
                    {
                    constant=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_multiColInExpression1603); 


                                    constantV = FilterLexer.ExtractDate(constant.getText());
                                    partialConstants.add(constantV);
                                

                    }
                    break;
                case 2 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:315:15: constant= StringLiteral
                    {
                    constant=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_multiColInExpression1637); 


                                    constantV = TrimQuotes(constant.getText());
                                    partialConstants.add(constantV);
                                

                    }
                    break;
                case 3 :
                    // org/apache/hadoop/hive/metastore/parser/Filter.g:320:15: constant= IntegralLiteral
                    {
                    constant=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_multiColInExpression1671); 


                                    constantV = Long.parseLong(constant.getText());
                                    partialConstants.add(constantV);
                                

                    }
                    break;

            }


            // org/apache/hadoop/hive/metastore/parser/Filter.g:326:9: ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )*
            loop20:
            do {
                int alt20=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt20=1;
                    }
                    break;

                }

                switch (alt20) {
            	case 1 :
            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:327:13: COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral )
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiColInExpression1719); 

            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:328:13: (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case DateLiteral:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case StringLiteral:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case IntegralLiteral:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // org/apache/hadoop/hive/metastore/parser/Filter.g:329:17: constant= DateLiteral
            	            {
            	            constant=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_multiColInExpression1755); 


            	                                constantV = FilterLexer.ExtractDate(constant.getText());
            	                                partialConstants.add(constantV);
            	                            

            	            }
            	            break;
            	        case 2 :
            	            // org/apache/hadoop/hive/metastore/parser/Filter.g:334:19: constant= StringLiteral
            	            {
            	            constant=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_multiColInExpression1797); 


            	                                constantV = TrimQuotes(constant.getText());
            	                                partialConstants.add(constantV);
            	                            

            	            }
            	            break;
            	        case 3 :
            	            // org/apache/hadoop/hive/metastore/parser/Filter.g:339:19: constant= IntegralLiteral
            	            {
            	            constant=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_multiColInExpression1839); 


            	                                constantV = Long.parseLong(constant.getText());
            	                                partialConstants.add(constantV);
            	                            

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);



                        constants.add(partialConstants);
                    

            match(input,RPAREN,FOLLOW_RPAREN_in_multiColInExpression1902); 

            // org/apache/hadoop/hive/metastore/parser/Filter.g:350:9: ( COMMA KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN )*
            loop24:
            do {
                int alt24=2;
                switch ( input.LA(1) ) {
                case COMMA:
                    {
                    alt24=1;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:351:13: COMMA KW_CONST KW_STRUCT LPAREN (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )* RPAREN
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_multiColInExpression1926); 

            	    match(input,KW_CONST,FOLLOW_KW_CONST_in_multiColInExpression1928); 

            	    match(input,KW_STRUCT,FOLLOW_KW_STRUCT_in_multiColInExpression1930); 

            	    match(input,LPAREN,FOLLOW_LPAREN_in_multiColInExpression1932); 


            	                    partialConstants = new ArrayList();
            	                

            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:355:13: (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case DateLiteral:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case StringLiteral:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case IntegralLiteral:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // org/apache/hadoop/hive/metastore/parser/Filter.g:356:17: constant= DateLiteral
            	            {
            	            constant=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_multiColInExpression1982); 


            	                                constantV = FilterLexer.ExtractDate(constant.getText());
            	                                partialConstants.add(constantV);
            	                            

            	            }
            	            break;
            	        case 2 :
            	            // org/apache/hadoop/hive/metastore/parser/Filter.g:361:19: constant= StringLiteral
            	            {
            	            constant=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_multiColInExpression2024); 


            	                                constantV = TrimQuotes(constant.getText());
            	                                partialConstants.add(constantV);
            	                            

            	            }
            	            break;
            	        case 3 :
            	            // org/apache/hadoop/hive/metastore/parser/Filter.g:366:19: constant= IntegralLiteral
            	            {
            	            constant=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_multiColInExpression2066); 


            	                                constantV = Long.parseLong(constant.getText());
            	                                partialConstants.add(constantV);
            	                            

            	            }
            	            break;

            	    }


            	    // org/apache/hadoop/hive/metastore/parser/Filter.g:372:13: ( COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        switch ( input.LA(1) ) {
            	        case COMMA:
            	            {
            	            alt23=1;
            	            }
            	            break;

            	        }

            	        switch (alt23) {
            	    	case 1 :
            	    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:373:17: COMMA (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral )
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_multiColInExpression2130); 

            	    	    // org/apache/hadoop/hive/metastore/parser/Filter.g:374:17: (constant= DateLiteral |constant= StringLiteral |constant= IntegralLiteral )
            	    	    int alt22=3;
            	    	    switch ( input.LA(1) ) {
            	    	    case DateLiteral:
            	    	        {
            	    	        alt22=1;
            	    	        }
            	    	        break;
            	    	    case StringLiteral:
            	    	        {
            	    	        alt22=2;
            	    	        }
            	    	        break;
            	    	    case IntegralLiteral:
            	    	        {
            	    	        alt22=3;
            	    	        }
            	    	        break;
            	    	    default:
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 22, 0, input);

            	    	        throw nvae;

            	    	    }

            	    	    switch (alt22) {
            	    	        case 1 :
            	    	            // org/apache/hadoop/hive/metastore/parser/Filter.g:375:21: constant= DateLiteral
            	    	            {
            	    	            constant=(Token)match(input,DateLiteral,FOLLOW_DateLiteral_in_multiColInExpression2174); 


            	    	                                    constantV = FilterLexer.ExtractDate(constant.getText());
            	    	                                    partialConstants.add(constantV);
            	    	                                

            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // org/apache/hadoop/hive/metastore/parser/Filter.g:380:23: constant= StringLiteral
            	    	            {
            	    	            constant=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_multiColInExpression2224); 


            	    	                                    constantV = TrimQuotes(constant.getText());
            	    	                                    partialConstants.add(constantV);
            	    	                                

            	    	            }
            	    	            break;
            	    	        case 3 :
            	    	            // org/apache/hadoop/hive/metastore/parser/Filter.g:385:23: constant= IntegralLiteral
            	    	            {
            	    	            constant=(Token)match(input,IntegralLiteral,FOLLOW_IntegralLiteral_in_multiColInExpression2274); 


            	    	                                    constantV = Long.parseLong(constant.getText());
            	    	                                    partialConstants.add(constantV);
            	    	                                

            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);



            	                    constants.add(partialConstants);
            	                

            	    match(input,RPAREN,FOLLOW_RPAREN_in_multiColInExpression2357); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            match(input,RPAREN,FOLLOW_RPAREN_in_multiColInExpression2370); 

            }



                    for (int i = 0; i < constants.size(); i++) {
                        List list = (List) constants.get(i);
                        assert keyNames.size() == list.size();
                        for (int j=0; j < list.size(); j++) {
                            String keyName = keyNames.get(j);
                            Object value = list.get(j);
                            LeafNode leaf = new LeafNode();
                            leaf.keyName = keyName;
                            leaf.value = value;
                            leaf.operator = isPositive ? Operator.EQUALS : Operator.NOTEQUALS2;
                            tree.addLeafNode(leaf);
                            if (j != 0) {
                                tree.addIntermediateNode(isPositive ? LogicalOperator.AND : LogicalOperator.OR);
                            }
                        }
                        if (i != 0) {
                            tree.addIntermediateNode(isPositive ? LogicalOperator.OR : LogicalOperator.AND);
                        }
                    }
                

            }

        }

          catch (RecognitionException e){
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "multiColInExpression"

    // Delegated rules


 

    public static final BitSet FOLLOW_orExpression_in_filter84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpression_in_orExpression106 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_KW_OR_in_orExpression109 = new BitSet(new long[]{0x0000000011006040L});
    public static final BitSet FOLLOW_andExpression_in_orExpression111 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_expression_in_andExpression137 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_KW_AND_in_andExpression140 = new BitSet(new long[]{0x0000000011006040L});
    public static final BitSet FOLLOW_expression_in_andExpression142 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_LPAREN_in_expression169 = new BitSet(new long[]{0x0000000011006040L});
    public static final BitSet FOLLOW_orExpression_in_expression171 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_expression173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operatorExpression_in_expression185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_betweenExpression_in_operatorExpression206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_inExpression_in_operatorExpression218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiColInExpression_in_operatorExpression230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_binOpExpression_in_operatorExpression242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_binOpExpression293 = new BitSet(new long[]{0x0000000004C40E00L});
    public static final BitSet FOLLOW_operator_in_binOpExpression299 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DateLiteral_in_binOpExpression306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DateLiteral_in_binOpExpression334 = new BitSet(new long[]{0x0000000004C40E00L});
    public static final BitSet FOLLOW_operator_in_binOpExpression341 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Identifier_in_binOpExpression347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_binOpExpression395 = new BitSet(new long[]{0x0000000004C40E00L});
    public static final BitSet FOLLOW_operator_in_binOpExpression401 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_StringLiteral_in_binOpExpression408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_binOpExpression436 = new BitSet(new long[]{0x0000000004C40E00L});
    public static final BitSet FOLLOW_operator_in_binOpExpression443 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Identifier_in_binOpExpression449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_binOpExpression497 = new BitSet(new long[]{0x0000000004C40E00L});
    public static final BitSet FOLLOW_operator_in_binOpExpression503 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IntegralLiteral_in_binOpExpression509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegralLiteral_in_binOpExpression537 = new BitSet(new long[]{0x0000000004C40E00L});
    public static final BitSet FOLLOW_operator_in_binOpExpression543 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Identifier_in_binOpExpression549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operator597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_betweenExpression662 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_KW_NOT_in_betweenExpression665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_BETWEEN_in_betweenExpression672 = new BitSet(new long[]{0x0000000010004040L});
    public static final BitSet FOLLOW_DateLiteral_in_betweenExpression697 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_KW_AND_in_betweenExpression699 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DateLiteral_in_betweenExpression705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_betweenExpression735 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_KW_AND_in_betweenExpression737 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_StringLiteral_in_betweenExpression743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IntegralLiteral_in_betweenExpression773 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_KW_AND_in_betweenExpression775 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IntegralLiteral_in_betweenExpression781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_inExpression836 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Identifier_in_inExpression842 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_inExpression844 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_KW_NOT_in_inExpression848 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_inExpression855 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_inExpression857 = new BitSet(new long[]{0x0000000010004040L});
    public static final BitSet FOLLOW_DateLiteral_in_inExpression903 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_COMMA_in_inExpression961 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_DateLiteral_in_inExpression967 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_StringLiteral_in_inExpression1072 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_COMMA_in_inExpression1130 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_StringLiteral_in_inExpression1136 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_IntegralLiteral_in_inExpression1241 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_COMMA_in_inExpression1299 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IntegralLiteral_in_inExpression1305 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RPAREN_in_inExpression1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_multiColInExpression1415 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KW_STRUCT_in_multiColInExpression1439 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_multiColInExpression1441 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Identifier_in_multiColInExpression1447 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_COMMA_in_multiColInExpression1493 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_Identifier_in_multiColInExpression1499 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RPAREN_in_multiColInExpression1534 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RPAREN_in_multiColInExpression1546 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_KW_NOT_in_multiColInExpression1550 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IN_in_multiColInExpression1557 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_multiColInExpression1559 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KW_CONST_in_multiColInExpression1561 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KW_STRUCT_in_multiColInExpression1563 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_multiColInExpression1565 = new BitSet(new long[]{0x0000000010004040L});
    public static final BitSet FOLLOW_DateLiteral_in_multiColInExpression1603 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_StringLiteral_in_multiColInExpression1637 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_IntegralLiteral_in_multiColInExpression1671 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_COMMA_in_multiColInExpression1719 = new BitSet(new long[]{0x0000000010004040L});
    public static final BitSet FOLLOW_DateLiteral_in_multiColInExpression1755 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_StringLiteral_in_multiColInExpression1797 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_IntegralLiteral_in_multiColInExpression1839 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RPAREN_in_multiColInExpression1902 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_COMMA_in_multiColInExpression1926 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_KW_CONST_in_multiColInExpression1928 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_KW_STRUCT_in_multiColInExpression1930 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_LPAREN_in_multiColInExpression1932 = new BitSet(new long[]{0x0000000010004040L});
    public static final BitSet FOLLOW_DateLiteral_in_multiColInExpression1982 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_StringLiteral_in_multiColInExpression2024 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_IntegralLiteral_in_multiColInExpression2066 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_COMMA_in_multiColInExpression2130 = new BitSet(new long[]{0x0000000010004040L});
    public static final BitSet FOLLOW_DateLiteral_in_multiColInExpression2174 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_StringLiteral_in_multiColInExpression2224 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_IntegralLiteral_in_multiColInExpression2274 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RPAREN_in_multiColInExpression2357 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_RPAREN_in_multiColInExpression2370 = new BitSet(new long[]{0x0000000000000002L});

}