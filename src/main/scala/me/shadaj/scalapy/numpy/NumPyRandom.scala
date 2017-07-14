package me.shadaj.scalapy.numpy

import jep.Jep
import me.shadaj.scalapy.py
import me.shadaj.scalapy.py.{ObjectFascade, |}

class NumPyRandom(o: py.Object)(implicit jep: Jep) extends ObjectFascade(o) {
  def randn(size: Int): NDArray[Double] = {
    dynamic.randn(size).as[NDArray[Double]]
  }

  def rand(size: Int): NDArray[Double] = {
    dynamic.rand(size).as[NDArray[Double]]
  }

  def normal(size: Int | Seq[Int]): NDArray[Double] = {
    dynamic.normal(size).as[NDArray[Double]]
  }

  def uniform(low: Double = 0.0, hight: Double = 1.0, size: Int | Seq[Int] = 1): NDArray[Float] =
    dynamic.uniform(low, hight, size).as[NDArray[Float]]
}
