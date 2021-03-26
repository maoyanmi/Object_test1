package com.mym;

public class System_test {
    public static void main(String[] args) {
      // getProcessTime();
       copyArray();
    }

    /**
     * 验证for循环打印数字1-9999所需要使用的时间（毫秒）
     */
    private static void getProcessTime() {
        int i = 0;
        long start = System.currentTimeMillis();
        while (i < 9999) {
            System.out.println(++i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    /**
     * 将src数组中前3个元素，复制到dest数组的前3个位置上
     * 复制元素前：src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
     * 复制元素后：src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
     */
// void arraycopy(Object src, int  srcPos, Object dest, int destPos,int length);
    private static void copyArray() {
        String[] arr1 = {"zhangsan", "lisi", "wangwu", "zhaoliu", "sunqi"};
        String[] arr2 = {"1", "2", "3", "4", "5"};
        System.arraycopy(arr1, 0, arr2, 0, 3);
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++){
            if (i == arr1.length - 1) {
                System.out.println(arr1[i] + "]");
            }else {
                System.out.print(arr1[i] + ", ");
            }

        }
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++){
            if (i == arr2.length - 1) {
                System.out.println(arr2[i] + "]");
            }else {
                System.out.print(arr2[i] + ", ");
            }

        }
    }

}
