FROM node:16.17.1

COPY /webapp .

RUN npm install 

CMD ["npm", "run", "serve"]

EXPOSE 80 8080 443
