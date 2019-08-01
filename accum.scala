object accum {
  def accum(s: String) = {
     s.zipWithIndex.map{ case (a, j) => a.toUpper + a.toLower.toString * j }.mkString("-")
  }
}