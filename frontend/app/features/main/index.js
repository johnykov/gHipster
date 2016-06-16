import MainController from "./main.controller";

export default ngModule => {
  ngModule.config(require('./main.routes'))
    .controller('MainController', MainController);
};