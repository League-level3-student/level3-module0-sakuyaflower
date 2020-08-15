int[] numbers;

void setup(){
size(500,500); 
numbers = new int[width];
makeRandom();
noStroke();
}

void draw(){
 background(130,23,213);
 fill(#F0D344);
for(int i = 0; i < 500; i++){
rect(i,height,1, -numbers[i]);
}
stepSort(numbers);
if(mousePressed){
  makeRandom();
}
}
void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}

void makeRandom(){
  for(int i = 0; i < 500; i++){
  numbers[i] = (int)random(height);
}
}
