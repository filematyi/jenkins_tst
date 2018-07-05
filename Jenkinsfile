pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac Main.java'
            }
        }
        stage('Execute') {
            parallel Executing: {
                sh 'java Main'
            }, Logging: {
                sh 'echo "Is is working"'
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