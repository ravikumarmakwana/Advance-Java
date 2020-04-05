/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vvp.web;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author Ravikumar Makwana
 */
public class CustomTag extends SimpleTagSupport {

    String instructions=new String();

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getInstructions() {
        return instructions;
    }


    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out= getJspContext().getOut();
        out.println("<span style='border:5px solid red; padding:10px; border-radius:0px 15px;'>"+instructions+"</span>");
    }

}
