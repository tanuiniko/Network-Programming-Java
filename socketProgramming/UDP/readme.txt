DatagramSocket object is used to open the communication link for udp.
DatagramPacket object is used for communication via send and recieve methods of socket object.
The incoming datagrams are stored in a buffer.
They are retrieved by DatagramPackets on the other end.


Datagram socket is always open once created.
Two or more clients can connect at a time.
There is no order in receiving messages from the clients by the server, its open to all the clients.