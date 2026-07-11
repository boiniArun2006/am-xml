package et;

import com.squareup.moshi.JsonAdapter;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class I28 implements n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f63863n;

    public I28(Lazy lazyMoshiAdapter) {
        Intrinsics.checkNotNullParameter(lazyMoshiAdapter, "lazyMoshiAdapter");
        this.f63863n = lazyMoshiAdapter;
    }

    private final JsonAdapter nr() {
        return (JsonAdapter) this.f63863n.getValue();
    }

    @Override // et.n
    public x0X.n n(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        try {
            Object objFromJson = nr().fromJson(jsonString);
            Intrinsics.checkNotNull(objFromJson);
            return new n.w6(objFromJson);
        } catch (Exception e2) {
            return new n.C1266n(e2);
        }
    }

    @Override // et.n
    public x0X.n rl(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            Object objFromJson = nr().fromJson(source);
            Intrinsics.checkNotNull(objFromJson);
            return new n.w6(objFromJson);
        } catch (Exception e2) {
            return new n.C1266n(e2);
        }
    }

    @Override // et.n
    public x0X.n t(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        try {
            return new n.w6(nr().toJson(obj));
        } catch (Exception e2) {
            return new n.C1266n(e2);
        }
    }
}
