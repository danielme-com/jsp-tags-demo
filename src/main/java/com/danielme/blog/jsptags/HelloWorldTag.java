package com.danielme.blog.jsptags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Ejemplo de etiqueta sin atributos
 * @author danielme.com
 *
 */
public class HelloWorldTag extends SimpleTagSupport 
{
	@Override
	public void doTag() throws JspException, IOException
	{		
		getJspContext().getOut().print("<b>Hello world!!</b>");		
	}

}