pipeline {
    agent any


    stages {
        stage('Build') {
            steps {
                echo 'Build APp'
            }
        }
        stage('Test') {
            steps {
                echo 'Test App'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy App'
            }
        }
    }
    
    post{
        failure{
            echo 'i am in post failure'
            build 'Test-Pipeline'
            emailext body: 'summary', subject: 'pipeline status', to: 'shashank.deepak@gmail.com'
        }
    }
}
