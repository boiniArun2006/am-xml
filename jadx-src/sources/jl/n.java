package jl;

import androidx.media3.database.Kr.FlTC;
import com.facebook.imagepipeline.producers.mz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class n implements Ml {
    public static final j rl = new j(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f69623n;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public boolean J2(mz producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        List list = this.f69623n;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Ml) it.next()).J2(producerContext, producerName)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void KN(mz producerContext, String producerName, String producerEventName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Intrinsics.checkNotNullParameter(producerEventName, "producerEventName");
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).KN(producerContext, producerName, producerEventName);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // jl.Ml
    public void O(mz producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).O(producerContext);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // jl.Ml
    public void Uo(mz producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).Uo(producerContext);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void gh(mz mzVar, String str, Throwable th, Map map) {
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).gh(mzVar, str, th, map);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void mUb(mz mzVar, String str, Map map) {
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).mUb(mzVar, str, map);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // jl.Ml
    public void n(mz producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).n(producerContext);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in " + FlTC.QjrXZiHcr, e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void nr(mz producerContext, String producerName) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).nr(producerContext, producerName);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void rl(mz producerContext, String producerName, boolean z2) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(producerName, "producerName");
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).rl(producerContext, producerName, z2);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC1866p
    public void t(mz mzVar, String str, Map map) {
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).t(mzVar, str, map);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    @Override // jl.Ml
    public void xMQ(mz producerContext, Throwable throwable) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator it = this.f69623n.iterator();
        while (it.hasNext()) {
            try {
                ((Ml) it.next()).xMQ(producerContext, throwable);
            } catch (Exception e2) {
                Dzy.j.xMQ("ForwardingRequestListener2", "InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    public n(Set set) {
        if (set == null) {
            this.f69623n = new ArrayList();
            return;
        }
        ArrayList arrayList = new ArrayList(set.size());
        this.f69623n = arrayList;
        CollectionsKt.filterNotNullTo(set, arrayList);
    }
}
