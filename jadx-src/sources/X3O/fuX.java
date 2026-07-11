package X3O;

import android.net.Uri;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class fuX extends Wre {
    public static boolean ty;
    private final Uri az;

    @Override // X3O.I28
    protected String O() {
        return "POST";
    }

    @Override // X3O.I28
    public Uri XQ() {
        return this.az;
    }

    public fuX(O6.fuX fux, com.google.firebase.Wre wre, Uri uri) {
        super(fux, wre);
        ty = true;
        this.az = uri;
        super.X("X-Goog-Upload-Protocol", "resumable");
        super.X("X-Goog-Upload-Command", "cancel");
    }
}
