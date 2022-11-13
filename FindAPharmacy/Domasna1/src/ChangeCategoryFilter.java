public class ChangeCategoryFilter implements Filter<String> {

@Override
    public String execute(String input){
        String[] a = input.split(",");
        if (a[2].toLowerCase().contains("apteka") || a[2].toLowerCase().contains("farmacevtska kompanija") || a[2].toLowerCase().contains("homeopathic pharmacy") || a[2].toLowerCase().contains("homeopatska apteka")) {
            a[2] = "Pharmacy";
        }
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<a.length;i++){
                sb.append(a[i]);
                if (i!=a.length-1){
                    sb.append(",");
                }
            }
            return sb.toString();
        }

    }

