<%@ page import="java.util.ArrayList" %>
<%@ page import="com.profile.ProfileBean" %>


<!DOCTYPE html>
<html>


<head>

<title>All Profiles</title>

<link rel="stylesheet" href="css/style.css">

</head>



<body>



<div class="table-card">



<h1>
Student Profiles
</h1>




<table>


<tr>

<th>
Student ID
</th>


<th>
Name
</th>


<th>
Program
</th>


<th>
Email
</th>


<th>
Hobbies
</th>


</tr>





<%


ArrayList<ProfileBean> list =

(ArrayList<ProfileBean>)
request.getAttribute("profiles");



if(list != null){



for(ProfileBean p : list){



%>



<tr>


<td>
<%=p.getStudentId()%>
</td>


<td>
<%=p.getName()%>
</td>


<td>
<%=p.getProgram()%>
</td>


<td>
<%=p.getEmail()%>
</td>


<td>
<%=p.getHobbies()%>
</td>


</tr>



<%


}

}


%>





</table>



<a href="index.html">
Back to Profile Form
</a>



</div>



</body>


</html>