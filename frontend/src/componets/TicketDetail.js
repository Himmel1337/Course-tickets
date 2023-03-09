import React from "react";

class TicketDetail extends React.Component {
    ticket = this.props.ticket;

    render() {
        return (
            <div className="detailTicket">
                <p>Name: {this.ticket.name}</p>
                <p>Country: {this.ticket.country}</p>
                <p>Move: {this.ticket.move}</p>
                <p>Amount: {this.ticket.amount}</p>
                <p>Val buy: {this.ticket.valBuy}</p>
                <p>Val sell: {this.ticket.valSell}</p>
                <p>Val mid: {this.ticket.valMid}</p>
                <p>Curr buy: {this.ticket.currBuy}</p>
                <p>Curr sell: {this.ticket.currSell}</p>
                <p>Curr mid: {this.ticket.currMid}</p>
                <p>Version: {this.ticket.version}</p>
                <p>Cnb mid: {this.ticket.cnbMid}</p>
                <p>Ecb mid: {this.ticket.ecbMid}</p>
                <p>Short name: {this.ticket.shortName}</p>
                <p>Valid from: {this.ticket.validFrom}</p>
            </div>
        )
    }


}

export default TicketDetail