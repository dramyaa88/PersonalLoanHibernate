
<html>
<head>
<style type="text/css">
body{
  display: table;
  width: 100%;
  background: #dedede;
  text-align: center;
}
*{ 
  -webkit-box-sizing: border-box; /* Safari/Chrome, other WebKit */
  -moz-box-sizing: border-box;    /* Firefox, other Gecko */
  box-sizing: border-box;         /* Opera/IE 8+ */
}

.aa_h2{
  font:100 5rem/1 Roboto;
  text-transform: uppercase;
}
table{
   background: #fff;
}
table,thead,tbody,tfoot,tr, td,th{
  text-align: center;
  margin: auto;
  border:1px solid #dedede;
  padding: 1rem;
  width: 50%;
}
.table    { display: table; width: 50%; }
.tr       { display: table-row;  }
.thead    { display: table-header-group }
.tbody    { display: table-row-group }
.tfoot    { display: table-footer-group }
.col      { display: table-column }
.colgroup { display: table-column-group }
.td, .th   { display: table-cell; width: 50%; }
.caption  { display: table-caption }

.table,
.thead,
.tbody,
.tfoot,
.tr,
.td,
.th{
  text-align: center;
  margin: auto;
  padding: 1rem;
}
.table{
  background: #fff;
  margin: auto;
  border:none;
  padding: 0;
  margin-bottom: 5rem;
}

.th{
  font-weight: 700;
  border:1px solid #dedede;
  &:nth-child(odd){
    border-right:none;
  }
}
.td{
  font-weight: 300;
  border:1px solid #dedede;
  border-top:none;
  &:nth-child(odd){
    border-right:none;
  }
}

.aa_htmlTable{
  background: tomato;
  padding: 5rem;
  display: table;
  width: 100%;
  height: 100vh;
  vertical-align: middle;
}
.aa_css{
  background: skyblue;
  padding: 5rem;
  display: table;
  width: 100%;
  height: 100vh;
  vertical-align: middle;
}

.aa_ahmadawais{
  display: table;
  width: 100%;
  font: 100 1.2rem/2 Roboto;
  margin: 5rem auto;
}


</style>
</head>
<body>

<form method="post" action="LoginServlet">
<h2>Login Page</h2>
Please provide your credential to use this website
<br>
<br>
<table border="1"> 
			<tr>
                <th>User Name: </th>
                <td>
                 <input type="text" name="uname" size="45" /> 
                </td>
            </tr>
            <tr>
                <th>Password: </th>
                <td>
                 <input type="password" name="pass" size="45" />
                </td>
            </tr>
            <tr>
             <td colspan="2" align="center">
              <input type="submit" value="Login" />
             </td>
            </tr>
</table>
</form>
<br><br>
<a href = "newuser.jsp">New User - Click here</a>

</body>
</html>