package es.weso.shexl

import es.weso.shexlc.ast.Schema
import es.weso.shexlc.internal.io.CompilerMsg

import scala.collection.mutable.HashMap

/**
 * Represents the abstraction of the result of compiling a single source file. It contains the information about the
 * path to the source file that was compiled. Whether the compilation generated errors/warnings, and if so the
 * collection that contains them. The generated schema if the compilation was succeed. And the generated sources.
 *
 * @author Guillermo Facundo Colunga
 */
trait ShExLCompilerIndividualResult {

  /**
   * Gets the path of the source that generated this individual compiler result.
   *
   * @return the path of the source that generated this individual compiler result.
   */
  def getSource: String

  /**
   * Indicates if the source compiled contains an error.
   *
   * @return true if the compiled source generated an error, false otherwise.
   */
  def hasErrors: Boolean

  /**
   * Indicates if the source compiled contains a warning.
   *
   * @return true if the compiled source generated a warning, false otherwise.
   */
  def hasWarnings: Boolean

  /**
   * Gets the list of errors that generated the compilation of the source attached to this result.
   *
   * @return the list of errors that generated the compilation of the source attached to this result.
   */
  def getErrors: Iterable[CompilerMsg]

  /**
   * Gets the list of warnings that generated the compilation of the source attached to this result.
   *
   * @return the list of warnings that generated the compilation of the source attached to this result.
   */
  def getWarnings: Iterable[CompilerMsg]

  /**
   * Gets the generated schema as an option object. If the option is empty means that the compiler was not able to
   * generate an schema for the attached source. You should check the generated errors. Else the option object will
   * contain the generated schema.
   *
   * @return an option object that may contain the schema if no error was generated during the compilation.
   */
  def getGeneratedSchema: Option[Schema]

  /**
   * Gets the all the generated sources for the current source fle. It is important to know that a single file can
   * generate multiple sources. And also a single file can be the origin of the code generation in to multiple target
   * languages. For this reason this method returns a map where the key is the target language and for each key it
   * contains a collection of all the generated sources.
   *
   * @return a map where the key is the target language and for each key it contains a collection of all the generated
   *         sources.
   */
  def getGeneratedSources: HashMap[ShExLCompilerTargetLanguage, Iterable[ShExLCompilerGeneratedSource]]
}
