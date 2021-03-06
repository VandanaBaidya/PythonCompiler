/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class X1PMoreArguments extends XPMoreArguments
{
    private XPMoreArguments _xPMoreArguments_;
    private PMoreArguments _pMoreArguments_;

    public X1PMoreArguments()
    {
    }

    public X1PMoreArguments(
        XPMoreArguments _xPMoreArguments_,
        PMoreArguments _pMoreArguments_)
    {
        setXPMoreArguments(_xPMoreArguments_);
        setPMoreArguments(_pMoreArguments_);
    }

    public Object clone()
    {
        throw new RuntimeException("Unsupported Operation");
    }

    public void apply(Switch sw)
    {
        throw new RuntimeException("Switch not supported.");
    }

    public XPMoreArguments getXPMoreArguments()
    {
        return _xPMoreArguments_;
    }

    public void setXPMoreArguments(XPMoreArguments node)
    {
        if(_xPMoreArguments_ != null)
        {
            _xPMoreArguments_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _xPMoreArguments_ = node;
    }

    public PMoreArguments getPMoreArguments()
    {
        return _pMoreArguments_;
    }

    public void setPMoreArguments(PMoreArguments node)
    {
        if(_pMoreArguments_ != null)
        {
            _pMoreArguments_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        _pMoreArguments_ = node;
    }

    void removeChild(Node child)
    {
        if(_xPMoreArguments_ == child)
        {
            _xPMoreArguments_ = null;
        }

        if(_pMoreArguments_ == child)
        {
            _pMoreArguments_ = null;
        }
    }

    void replaceChild(Node oldChild, Node newChild)
    {
    }

    public String toString()
    {
        return "" +
            toString(_xPMoreArguments_) +
            toString(_pMoreArguments_);
    }
}
