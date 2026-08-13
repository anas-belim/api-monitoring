const year = document.getElementById("year");

year.textContent = new Date().getFullYear();

const getStartedBtn = document.getElementById("getStartedBtn");
const heroButton = document.getElementById("heroButton");

function scrollToFeatures() {
    document
        .getElementById("features")
        .scrollIntoView({ behavior: "smooth" });
}

getStartedBtn.addEventListener("click", scrollToFeatures);
heroButton.addEventListener("click", scrollToFeatures);