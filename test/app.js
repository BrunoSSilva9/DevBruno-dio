const { write } = require('fs');
const http = require('http');

http.createServer((req, resp)=>{
    resp.writeHead(200,{'Content-Type':'text-html'});
    resp.write('<h1>Hello World!!</h1><br><p>Welcome...</p>');
    resp.end();


}).listen(8081)