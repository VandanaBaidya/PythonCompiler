/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.node;

import java.util.*;
import minipython.analysis.*;

public final class ACmdsGoal extends PGoal
{
    private final LinkedList _commands_ = new TypedLinkedList(new Commands_Cast());

    public ACmdsGoal()
    {
    }

    public ACmdsGoal(
        List _commands_)
    {
        {
            this._commands_.clear();
            this._commands_.addAll(_commands_);
        }

    }
    public Object clone()
    {
        return new ACmdsGoal(
            cloneList(_commands_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACmdsGoal(this);
    }

    public LinkedList getCommands()
    {
        return _commands_;
    }

    public void setCommands(List list)
    {
        _commands_.clear();
        _commands_.addAll(list);
    }

    public String toString()
    {
        return ""
            + toString(_commands_);
    }

    void removeChild(Node child)
    {
        if(_commands_.remove(child))
        {
            return;
        }

    }

    void replaceChild(Node oldChild, Node newChild)
    {
        for(ListIterator i = _commands_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set(newChild);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

    }

    private class Commands_Cast implements Cast
    {
        public Object cast(Object o)
        {
            PCommands node = (PCommands) o;

            if((node.parent() != null) &&
                (node.parent() != ACmdsGoal.this))
            {
                node.parent().removeChild(node);
            }

            if((node.parent() == null) ||
                (node.parent() != ACmdsGoal.this))
            {
                node.parent(ACmdsGoal.this);
            }

            return node;
        }
    }
}
