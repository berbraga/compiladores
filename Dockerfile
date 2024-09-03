# Use a imagem oficial do Maven como imagem base
FROM maven:3.8.6-eclipse-temurin-17-alpine

# Defina o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo pom.xml e as dependências para o diretório de trabalho
COPY pom.xml .

# Baixe todas as dependências
RUN mvn dependency:go-offline -B

# Copie todo o conteúdo do diretório atual para o diretório de trabalho
COPY . .

# Compile o projeto
RUN mvn clean package

# Comando padrão para executar o projeto
CMD ["java", "-jar", "target/compiladores-1.0-SNAPSHOT.jar"]
