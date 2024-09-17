<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="module" src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js"></script>
<style>
        *{
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: sans-serif;
        }
        body{
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background: url(abcd.jpg) no-repeat;
            background-size: cover;
            background-position: center;
        }
        .wrapper{
            width: 420px;
            background: #105254;
            border: 2px solid rgba(255, 255, 255, .2);
            color: #fff;
            border-radius: 12px;
            padding: 30px 40px;
        }
        .wrapper h1{
            font-size: 36px;
            text-align: center;
        }
        .wrapper .input-box{
            position: relative;
            width: 100%;
            height: 50px;
            margin: 30px 0;
        }
        .input-box input{
            width: 100%;
            height: 100%;
            background: transparent;
            border: none;
            outline: none;
            border: 2px solid rgba(255, 255, 255, .2);
            border-radius: 40px;
            font-size: 16px;
            color: #fff;
            padding: 20px 45px 20px 20px;
        }
        .input-box input::placeholder{
            color: #fff;
        }
        .input-box .i{
            position: absolute;
            right: 20px;
            top: 30%;
            transform: translate(-50%);
            font-size: 20px;
        }
        .wrapper .btn{
            width: 100%;
            height: 45px;
            background: #fff;
            border: none;
            outline: none;
            border-radius: 40px;
            box-shadow: 0 0 10px rgba(0, 0, 0, .1);
            cursor: pointer;
            font-size: 16px;
            color: #333;
            font-weight: 600;
        }
          </style>
</head>
<body>
 <div class="wrapper">
        <form action="login">
            <h1>Login</h1>
            <div class="input-box">
                <input type="text" placeholder="username" name="username" required>
                <h3 class="i"><ion-icon name="person-outline"></ion-icon></h3>
            </div>
            <div class="input-box">
                <input type="password" placeholder="password" name="password" required>
                <h3 class="i"><ion-icon name="lock-open-outline"></ion-icon></h3>
            </div>
            <button type="submit" class="btn">Login</button>
        </form>
    </div>
</body>
</html>