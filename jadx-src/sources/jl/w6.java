package jl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class w6 implements I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f69624n;

    public w6(Set set) {
        this.f69624n = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            I28 i28 = (I28) it.next();
            if (i28 != null) {
                this.f69624n.add(i28);
            }
        }
    }

    private void qie(String str, Throwable th) {
        Dzy.j.xMQ("ForwardingRequestListener", str, th);
    }

    @Override // com.facebook.imagepipeline.producers.O
    public void J2(String str, String str2, Throwable th, Map map) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).J2(str, str2, th, map);
            } catch (Exception e2) {
                qie("InternalListener exception in onProducerFinishWithFailure", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.O
    public void KN(String str, String str2, boolean z2) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).KN(str, str2, z2);
            } catch (Exception e2) {
                qie("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.O
    public void O(String str, String str2, Map map) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).O(str, str2, map);
            } catch (Exception e2) {
                qie("InternalListener exception in onProducerFinishWithSuccess", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.O
    public void Uo(String str, String str2, Map map) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).Uo(str, str2, map);
            } catch (Exception e2) {
                qie("InternalListener exception in onProducerFinishWithCancellation", e2);
            }
        }
    }

    @Override // jl.I28
    public void gh(String str) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).gh(str);
            } catch (Exception e2) {
                qie("InternalListener exception in onRequestCancellation", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.O
    public void mUb(String str, String str2, String str3) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).mUb(str, str2, str3);
            } catch (Exception e2) {
                qie("InternalListener exception in onIntermediateChunkStart", e2);
            }
        }
    }

    @Override // jl.I28
    public void n(com.facebook.imagepipeline.request.j jVar, Object obj, String str, boolean z2) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).n(jVar, obj, str, z2);
            } catch (Exception e2) {
                qie("InternalListener exception in onRequestStart", e2);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.O
    public boolean nr(String str) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((I28) this.f69624n.get(i2)).nr(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.O
    public void rl(String str, String str2) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).rl(str, str2);
            } catch (Exception e2) {
                qie("InternalListener exception in onProducerStart", e2);
            }
        }
    }

    @Override // jl.I28
    public void t(com.facebook.imagepipeline.request.j jVar, String str, boolean z2) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).t(jVar, str, z2);
            } catch (Exception e2) {
                qie("InternalListener exception in onRequestSuccess", e2);
            }
        }
    }

    @Override // jl.I28
    public void xMQ(com.facebook.imagepipeline.request.j jVar, String str, Throwable th, boolean z2) {
        int size = this.f69624n.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((I28) this.f69624n.get(i2)).xMQ(jVar, str, th, z2);
            } catch (Exception e2) {
                qie("InternalListener exception in onRequestFailure", e2);
            }
        }
    }

    public w6(I28... i28Arr) {
        this.f69624n = new ArrayList(i28Arr.length);
        for (I28 i28 : i28Arr) {
            if (i28 != null) {
                this.f69624n.add(i28);
            }
        }
    }
}
