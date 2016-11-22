package CMPS_3240_6240Fall16.AutumnSummersProject

import java.awt.image.BufferedImage
import AutumnSummersProject.ImageReader

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

  val imageA = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgA
    }
  }

  val imageB = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgB
    }
  }

  val imageC = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgC
    }
  }

  val imageD = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgD
    }
  }

  val imageE = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgE
    }
  }

  val imageF = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgF
    }
  }

  val imageG = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgG
    }
  }

  val imageH = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgH
    }
  }

  val imageI = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgI
    }
  }

  val imageJ = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgJ
    }
  }

  val imageP = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgP
    }
  }

  val imageK = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgK
    }
  }

  val imageL = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgL
    }
  }

  val imageM = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgM
    }
  }

  val imageN = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgN
    }
  }

  val imageO = property(character){
    x: String => {
      val tokens = x.split(" ")
      val buffer: ImageReader = new ImageReader(tokens(1))
      buffer.imgO
    }
  }
}
