public class Kernel {
  float[][] kernel;

  /**Constructor takes the kernel that will be applied to the image
  *This implementation only allows 3x3 kernels
  */
  public Kernel(float[][] init) {
    kernel = init;
  }

  /**If part of the kernel is off of the image, return black, Otherwise
  *Calculate the convolution of r/g/b separately, and return that color\
  *if the calculation for any of the r,g,b values is outside the range
  *     0-255, then clamp it to that range (< 0 becomes 0, >255 becomes 255)
  */
  color calcNewColor(PImage img, int x, int y) {
    float newRed = 0;
    float newGreen = 0;
    float newBlue = 0;
    if(x == 0 || x == img.height-1 || y == 0 || y == img.width-1){
      return color(0);
    }
    for(int row = 0; row < kernel.length; row++){
      for(int col = 0; col < kernel[row].length; col++){
        int R = x + row - 1;
        int C = y + col - 1;

        int index = R * img.width + C;
          
        float r = red(img.pixels[index]);
        newRed += r*kernel[row][col];
            
        float g = green(img.pixels[index]);
        newGreen += g*kernel[row][col];
            
        float b = blue(img.pixels[index]);
        newBlue += b*kernel[row][col];
      }   
    }
    newRed = constrain(newRed,0,255);
    newGreen = constrain(newGreen,0,255);
    newBlue = constrain(newBlue,0,255);
    
    return color(newRed,newGreen,newBlue);
  }

  /**Apply the kernel to the source,
  *and saves the data to the destination.*/
  void apply(PImage source, PImage destination) {
    /*for(int i = 0; i < size; i++){
      int row = i/source.width;
      int col = i%source.width;
      if(row == 0 || row = souce.width-1 || col == 0 || col == source.height-1){
        destination.pixels[i] = color(0);
      else{
        destination.pixels[i] = calcNewColor(source,row,col);
      }
    }*/
    for(int r = 0; r < source.height; r++){
      for(int c = 0; c < source.width; c++){
        int i = r*source.width + c;
        destination.pixels[i] = calcNewColor(source,r,c);
      }
    }
  }

}
