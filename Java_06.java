public class Java_06 {
  public static void main(String[] args) {
    // 1. 条件语句
    // 1.1 if-else
    int score = 85;
    if (score >= 90) {
      System.out.println("优秀");
    } else if (score >= 80) {
      System.out.println("良好");
    } else {
      System.out.println("需要努力");
    }

    // 1.2 switch-case
    char grade = 'B';
    switch (grade) {
      case 'A':
        System.out.println("优秀");
        break;
      case 'B':
        System.out.println("良好");
        break;
      default:
        System.out.println("需要努力");
        break;
    }

    // 2. 循环语句
    // 2.1 for
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // 2.2 while
    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }

    // 2.3 do-while
    i = 0;
    do {
      System.out.println(i);
      i++;
    } while (i < 5);
  }
}
