CREATE TABLE antistress (
                            id SERIAL PRIMARY KEY,
                            kind VARCHAR(32) NOT NULL
);

CREATE TABLE stress_kind (
                             id SERIAL PRIMARY KEY,
                             stress VARCHAR(32) NOT NULL
);

CREATE TABLE antistress_to_stress (
                                      stress_id INT REFERENCES stress_kind(id),
                                      antistress_id INT REFERENCES antistress(id)
);

CREATE TABLE city (
                      id SERIAL PRIMARY KEY,
                      name VARCHAR(32) NOT NULL,
                      stress_id INT REFERENCES stress_kind(id)
);


CREATE TABLE district (
                          id SERIAL PRIMARY KEY,
                          city_id INT REFERENCES city(id),
                          name VARCHAR(32) NOT NULL
);

CREATE TABLE factory (
                         id SERIAL PRIMARY KEY,
                         district INT REFERENCES district(id)
);

CREATE TABLE factory_production (
                                    factory_id INT REFERENCES factory(id),
                                    antistress_id INT REFERENCES antistress(id),
                                    count_ int not NULL
);

CREATE TABLE subscription (
                              id SERIAL PRIMARY KEY,
                              subscription_kind varchar(32) not NULL
);

CREATE TABLE human (
                       id SERIAL PRIMARY KEY,
                       name VARCHAR(32) NOT NULL,
                       surname VARCHAR(32) NOT NULL,
                       phone_number VARCHAR(32) NOT NULL
);

CREATE TABLE location (
                          id SERIAL PRIMARY KEY,
                          district_id int references district(id),
                          address varchar(32) not NULL
);

CREATE TABLE clients (
                         id SERIAL PRIMARY KEY,
                         human_id INT REFERENCES human(id),
                         location_id INT REFERENCES location(id),
                         subscription_id INT REFERENCES subscription(id)
);

CREATE TABLE order_ (
                        id SERIAL PRIMARY KEY,
                        client_id INT REFERENCES clients(id),
                        factory_id INT REFERENCES factory(id),
                        date_ date not NULL,
                        priority INT not NULL
);

CREATE TABLE product_list (
                              id SERIAL PRIMARY KEY,
                              antistress_id INT REFERENCES antistress(id),
                              order_id INT REFERENCES order_(id),
                              count_ int not NULL
);

CREATE TABLE car (
                     id SERIAL PRIMARY KEY,
                     number_ VARCHAR(32) NOT NULL
);

CREATE TABLE deliveryman (
                             id SERIAL PRIMARY KEY,
                             human_id INT REFERENCES human(id),
                             district_id int references district(id),
                             car_id int references car(id)
);

CREATE TABLE delivery_fact (
                               order_id INT REFERENCES order_(id),
                               deliveryman_id INT REFERENCES deliveryman(id),
                               delivery_date date,
                               delivery_fact boolean not NULL
);
