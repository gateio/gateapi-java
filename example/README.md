
# Example Application

This is a demo application using `gate-api` to show how Gate APIv4 works. 
Instead of running it, it is recommended to read the source code to get a general idea of
how this SDK is used. However, you can modify this code directly to implement your own logic.

## Preparation

1. Clone this project
2. Run `mvn clean install` to install the library into local repository

## Build 

### Maven users

```bash
sh example/maven-build.sh
```

### Gradle users

```bash
sh example/gradle-build.sh
```

> if `gradle run` output shows "Missing required options", 
> but reports "Task :run FAILED" error, just ignore the error.

## Run

**READ THIS BEFORE YOU RUN ANYTHING**

**This application is shown for demo only. It will try to use your input API key and secret to
trade, lend and borrow, etc. Make sure you know exactly what it does before running it.**

### Maven users

```bash
# run futures demo against TestNet
LOCATION="gateapi-demo-maven/gateapi-demo/target/gateapi-demo-1.0-SNAPSHOT.jar"
java -jar $LOCATION futures -k <YOUR_TESTNET_API_KEY> -s <YOUR_TESTNET_API_SECRET> -u fx-api-testnet.gateio.ws

# run futures demo against real trading
java -jar $LOCATION futures -k <YOUR_API_KEY> -s <YOUR_API_SECRET>

# run spot demo
java -jar $LOCATION spot -k <YOUR_API_KEY> -s <YOUR_API_SECRET>

# run margin demo
java -jar $LOCATION margin -k <YOUR_API_KEY> -s <YOUR_API_SECRET>
```

### Gradle users

```bash
cd gateapi-demo-gradle
# run futures demo against TestNet
gradle run --args="futures -k <YOUR_TESTNET_API_KEY> -s <YOUR_TESTNET_API_SECRET> -u fx-api-testnet.gateio.ws"

# run futures demo against real trading
gradle run --args="futures -k <YOUR_API_KEY> -s <YOUR_API_SECRET>"

# run spot demo
gradle run --args="spot -k <YOUR_API_KEY> -s <YOUR_API_SECRET>"

# run margin demo
gradle run --args="margin -k <YOUR_API_KEY> -s <YOUR_API_SECRET>"
```