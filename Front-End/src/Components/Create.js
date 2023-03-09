import React, { Component } from "react";
import axios from 'axios';
import './Create.css';

class Create extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: '',
            flavours: '',
            quantity: '',
            rate: '',
            scoops: '',
            toppings: '',
            mobileno: '',
            mailid: '',
        };

    }

    handleaccidchange = (event) => {
        this.setState({ id: event.target.value });
    };


    handleFlavourschange = (event) => {
        this.setState({ flavours: event.target.value });
    };


    handleQuantitychange = (event) => {
        this.setState({ quantity: event.target.value });
    };


    handleRatechange = (event) => {
        this.setState({ rate: event.target.value });
    };


    handleScoopschange = (event) => {
        this.setState({ scoops: event.target.value });
    };

    handleToppingschange = (event) => {
        this.setState({ toppings: event.target.value });
    };

    handleMobilechange = (event) => {
        this.setState({ mobileno: event.target.value });
    };


    handlEmailidchange = (event) => {
        this.setState({ mailid: event.target.value });
    };






    handleSubmit = (event) => {
        event.preventDefault();
        const data = {
            id: this.state.id,
            flavours: this.state.flavours,
            quantity: this.state.quantity,
            rate: this.state.rate,
            scoops: this.state.scoops,
            mobileno: this.state.mobileno,
            mailid: this.state.mailid,
            toppings: this.state.toppings
        };
        axios.post('http://localhost:8080/add', data);
        window.location.reload();   
    };
    render() {
        return (
            <form onSubmit={this.handleSubmit} className="login-form"   >
                <label className="login-label"> id</label>
                <input
                    className="login-input"
                    type="number"
                    value={this.state.id}
                    onChange={this.handleaccidchange}
                />
                <label className="login-label">Flavours</label>
                <input
                    className="login-input"
                    type="text"
                    value={this.state.flavours}
                    onChange={this.handleFlavourschange}
                />
                <label className="login-label">Quantity</label>
                <input
                    className="login-input"
                    type="number"
                    value={this.state.quantity}
                    onChange={this.handleQuantitychange}
                />
                <label className="login-label">Rate</label>
                <input
                    className="login-input"
                    type="number"
                    value={this.state.rate}
                    onChange={this.handleRatechange}
                />
                <label className="login-label">Toppings</label>
                <input
                    className="login-input"
                    type="text"
                    value={this.state.toppings}
                    onChange={this.handleToppingschange}
                />
                <label className="login-label">Scoops</label>
                <input
                    className="login-input"
                    type="number"
                    value={this.state.scoops}
                    onChange={this.handleScoopschange}
                />
                <label className="login-label">Mobile</label>
                <input
                    className="login-input"
                    type="number"
                    value={this.state.mobileno}
                    onChange={this.handleMobilechange}
                />
                <label className="login-label">Mail ID</label>
                <input
                    className="login-input"
                    type="email"
                    value={this.state.mailid}
                    onChange={this.handlEmailidchange}
                />
                <button className="login-button" type="submit">Add</button>
            </form>
        )
    }
}


export default Create;