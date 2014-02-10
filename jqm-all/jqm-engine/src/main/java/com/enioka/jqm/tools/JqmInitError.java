package com.enioka.jqm.tools;

/**
 * An error denotes something fatal and should never be caught.
 * 
 * @author Marc-Antoine
 * 
 */
class JqmInitError extends Error
{
    private static final long serialVersionUID = -5993404045975669943L;

    JqmInitError(String msg)
    {
        super(msg);
    }

    JqmInitError(String msg, Exception e)
    {
        super(msg, e);
    }
}