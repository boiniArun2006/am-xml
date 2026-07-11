package fA;

import J2B.I28;
import Vy.Pl;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import upM.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class n {
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f66594n = new HashMap();
    private final HashMap rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HashMap f66595t = new HashMap();
    private final HashSet nr = new HashSet();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final HashSet f66593O = new HashSet();
    private final HashSet J2 = new HashSet();
    private final HashMap Uo = new HashMap();
    private final HashSet KN = new HashSet();
    private final Map xMQ = new WeakHashMap();

    public static class j {
        public abstract I28 n();

        public abstract ArrayList rl();
    }

    private void O(I28 i28, Pl pl) {
        throw null;
    }

    public void ty() {
        this.mUb = true;
    }

    public String KN(String str) {
        return (String) this.Uo.get(str);
    }

    public j Uo(View view) {
        return (j) this.rl.get(view);
    }

    public Ml az(View view) {
        return this.nr.contains(view) ? Ml.PARENT_VIEW : this.mUb ? Ml.OBSTRUCTION_VIEW : Ml.UNDERLYING_VIEW;
    }

    public boolean ck(View view) {
        if (!this.xMQ.containsKey(view)) {
            return true;
        }
        this.xMQ.put(view, Boolean.TRUE);
        return false;
    }

    public HashSet gh() {
        return this.f66593O;
    }

    public String mUb(View view) {
        if (this.f66594n.size() == 0) {
            return null;
        }
        String str = (String) this.f66594n.get(view);
        if (str != null) {
            this.f66594n.remove(view);
        }
        return str;
    }

    public View n(String str) {
        return (View) this.f66595t.get(str);
    }

    public void nr() {
        this.f66594n.clear();
        this.rl.clear();
        this.f66595t.clear();
        this.nr.clear();
        this.f66593O.clear();
        this.J2.clear();
        this.Uo.clear();
        this.mUb = false;
        this.KN.clear();
    }

    public boolean qie(String str) {
        return this.KN.contains(str);
    }

    public HashSet xMQ() {
        return this.J2;
    }

    private void J2(Pl pl) {
        Iterator it = pl.ty().iterator();
        while (it.hasNext()) {
            android.support.v4.media.j.n(it.next());
            O(null, pl);
        }
    }

    private Boolean rl(View view) {
        if (view.hasWindowFocus()) {
            this.xMQ.remove(view);
            return Boolean.FALSE;
        }
        if (this.xMQ.containsKey(view)) {
            return (Boolean) this.xMQ.get(view);
        }
        Map map = this.xMQ;
        Boolean bool = Boolean.FALSE;
        map.put(view, bool);
        return bool;
    }

    private String t(View view, boolean z2) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        if (rl(view).booleanValue() && !z2) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String strN = fuX.n(view);
            if (strN != null) {
                return strN;
            }
            hashSet.add(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        this.nr.addAll(hashSet);
        return null;
    }

    public void HI() {
        J2B.w6 w6VarO = J2B.w6.O();
        if (w6VarO != null) {
            for (Pl pl : w6VarO.n()) {
                View viewAz = pl.az();
                if (pl.ck()) {
                    String strGh = pl.gh();
                    if (viewAz != null) {
                        boolean zO = fuX.O(viewAz);
                        if (zO) {
                            this.KN.add(strGh);
                        }
                        String strT = t(viewAz, zO);
                        if (strT == null) {
                            this.f66593O.add(strGh);
                            this.f66594n.put(viewAz, strGh);
                            J2(pl);
                        } else if (strT != "noWindowFocus") {
                            this.J2.add(strGh);
                            this.f66595t.put(strGh, viewAz);
                            this.Uo.put(strGh, strT);
                        }
                    } else {
                        this.J2.add(strGh);
                        this.Uo.put(strGh, "noAdView");
                    }
                }
            }
        }
    }
}
