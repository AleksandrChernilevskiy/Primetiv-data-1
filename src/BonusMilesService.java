public class BonusMilesService {
    public int calculate (int cost) {
        int condition = 20;
        int result;
        if( cost >= condition) {
            result = cost / 20;
        } else {
            result = 0;
        }
        return result;
    }
}
