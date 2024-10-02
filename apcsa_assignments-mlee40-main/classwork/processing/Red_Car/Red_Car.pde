void setup(){
  size(1450,500);
  PImage car = loadImage("redcar.png");
  PImage output = car.copy();

  String[] names = new String[]{
    "Identity", "Blur", "Sharpen",
    "Outline", "Left Sobel", "Right Sobel",
    "Top Sobel", "Emboss"
  };

  Kernel[] kernels = new Kernel[] {
    new Kernel( new float[][] {
      {0, 0, 0},
      {0, 1, 0},
      {0, 0, 0}
    }) ,
    new Kernel( new float[][] {
      {.111, .111, .111},
      {.111, .111, .111},
      {.111, .111, .111}
    }) ,
    new Kernel( new float[][] {
      {0, -1, 0},
      {-1, 5, -1},
      {0, -1, 0}
    }) ,
    new Kernel( new float[][] {
      {-1, -1, -1},
      {-1, 8, -1},
      {-1, -1, -1}
    }) ,
    new Kernel( new float[][] {
      {1, 0, -1},
      {2, 0, -2},
      {1, 0, -1}
    }) ,
    new Kernel( new float[][] {
      {-1, 0, 1},
      {-2, 0, 2},
      {-1, 0, 1}
    }) ,
    new Kernel( new float[][] {
      {1, 2,  1},
      {0, 0, 0},
      {-1, -2, -1}
    }),
    new Kernel( new float[][] {
      {-2, -1,  0},
      {-1, 1, 1},
      {0, 1, 2}
    })
  };
  
  kernels[0].apply(car,output);
  System.out.println(names[0]);
  image(car,0,0);
  image(output,car.width,0);
 
}

void draw(){
  int currentKernel = 0;
  
  String[] names = new String[]{
    "Identity", "Blur", "Sharpen",
    "Outline", "Left Sobel", "Right Sobel",
    "Top Sobel", "Emboss"
  };

  Kernel[] kernels = new Kernel[] {
    new Kernel( new float[][] {
      {0, 0, 0},
      {0, 1, 0},
      {0, 0, 0}
    }) ,
    new Kernel( new float[][] {
      {.111, .111, .111},
      {.111, .111, .111},
      {.111, .111, .111}
    }) ,
    new Kernel( new float[][] {
      {0, -1, 0},
      {-1, 5, -1},
      {0, -1, 0}
    }) ,
    new Kernel( new float[][] {
      {-1, -1, -1},
      {-1, 8, -1},
      {-1, -1, -1}
    }) ,
    new Kernel( new float[][] {
      {1, 0, -1},
      {2, 0, -2},
      {1, 0, -1}
    }) ,
    new Kernel( new float[][] {
      {-1, 0, 1},
      {-2, 0, 2},
      {-1, 0, 1}
    }) ,
    new Kernel( new float[][] {
      {1, 2,  1},
      {0, 0, 0},
      {-1, -2, -1}
    }),
    new Kernel( new float[][] {
      {-2, -1,  0},
      {-1, 1, 1},
      {0, 1, 2}
    })
  };
  PImage car = loadImage("redcar.png");
  PImage output = car.copy();
  if(keyPressed){
    /*if(key == '0'){
      kernels[0].apply(car,output);
      System.out.println(names[0]);
    }*/
    if(key == '0'){
      currentKernel = 0;
    }
    else if(key == '1'){
      currentKernel = 1;
    }
    else if(key == '2'){
      currentKernel = 2;
    }
    else if(key == '3'){
      currentKernel = 3;
    }
    else if(key == '4'){
      currentKernel = 4;
    }
    else if(key == '5'){
      currentKernel = 5;
    }
    else if(key == '6'){
      currentKernel = 6;
    }
    else if(key == '7'){
      currentKernel = 7;
    }
    kernels[currentKernel].apply(car,output);
    image(car,0,0);
    image(output,car.width,0);
    System.out.println(names[currentKernel]);
  }
}
