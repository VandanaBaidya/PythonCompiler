/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ARule3Element extends PElement
{
    private TLeftPar _leftPar_;
    private PExpression _expression_;
    private TRightPar _rightPar_;

    public ARule3Element()
    {
    }

    public ARule3Element(
        TLeftPar _leftPar_,
        PExpression _expression_,
        TRightPar _rightPar_)
    {
        setLeftPar(_leftPar_);

        setExpression(_expression_);

        setRightPar(_rightPar_);

    }
    public Object clone()
    {
        return new ARule3Element(
            (TLeftPar) cloneNode(_leftPar_),
            (PExpression) cloneNode(_expression_),
            (TRightPar) cloneNode(_rightPar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARule3Element(this);
    }

    public TLeftPar getLeftPar()
    {
        return _leftPar_;
    }

    public void setLeftPar(TLeftPar node)
    {
        if(_leftPar_ != null)
        {
            _leftPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _leftPar_ = node;
    }

    public PExpression getExpression()
    {
        return _expression_;
    }

    public void setExpression(PExpression node)
    {
        if(_expression_ != null)
        {
            _expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _expression_ = node;
    }

    public TRightPar getRightPar()
    {
        return _rightPar_;
    }

    public void setRightPar(TRightPar node)
    {
        if(_rightPar_ != null)
        {
            _rightPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _rightPar_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_leftPar_)
            + toString(_expression_)
            + toString(_rightPar_);
    }

    void removeChild(Node child)
    {
        if(_leftPar_ == child)
        {
            _leftPar_ = null;
            return;
        }

        if(_expression_ == child)
        {
            _expression_ = null;
            return;
        }

        if(_rightPar_ == child)
        {
            _rightPar_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_leftPar_ == oldChild)
        {
            setLeftPar((TLeftPar) newChild);
            return;
        }

        if(_expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(_rightPar_ == oldChild)
        {
            setRightPar((TRightPar) newChild);
            return;
        }

    }
}
