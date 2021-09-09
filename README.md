# Spring-MVC-Hello

## About The Project
`Spring-MVC-Hello` is a simple project using Spring MVC, Spring Webflow and FreeMarker.
<img src="./img/webflow.png" style="width:800px;height:200px;">

## Prerequisites
<ul>
<li>Apache Tomcat 9.0</li>
<li>Java 11</li>
<li>Maven 4.0.0</li>
<li>Spring Webflow 2.5.0</li>
<li>Spring MVC 5.0.2</li>
<li>Apache FreeMarker 2.3.31</li>
<li>Eclipse 6.2021</li>
</ul>

## Installation
1. Clone the repo 
`git clone https://github.com/ntttrang/Spring-MVC-Hello.git`

2. Import project into your Eclipse
3. Maven Update
4. Add Tomcat server
5. Add web module `SpringMVCHello` into Tomcat server
6. Start Tomcat server and go to `http://localhost:8080/SpringMVCHello/activationFlow`

<img src="./img/result.png" style="width:800px;height:200px;">

## Troubleshoots 

##### TBS 1:
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


##### Solution:
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

##### TBS 2: Dynamic Web Module 3.0 requires Java 1.6 or newer
##### Solution:
Go to <b>Properties</b> and check <b>Java Build Path</b> and <b>Project facets</b>
<img src="./img/build_path.png" style="width:800px;height:500px;">

<br/>

<img src="./img/project_facets.png" style="width:800px;height:500px;">

## References:
<ul>
<li><a href="https://www.baeldung.com/spring-web-flow">https://www.baeldung.com/spring-web-flow</a></li>
<li><a href="https://docs.spring.io/spring-webflow/docs/current/reference/html/system-setup.html">https://docs.spring.io/spring-webflow/docs/current/reference/html/system-setup.html</a></li>
<li><a href="https://stackjava.com/spring-mvc/code-vi-du-spring-mvc-freemarker-hello-world-maven-eclipse.html">https://stackjava.com/spring-mvc/code-vi-du-spring-mvc-freemarker-hello-world-maven-eclipse.html</a></li>
</ul>
