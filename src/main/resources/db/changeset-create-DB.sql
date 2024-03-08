-- Drops

DROP TABLE IF EXISTS public.persons;
DROP SEQUENCE IF EXISTS public.person_id_seq;

DROP TABLE IF EXISTS public.organizations CASCADE;
DROP SEQUENCE IF EXISTS public.organization_id_seq;

--Creates

CREATE SEQUENCE public.organization_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.organizations
(
	organization_id integer NOT NULL DEFAULT nextval('organization_id_seq'),
	organization_name varchar NOT NULL,
	city  varchar NOT NULL,
	CONSTRAINT organizations_pkey PRIMARY KEY(organization_id)
);


CREATE SEQUENCE public.person_id_seq
    INCREMENT 1
    START WITH 1;
CREATE TABLE IF NOT EXISTS public.persons
(
	person_id integer NOT NULL DEFAULT nextval('person_id_seq'),
	last_name varchar NOT NULL,
	first_name varchar NOT NULL,
	patronymic varchar,
	phone varchar,
	email varchar,
	organization_id integer NOT NULL,
	CONSTRAINT persons_pkey PRIMARY KEY (person_id),
	  CONSTRAINT person_organization_fkey
	    FOREIGN KEY (organization_id)
	    REFERENCES public.organizations(organization_id)
	    ON DELETE CASCADE
);