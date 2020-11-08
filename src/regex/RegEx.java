package regex;

import petrs.Utils;

import java.util.Arrays;

/**
 * https://regexlib.com/CheatSheet.aspx
 */

public class RegEx {
    public static void main(String[] args) {
        // d - одна цифра, спец символ.
        String example1 = "1";
        System.out.println(example1.matches("\\d")); // true

        // "+" - 1 или более, " * " - 0 или более.
        String example2 = "23", example3 = "", example4 = "", example5 = "-1";
        System.out.println(example2.matches("\\d+") + "; " + example3.matches("\\d*"));
        System.out.println(example4.matches("\\d+") + "; " + example5.matches("\\d*"));

        // " -\\d+ " - добавляем минус перед выражением.
        String example6 = "-234";
        System.out.println(example6.matches("-\\d+"));

        // ? - символ до этого знака может быть, а может и не быть, т.к. 0 или 1. Например: " -?\d* "
        String example7 = "-346", example8 = "876";
        System.out.println("example7: " + example7.matches("-?\\d*") + "; example8: " + example8.matches("-?\\d*"));

        // ( | ) - для описания вероятных событий. | - логическое ИЛИ.
        // т.к. + это спец символ, то нужны \\ - т.е. "\\+"
        String example9 = "+632";
        System.out.println("example9: " + example9.matches("(-|\\+)?\\d*") + "; example7: " + example7.matches("([-+])?\\d*"));

        // [] - можно описывать большие множества. Например все маленькие и большие буквы - [a-zA-Z], [0-9] = \\d - все цифры
        // " [a-zA-Z]+ " - плюс здесь означает, что может быть любое колличество символом
        String example10 = "G34", example11 = "j67", example12 = "jdfsdfksd5678", example13 = "uihi4ooj4567";
        System.out.println("example10: " + example10.matches("[A-Z]\\d*") + "; example11: " + example11.matches("[a-z]\\d*"));
        System.out.println("example12: " + example12.matches("[a-zA-Z]+\\d*") + "; example13: " + example13.matches("[a-zA-Z]+\\d*"));

        // [a-zA-Z13] - можно добавлять конкретные символы
        String example14 = "3kjuhi146464647";
        Utils.print("example14: " + example14.matches("[a-zA-Z13]+\\d*"));
        Utils.newLine();

        // [^] - отрицание, т.е. будет true, если указанного символа нет в строке, т.е. всё что после него не должжно быть в строке
        // [^abc]* - все символы кроме abc, их колличество от 0 до бесконечности.
        String exmpl15 = "hello", exmpl16 = "ahello";
        Utils.print("exmpl15: " + exmpl15.matches("[^abc]*") + "; exmpl16: " + exmpl16.matches("[^abc]+"));
        Utils.newLine();

        // " . " - точнка, значит любой символ.
        // " .+ " - любой набор символов
        String url = "http://www.google.com", url_org = "www.yandex.org";
        Utils.print("url_com: " + url.matches("http://www\\..+\\.(com|ru)") + "; url_org: " + url_org.matches("www\\..+\\.(com|ru|org)"));
        Utils.newLine();

        // {2} -    ровно два в этом месте должны видеть. - \\d{2}
        // {2, } -  от двух символовж -                     \\d{2, }
        // {2, 4} - от двух до 4-х символов. -              \\d{2, 4}
        String xmpl17 = "123", xmpl18 = "12", xmpl19 = "1234";
        Utils.println("xmpl17: " + xmpl17.matches("\\d{2,}") + "; xmpl18: " + xmpl18.matches("\\d{2}") + "; xmpl19: " + xmpl18.matches("\\d{2,4}"));

        // \\w = [a-zA-Z] - допускается одна любая буква из алфавита
        String xmpl20 = "R";
        Utils.println("xmpl20: " + xmpl20.matches("\\w"));

        // медод split()
        String xmpl21 = "3423Hi80803guys,084803hello808";
        String[] words = xmpl21.split("\\d+");
        Utils.println("xmpl21: " + Arrays.toString(words));

        // метод replace() + replaceAll()
        String xmpl22 = "Rats lovely animals!", xmpl23 = "2312Rats32342lovely34234animals8989";
        String modifyString = xmpl22.replace(" ", " - ");
        Utils.println("modifyString: " + modifyString);
        modifyString = xmpl23.replaceAll("\\d+", "*");
        Utils.println("modifyString2: " + modifyString);
        Utils.println("modifyString3: " + xmpl23.replaceFirst("\\d+", "###"));
    }
}
