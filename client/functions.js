const getPrice = async () => {
  const pickupPostcode = document.getElementById("pickup_postcode").value;
  const deliveryPostcode = document.getElementById(
    "destination_postcode"
  ).value;
  const vehicle = document.getElementById("vehicle").value;
  if (!pickupPostcode || !deliveryPostcode || !vehicle) {
    document.getElementById("price").style.display = "block";
    document.getElementById(
      "price"
    ).innerHTML = `Please enter all required data above`;
    return;
  }

  document.getElementById("price").style.display = "block";
  document.getElementById("price").innerHTML = "Computing price...";
  const response = await fetch("http://localhost:8080/quote", {
    method: "POST",
    headers: {
      //      Accept: "application/json",
      "Content-Type": "application/json",
    },
    body: JSON.stringify({
      pickupPostcode,
      deliveryPostcode,
      vehicle,
    }),
  });
  const respData = await response.json();
  const { price } = respData;
  document.getElementById("price").innerHTML = `Price: ${price}`;
};
