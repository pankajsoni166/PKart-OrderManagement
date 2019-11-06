pipeline {
    environment {
	    registry = "pankajsoni166/pramatikart_test"
	    registryCredential = 'dockerhub'
	    dockerImage = ''
	}
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
                    script {
          		dockerImage = docker.build registry + ":$BUILD_NUMBER"
        	    }
                }
            }
		
	    stage('Deploy Image') {
		steps{
		    script {
			docker.withRegistry( '', registryCredential ) {
			    dockerImage.push()
			}
		    }
		}
	    }
        }
}
