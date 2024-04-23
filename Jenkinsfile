pipeline
{
	
agent any

stages
{

	stage('making infra ready')
	{
	steps
	{
		sh "docker-compose up -d hub chrome"
	}
	}
	stage('Execute the test cases')
	{
	steps
	{
		sh "mvn -Dmaven.test.failure.ignore=true clean test"
	}


 post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''Hi Team,
<h1>Here is the execution details of the build using script.</h1>

<p>$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks,<br>
ATT 30Sept batch''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - Report for Chrome Browser - Customized email notification', to: 'attevening@gmail.com'
        }
    }
    }

	}

	




}