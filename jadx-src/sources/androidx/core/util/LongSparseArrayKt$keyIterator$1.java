package androidx.core.util;

import android.util.LongSparseArray;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.LongIterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/core/util/LongSparseArrayKt$keyIterator$1", "Lkotlin/collections/LongIterator;", "", "hasNext", "()Z", "", "nextLong", "()J", "", c.f62177j, "I", "getIndex", "()I", "setIndex", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LongSparseArrayKt$keyIterator$1 extends LongIterator {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ LongSparseArray f36678t;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.f36678t.size();
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        LongSparseArray longSparseArray = this.f36678t;
        int i2 = this.index;
        this.index = i2 + 1;
        return longSparseArray.keyAt(i2);
    }
}
