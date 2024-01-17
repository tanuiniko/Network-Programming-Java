DatagramSocket object is used to open the communication link for udp.
DatagramPacket object is used for communication via send and recieve methods of socket object.
The incoming datagrams are stored in a buffer.
They are retrieved by DatagramPackets on the other end.


Datagram socket is always open once created.
The connection to the client is not maintained throughout the dialogue and hence it would appear that two clients are connected at a time but not.
Meaning, client-1 opens and sends messages first, then client-2 opens and sends and now its perfectly possible for client-1 to send a message as the connection is always open and not closed. This justifies that udp sockets sends each datagram packets as an isolated transmission whenever necessary.
