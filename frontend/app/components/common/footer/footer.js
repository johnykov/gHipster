export default ngModule => {
  ngModule.directive('footerDir', () => {
    require('./footer.css');
    return {
      restrict: 'E',
      scope: {},
      template: require('./footer.html')
    }
  })
};