# Java Socket Programming

A simple **TCP client-server application written in Java** that demonstrates network communication using Java sockets.

The server listens for incoming connections on port `2000`, accepts clients, assigns each connection a client number, and sends a welcome message back to the client.

## Features

- TCP communication using `ServerSocket` and `Socket`
- Server listening on port `2000`
- Client connection handling
- Sequential client numbering
- Server-to-client message exchange
- Resource management using try-with-resources
- Basic exception handling

## Project Structure

```text
java-socket/
├── Server.java    # TCP server
├── Client.java      # TCP client
└── README.md        # Project documentation
```

## Requirements

- Java Development Kit (JDK) 8 or later
- A terminal or command-line interface

Check your Java installation:

```bash
java -version
javac -version
```

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/ouahiba99/java-socket.git
cd java-socket
```

### 2. Compile the Java files

Make sure `Serveur2.java` and `Client.java` are in the same directory.

```bash
javac Serveur2.java Client.java
```

### 3. Start the server

Open a terminal and run:

```bash
java Serveur2
```

The server will start listening on port `2000`.

Expected output:

```text
Le serveur est pret a recevoir des requetes sur le port 2000
```

### 4. Run the client

Open a second terminal in the same directory and run:

```bash
java Client
```

Expected client output:

```text
Message du serveur : Vous etes le client numero 1
```

Each new client connection receives the next client number while the server continues running.

## How It Works

1. The server creates a `ServerSocket` bound to port `2000`.
2. The server waits for a client connection using `accept()`.
3. When a client connects, the server assigns it a sequential number.
4. The server sends a welcome message through the socket's output stream.
5. The connection is closed after the message is sent.
6. The server continues waiting for new connections.

## Important Notes

- The server and client must use the same port.
- For local testing, the client connects to `localhost`.
- The server handles connections sequentially, so one connection is processed at a time.
- This project is an introductory example of TCP socket communication. It can be extended with multithreading, persistent connections, and bidirectional messaging.

## Learning Objectives

This project demonstrates the fundamentals of Java network programming, including TCP connections, socket management, input/output streams, and basic client-server architecture.

## Author

**Ouahiba Ahmid**

GitHub: [@ouahiba99](https://github.com/ouahiba99)

---

*Built for learning and experimenting with Java TCP socket programming.*
