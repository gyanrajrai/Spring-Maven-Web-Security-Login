<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../../shared/header.jsp" %>
<h1>Customer Information</h1>
  <div>
      <a href="${SITE_URL}/admin/customer/add"><h1 class="glyphicon-pencil"> <u><i>Add Customer</i></u></h1> </a>
        </div>
<c:if test="${param.action!=null}">
    <c:if test="${param.success!=null}">
        <div class="alert alert-success" role="alert">
           Data Update Successfully
        </div>

    </c:if>
</c:if>
        <c:if test="${param.pass!=null}">
    <c:if test="${param.got!=null}">
        <div class="alert alert-success" role="alert">
            <h1>Data Insert Successfully</h1>
        </div>

    </c:if>
</c:if>
<table class="table table-borderd table-hover table-striped">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Contact No</th>
        <th>Added Date</th>
        <th>Modified Date</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    <c:forEach var="cus" items="${customers}">
        <tr>
            <td>${cus.id}</td>
            <td>${cus.firstName}  ${cus.lastName}</td>
            <td>${cus.email}</td>
            <td>${cus.contactNo}</td>
            <td>${cus.addedDate}</td>
            <td>${cus.modifiedDate}</td>
            <td>${cus.status}</td>
            <td>
                <a href="${SITE_URL}/admin/customer/edit/${cus.id}" class="btn btn-xs tbn-success">
                    <span class="glyphicon glyphicon-pencil"/>
                </a>
                <a href="${SITE_URL}/admin/customer/delete/${cus.id}" class="btn btn-xs tbn-danger" onclick="return confirm('Are You Sure to Delete ?')">
                    <span class="glyphicon glyphicon-trash"/>
                </a>
            </td>
        </tr>
    </c:forEach>


</table>
<%@include file="../../shared/footer.jsp" %>
