package eK;

import UiE.qz;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.GraphRequest;
import com.facebook.internal.Pl;
import com.facebook.internal.vd;
import com.facebook.s4;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.internal.SafeDKWebAppInterface;
import eK.Wre;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Wre f63591n = new Wre();
    private static final Map rl = new ConcurrentHashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final List f63592t = CollectionsKt.listOf((Object[]) new String[]{InneractiveMediationNameConsts.OTHER, "fb_mobile_complete_registration", "fb_mobile_add_to_cart", "fb_mobile_purchase", "fb_mobile_initiated_checkout"});
    private static final List nr = CollectionsKt.listOf((Object[]) new String[]{"none", SafeDKWebAppInterface.f62924j, "health"});

    public enum j {
        MTML_INTEGRITY_DETECT,
        MTML_APP_EVENT_PREDICTION;

        /* JADX INFO: renamed from: eK.Wre$j$j, reason: collision with other inner class name */
        public /* synthetic */ class C0843j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.MTML_INTEGRITY_DETECT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.MTML_APP_EVENT_PREDICTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final String rl() {
            int i2 = C0843j.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                return "integrity_detect";
            }
            if (i2 == 2) {
                return "app_event_pred";
            }
            throw new NoWhenBranchMatchedException();
        }

        public final String t() {
            int i2 = C0843j.$EnumSwitchMapping$0[ordinal()];
            if (i2 == 1) {
                return "MTML_INTEGRITY_DETECT";
            }
            if (i2 == 2) {
                return "MTML_APP_EVENT_PRED";
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class n {
        public static final j xMQ = new j(null);
        private File J2;
        private Runnable KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private float[] f63596O;
        private eK.n Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f63597n;
        private int nr;
        private String rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f63598t;

        public static final class j {
            public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final n t(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                try {
                    String useCase = jSONObject.getString("use_case");
                    String assetUri = jSONObject.getString("asset_uri");
                    String strOptString = jSONObject.optString("rules_uri", null);
                    int i2 = jSONObject.getInt("version_id");
                    float[] fArrNr = Wre.nr(Wre.f63591n, jSONObject.getJSONArray("thresholds"));
                    Intrinsics.checkNotNullExpressionValue(useCase, "useCase");
                    Intrinsics.checkNotNullExpressionValue(assetUri, "assetUri");
                    return new n(useCase, assetUri, strOptString, i2, fArrNr);
                } catch (Exception unused) {
                    return null;
                }
            }

            private j() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void KN(n slave, eK.n nVar, File file) {
                Intrinsics.checkNotNullParameter(slave, "$slave");
                Intrinsics.checkNotNullParameter(file, "file");
                slave.xMQ(nVar);
                slave.gh(file);
                Runnable runnable = slave.KN;
                if (runnable != null) {
                    runnable.run();
                }
            }

            private final void O(String str, String str2, qz.j jVar) {
                File file = new File(aC.n(), str2);
                if (str == null || file.exists()) {
                    jVar.n(file);
                } else {
                    new qz(str, file, jVar).execute(new String[0]);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void Uo(List slaves, File file) {
                Intrinsics.checkNotNullParameter(slaves, "$slaves");
                Intrinsics.checkNotNullParameter(file, "file");
                final eK.n nVarN = eK.n.az.n(file);
                if (nVarN != null) {
                    Iterator it = slaves.iterator();
                    while (it.hasNext()) {
                        final n nVar = (n) it.next();
                        n.xMQ.O(nVar.O(), nVar.Uo() + '_' + nVar.KN() + "_rule", new qz.j() { // from class: eK.fuX
                            @Override // UiE.qz.j
                            public final void n(File file2) {
                                Wre.n.j.KN(nVar, nVarN, file2);
                            }
                        });
                    }
                }
            }

            public final void J2(n master, final List slaves) {
                Intrinsics.checkNotNullParameter(master, "master");
                Intrinsics.checkNotNullParameter(slaves, "slaves");
                nr(master.Uo(), master.KN());
                O(master.rl(), master.Uo() + '_' + master.KN(), new qz.j() { // from class: eK.CN3
                    @Override // UiE.qz.j
                    public final void n(File file) {
                        Wre.n.j.Uo(slaves, file);
                    }
                });
            }

            private final void nr(String str, int i2) {
                File[] fileArrListFiles;
                File fileN = aC.n();
                if (fileN == null || (fileArrListFiles = fileN.listFiles()) == null || fileArrListFiles.length == 0) {
                    return;
                }
                String str2 = str + '_' + i2;
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "name");
                    if (StringsKt.startsWith$default(name, str, false, 2, (Object) null) && !StringsKt.startsWith$default(name, str2, false, 2, (Object) null)) {
                        file.delete();
                    }
                }
            }
        }

        public n(String useCase, String assetUri, String str, int i2, float[] fArr) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            Intrinsics.checkNotNullParameter(assetUri, "assetUri");
            this.f63597n = useCase;
            this.rl = assetUri;
            this.f63598t = str;
            this.nr = i2;
            this.f63596O = fArr;
        }

        public final float[] J2() {
            return this.f63596O;
        }

        public final int KN() {
            return this.nr;
        }

        public final String O() {
            return this.f63598t;
        }

        public final String Uo() {
            return this.f63597n;
        }

        public final void gh(File file) {
            this.J2 = file;
        }

        public final n mUb(Runnable runnable) {
            this.KN = runnable;
            return this;
        }

        public final File nr() {
            return this.J2;
        }

        public final String rl() {
            return this.rl;
        }

        public final eK.n t() {
            return this.Uo;
        }

        public final void xMQ(eK.n nVar) {
            this.Uo = nVar;
        }
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.MTML_APP_EVENT_PREDICTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[j.MTML_INTEGRITY_DETECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String[] Ik(j task, float[][] denses, String[] texts) {
        eK.n nVarT;
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(denses, "denses");
            Intrinsics.checkNotNullParameter(texts, "texts");
            n nVar = (n) rl.get(task.t());
            if (nVar != null && (nVarT = nVar.t()) != null) {
                float[] fArrJ2 = nVar.J2();
                int length = texts.length;
                int length2 = denses[0].length;
                eK.j jVar = new eK.j(new int[]{length, length2});
                for (int i2 = 0; i2 < length; i2++) {
                    System.arraycopy(denses[i2], 0, jVar.n(), i2 * length2, length2);
                }
                eK.j jVarRl = nVarT.rl(jVar, texts, task.rl());
                if (jVarRl != null && fArrJ2 != null && jVarRl.n().length != 0 && fArrJ2.length != 0) {
                    int i3 = w6.$EnumSwitchMapping$0[task.ordinal()];
                    if (i3 == 1) {
                        return f63591n.o(jVarRl, fArrJ2);
                    }
                    if (i3 == 2) {
                        return f63591n.r(jVarRl, fArrJ2);
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }
            return null;
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final void J2() {
        if (VmF.j.nr(Wre.class)) {
            return;
        }
        try {
            vd.Org(new Runnable() { // from class: eK.w6
                @Override // java.lang.Runnable
                public final void run() {
                    Wre.Uo();
                }
            });
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Uo() {
        if (VmF.j.nr(Wre.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = s4.qie().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            String string = sharedPreferences.getString("models", null);
            JSONObject jSONObject = (string == null || string.length() == 0) ? new JSONObject() : new JSONObject(string);
            long j2 = sharedPreferences.getLong("model_request_timestamp", 0L);
            if (!Pl.Uo(Pl.n.ModelRequest) || jSONObject.length() == 0 || !f63591n.ty(j2)) {
                jSONObject = f63591n.gh();
                if (jSONObject == null) {
                    return;
                } else {
                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                }
            }
            Wre wre = f63591n;
            wre.O(jSONObject);
            wre.KN();
        } catch (Exception unused) {
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
        }
    }

    private final JSONObject ck(JSONObject jSONObject) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("data");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(i2);
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("version_id", jSONObject3.getString("version_id"));
                    jSONObject4.put("use_case", jSONObject3.getString("use_case"));
                    jSONObject4.put("thresholds", jSONObject3.getJSONArray("thresholds"));
                    jSONObject4.put("asset_uri", jSONObject3.getString("asset_uri"));
                    if (jSONObject3.has("rules_uri")) {
                        jSONObject4.put("rules_uri", jSONObject3.getString("rules_uri"));
                    }
                    jSONObject2.put(jSONObject3.getString("use_case"), jSONObject4);
                }
                return jSONObject2;
            } catch (JSONException unused) {
                return new JSONObject();
            }
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb() {
        if (VmF.j.nr(Wre.class)) {
            return;
        }
        try {
            zx.w6.n();
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
        }
    }

    public static final /* synthetic */ float[] nr(Wre wre, JSONArray jSONArray) {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            return wre.HI(jSONArray);
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    public static final File qie(j task) {
        if (VmF.j.nr(Wre.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(task, "task");
            n nVar = (n) rl.get(task.t());
            if (nVar == null) {
                return null;
            }
            return nVar.nr();
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xMQ() {
        if (VmF.j.nr(Wre.class)) {
            return;
        }
        try {
            aP.I28.rl();
        } catch (Throwable th) {
            VmF.j.rl(th, Wre.class);
        }
    }

    private Wre() {
    }

    private final float[] HI(JSONArray jSONArray) {
        if (VmF.j.nr(this) || jSONArray == null) {
            return null;
        }
        try {
            float[] fArr = new float[jSONArray.length()];
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    Intrinsics.checkNotNullExpressionValue(string, "jsonArray.getString(i)");
                    fArr[i2] = Float.parseFloat(string);
                } catch (JSONException unused) {
                }
            }
            return fArr;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final void KN() {
        if (!VmF.j.nr(this)) {
            try {
                ArrayList arrayList = new ArrayList();
                String strRl = null;
                int iMax = 0;
                for (Map.Entry entry : rl.entrySet()) {
                    String str = (String) entry.getKey();
                    n nVar = (n) entry.getValue();
                    if (Intrinsics.areEqual(str, j.MTML_APP_EVENT_PREDICTION.t())) {
                        String strRl2 = nVar.rl();
                        int iMax2 = Math.max(iMax, nVar.KN());
                        if (Pl.Uo(Pl.n.SuggestedEvents) && az()) {
                            arrayList.add(nVar.mUb(new Runnable() { // from class: eK.Ml
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Wre.xMQ();
                                }
                            }));
                        }
                        strRl = strRl2;
                        iMax = iMax2;
                    }
                    if (Intrinsics.areEqual(str, j.MTML_INTEGRITY_DETECT.t())) {
                        strRl = nVar.rl();
                        iMax = Math.max(iMax, nVar.KN());
                        if (Pl.Uo(Pl.n.IntelligentIntegrity)) {
                            arrayList.add(nVar.mUb(new Runnable() { // from class: eK.I28
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Wre.mUb();
                                }
                            }));
                        }
                    }
                }
                if (strRl != null && iMax > 0 && !arrayList.isEmpty()) {
                    n.xMQ.J2(new n("MTML", strRl, null, iMax, null), arrayList);
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final void O(JSONObject jSONObject) {
        if (!VmF.j.nr(this)) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        n nVarT = n.xMQ.t(jSONObject.getJSONObject(itKeys.next()));
                        if (nVarT != null) {
                            rl.put(nVarT.Uo(), nVarT);
                        }
                    } catch (JSONException unused) {
                        return;
                    }
                }
            } catch (Throwable th) {
                VmF.j.rl(th, this);
            }
        }
    }

    private final boolean az() {
        if (VmF.j.nr(this)) {
            return false;
        }
        try {
            Locale localeBzg = vd.bzg();
            if (localeBzg != null) {
                String language = localeBzg.getLanguage();
                Intrinsics.checkNotNullExpressionValue(language, "locale.language");
                if (!StringsKt.contains$default((CharSequence) language, (CharSequence) "en", false, 2, (Object) null)) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }

    private final JSONObject gh() {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fields", TextUtils.join(",", new String[]{"use_case", "version_id", "asset_uri", "rules_uri", "thresholds"}));
            GraphRequest graphRequestAYN = GraphRequest.ty.aYN(null, "app/model_asset", null);
            graphRequestAYN.T(bundle);
            JSONObject jSONObjectT = graphRequestAYN.gh().t();
            if (jSONObjectT == null) {
                return null;
            }
            return ck(jSONObjectT);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final String[] o(eK.j jVar, float[] fArr) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            int iRl = jVar.rl(0);
            int iRl2 = jVar.rl(1);
            float[] fArrN = jVar.n();
            if (iRl2 != fArr.length) {
                return null;
            }
            IntRange intRangeUntil = RangesKt.until(0, iRl);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                Object obj = InneractiveMediationNameConsts.OTHER;
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i5 = i3 + 1;
                    if (fArrN[(iNextInt * iRl2) + i3] >= fArr[i2]) {
                        obj = f63592t.get(i3);
                    }
                    i2++;
                    i3 = i5;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final String[] r(eK.j jVar, float[] fArr) {
        if (VmF.j.nr(this)) {
            return null;
        }
        try {
            int iRl = jVar.rl(0);
            int iRl2 = jVar.rl(1);
            float[] fArrN = jVar.n();
            if (iRl2 != fArr.length) {
                return null;
            }
            IntRange intRangeUntil = RangesKt.until(0, iRl);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                Object obj = "none";
                int length = fArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i5 = i3 + 1;
                    if (fArrN[(iNextInt * iRl2) + i3] >= fArr[i2]) {
                        obj = nr.get(i3);
                    }
                    i2++;
                    i3 = i5;
                }
                arrayList.add((String) obj);
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return null;
        }
    }

    private final boolean ty(long j2) {
        if (VmF.j.nr(this) || j2 == 0) {
            return false;
        }
        try {
            if (System.currentTimeMillis() - j2 >= 259200000) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            VmF.j.rl(th, this);
            return false;
        }
    }
}
