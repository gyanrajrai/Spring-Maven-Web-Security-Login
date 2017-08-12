<%@include file="../../shared/header.jsp" %>
<form method="post" action="${SITE_URL}/admin/customer/save">
     <div class="form-group">
        <label>First Name:</label>
        <input type="text" name="firstName"  value="${cus.firstName}" class="form-control" required="required"/>
    </div>
     <div class="form-group">
        <label>Last Name:</label>
        <input type="text" name="lastName" value="${cus.lastName}" class="form-control" required="required"/>
        
    </div>
     <div class="form-group">
        <label>Email:</label>
        <input type="text" name="email"value="${cus.email}" class="form-control" required="required"/>
        
    </div>
     <div class="form-group">
        <label>Contact No:</label>
        <input type="text" name="contactNo"  value="${cus.contactNo}" class="form-control" required="required"/>
        
    </div>
    
     
     <div class="form-group">
        <label>Status</label>
        <label><input type="checkbox" name="status"  <c:if test="${cus.status}">
                      checked="checked"
                </c:if>/>Active
        </label>
     </div>
        <input type="hidden" name="id" value="${cus.id}"/>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <div>
        <button type="submit" class="btn btn-success">Save</button>
        <a href="${SITE_URL}/admin/customer" class="btn tbn-danger">Back</a>
    </div>
    
</form>
        <%@include file="../../shared/footer.jsp" %>