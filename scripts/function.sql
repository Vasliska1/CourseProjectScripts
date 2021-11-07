-- наличие продукции на складе фабрики

create or replace function check_production (antistress_to_check integer,
                                             count_to_check integer,
                                             factory_to_check integer)
returns boolean
language plpgsql
as $$
declare
checker integer;
begin
    checker = (select count_ from factory_production
               where (antistress_id = antistress_to_check
                      and factory_id = factory_to_check));
    if (checker >= count_to_check) then
        return true;
else
        return false;
end if;
end;
$$;



-- формирование order

CREATE or replace function create_order (client_id integer, factory_id integer)
returns boolean
language plpgsql
as $$
declare
priority integer;
    subscription integer;
begin
    subscription = (select subscription.id from subscription join clients
                    on clients.subscription_id = subscription.id where (clients.id = client_id));
    if (subscription = 1) then
        priority = 1;
else
        priority = 2;
end if;
insert into order_ (client_id, factory_id, priority, date_) values (client_id, factory_id, priority, CURRENT_DATE);
return true;
end;
$$;


-- формирование product_list

CREATE or replace function create_product_list (order_id integer, antistress_id integer, count_ integer)
returns boolean
language plpgsql
as $$
begin
insert into product_list (antistress_id, count_, order_id) values (antistress_id, count_, order_id);
return true;
end;
$$;
