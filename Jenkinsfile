pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        echo 'testing'
      }
    }
    stage('Deploy') {
      steps {
        powershell 'D:\\Next-Generation\\Next-Generation\\API\\LorenzoCareSuite\\PowerShellScript.ps1'
      }
    }
  }
}