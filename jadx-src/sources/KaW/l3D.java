package KaW;

import io.grpc.internal.mrQ;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Logger f5596n = Logger.getLogger(l3D.class.getName());

    public static io.grpc.QJ n(List list) {
        return io.grpc.C.t(rl(list));
    }

    private static byte[][] rl(List list) {
        byte[][] bArr = new byte[list.size() * 2][];
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            ISg.Ml ml = (ISg.Ml) it.next();
            int i3 = i2 + 1;
            bArr[i2] = ml.f4267n.toByteArray();
            i2 += 2;
            bArr[i3] = ml.rl.toByteArray();
        }
        return mrQ.O(bArr);
    }

    public static io.grpc.QJ t(List list) {
        return io.grpc.C.t(rl(list));
    }
}
