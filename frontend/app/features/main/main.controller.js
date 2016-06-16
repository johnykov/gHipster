export default class MainController {
  static get $inject(){ return ["$http"]; }
  constructor($http) {
    this.name = 'World';
    $http.get('api/greet', {transformResponse: (d, h) => d})
      .success(data => {
        console.log(data);
        return data;
      });
  }

  changeName() {
    this.name = 'angular-tips';
  }

}