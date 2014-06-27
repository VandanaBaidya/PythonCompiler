/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TLt extends Token
{
    public TLt()
    {
        super.setText("<");
    }

    public TLt(int line, int pos)
    {
        super.setText("<");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TLt(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLt(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TLt text.");
    }
}
