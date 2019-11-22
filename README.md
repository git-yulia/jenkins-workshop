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

___________________________________________________________________________________________________

HOW TO RUN CLOC

    ./cloc-1.72/cloc business_manager

EXPORTING THE CLASSPATH

    export CLASSPATH="/Users/Shared/Jenkins/Home/war/WEB-INF/lib/junit-4.12.jar:/Users/Shared/Jenkins/Home/war/WEB-INF/lib/hamcrest-core-1.3.jar:/Users/Shared/Jenkins/Home/workspace/build_source"

echo ${CLASSPATH}

HOW TO RUN THE UNIT TESTS

    javac business_manager/UnitTests.java
    java org.junit.runner.JUnitCore business_manager.UnitTests

WHERE DOES JENKINS STORE FILES ON YOUR MAC

    /Users/Shared/Jenkins/Home/workspace/build_source

CUSTOM WORKSPACES

    ./workspace/{workspace_name}
