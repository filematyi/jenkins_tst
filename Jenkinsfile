pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'javac Main.java'
        input(message: 'Building is ready, would like to continue?', ok: 'Continue')
      }
    }
    stage('Execute') {
      parallel {
        stage('Executing') {
          steps {
            sh 'java Main'
          }
        }
        stage('Logging') {
          steps {
            sh 'echo "Is is working"'
          }
        }
        stage('Logging_2') {
          steps {
            sh 'echo "secondLog"'
          }
        }
      }
    }
    stage('Deploy') {
      steps {
        sh 'jar cvf Main.jar *'
        archiveArtifacts(artifacts: '*.jar', fingerprint: true)
      }
    }
    stage('Build Job') {
      environment {
        string_parameter = '13'
      }
      steps {
        sh 'export string_parameter=10'
        build job: 'tst_2', parameters: [string_parameter: 'hello baz megye']
        sh 'env'
      }
    }
  }
}