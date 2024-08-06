public class Solution{


    public Solution(){

    }

    public int romanToInt(String s){

        int result =0;

        char[] inputs=s.toCharArray();

        for (int i=0;i<inputs.length-1;i++){

            switch(inputs[i]){
                case 'I':
                    if (inputs[i+1]=='V'){
                        result+=4;
                        inputs[i+1]=' ';
                    }
                    else if (inputs[i+1]=='X'){
                        result+=9;
                        inputs[i+1]=' ';
                    }
                    else {
                        result+=1;
                    }
                    break;

                case 'X':
                    if (inputs[i+1]=='L'){
                        result+=40;
                        inputs[i+1]=' ';
                    }
                    else if (inputs[i+1]=='C'){
                        result+=90;
                        inputs[i+1]=' ';
                    }
                    else {
                        result+=10;
                    }
                    break;

                case 'C':
                    if (inputs[i+1]=='D'){
                        result+=400;
                        inputs[i+1]=' ';
                    }
                    else if (inputs[i+1]=='M'){
                        result+=900;
                        inputs[i+1]=' ';
                    }
                    else {
                        result+=100;
                    }
                    break;

                case 'V':
                    result+=5;
                    break;

                case 'L':
                    result+=50;
                    break;

                case 'D':
                    result+=500;
                    break;

                case 'M':
                    result+=1000;
                    break;

            }

        }

        if (inputs[inputs.length-1]!=' '){
            switch(inputs[inputs.length-1]){
                case 'I':
                    result+=1;
                    break;

                case 'X':
                    result+=10;
                    break;

                case 'C':
                    result+=100;
                    break;

                case 'V':
                    result+=5;
                    break;

                case 'L':
                    result+=50;
                    break;

                case 'D':
                    result+=500;
                    break;

                case 'M':
                    result+=1000;
                    break;
            }

        }
        return result;
    }
}