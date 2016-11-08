package CMPS_3240_6240Fall16.AutumnSummersProject

/**
  * Created by Autumn on 10/27/2016.
  */

import java.awt.image.BufferedImage

import scala.collection.JavaConversions._
import AutumnSummersProject.FileReader
import AutumnSummersProject.ImageReader
import CMPS_3240_6240Fall16.AutumnSummersProject.CharRecognitionClassifiers._
object CharRecognitionApp{

  def main(args: Array[String]): Unit ={
    val testData = new FileReader("data/AutumnSummersData/newTest.txt").letters

    CharRecognitionDataModel.character.populate(testData)

    CharRecognitionClassifiers.test()

  }


}
