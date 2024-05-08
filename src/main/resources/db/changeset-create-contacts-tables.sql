-- Drops

DROP TABLE IF EXISTS public.emails;
DROP SEQUENCE IF EXISTS public.email_id_seq;

DROP TABLE IF EXISTS public.persons CASCADE;
DROP SEQUENCE IF EXISTS public.person_id_seq;

DROP TABLE IF EXISTS public.organizations;
DROP SEQUENCE IF EXISTS public.organization_id_seq;

DROP TABLE IF EXISTS public.phone_numbers;
DROP SEQUENCE IF EXISTS public.phone_number_id_seq;


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
	organization_id integer NOT NULL,
	CONSTRAINT persons_pkey PRIMARY KEY (person_id),
	  CONSTRAINT person_organization_fkey
	    FOREIGN KEY (organization_id)
	    REFERENCES public.organizations(organization_id)
);

CREATE SEQUENCE public.email_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.emails
(
	email_id integer NOT NULL DEFAULT nextval('email_id_seq'),
	email varchar NOT NULL,
	person_id integer NOT NULL,
	CONSTRAINT emails_pkey PRIMARY KEY(email_id),
	  CONSTRAINT email_person_fkey
	  FOREIGN KEY (person_id)
	  REFERENCES public.persons(person_id)
);

CREATE SEQUENCE public.phone_number_id_seq
    INCREMENT 1
	START WITH 1;
CREATE TABLE IF NOT EXISTS public.phone_numbers
(
	phone_number_id integer NOT NULL DEFAULT nextval('phone_number_id_seq'),
	phone_number varchar NOT NULL,
	person_id integer NOT NULL,
	CONSTRAINT phone_numbers_pkey PRIMARY KEY(phone_number_id),
	  CONSTRAINT phone_person_fkey
	  FOREIGN KEY (person_id)
	  REFERENCES public.persons(person_id)
);
