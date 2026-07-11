package QNA;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import tq6.DAz;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class CN3 implements vd {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final byte[] f8050n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f8051t;

    private boolean nr() {
        byte[] bArr = this.f8050n;
        return bArr == null || bArr.length == 0;
    }

    @Override // QNA.vd
    public String rl() {
        return this.f8051t;
    }

    CN3(String str, String str2, byte[] bArr) {
        this.rl = str;
        this.f8051t = str2;
        this.f8050n = bArr;
    }

    private byte[] t() {
        if (nr()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.f8050n);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // QNA.vd
    public InputStream getStream() {
        if (nr()) {
            return null;
        }
        return new ByteArrayInputStream(this.f8050n);
    }

    @Override // QNA.vd
    public DAz.Ml.n n() {
        byte[] bArrT = t();
        if (bArrT == null) {
            return null;
        }
        return DAz.Ml.n.n().rl(bArrT).t(this.rl).n();
    }
}
