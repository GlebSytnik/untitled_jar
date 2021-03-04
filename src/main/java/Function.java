public class Function {

    public static void main(String[] args) {
        class Something {
            Integer startsWith(String s) {

//                String[] num = (s.split(""));
//                int res = 0;
//                for (int i = 0; i <= num.length-1; i++) {
//                    res += Integer.valueOf(num[i]);
//                }
//                return res;
                int sum = Integer.valueOf(s);
                int value = sum;
                int res = 0;
                while (value != 0) {
                    res += value % 10;
                    value = value / 10;
                }
                return res;
            }
        }
        Something something = new Something();
        Converter<String, Integer> converter = something::startsWith;
        Integer converted = converter.convert("356");
        System.out.println(converted);

      Funkinterfase funkinterfase = (c) -> {

          Integer.parseInt(c);
          return Integer.valueOf(c);

      };
     System.out.println(funkinterfase.covertStringtoInteger("5"));

    }

}

