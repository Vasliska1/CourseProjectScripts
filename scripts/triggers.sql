-- уменьшение кол-ва на складе при добавлении в product_list

CREATE OR REPLACE FUNCTION decrement_factory_production() RETURNS TRIGGER AS
$$
DECLARE
factory integer;
BEGIN
SELECT factory_id FROM order_ WHERE order_.id = NEW.order_id INTO factory;
UPDATE factory_production
SET count_ = count_ - NEW.count_
WHERE (factory_production.factory_id = factory
    AND factory_production.antistress_id = NEW.antistress_id);
RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER dec_production
    AFTER INSERT
    ON product_list
    FOR EACH ROW
    EXECUTE PROCEDURE decrement_factory_production();



-- удаление из order_ при изменении delivery_fact на true

CREATE OR REPLACE FUNCTION delete_order() RETURNS TRIGGER AS
$$
BEGIN
DELETE from order_
WHERE (order_.id = NEW.order_id);
RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER del_order
    AFTER UPDATE
    ON delivery_fact
    FOR EACH ROW
    WHEN (OLD.delivery_fact IS DISTINCT FROM NEW.delivery_fact)
EXECUTE PROCEDURE delete_order();


-- добавление даты в delivery_fact при изменении delivery_fact на true


CREATE OR REPLACE FUNCTION set_date()
RETURNS TRIGGER AS
$$
begin
UPDATE delivery_fact SET delivery_date = CURRENT_DATE
where delivery_fact.order_id = new.order_id;
RETURN NEW;
end;
$$ LANGUAGE plpgsql;



CREATE TRIGGER set_date
    AFTER UPDATE
    ON delivery_fact
    FOR EACH ROW
    WHEN (OLD.delivery_fact IS DISTINCT FROM NEW.delivery_fact)
EXECUTE PROCEDURE set_date();




