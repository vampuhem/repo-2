pipeline {
    agent any
    parameters {
        choice (name: 'VERSION', choices ['1.1.0','1.1.1','1.1.2'], description: '')
        booleanParam (name: 'executeTests', defaultValue: '' , description: '')
    }

    stages {
        stage('Build') {

            steps {
                echo "Building the application"

            }
        }
        stage('test') {
            when {
                expression {
                    param.executeTests
                }
            }
            }
            steps {
                echo "test"
            }
        }
        stage('deploy') {
            steps {
                echo "deploy"
                echo "Deploying with ${params.VERSION}"
                
            }
        }
    } 
}