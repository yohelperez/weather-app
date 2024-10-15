async function getWeather() {
    const city = document.getElementById('city').value;
    const response = await fetch(`https://weather-app-6in8.onrender.com/api/v1/weather/${city}`);

    if (!response.ok) {
        document.getElementById('result').innerHTML = `<p class="text-red-500">Error: ${response.statusText}</p>`;
        return;
    }

    const data = await response.json();
    document.getElementById('result').innerHTML = `
        <div class="bg-white p-4 shadow-md rounded-lg inline-block max-w-xs">
            <img src="${data.iconUrl}" alt="Weather Icon" class="mx-auto mb-4 w-20 h-20">
            <p class="text-xl font-semibold mb-2 text-blue-600"><b>Weather:</b> ${data.weather}</p>
            <p class="text-gray-700"><b>Details:</b> ${data.details}</p>
            <p class="text-gray-700"><b>Temperature:</b> ${data.temperature}°C</p>
            <p class="text-gray-700"><b>Real Feel:</b> ${data.realFeel}°C</p>
        </div>
    `;
}
