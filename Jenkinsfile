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
        powershell 'restsample\\PowerShellScript.ps1'
      }
    }
    stage('') {
      steps {
        git(url: 'https://github.dxc.com/healthcare-ohc/CheatSheet', branch: 'gh-pages', credentialsId: 'rpanchangan@csc.com')
      }
    }
  }
}