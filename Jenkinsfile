pipeline {
  agent any
  stages {
    stage('error') {
      steps {
        echo 'hello'
      }
    }
    stage('build') {
      steps {
        build 'tst_2'
      }
    }
  }
  environment {
    p1 = 'p'
  }
}