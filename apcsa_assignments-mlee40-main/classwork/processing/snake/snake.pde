/**
 * SNAKE GAME
 * Rules:
 *     Eat the food
 *     Do not bite your own tail
 *     Do not hit a wall
 * Specifications:
 *     The snake grows when eat food
 *     The speed increases when the snake grows
 *     Food is displayed randomly
 *     Food and parts of the snake body are squares
 */

// global variables
ArrayList<PVector> snake = new ArrayList<PVector>(); // snake body (not included the head)
PVector pos; // snake position (position of the head)

StringList mode_list = new StringList(new String[] {"border", "no_border"}); // if you implement both functionalities
int mode_pos = 0; // mode 1 by default - if hits wall wraps around
String actual_mode = mode_list.get(mode_pos); // current mode name

PVector food; // food position

PVector dir = new PVector(0, 0); // snake direction (up, down, left right)

int size = 40; // snake and food square size
int w, h; // how many snakes can be allocated

int spd = 20; // reverse speed (smaller spd will make the snake move faster)
int len = 4; // snake body

void setup() {
  size(1080, 720);
  w = width/size;
  h = height/size;

  
  pos = new PVector(w/2, h/2); // Initial snake position
  newFood(); // create 2D vector
  
  noStroke();
  fill(0);
}

void draw() {
  background(200);
   
  for(int i = 0; i < w; i++){
    stroke(1);
    line(i*size, 0, i*size, height);
  }
  for(int j = 0; j < h; j++){
    stroke(1);
    line(0, j*size, width, j*size);
  }
  
  drawSnake();
  drawFood();
  
  // update snake if frameCount is a multiple of spd which is 20 at the begining
  if(frameCount % spd == 0) {
    updateSnake();   
  }
}

// draw the food item (square) which size is tha variable size
void drawFood() {
  // YOUR CODE HERE
  fill(0);
  square(food.x*size,food.y*size,size);
}

// declare a new pVector (random) for food
void newFood() {
  //food = new PVector......
  int x = int(random(w));
  int y = int(random(h));
  food = new PVector(x,y);
}

// draw snake, consider the snake array size (each square of size size) + square of the current pos
void drawSnake() {
  /// YOUR CODE HERE 
  fill(255);
  square(pos.x*size,pos.y*size,size); 
  for(int i = 0; i < snake.size(); i++){
    fill(255);
    square(snake.get(i).x*size,snake.get(i).y*size,size);  
  }
}

void updateSnake() {
  // Add current position(head) to snake ArrayList
  snake.add(new PVector(pos.x, pos.y));
  //snake.add(pos.add(dir));
  // Check the size of snake. Remove some items from snake ArrayList if needed
  if(snake.size() > len){
    snake.remove(0);
  }
  // Calculate new position of snake (head). You must use the direction vector for this calculation
  pos = pos.add(dir);
  
 
  // If snake (head) hits food, add +1 to the snake size and create a new food
  if(pos.x == food.x && pos.y == food.y){
    spd += 1;
    len += 1;
    newFood();
  }
  
  // If snake (head) eat itself, gameover, reset()
  if(len == snake.size()){
    for(int i = 0; i < snake.size(); i++){
      if(pos.x == snake.get(i).x && pos.y == snake.get(i).y){
        print("gameover");
        reset();
      }
    }
  }
  
  // If mode 'no_border', snake is out of screen, wraps around
  if(actual_mode.equals("no_border")){
    if(pos.x == 0){
      snake.add(new PVector(pos.x, pos.y));
      snake.remove(0);
      pos = new PVector(w, pos.y);
    }
    else if(pos.x == w){
      snake.add(new PVector(pos.x, pos.y));
      snake.remove(0);
      pos = new PVector(0, pos.y);
    }
    else if(pos.y == 0){
      snake.add(new PVector(pos.x, pos.y));
      snake.remove(0);
      pos = new PVector(pos.x, h);
    }
    else if(pos.y == h){
      snake.add(new PVector(pos.x, pos.y));
      snake.remove(0);
      pos = new PVector(pos.x, 0);
    }
  }
  // If mode 'border', when snake hit a border, gameover, reset()
  else if(actual_mode.equals("border")){
    if(pos.x == -1){
      print("gameover");
      reset();
    }
    else if(pos.x == w){
      print("gameover");
      reset();
    }
    else if(pos.y == h){
      print("gameover");
      reset();
    }
    else if(pos.y == -1){
      print("gameover");
      reset();
    }
    
  }
  
}

void reset() {
  spd = 20;
  len = 4;
  pos = new PVector(w/2, h/2);
  dir = new PVector(0, 0);
  newFood();
  snake = new ArrayList<PVector>();
}

void keyPressed() {
  // if UP is pressed => dir = new PVector(...)
  // same thing for DOWN, LEFT, RIGHT
  // UP (0, -1)
  // DOWN(0, 1)
  // LEFT(-1,0)
  // RIGHT(1,0)
  if(key == CODED){
    if(keyCode == UP){
      dir = new PVector(0, -1);
    }
    else if(keyCode == DOWN){
      dir = new PVector(0, 1);
    }
    else if(keyCode == LEFT){
      dir = new PVector(-1, 0);
    }
    else if(keyCode == RIGHT){
      dir = new PVector(1, 0);
    }
  }
  
}

// EXTRA FOR STUDENTS WHO FINISH WITH THE REQUIRED TASKS
// if '+' is pressed, increase the size of the squares (and recalculate w and h)
// same thing for '-'
// when 'm' is pressed, change the mode -> ONLY IF YOU IMPLEMENT BOTH MODES
// add colors: 
//     1. make the food colorful and when the snake eats the food, it adopts that color
//     2. make the backgroud looks like a grid adding colors
