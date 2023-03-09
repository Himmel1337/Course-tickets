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
                <h3>{this.ticket.name} {this.ticket.country}</h3>
                {this.state.detailForm && <TicketDetail ticket={this.ticket} />}
            </div>
        )
    }
}

export default Ticket