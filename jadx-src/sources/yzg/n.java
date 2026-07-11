package yzg;

import K7m.fuX;
import a88.Pl;
import android.view.View;
import g4f.I28;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class n {
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f76218n = new HashMap();
    private final HashMap rl = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HashMap f76219t = new HashMap();
    private final HashSet nr = new HashSet();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final HashSet f76217O = new HashSet();
    private final HashSet J2 = new HashSet();
    private final HashMap Uo = new HashMap();
    private final HashSet KN = new HashSet();
    private final Map xMQ = new WeakHashMap();

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final I28 f76220n;
        private final ArrayList rl = new ArrayList();

        public I28 n() {
            return this.f76220n;
        }

        public void rl(String str) {
            this.rl.add(str);
        }

        public ArrayList t() {
            return this.rl;
        }

        public j(I28 i28, String str) {
            this.f76220n = i28;
            rl(str);
        }
    }

    public void ty() {
        this.mUb = true;
    }

    public HashSet KN() {
        return this.J2;
    }

    public String Uo(String str) {
        return (String) this.Uo.get(str);
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
        return this.f76217O;
    }

    public String mUb(View view) {
        if (this.f76218n.size() == 0) {
            return null;
        }
        String str = (String) this.f76218n.get(view);
        if (str != null) {
            this.f76218n.remove(view);
        }
        return str;
    }

    public View n(String str) {
        return (View) this.f76219t.get(str);
    }

    public void nr() {
        this.f76218n.clear();
        this.rl.clear();
        this.f76219t.clear();
        this.nr.clear();
        this.f76217O.clear();
        this.J2.clear();
        this.Uo.clear();
        this.mUb = false;
        this.KN.clear();
    }

    public boolean qie(String str) {
        return this.KN.contains(str);
    }

    public j xMQ(View view) {
        j jVar = (j) this.rl.get(view);
        if (jVar != null) {
            this.rl.remove(view);
        }
        return jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void J2(I28 i28, Pl pl) {
        View view = (View) i28.t().get();
        if (view == null) {
            return;
        }
        j jVar = (j) this.rl.get(view);
        if (jVar != null) {
            jVar.rl(pl.az());
        } else {
            this.rl.put(view, new j(i28, pl.az()));
        }
    }

    private void O(Pl pl) {
        Iterator it = pl.ck().iterator();
        while (it.hasNext()) {
            J2((I28) it.next(), pl);
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
        g4f.w6 w6VarO = g4f.w6.O();
        if (w6VarO != null) {
            for (Pl pl : w6VarO.n()) {
                View viewHI = pl.HI();
                if (pl.r()) {
                    String strAz = pl.az();
                    if (viewHI != null) {
                        boolean zO = fuX.O(viewHI);
                        if (zO) {
                            this.KN.add(strAz);
                        }
                        String strT = t(viewHI, zO);
                        if (strT == null) {
                            this.f76217O.add(strAz);
                            this.f76218n.put(viewHI, strAz);
                            O(pl);
                        } else if (strT != "noWindowFocus") {
                            this.J2.add(strAz);
                            this.f76219t.put(strAz, viewHI);
                            this.Uo.put(strAz, strT);
                        }
                    } else {
                        this.J2.add(strAz);
                        this.Uo.put(strAz, "noAdView");
                    }
                }
            }
        }
    }
}
