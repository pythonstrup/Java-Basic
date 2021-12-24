public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(areaPerBucket <= 0 || extraBuckets < 0 || width <= 0 || height <= 0)
            return -1;

        double area = width * height;
        int needBuckets = (int) Math.ceil((area-(areaPerBucket*extraBuckets))/areaPerBucket);
        return needBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(areaPerBucket <= 0 || width <= 0 || height <= 0)
            return -1;

        double area = width * height;
        int needBuckets = (int) Math.ceil(area/areaPerBucket);
        return needBuckets;
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if(areaPerBucket <= 0 || area <= 0)
            return -1;

        int needBuckets = (int) Math.ceil(area/areaPerBucket);
        return needBuckets;
    }
}
