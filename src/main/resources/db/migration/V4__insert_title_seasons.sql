-- Инициализация данных для таблицы 'user'
INSERT INTO online_library_rest.user (profile_picture_url, name, email, role)
VALUES
    ('url1', 'User1', 'user1@example.com', 'Role1'),
    ('url2', 'User2', 'user2@example.com', 'Role2'),
    ('url3', 'User3', 'user3@example.com', 'Role1'),
    ('url4', 'User4', 'user4@example.com', 'Role2'),
    ('url5', 'User5', 'user5@example.com', 'Role1'),
    ('url6', 'User6', 'user6@example.com', 'Role2'),
    ('url7', 'User7', 'user7@example.com', 'Role1'),
    ('url8', 'User8', 'user8@example.com', 'Role2'),
    ('url9', 'User9', 'user9@example.com', 'Role1'),
    ('url10', 'User10', 'user10@example.com', 'Role2');

-- Инициализация данных для таблицы 'book'
INSERT INTO online_library_rest.book (book_img, name, author, rating, description, genre, age_restriction, fullText)
VALUES
    ('img1', 'Book1', 'Author1', 4, 'Description1', 'Genre1', '18+', 'Full text of Book1'),
    ('img2', 'Book2', 'Author2', 3, 'Description2', 'Genre2', '16+', 'Full text of Book2'),
    ('img3', 'Book3', 'Author3', 5, 'Description3', 'Genre3', '18+', 'Full text of Book3'),
    ('img4', 'Book4', 'Author4', 4, 'Description4', 'Genre4', '16+', 'Full text of Book4'),
    ('img5', 'Book5', 'Author5', 5, 'Description5', 'Genre5', '18+', 'Full text of Book5'),
    ('img6', 'Book6', 'Author6', 3, 'Description6', 'Genre6', '16+', 'Full text of Book6'),
    ('img7', 'Book7', 'Author7', 4, 'Description7', 'Genre7', '18+', 'Full text of Book7'),
    ('img8', 'Book8', 'Author8', 5, 'Description8', 'Genre8', '16+', 'Full text of Book8'),
    ('img9', 'Book9', 'Author9', 3, 'Description9', 'Genre9', '18+', 'Full text of Book9'),
    ('img10', 'Book10', 'Author10', 4, 'Description10', 'Genre10', '16+', 'Full text of Book10');
