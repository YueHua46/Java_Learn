public class Java_07 {
  public static void main(String[] args) {
    // 1. 数组
    // 1.1 声明和初始化数组
    int[] arr1 = new int[5];
    int[] arr2 = { 1, 2, 3, 4, 5 };

    // 1.2 访问数组元素
    System.out.println(arr2[0]); // 1

    // 1.3 遍历数组
    for (int i = 0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }

    // 2. 多维数组
    // 2.1 声明和初始化多维数组
    int[][] multiArr1 = new int[2][3];
    int[][] multiArr2 = { { 1, 2, 3 }, { 4, 5, 6 } };

    // 2.2 访问多维数组元素
    System.out.println(multiArr2[0][0]); // 1

    // 2.3 遍历多维数组
    for (int i = 0; i < multiArr2.length; i++) {
      for (int j = 0; j < multiArr2[i].length; j++) {
        System.out.println(multiArr2[i][j]);
      }
    }
  }
}