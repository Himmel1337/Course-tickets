import React from "react";
import Ticket from "./Ticket"

class Tickets extends React.Component {
    render() {
        if(this.props.tickets.length > 0)
        return (<div>
                {this.props.tickets.map((el) => (
                    <Ticket onDetail={this.props.onDetail} key={el.id} ticket={el} />

                ))}
            </div>
        )
        else
            return (
                <div className="ticket">
                    <h3>Empty tickets list</h3>
                </div>
            )
    }


}

export default Tickets