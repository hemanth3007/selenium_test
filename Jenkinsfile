pipeline {
	agent any
	tools {
		maven 'maven'
	}
	stages {
		stage('Checkout') {
			steps {
				git branch: 'main', url: 'https://github.com/hemanth3007/selenium_test.git'
			}
		}
		stage('Clean Install') {
			steps {
				sh 'mvn clean install'
			}
		}
		stage('Run Application') {
			steps {
				sh "mvn exec:java -Dexec.mainClass='com.example.App'"
			}
		}
	}
	posts {
		success {
			echo "Build successful"
		}
		failure {
			echo "Build failed"
		}
	}
}
