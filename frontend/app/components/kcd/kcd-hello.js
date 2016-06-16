export default ngModule => {
  if (ON_TEST) {
    require('./kcd-hello.test')(ngModule);
  }

  ngModule.directive('kcdHello', ($log) => {
    require('./kcd-hello.styl');
    return {
      restrict: 'E',
      scope: {},
      template: require('./kcd-hello.html'),
      controllerAs: 'vm',
      controller: function () {
        const vm = this;
        vm.greeting = "Hello Webpack";
      },
      link: (scope, element) => {
        element.fadeOut(1000, "linear", () =>{});
      }
    }
  })
};