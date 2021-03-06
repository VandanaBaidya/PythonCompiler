/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ARule1Expression extends PExpression
{
    private PArithmetics _arithmetics_;

    public ARule1Expression()
    {
    }

    public ARule1Expression(
        PArithmetics _arithmetics_)
    {
        setArithmetics(_arithmetics_);

    }
    public Object clone()
    {
        return new ARule1Expression(
            (PArithmetics) cloneNode(_arithmetics_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARule1Expression(this);
    }

    public PArithmetics getArithmetics()
    {
        return _arithmetics_;
    }

    public void setArithmetics(PArithmetics node)
    {
        if(_arithmetics_ != null)
        {
            _arithmetics_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _arithmetics_ = node;
    }

    public String toString()
    {
        return ""
            + toString(_arithmetics_);
    }

    void removeChild(Node child)
    {
        if(_arithmetics_ == child)
        {
            _arithmetics_ = null;
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        if(_arithmetics_ == oldChild)
        {
            setArithmetics((PArithmetics) newChild);
            return;
        }

    }
}
