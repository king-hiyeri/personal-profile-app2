<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Profile Result</title>

    <style>
        html, body {
            height: 100%;
            margin: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #74ebd5, #ACB6E5);
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .card {
            width: 420px;
            background: rgba(255, 255, 255, 0.25);
            backdrop-filter: blur(12px);
            border-radius: 18px;
            padding: 25px;
            box-shadow: 0 10px 30px rgba(0,0,0,0.2);
            animation: fadeIn 0.6s ease-in-out;
        }

        h1 {
            text-align: center;
            margin-bottom: 20px;
        }

        .row {
            margin: 10px 0;
            padding: 10px;
            background: rgba(255,255,255,0.4);
            border-radius: 10px;
        }

        .label {
            font-weight: bold;
        }

        .intro {
            margin-top: 10px;
            padding: 10px;
            background: rgba(255,255,255,0.5);
            border-radius: 10px;
            min-height: 60px;
        }

        @keyframes fadeIn {
            from { opacity: 0; transform: translateY(10px); }
            to { opacity: 1; transform: translateY(0); }
        }
    </style>

</head>

<body>

<div class="card">

    <h1>Student Profile</h1>

    <div class="row"><span class="label">Name:</span> ${profile.name}</div>
    <div class="row"><span class="label">Student ID:</span> ${profile.studentId}</div>
    <div class="row"><span class="label">Program:</span> ${profile.program}</div>
    <div class="row"><span class="label">Email:</span> ${profile.email}</div>
    <div class="row"><span class="label">Hobbies:</span> ${profile.hobbies}</div>

    <div class="row">
        <span class="label">Intro:</span>
        <div class="intro">${profile.intro}</div>
    </div>

</div>

</body>
</html>