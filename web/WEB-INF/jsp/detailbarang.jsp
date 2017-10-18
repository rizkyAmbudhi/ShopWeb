<%-- 
    Document   : detailbarang
    Created on : Oct 17, 2017, 3:26:51 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Barang</title>
    </head>
    <body>
        <table class="table">
            <thead class="table-inverse">
                <tr>
                    <th> NAMA </th>
                    <th> JENIS </th>
                    <th> HARGA </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>${prddet.namabarang}</td>
                    <td>${prddet.jenisbarang}</td>
                    <td>${prddet.hargabarang}</td>
                </tr>
            </tbody>
        </table>
<!--        <h1>${prddet.namabarang}</h1>
        <p>Jenis : ${prddet.jenisbarang}</p>
        <p>Harga : ${prddet.hargabarang}</p>-->
        <a href="addToCart"><button>Tambah</button></a>
    </body>
</html>
