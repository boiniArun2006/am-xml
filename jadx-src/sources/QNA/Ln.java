package QNA;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class Ln implements vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f8070n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f8071t;

    /* JADX WARN: Removed duplicated region for block: B:51:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private byte[] t() {
        GZIPOutputStream gZIPOutputStream;
        byte[] bArr = new byte[8192];
        try {
            InputStream stream = getStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                } finally {
                }
                if (stream == null) {
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    if (stream != null) {
                        stream.close();
                    }
                    return null;
                }
                while (true) {
                    try {
                        int i2 = stream.read(bArr);
                        if (i2 <= 0) {
                            gZIPOutputStream.finish();
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            gZIPOutputStream.close();
                            byteArrayOutputStream.close();
                            stream.close();
                            return byteArray;
                        }
                        gZIPOutputStream.write(bArr, 0, i2);
                    } finally {
                    }
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // QNA.vd
    public InputStream getStream() {
        if (this.f8070n.exists() && this.f8070n.isFile()) {
            try {
                return new FileInputStream(this.f8070n);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // QNA.vd
    public String rl() {
        return this.f8071t;
    }

    Ln(String str, String str2, File file) {
        this.rl = str;
        this.f8071t = str2;
        this.f8070n = file;
    }

    @Override // QNA.vd
    public DAz.Ml.n n() {
        byte[] bArrT = t();
        if (bArrT != null) {
            return DAz.Ml.n.n().rl(bArrT).t(this.rl).n();
        }
        return null;
    }
}
