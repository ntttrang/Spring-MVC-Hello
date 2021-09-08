# Spring-MVC-Hello
## 1. Setup
Step 1: Create maven project

Step 2: Change project as Dynamic Web and add Runtime environment

Step 3: Add libraries in pom.xml

Step 4: Create web.xml

Step 5: Create spring-config.xml

Step 6: Config spring-mvc-servlet.xml for Spring

Step 7: Create HelloController.java to handle request

Step 8: Create view

Step 9: Copy libraries to src/main/java/webapp/WEB-INF/lib

	jsp-api-2.0.jar
	servlet-api-2.4.jar		
	spring-aop-5.0.2.RELEASE.jar		
	spring-beans-5.0.2.RELEASE.jar		
	spring-context-5.0.2.RELEASE.jar		
	spring-core-5.0.2.RELEASE.jar		
	spring-expression-5.0.2.RELEASE.jar		
	spring-jcl-5.0.2.RELEASE.jar		
	spring-web-5.0.2.RELEASE.jar		
	spring-webmvc-5.0.2.RELEASE.jar		


## 2. Start Web
## 3.Troubleshoots 

SEVERE: Servlet [spring-mvc] in web application [/SpringMVCHello] threw load() exception 			
java.lang.ClassNotFoundException: org.springframework.web.servlet.DispatcherServlet			
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1407)		
	at org.apache.catalina.loader.WebappClassLoaderBase.loadClass(WebappClassLoaderBase.java:1215)		
	at org.apache.catalina.core.DefaultInstanceManager.loadClass(DefaultInstanceManager.java:538)		
	at org.apache.catalina.core.DefaultInstanceManager.loadClassMaybePrivileged(DefaultInstanceManager.java:519)		
	at org.apache.catalina.core.DefaultInstanceManager.newInstance(DefaultInstanceManager.java:149)		
	at org.apache.catalina.core.StandardWrapper.loadServlet(StandardWrapper.java:1049)		
	at org.apache.catalina.core.StandardWrapper.load(StandardWrapper.java:989)		
	at org.apache.catalina.core.StandardContext.loadOnStartup(StandardContext.java:4957)		
	at org.apache.catalina.core.StandardContext.startInternal(StandardContext.java:5264)		
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)		
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1396)		
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1386)		
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)		
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)		
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:140)		
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:919)		
	at org.apache.catalina.core.StandardHost.startInternal(StandardHost.java:835)		
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)		
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1396)		
	at org.apache.catalina.core.ContainerBase$StartChild.call(ContainerBase.java:1386)		
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)		
	at org.apache.tomcat.util.threads.InlineExecutorService.execute(InlineExecutorService.java:75)		
	at java.base/java.util.concurrent.AbstractExecutorService.submit(AbstractExecutorService.java:140)		
	at org.apache.catalina.core.ContainerBase.startInternal(ContainerBase.java:919)		
	at org.apache.catalina.core.StandardEngine.startInternal(StandardEngine.java:263)		
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)		
	at org.apache.catalina.core.StandardService.startInternal(StandardService.java:432)		
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)		
	at org.apache.catalina.core.StandardServer.startInternal(StandardServer.java:927)		
	at org.apache.catalina.util.LifecycleBase.start(LifecycleBase.java:183)		
	at org.apache.catalina.startup.Catalina.start(Catalina.java:772)		
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)		
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)		
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)		
	at java.base/java.lang.reflect.Method.invoke(Method.java:566)		
	at org.apache.catalina.startup.Bootstrap.start(Bootstrap.java:345)		
	at org.apache.catalina.startup.Bootstrap.main(Bootstrap.java:476)		


#### Solution:
Copy all jar files to WEB-INF/lib			
	
	jsp-api-2.0.jar
	servlet-api-2.4.jar		
	spring-aop-5.0.2.RELEASE.jar		
	spring-beans-5.0.2.RELEASE.jar		
	spring-context-5.0.2.RELEASE.jar		
	spring-core-5.0.2.RELEASE.jar		
	spring-expression-5.0.2.RELEASE.jar		
	spring-jcl-5.0.2.RELEASE.jar		
	spring-web-5.0.2.RELEASE.jar		
	spring-webmvc-5.0.2.RELEASE.jar		

