package com.google.android.exoplayer2.text.ttml;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class n {
    public final TtmlStyle J2;
    public final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final long f58349O;
    private final String[] Uo;
    private List az;
    private final HashMap gh;
    public final n mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f58350n;
    public final long nr;
    private final HashMap qie;
    public final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f58351t;
    public final String xMQ;

    private void ck(long j2, boolean z2, String str, Map map) {
        boolean z3;
        Map map2;
        long j3;
        this.gh.clear();
        this.qie.clear();
        if (TtmlNode.TAG_METADATA.equals(this.f58350n)) {
            return;
        }
        if (!"".equals(this.KN)) {
            str = this.KN;
        }
        String str2 = str;
        if (this.f58351t && z2) {
            gh(str2, map).append((CharSequence) Assertions.checkNotNull(this.rl));
            return;
        }
        if ("br".equals(this.f58350n) && z2) {
            gh(str2, map).append('\n');
            return;
        }
        if (az(j2)) {
            for (Map.Entry entry : map.entrySet()) {
                this.gh.put((String) entry.getKey(), Integer.valueOf(((CharSequence) Assertions.checkNotNull(((Cue.Builder) entry.getValue()).getText())).length()));
            }
            boolean zEquals = TtmlNode.TAG_P.equals(this.f58350n);
            int i2 = 0;
            while (i2 < Uo()) {
                n nVarJ2 = J2(i2);
                if (z2 || zEquals) {
                    z3 = true;
                    map2 = map;
                    j3 = j2;
                } else {
                    z3 = false;
                    j3 = j2;
                    map2 = map;
                }
                nVarJ2.ck(j3, z3, str2, map2);
                i2++;
                j2 = j3;
                map = map2;
            }
            Map map3 = map;
            if (zEquals) {
                Ml.t(gh(str2, map3));
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                this.qie.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) Assertions.checkNotNull(((Cue.Builder) entry2.getValue()).getText())).length()));
            }
        }
    }

    public static n nr(String str) {
        return new n(null, Ml.rl(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private void rl(Map map, Cue.Builder builder, int i2, int i3, int i5) {
        TtmlStyle ttmlStyleJ2 = Ml.J2(this.J2, this.Uo, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) builder.getText();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            builder.setText(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (ttmlStyleJ2 != null) {
            Ml.n(spannableStringBuilder2, i2, i3, ttmlStyleJ2, this.mUb, map, i5);
            if (TtmlNode.TAG_P.equals(this.f58350n)) {
                if (ttmlStyleJ2.gh() != Float.MAX_VALUE) {
                    builder.setShearDegrees((ttmlStyleJ2.gh() * (-90.0f)) / 100.0f);
                }
                if (ttmlStyleJ2.az() != null) {
                    builder.setTextAlignment(ttmlStyleJ2.az());
                }
                if (ttmlStyleJ2.KN() != null) {
                    builder.setMultiRowAlignment(ttmlStyleJ2.KN());
                }
            }
        }
    }

    public static n t(String str, long j2, long j3, TtmlStyle ttmlStyle, String[] strArr, String str2, String str3, n nVar) {
        return new n(str, null, j2, j3, ttmlStyle, strArr, str2, str3, nVar);
    }

    private void ty(long j2, String str, List list) {
        if (!"".equals(this.KN)) {
            str = this.KN;
        }
        if (az(j2) && TtmlNode.TAG_DIV.equals(this.f58350n) && this.xMQ != null) {
            list.add(new Pair(str, this.xMQ));
            return;
        }
        for (int i2 = 0; i2 < Uo(); i2++) {
            J2(i2).ty(j2, str, list);
        }
    }

    private void xMQ(TreeSet treeSet, boolean z2) {
        boolean zEquals = TtmlNode.TAG_P.equals(this.f58350n);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(this.f58350n);
        if (z2 || zEquals || (zEquals2 && this.xMQ != null)) {
            long j2 = this.nr;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
            long j3 = this.f58349O;
            if (j3 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j3));
            }
        }
        if (this.az == null) {
            return;
        }
        for (int i2 = 0; i2 < this.az.size(); i2++) {
            ((n) this.az.get(i2)).xMQ(treeSet, z2 || zEquals);
        }
    }

    public n J2(int i2) {
        List list = this.az;
        if (list != null) {
            return (n) list.get(i2);
        }
        throw new IndexOutOfBoundsException();
    }

    public List KN(long j2, Map map, Map map2, Map map3) {
        List<Pair> arrayList = new ArrayList();
        ty(j2, this.KN, arrayList);
        TreeMap treeMap = new TreeMap();
        ck(j2, false, this.KN, treeMap);
        HI(j2, map, map2, this.KN, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                w6 w6Var = (w6) Assertions.checkNotNull((w6) map2.get(pair.first));
                arrayList2.add(new Cue.Builder().setBitmap(bitmapDecodeByteArray).setPosition(w6Var.rl).setPositionAnchor(0).setLine(w6Var.f58354t, 0).setLineAnchor(w6Var.f58352O).setSize(w6Var.J2).setBitmapHeight(w6Var.Uo).setVerticalType(w6Var.mUb).build());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            w6 w6Var2 = (w6) Assertions.checkNotNull((w6) map2.get(entry.getKey()));
            Cue.Builder builder = (Cue.Builder) entry.getValue();
            O((SpannableStringBuilder) Assertions.checkNotNull(builder.getText()));
            builder.setLine(w6Var2.f58354t, w6Var2.nr);
            builder.setLineAnchor(w6Var2.f58352O);
            builder.setPosition(w6Var2.rl);
            builder.setSize(w6Var2.J2);
            builder.setTextSize(w6Var2.xMQ, w6Var2.KN);
            builder.setVerticalType(w6Var2.mUb);
            arrayList2.add(builder.build());
        }
        return arrayList2;
    }

    public int Uo() {
        List list = this.az;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public boolean az(long j2) {
        long j3 = this.nr;
        if (j3 == -9223372036854775807L && this.f58349O == -9223372036854775807L) {
            return true;
        }
        if (j3 <= j2 && this.f58349O == -9223372036854775807L) {
            return true;
        }
        if (j3 != -9223372036854775807L || j2 >= this.f58349O) {
            return j3 <= j2 && j2 < this.f58349O;
        }
        return true;
    }

    public long[] mUb() {
        TreeSet treeSet = new TreeSet();
        int i2 = 0;
        xMQ(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i2] = ((Long) it.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public void n(n nVar) {
        if (this.az == null) {
            this.az = new ArrayList();
        }
        this.az.add(nVar);
    }

    public String[] qie() {
        return this.Uo;
    }

    private n(String str, String str2, long j2, long j3, TtmlStyle ttmlStyle, String[] strArr, String str3, String str4, n nVar) {
        boolean z2;
        this.f58350n = str;
        this.rl = str2;
        this.xMQ = str4;
        this.J2 = ttmlStyle;
        this.Uo = strArr;
        if (str2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f58351t = z2;
        this.nr = j2;
        this.f58349O = j3;
        this.KN = (String) Assertions.checkNotNull(str3);
        this.mUb = nVar;
        this.gh = new HashMap();
        this.qie = new HashMap();
    }

    private void HI(long j2, Map map, Map map2, String str, Map map3) {
        String str2;
        if (az(j2)) {
            if ("".equals(this.KN)) {
                str2 = str;
            } else {
                str2 = this.KN;
            }
            Iterator it = this.qie.entrySet().iterator();
            while (true) {
                int iIntValue = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                if (this.gh.containsKey(str3)) {
                    iIntValue = ((Integer) this.gh.get(str3)).intValue();
                }
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    rl(map, (Cue.Builder) Assertions.checkNotNull((Cue.Builder) map3.get(str3)), iIntValue, iIntValue2, ((w6) Assertions.checkNotNull((w6) map2.get(str2))).mUb);
                }
            }
            for (int i2 = 0; i2 < Uo(); i2++) {
                J2(i2).HI(j2, map, map2, str2, map3);
            }
        }
    }

    private static void O(SpannableStringBuilder spannableStringBuilder) {
        for (j jVar : (j[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), j.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(jVar), spannableStringBuilder.getSpanEnd(jVar), "");
        }
        for (int i2 = 0; i2 < spannableStringBuilder.length(); i2++) {
            if (spannableStringBuilder.charAt(i2) == ' ') {
                int i3 = i2 + 1;
                int i5 = i3;
                while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                    i5++;
                }
                int i7 = i5 - i3;
                if (i7 > 0) {
                    spannableStringBuilder.delete(i2, i7 + i2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i8 = 0; i8 < spannableStringBuilder.length() - 1; i8++) {
            if (spannableStringBuilder.charAt(i8) == '\n') {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i9) == ' ') {
                    spannableStringBuilder.delete(i9, i8 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i10 = 0; i10 < spannableStringBuilder.length() - 1; i10++) {
            if (spannableStringBuilder.charAt(i10) == ' ') {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i11) == '\n') {
                    spannableStringBuilder.delete(i10, i11);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    private static SpannableStringBuilder gh(String str, Map map) {
        if (!map.containsKey(str)) {
            Cue.Builder builder = new Cue.Builder();
            builder.setText(new SpannableStringBuilder());
            map.put(str, builder);
        }
        return (SpannableStringBuilder) Assertions.checkNotNull(((Cue.Builder) map.get(str)).getText());
    }
}
