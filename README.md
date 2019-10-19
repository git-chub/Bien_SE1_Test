You need to determine how to open a file in Java 1.5

I searched for "how to open a file in Java 1.5", and landed on this post in StackOverflow: https://stackoverflow.com/questions/847838/launch-file-from-java

Runtime.getRuntime().exec(new String[] {"cmd.exe", "/C", pathToFile});

You need to determine how to find a directory via Java 8

I searched "Java 8 directory" and came across the Oracle JDK 8 tutorial where directories are discussed: https://docs.oracle.com/javase/tutorial/essential/io/dirs.html

Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
for (Path name: dirs) {
    System.err.println(name);
}

You need to format a String

I searched "formatting strings in java" and found this StackOverflow post: https://stackoverflow.com/questions/6431933/how-to-format-strings-in-java

You can format a string in Java using the format() method in the String class. Example:

String s = String.format("My name is %s", "Chris");