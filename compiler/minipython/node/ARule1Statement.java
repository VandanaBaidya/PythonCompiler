/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ARule1Statement extends PStatement
{
    private PComparison _comparison_;
    private PStatement _statement_;

    public ARule1Statement()
    {
    }

    public ARule1Statement(
        PComparison _comparison_,
        PStatement _statement_)
    {
        setComparison(_comparison_);

        setStatement(_statement_);

    }
    public Object clone()
    {
        return new ARule1Statement(
            (PComparison) cloneNode(_comparison_),
            (PStatement) cloneNode(_statement_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARule1Statement(this);
    }

    public PComparison getComparison()
    {
        return _comparison_;
    }

    public void setComparison(PComparison node)
    {
        if(_comparison_ != null)
        {
            _comparison_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _comparison_ = node;
    }

    public PStatement getStatement()
    {
        return _statement_;
    }

    public void setStatement(PStatement node)
    {
        if(_statement_ != null)
        {
            _statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _statement_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_comparison_)
            + toString(_statement_);
    }

    void removeChild(Node child)
    {
        if(_comparison_ == child)
        {
            _comparison_ = null;
            return;
        }

        if(_statement_ == child)
        {
            _statement_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_comparison_ == oldChild)
        {
            setComparison((PComparison) newChild);
            return;
        }

        if(_statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

    }
}
