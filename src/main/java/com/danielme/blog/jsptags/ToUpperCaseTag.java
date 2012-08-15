package com.danielme.blog.jsptags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Ejemplo de etiqueta con cuerpo.
 * 
 * @author danielme.com
 * 
 */
public class ToUpperCaseTag extends SimpleTagSupport
{

	@Override
	public void doTag() throws JspException, IOException 
	{
		StringWriter body = new StringWriter();
		getJspBody().invoke(body);
		getJspContext().getOut().print(body.toString().toUpperCase());
	}
}