How to develop Infinispan RMI Service and Client

Java Remote Method Invocation (Java RMI) enables the programmer to create distributed Java technology-based to Java technology-based applications, in which the methods of remote Java objects can be invoked from other Java virtual machines, possibly on different hosts. RMI uses object serialization to marshal and unmarshal parameters and does not truncate types, supporting true object-oriented polymorphism.

The development of remote-enabled services has been eased by Spring remoting support. Currently, Spring supports the following remoting technologies: Remote Method Invocation (RMI), HTTP Invoker, Hessian, Burlap, JAX-RPC, JAX-WS and JMS.

Spring RMI Support : Spring supports RMI via RmiProxyFactoryBean and RmiServiceExporter. RmiServiceExporter exports any Spring-managed bean as an RMI service and registers. RmiProxyFactoryBean is a factory bean creating a proxy for an RMI service. This proxy object talks with remote RMI services on behalf of the client.

This article shows how to develop a Infinispan RMI Service and Client. In the following sample application, a new cluster called DATA4J is created and User objects are added to cache and read from cache by using Spring RMI Clients. Added User Objects are distributed between two members of the cluster so First member adds and second member reads them via Infinispan cache cluster. The following figure shows the Infinispan RMI Client Architecture.

Used Technologies : JDK 1.7.0_40, Spring 3.2.4, Infinispan 5.2.7, JGroups 3.2.7 and Maven 3.0.4