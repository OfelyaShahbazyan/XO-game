CONSUME_EVENT=true

inotifywait -m -e modify -r ./src ./pom.xml @./target @./.git @./README.md | while read watched_file events event_file
do
  if [ $CONSUME_EVENT = true ]
  then
    mvn clean compile test
    CONSUME_EVENT=false
  else
    CONSUME_EVENT=true
  fi
done
