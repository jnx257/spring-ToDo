import './App.css';
import {useEffect} from "react";

function App() {
  useEffect(()=> {
    fetch("https://localhost:8080/api/todoItems").then((response)=>{
      response.json()
    }).then((todoItems) => {
      console.log(todoItems);
    })
  })
  return (
    <>
    <div className="Main app page">
    <h1 id ='main-title'>My Todo list</h1>   
    </div>
    {/* <div className = "mynick-bar">
    <p>ola</p>
    </div> */}
    </>                                                             
  );
}

export default App;
