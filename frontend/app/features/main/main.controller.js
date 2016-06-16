export default class MainController {
  constructor($http) {
    this.name = 'World';
    $http.get('api/greet').then(resp => {
      console.log(resp);
    });
  }

  changeName() {
    this.name = 'angular-tips';
  }
}