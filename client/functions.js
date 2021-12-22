const getPrice = async () => {
  const data = {
    pickupPostcode: "SW1A1AA",
    deliveryPostcode: "EC2A3LT",
    vehicle: "bicycle",
  };
  document.getElementById("price").style.display = "block";
  document.getElementById("price").innerHTML = "Computing price...";
  console.log(JSON.stringify(data));
  const response = await fetch("http://localhost:8080/quote", {
    method: "POST",
    headers: {
      //      Accept: "application/json",
      "Content-Type": "application/json",
    },
    body: JSON.stringify(data),
  });
  const respData = await response.json();
  const { price } = respData;
  document.getElementById("price").innerHTML = `Price: ${price}`;
};
