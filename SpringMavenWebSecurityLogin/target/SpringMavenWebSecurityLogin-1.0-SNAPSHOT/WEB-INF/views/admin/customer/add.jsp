<%@include file="../../shared/header.jsp" %>
<div>
    <u>
        <b>
            <h1>Add Customer</h1></b></u>

</div>
        <form method="post" action="${SITE_URL}/admin/customer/addcustomer">
            <div>
                <label>First Name</label>
                <input type="text" name="firstName"/>
            </div>
            <div>
                <label>Last Name</label>
                <input type="text" name="lastName"/>
            </div>
            <div>
                <label>Email</label>
                <input type="email" name="email"/>
            </div>
            <div>
                <label>Contact</label>
                <input type="text" name="contactNo"/>
            </div>
            <div>
                <label>Status</label>
                <input type="checkbox" name="status"/>
            </div>
            <input type="hidden" name="${_csrf.parameterName}"value="${_csrf.token}"/>
            <button type="submit"> Save</button>
            
        </form>
<%@include file="../../shared/footer.jsp" %>