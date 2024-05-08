-- -- Drops
DROP TABLE  IF EXISTS public.products CASCADE;
DROP SEQUENCE IF EXISTS public.product_id_seq;

DROP TABLE IF EXISTS public.circuit_boards;
DROP SEQUENCE IF EXISTS public.circuit_board_id_seq;

DROP TABLE IF EXISTS public.elements;
DROP SEQUENCE IF EXISTS public.element_id_seq;

DROP TABLE IF EXISTS public.components;
DROP SEQUENCE IF EXISTS public.component_id_seq;

DROP TABLE IF EXISTS public.component_types;
DROP SEQUENCE IF EXISTS public.component_type_id_seq;

DROP TABLE IF EXISTS public.elements_components;
DROP SEQUENCE IF EXISTS public.element_component_id_seq;

-- --Creates
CREATE SEQUENCE public.product_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.products
(
	product_id integer NOT NULL DEFAULT nextval('product_id_seq'),
	product_name varchar NOT NULL,
	CONSTRAINT product_pkey PRIMARY KEY(product_id)
);

CREATE SEQUENCE public.circuit_board_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.circuit_boards
(
	circuit_board_id integer NOT NULL DEFAULT nextval('circuit_board_id_seq'),
	circuit_board_name varchar NOT NULL,
	product_id integer NOT NULL,
	CONSTRAINT circuit_board_pkey PRIMARY KEY (circuit_board_id),
	   CONSTRAINT  product_fkey
	      FOREIGN KEY (product_id)
	      REFERENCES public.products(product_id)
);

CREATE SEQUENCE public.element_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.elements
(
	element_id integer NOT NULL DEFAULT nextval('element_id_seq'),
	element_name varchar NOT NULL,
	element_description varchar NOT NULL,
	circuit_board_id integer NOT NULL,
	CONSTRAINT elements_fkey PRIMARY KEY(element_id)
);


CREATE SEQUENCE public.component_type_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.component_types
(
	component_type_id integer NOT NULL DEFAULT nextval('component_type_id_seq'),
	component_type_name varchar NOT NULL,
	CONSTRAINT component_types_pkey PRIMARY KEY(component_type_id)
);

CREATE SEQUENCE public.component_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.components
(
	component_id integer NOT NULL DEFAULT nextval('component_id_seq'),
	component_type_id integer NOT NULL,
	component_name varchar NOT NULL,
	component_description varchar NOT NULL,
	CONSTRAINT components_pkey PRIMARY KEY(component_id),
	  CONSTRAINT components_type_fkey
	    FOREIGN KEY(component_type_id)
	    REFERENCES  public.component_types(component_type_id)
);

CREATE SEQUENCE public.element_component_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.elements_components
(
	element_component_id integer NOT NULL DEFAULT nextval('element_component_id_seq'),
	element_id integer NOT NULL,
	component_id integer NOT NULL
);
