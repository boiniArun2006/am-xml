package com.alightcreative.app.motion.fonts;

import XoT.C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.fonts.Ml;
import com.alightcreative.app.motion.fonts.w6;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vungle.ads.internal.protos.Sdk;
import gP.C2121j;
import gP.Pl;
import gP.eO;
import gP.o;
import gP.qz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final C2121j f45793n;
    private final eO rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j f45792t = new j(null);
    public static final int nr = 8;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String nr(String str) {
            return "AMTypeface:fromString('" + str + "')";
        }

        public final w6 rl(String string) {
            Intrinsics.checkNotNullParameter(string, "string");
            w6 w6VarRl = t(string).rl();
            return w6VarRl == null ? CN3.ck() : w6VarRl;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00c5, code lost:
        
            if (r4.equals("com.google.android.gms.fonts") == false) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
        
            if (r4.equals("googlefonts") == false) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
        
            r4 = com.alightcreative.app.motion.fonts.CN3.Ik().iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
        
            if (r4.hasNext() == false) goto L119;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00e1, code lost:
        
            r7 = r4.next();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(((gP.C2121j) r7).rl(), r2) == false) goto L121;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
        
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00f4, code lost:
        
            r7 = (gP.C2121j) r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
        
            if (r7 == null) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
        
            r4 = r7.O();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00fc, code lost:
        
            if (r4 == null) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
        
            r4 = r4.iterator();
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0106, code lost:
        
            if (r4.hasNext() == false) goto L122;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0108, code lost:
        
            r8 = r4.next();
            r9 = (gP.eO) r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0113, code lost:
        
            if (r9.t() != r3) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
        
            if (r9.rl() != r0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x011b, code lost:
        
            r9 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
        
            r9 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x011e, code lost:
        
            if (r9 == false) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
        
            r8 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0122, code lost:
        
            r8 = (gP.eO) r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0124, code lost:
        
            if (r8 != null) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0127, code lost:
        
            r1 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
        
            if (r7 == null) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x012b, code lost:
        
            r4 = r7.O();
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x012f, code lost:
        
            if (r4 == null) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0131, code lost:
        
            r1 = (gP.eO) kotlin.collections.CollectionsKt.firstOrNull(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x0137, code lost:
        
            if (r7 == null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0139, code lost:
        
            if (r1 == null) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0146, code lost:
        
            return com.alightcreative.app.motion.fonts.Ml.f45785t.rl(new com.alightcreative.app.motion.fonts.w6(r7, r1));
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0147, code lost:
        
            r1 = com.alightcreative.app.motion.fonts.Ml.f45785t;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
        
            if (r2 == null) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x014b, code lost:
        
            r13 = com.alightcreative.app.motion.fonts.CN3.az(r2, r3, r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0153, code lost:
        
            return r1.n(r13);
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Ml t(final String string) {
            Ml mlRl;
            Integer intOrNull;
            Integer intOrNull2;
            Intrinsics.checkNotNullParameter(string, "string");
            C.Uo(this, new Function0() { // from class: gP.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w6.j.nr(string);
                }
            });
            Object obj = null;
            eOVar = null;
            eO eOVar = null;
            String strSubstringAfter$default = StringsKt.substringAfter$default(string, ':', (String) null, 2, (Object) null);
            String strSubstringBefore$default = StringsKt.substringBefore$default(strSubstringAfter$default, '?', (String) null, 2, (Object) null);
            List<String> listSplit$default = StringsKt.split$default((CharSequence) StringsKt.substringAfter(strSubstringAfter$default, '?', ""), new String[]{"&"}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList();
            for (String str : listSplit$default) {
                String string2 = StringsKt.trim((CharSequence) StringsKt.substringBefore$default(str, '=', (String) null, 2, (Object) null)).toString();
                String string3 = StringsKt.trim((CharSequence) StringsKt.substringAfter(str, '=', "")).toString();
                Pair pair = (StringsKt.isBlank(string2) || StringsKt.isBlank(string3)) ? null : TuplesKt.to(string2, string3);
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            Map map = MapsKt.toMap(arrayList);
            String str2 = (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String str3 = (String) map.get("weight");
            int iIntValue = (str3 == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE : intOrNull2.intValue();
            String str4 = (String) map.get(TtmlNode.ITALIC);
            boolean z2 = ((str4 == null || (intOrNull = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull.intValue()) == 1;
            switch (strSubstringBefore$default.hashCode()) {
                case -1528819403:
                    if (strSubstringBefore$default.equals("systemfonts")) {
                        Ml.j jVar = Ml.f45785t;
                        if (str2 != null) {
                            string = str2;
                        }
                        return jVar.n(string);
                    }
                    break;
                case -422368508:
                    if (strSubstringBefore$default.equals("imported")) {
                        Iterator it = CN3.Ik().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                C2121j c2121j = (C2121j) next;
                                if (((c2121j.t() instanceof Pl) && Intrinsics.areEqual(((Pl) c2121j.t()).n(), str2)) != false) {
                                    obj = next;
                                }
                            }
                        }
                        C2121j c2121j2 = (C2121j) obj;
                        if (c2121j2 != null && (mlRl = Ml.f45785t.rl(new w6(c2121j2, (eO) CollectionsKt.first(c2121j2.O())))) != null) {
                            return mlRl;
                        }
                        Ml.j jVar2 = Ml.f45785t;
                        if (str2 != null) {
                            string = str2;
                        }
                        return jVar2.n(string);
                    }
                    break;
                case -328393877:
                    break;
                case 1886319548:
                    break;
            }
            return Ml.f45785t.n(string);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f45793n, w6Var.f45793n) && Intrinsics.areEqual(this.rl, w6Var.rl);
    }

    public int hashCode() {
        return (this.f45793n.hashCode() * 31) + this.rl.hashCode();
    }

    public w6(C2121j font, eO variant) {
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f45793n = font;
        this.rl = variant;
    }

    public final C2121j n() {
        return this.f45793n;
    }

    public final eO rl() {
        return this.rl;
    }

    public String toString() {
        o oVarT = this.f45793n.t();
        if (!Intrinsics.areEqual(oVarT, qz.f67557n)) {
            if (!(oVarT instanceof Pl)) {
                throw new NoWhenBranchMatchedException();
            }
            return "imported?name=" + ((Pl) this.f45793n.t()).n();
        }
        return "googlefonts?name=" + this.f45793n.rl() + "&weight=" + this.rl.t() + (this.rl.rl() ? "&italic=1" : "");
    }
}
