<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Đăng nhập</title>
<style>
   *{
    box-sizing: border-box;
    padding: 0;
    margin: 0;
   }
  body {
    font-family: Arial, sans-serif;
    background-color: #f2f2f2;
    margin: 0;
    padding: 0;
    display: flex;
    align-items: center;
    justify-content: center;
    min-height: 100vh;
  }

  h2{
    margin-bottom: 20px;
    text-align: center;
  }
  .login-container {
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);
    width: 60%;
  }
  .login-container label, .login-container input {
    display: block;
    margin-bottom: 10px;
  }
  .login-container input {
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 3px;
    margin-bottom: 24px
  }
  .login-container button {
    background-color: #007bff;
    color: #fff;
    border: none;
    padding: 10px;
    border-radius: 3px;
    width: 100%;
    cursor: pointer;
  }
  a {
    color: dodgerblue;
    font-size: 14px;
  }
</style>
</head>
<body>
<div class="login-container">
  <h2>Bạn đã đăng nhập thất bại</h2>
  <p>Hãy kiểm tra lại tên tài khoản và mật khẩu!</p>
  <a href="/index.jsp">Quay về trang chủ!</a>
</div>
</body>
</html>
