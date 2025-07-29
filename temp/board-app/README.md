# tailwwindcss
npm install -D tailwindcss@3.4.17 postcss autoprefixer

npx tailwindcss init -p


# fix tailwind.config.js
/** @type {import('tailwindcss').Config} */
export default {
  content: ["./src/**/*.{js,jsx,ts,tsx}"],
  theme: {
    extend: {},
  },
  plugins: [],
}



# index.css
@tailwind base;
@tailwind components;
@tailwind utilities;


# 