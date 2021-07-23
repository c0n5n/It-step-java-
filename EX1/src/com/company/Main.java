/*ABCD
Дана последовательность из 1000 символов.
Каждый символ - латинская буква в верхнем регистре.
Определите 5 наиболее часто повторяющихся символов в заданной последовательности
Затем расставьте их таким образом,чтобы сперва шел символ,
повторяющийся наибольшее число раз, затем второй по количеству повторений, третий и т.д
Полученный в результате расстановки символов код и будет ответом на заданную задачу.
*/
package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
  public static void main(String[] args){
   String s = "IMPEDFCJYEIPDTUOSWMYSMIAQYDEONTZTWRNGZ" +
           "+FXKYBTLFZFJAUJWOYSECCYUJQJXHKNLEGKDMXLOEFVIFGU" +
           "+LESWVMRXRUFZGRTUEUWELUFBLTAJAYSKTZNPEJZZRLKATPQBZ" +
           "+HLFFHXLDKWOYTIXSGPCTHFOMOTCKSBOFIJBOBUGJYOIQLBAKKRWVHX" +
           "+SSXRZTQRMKAQSXODALBXZCKYZXATCXHBHKMTWGRRHEPQKNGXLIXHYTTA" +
           "+ZSWVCZZUBEOXMUXAHEVBILLJRRVSGRIEUIULKBIPJHGXIKWYGYXZTGEFYDGYV" +
           "+KPRRSFJJRLDDQCUEDFFPEEHOTMWAOEMLXWXVIHIJLRCVIQXGZTXDBNXQGZSYNSIYQ" +
           "+BPLNTXDKIJVTJOGKKKAYTVUHMVVTWKOCHETOAZBEPNKQQKCBGLJSOQHRRTQILQKFYHQLSA" +
           "+CFNMZTCGLGAZIRINEJRLMHPRDGOTNYIOJDNDFYCIGIACALITODHZHJJXJNZWEUDMFWYPNCDYFO" +
           "+KGNTWPONTQLMMXFDNWZVYARYUEBJIPHGCRMFWTMPTXVERDRGXPMOVLWEYJTXWEAPJXKHKCMSWWIPM" +
           "+QFWSVKIWLUVAKKUUQWAOBDDLRGOWHGQDHSCNUPRJOPRMEGLISBUKQWKTSJCNBVDUQZIHUHPYOAZMKSHK" +
           "+IIWMXSZVLCPCJDRVMSJIDXNLNNVLRMNNKXDYSOKKXMWNRXVVOGKYNTHFAUNKSDZUPKUXPUVKNVQCZJRXSI" +
           "+ZQYWHDLOXLVLVENIBQPCMDFCGTGZMQMORQLRAKVMXMNLIGOSYVAIAORAIDUPFHHTRFCPPBYQWQCKJYQMKAE" +
           "+TCGHBCEJSSFVXVSIPGFMEOPXAXPYKCWZZGMFWIERBIODKFEKLXOXVQDFQOOORODUSNRCVUWLHOMEETODKDUCK" +
           "+VIQUXYYUFPZALYMKPYNBYTWFHVKGAIEZWSXRUOEONGNEMLDWMNJGEVODASJIJKOJWGLKJKEATXBNODCK";

                //вывести скобку кот.повторяется чаще всего
              char chars [] = s.toCharArray();//из строки получили массив двнных
              //считаем сколько каких символов с исп.хашмап
              //key - символ, value - int кот счетчик этого символа
              HashMap<Character, Integer> stroka = new HashMap<>();
              for (Character c : s.toCharArray()) {
                  if (stroka.containsKey(c)){
                      stroka.put(c,stroka.get(c)+1);//stroka.get(c) - вернет value по ключу
                      continue;
                  }
                  stroka.put(c,1);
              }


            for (Character key: stroka.keySet()){
                System.out.print(key); System.out.print("-"); System.out.println(stroka.get(key));
            }

            for (int i=0; i<5; i++) {
                int max = 0;
                char cmax =0;

                for (Character key : stroka.keySet()) {
                    int value = stroka.get(key);
                    if (value > max) {
                        max = value;
                        cmax = key;

                    }


                }

                System.out.print(cmax);
                System.out.print(" - ");
                System.out.println(max);
                stroka.remove(cmax);
            }

        }
}