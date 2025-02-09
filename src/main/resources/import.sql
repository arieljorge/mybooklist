INSERT INTO TB_BOOKLIST (NAME) VALUES ('ISEKAI');
INSERT INTO TB_BOOKLIST (NAME) VALUES ('SHOUNEN');

INSERT INTO TB_BOOK (TITLE, AUTHOR, GENRES, SCORE, STATUS, RELEASE_YEAR, IMG_URL, SHORT_DESCRIPTION, LONG_DESCRIPTION) VALUES ('Solo Leveling', 'Chu-Gong', 'Action, Portal fantasy', 0, 0, 2018, 'https://www.presenca.pt/cdn/shop/files/solo_leveling_vol1_4ed_WEB_1024x1024.jpg?v=1703262060', '', '');
INSERT INTO TB_BOOK (TITLE, AUTHOR, GENRES, SCORE, STATUS, RELEASE_YEAR, IMG_URL, SHORT_DESCRIPTION, LONG_DESCRIPTION) VALUES ('The Beginning After the End', '', 'fantasy, isekai', 0, 1, 2018, '', '', '');
INSERT INTO TB_BOOK (TITLE, AUTHOR, GENRES, SCORE, STATUS, RELEASE_YEAR, IMG_URL, SHORT_DESCRIPTION, LONG_DESCRIPTION) VALUES ('Isekai Tensei Soudouki', '', 'Action, Isekai', 0, 0, 0, '', '', '');
INSERT INTO TB_BOOK (TITLE, AUTHOR, GENRES, SCORE, STATUS, RELEASE_YEAR, IMG_URL, SHORT_DESCRIPTION, LONG_DESCRIPTION) VALUES ('Naruto', '', 'Shounen, Ninja, Action', 0, 0, 0, '', '', '');
INSERT INTO TB_BOOK (TITLE, AUTHOR, GENRES, SCORE, STATUS, RELEASE_YEAR, IMG_URL, SHORT_DESCRIPTION, LONG_DESCRIPTION) VALUES ('Dragon Ball Z', 'Akira Toriyama', 'Shounen, Fight, Action', 0, 0, 0, '', '', '');

INSERT INTO TB_BELONGING (BOOK_ID, LIST_ID, POSITION) VALUES (2, 1, 0);
INSERT INTO TB_BELONGING (BOOK_ID, LIST_ID, POSITION) VALUES (3, 1, 1);

INSERT INTO TB_BELONGING (BOOK_ID, LIST_ID, POSITION) VALUES (1, 2, 0);
INSERT INTO TB_BELONGING (BOOK_ID, LIST_ID, POSITION) VALUES (4, 2, 1);
INSERT INTO TB_BELONGING (BOOK_ID, LIST_ID, POSITION) VALUES (5, 2, 2);