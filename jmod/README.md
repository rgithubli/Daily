_Instruction: https://www.baeldung.com/jlink_

```
# Stand under jmod/

$ javac -d out com/baeldung/jlink/module-info.java

$ javac -d out --module-path out com/baeldung/jlink/HelloWorld.java

$ java --module-path out --module jlinkModule/com.baeldung.jlink.HelloWorld
Nov 13, 2022 11:01:31 PM com.baeldung.jlink.HelloWorld main
INFO: Hello World!

```
