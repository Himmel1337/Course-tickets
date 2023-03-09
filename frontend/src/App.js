import React from "react";
import Header from "./componets/Header";
import Tickets from "./componets/Tickets";
import axios from "axios";
const baseUrl = "https://reqres.in/api/tickets?page=1"

class App extends React.Component {
    constructor(props) {
        super(props);
        axios.get(baseUrl).then((res) => {
            this.setState({ tickets: res.data.data });
        });
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
