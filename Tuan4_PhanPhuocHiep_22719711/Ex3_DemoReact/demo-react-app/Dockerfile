FROM node:18-alpine
WORKDIR /app

# Copy package
COPY package*.json ./
RUN npm install
# Copy code va build React
COPY . .
RUN npm run build

# Cai serve để build file
RUN npm install -g serve
EXPOSE 3000
CMD ["serve", "-s", "build", "-l", "3000"]