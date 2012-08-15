package com.danielme.blog.jsptags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * Ejemplo de etiqueta con atributos.
 * 
 * @author danielme.com
 * 
 */
public class PrintTextTag extends SimpleTagSupport
{
	// opcional.Por omisión se considerará falso.
	private boolean bold = false;

	// obligatorio según el TLD.
	private String cadenaObligatoria;

	@Override
	public void doTag() throws JspException, IOException
	{
		String salida = cadenaObligatoria;
		if (bold)
		{
			salida = "<b>" + salida + "</b>";
		}
		getJspContext().getOut().print(salida);

	}

	public void setBold(boolean bold) 
	{
		this.bold = bold;
	}

	public void setCadenaObligatoria(String cadenaObligatoria) 
	{
		this.cadenaObligatoria = cadenaObligatoria;
	}

}