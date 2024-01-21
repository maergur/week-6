SELECT city.city,  country.country
FROM city
JOIN country ON city.country_id = country.country_id;

SELECT customer.first_name, customer.last_name, payment.payment_id, payment
FROM customer
JOIN payment ON customer.customer_id = payment.customer_id;

SELECT customer.first_name, customer.last_name, rental.rental_id
FROM customer
JOIN rental ON customer.customer_id = rental.customer_id;

