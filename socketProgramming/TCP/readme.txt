if flush is not used (ChatGPT's feedback) :
It looks like your program is getting stuck after reading the first message, and the terminal is not responding for further user input. 
This issue is likely caused by the fact that you're using the Scanner class to read from the socket's input stream. 
The Scanner is blocking, meaning it will wait for more input, and since your server is not sending more data, it appears to be stuck.

To fix this issue, you should ensure that the server sends a response to the client for each message it receives. 
This will allow the client to read the response and then prompt the user for another message. 
Additionally, make sure to flush the output stream after sending a message to ensure that the data is sent immediately.


About the program :
Only one client connects at a time.
if another client tries to connect, it shall await the previous clients to finish first.
It Contains :
How to use tcp sockets.
How to open a port and host a service.
We use Scannner object to read the input and PrintWriter object to send the output.
Using finally block is best practice.
You need to give ***CLOSE*** message to close the connection.
Streams are used for communication.