package androidx.core.util;

import android.util.SparseIntArray;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.IntIterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/core/util/SparseIntArrayKt$valueIterator$1", "Lkotlin/collections/IntIterator;", "", "hasNext", "()Z", "", "nextInt", "()I", c.f62177j, "I", "getIndex", "setIndex", "(I)V", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SparseIntArrayKt$valueIterator$1 extends IntIterator {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int index;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ SparseIntArray f36705t;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.f36705t.size();
    }

    @Override // kotlin.collections.IntIterator
    public int nextInt() {
        SparseIntArray sparseIntArray = this.f36705t;
        int i2 = this.index;
        this.index = i2 + 1;
        return sparseIntArray.valueAt(i2);
    }
}
