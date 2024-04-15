pipeline
{
	
agent any

stages
{
	stage('Building the image')
	{
	steps
	{
		bat 'docker build -t=cucumbertestframeworkimage .'
	}
	}

	stage('Making infra up for execution')
	{
	steps
	{
		bat "docker-compose up -d selenium-hub chrome"
	}
}
stage('Executing the cucumber test cases')
	{
	steps
	{
		bat "docker-compose up cucumbertestframeworkimage"
	}




 post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'chrometestreports/cucumber-reports/reports.html', body: '''Hi Team,
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