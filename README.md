# jenkins-workshop
Materials for CS Club's Jenkins workshop. 

Topics that we'll cover: 
- Who is Jenkins?
- Integrating Git or SVN or IBM ClearCase...okay not the last one
- Building some code automagically
- Triggering builds 
- Layering builds
- Unit tests, and what to do when a sloppy dev makes them fail 
- Publishing results that only a manager could love
- Intro to Pipelines (purely theoretical)
- A million other things you can do with Jenkins


./cloc-1.72/cloc business_manager

java -jar ./lib/findbugs.jar -textui ../new.java


// [bash] export CLASSPATH="/Users/Shared/Jenkins/Home/war/WEB-INF/lib/junit-4.12.jar:/Users/Shared/Jenkins/Home/war/WEB-INF/lib/hamcrest-core-1.3.jar:/Users/Shared/Jenkins/Home/workspace/build_source"
// echo ${CLASSPATH}

// javac business_manager/UnitTests.java
// java org.junit.runner.JUnitCore business_manager.UnitTests


// /Users/Shared/Jenkins/Home/workspace/build_source

// custom workspace set to ./workspace/build_source
