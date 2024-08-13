const http = require('http');

http.createServer((resquisicao, resposta)=>{
    resposta.writeHead(200,{
        'Content-Type':'text/plain'

    });
    resposta.write('Ola o_garotodev, vamos lá\n');
    resposta.end();
}).listen(3339);