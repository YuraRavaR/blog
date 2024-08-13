CREATE TABLE IF NOT EXISTS posts (
                                     id SERIAL PRIMARY KEY,
                                     title VARCHAR(255) UNIQUE NOT NULL,
                                     anons TEXT,
                                     full_text TEXT,
                                     views INT DEFAULT 0
);

INSERT INTO posts (title, anons, full_text, views)
VALUES ('Initial Post', 'This is an initial post', 'This is the full text of the initial post', 0)
ON CONFLICT (title) DO NOTHING;