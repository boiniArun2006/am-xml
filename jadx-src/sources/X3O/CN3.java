package X3O;

import android.net.Uri;
import com.safedk.android.analytics.brandsafety.FileUploadManager;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class CN3 extends Wre {
    private final long HI;
    private final int Ik;
    private final Uri az;
    private final boolean ck;
    private final byte[] ty;

    @Override // X3O.I28
    protected byte[] KN() {
        return this.ty;
    }

    @Override // X3O.I28
    protected String O() {
        return "POST";
    }

    @Override // X3O.I28
    public Uri XQ() {
        return this.az;
    }

    @Override // X3O.I28
    protected int xMQ() {
        int i2 = this.Ik;
        if (i2 > 0) {
            return i2;
        }
        return 0;
    }

    public CN3(O6.fuX fux, com.google.firebase.Wre wre, Uri uri, byte[] bArr, long j2, int i2, boolean z2) {
        super(fux, wre);
        if (bArr == null && i2 != -1) {
            this.f11739n = new IllegalArgumentException("contentType is null or empty");
        }
        if (j2 < 0) {
            this.f11739n = new IllegalArgumentException("offset cannot be negative");
        }
        this.Ik = i2;
        this.az = uri;
        this.ty = i2 <= 0 ? null : bArr;
        this.HI = j2;
        this.ck = z2;
        super.X("X-Goog-Upload-Protocol", "resumable");
        if (z2 && i2 > 0) {
            super.X("X-Goog-Upload-Command", "upload, finalize");
        } else if (z2) {
            super.X("X-Goog-Upload-Command", "finalize");
        } else {
            super.X("X-Goog-Upload-Command", FileUploadManager.f61574l);
        }
        super.X("X-Goog-Upload-Offset", Long.toString(j2));
    }
}
