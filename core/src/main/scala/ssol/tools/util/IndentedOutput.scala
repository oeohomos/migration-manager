package ssol.tools.util

import ssol.tools.mima.Config

object IndentedOutput {
  var indentMargin = 2
  private var indent = 0
  def printLine(str: String) = println(" "*indent+str)
  def indented[T](op: => T): T = try { 
    indent += indentMargin
    op 
  } finally {
    indent -= indentMargin
  }
}
    
  


