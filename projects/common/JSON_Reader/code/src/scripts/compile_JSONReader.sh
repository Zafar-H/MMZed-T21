#Java package information are set here 
JAVA_COMMON_ATTRIBUTES_FILE_NAME=common_attributes.sh
JAVA_COMMON_ATTRIBUTES_FILE_PATH=$HOME/projects/common/scripts

#Taking java package defaults 
source /$JAVA_COMMON_ATTRIBUTES_FILE_PATH/$JAVA_COMMON_ATTRIBUTES_FILE_NAME

#java file directory is specified here
JAVA_FILE_DIR=$PRG_HOME/common/JSON_Reader/code/src/JSON_Reader

#json parser jar information is specified here
JSON_PARSER_JAR_FILE_DIR=$PRG_HOME/common/JSON_Reader/code/jars
JSON_PARSER_JAR_FILE_NAME=json-simple-1.1.jar
JSON_PARSER_JAR_FILE=$JSON_PARSER_JAR_FILE_DIR/$JSON_PARSER_JAR_FILE_NAME

#Specifying classpath
CLASSPATH=$CLASSPATH:$LOG4J_JAR_FILE:$JSON_PARSER_JAR_FILE

#Speciying path
PATH=$PATH:$COMMON_JAVA_JAR_DIR:$JSON_PARSER_JAR_FILE_DIR

export CLASSPATH PATH

#Compiling specified java file
echo "compiling JSON_READER "
$JAVAC $JAVA_FILE_DIR/JSON_FileReader.java




