const express = require('express');
const app = express();
const port = process.env.PORT || 8001;

app.listen(port, () => console.log(`Listening on port ${port}`));

app.get('/http://localhost:8082/tickets?usedb=true', (req, res) => {
    res.send({ express: 'YOUR EXPRESS BACKEND IS CONNECTED TO REACT' });
});