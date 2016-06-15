import "./home.css";
import homeRouting from "./home.routes";
import HomeController from "./home.controller";

export default ngModule => {
  if (ON_TEST) {
    require('./home.controller.test')(ngModule);
  }
  ngModule.config(homeRouting)
    .controller('HomeController', HomeController);
};