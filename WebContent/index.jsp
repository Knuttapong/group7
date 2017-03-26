<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<head>
        <title>กรอกหมายเลขทะเบียนรถ</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    </head>
    <body>
        <div class="container" align="center">
            <div class="row"><h1>กรอกหมายเลขทะเบียนรถ
            </h1>
            </div>
            <from action="carController">
            
                <div class="row">
                    <br/>
                    <div class="col-md-2 col-md-offset-5">
                <div class="form-group">
                    <input type="text" class="form-control" id="license" name="license">
                    <br/>
                    <button type="button" class="btn btn-default btn-lg btn-block"><b>ค้นหา</b></button>
                      
                </div>
          
                </div>
            </from>
        </div>
                
        </div>
        
        
    </body>

</body>
</html>