import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div className="container mx-auto p-4">
        <div class="w-[50%]">너비 50%</div>
        <div class="w-[50%]">너비 50%</div>
        <h1 className="text-2xl font-bold mb-4">Hello, Tailwind Container!</h1>
        <p className="mb-2">Count: {count}</p>
        <button
          className="bg-blue-500 text-white px-4 py-2 rounded hover:bg-blue-600"
          onClick={() => setCount(count + 1)}
        >
          Increment
        </button>
      </div>
    </>
  )
}

export default App
