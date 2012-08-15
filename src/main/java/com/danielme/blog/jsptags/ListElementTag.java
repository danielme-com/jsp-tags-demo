package com.danielme.blog.jsptags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Permite definir los elementos para PrintList.
 * 
 * @author danielme.com
 * 
 */
public class ListElementTag extends SimpleTagSupport
{
	private String value;
	
	@Override
	public void doTag() throws JspException, IOException 
	{
		 JspTag parent = getParent();
		 //asegura que la etiqueta se usa correctamente
		 if (parent == null || ! (parent instanceof PrintListTag))
		 {
			 throw new JspException("la etiqueta ListElement siempre debe estar anidada en PrintList");
		 }
		 else
		 {
			 ((PrintListTag) parent).addElement(value);	 
		 }		
	}

	public void setValue(String value) 
	{
		this.value = value;
	}		

}