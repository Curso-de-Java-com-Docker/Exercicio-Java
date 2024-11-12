FROM openjdk:24-slim-bullseye as compile
WORKDIR /src
COPY . .
RUN find ./src -type f -name "*.java" -exec \
        javac -cp "lib/*" -d build/ -encoding "UTF-8" --release 21 '{}' +
CMD java -ea -cp build org.dejailton.sistemaregistrador.MainTest; 


