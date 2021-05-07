CREATE TABLE address
(
  id UUID PRIMARY KEY,
  postal_code VARCHAR NOT NULL,
  country VARCHAR NOT NULL,
  city VARCHAR NOT NULL,
  address_line1 VARCHAR NOT NULL,
  address_line2 VARCHAR NOT NULL
);
