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
    stage('Build a job') {
      agent any
      environment {
        string_parameter = 'aassaadadssad'
      }
      steps {
        build(job: 'tst_2', propagate: true)
      }
    }
  }
  environment {
    p1 = 'p'
  }
}