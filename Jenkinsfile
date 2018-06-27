pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        echo 'testing'
      }
    }
    stage('Deployment') {
      steps {
        powershell 'PowerShellScript.ps1'
      }
    }
  }
}