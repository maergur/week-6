SELECT COUNT(*)
FROM film
WHERE length > 
(
SELECT AVG(length) 
FROM film AS avg_length
)
SELECT COUNT(*)
FROM film
WHERE rental_rate = 
(
SELECT MAX(rental_rate) 
FROM film AS max_rental_rate
)

SELECT title,
(SELECT MIN(rental_rate) as min_rental_rate from film),
(SELECT MIN(replacement_cost) as min_replacement_cost from film)
FROM film

SELECT customer_id, COUNT (customer_id)
FROM payment
GROUP BY customer_id
ORDER BY COUNT (customer_id) DESC