run:Main.class
	java VigenereCipher $(ARGS)

Main.class: VigenereCipher.java
	javac VigenereCipher.java

clean: 
	rm VigenereCipher.class