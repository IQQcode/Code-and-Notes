import java.io.File;

public class TraverseDocument {
    public static void main(String[] args) {
        File file = new File("F:" + File.separator +
                "Code-Java" + File.separator + "JavaSE");
        //多线程处理
        new Thread(new Runnable() {
            public void run() {
                int level = 0;
                System.out.println(file.getName());
                listAllFiles(file, level + 1);
            }
        }).start();
        System.out.println("main方法执行代码\n开始进行文件输出...");
    }

    public static void listAllFiles(File file,int level) {
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            if(files != null) {
                for(File i : files) {
                    System.out.println(computerPrefix(level) + file.getName());
                }
                if (f.isDirectory()) {
                    listAllFiles(file, level + 1);
                } else {
                    System.out.println(computerPrefix(level) + file.getName());
                }
            }
        }
    }

    public static String computerPrefix(int level) {
        StringBuilder msg = new StringBuilder("|");
        for (int i = 0; i < level; i++) {
            msg.append("-");
        }
        return msg.toString();
    }
}