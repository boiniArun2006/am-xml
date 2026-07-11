package KaW;

import com.safedk.android.analytics.brandsafety.creatives.g;
import io.grpc.internal.mrQ;
import io.grpc.internal.psW;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class Ml {
    public static final ISg.Ml J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final ISg.Ml f5519O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ISg.Ml f5520n;
    public static final ISg.Ml nr;
    public static final ISg.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ISg.Ml f5521t;

    static {
        ByteString byteString = ISg.Ml.Uo;
        f5520n = new ISg.Ml(byteString, "https");
        rl = new ISg.Ml(byteString, g.f62375e);
        ByteString byteString2 = ISg.Ml.f4266O;
        f5521t = new ISg.Ml(byteString2, "POST");
        nr = new ISg.Ml(byteString2, "GET");
        f5519O = new ISg.Ml(psW.mUb.nr(), "application/grpc");
        J2 = new ISg.Ml("te", "trailers");
    }

    public static List rl(io.grpc.QJ qj, String str, String str2, String str3, boolean z2, boolean z3) {
        t1.Xo.ck(qj, "headers");
        t1.Xo.ck(str, "defaultPath");
        t1.Xo.ck(str2, "authority");
        t(qj);
        ArrayList arrayList = new ArrayList(io.grpc.C.n(qj) + 7);
        if (z3) {
            arrayList.add(rl);
        } else {
            arrayList.add(f5520n);
        }
        if (z2) {
            arrayList.add(nr);
        } else {
            arrayList.add(f5521t);
        }
        arrayList.add(new ISg.Ml(ISg.Ml.KN, str2));
        arrayList.add(new ISg.Ml(ISg.Ml.J2, str));
        arrayList.add(new ISg.Ml(psW.qie.nr(), str3));
        arrayList.add(f5519O);
        arrayList.add(J2);
        return n(arrayList, qj);
    }

    private static void t(io.grpc.QJ qj) {
        qj.O(psW.mUb);
        qj.O(psW.gh);
        qj.O(psW.qie);
    }

    private static List n(List list, io.grpc.QJ qj) {
        byte[][] bArrNr = mrQ.nr(qj);
        for (int i2 = 0; i2 < bArrNr.length; i2 += 2) {
            ByteString byteStringOf = ByteString.of(bArrNr[i2]);
            if (byteStringOf.size() != 0 && byteStringOf.getByte(0) != 58) {
                list.add(new ISg.Ml(byteStringOf, ByteString.of(bArrNr[i2 + 1])));
            }
        }
        return list;
    }
}
