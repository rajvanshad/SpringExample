package com.tutorialspoint;

public class TextEditor {
private SpellChecker spellChecker;
/*private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}*/

public TextEditor(SpellChecker spellChecker) {
	this.spellChecker = spellChecker;
}

public SpellChecker getSpellChecker() {
	return spellChecker;
}

public void setSpellChecker(SpellChecker spellChecker) {
	this.spellChecker = spellChecker;
	System.out.println("Inside the Setter Method SpellChecker");
}

public void spellCheck() {
	spellChecker.checkSpelling();
}

}
