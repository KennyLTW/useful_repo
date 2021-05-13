條件式 ? 成立傳回值 : 失敗傳回值

if(number % 2 == 0) {
    System.out.println("是否為偶數?是");
}
else {
    System.out.println("是否為偶數?否");
}

OR

System.out.printf("是否為偶數?%c%n", (number % 2 == 0) ? '是' : '否');
System.out.printf("該生是否及格?%c%n", score >= 60 ? '是' : '否');
