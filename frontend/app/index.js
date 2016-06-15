import "bootstrap/dist/css/bootstrap.css";
import angular from "angular";
import uirouter from "angular-ui-router";
import routing from "./app.config";

if (ON_TEST) {
  require('angular-mocks/angular-mocks');
}
const ngModule = angular.module('app', [uirouter]).config(routing);

require('./components/common')(ngModule);
require('./components/kcd')(ngModule);
require('./features/main')(ngModule);
require('./features/home')(ngModule);
