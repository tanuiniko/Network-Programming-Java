# Server Echo Project

## Introduction
<p>The most common categories of network software nowadays are clients and servers. A server, as the name 
  implies, provides a service of some kind. This service is provided for clients that connect to the server's
  host machine specifically for the purpose of accessing the service. Thus, it is the clients that initiate 
  a dialogue with the server.</p>
<p>Though a client and its corresponding server will normally run on different machines in a real-world 
  application, it is perfectly possible for such programs to run on the same machine.</p>

#### Sockets
<p>For each port supplying a service, there is a server program waiting for any requests. All such programs run 
together in parallel on the host machine. When a client attempts to make connection with a particular server
program, it supplies the port number of the associated service. The host machine examines the port number and 
  passes the client's transmission to the appropriate server program for processing.</p>
  <p>In most applications, of course, there are likely to be multiple clients wanting the same service at 
  the same time. A common example o fthis requirement is that of multiple browsers wanting Web pages from
   the same server. The server, of course, needs a way of distinguishing between clients and keeping their 
  dialogues separate from each other. This is achieved via the use of sockets.</p>
  <p>NOTE: Both ports and sockets are abstract concepts. A Port is a logical connection to a computer and is 
  identified by a number in the range 1-65535. Whereas a socket is used to indicate one of the two ends-points
    of a communication link between two processes.</p>


## Using Sokets
<p>Java implements both TCP/IP sockets and datagram sockets (UDP sockets).</p>
<ul>
  <li>TCP Sockets
  <p>A communication link created via TCP/IP sockets is a connection-orientated link. This means that the 
  connection between server and client remains open throughout the duration of the dialogue between the two and 
  is only broken when one end of the dialogue terminates.</p> 
  </li>
  <li>Datagram (UDP) Sockets
  <p>Unlike TCP/IP sockets, datagram sockets are connectionless. That is to say, the connection between client 
  and server is not maintained throughout the duration of the dialogue. Instead, each datagram packet is sent 
  as an isolated transmission whenever necessary. (Daragram sockets provide usually faster mean of transmitting
    data than TCP/IP sockets, but they are unreliable.)</p>
  </li>
</ul>

## Multithreaded Server

<p>There is a fundamental and important limitation associated with the server programs we created in 
this project (not multithreaded, ofcourse):</p>
<ul>
  <li>they can handle only one connection at a time.</li>
</ul>
<p>This restriction is not feasible for most real-world applications and would render the software useless.
There are two possible solutions:</p>
<ui>
  <li>use a non-blocking server.</li>
  <li>use a multithreaded server. (handles multiple connections concurrently)</li>
</ui>

## Abstract
<p>Created multi-threaded server applications for echoing client messages and retrieving host IP addresses using Java. Implemented TCP and UDP sockets with thread synchronization for concurrent processing.Improved server response efficiency by implementing optimized locking mechanisms.</p>
