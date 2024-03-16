pipeline {
    agent any
    
    stages {
        stage('Build and Test Go') {
            steps {
                // Checkout the Go repository from version control
                git branch: 'main', url: 'https://github.com/your-go-repo.git'
                
                // Build the Go application
                sh 'go build -o myapp'
                
                // Run tests for the Go application
                sh 'go test ./...'
            }
        }
        stage('Build and Test Next.js') {
            steps {
                // Checkout the Next.js repository from version control
                git branch: 'main', url: 'https://github.com/your-nextjs-repo.git'
                
                // Install dependencies
                sh 'npm install'
                
                // Build the Next.js application
                sh 'npm run build'
                
                // Run tests for the Next.js application
                sh 'npm test'
            }
        }
        stage('Build and Test WordPress') {
            steps {
                // Checkout the WordPress repository from version control
                git branch: 'main', url: 'https://github.com/your-wordpress-repo.git'
                
                // No build/test steps needed for WordPress in this example
            }
        }
        stage('Deploy to Staging') {
            steps {
                // Push Docker images to ECR (assuming you've built them)
                sh 'docker push <ecr-repository>:<tag>'
                
                // Deploy the services using Docker Compose
                sh 'docker-compose -f docker-compose.yml up -d'
            }
        }
    }
}

/// this is sample a pipeline script to create a jenkins pipeline 

stage('Deploy to Staging') {
    steps {
        script {
            // Push Docker images to ECR
            sh 'docker push <ecr-repository>:<tag>'
            
            // Deploy the services using Docker Compose
            sh 'docker-compose -f docker-compose.yml up -d'
        }
    }
}


// this will create the deployement process 


pipeline {
    agent any
    
    triggers {
        githubPush()
    }
    
    stages {
        // Add your stages here
    }
}

// this add the trigger in the pipeline 