!/usr/bin/env groovy

def call(String buildResult) {
  if ( buildResult == "SUCCESS" ) {
    slackSend color: "good", message: "CONGRATULATION: Job ${env.JOB_NAME} with>
  }
  else if( buildResult == "FAILURE" ) {
    slackSend color: "danger", message: "BAD NEWS:Job ${env.JOB_NAME} with buil>
  }
  else if( buildResult == "UNSTABLE" ) {
    slackSend color: "warning", message: "BAD NEWS:Job ${env.JOB_NAME} with bui>
  }
  else {
    slackSend color: "danger", message: "BAD NEWS:Job ${env.JOB_NAME} with buil>
  }
}
