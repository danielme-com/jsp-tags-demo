package com.danielme.blog.jsptags;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Ejemplo de etiqueta con etiquetas "hijas"
 * 
 * @author danielme.com
 * 
 */
public class PrintListTag extends SimpleTagSupport
{

	private List<String> list = new LinkedList<String>();

	@Override
	public void doTag() throws JspException, IOException 
	{
		//se "ejecuta" el cuerpo
		getJspBody().invoke(null);
		
		//ahora simplemente imprimimos la lista
		StringBuffer sb = new StringBuffer();
		sb.append("<ul>");
		for (String s : list)
		{
			sb.append("<li>" + s + "</li>\n");
		}
		sb.append("</ul>");
		getJspContext().getOut().print(sb.toString());
	}

	public void addElement(String s) 
	{
		list.add(s);
	}

}
