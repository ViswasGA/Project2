import axios from 'axios';
import React, { Component } from 'react';


class Table extends Component {
    state = {
        data: []
    };


    componentDidMount() {
        axios.get('http://localhost:8080/show').then(response => {
            this.setState({ data: response.data });
            
        })
            .catch(error => { console.log(error); });
    }
    deleteData(id,e) {
        axios.delete(`http://localhost:8080/delete/${id}`)
            .then(response => {
                console.log(response);
                const data = this.state.data.filter(item => item.id !== id);
                this.setState({ data });
            })
    }
    updateData(id, e) {
        
        axios.Update(`http://localhost:8080/update/${id}`)
            .then(response => {
                console.log(response);
                const data = this.state.data.filter(item => item.id !== id);
                this.setState({ data });
            })
        window.location.reload();
    }





    render() {
        return (
            <table border={1}>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Flavours</th>
                        <th>Quantity</th>
                        <th>Rate</th>
                        <th>Toppings</th>
                        <th>Scoops</th>
                        <th>Mobile</th>
                        <th>Mailid</th>
                    </tr>
                </thead>
                <tbody>
                    {this.state.data.map(Icecream => (
                        <tr key={Icecream.id}>
                            <td>{Icecream.id}</td>
                            <td>{Icecream.flavours}</td>
                            <td>{Icecream.quantity}</td>
                            <td>{Icecream.rate}</td>
                            <td>{Icecream.scoops}</td>
                            <td>{Icecream.toppings}</td>
                            <td>{Icecream.mobileno}</td>
                            <td>{Icecream.mailid}</td>
                            <td>
                                <button className="btn btn-danger" onClick={(e)=>this.deleteData(Icecream.id,e)}>Delete</button>
                            </td>
                            <td>
                                <button className="btn btn-primary col-md-12" onClick={(e)=> this.updateData(Icecream.id,e)}>update</button>
                            </td>
                        </tr>
                    ))}
                </tbody>
            </table>
        );
    }
}


export default Table;