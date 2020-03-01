public class reverseInt {
        public int reverse(int x) {
            if (x<-Math.pow(2,31) || x>Math.pow(2,31)-1) return 0;
            else if(x<0)
            {return -reverse(-x);}
            else
            {
                if(x<10) {return x;}
                else{
                    int pow1 = 2 ;
                    while(x >= Math.pow(10,pow1)){
                        pow1++;
                    }
                    pow1--;
                    return (int)(reverse(x/10)) +(int) Math.pow(10,pow1)*(x%10);
                }
            }

        }
    }

