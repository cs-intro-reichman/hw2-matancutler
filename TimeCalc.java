public class TimeCalc {
    public static void main(String[] args) {
        String timeString = args[0];
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int tta = Integer.parseInt(args [1]);
        int totalM = hours * 60 + minutes + tta; 
        int totlH = totalM / 60;
        int newH = totlH % 24;
        int newM = totalM - (totlH * 60);
        String NewM = "";

        if(newM<10){
            NewM = "0" + newM;
        }
        else
        {
           NewM = "" + newM; 
        }
        if(newH<10){
            System.out.println("0" + newH + ":" + NewM);
        }
        else{
            System.out.println(newH + ":" + NewM);
        }
    }
}
