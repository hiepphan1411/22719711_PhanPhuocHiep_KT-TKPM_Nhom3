FROM node:18
# Thư mục làm việc
WORKDIR /app

COPY package.json .
RUN npm install

COPY . .

# Port 3000 để truy cập
EXPOSE 3000
CMD ["node", "app.js"]