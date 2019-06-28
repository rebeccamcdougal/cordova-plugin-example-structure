var PluginName = {
    yourFunction: function(success, failure, options) {
        alert(JSON.stringify(options))
      cordova.exec(success, failure, "PluginName", "yourFunction", [options]);
    }
  };
  module.exports = PluginName;
  