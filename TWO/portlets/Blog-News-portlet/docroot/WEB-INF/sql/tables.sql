create table News_Blogs (
	News_Blogs_Id LONG not null primary key,
	title VARCHAR(75) null,
	body VARCHAR(75) null,
	Publish_Date DATE null,
	Expiration_Date DATE null,
	author VARCHAR(75) null,
	visible VARCHAR(75) null
);