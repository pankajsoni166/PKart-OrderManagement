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
                        docker login --username=pankajsoni166 --password=me@7743968256
                        docker build -t pramatikart .
                        docker tag pramatikart pankajsoni166/pramatikart_test
                        docker push pankajsoni166/pramatikart_test
                    }
                }
            }
        }
}
