create table if not exists online_library_rest.user(
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    profile_picture_url varchar,
    name varchar(32) not null,
    email varchar(64),
    role varchar(32) not null
 );

create table if not exists online_library_rest.book(
    id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    book_img  varchar,
    name varchar(32) not null,
    author varchar(120),
    rating int DEFAULT 0,
    description varchar not null,
    genre varchar,
    age_restriction varchar,
    fullText text
);