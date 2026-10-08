import { useState } from 'react'
import heroImg from './assets/hero.png'
import reactLogo from './assets/react.svg'
import viteLogo from './assets/vite.svg'
import './App.css'

function App() {
  const [color, setColor] = useState('--')

  function handleClick(c){
    setColor(c);
    document.querySelector("body").style.backgroundColor = c;
  }

  return (
    <>
     <div className="app-card">
      <div className="header-section">
        <h1 className="title">
          You have clicked {color} Button!!
        </h1>
      </div>
      
      <div className="button-container">
        {/* Removed the unused '(e) =>' wrapper for cleaner code */}
        <button className="btn btn-red" onClick={() => handleClick('Red')}>Red</button>
        <button className="btn btn-blue" onClick={() => handleClick('Blue')}>Blue</button>
        <button className="btn btn-green" onClick={() => handleClick('Green')}>Green</button>
        <button className="btn btn-yellow" onClick={() => handleClick('Yellow')}>Yellow</button>
      </div>
    </div>
    </>
  )
}

export default App
