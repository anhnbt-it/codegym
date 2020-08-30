const CANVAS_WIDTH = 500;
const CANVAS_HEIGHT = 500;

let HeroGame = function(speed) {

  // Variables
  this.SPEED = speed;
  this.CANVAS_WIDTH = 500;
  this.CANVAS_HEIGHT = 500;

  this.init = function() {
    this.canvas = document.getElementById('myCanvas');
    this.canvas.width = this.canvasWidth;
    this.canvas.height = this.canvasHeight;
    this.ctx = this.canvas.getContext('2d');
    this.heros = new Image(); // Create new img element
    this.heros.src = 'images/Idle/HeroKnight_Idle_0.png'; // Set source path
    this.draw(this.ctx, this.heros);
    // window.requestAnimationFrame(this.draw(this.ctx, this.heros)); // the image is fully loaded sostart animating
  };
  
  this.draw = function(ctx, heros) {
    let cw = this.canvasWidth;
    let ch = this.canvasHeight;
    let heroW = 100;
    let heroH = 55;
    if (ctx) {
      let counter = 0;
      counter++;
      counter = counter%8;
      heros.addEventListener('load', function() {
        ctx.clearRect(0, 0, cw, ch); // clear canvas
        ctx.drawImage(heros, counter, ch/2-heroH/2);
      }, false);
      // window.requestAnimationFrame(this.draw(ctx, heros)); // request another loop of animation
    }
  }
}

let myHero = new Hero(20);
myHero.init();