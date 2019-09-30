<html>
<head>
	<style type="text/css">
table {
	width: 600px;
	height: 400px;
	border-style: double;
	border-color: black;
	margin: auto;
}
</style>
</head>
<body>

	<form action="" method="post">
		<hr>
		<center>

			<table cellspacing="15px" id="table">
			<tr>
				<th>Enter Firm Name</th>
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
					<th>Enter Vehicle type</th>
					<td><input type="text"></td>
				</tr>

				<tr>
					<th>Set Password</th>
					<td><input type="password"></td>
				</tr>
	<tr>
					<th>*Upload Document(PAN)</th>
					<td><input type="file" id="file1" value="upload"></td>
				</tr>
				
				<tr>
					<th>*Upload Document(Aadhar card)</th>
					<td><input type="file" id="file2" value="upload"></td>
				</tr>

				<tr>
					<th>*Upload Document(GST-reg)</th>
					<td><input type="file" id="file3" value="upload"></td>
				</tr>


				<tr>
					<th colspan="2"><input type="submit" value="Submit"></th>
				</tr>
			</table>

		</center>

	</form>
</body>
</html>