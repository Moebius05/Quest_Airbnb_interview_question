import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course_ID {
    static List order(String eini) {
        List<String> aussi = new ArrayList<>();
        for (int i = 0; i < eini.length(); i++) {
            if ((eini.charAt(i) == 'C') && (eini.charAt(i + 1) == 'S') && (eini.charAt(i) == 'C')) {
                StringBuilder sb = new StringBuilder();
                sb.append(eini.charAt(i)).append(eini.charAt(i + 1)).append(eini.charAt(i + 2)).append(eini.charAt(i + 3)).append(eini.charAt(i + 4)).append(eini.charAt(i + 5));
                aussi.add(sb.toString());
            }
        }
        Collections.sort(aussi);
        return aussi;
    }
}
