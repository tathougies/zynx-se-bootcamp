xquery version "1.0-ml";
(: load.xqy :)
xdmp:document-insert("books.xml",
<books xmlns="http://www.marklogic.com/ns/gs-books">
<book bookid="1">
<title>A Quick Path to an Application</title>
<author>
<last>Smith</last>
<first>Jim</first>
</author>
<publisher>Scribblers Press</publisher>
<isbn>1494-3930392-3</isbn>
<abstract>This book describes in detail the power of how to use 
XQuery to build powerful web applications that are built on the 
MarkLogic Server platform.</abstract>
</book>
</books>
),
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Database loaded</title>
</head>
<body>
<b>Source XML Loaded</b>
<p>The source XML has been successfully loaded into the database</p>
</body>
</html>