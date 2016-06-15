export default ngModule => {
  describe('Controller: Home', function () {
    let $controller;
    beforeEach(window.module(ngModule.name));

    beforeEach(angular.mock.inject(function (_$controller_) {
      $controller = _$controller_;
    }));

    it('name is initialized to World', function () {
      let ctrl = $controller('HomeController');
      expect(ctrl.name).to.equal('World');
    });
  });
}