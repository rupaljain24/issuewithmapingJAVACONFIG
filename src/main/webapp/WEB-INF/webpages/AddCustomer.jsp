
<html>
<head>
<style type="text/css">
table{
	width: 600px;
	height: 350px;
	border-style: double;
	border-color: black;
	margin: auto;
}
</style>

</head>
<body>

<h2>Customer</h2> 
<hr>
<form action="AddCustomers" method="POST">
	<center>

			<table cellspacing="15px" id="table">
			<tr>
				<th>Enter Full Name</th>
				<td><input type="text"></td>
			</tr>

				<tr>
					<th>Enter Contact no.</th>
					<td><input type="text"></td>
				</tr>

				<tr>
					<th>Enter Email</th>
					<td><input type="text" ></td>
				</tr>

				<tr>
					<th>Enter Address</th>
					<td><input type="text"></td>
				</tr>

				<tr>
					<th>Enter city</th>
					<td><select>
							<option>Indore</option>
							<option>Bhopal</option>
							<option>Ujjain</option>
							<option>Pune</option>
					</select></td>
				</tr>

				<tr>
					<th>Set Password</th>
					<td><input type="password"></td>
				</tr>
	<tr>
				

				<tr>
					<th colspan="2"><input type="submit" value="Submit"></th>
				</tr>
			</table>

		</center>				
		</form>

<hr>

</body>
</html>