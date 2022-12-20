
public class pigLatin {

    public static void main(String[] args) {

        String instr = "Night";

        char out = instr.charAt(0);
        String outstr = instr.substring(1);

        outstr = outstr + "ay";

        System.out.println("Input:" + instr);

        System.out.println("Output:" + outstr);

    }

}