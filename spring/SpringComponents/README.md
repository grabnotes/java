$mvn clean package
$java -jar target/SpringBootDemo-1.0-SNAPSHOT.jar

Using PostMan or other such tools you can execute the following URL's, 
1. http://localhost:8080/book/getAuthor?title=The%20Complete%20Reference
2. http://localhost:8080/book/category/education
	Params: "title" : "The Complete Reference"
3. http://localhost:8080/book/insert
	Params: "title" : "The Complete Reference"
			"author" : "Herbert Schildt"
			"genre" : "education"
4. http://localhost:8080/book/inventory
5. http://localhost:8080/book/search
	Body:
	{
		"title" : "Adventures of Tom Sawyer",
		"author" : "Mark Twain",
		"genre" : "fiction"
	}