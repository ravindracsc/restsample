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
        powershell 'def stdout = powershell(returnStdout: true, script: \'\'\'         # Enable streams 3-6         $WarningPreference = \'Continue\'         $VerbosePreference = \'Continue\'         $DebugPreference = \'Continue\'         $InformationPreference = \'Continue\'          Write-Output \'Hello, World!\'         Write-Error \'Something terrible has happened!\'         Write-Warning \'Warning! There is nothing wrong with your television set\'         Write-Verbose \'Do not attempt to adjust the picture\'         Write-Debug \'We will control the horizontal.  We will control the vertical\'         Write-Information \'We can change the focus to a soft blur or sharpen it to crystal clarity.\'     \'\'\')     println stdout'
      }
    }
  }
}