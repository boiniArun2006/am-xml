package Du;

import EJn.Xo;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Mf extends Sis {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final EJn.Wre f1971t;

    private static final class j implements Map.Entry, KMappedMarker {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f1972n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Object f1973t;

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Intrinsics.areEqual(this.f1972n, jVar.f1972n) && Intrinsics.areEqual(this.f1973t, jVar.f1973t);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f1972n;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f1973t;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.f1972n;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.f1973t;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.f1972n + ", value=" + this.f1973t + ')';
        }

        public j(Object obj, Object obj2) {
            this.f1972n = obj;
            this.f1973t = obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mf(final XA.Ml keySerializer, final XA.Ml valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.f1971t = EJn.qz.Uo("kotlin.collections.Map.Entry", Xo.w6.f2285n, new EJn.Wre[0], new Function1() { // from class: Du.KH
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Mf.KN(keySerializer, valueSerializer, (EJn.j) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KN(XA.Ml ml, XA.Ml ml2, EJn.j buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        EJn.j.rl(buildSerialDescriptor, "key", ml.getDescriptor(), null, false, 12, null);
        EJn.j.rl(buildSerialDescriptor, "value", ml2.getDescriptor(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    @Override // XA.Ml, XA.eO, XA.w6
    public EJn.Wre getDescriptor() {
        return this.f1971t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Sis
    /* JADX INFO: renamed from: gh, reason: merged with bridge method [inline-methods] */
    public Map.Entry J2(Object obj, Object obj2) {
        return new j(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Sis
    /* JADX INFO: renamed from: mUb, reason: merged with bridge method [inline-methods] */
    public Object nr(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Du.Sis
    /* JADX INFO: renamed from: xMQ, reason: merged with bridge method [inline-methods] */
    public Object rl(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }
}
