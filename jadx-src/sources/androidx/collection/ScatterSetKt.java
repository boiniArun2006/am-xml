package androidx.collection;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a)\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\t¨\u0006\u000b"}, d2 = {"E", "Landroidx/collection/MutableScatterSet;", c.f62177j, "()Landroidx/collection/MutableScatterSet;", "element1", "element2", "rl", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableScatterSet;", "", "Landroidx/collection/MutableScatterSet;", "EmptyScatterSet", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1210:1\n1#2:1211\n*E\n"})
public final class ScatterSetKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final MutableScatterSet f14894n = new MutableScatterSet(0);

    public static final MutableScatterSet n() {
        return new MutableScatterSet(0, 1, null);
    }

    public static final MutableScatterSet rl(Object obj, Object obj2) {
        MutableScatterSet mutableScatterSet = new MutableScatterSet(2);
        mutableScatterSet.ViF(obj);
        mutableScatterSet.ViF(obj2);
        return mutableScatterSet;
    }
}
