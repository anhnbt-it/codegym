let Flashlamp = function() {
  this.status = false;

  this.setBattery = function(battery) {
    this.battery = battery;
  };

  this.getBatteryInfo = function() {
    return this.battery.getEnergy();
  };

  this.light = function() {
    if (this.status) {
      console.log("Lighting");
    } else {
      console.log("Not Lighting");
    }
  };

  this.turnOn = function() {
    this.status = true;
    this.battery.decreaseEnergy();
  };

  this.turnOff = function() {
    this.status = false;
  }
};