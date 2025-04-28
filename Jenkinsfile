pipeline {
    agent any
    parameters {
        choices (name: 'VERSION', choices ['1.1.0','1.2.0','1.3.0'], description: '')
        booleanParam (name: 'executeTests', defaultValue: '', description: '')
    }
    stages {
        stage('build') {
            steps {
                echo 'build in progress'
            }
        }
        stage('test') {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                echo 'build test'
            }
        }

        stage('deploy') {
            steps {
                echo 'build deploy'
                echo "Version of ${params.VERSION}"
            }
        }
    }
}