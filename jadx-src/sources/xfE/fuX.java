package xfE;

import Hh.qz;
import com.facebook.common.file.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import lN.j;
import xfE.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class fuX implements Wre {
    private static final Class J2 = fuX.class;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    volatile j f75385O = new j(null, null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f75386n;
    private final lN.j nr;
    private final qz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f75387t;

    synchronized Wre xMQ() {
        try {
            if (mUb()) {
                KN();
                Uo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Wre) Hh.C.Uo(this.f75385O.f75388n);
    }

    static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Wre f75388n;
        public final File rl;

        j(File file, Wre wre) {
            this.f75388n = wre;
            this.rl = file;
        }
    }

    private void Uo() throws FileUtils.CreateDirectoryException {
        File file = new File((File) this.rl.get(), this.f75387t);
        J2(file);
        this.f75385O = new j(file, new xfE.j(file, this.f75386n, this.nr));
    }

    private boolean mUb() {
        File file;
        j jVar = this.f75385O;
        return jVar.f75388n == null || (file = jVar.rl) == null || !file.exists();
    }

    void KN() {
        if (this.f75385O.f75388n == null || this.f75385O.rl == null) {
            return;
        }
        SA.j.rl(this.f75385O.rl);
    }

    public fuX(int i2, qz qzVar, String str, lN.j jVar) {
        this.f75386n = i2;
        this.nr = jVar;
        this.rl = qzVar;
        this.f75387t = str;
    }

    void J2(File file) throws FileUtils.CreateDirectoryException {
        try {
            FileUtils.n(file);
            Dzy.j.n(J2, "Created cache directory %s", file.getAbsolutePath());
        } catch (FileUtils.CreateDirectoryException e2) {
            this.nr.n(j.EnumC1048j.WRITE_CREATE_DIR, J2, "createRootDirectoryIfNecessary", e2);
            throw e2;
        }
    }

    @Override // xfE.Wre
    public com.facebook.binaryresource.j O(String str, Object obj) {
        return xMQ().O(str, obj);
    }

    @Override // xfE.Wre
    public Collection getEntries() {
        return xMQ().getEntries();
    }

    @Override // xfE.Wre
    public boolean isExternal() {
        try {
            return xMQ().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // xfE.Wre
    public void n() {
        try {
            xMQ().n();
        } catch (IOException e2) {
            Dzy.j.O(J2, "purgeUnexpectedResources", e2);
        }
    }

    @Override // xfE.Wre
    public long nr(Wre.j jVar) {
        return xMQ().nr(jVar);
    }

    @Override // xfE.Wre
    public long remove(String str) {
        return xMQ().remove(str);
    }

    @Override // xfE.Wre
    public boolean rl(String str, Object obj) {
        return xMQ().rl(str, obj);
    }

    @Override // xfE.Wre
    public Wre.n t(String str, Object obj) {
        return xMQ().t(str, obj);
    }
}
