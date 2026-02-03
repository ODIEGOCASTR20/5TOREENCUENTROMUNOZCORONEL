// 🎯 FECHA DEL EVENTO
const fechaEvento = new Date("febrero 07, 2026 08:00:00").getTime();

setInterval(() => {
    const ahora = new Date().getTime();
    const diferencia = fechaEvento - ahora;

    if (diferencia <= 0) {
        document.getElementById("contador").innerHTML = "¡Hoy es el gran día!";
        return;
    }

    const dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
    const horas = Math.floor((diferencia / (1000 * 60 * 60)) % 24);
    const minutos = Math.floor((diferencia / (1000 * 60)) % 60);
    const segundos = Math.floor((diferencia / 1000) % 60);

    document.getElementById("contador").innerHTML =
        `${dias} días · ${horas} h · ${minutos} min · ${segundos} s`;
}, 1000);

// 🎬 Animación al hacer scroll (Mensaje)
const mensaje = document.querySelector(".mensaje");

const observer = new IntersectionObserver(
    entries => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                mensaje.classList.add("show");
            }
        });
    },
    {
        threshold: 0.3
    }
);

observer.observe(mensaje);
// 📅 Animación cronograma
const cronograma = document.querySelector(".cronograma");

const observerCrono = new IntersectionObserver(
    entries => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                cronograma.classList.add("show");
            }
        });
    },
    { threshold: 0.25 }
);

observerCrono.observe(cronograma);

