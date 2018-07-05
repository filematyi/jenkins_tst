pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'javac Main.java'
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
        stage('Iput message') {
          steps {
            echo 'input id: \'Approve\', message: \'Approve\', ok: \'yes\''
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
  }
}