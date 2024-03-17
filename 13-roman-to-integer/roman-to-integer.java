class Solution {
public int romanToInt(String s) {
        int arabicNumber = 0;
        s += "O";
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length - 1; i++) {
            switch (c[i]) {
                case 'I':
                    if (c[i + 1] == 'V') {
                        arabicNumber += 4;
                        i++;
                    } else if (c[i + 1] == 'X') {
                        arabicNumber += 9;
                        i++;
                    } else arabicNumber += 1;
                    break;
                case 'V':
                    arabicNumber += 5;
                    break;
                case 'X':
                    if (c[i + 1] == 'L') {
                        arabicNumber += 40;
                        i++;
                    } else if (c[i + 1] == 'C') {
                        arabicNumber += 90;
                        i++;
                    } else arabicNumber += 10;
                    break;
                case 'L':
                    arabicNumber += 50;
                    break;
                case 'C':
                    if (c[i + 1] == 'D') {
                        arabicNumber += 400;
                        i++;
                    } else if (c[i + 1] == 'M') {
                        arabicNumber += 900;
                        i++;
                    } else arabicNumber += 100;
                    break;
                case 'D':
                    arabicNumber += 500;
                    break;
                case 'M':
                    arabicNumber += 1000;
                    break;
//                case 'O':
//                    System.out.println("end of string");
//                    break;
            }
        }
        return arabicNumber;
    }

    ;
}