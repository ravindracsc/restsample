pipeline {
  agent any
  stages {
    stage('Test') {
      steps {
        echo 'Placeholder to run the test processes'
      }
    }
    stage('Deployment') {
      steps {
        powershell 'restsample\\PowerShellScript.ps1'
      }
    }
  }
}