package cool.datasnok.samples.core;

public class StringUtils {
  
  private StringUtils() {}

  /**
   * Replaces vocals in a string.
   * 
   * @param string the string to replace the vocals from
   * @param character the character to replace the vocals with
   * 
   * @return a new string with the vocals replaced
   */
  public static final String replaceVocals(String string, Character character) {
    return string.replaceAll("[aeiouy]", character.toString());
  }

}
