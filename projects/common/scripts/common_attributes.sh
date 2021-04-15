
JAVAC=`which javac`
ECHO=`which echo`
JAVA=`which java`

#Project path is specified here
PRG_HOME=$HOME/projects

#JAR file names common accross the peoject are specified here
LOG4J_FILE_NAME=log4j-1.2.17.jar

LOG4J_PROPERTY_FILE_NAME=log4j.properties


#Path for JAR files common through the project are specified here
COMMON_JAVA_JAR_DIR=$PRG_HOME/common/code/jars

#JAR files for the project are specified here
LOG4J_JAR_FILE=$COMMON_JAVA_JAR_DIR/$LOG4J_FILE_NAME


$ECHO "java compiler is ...............: [JAVAC] -> [$JAVAC]"
$ECHO "JVM is .........................: [JAVA] -> [$JAVA]"

$ECHO "[DIRECTORY -> Begin]"
$ECHO "HOME DIRECTORY is ..............: [HOME] -> [$HOME]"
$ECHO "PROJECT DIRECTORY is ...........: [PRG_HOME] -> [$PRG_HOME]"
$ECHO "COMMON JAR FILES DIRECTORY is ..: [COMMON_JAVA_JAR_DIR] -> [$COMMON_JAVA_JAR_DIR]" 
$ECHO "[DIRECTORY -> End]"

$ECHO "[COMMON JAR FILES -> Begin]" 
$ECHO "LOG4J ...................: [LOG4J_FILE_NAME] -> [$LOG4J_FILE_NAME]"
$ECHO "[COMMON JAR FILES -> End]"
