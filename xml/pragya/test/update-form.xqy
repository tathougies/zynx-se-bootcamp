xquery version "1.0-ml";
(: update-form.xqy :)
declare namespace bk="http://www.marklogic.com/ns/gs-books";
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Change Publisher</title>
</head>
<body>
{
let $book := doc("books.xml")/bk:books/bk:book[1]
return
<form action="update-write.xqy">
<input type="hidden" name="bookid" value="{ $book/@bookid }"/>
<p><b>
Change publisher for book <i>{ $book/bk:title/text() }</i>:
</b></p>
<input type="text" name="publisher"
value="{ $book/bk:publisher/text() }"/>
<input type="submit" value="Update publisher"/>
</form>
}
</body>
</html>