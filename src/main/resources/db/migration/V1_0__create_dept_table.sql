-- Table: organisation.department

-- DROP TABLE organisation.department;

CREATE TABLE department
(
    dept text NOT NULL,
    city text NOT NULL,
    CONSTRAINT department_pkey PRIMARY KEY (dept)
)