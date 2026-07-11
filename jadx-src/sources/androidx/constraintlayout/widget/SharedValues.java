package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class SharedValues {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SparseIntArray f36098n = new SparseIntArray();
    private HashMap rl = new HashMap();

    public interface SharedValuesListener {
    }

    public void n(int i2, SharedValuesListener sharedValuesListener) {
        HashSet hashSet = (HashSet) this.rl.get(Integer.valueOf(i2));
        if (hashSet == null) {
            hashSet = new HashSet();
            this.rl.put(Integer.valueOf(i2), hashSet);
        }
        hashSet.add(new WeakReference(sharedValuesListener));
    }

    public void rl(int i2, SharedValuesListener sharedValuesListener) {
        HashSet<WeakReference> hashSet = (HashSet) this.rl.get(Integer.valueOf(i2));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (WeakReference weakReference : hashSet) {
            SharedValuesListener sharedValuesListener2 = (SharedValuesListener) weakReference.get();
            if (sharedValuesListener2 == null || sharedValuesListener2 == sharedValuesListener) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }
}
