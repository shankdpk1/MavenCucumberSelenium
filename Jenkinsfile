pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/shankdpk1/MavenCucumberSelenium.git'
                
                // To run Maven on a Windows agent, use
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

        }
        stage('Test') {
            
//             when{
//                 expression{
//                     BRANCH_NAME == 'master' && CODE_CHANGES == true
//                 }
//             }
            
            steps {
                 echo 'Testing App'
            }

        }
        stage('Deploy') {
            steps {
                echo 'Deploying App'
            }

        }
    }
    
    
    
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    
                    echo 'i am in success'
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
                failure {
                    echo 'i am in failure'
                }
                always {
                    echo 'i am in always'
                }
            }
  
    

    

//     stages {
//         stage('Build') {
//             steps {
//                 echo 'Build APp'
//             }
//         }
//         stage('Test') {
//             steps {
//                 echo 'Test App'
//             }
//         }
//         stage('Deploy') {
//             steps {
//                 echo 'Deploy App'
//             }
//         }
//     }
    
//     post{
//         failure{
//             echo 'i am in post failure'
//             build 'Test-Pipeline'
//             emailext body: 'summary', subject: 'pipeline status', to: 'shashank.deepak@gmail.com'
//         }
//     }
}
