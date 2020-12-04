<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Product</title>
    <link href="../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
    <script src="../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="../webjars/jquery/3.0.0/jquery.min.js"></script>
</head>
<body>
<div class="container">
    <div class="card-deck mt-2">
        <div class="card">
            <div class="card-header">
                <span class="font-weight-bold">Product List</span>
            </div>
            <div class="card-body">
                <table class="table table-striped" cellspacing="0" width="100%">
                    <thead>
                    <tr>
                        <th scope="row">SKU</th>
                        <th scope="row">Name</th>
                        <th scope="row">Product_URL</th>
                        <th scope="row">Thumbnail_URL</th>
                        <th scope="row">Search_Keywords</th>
                        <th scope="row">Description</th>
                        <th scope="row">Category</th>
                        <th scope="row">Category_ID</th>
                        <th scope="row">Brand</th>
                        <th scope="row">Child_SKU</th>
                        <th scope="row">Child_Price</th>
                        <th scope="row">Color</th>
                        <th scope="row">Color_Family</th>
                        <th scope="row">Color_Swatches</th>
                        <th scope="row">Size</th>
                        <th scope="row">Shoe_Size</th>
                        <th scope="row">Pants_Size</th>
                        <th scope="row">Occassion</th>
                        <th scope="row">Season</th>
                        <th scope="row">Badges</th>
                        <th scope="row">Rating_Avg</th>
                        <th scope="row">Rating_Count</th>
                        <th scope="row">Inventory_Count</th>





                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${productList }" var="product" >
                        <tr>
                            <td>${product.SKU }</td>
                            <td>${product.Name }</td>
                            <td>${product.Product_URL }</td>
                            <td>${product.Thumbnail_URL }</td>
                            <td>${product.Search_Keywords}</td>
                            <td>${product.Description }</td>
                            <td>${product.Category }</td>
                            <td>${product.Category_ID }</td>
                            <td>${product.Brand }</td>
                            <td>${product.Child_SKU }</td>
                            <td>${product.Child_Price }</td>
                            <td>${product.Color }</td>
                            <td>${product.Color_Family}</td>
                            <td>${product.Color_Swatches }</td>
                            <td>${product.Size }</td>
                            <td>${product.Shoe_Size }</td>
                            <td>${product.Pants_Size }</td>
                            <td>${product.Occassion }</td>
                            <td>${product.Season }</td>
                            <td>${product.Badges }</td>
                            <td>${product.Rating_Avg }</td>
                            <td>${product.Rating_Count }</td>
                            <td>${product.Inventory_Count }</td>

                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>