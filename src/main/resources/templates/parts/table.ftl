<#macro table>
    <div id="table_div">
        <table border="1px" id="table">
            <tr>
                <td> Производитель </td>
                <td> Модель </td>
                <td> Диагональ экрана</td>
            </tr>
            <#list laptops as lap>
                <tr>
                    <td>${lap.maker}</td>
                    <td>${lap.model}</td>
                    <td>${lap.capacity}</td>
                </tr>
            <#else >
                No laptops
            </#list>
        </table>
    </div>
</#macro>