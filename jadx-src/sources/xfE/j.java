package xfE;

import android.os.Environment;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import lN.j;
import xfE.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class j implements xfE.Wre {
    private static final Class J2 = j.class;
    static final long Uo = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Jv.j f75389O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f75390n;
    private final lN.j nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final File f75391t;

    class I28 implements Wre.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f75392n;
        final File rl;

        public I28(String str, File file) {
            this.f75392n = str;
            this.rl = file;
        }

        @Override // xfE.Wre.n
        public com.facebook.binaryresource.j n(Object obj) {
            return nr(obj, j.this.f75389O.now());
        }

        public com.facebook.binaryresource.j nr(Object obj, long j2) throws FileUtils.RenameException {
            File fileTy = j.this.ty(this.f75392n);
            try {
                FileUtils.rl(this.rl, fileTy);
                if (fileTy.exists()) {
                    fileTy.setLastModified(j2);
                }
                return com.facebook.binaryresource.n.rl(fileTy);
            } catch (FileUtils.RenameException e2) {
                Throwable cause = e2.getCause();
                j.this.nr.n(cause != null ? !(cause instanceof FileUtils.ParentDirNotFoundException) ? cause instanceof FileNotFoundException ? j.EnumC1048j.WRITE_RENAME_FILE_TEMPFILE_NOT_FOUND : j.EnumC1048j.WRITE_RENAME_FILE_OTHER : j.EnumC1048j.WRITE_RENAME_FILE_TEMPFILE_PARENT_NOT_FOUND : j.EnumC1048j.WRITE_RENAME_FILE_OTHER, j.J2, "commit", e2);
                throw e2;
            }
        }

        @Override // xfE.Wre.n
        public void rl(lN.Dsr dsr, Object obj) throws IOException {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(this.rl);
                try {
                    Hh.w6 w6Var = new Hh.w6(fileOutputStream);
                    dsr.n(w6Var);
                    w6Var.flush();
                    long jN = w6Var.n();
                    fileOutputStream.close();
                    if (this.rl.length() != jN) {
                        throw new Ml(jN, this.rl.length());
                    }
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                j.this.nr.n(j.EnumC1048j.WRITE_UPDATE_FILE_NOT_FOUND, j.J2, "updateResource", e2);
                throw e2;
            }
        }

        @Override // xfE.Wre.n
        public boolean t() {
            return !this.rl.exists() || this.rl.delete();
        }
    }

    private static class Ml extends IOException {
        public Ml(long j2, long j3) {
            super("File was not written completely. Expected: " + j2 + ", found: " + j3);
        }
    }

    private class Wre implements SA.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f75394n;

        private Wre() {
        }

        private boolean nr(File file) {
            w6 w6VarR = j.this.r(file);
            if (w6VarR == null) {
                return false;
            }
            String str = w6VarR.f75398n;
            if (str == ".tmp") {
                return O(file);
            }
            Hh.C.xMQ(str == ".cnt");
            return true;
        }

        @Override // SA.n
        public void n(File file) {
            if (!j.this.f75390n.equals(file) && !this.f75394n) {
                file.delete();
            }
            if (this.f75394n && file.equals(j.this.f75391t)) {
                this.f75394n = false;
            }
        }

        @Override // SA.n
        public void rl(File file) {
            if (this.f75394n && nr(file)) {
                return;
            }
            file.delete();
        }

        @Override // SA.n
        public void t(File file) {
            if (this.f75394n || !file.equals(j.this.f75391t)) {
                return;
            }
            this.f75394n = true;
        }

        private boolean O(File file) {
            if (file.lastModified() > j.this.f75389O.now() - j.Uo) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: xfE.j$j, reason: collision with other inner class name */
    private class C1272j implements SA.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final List f75395n;

        @Override // SA.n
        public void n(File file) {
        }

        @Override // SA.n
        public void t(File file) {
        }

        private C1272j() {
            this.f75395n = new ArrayList();
        }

        public List nr() {
            return Collections.unmodifiableList(this.f75395n);
        }

        @Override // SA.n
        public void rl(File file) {
            w6 w6VarR = j.this.r(file);
            if (w6VarR == null || w6VarR.f75398n != ".cnt") {
                return;
            }
            this.f75395n.add(new n(w6VarR.rl, file));
        }
    }

    static class n implements Wre.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f75396n;
        private long nr;
        private final com.facebook.binaryresource.n rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f75397t;

        private n(String str, File file) {
            Hh.C.Uo(file);
            this.f75396n = (String) Hh.C.Uo(str);
            this.rl = com.facebook.binaryresource.n.rl(file);
            this.f75397t = -1L;
            this.nr = -1L;
        }

        @Override // xfE.Wre.j
        public String getId() {
            return this.f75396n;
        }

        @Override // xfE.Wre.j
        public long getSize() {
            if (this.f75397t < 0) {
                this.f75397t = this.rl.size();
            }
            return this.f75397t;
        }

        @Override // xfE.Wre.j
        public long n() {
            if (this.nr < 0) {
                this.nr = this.rl.nr().lastModified();
            }
            return this.nr;
        }

        public com.facebook.binaryresource.n rl() {
            return this.rl;
        }
    }

    private static class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final String f75398n;
        public final String rl;

        private w6(String str, String str2) {
            this.f75398n = str;
            this.rl = str2;
        }

        public File n(File file) {
            return File.createTempFile(this.rl + ".", ".tmp", file);
        }

        public String t(String str) {
            return str + File.separator + this.rl + this.f75398n;
        }

        public String toString() {
            return this.f75398n + "(" + this.rl + ")";
        }

        public static w6 rl(File file) {
            String strCk;
            String name = file.getName();
            int iLastIndexOf = name.lastIndexOf(46);
            if (iLastIndexOf <= 0 || (strCk = j.ck(name.substring(iLastIndexOf))) == null) {
                return null;
            }
            String strSubstring = name.substring(0, iLastIndexOf);
            if (strCk.equals(".tmp")) {
                int iLastIndexOf2 = strSubstring.lastIndexOf(46);
                if (iLastIndexOf2 <= 0) {
                    return null;
                }
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            return new w6(strCk, strSubstring);
        }
    }

    private static boolean S(File file, lN.j jVar) {
        String canonicalPath;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return false;
            }
            String string = externalStorageDirectory.toString();
            try {
                canonicalPath = file.getCanonicalPath();
            } catch (IOException e2) {
                e = e2;
                canonicalPath = null;
            }
            try {
                return canonicalPath.contains(string);
            } catch (IOException e3) {
                e = e3;
                jVar.n(j.EnumC1048j.OTHER, J2, "failed to read folder to check if external: " + canonicalPath, e);
                return false;
            }
        } catch (Exception e4) {
            jVar.n(j.EnumC1048j.OTHER, J2, "failed to get the external storage directory!", e4);
            return false;
        }
    }

    @Override // xfE.Wre
    public boolean rl(String str, Object obj) {
        return aYN(str, true);
    }

    private String Ik(String str) {
        w6 w6Var = new w6(".cnt", str);
        return w6Var.t(Z(w6Var.rl));
    }

    private void ViF() {
        if (this.f75390n.exists()) {
            if (this.f75391t.exists()) {
                return;
            } else {
                SA.j.rl(this.f75390n);
            }
        }
        try {
            FileUtils.n(this.f75391t);
        } catch (FileUtils.CreateDirectoryException unused) {
            this.nr.n(j.EnumC1048j.WRITE_CREATE_DIR, J2, "version directory could not be created: " + this.f75391t, null);
        }
    }

    static String XQ(int i2) {
        return String.format(null, "%s.ols%d.%d", "v2", 100, Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String ck(String str) {
        if (".cnt".equals(str)) {
            return ".cnt";
        }
        if (".tmp".equals(str)) {
            return ".tmp";
        }
        return null;
    }

    private File o(String str) {
        return new File(Z(str));
    }

    @Override // xfE.Wre
    /* JADX INFO: renamed from: HI, reason: merged with bridge method [inline-methods] */
    public List getEntries() {
        C1272j c1272j = new C1272j();
        SA.j.t(this.f75391t, c1272j);
        return c1272j.nr();
    }

    @Override // xfE.Wre
    public boolean isExternal() {
        return this.rl;
    }

    @Override // xfE.Wre
    public void n() {
        SA.j.t(this.f75390n, new Wre());
    }

    @Override // xfE.Wre
    public long nr(Wre.j jVar) {
        return az(((n) jVar).rl().nr());
    }

    @Override // xfE.Wre
    public Wre.n t(String str, Object obj) throws IOException {
        w6 w6Var = new w6(".tmp", str);
        File fileO = o(w6Var.rl);
        if (!fileO.exists()) {
            WPU(fileO, "insert");
        }
        try {
            return new I28(str, w6Var.n(fileO));
        } catch (IOException e2) {
            this.nr.n(j.EnumC1048j.WRITE_CREATE_TEMPFILE, J2, "insert", e2);
            throw e2;
        }
    }

    File ty(String str) {
        return new File(Ik(str));
    }

    public j(File file, int i2, lN.j jVar) {
        Hh.C.Uo(file);
        this.f75390n = file;
        this.rl = S(file, jVar);
        this.f75391t = new File(file, XQ(i2));
        this.nr = jVar;
        ViF();
        this.f75389O = Jv.Ml.n();
    }

    private void WPU(File file, String str) throws FileUtils.CreateDirectoryException {
        try {
            FileUtils.n(file);
        } catch (FileUtils.CreateDirectoryException e2) {
            this.nr.n(j.EnumC1048j.WRITE_CREATE_DIR, J2, str, e2);
            throw e2;
        }
    }

    private String Z(String str) {
        return this.f75391t + File.separator + String.valueOf(Math.abs(str.hashCode() % 100));
    }

    private boolean aYN(String str, boolean z2) {
        File fileTy = ty(str);
        boolean zExists = fileTy.exists();
        if (z2 && zExists) {
            fileTy.setLastModified(this.f75389O.now());
        }
        return zExists;
    }

    private long az(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public w6 r(File file) {
        w6 w6VarRl = w6.rl(file);
        if (w6VarRl == null || !o(w6VarRl.rl).equals(file.getParentFile())) {
            return null;
        }
        return w6VarRl;
    }

    @Override // xfE.Wre
    public com.facebook.binaryresource.j O(String str, Object obj) {
        File fileTy = ty(str);
        if (fileTy.exists()) {
            fileTy.setLastModified(this.f75389O.now());
            return com.facebook.binaryresource.n.t(fileTy);
        }
        return null;
    }

    @Override // xfE.Wre
    public long remove(String str) {
        return az(ty(str));
    }
}
