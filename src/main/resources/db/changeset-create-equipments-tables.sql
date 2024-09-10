-- -- Drops
DROP TABLE  IF EXISTS public.equipments;
DROP SEQUENCE IF EXISTS public.equipment_id_seq;

-- --Creates

CREATE SEQUENCE public.equipment_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.equipments
(
	equipment_id integer NOT NULL DEFAULT nextval('equipment_id_seq'),
	equipment_name varchar NOT NULL,
	product_id integer NOT NULL,
	equipment_type varchar NOT NULL,
	equipment_number varchar NOT NULL,
	equipment_date date,
	equipment_warranty boolean NOT NULL,
	CONSTRAINT equipment_pkey PRIMARY KEY (equipment_id),
	   CONSTRAINT  product_fkey
	      FOREIGN KEY (product_id)
	      REFERENCES public.products(product_id)
);
