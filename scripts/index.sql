CREATE INDEX return_order
ON product_list (order_id);

CREATE INDEX return_deliveryman_curr_order
ON delivery_fact (deliveryman_id, delivery_fact);

CREATE INDEX return_id_human_by_name_surname_phone
ON human (name, surname, phone_number);

CREATE INDEX return_count_by_factory_antistress
ON factory_production (factory_id, antistress_id);

CREATE INDEX return_id_city_by_name
ON city (name);