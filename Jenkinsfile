pipeline {
    agent any
    triggers {
        pollSCM('') // Enabling being build on Push
    }
    tools {
        maven 'default-mvn'
    }
    stages {
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
        stage('test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}