function add_to_cart(pId, pName, pPrice)
{
	let cart = localStorage.getItem("cart");
    if (cart == null)
    {
        //no cart yet  
        let products = [];
        let product = {productId: pId, productName: pName, productQuantity: 1, productPrice: pPrice}
        products.push(product);
        localStorage.setItem("cart", JSON.stringify(products));
        console.log("Product is added for the first time")
//        showToast("Item is added to cart")
    } 
	else
	{
		 //cart is already present
	    let pcart = JSON.parse(cart);

        let oldProduct = pcart.find((item) => item.productId == pId)

		if(oldProduct)
		{
			//we have to increase the quantity
			oldProduct.productQuantity = oldProduct.productQuantity+1
			pcart.map((item) => {
                if (item.productId === oldProduct.productId)
                {
                    item.productQuantity = oldProduct.productQuantity;
                }
            })
			localStorage.setItem("cart", JSON.stringify(pcart));
			console.log("Product quantity is increased")
		}
		else
		{
			//we have add the product
			let product = {productId: pId, productName: pName, productQuantity: 1, productPrice: pPrice}
       		pcart.push(product);
			localStorage.setItem("cart", JSON.stringify(pcart));
			console.log("Product is added")
		}
	}

}