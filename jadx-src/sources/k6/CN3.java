package k6;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f69651n;

    private static String nr(String str, int i2) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i2);
        }
    }

    void J2(String str, w6 w6Var) {
        File file = new File(O(), rl(str, w6Var, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        x0.CN3.n("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        x0.CN3.t("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File Uo(String str, InputStream inputStream, w6 w6Var) throws IOException {
        File file = new File(O(), rl(str, w6Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (i2 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    Pair n(String str) {
        try {
            File fileT = t(str);
            if (fileT == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileT);
            w6 w6Var = fileT.getAbsolutePath().endsWith(".zip") ? w6.ZIP : fileT.getAbsolutePath().endsWith(".gz") ? w6.GZIP : w6.JSON;
            x0.CN3.n("Cache hit for " + str + " at " + fileT.getAbsolutePath());
            return new Pair(w6Var, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    private File O() {
        File fileN = this.f69651n.n();
        if (fileN.isFile()) {
            fileN.delete();
        }
        if (!fileN.exists()) {
            fileN.mkdirs();
        }
        return fileN;
    }

    private static String rl(String str, w6 w6Var, boolean z2) {
        String strRl = z2 ? w6Var.rl() : w6Var.f69658n;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strRl.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = nr(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strRl;
    }

    private File t(String str) {
        File file = new File(O(), rl(str, w6.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(O(), rl(str, w6.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(O(), rl(str, w6.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public CN3(I28 i28) {
        this.f69651n = i28;
    }
}
