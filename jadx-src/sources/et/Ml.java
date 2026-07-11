package et;

import et.n;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final XA.Ml f63864n;
    private final kotlinx.serialization.json.n rl;

    public Ml(XA.Ml serializer, kotlinx.serialization.json.n json) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f63864n = serializer;
        this.rl = json;
    }

    @Override // et.n
    public x0X.n n(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            return new n.w6(this.rl.t(this.f63864n, jsonString));
        } catch (Exception e2) {
            return new n.C1266n(e2);
        }
    }

    @Override // et.n
    public x0X.n t(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        try {
            return new n.w6(this.rl.rl(this.f63864n, obj));
        } catch (Exception e2) {
            return new n.C1266n(e2);
        }
    }

    @Override // et.n
    public x0X.n rl(BufferedSource bufferedSource) {
        return n.j.n(this, bufferedSource);
    }
}
