xquery version "1.0-ml";
(: update-write.xqy :)
declare namespace bk="http://www.marklogic.com/ns/gs-books";
declare function local:updatePublisher()
{
if (doc("books.xml")) then
let $bookid := xdmp:get-request-field("bookid")
let $publisher := xdmp:get-request-field("publisher")
let $b := doc("books.xml")/bk:books/bk:book[@bookid = $bookid]
return
if ($b) then
(
xdmp:node-replace($b/bk:publisher,
<bk:publisher>{ $publisher }</bk:publisher>)
,
xdmp:redirect-response("dump.xqy")
)
else
<span>Could not locate book with bookid { $bookid }.</span>
else
<span>Unable to access parent XML document.</span>
};
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Update In Process</title>
</head>
<body>
Attempting to complete update and redirect browser to detail page.
<p>
If you are seeing this page, either the redirect has failed
or the update has failed.  The update has failed if there is
a reason provided below:
<br/>
{ local:updatePublisher() }
</p>
</body>