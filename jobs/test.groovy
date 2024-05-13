pipelineJob('test_seed_job') {
    triggers {
        cron('H * * * *')
    }
    definition {
        cps {
        script("""
            node {
                stage('Build') {
                    echo 'Building..'
                }
                stage('Test') {
                    echo 'Testing..'
                }
                stage('Deploy') {
                    echo 'Deploying..'
                }
            }
        """)
        sandbox()
        }
    }
}