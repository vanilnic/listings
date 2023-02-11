// я не понялаЮ что он от меня хочет...
/* package glava5;

public class sameDateToDirFiles {
    public static void main(String dir) {
        long modified = System.currentTimeMillis();
        File walkDir = new File(dir);
        String[] dirList = walkDir.list();

        for (int i = 0; i < dirList.length; i++) {
            File f = new File(dirList[i]);
            if (f.isDirectory()) {
                sameDateToDirFiles(f.getPath());
                continue;
            }
            f.setLastModified(modified);
        }
    }
}

 */