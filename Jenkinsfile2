pipeline
{
	
agent any

stages
{
	stage('Fetching the code from git')
	{
	steps
	{
		git 'https://github.com/Vimannagar/ATT30SeptBDDBasics.git'
	}
	}

	stage('Executing the project on Chrome Browser')
	{
	steps
	{
		bat "mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Chrome"
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

	stage('Executing the project on Firefox Browser')
	{
	steps
	{
		bat "mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Firefox"
	}

	 post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''Hi Team,
<h1>Here is the execution details of the build using script.</h1>

<p>$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS<br>

Check console output at $BUILD_URL to view the results.<br>

Thanks,<br>
ATT 30Sept batch''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - Report for Firefox browser - Customized email notification', to: 'attevening@gmail.com'
        }
    }


	}

   
	
}


}