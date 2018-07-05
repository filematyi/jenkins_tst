pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac Main.java'
            }
        }
        stage('Execute') {
            steps {
                sh 'java Main'
            }
        }
        stage('Deploy') {
            steps {
                sh 'jar cvf Main.jar *'
                archiveArtifacts artifacts: '*.jar', fingerprint: true 
            }
        }
    }
}