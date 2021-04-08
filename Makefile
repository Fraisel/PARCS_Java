all: run

clean:
	rm -f out/Main.jar out/Square.jar

out/Main.jar: out/parcs.jar src/Main.java
	@javac -cp out/parcs.jar src/Main.java
	@jar cf out/Main.jar -C src Main.class
	@rm -f src/Main.class

out/Square.jar: out/parcs.jar src/Square.java
	@javac -cp out/parcs.jar src/Square.java
	@jar cf out/Square.jar -C src Square.class
	@rm -f src/Square.class

build: out/Main.jar out/Square.jar

run: out/Main.jar out/Square.jar
	@cd out && java -cp 'parcs.jar:Main.jar' Main
