public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0)
            return false;

        int big = bigCount * 5;
        int small = smallCount;
        int sum = big + small;

        if(goal <= sum && smallCount >= goal % 5)
            return true;
        else
            return false;

    }
}
