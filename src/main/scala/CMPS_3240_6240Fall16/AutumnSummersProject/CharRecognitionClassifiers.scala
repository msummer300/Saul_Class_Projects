package CMPS_3240_6240Fall16.AutumnSummersProject

import AutumnSummersProject.FileReader
import edu.illinois.cs.cogcomp.lbjava.learn.{SparseAveragedPerceptron, SparseNetworkLearner, SupportVectorMachine, WekaWrapper}
import edu.illinois.cs.cogcomp.saul.classifier.Learnable
import weka.classifiers.`lazy`.IBk
import edu.illinois.cs.cogcomp.saul.learn.SaulWekaWrapper
import weka.classifiers.bayes.NaiveBayes


/**
  * Created by Autumn on 10/27/2016.
  */
object CharRecognitionClassifiers {
  import CharRecognitionDataModel._
  import AutumnSummersProject.ImageReader
  import AutumnSummersProject.CharRecognitionKNN

  //def label = letter
  // val train = new FileReader("data/AutumnSummersData/newTrain.txt")
  //val test_set = new FileReader("data/AutumnSummersData/newTest.txt").letters

  object CharRecognitionClassifier extends Learnable[String] (character) {
    def label = letter
    override lazy val classifier = new SaulWekaWrapper(new NaiveBayes())
    override def feature = using(image)
  }

  /*
    def test() = {
      var correct: Array[Int] = new Array[Int](26)
      var actual: Array[Int] = new Array[Int](26)
      for( i <- 0 to 25){
        correct(i) = 0
        actual(i) = 0
      }
      for( i <- 0 to (test_set.size()-1)) {
        val location = test_set.get(i).substring(2)
        val classifier: String = new CharRecognitionKNN(location, train).value
        if( classifier.equals(test_set.get(i).substring(0, 1))){
          val letter = test_set.get(i).charAt(0).toInt - 97
          correct(letter) += 1
          //print(".")
        }
        val letter = test_set.get(i).charAt(0).toInt - 97
        actual(letter) += 1
        //print(".")

      }
      var percent: Array[Float] = new Array[Float](26)
      for( i <- 0 to (correct.length - 1)){
        val per_cor = correct(i).toFloat/actual(i).toFloat
        percent(i) = per_cor
      }
      print("True  |  Number Correct | Actual Number | Percent Correctly Predicted\n")
      print("---------------------------------------------------------------------\n")
      for(i <- 0 to 25){
        print((i + 97).toChar.toString())
        print("     |           ")
        print(correct(i))
        print("             ")
        print(actual(i))
        print("             ")
        print(percent(i))
        print("\n")
      }

    }
  */


}
