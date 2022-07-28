
    import java.io.*;
import java.util.Iterator;
    import java.util.Scanner;

    public class FileTransfer {
        public static void main(String[] args) throws IOException {
            Scanner in1 = new Scanner(System.in);
            Scanner in2 = new Scanner(System.in);

            System.out.println("请输入原地址");
            String s1 = in1.next();
            System.out.println("请输入目标地址");
            String s2 = in2.next();


            copy(s1, s2);

        }

        public static void copy(String old,String news) throws IOException {
            File fo=new File(old);
            File fn= new File(news);

            if (!fo.isDirectory()) {
                System.out.println(fo+"不是目录");
            }

            String[] list = fo.list();//得到旧文件的所有文件目录

            if (!fn.exists()) {
                fn.createNewFile();
            }

            for(int a=0;a<list.length;a++) {

                FileInputStream fi1=new FileInputStream(fo+"\\"+list[a]);
                FileOutputStream fo1=new FileOutputStream(fn+"\\"+list[a]);

                byte[] b1=new byte[1024];
                int len;

                while( (len=fi1.read(b1))!=-1 ) {
                    fo1.write(b1, 0, len);
                }

                fi1.close();
                fo1.flush();
                fo1.close();

            }

        }

    }


