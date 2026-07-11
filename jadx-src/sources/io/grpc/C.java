package io.grpc;

import com.google.common.io.BaseEncoding;
import io.grpc.QJ;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Charset f68152n = Charset.forName(com.google.android.exoplayer2.C.ASCII_NAME);
    public static final BaseEncoding rl = QJ.J2;

    public interface j extends QJ.aC {
    }

    public static QJ.CN3 rl(String str, j jVar) {
        boolean z2 = false;
        if (str != null && !str.isEmpty() && str.charAt(0) == ':') {
            z2 = true;
        }
        return QJ.CN3.Uo(str, z2, jVar);
    }

    public static QJ t(byte[]... bArr) {
        return new QJ(bArr);
    }

    public static int n(QJ qj) {
        return qj.KN();
    }

    public static byte[][] nr(QJ qj) {
        return qj.Ik();
    }
}
