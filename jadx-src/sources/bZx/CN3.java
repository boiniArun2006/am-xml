package bZx;

import Zfb.w6;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import bZx.fuX;
import bZx.n;
import com.facebook.FacebookException;
import com.facebook.internal.QJ;
import com.facebook.internal.UGc;
import com.facebook.internal.ci;
import com.facebook.internal.vd;
import com.facebook.s4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 {
    private static CN3 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final HashMap f43330O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Handler f43331n;
    private HashSet nr;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f43332t;
    public static final j J2 = new j(null);
    private static final String Uo = CN3.class.getCanonicalName();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized CN3 n() {
            CN3 cn3Rl;
            try {
                if (CN3.rl() == null) {
                    CN3.nr(new CN3(null));
                }
                cn3Rl = CN3.rl();
                Intrinsics.checkNotNull(cn3Rl, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessMatcher");
            } catch (Throwable th) {
                throw th;
            }
            return cn3Rl;
        }

        private j() {
        }

        public final Bundle rl(Zfb.j jVar, View rootView, View hostView) {
            List<Zfb.n> listT;
            Zfb.j jVar2;
            View view;
            List listN;
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Bundle bundle = new Bundle();
            if (jVar != null && (listT = jVar.t()) != null) {
                for (Zfb.n nVar : listT) {
                    if (nVar.nr() != null && nVar.nr().length() > 0) {
                        bundle.putString(nVar.n(), nVar.nr());
                    } else if (nVar.rl().size() > 0) {
                        if (Intrinsics.areEqual(nVar.t(), "relative")) {
                            w6.j jVar3 = w6.f43334o;
                            List listRl = nVar.rl();
                            String simpleName = hostView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName, "hostView.javaClass.simpleName");
                            Zfb.j jVar4 = jVar;
                            listN = jVar3.n(jVar4, hostView, listRl, 0, -1, simpleName);
                            jVar2 = jVar4;
                            view = rootView;
                        } else {
                            jVar2 = jVar;
                            w6.j jVar5 = w6.f43334o;
                            List listRl2 = nVar.rl();
                            String simpleName2 = rootView.getClass().getSimpleName();
                            Intrinsics.checkNotNullExpressionValue(simpleName2, "rootView.javaClass.simpleName");
                            view = rootView;
                            listN = jVar5.n(jVar2, view, listRl2, 0, -1, simpleName2);
                        }
                        Iterator it = listN.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            n nVar2 = (n) it.next();
                            if (nVar2.n() != null) {
                                String strGh = Zfb.Wre.gh(nVar2.n());
                                if (strGh.length() > 0) {
                                    bundle.putString(nVar.n(), strGh);
                                    break;
                                }
                            }
                        }
                        jVar = jVar2;
                        rootView = view;
                    }
                }
            }
            return bundle;
        }
    }

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference f43333n;
        private final String rl;

        public n(View view, String viewMapKey) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
            this.f43333n = new WeakReference(view);
            this.rl = viewMapKey;
        }

        public final View n() {
            WeakReference weakReference = this.f43333n;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public final String rl() {
            return this.rl;
        }
    }

    public static final class w6 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final j f43334o = new j(null);
        private final HashSet J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Handler f43335O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WeakReference f43336n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final String f43337r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private List f43338t;

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private j() {
            }

            private final List rl(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View child = viewGroup.getChildAt(i2);
                    if (child.getVisibility() == 0) {
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        arrayList.add(child);
                    }
                }
                return arrayList;
            }

            public final List n(Zfb.j jVar, View view, List path, int i2, int i3, String mapKey) {
                Zfb.j jVar2;
                List list;
                j jVar3;
                Intrinsics.checkNotNullParameter(path, "path");
                Intrinsics.checkNotNullParameter(mapKey, "mapKey");
                String str = mapKey + '.' + i3;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (i2 >= path.size()) {
                        arrayList.add(new n(view, str));
                        jVar2 = jVar;
                        list = path;
                        jVar3 = this;
                    } else {
                        Zfb.w6 w6Var = (Zfb.w6) path.get(i2);
                        if (Intrinsics.areEqual(w6Var.n(), "..")) {
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                List listRl = rl((ViewGroup) parent);
                                int size = listRl.size();
                                int i5 = 0;
                                while (i5 < size) {
                                    Zfb.j jVar4 = jVar;
                                    List list2 = path;
                                    arrayList.addAll(n(jVar4, (View) listRl.get(i5), list2, i2 + 1, i5, str));
                                    i5++;
                                    jVar = jVar4;
                                    path = list2;
                                }
                            }
                        } else {
                            jVar2 = jVar;
                            list = path;
                            jVar3 = this;
                            if (Intrinsics.areEqual(w6Var.n(), ".")) {
                                arrayList.add(new n(view, str));
                                return arrayList;
                            }
                            if (t(view, w6Var, i3)) {
                                if (i2 == list.size() - 1) {
                                    arrayList.add(new n(view, str));
                                }
                            }
                        }
                    }
                    if (view instanceof ViewGroup) {
                        List listRl2 = rl((ViewGroup) view);
                        int size2 = listRl2.size();
                        int i7 = 0;
                        while (i7 < size2) {
                            arrayList.addAll(jVar3.n(jVar2, (View) listRl2.get(i7), list, i2 + 1, i7, str));
                            i7++;
                            jVar3 = this;
                        }
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.areEqual(r10.getClass().getSimpleName(), (java.lang.String) r12.get(r12.size() - 1)) == false) goto L15;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private final boolean t(View view, Zfb.w6 w6Var, int i2) {
                String string;
                String string2;
                if (w6Var.O() != -1 && i2 != w6Var.O()) {
                    return false;
                }
                if (!Intrinsics.areEqual(view.getClass().getCanonicalName(), w6Var.n())) {
                    if (new Regex(".*android\\..*").matches(w6Var.n())) {
                        List listSplit$default = StringsKt.split$default((CharSequence) w6Var.n(), new String[]{"."}, false, 0, 6, (Object) null);
                        if (!listSplit$default.isEmpty()) {
                        }
                    }
                    return false;
                }
                if ((w6Var.J2() & w6.n.ID.rl()) > 0 && w6Var.nr() != view.getId()) {
                    return false;
                }
                if ((w6Var.J2() & w6.n.TEXT.rl()) > 0) {
                    String strKN = w6Var.KN();
                    String strGh = Zfb.Wre.gh(view);
                    String strGh2 = vd.gh(vd.EWS(strGh), "");
                    if (!Intrinsics.areEqual(strKN, strGh) && !Intrinsics.areEqual(strKN, strGh2)) {
                        return false;
                    }
                }
                if ((w6Var.J2() & w6.n.DESCRIPTION.rl()) > 0) {
                    String strRl = w6Var.rl();
                    if (view.getContentDescription() == null) {
                        string2 = "";
                    } else {
                        string2 = view.getContentDescription().toString();
                    }
                    String strGh3 = vd.gh(vd.EWS(string2), "");
                    if (!Intrinsics.areEqual(strRl, string2) && !Intrinsics.areEqual(strRl, strGh3)) {
                        return false;
                    }
                }
                if ((w6Var.J2() & w6.n.HINT.rl()) > 0) {
                    String strT = w6Var.t();
                    String strXMQ = Zfb.Wre.xMQ(view);
                    String strGh4 = vd.gh(vd.EWS(strXMQ), "");
                    if (!Intrinsics.areEqual(strT, strXMQ) && !Intrinsics.areEqual(strT, strGh4)) {
                        return false;
                    }
                }
                if ((w6Var.J2() & w6.n.TAG.rl()) > 0) {
                    String strUo = w6Var.Uo();
                    if (view.getTag() == null) {
                        string = "";
                    } else {
                        string = view.getTag().toString();
                    }
                    String strGh5 = vd.gh(vd.EWS(string), "");
                    if (!Intrinsics.areEqual(strUo, string) && !Intrinsics.areEqual(strUo, strGh5)) {
                        return false;
                    }
                }
                return true;
            }
        }

        public w6(View view, Handler handler, HashSet listenerSet, String activityName) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            this.f43336n = new WeakReference(view);
            this.f43335O = handler;
            this.J2 = listenerSet;
            this.f43337r = activityName;
            handler.postDelayed(this, 200L);
        }

        private final void J2() {
            List list = this.f43338t;
            if (list == null || this.f43336n.get() == null) {
                return;
            }
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                O((Zfb.j) list.get(i2), (View) this.f43336n.get());
            }
        }

        private final void O(Zfb.j jVar, View view) {
            if (jVar == null || view == null) {
                return;
            }
            String strN = jVar.n();
            if (strN == null || strN.length() == 0 || Intrinsics.areEqual(jVar.n(), this.f43337r)) {
                List listNr = jVar.nr();
                if (listNr.size() > 25) {
                    return;
                }
                Iterator it = f43334o.n(jVar, view, listNr, 0, -1, this.f43337r).iterator();
                while (it.hasNext()) {
                    n((n) it.next(), view, jVar);
                }
            }
        }

        private final void n(n nVar, View view, Zfb.j jVar) {
            if (jVar == null) {
                return;
            }
            try {
                View viewN = nVar.n();
                if (viewN == null) {
                    return;
                }
                View viewN2 = Zfb.Wre.n(viewN);
                if (viewN2 != null && Zfb.Wre.f12562n.ck(viewN, viewN2)) {
                    nr(nVar, view, jVar);
                    return;
                }
                String name = viewN.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "view.javaClass.name");
                if (StringsKt.startsWith$default(name, "com.facebook.react", false, 2, (Object) null)) {
                    return;
                }
                if (!(viewN instanceof AdapterView)) {
                    rl(nVar, view, jVar);
                } else if (viewN instanceof ListView) {
                    t(nVar, view, jVar);
                }
            } catch (Exception e2) {
                vd.z(CN3.t(), e2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void nr(n nVar, View view, Zfb.j jVar) {
            boolean z2;
            View viewN = nVar.n();
            if (viewN != null) {
                String strRl = nVar.rl();
                View.OnTouchListener onTouchListenerKN = Zfb.Wre.KN(viewN);
                if (onTouchListenerKN instanceof fuX.j) {
                    Intrinsics.checkNotNull(onTouchListenerKN, "null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
                    if (((fuX.j) onTouchListenerKN).n()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!this.J2.contains(strRl) && !z2) {
                    viewN.setOnTouchListener(fuX.n(jVar, view, viewN));
                    this.J2.add(strRl);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void rl(n nVar, View view, Zfb.j jVar) {
            boolean z2;
            View viewN = nVar.n();
            if (viewN != null) {
                String strRl = nVar.rl();
                View.OnClickListener onClickListenerUo = Zfb.Wre.Uo(viewN);
                if (onClickListenerUo instanceof n.j) {
                    Intrinsics.checkNotNull(onClickListenerUo, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
                    if (((n.j) onClickListenerUo).n()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!this.J2.contains(strRl) && !z2) {
                    viewN.setOnClickListener(bZx.n.rl(jVar, view, viewN));
                    this.J2.add(strRl);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final void t(n nVar, View view, Zfb.j jVar) {
            boolean z2;
            AdapterView adapterView = (AdapterView) nVar.n();
            if (adapterView != null) {
                String strRl = nVar.rl();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (onItemClickListener instanceof n.C0579n) {
                    Intrinsics.checkNotNull(onItemClickListener, "null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
                    if (((n.C0579n) onItemClickListener).n()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (!this.J2.contains(strRl) && !z2) {
                    adapterView.setOnItemClickListener(bZx.n.t(jVar, view, adapterView));
                    this.J2.add(strRl);
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            J2();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            J2();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (!VmF.j.nr(this)) {
                try {
                    QJ qjJ2 = UGc.J2(s4.az());
                    if (qjJ2 != null && qjJ2.nr()) {
                        List listRl = Zfb.j.mUb.rl(qjJ2.KN());
                        this.f43338t = listRl;
                        if (listRl != null && (view = (View) this.f43336n.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            J2();
                        }
                    }
                } catch (Throwable th) {
                    VmF.j.rl(th, this);
                }
            }
        }
    }

    public /* synthetic */ CN3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CN3() {
        this.f43331n = new Handler(Looper.getMainLooper());
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        Intrinsics.checkNotNullExpressionValue(setNewSetFromMap, "newSetFromMap(WeakHashMap())");
        this.rl = setNewSetFromMap;
        this.f43332t = new LinkedHashSet();
        this.nr = new HashSet();
        this.f43330O = new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(CN3 this$0) {
        if (VmF.j.nr(CN3.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.Uo();
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
        }
    }

    public static final /* synthetic */ void nr(CN3 cn3) {
        if (VmF.j.nr(CN3.class)) {
            return;
        }
        try {
            KN = cn3;
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
        }
    }

    public static final /* synthetic */ CN3 rl() {
        if (VmF.j.nr(CN3.class)) {
            return null;
        }
        try {
            return KN;
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
            return null;
        }
    }

    public static final /* synthetic */ String t() {
        if (VmF.j.nr(CN3.class)) {
            return null;
        }
        try {
            return Uo;
        } catch (Throwable th) {
            VmF.j.rl(th, CN3.class);
            return null;
        }
    }

    private final void Uo() {
        if (!VmF.j.nr(this)) {
            try {
                for (Activity activity : this.rl) {
                    if (activity != null) {
                        View viewNr = UiE.fuX.nr(activity);
                        String activityName = activity.getClass().getSimpleName();
                        Handler handler = this.f43331n;
                        HashSet hashSet = this.nr;
                        Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
                        this.f43332t.add(new w6(viewNr, handler, hashSet, activityName));
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void xMQ() {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Uo();
            } else {
                this.f43331n.post(new Runnable() { // from class: bZx.Wre
                    @Override // java.lang.Runnable
                    public final void run() {
                        CN3.mUb(this.f43345n);
                    }
                });
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final void J2(Activity activity) {
        if (VmF.j.nr(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.f43330O.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            VmF.j.rl(th, this);
        }
    }

    public final void KN(Activity activity) {
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (ci.rl()) {
                    return;
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.rl.remove(activity);
                    this.f43332t.clear();
                    HashMap map = this.f43330O;
                    Integer numValueOf = Integer.valueOf(activity.hashCode());
                    Object objClone = this.nr.clone();
                    Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.HashSet<kotlin.String>{ kotlin.collections.TypeAliasesKt.HashSet<kotlin.String> }");
                    map.put(numValueOf, (HashSet) objClone);
                    this.nr.clear();
                    return;
                }
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    public final void O(Activity activity) {
        if (!VmF.j.nr(this)) {
            try {
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (ci.rl()) {
                    return;
                }
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    this.rl.add(activity);
                    this.nr.clear();
                    HashSet hashSet = (HashSet) this.f43330O.get(Integer.valueOf(activity.hashCode()));
                    if (hashSet != null) {
                        this.nr = hashSet;
                    }
                    xMQ();
                    return;
                }
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }
}
