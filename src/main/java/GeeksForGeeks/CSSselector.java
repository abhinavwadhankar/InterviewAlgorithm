package src.problems;

public class CSSselector {
	
	
	
	/*
	  Custom CSS
	  1.id-> htmltag#id
	  2.class --> htmltag.class, .classname, .c1.c1.c3, htmltag.c1.c2.c3...cn
	  3.Parent>childtag
	  
	  4. to get specific from the list
	  ul.uiMenuInner>li:nth-of-type(2)
	  5.
	  ul.uiMenuInner>li:first-of-type
	  6.
	  ul.uiMenuInner>li:last-of-type
	  
	  7.
	  ALl Element with give
	  ul.uiMenuInner>li:nth-of-type(n)
	  
	  8.
	  + operator is use for immediate sibling
	  li.uiMenuItem.selected+li
	  
	  9. For CSS and Xpath
	  xpath:- //input[@id='Email']
	  css:-  input[id='Email']
	  
	  10. For CSS and Xapth with 2 condition 
	   xpath:- //input[@id='Email' And @name='email']
	  css:-  input[id='Email'][name='email']
	  
	  11. How to find Contains in CSS
	  xpath:- //input[contains(@id,'email')]
	  css:- input[id='email']
	  
	  xpath to check text:- //div[contains(text(),'About')]
	  css:- nothing is there in css for text
	  
	  12. Start with
	  css: input[id^='ema']
	  
	  13. End with
	  css: input[id$='ail']
	  
	  14. Contain value in Attributes eg id='email1234'
	  css: input[id*='mai'] 
	  
	  
	 * */

}
