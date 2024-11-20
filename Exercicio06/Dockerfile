FROM openjdk:24-slim-bullseye as compile
WORKDIR /src
ADD https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/3.47.0.0/sqlite-jdbc-3.47.0.0.jar lib/sqlite-jdbc-3.47.0.0.jar
COPY . .
RUN find ./src -type f -name "*.java" -exec \
        javac -cp "lib/*" -d build/ -encoding "UTF-8" --release 21 '{}' +
CMD java -ea -cp build org.dejailton.sistemaregistrador.MainTest; 


