import React from "react";
import Header from "./componets/Header";
import Tickets from "./componets/Tickets";

class App extends React.Component {

    async componentDidMount() {
        // GET request using fetch with async/await
        const response = await fetch('https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/rates/exchangerates?web-api-key=c52a0682-4806-4903-828f-6cc66508329e');
        const data = await response.json();
        this.setState({ tickets: data })
    }
    constructor(props) {
        super(props);
        this.state = {
            tickets: []
        }
    }

    render() {
        return (
            <div>
                <Header title="Tickets list"/>
                    <main>
                        <Tickets tickets={this.state.tickets} />
                    </main>
            </div>
        );
    }

}

export default App;
