DROP table if EXISTS antistress;
DROP table if EXISTS stress_kind;
DROP table if EXISTS antistress_to_stress;
DROP table if EXISTS human;
DROP table if EXISTS city;
DROP table if EXISTS district;
DROP table if EXISTS subscription;
DROP table if EXISTS location;
DROP table if EXISTS factory;
DROP table if EXISTS factory_production;
DROP table if EXISTS car;
DROP table if EXISTS clients
DROP table if EXISTS factory_staff;
DROP table if EXISTS deliveryman;
DROP table if EXISTS product_list;
DROP table if EXISTS order_;
DROP table if EXISTS delivery_fact;


CREATE INDEX return_order ON product_list (order_id);
CREATE INDEX return_deliveryman_curr_order
ON delivery_fact (deliveryman_id, delivery_fact);

CREATE INDEX return_id_city_by_name
ON city (name);

CREATE INDEX return_id_human_by_name_surname_phone
ON human (name, surname, phone_number);

EXPLAIN analyze select * from product_list pl where order_id = 3701 ;