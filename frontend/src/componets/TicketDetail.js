import React from "react";

class TicketDetail extends React.Component {
    ticket = this.props.ticket;

    render() {
        return (
            <div className="detailTicket">
                <p>{this.ticket.name}</p>
                <p>{this.ticket.year}</p>
                <p>{this.ticket.color}</p>
                <p>{this.ticket.pantone_value}</p>
            </div>
        )
    }


}

export default TicketDetail