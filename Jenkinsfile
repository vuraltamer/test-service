def buildNumberText() {
    return "1.0.0"
}
pipeline {
    agent any

    stages {

        stage('Package Application') {
            steps {
                echo 'Packaging the app into jars with gradle'
                sh "./gradlew build"

            }
        }
		stage('Build') {
            steps {
                echo 'Building image'
                sh "/usr/local/bin/docker build --force-rm -t 'lets/test-service-api:latest' ."
            }
        }

		stage('Kube Deploy') {
            steps {
                script {
                        sh "chmod a+x /usr/local/bin/kubectl"
                        echo 'kubectl'
                        sh "/usr/local/bin/kubectl apply -f ./k8s/"
                }
            }
		}
      }

  	post {
        success {
          script {
            echo 'docker ps'
            sh "/usr/local/bin/docker ps -a"
          }
        }
  	}
}