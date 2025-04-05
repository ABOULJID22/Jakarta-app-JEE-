# Jakarta-app-JEE-

>mvn archetype:generate -DgroupId=com.example -DartifactId=jakartaapp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
>cd  jakrtaapp
>code .
>npm init -y
>npm install -g nodemon
>npm install --save-dev nodemon
>notepad nodemon.json
>{
    "watch": [
      "src"
    ],
    "ext": "java, xml, properties, jsp , css , js , html",
    "ignore": [
      "target"
    ],
    "exec": "mvn clean package",
    "delay": "1000"
  
}
>open pom.xml
add:
>>
   <dependencies>
    <dependency>
        <groupId>jakarta.platform</groupId>
        <artifactId>jakarta.jakartaee-api</artifactId>
        <version>10.0.0</version>
        <scope>provided</scope>
    </dependency>
    
 //connexion avec bd 
 //HibernateCore
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>6.2.2.Final</version>
    </dependency>
    <dependency>
        <groupId>jakarta.persistence</groupId>
        <artifactId>jakarta.persistence-api</artifactId>
        <version>3.1.0</version>
    </dependency>
    
//MySQL Driver
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.33</version>
    </dependency>
//Hibernate Entity Manager 
	    <dependency>
	        <groupId>org.hibernate</groupId>
	        <artifactId>hibernate-entitymanager</artifactId>
	        <version>5.6.15.Final</version>
	    </dependency>
  </dependencies>
 
>mvn package
>add file jakartaapp to wildfly server 
>nodemon
