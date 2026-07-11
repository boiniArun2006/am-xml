package androidx.compose.runtime;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/compose/runtime/SlotWriter$groupSlots$1", "", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", c.f62177j, "I", "getCurrent", "()I", "setCurrent", "(I)V", "current", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, KMappedMarker {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ SlotWriter f30397O;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int current;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ int f30399t;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.f30399t;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            Object[] objArr = this.f30397O.slots;
            SlotWriter slotWriter = this.f30397O;
            int i2 = this.current;
            this.current = i2 + 1;
            return objArr[slotWriter.U(i2)];
        }
        return null;
    }
}
