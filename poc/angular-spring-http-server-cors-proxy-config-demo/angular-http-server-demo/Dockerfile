FROM node:8.11.2-alpine as node

RUN npm install
COPY . .
# RUN npm run build

# Stage 2
FROM node
RUN npm install http-server -g
CMD ["http-server","-p","4200", "dist/angular-http-server-demo"]

# FROM node:8.11.2-alpine as node

# COPY . .

# RUN npm install

# FROM node

# RUN npm install http-server -g

# RUN npm build 

# CMD ["http-server","-p","4200","dist/angular-http-server-demo/index.html"]
