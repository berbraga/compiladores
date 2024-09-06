/* Generated By:JavaCC: Do not edit this line. prataLangConstants.java */
package compilador.regras;


/** 
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface prataLangConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int MAKE = 12;
  /** RegularExpression Id. */
  int END = 13;
  /** RegularExpression Id. */
  int CONST = 14;
  /** RegularExpression Id. */
  int INT = 15;
  /** RegularExpression Id. */
  int REAL = 16;
  /** RegularExpression Id. */
  int CHAR = 17;
  /** RegularExpression Id. */
  int BOOL = 18;
  /** RegularExpression Id. */
  int VAR = 19;
  /** RegularExpression Id. */
  int GET = 20;
  /** RegularExpression Id. */
  int PUT = 21;
  /** RegularExpression Id. */
  int IF = 22;
  /** RegularExpression Id. */
  int THEN = 23;
  /** RegularExpression Id. */
  int ELSE = 24;
  /** RegularExpression Id. */
  int WHILE = 25;
  /** RegularExpression Id. */
  int DO = 26;
  /** RegularExpression Id. */
  int NOT = 27;
  /** RegularExpression Id. */
  int OR = 28;
  /** RegularExpression Id. */
  int END_LOGIC = 29;
  /** RegularExpression Id. */
  int ASSIGN = 30;
  /** RegularExpression Id. */
  int EQUAL = 31;
  /** RegularExpression Id. */
  int DIFFERENT = 32;
  /** RegularExpression Id. */
  int MINOR = 33;
  /** RegularExpression Id. */
  int MINOR_EQUAL = 34;
  /** RegularExpression Id. */
  int BIGGER = 35;
  /** RegularExpression Id. */
  int BIGGER_EQUAL = 36;
  /** RegularExpression Id. */
  int PLUS = 37;
  /** RegularExpression Id. */
  int MINUS = 38;
  /** RegularExpression Id. */
  int MULTIPLICATION = 39;
  /** RegularExpression Id. */
  int DIVISION = 40;
  /** RegularExpression Id. */
  int POTENCY = 41;
  /** RegularExpression Id. */
  int ENTIRE_DIVISION = 42;
  /** RegularExpression Id. */
  int DIVISION_REST = 43;
  /** RegularExpression Id. */
  int int_constant = 44;
  /** RegularExpression Id. */
  int char_constant = 45;
  /** RegularExpression Id. */
  int float_constant = 46;
  /** RegularExpression Id. */
  int string_constant = 47;
  /** RegularExpression Id. */
  int TRUE = 48;
  /** RegularExpression Id. */
  int FALSE = 49;
  /** RegularExpression Id. */
  int null_constant = 50;
  /** RegularExpression Id. */
  int IDENT = 51;
  /** RegularExpression Id. */
  int DOT = 52;
  /** RegularExpression Id. */
  int COMMA = 53;
  /** RegularExpression Id. */
  int SEMICOLON = 54;
  /** RegularExpression Id. */
  int LPAREN = 55;
  /** RegularExpression Id. */
  int RPAREN = 56;
  /** RegularExpression Id. */
  int INVALID_LEXICAL = 57;
  /** RegularExpression Id. */
  int INVALID_CONST_STRING_WITH_LINEBREAK = 58;
  /** RegularExpression Id. */
  int INVALID_CONST_STRING_END = 59;
  /** RegularExpression Id. */
  int INVALID_CONST_FLOAT_SIZE = 60;
  /** RegularExpression Id. */
  int INVALID_CONST_INT_SIZE = 61;
  /** RegularExpression Id. */
  int INVALID_COMMENT_CLOSE = 62;
  /** RegularExpression Id. */
  int INVALID_IDENTIFIER = 63;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int multilinecomment = 1;
  /** Lexical state. */
  int singlelinecomment = 2;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\f\"",
    "\"/*\"",
    "\"*/\"",
    "<token of kind 8>",
    "\"//\"",
    "<token of kind 10>",
    "<token of kind 11>",
    "<MAKE>",
    "<END>",
    "<CONST>",
    "<INT>",
    "<REAL>",
    "<CHAR>",
    "<BOOL>",
    "<VAR>",
    "<GET>",
    "<PUT>",
    "<IF>",
    "<THEN>",
    "<ELSE>",
    "<WHILE>",
    "<DO>",
    "\"!\"",
    "\"|\"",
    "\"&\"",
    "\"->\"",
    "\"=\"",
    "\"<>\"",
    "\"<\"",
    "\"<=\"",
    "\">\"",
    "\">=\"",
    "\"+\"",
    "\"-\"",
    "\"*\"",
    "\"/\"",
    "\"**\"",
    "\"%\"",
    "\"%%\"",
    "<int_constant>",
    "<char_constant>",
    "<float_constant>",
    "<string_constant>",
    "<TRUE>",
    "<FALSE>",
    "<null_constant>",
    "<IDENT>",
    "\".\"",
    "\",\"",
    "\";\"",
    "\"(\"",
    "\")\"",
    "<INVALID_LEXICAL>",
    "<INVALID_CONST_STRING_WITH_LINEBREAK>",
    "<INVALID_CONST_STRING_END>",
    "<INVALID_CONST_FLOAT_SIZE>",
    "<INVALID_CONST_INT_SIZE>",
    "\"*/\"",
    "<INVALID_IDENTIFIER>",
  };

}
