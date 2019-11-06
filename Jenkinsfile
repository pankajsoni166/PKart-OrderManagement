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
                    sh 'docker login --usename=pankajsoni166 --password=me@7743968256'
                    sh 'docker build -t pramatikart .r'
                }
            }
        }
}
