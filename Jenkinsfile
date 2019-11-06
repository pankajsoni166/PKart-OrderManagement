pipeline {
    agent any
        stages {
            stage('Initiate') {
                steps {
                    echo 'running stage one'
                    echo '********Starting CI/CD Pipeline*************'
                }
            }

            stage('maven install'){
                steps{
                    sh 'mvn clean install'
                }
            }

            stage('run test'){
                steps{
                    sh 'mvn test'
                }
            }

            stage('build docker image'){
                steps{
                    script{
                        docker.build registry + ":$BUILD_NUMBER"
                    }
                }
            }
        }
}
