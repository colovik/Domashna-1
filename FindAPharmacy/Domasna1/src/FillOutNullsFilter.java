public class FillOutNullsFilter implements Filter<String>{

    @Override
    public String execute(String input){
        String[] a = input.split(",");

        for (int i = 0 ; i<a.length;i++) {
            if (a[i] == "") {
                a[i] = "Not available";
            }
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

