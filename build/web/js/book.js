var MyApp = angular.module("myApp", []);

MyApp.controller("RestCtrl", function ($scope, $http) {

    $scope.title = "BanglaBook";
    console.log("aaaaa");
    var response = $http.get('/banglaboi/rest/booklist');
    response.success(function (data) {
        angular.forEach(data, function (element) {
            console.log("Book name: " + element.name);
        });
        $scope.books = data;
        console.log("Total book: " + data.length)
    })

    var response = $http.get('/banglaboi/rest/categories');
    response.success(function (data) {
        $scope.categories = data;
        console.log("Category items: " + data.length)
    })

    $scope.getbook = function (id) {
        var response = $http.get('/banglaboi/rest/bookdetails/' + id);
        response.success(function (data) {
            $scope.book = data;
            console.log("getbook data: " + angular.toJson(data, false));
        })
    };

    $scope.clearForm = function () {
        $scope.book = {          
            name: '',
            writer: '',
            category: '',
            size: '',
            length: '',
            fileType: '',
            description: '',
            mediaFireLink: '',
            googleDrivrLink: '',
            imgLink: ''          
        };
    };

    $scope.addBook = function () {
        $scope.jsonObj = angular.toJson($scope.book, false);
        console.log("Inserted data: " + $scope.jsonObj);
        var response = $http.post('/banglaboi/rest/add', $scope.jsonObj);
        response.success(function (data) {
            $scope.clearForm();
            alert("Successfully Saved");
        });
    };
});
