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
                    mvn clean install
                }
            }

            stage('run test'){
                steps{
                    mvn test
                }
            }

            stage('build docker image'){
                steps{
                    docker login --usename=pankajsoni166 --password=me@7743968256
                    docker build -t pramatikart .r
                }
            }

            stage('push docker image to docker hub'){
                steps{
                    docker tag pramatikart pankajsoni166/pramatikart_test
                    docker push pankajsoni166/pramatikart_test
                }
            }
        }
}
