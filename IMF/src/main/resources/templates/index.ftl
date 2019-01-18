<!DOCTYPE html>
 
<html lang="en" ng-app="crudApp">
    <head>
        <title>${title}</title>
        <link href="css/bootstrap.css" rel="stylesheet"/>
        <link href="css/app.css" rel="stylesheet"/>
    </head>
    <body>
        <div ui-view></div>
     ${message}
     
     <div class="form">
    <form action="someotherpage" method="post" onsubmit="true">
      <table>
        <tr>
          <td>Enter Your name</td>
          <td><input id="name" name="name"></td>
          <td><input type="submit" value="Submit"></td>
          <td><a href="linkpage">Link Page</a>
        </tr>
      </table>
    </form>
  </div>
    </body>
</html>