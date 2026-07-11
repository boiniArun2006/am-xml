package eK;

import eK.Wre;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n {
    public static final j az = new j(null);
    private static final Map ty = MapsKt.hashMapOf(TuplesKt.to("embedding.weight", "embed.weight"), TuplesKt.to("dense1.weight", "fc1.weight"), TuplesKt.to("dense2.weight", "fc2.weight"), TuplesKt.to("dense3.weight", "fc3.weight"), TuplesKt.to("dense1.bias", "fc1.bias"), TuplesKt.to("dense2.bias", "fc2.bias"), TuplesKt.to("dense3.bias", "fc3.bias"));
    private final eK.j J2;
    private final eK.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final eK.j f63603O;
    private final eK.j Uo;
    private final eK.j gh;
    private final eK.j mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final eK.j f63604n;
    private final eK.j nr;
    private final Map qie;
    private final eK.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final eK.j f63605t;
    private final eK.j xMQ;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final n n(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            Map mapRl = rl(file);
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (mapRl == null) {
                return null;
            }
            try {
                return new n(mapRl, defaultConstructorMarker);
            } catch (Exception unused) {
                return null;
            }
        }

        private final Map rl(File file) {
            Map mapT = aC.t(file);
            if (mapT == null) {
                return null;
            }
            HashMap map = new HashMap();
            Map mapN = n.n();
            for (Map.Entry entry : mapT.entrySet()) {
                String str = (String) entry.getKey();
                if (mapN.containsKey(entry.getKey()) && (str = (String) mapN.get(entry.getKey())) == null) {
                    return null;
                }
                map.put(str, entry.getValue());
            }
            return map;
        }
    }

    public /* synthetic */ n(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    private n(Map map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63604n = (eK.j) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.rl = Dsr.qie((eK.j) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63605t = Dsr.qie((eK.j) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.nr = Dsr.qie((eK.j) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f63603O = (eK.j) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.J2 = (eK.j) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.Uo = (eK.j) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.KN = Dsr.gh((eK.j) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.xMQ = Dsr.gh((eK.j) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.mUb = (eK.j) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.gh = (eK.j) obj11;
        this.qie = new HashMap();
        for (String str : SetsKt.setOf((Object[]) new String[]{Wre.j.MTML_INTEGRITY_DETECT.rl(), Wre.j.MTML_APP_EVENT_PREDICTION.rl()})) {
            String str2 = str + ".weight";
            String str3 = str + ".bias";
            eK.j jVar = (eK.j) map.get(str2);
            eK.j jVar2 = (eK.j) map.get(str3);
            if (jVar != null) {
                this.qie.put(str2, Dsr.gh(jVar));
            }
            if (jVar2 != null) {
                this.qie.put(str3, jVar2);
            }
        }
    }

    public static final /* synthetic */ Map n() {
        if (VmF.j.nr(n.class)) {
            return null;
        }
        try {
            return ty;
        } catch (Throwable th) {
            VmF.j.rl(th, n.class);
            return null;
        }
    }

    public final eK.j rl(eK.j dense, String[] texts, String task) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(dense, "dense");
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(task, "task");
            eK.j jVarT = Dsr.t(Dsr.O(texts, 128, this.f63604n), this.rl);
            Dsr.n(jVarT, this.f63603O);
            Dsr.xMQ(jVarT);
            eK.j jVarT2 = Dsr.t(jVarT, this.f63605t);
            Dsr.n(jVarT2, this.J2);
            Dsr.xMQ(jVarT2);
            eK.j jVarUo = Dsr.Uo(jVarT2, 2);
            eK.j jVarT3 = Dsr.t(jVarUo, this.nr);
            Dsr.n(jVarT3, this.Uo);
            Dsr.xMQ(jVarT3);
            eK.j jVarUo2 = Dsr.Uo(jVarT, jVarT.rl(1));
            eK.j jVarUo3 = Dsr.Uo(jVarUo, jVarUo.rl(1));
            eK.j jVarUo4 = Dsr.Uo(jVarT3, jVarT3.rl(1));
            Dsr.J2(jVarUo2, 1);
            Dsr.J2(jVarUo3, 1);
            Dsr.J2(jVarUo4, 1);
            eK.j jVarNr = Dsr.nr(Dsr.rl(new eK.j[]{jVarUo2, jVarUo3, jVarUo4, dense}), this.KN, this.mUb);
            Dsr.xMQ(jVarNr);
            eK.j jVarNr2 = Dsr.nr(jVarNr, this.xMQ, this.gh);
            Dsr.xMQ(jVarNr2);
            eK.j jVar = (eK.j) this.qie.get(task + ".weight");
            eK.j jVar2 = (eK.j) this.qie.get(task + ".bias");
            if (jVar != null && jVar2 != null) {
                eK.j jVarNr3 = Dsr.nr(jVarNr2, jVar, jVar2);
                Dsr.mUb(jVarNr3);
                return jVarNr3;
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }
}
