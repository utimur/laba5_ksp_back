<#macro input>
    <div id="laptop_div" style="margin-left: 10px">
        <h2>Введите данные о телефоне</h2>
        <form method="post" action="/laptop">
            <p><input type="text" name="maker"   placeholder="Производитель"></p>
            <p><input type="text" name="model"  placeholder="Модель"></p>
            <p><input type="number" name="capacity" placeholder="Диагональ экрана"></p>
            <p><button type="submit" id="add">Добавить</button></p>
        </form>
    </div>
</#macro>