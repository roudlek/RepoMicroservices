pipeline {
  agent any
  stages {
    stage('checkout code') {
      steps {
        git(url: 'https://github.com/roudlek/RepoMicroservices.git', branch: 'main')
      }
    }

    stage('List content') {
      steps {
        sh 'ls -la'
      }
    }

    stage('Clean') {
      steps {
        sh 'mvn clean'
      }
    }

    stage('Complile') {
      steps {
        sh 'mvn compile'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }

    stage('build the app ( mvn install )') {
      steps {
        sh 'mvn clean install'
      }
    }

    stage('docker build') {
      steps {
        sh 'sudo docker build -t account-service-main .'
      }
    }

  }
}