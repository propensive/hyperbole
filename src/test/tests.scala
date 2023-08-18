package hyperbole

import gossamer.*
import rudiments.*
import probably.*

object Tests extends Suite(t"Hyperbole tests"):
  def run(): Unit =
    val three = 3
    
    Macros.introspect:
      def foo(): Unit = 1 + 3
