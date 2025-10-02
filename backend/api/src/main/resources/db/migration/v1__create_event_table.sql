CREATE EXTENSION IF NOT EXISTS pgcrypto;

CREATE TABLE IF NOT EXISTS event (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    title VARCHAR(100) NOT NULL,
    description VARCHAR(250) NOT NULL,
    img_url VARCHAR(255) NOT NULL,
    event_url VARCHAR(255) NOT NULL,
    event_date TIMESTAMP NOT NULL,
    remote BOOLEAN NOT NULL


 CREATE TABLE cupon(

    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    code VARCHAR(50) NOT NULL,
    discount INTEGER NOT NULL,
    valid TIMESTAMP NOT NULL,
    event_id UUID,
    FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADED

 )

 CREATE TABLE address(
  id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
  city VARCHAR(100) NOT NULL,
  uf VARCHAR(100) NOT NULL,
  event_id UUID;
  FOREIGN KEY(event_id) REFERENCES event(id) ON DELETE CASCADE
 );


