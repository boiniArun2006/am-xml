package IRN;

import IRN.fuX;
import com.caoccao.javet.values.primitive.V8ValueNull;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
class Dsr implements Ml {
    private static final Charset nr = Charset.forName(com.google.android.exoplayer2.C.UTF8_NAME);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final File f4201n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private fuX f4202t;

    class j implements fuX.Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ byte[] f4203n;
        final /* synthetic */ int[] rl;

        j(byte[] bArr, int[] iArr) {
            this.f4203n = bArr;
            this.rl = iArr;
        }

        @Override // IRN.fuX.Ml
        public void rl(InputStream inputStream, int i2) throws IOException {
            try {
                inputStream.read(this.f4203n, this.rl[0], i2);
                int[] iArr = this.rl;
                iArr[0] = iArr[0] + i2;
            } finally {
                inputStream.close();
            }
        }
    }

    private static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final byte[] f4205n;
        public final int rl;

        n(byte[] bArr, int i2) {
            this.f4205n = bArr;
            this.rl = i2;
        }
    }

    private void J2(long j2, String str) {
        if (this.f4202t == null) {
            return;
        }
        if (str == null) {
            str = V8ValueNull.NULL;
        }
        try {
            int i2 = this.rl / 4;
            if (str.length() > i2) {
                str = "..." + str.substring(str.length() - i2);
            }
            this.f4202t.T(String.format(Locale.US, "%d %s%n", Long.valueOf(j2), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(nr));
            while (!this.f4202t.eF() && this.f4202t.K() > this.rl) {
                this.f4202t.n1();
            }
        } catch (IOException e2) {
            h1M.CN3.J2().O("There was a problem writing to the Crashlytics log.", e2);
        }
    }

    private void KN() {
        if (this.f4202t == null) {
            try {
                this.f4202t = new fuX(this.f4201n);
            } catch (IOException e2) {
                h1M.CN3.J2().O("Could not open log file: " + this.f4201n, e2);
            }
        }
    }

    private n Uo() {
        if (!this.f4201n.exists()) {
            return null;
        }
        KN();
        fuX fux = this.f4202t;
        if (fux == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[fux.K()];
        try {
            this.f4202t.M7(new j(bArr, iArr));
        } catch (IOException e2) {
            h1M.CN3.J2().O("A problem occurred while reading the Crashlytics log file.", e2);
        }
        return new n(bArr, iArr[0]);
    }

    @Override // IRN.Ml
    public void n() {
        QNA.Dsr.J2(this.f4202t, "There was a problem closing the Crashlytics log file.");
        this.f4202t = null;
    }

    Dsr(File file, int i2) {
        this.f4201n = file;
        this.rl = i2;
    }

    @Override // IRN.Ml
    public void O(long j2, String str) {
        KN();
        J2(j2, str);
    }

    @Override // IRN.Ml
    public void nr() {
        n();
        this.f4201n.delete();
    }

    @Override // IRN.Ml
    public String rl() {
        byte[] bArrT = t();
        if (bArrT != null) {
            return new String(bArrT, nr);
        }
        return null;
    }

    @Override // IRN.Ml
    public byte[] t() {
        n nVarUo = Uo();
        if (nVarUo == null) {
            return null;
        }
        int i2 = nVarUo.rl;
        byte[] bArr = new byte[i2];
        System.arraycopy(nVarUo.f4205n, 0, bArr, 0, i2);
        return bArr;
    }
}
