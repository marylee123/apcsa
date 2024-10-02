static final int SQUARE_SIZE = 100;
int [][]gridColors;

void setup() {
  size(815, 672);
  // grid size [int[width/SQUARE_SIZE]][[height/SQUARE_SIZE]]
  gridColors = new int[][] { {0, 1, 0, 1, 0, 1, 1, 0},
                             {1, 0, 1, 0, 1, 0, 1, 1},
                             {1, 1, 1, 1, 1, 1, 1, 1},
                             {0, 0, 0, 0, 0, 0, 1, 0},
                             {1, 1, 0, 0, 1, 1, 1, 0},
                             {1, 0, 1, 1, 1, 0, 1, 0}
                           };

 
}

void draw() {
  background(255);
  grid();
}


/* Draw squares in your frame
   There should be space between squares
   Choose two colors to fill your squares color0, color1
   If the cell in gridColors has the value 0, use the color0 for the corresponding square.
   If the cell in gridColors has the value 1, use the color1 for the corresponding square.
 */
void grid() {
  for(int y = 0; y < height/SQUARE_SIZE; y++){
    for(int x = 0; x < width/SQUARE_SIZE; x++){
      if(gridColors[y][x] == 0)
        fill(0);
      else
        fill(255);
      square(x*(SQUARE_SIZE+2),y*(SQUARE_SIZE+12),SQUARE_SIZE);
    }
  }
}


/* If you click on a square is should change the color (color0  to color1 or color1 to color0)
HINT: Select the square based on the position of the mouse 
*/
void mouseClicked() {
  int row = mouseY/102;
  int column = mouseX/112;
  
  if(gridColors[row][column] == 0)
    gridColors[row][column] = 1;
  else if(gridColors[row][column] == 1)
    gridColors[row][column] = 0;
  /*
  float r = int(random(256));
  float g = int(random(256));
  float b = int(random(256));
  color c = color(r,g,b);
  
  fill(c);
  square(column*(SQUARE_SIZE+2),row*(SQUARE_SIZE+2),SQUARE_SIZE);
  //gridColors[row][column] = (r,g,b);*/

  
}
