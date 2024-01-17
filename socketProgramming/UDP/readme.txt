DatagramSocket object is used to open the communication link for udp.
DatagramPacket object is used for communication via send and recieve methods of socket object.
The incoming datagrams are stored in a buffer.
They are retrieved by DatagramPackets on the other end.


Datagram socket is always open once created.
The connection to the client is not maintained throughout the dialogue and hence it would appear that two clients are connected at a time but not.
There is no order in receiving messages from the clients by the server, its open to all the clients.
