## Requirements

- JDK 21, although you could use JDK 9 or JDK 10 (https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)
- Java IDE
- Maven 3.9.9 (https://maven.apache.org/docs/3.9.9/release-notes.html)

## Project Structure

The code is structured as a multi-module Maven project. For each module of the course you will find two maven modules for the demo:
- One containing minimum code to get started and follow along the course
- Another one containing the complete demo code. Uses the ``complete`` suffix.

The module folders contain 2 sub-folders:

before - use it if you want to follow the demo
complete - use it if you want to see the completed, working example, as presented at the end of the demo

## Running the code samples

- Run ``main`` method.
    - Each module has a main class called ``Application`` that includes a ``main`` method, which you can run from your IDE
- Using Maven
    - ``mav clean package``
    - ``java -jar target/<name of main jar>``