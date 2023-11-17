# run javac and java
# Usage: ./run.ps1 [filename]

# compile
echo "✈️ 正在编译并运行Java文件：$args ..."

$filename = "Java_Network/$args.java"

java $filename -encoding UTF-8 | tee Java_Network/$args.txt

$msg = $? ? "✨ 运行成功！" : "🌀 运行失败！"
echo $msg