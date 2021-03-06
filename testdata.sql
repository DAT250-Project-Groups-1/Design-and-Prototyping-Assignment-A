insert into users (id, name, mail, isAdmin) values
(1, 'Andreas Garvik', 'test@test.com', TRUE),
(2, 'Martin Kydland', 'test@test.com', TRUE),
(3, 'Daniel Berge', 'test@test.com', TRUE),
(4, 'Marit Lund', 'test@test.com', TRUE),
(5, 'Lars Michael Kristiansen', 'test@test.com', FALSE);

insert into polls (id, code, countno, countyes, fromdate, todate, question, user_id, isPrivate) values
(1,'lat hund', 0, 0, '2020-09-12', '2020-10-12', 'Is this a test?', 1, FALSE),
(2,'kul katt', 0, 0, '2020-09-12', '2020-11-12', 'Yes or no?', 2, FALSE),
(3,'morsom marsvin', 0, 0, '2020-09-12', '2020-12-12', 'Is Bergen a nice city?', 3, FALSE),
(4,'sterk hest', 0, 0, '2020-09-12', '2020-10-10', 'Is it rainins?', 4, FALSE),
(5,'svak due', 0, 0, '2020-09-12', '2020-10-01', 'Is 42 the answer?', 1, FALSE);

insert into votes (id, value, poll_id, user_id) values
(1,TRUE, 1, 1),
(2,TRUE, 1, 2),
(3,FALSE, 1, 3),
(4,TRUE, 2, 4),
(5,FALSE, 3, 5),
(6,TRUE, 3, 1),
(7,TRUE, 4, 2);