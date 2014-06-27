/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import minipython.analysis.*;

public final class TExMark extends Token
{
    public TExMark()
    {
        super.setText("!");
    }

    public TExMark(int line, int pos)
    {
        super.setText("!");
        setLine(line);
        setPos(pos);
    }

    public Object clone()
    {
      return new TExMark(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTExMark(this);
    }

    public void setText(String text)
    {
        throw new RuntimeException("Cannot change TExMark text.");
    }
}
