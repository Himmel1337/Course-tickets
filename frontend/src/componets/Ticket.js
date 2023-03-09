import React from "react";
import TicketDetail from "./TicketDetail";
import {FaArrowAltCircleDown} from "react-icons/fa";


class Ticket extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            editForm: false
        }
    }
    ticket = this.props.ticket;
    render() {
        return (
            <div className="ticket">
                <FaArrowAltCircleDown onClick={() => {
                    this.setState({
                        detailForm: !this.state.detailForm
                    })
                }} className="detail-icon" />
                <h3>{this.ticket.name}</h3>
                <p>{this.ticket.year}</p>
                <p>{this.ticket.color}</p>
                <p>{this.ticket.pantone_value}</p>
                {this.state.detailForm && <TicketDetail ticket={this.ticket} onDetail={this.props.onDetail}/>}
            </div>
        )
    }
}

export default Ticket