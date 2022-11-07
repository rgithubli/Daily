# Followed https://www.baeldung.com/jni

```
$ vim HelloWorldJNI.java 

# Generate cpp header file
$ javac -h . HelloWorldJNI.java 

# Create same name cpp file as header file. Fill out content. Sample see 
# HelloWorldJNI.cpp


# compile native code
$ g++ -c -fPIC -I${JAVA_HOME}/include -I${JAVA_HOME}/include/darwin HelloWorldJNI.cpp -o HelloWorldJNI.o

# create shared lib
$ g++ -dynamiclib -o libnative.dylib HelloWorldJNI.o -lc

# Run java app
$ java -cp . -Djava.library.path=. HelloWorldJNI

```
