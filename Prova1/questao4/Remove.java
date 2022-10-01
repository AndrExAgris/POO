public class Remove {


    public String removerVogais (String comVog) {

        String semVog = "";

        semVog = comVog.replaceAll("[aeiouAEIOU]", "");

        return semVog;
    }


    public String removerConsoantes (String comCon) {

        String semCom = "";
    
        semCom = comCon.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]", "");
    
        return semCom;
    }
}
