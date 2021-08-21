Sample test project for [SUREFIRE-1266](https://issues.apache.org/jira/browse/SUREFIRE-1266)

Run the default all-tests configuration: 

    mvn clean install
    
Run the filtered configuration, using groups: 

    mvn clean install -Penable-groups

The latter should fail without using the patch at at https://github.com/apache/maven-surefire/pull/388
