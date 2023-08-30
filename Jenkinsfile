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

  }
}