package LdY;

import LdY.Ml;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.installations.ktx.Bq.YjqZUJsVmhcjko;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class Ml {
    private final File HI;
    private Object J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ArrayDeque f6148O;
    private ArrayDeque Uo;
    private List az;
    private Function2 ck;
    private boolean gh;
    private final List mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f6149n;
    private final Function1 nr;
    private boolean qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f6150t;
    private int ty;
    private boolean xMQ;
    public static final w6 Ik = new w6(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f6147r = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final j f6146o = new n();

    /* JADX INFO: renamed from: LdY.Ml$Ml, reason: collision with other inner class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class C0221Ml implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f6151n = true;

        @Override // LdY.Ml.j
        public void n() {
            O(false);
            Log.v("UndoManager", "endBatch()");
            CollectionsKt.removeAll(Ml.this.mUb, new Function1() { // from class: LdY.I28
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(Ml.C0221Ml.nr(this.f6145n, (WeakReference) obj));
                }
            });
        }

        C0221Ml() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean nr(C0221Ml c0221Ml, WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Intrinsics.areEqual(it.get(), c0221Ml);
        }

        public void O(boolean z2) {
            this.f6151n = z2;
        }

        @Override // LdY.Ml.j
        public boolean rl() {
            return this.f6151n;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public interface j {
        void n();

        boolean rl();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class w6 {
        public /* synthetic */ w6(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private w6() {
        }

        public final j n() {
            return Ml.f6146o;
        }
    }

    protected abstract byte[] Ik(Object obj);

    protected abstract Object XQ(byte[] bArr);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
    public static final class n implements j {
        @Override // LdY.Ml.j
        public void n() {
        }

        @Override // LdY.Ml.j
        public boolean rl() {
            return false;
        }

        n() {
        }
    }

    public Ml(Context context, String tag, Object initialDocumentState, boolean z2, Function1 applyNewState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(initialDocumentState, "initialDocumentState");
        Intrinsics.checkNotNullParameter(applyNewState, "applyNewState");
        this.f6149n = context;
        this.rl = tag;
        this.f6150t = z2;
        this.nr = applyNewState;
        this.f6148O = new ArrayDeque();
        this.J2 = initialDocumentState;
        this.Uo = new ArrayDeque();
        this.mUb = new ArrayList();
        this.gh = true;
        this.az = CollectionsKt.emptyList();
        File file = new File(context.getFilesDir(), "undo");
        file.mkdirs();
        this.HI = file;
    }

    private final void S() {
        this.ty++;
        if (xMQ() == this.xMQ && mUb() == this.KN) {
            return;
        }
        Log.i("UndoManager", "Undo/redo availability changed: canUndo(" + this.KN + "->" + mUb() + YjqZUJsVmhcjko.fNcpANYfwMRmstT + this.xMQ + "->" + xMQ() + ")");
        this.xMQ = xMQ();
        this.KN = mUb();
        Function2 function2 = this.ck;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(mUb()), Boolean.valueOf(xMQ()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Uo(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    private final Object Z(String str) {
        try {
            return XQ(FilesKt.readBytes(new File(this.HI, str)));
        } catch (IOException unused) {
            return null;
        }
    }

    private final boolean gh() {
        CollectionsKt.removeAll(this.mUb, new Function1() { // from class: LdY.w6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Ml.t((WeakReference) obj));
            }
        });
        return !this.mUb.isEmpty();
    }

    private final boolean mUb() {
        return this.f6150t && !this.f6148O.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(WeakReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.get() == null;
    }

    private final boolean xMQ() {
        return this.f6150t && !this.Uo.isEmpty();
    }

    public final void HI() {
        if (this.f6150t) {
            if (this.qie) {
                Log.w("UndoManager", "Operation ignored while processing existing action (tried 'redo' during 'redo')");
                return;
            }
            this.qie = true;
            Log.i("UndoManager", "Begin 'redo'");
            try {
                if (xMQ()) {
                    Log.i("UndoManager", "Performing redo");
                    this.f6148O.push(this.J2);
                    Object objPop = this.Uo.pop();
                    this.J2 = objPop;
                    this.nr.invoke(objPop);
                    S();
                    this.qie = false;
                    Log.i("UndoManager", "End 'redo'");
                }
            } finally {
                this.qie = false;
            }
        }
    }

    public final j J2() {
        if (!this.f6150t) {
            return f6146o;
        }
        Log.v("UndoManager", "beginBatch()");
        this.gh = true;
        CollectionsKt.removeAll(this.mUb, new Function1() { // from class: LdY.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(Ml.Uo((WeakReference) obj));
            }
        });
        C0221Ml c0221Ml = new C0221Ml();
        this.mUb.add(new WeakReference(c0221Ml));
        return c0221Ml;
    }

    public final void az(Bundle bundle) {
        if (bundle == null || !this.f6150t) {
            KN();
            return;
        }
        String string = bundle.getString("undomgr." + this.rl + ".instancetag");
        int i2 = bundle.getInt("undomgr." + this.rl + ".pastcount");
        int i3 = bundle.getInt("undomgr." + this.rl + ".futurecount");
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("_present.state");
        Object objZ = Z(sb.toString());
        IntRange intRangeUntil = RangesKt.until(0, i2);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            Object objZ2 = Z(string + "_past_" + ((IntIterator) it).nextInt() + ".state");
            if (objZ2 != null) {
                arrayList.add(objZ2);
            }
        }
        IntRange intRangeUntil2 = RangesKt.until(0, i3);
        ArrayList arrayList2 = new ArrayList();
        Iterator<Integer> it2 = intRangeUntil2.iterator();
        while (it2.hasNext()) {
            Object objZ3 = Z(string + "_future_" + ((IntIterator) it2).nextInt() + ".state");
            if (objZ3 != null) {
                arrayList2.add(objZ3);
            }
        }
        if (objZ != null && arrayList.size() == i2 && arrayList2.size() == i3) {
            this.J2 = objZ;
            this.Uo.clear();
            this.Uo.addAll(arrayList2);
            this.f6148O.clear();
            this.f6148O.addAll(arrayList);
        } else if (i2 > 0 || i3 > 0 || objZ != null) {
            Log.w("UndoManager", "Malformed undo/redo state");
        }
        KN();
    }

    public final void ck(Object newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        if (this.f6150t) {
            if (this.qie) {
                Log.w("UndoManager", "Operation ignored while processing existing action (tried 'registerDocState' during 'registerDocState')");
                return;
            }
            this.qie = true;
            Log.i("UndoManager", "Begin 'registerDocState'");
            try {
                if (this.J2 == newState) {
                    Log.v("UndoManager", "Skip document state change; states are identical");
                    return;
                }
                Log.v("UndoManager", "Document state change detected inBatch=" + gh() + " emptyBatch=" + this.gh);
                if (gh()) {
                    if (!this.gh) {
                        Log.v("UndoManager", "Update batch");
                        this.J2 = newState;
                        return;
                    } else {
                        Log.i("UndoManager", "Begin new batch");
                        this.gh = false;
                    }
                }
                this.Uo.clear();
                this.f6148O.push(this.J2);
                this.J2 = newState;
                Log.i("UndoManager", "Document state change registered; stack size = " + this.f6148O.size());
                S();
                this.qie = false;
                Log.i("UndoManager", "End 'registerDocState'");
            } finally {
                this.qie = false;
            }
        }
    }

    public final void o() {
        if (this.f6150t) {
            if (this.qie) {
                Log.w("UndoManager", "Operation ignored while processing existing action (tried 'undo' during 'undo')");
                return;
            }
            this.qie = true;
            Log.i("UndoManager", "Begin 'undo'");
            try {
                if (mUb()) {
                    Log.i("UndoManager", "Performing undo");
                    this.Uo.push(this.J2);
                    Object objPop = this.f6148O.pop();
                    this.J2 = objPop;
                    this.nr.invoke(objPop);
                    S();
                    this.qie = false;
                    Log.i("UndoManager", "End 'undo'");
                }
            } finally {
                this.qie = false;
            }
        }
    }

    public final int qie() {
        return this.ty;
    }

    public final void r(Function2 function2) {
        this.ck = function2;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(mUb()), Boolean.valueOf(xMQ()));
        }
    }

    public final void ty(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (this.f6150t) {
            String str = this.rl + "_" + UUID.randomUUID();
            this.az = CollectionsKt.emptyList();
            int i2 = 0;
            int i3 = 0;
            for (Object obj : this.f6148O) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                File file = new File(this.HI, str + "_past_" + i3 + ".state");
                this.az = CollectionsKt.plus((Collection<? extends String>) this.az, file.getName());
                Intrinsics.checkNotNull(obj);
                FilesKt.writeBytes(file, Ik(obj));
                i3 = i5;
            }
            for (Object obj2 : this.Uo) {
                int i7 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                File file2 = new File(this.HI, str + "_future_" + i2 + ".state");
                this.az = CollectionsKt.plus((Collection<? extends String>) this.az, file2.getName());
                Intrinsics.checkNotNull(obj2);
                FilesKt.writeBytes(file2, Ik(obj2));
                i2 = i7;
            }
            File file3 = new File(this.HI, str + "_present.state");
            this.az = CollectionsKt.plus((Collection<? extends String>) this.az, file3.getName());
            FilesKt.writeBytes(file3, Ik(this.J2));
            outState.putInt("undomgr." + this.rl + ".pastcount", this.f6148O.size());
            outState.putInt("undomgr." + this.rl + ".futurecount", this.Uo.size());
            outState.putString("undomgr." + this.rl + ".instancetag", str);
        }
    }

    private final void KN() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        File[] fileArrListFiles = this.HI.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isFile() && jCurrentTimeMillis - file.lastModified() > 10800000 && !this.az.contains(file.getName())) {
                    file.delete();
                }
            }
        }
    }
}
