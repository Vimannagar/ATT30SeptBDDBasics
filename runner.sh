echo "--------------------------------------------------------------------------"
echo "Starting initialization"
echo "--------------------------------------------------------------------------"

# Do not start the tests immediately. Hub has to be ready with browser nodes
echo "Checking if hub is ready..!"
count=0
while [ "$( curl -s http://192.168.1.5:4444/status | jq -r .value.ready )" != "true" ]
do
  count=$((count+1))
  echo "Attempt: ${count}"
  if [ "$count" -ge 60 ]
  then
      echo "**** HUB IS NOT READY WITHIN 60 SECONDS ****"
      exit 1
  fi
  sleep 1
done

# At this point, selenium grid should be up!
echo "Selenium Grid is up and running. Running the test...."

mvn -f /home/seleniumtestframework/pom.xml test -Dclibrowser=${browser}