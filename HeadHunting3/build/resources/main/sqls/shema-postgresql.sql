DROP SCHEMA IF EXISTS head_hunting CASCADE;

CREATE SCHEMA IF NOT EXISTS head_hunting;

CREATE TABLE IF NOT EXISTS head_hunting.personal_info
(
  id bigserial NOT NULL,
  first_name char(50) NOT NULL,
  last_name char(50) NOT NULL,
  sex char(1) NOT NULL,
  date_of_birth date NOT NULL,
  education character varying(255) NOT NULL,
  photo character varying(255) NOT NULL,
  interests character varying(255) NOT NULL,
  CONSTRAINT user_id PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS head_hunting.skill
(
  id bigserial NOT NULL,
  skill character varying(255) NOT NULL,
  CONSTRAINT skill_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS head_hunting.skill_experience
(
  personal_info_id bigserial NOT NULL,
  skill_id bigserial NOT NULL,
  experience integer NOT NULL,
  rating integer NOT NULL,
  CONSTRAINT personal_info_fkey FOREIGN KEY (personal_info_id) REFERENCES head_hunting.personal_info(id)
    ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT skill_info FOREIGN KEY (skill_id) REFERENCES head_hunting.skill(id)
    ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS head_hunting.company
(
  id bigserial NOT NULL,
  company character varying(255) NOT NULL,
  CONSTRAINT company_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS head_hunting.experience
(
  personal_info_id bigserial NOT NULL,
  company_id bigserial NOT NULL,
  start_date date NOT NULL,
  finish_date date NOT NULL,
  CONSTRAINT personal_info_fkey FOREIGN KEY (personal_info_id) REFERENCES head_hunting.personal_info(id)
    ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT company_info_key FOREIGN KEY (company_id) REFERENCES head_hunting.company(id)
    ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE IF NOT EXISTS head_hunting.language
(
  id bigserial NOT NULL,
  language_name char(50) NOT NULL,
  CONSTRAINT language_pkey PRIMARY KEY (id)
);



CREATE TABLE IF NOT EXISTS head_hunting.language_rating
(
  personal_info_id bigserial NOT NULL,
  lang_id bigserial NOT NULL,
  rating integer NOT NULL,
  CONSTRAINT personal_info_fkey FOREIGN KEY (personal_info_id) REFERENCES head_hunting.personal_info(id)
    ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT lang_id_fkey FOREIGN KEY (lang_id) REFERENCES head_hunting.language(id)
    ON DELETE NO ACTION ON UPDATE NO ACTION
);

