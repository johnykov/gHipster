homeRoutes.$inject = ['$stateProvider'];

export default function homeRoutes($stateProvider) {
  $stateProvider.state('home', {
      url: '/home', //TODO: mod rewrite server side, http://stackoverflow.com/questions/16569841/angularjs-html5-mode-reloading-the-page-gives-wrong-get-request
      template: require('./home.html'),
      controller: 'HomeController',
      controllerAs: 'home'
    });
}