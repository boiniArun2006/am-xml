package Lf;

import Be4.P;
import Lf.Dsr;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import okio.Okio;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j implements Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Uri f6170n;
    private final FjR.C rl;

    /* JADX INFO: renamed from: Lf.j$j, reason: collision with other inner class name */
    public static final class C0222j implements Dsr.j {
        @Override // Lf.Dsr.j
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public Dsr n(Uri uri, FjR.C c2, eQ.fuX fux) {
            if (!kYF.C.ck(uri)) {
                return null;
            }
            return new j(uri, c2);
        }
    }

    @Override // Lf.Dsr
    public Object n(Continuation continuation) {
        String strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.drop(this.f6170n.getPathSegments(), 1), "/", null, null, 0, null, null, 62, null);
        return new qz(P.J2(Okio.buffer(Okio.source(this.rl.Uo().getAssets().open(strJoinToString$default))), this.rl.Uo(), new Be4.j(strJoinToString$default)), kYF.C.mUb(MimeTypeMap.getSingleton(), strJoinToString$default), Be4.CN3.f516O);
    }

    public j(Uri uri, FjR.C c2) {
        this.f6170n = uri;
        this.rl = c2;
    }
}
