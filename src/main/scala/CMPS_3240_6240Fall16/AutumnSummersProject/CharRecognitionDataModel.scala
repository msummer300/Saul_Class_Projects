package CMPS_3240_6240Fall16.AutumnSummersProject

import java.awt.image.BufferedImage

import edu.illinois.cs.cogcomp.saul.datamodel.DataModel

/**
  * Created by Autumn on 10/27/2016.
  */
object CharRecognitionDataModel extends DataModel{
  val character = node[String]

  val letter = property(character){
    x: String => {
      val tokens = x.split(" ")
      tokens(0).charAt(0).toString
    }
  }

  val location = property(character){
    x: String => {
      val tokens = x.split(" ")
      tokens(1)
    }
  }

}
