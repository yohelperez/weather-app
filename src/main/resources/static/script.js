async function getWeather() {
    const city = document.getElementById('city').value;
    const response = await fetch(`https://weather-app-6in8.onrender.com/api/v1/weather/${city}`);

    if (!response.ok) {
        document.getElementById('result').innerHTML = `<p>Error: ${response.statusText}</p>`;
        return;
    }

    const data = await response.json();
    document.getElementById('result').innerHTML = `
        <p><b>Weather:</b> ${data.weather}</p>
        <p><b>Details:</b> ${data.details}</p>
        <p><b>Temperature:</b> ${data.temperature}</p>
        <p><b>Real Feel:</b> ${data.realFeel}</p>
    `;
}
