## Prerequisites

* Java is installed 
* Java can be used on the command line
  * To check, run `java --version`
  * You should see output similar to:

> openjdk 23.0.2 2025-01-21  
> OpenJDK Runtime Environment Homebrew (build 23.0.2)
> OpenJDK 64-Bit Server VM Homebrew (build 23.0.2, mixed mode, sharing)

## How to run Main on the command line

* Navigate to root of this repo
* If you haven't already, create an empty folder named "bin"; you can use the command `mkdir bin` to create it on the command line.
* Compile all the Java files in "src" and put the bytecode classes in "bin" : `javac -d bin src/*`
* Run the main method in Main.class: `java -classpath bin Main`




