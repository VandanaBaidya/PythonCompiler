/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import java.util.*;
import minipython.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable in;
    private Hashtable out;

    public Object getIn(Node node)
    {
        if(in == null)
        {
            return null;
        }

        return in.get(node);
    }

    public void setIn(Node node, Object in)
    {
        if(this.in == null)
        {
            this.in = new Hashtable(1);
        }

        if(in != null)
        {
            this.in.put(node, in);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(out == null)
        {
            return null;
        }

        return out.get(node);
    }

    public void setOut(Node node, Object out)
    {
        if(this.out == null)
        {
            this.out = new Hashtable(1);
        }

        if(out != null)
        {
            this.out.put(node, out);
        }
        else
        {
            this.out.remove(node);
        }
    }
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseACmdsGoal(ACmdsGoal node)
    {
        defaultCase(node);
    }

    public void caseAFuncCommands(AFuncCommands node)
    {
        defaultCase(node);
    }

    public void caseAStmtCommands(AStmtCommands node)
    {
        defaultCase(node);
    }

    public void caseAFuncFunction(AFuncFunction node)
    {
        defaultCase(node);
    }

    public void caseAArgArgument(AArgArgument node)
    {
        defaultCase(node);
    }

    public void caseAAssignValue(AAssignValue node)
    {
        defaultCase(node);
    }

    public void caseAMoreArguments(AMoreArguments node)
    {
        defaultCase(node);
    }

    public void caseARule1Statement(ARule1Statement node)
    {
        defaultCase(node);
    }

    public void caseARule2Statement(ARule2Statement node)
    {
        defaultCase(node);
    }

    public void caseARule3Statement(ARule3Statement node)
    {
        defaultCase(node);
    }

    public void caseARule4Statement(ARule4Statement node)
    {
        defaultCase(node);
    }

    public void caseARule5Statement(ARule5Statement node)
    {
        defaultCase(node);
    }

    public void caseARule6Statement(ARule6Statement node)
    {
        defaultCase(node);
    }

    public void caseARule7Statement(ARule7Statement node)
    {
        defaultCase(node);
    }

    public void caseAMoreExpressions(AMoreExpressions node)
    {
        defaultCase(node);
    }

    public void caseARule2Expression(ARule2Expression node)
    {
        defaultCase(node);
    }

    public void caseARule3Expression(ARule3Expression node)
    {
        defaultCase(node);
    }

    public void caseAMultExpression(AMultExpression node)
    {
        defaultCase(node);
    }

    public void caseAAddExpression(AAddExpression node)
    {
        defaultCase(node);
    }

    public void caseAMinusExpression(AMinusExpression node)
    {
        defaultCase(node);
    }

    public void caseAValueExpression(AValueExpression node)
    {
        defaultCase(node);
    }

    public void caseAIdExpression(AIdExpression node)
    {
        defaultCase(node);
    }

    public void caseAFuncExpression(AFuncExpression node)
    {
        defaultCase(node);
    }

    public void caseAExpExpression(AExpExpression node)
    {
        defaultCase(node);
    }

    public void caseAMoreValues(AMoreValues node)
    {
        defaultCase(node);
    }

    public void caseAValueMultiplication(AValueMultiplication node)
    {
        defaultCase(node);
    }

    public void caseAMultiplicationMultiplication(AMultiplicationMultiplication node)
    {
        defaultCase(node);
    }

    public void caseARule1Comparison(ARule1Comparison node)
    {
        defaultCase(node);
    }

    public void caseAFunctionCall(AFunctionCall node)
    {
        defaultCase(node);
    }

    public void caseAArgList(AArgList node)
    {
        defaultCase(node);
    }

    public void caseAMoreListArguments(AMoreListArguments node)
    {
        defaultCase(node);
    }

    public void caseANumberValue(ANumberValue node)
    {
        defaultCase(node);
    }

    public void caseAStringValue(AStringValue node)
    {
        defaultCase(node);
    }

    public void caseAIntNumber(AIntNumber node)
    {
        defaultCase(node);
    }

    public void caseAIdentifier(AIdentifier node)
    {
        defaultCase(node);
    }

    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    public void caseTExMark(TExMark node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTAssign(TAssign node)
    {
        defaultCase(node);
    }

    public void caseTEquals(TEquals node)
    {
        defaultCase(node);
    }

    public void caseTGrt(TGrt node)
    {
        defaultCase(node);
    }

    public void caseTGte(TGte node)
    {
        defaultCase(node);
    }

    public void caseTLt(TLt node)
    {
        defaultCase(node);
    }

    public void caseTLte(TLte node)
    {
        defaultCase(node);
    }

    public void caseTLeftPar(TLeftPar node)
    {
        defaultCase(node);
    }

    public void caseTRightPar(TRightPar node)
    {
        defaultCase(node);
    }

    public void caseTSquareRightBr(TSquareRightBr node)
    {
        defaultCase(node);
    }

    public void caseTSquareLeftBr(TSquareLeftBr node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    public void caseTFor(TFor node)
    {
        defaultCase(node);
    }

    public void caseTPrint(TPrint node)
    {
        defaultCase(node);
    }

    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    public void caseTDef(TDef node)
    {
        defaultCase(node);
    }

    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    public void caseTIn(TIn node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    public void caseTInteger(TInteger node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(Node node)
    {
    }
}
