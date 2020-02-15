<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8"/>
    <title>一点课堂</title>
</head>
<body>
${name}
<#if address=="china">
    上海
    <#elseif sex=="boy">
        北京
    <#else>
</#if>
<#list listResult as res>
    ${res}
</#list>
</body>
</html>