# ComcastTask

### compile and build
1. downlowd project or git clone this project.
2. go into this project director
3. compile project $ javac src/main/*.java

### execute
in the project root director, run $ java -cp ./src main.SumDigitsofString [inputString | fileFlag=<-f> filePath] [hexFlag=<-x>]


### test case
$ java -cp ./src main.SumDigitsofString abc123 <br />
6

$ java -cp ./src main.SumDigitsofString pp <br />
0

$ java -cp ./src main.SumDigitsofString &nbsp;&nbsp; -x <br />
0

$ java -cp ./src main.SumDigitsofString abc123 -x <br />
39

$ echo "abcFgGGPPQQW123" > fileName <br />
$ java -cp ./src main.SumDigitsofString -f fileName <br />
6

$ java -cp ./src main.SumDigitsofString -f fileName -x <br />
54

$ java -cp ./src main.SumDigitsofString <br />
Exception in thread "main" java.lang.IllegalArgumentException
	at main.SumDigitsofString.main(SumDigitsofString.java:50)
