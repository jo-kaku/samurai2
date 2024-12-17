const stripe = Stripe('pk_test_51QIWGp2LU6SyeR3Mf57Aivrgq8fAgCIlB1Zq1QAiCavCyjPGEmdbOURP85mulSZuIyUnwzHFog3a8nQmeb4zsftk004AAbczQ5');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click' , () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});