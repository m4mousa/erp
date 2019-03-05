package com.newage.erp.core.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "paginationController")
@SessionScoped
public class PaginationController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String currentContent = "/indexContents.xhtml";
	
	public void goTo(String currentContent) {
		this.currentContent = currentContent;
	}
	
	public String getCurrentContent() {
		return currentContent;
	}
}
