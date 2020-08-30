import Hero from './hero.js';
import InputHandle from './control.js';

export default class Game {
  constructor(gameWidth, gameHeight) {
    // Variables
    this.gameWidth = gameWidth;
    this.gameHeight = gameHeight;
  }
  
  start() {
    this.hero = new Hero(this);
    new InputHandle(this.hero);
  }

  update(deltaTime) {
    this.hero.update(deltaTime);
  }

  draw(ctx) {
    this.hero.draw(ctx);
  }

}